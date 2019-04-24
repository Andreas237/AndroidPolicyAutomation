.class Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;
    .locals 1

    .line 46
    new-array v0, p1, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent$2;->d(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;
    .locals 5

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    .line 41
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;-><init>(Ljava/lang/String;IJ)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent$2;->b(I)[Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    move-result-object v0

    return-object v0
.end method
