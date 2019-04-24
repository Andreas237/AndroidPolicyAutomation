.class final Lcom/huawei/hwservicesmgr/datetype/DeviceInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;
    .locals 11

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 213
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 214
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 216
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 217
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 218
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 219
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 220
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 222
    new-instance v10, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-direct {v10}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;-><init>()V

    .line 223
    invoke-virtual {v10, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 224
    invoke-virtual {v10, v1}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 225
    invoke-virtual {v10, v2}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceProtocol(I)V

    .line 226
    invoke-virtual {v10, v3}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setProductType(I)V

    .line 227
    invoke-virtual {v10, v4}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceActiveState(I)V

    .line 228
    invoke-virtual {v10, v5}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceConnectState(I)V

    .line 229
    invoke-virtual {v10, v6}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setEncryptType(I)V

    .line 230
    invoke-virtual {v10, v7}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceBTType(I)V

    .line 231
    invoke-virtual {v10, v8}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 232
    invoke-virtual {v10, v9}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDevIdType(I)V

    .line 233
    return-object v10
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 202
    invoke-virtual {p0, p1}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo$5;->a(Landroid/os/Parcel;)Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;
    .locals 1

    .line 206
    new-array v0, p1, [Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 202
    invoke-virtual {p0, p1}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo$5;->d(I)[Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    move-result-object v0

    return-object v0
.end method
