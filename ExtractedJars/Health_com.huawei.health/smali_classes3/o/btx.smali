.class public Lo/btx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfi/firstbeat/coach/Coach;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lfi/firstbeat/coach/CoachC;

    invoke-direct {v0}, Lfi/firstbeat/coach/CoachC;-><init>()V

    sput-object v0, Lo/btx;->a:Lfi/firstbeat/coach/Coach;

    .line 418
    const-string v0, "coach"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lfi/firstbeat/coach/CoachVars;)I
    .locals 2

    .line 343
    iget v0, p0, Lfi/firstbeat/coach/CoachVars;->endDate:I

    iget v1, p0, Lfi/firstbeat/coach/CoachVars;->startDate:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private static a(Lfi/firstbeat/coach/modle/CoachParams;)V
    .locals 9

    .line 253
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getAge()I

    move-result v0

    const/16 v1, 0x8

    const/16 v2, 0x6e

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v3

    .line 254
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getHeight()I

    move-result v0

    const/16 v1, 0x64

    const/16 v2, 0xfa

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v4

    .line 255
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getWeight()I

    move-result v0

    const/16 v1, 0x23

    const/16 v2, 0xfa

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v5

    .line 256
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getGender()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v6

    .line 257
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getTrainingGoal()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v7

    .line 258
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getDaysOfPlan()I

    move-result v0

    const/16 v1, 0x1c

    const/16 v2, 0x16d

    invoke-static {v1, v2, v0}, Lo/btx;->c(III)I

    move-result v8

    .line 260
    invoke-virtual {p0, v3}, Lfi/firstbeat/coach/modle/CoachParams;->setAge(I)V

    .line 261
    invoke-virtual {p0, v4}, Lfi/firstbeat/coach/modle/CoachParams;->setHeight(I)V

    .line 262
    invoke-virtual {p0, v5}, Lfi/firstbeat/coach/modle/CoachParams;->setWeight(I)V

    .line 263
    invoke-virtual {p0, v6}, Lfi/firstbeat/coach/modle/CoachParams;->setGender(I)V

    .line 264
    invoke-virtual {p0, v7}, Lfi/firstbeat/coach/modle/CoachParams;->setTrainingGoal(I)V

    .line 265
    invoke-virtual {p0, v8}, Lfi/firstbeat/coach/modle/CoachParams;->setDaysOfPlan(I)V

    .line 266
    return-void
.end method

.method public static b(DLfi/firstbeat/coach/CoachRaceType;)I
    .locals 5

    .line 235
    invoke-static {p0, p1}, Lo/btx;->e(D)Lfi/firstbeat/coach/CoachVars;

    move-result-object v4

    .line 236
    if-nez v4, :cond_0

    .line 237
    const-string v0, "CoachUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coachVars == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const/4 v0, 0x0

    return v0

    .line 241
    :cond_0
    invoke-static {v4, p2}, Lo/btx;->c(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v0

    return v0
.end method

.method public static b(II)I
    .locals 1

    .line 353
    add-int v0, p0, p1

    return v0
.end method

.method public static b(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;II)I
    .locals 6

    .line 296
    iget v0, p0, Lfi/firstbeat/coach/CoachVars;->endDate:I

    iget v1, p0, Lfi/firstbeat/coach/CoachVars;->startDate:I

    sub-int v2, v0, v1

    .line 297
    if-nez p2, :cond_0

    invoke-static {p0, p1}, Lo/btx;->c(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, p2

    .line 298
    :goto_0
    invoke-static {p0, v2, p1}, Lo/btx;->e(Lfi/firstbeat/coach/CoachVars;ILfi/firstbeat/coach/CoachRaceType;)I

    move-result v4

    .line 299
    if-nez p3, :cond_1

    move v0, v4

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    invoke-static {v3, v4, v0}, Lfi/firstbeat/coach/RacePrediction;->getImproveMode(III)I

    move-result v5

    .line 300
    return v5
.end method

.method private static c(III)I
    .locals 0

    .line 278
    if-ge p2, p0, :cond_0

    .line 279
    return p0

    .line 280
    :cond_0
    if-le p2, p1, :cond_1

    .line 281
    return p1

    .line 283
    :cond_1
    return p2
.end method

.method public static c(Lfi/firstbeat/coach/CoachRaceType;)I
    .locals 1

    .line 164
    invoke-static {p0}, Lfi/firstbeat/coach/RacePrediction;->getMinDaysToRace(Lfi/firstbeat/coach/CoachRaceType;)I

    move-result v0

    return v0
.end method

.method public static c(Lfi/firstbeat/coach/CoachVars;Lfi/firstbeat/coach/CoachRaceType;)I
    .locals 1

    .line 140
    invoke-static {p1, p0}, Lfi/firstbeat/coach/RacePrediction;->getCurrentTime(Lfi/firstbeat/coach/CoachRaceType;Lfi/firstbeat/coach/CoachVars;)I

    move-result v0

    return v0
.end method

.method public static c(Lfi/firstbeat/coach/modle/CoachParams;Lfi/firstbeat/coach/CoachVars;)Lfi/firstbeat/coach/CoachVars;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 176
    invoke-static {p0}, Lo/btx;->a(Lfi/firstbeat/coach/modle/CoachParams;)V

    .line 179
    new-instance v2, Lfi/firstbeat/coach/CoachVars;

    invoke-direct {v2}, Lfi/firstbeat/coach/CoachVars;-><init>()V

    .line 180
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getAge()I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->age:I

    .line 181
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getHeight()I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->height:I

    .line 182
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getWeight()I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->weight:I

    .line 183
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getGender()I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->gender:I

    .line 184
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    const/16 v1, 0x32

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->AC:I

    .line 185
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getTrainingGoal()I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->trainingGoal:I

    .line 187
    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getStartDate()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->startDate:I

    .line 188
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lo/btx;->e(Ljava/util/Calendar;)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->nowDate:I

    .line 189
    iget v0, v2, Lfi/firstbeat/coach/CoachVars;->startDate:I

    invoke-virtual {p0}, Lfi/firstbeat/coach/modle/CoachParams;->getDaysOfPlan()I

    move-result v1

    invoke-static {v0, v1}, Lo/btx;->b(II)I

    move-result v0

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->endDate:I

    .line 191
    if-eqz p1, :cond_0

    .line 192
    iget-object v0, v2, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    iget-object v1, p1, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    iget v1, v1, Lfi/firstbeat/ete/FBTvars;->maxMET:I

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->maxMET:I

    .line 193
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->trainingLevel:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->trainingLevel:I

    .line 194
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->lastTlBaseUpdate:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->lastTlBaseUpdate:I

    .line 195
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->latestExerciseTime:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->latestExerciseTime:I

    .line 196
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->latestFeedbackPhraseNumber:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->latestFeedbackPhraseNumber:I

    .line 197
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->previousToPreviousTrainingLevel:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->previousToPreviousTrainingLevel:I

    .line 198
    iget v0, p1, Lfi/firstbeat/coach/CoachVars;->previousTrainingLevel:I

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->previousTrainingLevel:I

    goto :goto_0

    .line 200
    :cond_0
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->trainingLevel:I

    .line 201
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->lastTlBaseUpdate:I

    .line 202
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->previousTrainingLevel:I

    .line 203
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->previousToPreviousTrainingLevel:I

    .line 204
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->latestFeedbackPhraseNumber:I

    .line 205
    const/4 v0, -0x1

    iput v0, v2, Lfi/firstbeat/coach/CoachVars;->latestExerciseTime:I

    .line 207
    :goto_0
    return-object v2
.end method

.method private static c(ILfi/firstbeat/coach/CoachVars;[Lfi/firstbeat/coach/TrainingProgramWorkout;)V
    .locals 8

    .line 358
    const-string v6, "CoachUtil"

    .line 359
    if-nez p2, :cond_0

    .line 360
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "\u521b\u5efa\u8ba1\u5212\u5931\u8d25"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "create run plan failed, setParametersReturn:"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return-void

    .line 365
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "CoachVars:"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "CoachVersion:"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/btx;->a:Lfi/firstbeat/coach/Coach;

    invoke-interface {v1}, Lfi/firstbeat/coach/Coach;->getVersion()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    const/4 v7, 0x0

    :goto_0
    array-length v0, p2

    if-ge v7, v0, :cond_2

    .line 369
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\tdayNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tTE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->trainingEffect:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tduration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->duration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tdistance: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->distance:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tphraseNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->phraseNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tweekPhraseNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->weekPhraseNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\t\tWORK\tHR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tintensity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tspeed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tduration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->work:Lfi/firstbeat/coach/WorkoutProfile;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    aget-object v0, p2, v7

    iget-object v0, v0, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v0, v0, Lfi/firstbeat/ete/FBTexercise;->repeats:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 384
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\t\twarmup\tHR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tintensity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tspeed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tduration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->warmup:Lfi/firstbeat/coach/WorkoutProfile;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\t\trest\tHR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tintensity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tspeed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tduration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->rest:Lfi/firstbeat/coach/WorkoutProfile;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\t\tcooldown\tHR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->heartRate:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tintensity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->intensity:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tspeed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->min:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget-object v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->runningSpeed:Lfi/firstbeat/coach/WorkoutLimits;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutLimits;->max:I

    int-to-double v2, v2

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tduration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->cooldown:Lfi/firstbeat/coach/WorkoutProfile;

    iget v2, v2, Lfi/firstbeat/coach/WorkoutProfile;->duration:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 404
    :cond_2
    const/4 v7, 0x0

    :goto_1
    array-length v0, p2

    if-ge v7, v0, :cond_3

    .line 405
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\tdayNumber: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->dayNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_TE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->TE:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_repeats: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->repeats:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_distance: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->distance:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_warmupTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->warmupTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_restTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->restTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_workTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->workTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\tPLAN_coolTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p2, v7

    iget-object v2, v2, Lfi/firstbeat/coach/TrainingProgramWorkout;->plan:Lfi/firstbeat/ete/FBTexercise;

    iget v2, v2, Lfi/firstbeat/ete/FBTexercise;->coolTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 415
    :cond_3
    return-void
.end method

.method public static d(Lfi/firstbeat/coach/CoachRaceType;I)I
    .locals 1

    .line 124
    if-lez p1, :cond_0

    .line 125
    invoke-static {p0, p1}, Lfi/firstbeat/coach/RacePrediction;->getRunningFitnessLevelEstimate(Lfi/firstbeat/coach/CoachRaceType;I)I

    move-result v0

    return v0

    .line 127
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lfi/firstbeat/coach/CoachVars;[I)[Lfi/firstbeat/coach/TrainingProgramWorkout;
    .locals 4

    .line 93
    new-instance v0, Lfi/firstbeat/coach/CoachC;

    invoke-direct {v0}, Lfi/firstbeat/coach/CoachC;-><init>()V

    .line 94
    invoke-interface {v0, p0}, Lfi/firstbeat/coach/Coach;->setParameters(Lfi/firstbeat/coach/CoachVars;)I

    move-result v1

    .line 96
    invoke-static {p0}, Lo/btx;->a(Lfi/firstbeat/coach/CoachVars;)I

    move-result v2

    .line 97
    invoke-interface {v0, v2, p1}, Lfi/firstbeat/coach/Coach;->getAdvice(I[I)[Lfi/firstbeat/coach/TrainingProgramWorkout;

    move-result-object v3

    .line 98
    invoke-static {v1, p0, v3}, Lo/btx;->c(ILfi/firstbeat/coach/CoachVars;[Lfi/firstbeat/coach/TrainingProgramWorkout;)V

    .line 99
    return-object v3
.end method

.method public static e(Lfi/firstbeat/coach/CoachVars;ILfi/firstbeat/coach/CoachRaceType;)I
    .locals 1

    .line 153
    invoke-static {p2, p1, p0}, Lfi/firstbeat/coach/RacePrediction;->getPotentialTime(Lfi/firstbeat/coach/CoachRaceType;ILfi/firstbeat/coach/CoachVars;)I

    move-result v0

    return v0
.end method

.method public static e(Ljava/util/Calendar;)I
    .locals 5

    .line 316
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 317
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 318
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 320
    sget-object v0, Lo/btx;->a:Lfi/firstbeat/coach/Coach;

    invoke-interface {v0, v2, v3, v4}, Lfi/firstbeat/coach/Coach;->getDateId(III)I

    move-result v0

    return v0
.end method

.method private static e(D)Lfi/firstbeat/coach/CoachVars;
    .locals 7

    .line 211
    const-string v0, "CoachUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "vo2Max "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    new-instance v5, Lfi/firstbeat/coach/CoachVars;

    invoke-direct {v5}, Lfi/firstbeat/coach/CoachVars;-><init>()V

    .line 213
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v6

    .line 215
    if-nez v6, :cond_0

    .line 216
    const/4 v0, 0x0

    return-object v0

    .line 219
    :cond_0
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->getAge()I

    move-result v1

    const/16 v2, 0x8

    const/16 v3, 0x6e

    invoke-static {v2, v3, v1}, Lo/btx;->c(III)I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->age:I

    .line 220
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->getHeigth()I

    move-result v1

    const/16 v2, 0x64

    const/16 v3, 0xfa

    invoke-static {v2, v3, v1}, Lo/btx;->c(III)I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->height:I

    .line 221
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->getGender()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->gender:I

    .line 222
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v1

    float-to-int v1, v1

    const/16 v2, 0x23

    const/16 v3, 0xfa

    invoke-static {v2, v3, v1}, Lo/btx;->c(III)I

    move-result v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->weight:I

    .line 223
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    const/16 v1, 0x32

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->AC:I

    .line 225
    iget-object v0, v5, Lfi/firstbeat/coach/CoachVars;->eteVars:Lfi/firstbeat/ete/FBTvars;

    const-wide/high16 v1, 0x40f0000000000000L    # 65536.0

    mul-double/2addr v1, p0

    const-wide/high16 v3, 0x400c000000000000L    # 3.5

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    iput v1, v0, Lfi/firstbeat/ete/FBTvars;->maxMET:I

    .line 226
    return-object v5
.end method
