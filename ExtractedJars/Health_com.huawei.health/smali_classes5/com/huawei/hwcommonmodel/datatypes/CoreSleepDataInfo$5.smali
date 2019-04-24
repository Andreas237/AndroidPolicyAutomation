.class final Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;
    .locals 1

    .line 33
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo$5;->d(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;
    .locals 2

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    .line 26
    new-instance v1, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;-><init>()V

    .line 27
    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;->setInfo([B)V

    .line 28
    return-object v1
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo$5;->a(I)[Lcom/huawei/hwcommonmodel/datatypes/CoreSleepDataInfo;

    move-result-object v0

    return-object v0
.end method
