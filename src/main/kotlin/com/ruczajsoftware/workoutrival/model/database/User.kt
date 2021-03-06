package com.ruczajsoftware.workoutrival.model.database

import com.arangodb.springframework.annotation.Document
import com.thinkinglogic.builder.annotation.Builder
import org.springframework.data.annotation.Id
import java.util.ArrayList

@Builder
@Document("Users")
class User(
    @Id var username: String = "",
    var password: String = "",
    var email: String = "",
    var personalData: PersonalData = PersonalData(),
    var bodyMeasurements: List<BodyMeasurement> = ArrayList(),
    var definedTrainings: List<TrainingModel> = ArrayList(),
    var trainingPlans: List<TrainingPlan> = ArrayList()
)