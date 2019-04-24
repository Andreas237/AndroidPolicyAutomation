.class public Lcom/huawei/health/suggestion/ui/fitness/module/Motion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field


# instance fields
.field public calorie:F

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

.field private covers:Lcom/huawei/pluginFitnessAdvice/Cover;

.field public description:Ljava/lang/String;

.field public difficulty:I

.field public duration:F

.field public equipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field

.field private gap:I

.field public goals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;"
        }
    .end annotation
.end field

.field public groups:I

.field public gyro:I

.field public id:Ljava/lang/String;

.field public interval:I

.field private length:I

.field public mMotionPath:Ljava/lang/String;

.field public mNamePath:Ljava/lang/String;

.field public measurementType:I

.field public measurementValue:I

.field public modified:J

.field public motionType:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field private orignLog:Ljava/lang/String;

.field public picUrl:Ljava/lang/String;

.field private planId:Ljava/lang/String;

.field private progress:I

.field public publishDate:J

.field public repeat:I

.field private trainaudiopath:Ljava/lang/String;

.field public trainingpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation
.end field

.field private trainpointpath:Ljava/lang/String;

.field public version:Ljava/lang/String;

.field private workoutId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 576
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion$4;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion$4;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 542
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 543
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->workoutId:Ljava/lang/String;

    .line 544
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainaudiopath:Ljava/lang/String;

    .line 545
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainpointpath:Ljava/lang/String;

    .line 546
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->planId:Ljava/lang/String;

    .line 547
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gap:I

    .line 548
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->progress:I

    .line 549
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    .line 550
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    .line 551
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    .line 552
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 553
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 554
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 555
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 556
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    .line 557
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->picUrl:Ljava/lang/String;

    .line 558
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    .line 559
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Comment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryGap:Ljava/util/List;

    .line 560
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->difficulty:I

    .line 561
    const-class v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->covers:Lcom/huawei/pluginFitnessAdvice/Cover;

    .line 562
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->description:Ljava/lang/String;

    .line 563
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Goal;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->goals:Ljava/util/List;

    .line 564
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Equipment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->equipments:Ljava/util/List;

    .line 565
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainingpoints:Ljava/util/List;

    .line 566
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gyro:I

    .line 567
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->calorie:F

    .line 568
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->version:Ljava/lang/String;

    .line 569
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->publishDate:J

    .line 570
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->modified:J

    .line 571
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Comment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryTraining:Ljava/util/List;

    .line 572
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->orignLog:Ljava/lang/String;

    .line 573
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->length:I

    .line 574
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 176
    iput p4, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 177
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 178
    iput p3, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 179
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    iput-object p6, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    .line 191
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 192
    iput p5, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    .line 193
    iput p4, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 194
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 195
    iput p3, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 196
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p8, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    .line 160
    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    .line 161
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 162
    iput-object p4, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    .line 163
    iput p7, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    .line 164
    iput p6, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 165
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 166
    iput p5, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 167
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V
    .locals 1

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    .line 209
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 210
    iput-object p7, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    .line 211
    iput-object p4, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    .line 212
    iput p8, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    .line 213
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 214
    iput p5, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 215
    iput p6, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 216
    mul-int v0, p8, p6

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    .line 217
    return-void
.end method


# virtual methods
.method public acquireCalorie()F
    .locals 1

    .line 370
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->calorie:F

    return v0
.end method

.method public acquireCommentaryGap()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation

    .line 402
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryGap:Ljava/util/List;

    return-object v0
.end method

.method public acquireCommentaryTraining()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation

    .line 434
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryTraining:Ljava/util/List;

    return-object v0
.end method

.method public acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;
    .locals 1

    .line 426
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->covers:Lcom/huawei/pluginFitnessAdvice/Cover;

    return-object v0
.end method

.method public acquireDifficulty()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->difficulty:I

    return v0
.end method

.method public acquireDuration()F
    .locals 1

    .line 302
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    return v0
.end method

.method public acquireGap()I
    .locals 1

    .line 410
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gap:I

    return v0
.end method

.method public acquireGroups()I
    .locals 1

    .line 282
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    return v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireInterval()I
    .locals 1

    .line 258
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    return v0
.end method

.method public acquireLength()I
    .locals 1

    .line 494
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->length:I

    return v0
.end method

.method public acquireMeasurementType()I
    .locals 1

    .line 230
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->measurementType:I

    return v0
.end method

.method public acquireMeasurementValue()I
    .locals 1

    .line 222
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->measurementValue:I

    return v0
.end method

.method public acquireMotionPath()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    return-object v0
.end method

.method public acquireMotionType()Ljava/lang/String;
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireNamePath()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePicUrl()Ljava/lang/String;
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->picUrl:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 462
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireProgress()I
    .locals 1

    .line 446
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->progress:I

    return v0
.end method

.method public acquireRepeat()I
    .locals 1

    .line 290
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    return v0
.end method

.method public acquireTrainpointpath()Ljava/lang/String;
    .locals 1

    .line 478
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainpointpath:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutId()Ljava/lang/String;
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 504
    const/4 v0, 0x0

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEquipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 346
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->equipments:Ljava/util/List;

    return-object v0
.end method

.method public getGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;"
        }
    .end annotation

    .line 338
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->goals:Ljava/util/List;

    return-object v0
.end method

.method public getGyro()I
    .locals 1

    .line 362
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gyro:I

    return v0
.end method

.method public getModified()J
    .locals 2

    .line 394
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->modified:J

    return-wide v0
.end method

.method public getOrignLog()Ljava/lang/String;
    .locals 1

    .line 486
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->orignLog:Ljava/lang/String;

    return-object v0
.end method

.method public getPublishDate()J
    .locals 2

    .line 386
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->publishDate:J

    return-wide v0
.end method

.method public getRecordAction()Lcom/huawei/health/suggestion/model/RecordAction;
    .locals 5

    .line 589
    const-string v0, "timer"

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 590
    new-instance v0, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireProgress()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v3

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const-string v4, "timer"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    return-object v0

    .line 592
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireProgress()I

    move-result v2

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTotalBeats()F

    move-result v3

    const-string v4, "beating"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    return-object v0
.end method

.method public getTotalBeats()F
    .locals 2

    .line 306
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    return v0
.end method

.method public getTrainaudiopath()Ljava/lang/String;
    .locals 1

    .line 470
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainaudiopath:Ljava/lang/String;

    return-object v0
.end method

.method public getTrainingpoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainingpoints:Ljava/util/List;

    return-object v0
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 374
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->calorie:F

    .line 375
    return-void
.end method

.method public saveCovers(Lcom/huawei/pluginFitnessAdvice/Cover;)V
    .locals 0

    .line 430
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->covers:Lcom/huawei/pluginFitnessAdvice/Cover;

    .line 431
    return-void
.end method

.method public saveDifficulty(I)V
    .locals 0

    .line 326
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->difficulty:I

    .line 327
    return-void
.end method

.method public saveGroups(I)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    .line 287
    return-void
.end method

.method public saveInterval(I)V
    .locals 0

    .line 262
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    .line 263
    return-void
.end method

.method public saveLength(I)V
    .locals 0

    .line 498
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->length:I

    .line 499
    return-void
.end method

.method public saveMeasurementType(I)V
    .locals 0

    .line 234
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->measurementType:I

    .line 235
    return-void
.end method

.method public saveMeasurementValue(I)V
    .locals 0

    .line 226
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->measurementValue:I

    .line 227
    return-void
.end method

.method public saveMotionPath(Ljava/lang/String;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    .line 251
    return-void
.end method

.method public saveMotionType(Ljava/lang/String;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    .line 319
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 270
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    .line 271
    return-void
.end method

.method public saveNamePath(Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    .line 243
    return-void
.end method

.method public savePicUrl(Ljava/lang/String;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->picUrl:Ljava/lang/String;

    .line 423
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 466
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->planId:Ljava/lang/String;

    .line 467
    return-void
.end method

.method public saveProgress(I)V
    .locals 0

    .line 450
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->progress:I

    .line 451
    return-void
.end method

.method public saveRepeat(I)V
    .locals 0

    .line 294
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    .line 295
    return-void
.end method

.method public saveTrainpointpath(Ljava/lang/String;)V
    .locals 0

    .line 482
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainpointpath:Ljava/lang/String;

    .line 483
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->version:Ljava/lang/String;

    .line 383
    return-void
.end method

.method public saveWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->workoutId:Ljava/lang/String;

    .line 459
    return-void
.end method

.method public setCommentaryGap(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 406
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryGap:Ljava/util/List;

    .line 407
    return-void
.end method

.method public setCommentaryTraining(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Comment;>;)V"
        }
    .end annotation

    .line 438
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryTraining:Ljava/util/List;

    .line 439
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->description:Ljava/lang/String;

    .line 335
    return-void
.end method

.method public setDuration(I)V
    .locals 1

    .line 310
    int-to-float v0, p1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    .line 311
    return-void
.end method

.method public setEquipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;)V"
        }
    .end annotation

    .line 350
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->equipments:Ljava/util/List;

    .line 351
    return-void
.end method

.method public setGap(I)V
    .locals 0

    .line 414
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gap:I

    .line 415
    return-void
.end method

.method public setGoals(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Goal;>;)V"
        }
    .end annotation

    .line 342
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->goals:Ljava/util/List;

    .line 343
    return-void
.end method

.method public setGyro(I)V
    .locals 0

    .line 366
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gyro:I

    .line 367
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    .line 279
    return-void
.end method

.method public setModified(J)V
    .locals 0

    .line 398
    iput-wide p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->modified:J

    .line 399
    return-void
.end method

.method public setOrignLog(Ljava/lang/String;)V
    .locals 0

    .line 490
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->orignLog:Ljava/lang/String;

    .line 491
    return-void
.end method

.method public setPublishDate(J)V
    .locals 0

    .line 390
    iput-wide p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->publishDate:J

    .line 391
    return-void
.end method

.method public setTrainaudiopath(Ljava/lang/String;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainaudiopath:Ljava/lang/String;

    .line 475
    return-void
.end method

.method public setTrainingpoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;)V"
        }
    .end annotation

    .line 358
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainingpoints:Ljava/util/List;

    .line 359
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 509
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->workoutId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainaudiopath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainpointpath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->planId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 513
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gap:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 514
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->progress:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mNamePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 516
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->mMotionPath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 517
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->interval:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 520
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->groups:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 521
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->repeat:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 522
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 523
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->picUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->motionType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 525
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryGap:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 526
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 527
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->covers:Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 528
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 529
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->goals:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 530
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->equipments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->trainingpoints:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 532
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->gyro:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 533
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 534
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 535
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->publishDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 536
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->modified:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 537
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->commentaryTraining:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->orignLog:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 539
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->length:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 540
    return-void
.end method
