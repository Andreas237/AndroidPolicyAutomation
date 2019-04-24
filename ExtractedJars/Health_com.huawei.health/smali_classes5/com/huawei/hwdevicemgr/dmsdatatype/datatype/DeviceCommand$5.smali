.class final Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 1

    .line 139
    new-array v0, p1, [Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    return-object v0
.end method

.method public b(Landroid/os/Parcel;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 11

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 151
    const/4 v5, 0x0

    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 153
    if-lez v6, :cond_0

    .line 154
    new-array v5, v6, [B

    .line 155
    invoke-virtual {p1, v5}, Landroid/os/Parcel;->readByteArray([B)V

    .line 158
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 160
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    .line 163
    :goto_1
    new-instance v10, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v10}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 164
    invoke-virtual {v10, v1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 165
    invoke-virtual {v10, v2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 166
    invoke-virtual {v10, v3}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 167
    invoke-virtual {v10, v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 168
    invoke-virtual {v10, v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setPriority(I)V

    .line 169
    invoke-virtual {v10, v8}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedAck(Z)V

    .line 170
    invoke-virtual {v10, v9}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setNeedEncrypt(Z)V

    .line 171
    invoke-virtual {v10, v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 172
    return-object v10
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 134
    invoke-virtual {p0, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand$5;->b(Landroid/os/Parcel;)Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 134
    invoke-virtual {p0, p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand$5;->a(I)[Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    move-result-object v0

    return-object v0
.end method
