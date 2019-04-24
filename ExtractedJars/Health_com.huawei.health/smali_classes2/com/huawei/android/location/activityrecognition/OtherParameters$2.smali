.class Lcom/huawei/android/location/activityrecognition/OtherParameters$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/location/activityrecognition/OtherParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/OtherParameters;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/OtherParameters;
    .locals 19

    .line 65
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v10

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v12

    .line 67
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v14

    .line 68
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v16

    .line 69
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    .line 71
    new-instance v0, Lcom/huawei/android/location/activityrecognition/OtherParameters;

    move-wide v1, v10

    move-wide v3, v12

    move-wide v5, v14

    move-wide/from16 v7, v16

    move-object/from16 v9, v18

    invoke-direct/range {v0 .. v9}, Lcom/huawei/android/location/activityrecognition/OtherParameters;-><init>(DDDDLjava/lang/String;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/android/location/activityrecognition/OtherParameters;
    .locals 1

    .line 76
    new-array v0, p1, [Lcom/huawei/android/location/activityrecognition/OtherParameters;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/OtherParameters$2;->c(Landroid/os/Parcel;)Lcom/huawei/android/location/activityrecognition/OtherParameters;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/location/activityrecognition/OtherParameters$2;->c(I)[Lcom/huawei/android/location/activityrecognition/OtherParameters;

    move-result-object v0

    return-object v0
.end method
