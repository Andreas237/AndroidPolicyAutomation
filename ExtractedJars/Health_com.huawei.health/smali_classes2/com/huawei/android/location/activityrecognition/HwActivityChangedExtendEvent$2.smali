.class Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;>;"
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
.method public a(I)[Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
    .locals 1

    .line 45
    new-array v0, p1, [Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    return-object v0
.end method

.method public b(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;
    .locals 3

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 36
    new-array v2, v1, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 37
    .line 38
    sget-object v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 37
    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->readTypedArray([Ljava/lang/Object;Landroid/os/Parcelable$Creator;)V

    .line 40
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    invoke-direct {v0, v2}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;-><init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent$2;->b(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent$2;->a(I)[Lcom/huawei/android/location/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v0

    return-object v0
.end method
