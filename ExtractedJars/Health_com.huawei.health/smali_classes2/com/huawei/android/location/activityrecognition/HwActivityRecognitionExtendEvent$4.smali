.class Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;
    .locals 11

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    .line 52
    .line 53
    const-class v0, Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/android/location/activityrecognition/OtherParameters;

    .line 52
    .line 54
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    .line 54
    .line 55
    move-object v1, v6

    move v2, v7

    move-wide v3, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;-><init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V

    return-object v0
.end method

.method public b(I)[Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;
    .locals 1

    .line 60
    new-array v0, p1, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent$4;->a(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent$4;->b(I)[Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;

    move-result-object v0

    return-object v0
.end method
