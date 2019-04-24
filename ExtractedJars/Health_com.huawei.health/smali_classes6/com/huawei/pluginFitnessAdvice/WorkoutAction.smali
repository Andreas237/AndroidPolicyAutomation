.class public Lcom/huawei/pluginFitnessAdvice/WorkoutAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation
.end field

.field public static final INTENSITY_TYPE_ABSOLUTE:I = 0x2

.field public static final INTENSITY_TYPE_ABSOLUTE_SPEED:I = 0x5

.field public static final INTENSITY_TYPE_MAF_180:I = 0x9

.field public static final INTENSITY_TYPE_RELATIVE:I = 0x1

.field public static final INTENSITY_TYPE_RELATIVE_INTERVAL:I = 0x4

.field public static final INTENSITY_TYPE_RELATIVE_INTERVAL_SPEED:I = 0x6

.field public static final INTENSITY_TYPE_RELATIVE_SPEED:I = 0x3

.field public static final INTENSITY_TYPE_RESERVE_HEART_INTERVAL:I = 0x8

.field public static final INTENSITY_TYPE_RESERVE_HEART_RATE:I = 0x7

.field public static final INTENSITY_TYPE_SPEED:I = 0x0

.field public static final MEASUREMENTTYPE_DISTANCE:I = 0x0

.field public static final MEASUREMENTTYPE_TIME:I = 0x1


# instance fields
.field private absoluteHeartRateH:Ljava/lang/String;

.field private absoluteHeartRateL:Ljava/lang/String;

.field private action:Lcom/huawei/pluginFitnessAdvice/Action;

.field private actionId:Ljava/lang/String;

.field private calorie:F

.field private commentaryGap:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation
.end field

.field private commentaryTraining:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation
.end field

.field private distance:I

.field private duration:I

.field private gap:I

.field private group:I

.field private intensityType:I

.field private mMAF180HeartRateBase:I

.field private mMAF180HeartRateRange:I

.field private mReserveHeartRatePercentH:I

.field private mReserveHeartRatePercentL:I

.field private mReserveHeartRateRangeH:I

.field private mReserveHeartRateRangeL:I

.field private measurementType:I

.field private measurementValue:I

.field private relativeHeartRatePercentH:I

.field private relativeHeartRatePercentL:I

.field private relativeHeartRateRangeH:I

.field private relativeHeartRateRangeL:I

.field private speedH:F

.field private speedL:F

.field private tabloidPicUrl:Ljava/lang/String;

.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 175
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 368
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 369
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->actionId:Ljava/lang/String;

    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->value:I

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->distance:I

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->duration:I

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->gap:I

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->calorie:F

    .line 114
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->group:I

    .line 115
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Comment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryTraining:Ljava/util/List;

    .line 116
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Comment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryGap:Ljava/util/List;

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementValue:I

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementType:I

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->tabloidPicUrl:Ljava/lang/String;

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->intensityType:I

    .line 121
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedH:F

    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedL:F

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateL:Ljava/lang/String;

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateH:Ljava/lang/String;

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentL:I

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentH:I

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeL:I

    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeH:I

    .line 130
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentH:I

    .line 131
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentL:I

    .line 132
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeH:I

    .line 133
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeL:I

    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateRange:I

    .line 135
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateBase:I

    .line 136
    return-void
.end method


# virtual methods
.method public acquireAbsoluteHeartRateH()Ljava/lang/String;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateH:Ljava/lang/String;

    return-object v0
.end method

.method public acquireAbsoluteHeartRateL()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateL:Ljava/lang/String;

    return-object v0
.end method

.method public acquireCommentaryGap()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation

    .line 355
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryGap:Ljava/util/List;

    return-object v0
.end method

.method public acquireIntensityType()I
    .locals 1

    .line 253
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->intensityType:I

    return v0
.end method

.method public acquireMAF180HeartRateBase()I
    .locals 1

    .line 428
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateBase:I

    return v0
.end method

.method public acquireMAF180HeartRateRange()I
    .locals 1

    .line 420
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateRange:I

    return v0
.end method

.method public acquireMeasurementType()I
    .locals 1

    .line 277
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementType:I

    return v0
.end method

.method public acquireMeasurementValue()I
    .locals 1

    .line 261
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementValue:I

    return v0
.end method

.method public acquireRelativeHeartRatePercentH()I
    .locals 1

    .line 229
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentH:I

    return v0
.end method

.method public acquireRelativeHeartRatePercentL()I
    .locals 1

    .line 221
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentL:I

    return v0
.end method

.method public acquireRelativeHeartRateRangeH()I
    .locals 1

    .line 245
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeH:I

    return v0
.end method

.method public acquireRelativeHeartRateRangeL()I
    .locals 1

    .line 237
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeL:I

    return v0
.end method

.method public acquireReserveHeartRatePercentH()I
    .locals 1

    .line 388
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentH:I

    return v0
.end method

.method public acquireReserveHeartRatePercentL()I
    .locals 1

    .line 396
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentL:I

    return v0
.end method

.method public acquireReserveHeartRateRangeH()I
    .locals 1

    .line 404
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeH:I

    return v0
.end method

.method public acquireReserveHeartRateRangeL()I
    .locals 1

    .line 412
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeL:I

    return v0
.end method

.method public acquireSpeedH()F
    .locals 1

    .line 188
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedH:F

    return v0
.end method

.method public acquireSpeedL()F
    .locals 1

    .line 196
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedL:F

    return v0
.end method

.method public acquireTabloidPicUrl()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->tabloidPicUrl:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 172
    const/4 v0, 0x0

    return v0
.end method

.method public getAction()Lcom/huawei/pluginFitnessAdvice/Action;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->action:Lcom/huawei/pluginFitnessAdvice/Action;

    return-object v0
.end method

.method public getActionId()Ljava/lang/String;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->actionId:Ljava/lang/String;

    return-object v0
.end method

.method public getCalorie()F
    .locals 1

    .line 315
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->calorie:F

    return v0
.end method

.method public getCommentaryTraining()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation

    .line 347
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryTraining:Ljava/util/List;

    return-object v0
.end method

.method public getDistance()I
    .locals 1

    .line 301
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->distance:I

    return v0
.end method

.method public getDuration()I
    .locals 1

    .line 323
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->duration:I

    return v0
.end method

.method public getGap()I
    .locals 1

    .line 331
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->gap:I

    return v0
.end method

.method public getGroup()I
    .locals 1

    .line 308
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->group:I

    return v0
.end method

.method public getValue()I
    .locals 1

    .line 293
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->value:I

    return v0
.end method

.method public saveAbsoluteHeartRateH(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateH:Ljava/lang/String;

    .line 218
    return-void
.end method

.method public saveAbsoluteHeartRateL(Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateL:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public saveAction(Lcom/huawei/pluginFitnessAdvice/Action;)V
    .locals 0

    .line 343
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->action:Lcom/huawei/pluginFitnessAdvice/Action;

    .line 344
    return-void
.end method

.method public saveActionId(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->actionId:Ljava/lang/String;

    .line 290
    return-void
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 319
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->calorie:F

    .line 320
    return-void
.end method

.method public saveCommentaryGap(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 359
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryGap:Ljava/util/List;

    .line 360
    return-void
.end method

.method public saveCommentaryTraining(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 351
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryTraining:Ljava/util/List;

    .line 352
    return-void
.end method

.method public saveDuration(I)V
    .locals 0

    .line 327
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->duration:I

    .line 328
    return-void
.end method

.method public saveGap(I)V
    .locals 0

    .line 335
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->gap:I

    .line 336
    return-void
.end method

.method public saveGroup(I)V
    .locals 0

    .line 312
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->group:I

    .line 313
    return-void
.end method

.method public saveIntensityType(I)V
    .locals 0

    .line 257
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->intensityType:I

    .line 258
    return-void
.end method

.method public saveMAF180HeartRateBase(I)V
    .locals 0

    .line 432
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateBase:I

    .line 433
    return-void
.end method

.method public saveMAF180HeartRateRange(I)V
    .locals 0

    .line 424
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateRange:I

    .line 425
    return-void
.end method

.method public saveMeasurementType(I)V
    .locals 0

    .line 281
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementType:I

    .line 282
    return-void
.end method

.method public saveMeasurementValue(I)V
    .locals 0

    .line 265
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementValue:I

    .line 266
    return-void
.end method

.method public saveRelativeHeartRatePercentH(I)V
    .locals 0

    .line 233
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentH:I

    .line 234
    return-void
.end method

.method public saveRelativeHeartRatePercentL(I)V
    .locals 0

    .line 225
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentL:I

    .line 226
    return-void
.end method

.method public saveRelativeHeartRateRangeH(I)V
    .locals 0

    .line 249
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeH:I

    .line 250
    return-void
.end method

.method public saveRelativeHeartRateRangeL(I)V
    .locals 0

    .line 241
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeL:I

    .line 242
    return-void
.end method

.method public saveReserveHeartRatePercentH(I)V
    .locals 0

    .line 392
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentH:I

    .line 393
    return-void
.end method

.method public saveReserveHeartRatePercentL(I)V
    .locals 0

    .line 400
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentL:I

    .line 401
    return-void
.end method

.method public saveReserveHeartRateRangeH(I)V
    .locals 0

    .line 408
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeH:I

    .line 409
    return-void
.end method

.method public saveReserveHeartRateRangeL(I)V
    .locals 0

    .line 416
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeL:I

    .line 417
    return-void
.end method

.method public saveSpeedH(F)V
    .locals 0

    .line 192
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedH:F

    .line 193
    return-void
.end method

.method public saveSpeedL(F)V
    .locals 0

    .line 200
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedL:F

    .line 201
    return-void
.end method

.method public saveTabloidPicUrl(Ljava/lang/String;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->tabloidPicUrl:Ljava/lang/String;

    .line 274
    return-void
.end method

.method public saveValue(I)V
    .locals 0

    .line 297
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->value:I

    .line 298
    return-void
.end method

.method public setDistance(I)V
    .locals 0

    .line 305
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->distance:I

    .line 306
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 364
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 373
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 377
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 381
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 385
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->actionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->value:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->distance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 143
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->duration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 144
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->gap:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 145
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 146
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->group:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryTraining:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->commentaryGap:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 149
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 150
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->measurementType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->tabloidPicUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->intensityType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 153
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedH:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 154
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->speedL:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 155
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateL:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->absoluteHeartRateH:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentL:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRatePercentH:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeL:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->relativeHeartRateRangeH:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentH:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 163
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRatePercentL:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeH:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mReserveHeartRateRangeL:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateRange:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 167
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->mMAF180HeartRateBase:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    return-void
.end method
