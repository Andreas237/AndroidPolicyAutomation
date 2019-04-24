.class public Lcom/huawei/pluginFitnessAdvice/FitWorkout;
.super Lcom/huawei/pluginFitnessAdvice/Workout;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field public static final STAGE_NEW:I = 0x0

.field public static final SUPPORT_DEVICE_NO:I = 0x1

.field public static final SUPPORT_DEVICE_YES:I = 0x0

.field public static final TYPE_FIT:I = 0x1

.field public static final TYPE_MEASUREMENT_DISTANCE:I = 0x2

.field public static final TYPE_MEASUREMENT_DURATION:I = 0x1

.field public static final TYPE_RUN_AC:I = 0x2

.field public static final TYPE_RUN_SE:I = 0x3


# instance fields
.field private classes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation
.end field

.field private coolDownRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

.field private difficulty:I

.field private distance:D

.field private equipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field

.field private exerciseTimes:I

.field private gender:I

.field private isSupportDevice:I

.field private mExtendSeaMap:Ljava/lang/String;

.field private mListRelativeWorkouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private measurementType:I

.field private midPicture:Ljava/lang/String;

.field private narrowDesc:Ljava/lang/String;

.field private narrowPicture:Ljava/lang/String;

.field private picture:Ljava/lang/String;

.field private repeatTimes:I

.field private runActionNum:I

.field private sequenceName:Ljava/lang/String;

.field private sequenceStage:Ljava/lang/String;

.field private stage:I

.field private trainingpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation
.end field

.field private users:I

.field private warmUpRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

.field private workoutActions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation
.end field

.field private workoutId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 248
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 164
    invoke-direct {p0}, Lcom/huawei/pluginFitnessAdvice/Workout;-><init>()V

    .line 165
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 191
    invoke-direct {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Workout;-><init>(Landroid/os/Parcel;)V

    .line 192
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Equipment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->equipments:Ljava/util/List;

    .line 193
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->trainingpoints:Ljava/util/List;

    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    .line 195
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->picture:Ljava/lang/String;

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->midPicture:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->gender:I

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->isSupportDevice:I

    .line 199
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutActions:Ljava/util/List;

    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowPicture:Ljava/lang/String;

    .line 202
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowDesc:Ljava/lang/String;

    .line 203
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->exerciseTimes:I

    .line 204
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->stage:I

    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->measurementType:I

    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->distance:D

    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutId:Ljava/lang/String;

    .line 208
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->runActionNum:I

    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceName:Ljava/lang/String;

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceStage:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->repeatTimes:I

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mListRelativeWorkouts:Ljava/util/List;

    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mExtendSeaMap:Ljava/lang/String;

    .line 214
    return-void
.end method

.method public static acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 184
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 185
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 187
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static getCREATOR()Landroid/os/Parcelable$Creator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 301
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-object v0
.end method

.method public static nullToStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 384
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    :cond_0
    const-string v0, ""

    return-object v0

    .line 387
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public acquireClasses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
        }
    .end annotation

    .line 293
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->classes:Ljava/util/List;

    return-object v0
.end method

.method public acquireComeFrom()Ljava/lang/String;
    .locals 2

    .line 175
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    .line 180
    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->coolDownRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    return-object v0
.end method

.method public acquireDifficulty()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    return v0
.end method

.method public acquireDistance()D
    .locals 2

    .line 155
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->distance:D

    return-wide v0
.end method

.method public acquireEquipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->equipments:Ljava/util/List;

    return-object v0
.end method

.method public acquireExerciseTimes()I
    .locals 1

    .line 377
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->exerciseTimes:I

    return v0
.end method

.method public acquireExtendSeaMap()Ljava/lang/String;
    .locals 1

    .line 416
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mExtendSeaMap:Ljava/lang/String;

    return-object v0
.end method

.method public acquireIsSupportDevice()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->isSupportDevice:I

    return v0
.end method

.method public acquireListRelativeWorkouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 407
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mListRelativeWorkouts:Ljava/util/List;

    return-object v0
.end method

.method public acquireMeasurementType()I
    .locals 1

    .line 147
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->measurementType:I

    return v0
.end method

.method public acquireMidPicture()Ljava/lang/String;
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->midPicture:Ljava/lang/String;

    return-object v0
.end method

.method public acquireNarrowDesc()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowDesc:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePicture()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public acquireRepeatTimes()I
    .locals 1

    .line 131
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->repeatTimes:I

    return v0
.end method

.method public acquireRunActionNum()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->runActionNum:I

    return v0
.end method

.method public acquireSequenceName()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceName:Ljava/lang/String;

    return-object v0
.end method

.method public acquireSequenceStage()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceStage:Ljava/lang/String;

    return-object v0
.end method

.method public acquireStage()I
    .locals 1

    .line 331
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->stage:I

    return v0
.end method

.method public acquireTrainingpoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->trainingpoints:Ljava/util/List;

    return-object v0
.end method

.method public acquireUsers()I
    .locals 1

    .line 339
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->users:I

    return v0
.end method

.method public acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->warmUpRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    return-object v0
.end method

.method public acquireWorkoutActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutActions:Ljava/util/List;

    return-object v0
.end method

.method public acquireWorkoutId()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 245
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 366
    instance-of v0, p1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-nez v0, :cond_0

    .line 367
    const/4 v0, 0x0

    return v0

    .line 369
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->nullToStr(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->nullToStr(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 313
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->gender:I

    return v0
.end method

.method public getNarrowPicture()Ljava/lang/String;
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowPicture:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 360
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->nullToStr(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public saveClasses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Attribute;>;)V"
        }
    .end annotation

    .line 297
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->classes:Ljava/util/List;

    .line 298
    return-void
.end method

.method public saveCoolDownRunAction(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->coolDownRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 120
    return-void
.end method

.method public saveDifficulty(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    .line 172
    return-void
.end method

.method public saveDistance(D)V
    .locals 0

    .line 159
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->distance:D

    .line 160
    return-void
.end method

.method public saveEquipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;)V"
        }
    .end annotation

    .line 265
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->equipments:Ljava/util/List;

    .line 266
    return-void
.end method

.method public saveExerciseTimes(I)V
    .locals 0

    .line 381
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->exerciseTimes:I

    .line 382
    return-void
.end method

.method public saveExtendSeaMap(Ljava/lang/String;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mExtendSeaMap:Ljava/lang/String;

    .line 421
    return-void
.end method

.method public saveIsSupportDevice(I)V
    .locals 0

    .line 326
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->isSupportDevice:I

    .line 327
    return-void
.end method

.method public saveListRelativeWorkouts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 411
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mListRelativeWorkouts:Ljava/util/List;

    .line 412
    return-void
.end method

.method public saveMeasurementType(I)V
    .locals 0

    .line 151
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->measurementType:I

    .line 152
    return-void
.end method

.method public saveMidPicture(Ljava/lang/String;)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->midPicture:Ljava/lang/String;

    .line 374
    return-void
.end method

.method public saveNarrowDesc(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowDesc:Ljava/lang/String;

    .line 290
    return-void
.end method

.method public saveNarrowPicture(Ljava/lang/String;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowPicture:Ljava/lang/String;

    .line 282
    return-void
.end method

.method public savePicture(Ljava/lang/String;)V
    .locals 0

    .line 309
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->picture:Ljava/lang/String;

    .line 310
    return-void
.end method

.method public saveRepeatTimes(I)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->repeatTimes:I

    .line 136
    return-void
.end method

.method public saveRunActionNum(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->runActionNum:I

    .line 104
    return-void
.end method

.method public saveSequenceName(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceName:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public saveSequenceStage(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceStage:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public saveStage(I)V
    .locals 0

    .line 335
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->stage:I

    .line 336
    return-void
.end method

.method public saveTrainingpoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;)V"
        }
    .end annotation

    .line 273
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->trainingpoints:Ljava/util/List;

    .line 274
    return-void
.end method

.method public saveUsers(I)V
    .locals 0

    .line 343
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->users:I

    .line 344
    return-void
.end method

.method public saveWarmUpRunAction(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->warmUpRunAction:Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 112
    return-void
.end method

.method public saveWorkoutActions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;)V"
        }
    .end annotation

    .line 351
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutActions:Ljava/util/List;

    .line 352
    return-void
.end method

.method public saveWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutId:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 317
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->gender:I

    .line 318
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 392
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 396
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 400
    return-void
.end method

.method public uadpDC8()V
    .locals 0

    .line 404
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 218
    invoke-super {p0, p1, p2}, Lcom/huawei/pluginFitnessAdvice/Workout;->writeToParcel(Landroid/os/Parcel;I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->equipments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->trainingpoints:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 221
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->picture:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->midPicture:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 224
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 225
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->isSupportDevice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutActions:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 227
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowPicture:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->narrowDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 230
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->exerciseTimes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 231
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->stage:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 232
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->measurementType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 233
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->distance:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 234
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->workoutId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->runActionNum:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->sequenceStage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 238
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->repeatTimes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 239
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mListRelativeWorkouts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->mExtendSeaMap:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 241
    return-void
.end method
