.class public Lcom/huawei/health/suggestion/model/ExerciseProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/ExerciseProfile;>;"
        }
    .end annotation
.end field


# instance fields
.field private duration:I

.field private heartRate:Lcom/huawei/health/suggestion/model/ExerciseLimits;

.field private intensity:Lcom/huawei/health/suggestion/model/ExerciseLimits;

.field private message:Ljava/lang/String;

.field private runningSpeed:Lcom/huawei/health/suggestion/model/ExerciseLimits;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/huawei/health/suggestion/model/ExerciseProfile$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->intensity:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 28
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->heartRate:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 29
    const-class v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->runningSpeed:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->duration:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->message:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 93
    const/4 v0, 0x0

    return v0
.end method

.method public getDuration()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->duration:I

    return v0
.end method

.method public getHeartRate()Lcom/huawei/health/suggestion/model/ExerciseLimits;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->heartRate:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    return-object v0
.end method

.method public getIntensity()Lcom/huawei/health/suggestion/model/ExerciseLimits;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->intensity:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->runningSpeed:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    return-object v0
.end method

.method public setDuration(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->duration:I

    .line 76
    return-void
.end method

.method public setHeartRate(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->heartRate:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 60
    return-void
.end method

.method public setIntensity(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->intensity:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 52
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->message:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setRunningSpeed(Lcom/huawei/health/suggestion/model/ExerciseLimits;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->runningSpeed:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 68
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 88
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 107
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 111
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 115
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 119
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->intensity:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->heartRate:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->runningSpeed:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 101
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->duration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/ExerciseProfile;->message:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 103
    return-void
.end method
