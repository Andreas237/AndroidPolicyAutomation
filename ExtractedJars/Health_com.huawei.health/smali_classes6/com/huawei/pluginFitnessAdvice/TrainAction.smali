.class public Lcom/huawei/pluginFitnessAdvice/TrainAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;"
        }
    .end annotation
.end field


# instance fields
.field private covers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
        }
    .end annotation
.end field

.field private description:Ljava/lang/String;

.field private difficulty:I

.field private equipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private mVideos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;"
        }
    .end annotation
.end field

.field private modified:J

.field private motionType:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field private trainingpoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation
.end field

.field private userId:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 242
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/TrainAction$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->userId:Ljava/lang/String;

    .line 229
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    .line 231
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->motionType:Ljava/lang/String;

    .line 232
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->difficulty:I

    .line 233
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Cover;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->covers:Ljava/util/List;

    .line 234
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->description:Ljava/lang/String;

    .line 235
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Equipment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->equipments:Ljava/util/List;

    .line 236
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Trainingpoint;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->trainingpoints:Ljava/util/List;

    .line 237
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/Video;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->mVideos:Ljava/util/List;

    .line 238
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->version:Ljava/lang/String;

    .line 239
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->modified:J

    .line 240
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p3, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->motionType:Ljava/lang/String;

    .line 96
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    .line 97
    iput-object p2, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    .line 98
    return-void
.end method


# virtual methods
.method public acquireCovers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
        }
    .end annotation

    .line 271
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->covers:Ljava/util/List;

    return-object v0
.end method

.method public acquireDescription()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->description:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDifficulty()I
    .locals 1

    .line 127
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->difficulty:I

    return v0
.end method

.method public acquireEquipments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->equipments:Ljava/util/List;

    return-object v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireModified()J
    .locals 2

    .line 168
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->modified:J

    return-wide v0
.end method

.method public acquireMotionType()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->motionType:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireTrainingpoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->trainingpoints:Ljava/util/List;

    return-object v0
.end method

.method public acquireUserId()Ljava/lang/String;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVideos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;"
        }
    .end annotation

    .line 279
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->mVideos:Ljava/util/List;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 180
    const/4 v0, 0x0

    return v0
.end method

.method public saveCovers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Cover;>;)V"
        }
    .end annotation

    .line 275
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->covers:Ljava/util/List;

    .line 276
    return-void
.end method

.method public saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->description:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public saveDifficulty(I)V
    .locals 0

    .line 131
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->difficulty:I

    .line 132
    return-void
.end method

.method public saveEquipments(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Equipment;>;)V"
        }
    .end annotation

    .line 147
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->equipments:Ljava/util/List;

    .line 148
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public saveModified(J)V
    .locals 0

    .line 172
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->modified:J

    .line 173
    return-void
.end method

.method public saveMotionType(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->motionType:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    .line 107
    return-void
.end method

.method public saveTrainingpoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Trainingpoint;>;)V"
        }
    .end annotation

    .line 155
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->trainingpoints:Ljava/util/List;

    .line 156
    return-void
.end method

.method public saveUserId(Ljava/lang/String;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->userId:Ljava/lang/String;

    .line 268
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->version:Ljava/lang/String;

    .line 164
    return-void
.end method

.method public saveVideos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Video;>;)V"
        }
    .end annotation

    .line 283
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->mVideos:Ljava/util/List;

    .line 284
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->userId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->motionType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 203
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->difficulty:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->covers:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->equipments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->trainingpoints:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->mVideos:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 210
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/TrainAction;->modified:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 212
    return-void
.end method
