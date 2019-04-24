.class public Lcom/huawei/health/suggestion/model/Topic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation
.end field


# instance fields
.field private displayorder:I

.field private id:I

.field private name:Ljava/lang/String;

.field private nameId:I

.field private serialNum:Ljava/lang/String;

.field private version:Ljava/lang/String;

.field private workoutList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation
.end field

.field private workoutPreviewNum:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 127
    new-instance v0, Lcom/huawei/health/suggestion/model/Topic$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/Topic$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/Topic;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Topic;->id:I

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->name:Ljava/lang/String;

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Topic;->nameId:I

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->version:Ljava/lang/String;

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->serialNum:Ljava/lang/String;

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutPreviewNum:I

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/Topic;->displayorder:I

    .line 107
    sget-object v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutList:Ljava/util/List;

    .line 108
    return-void
.end method


# virtual methods
.method public acquireDisplayorder()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->displayorder:I

    return v0
.end method

.method public acquireId()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->id:I

    return v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireNameId()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->nameId:I

    return v0
.end method

.method public acquireSerialNum()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->serialNum:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutList:Ljava/util/List;

    return-object v0
.end method

.method public acquireWorkoutPreviewNum()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutPreviewNum:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 124
    const/4 v0, 0x0

    return v0
.end method

.method public saveDisplayorder(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/huawei/health/suggestion/model/Topic;->displayorder:I

    .line 89
    return-void
.end method

.method public saveId(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/huawei/health/suggestion/model/Topic;->id:I

    .line 41
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Topic;->name:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public saveNameId(I)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/health/suggestion/model/Topic;->nameId:I

    .line 57
    return-void
.end method

.method public saveSerialNum(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Topic;->serialNum:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Topic;->version:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public saveWorkoutList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 96
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutList:Ljava/util/List;

    .line 97
    return-void
.end method

.method public saveWorkoutPreviewNum(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutPreviewNum:I

    .line 81
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 114
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->nameId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->serialNum:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 117
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutPreviewNum:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    iget v0, p0, Lcom/huawei/health/suggestion/model/Topic;->displayorder:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/Topic;->workoutList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 120
    return-void
.end method
