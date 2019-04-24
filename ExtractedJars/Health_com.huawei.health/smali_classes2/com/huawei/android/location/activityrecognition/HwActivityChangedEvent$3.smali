.class Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
    .locals 3

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 36
    new-array v2, v1, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 37
    .line 38
    sget-object v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 37
    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->readTypedArray([Ljava/lang/Object;Landroid/os/Parcelable$Creator;)V

    .line 40
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    invoke-direct {v0, v2}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;-><init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent$3;->a(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    move-result-object v0

    return-object v0
.end method

.method public e(I)[Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
    .locals 1

    .line 45
    new-array v0, p1, [Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent$3;->e(I)[Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;

    move-result-object v0

    return-object v0
.end method
