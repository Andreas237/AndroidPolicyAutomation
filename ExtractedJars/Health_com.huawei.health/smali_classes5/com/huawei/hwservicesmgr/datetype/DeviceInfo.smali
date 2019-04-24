.class public Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private UUID:Ljava/lang/String;

.field private mDevIdType:I

.field private mDeviceActiveState:I

.field private mDeviceBTType:I

.field private mDeviceConnectState:I

.field private mDeviceIdentify:Ljava/lang/String;

.field private mDeviceName:Ljava/lang/String;

.field private mDeviceProtocol:I

.field private mEncryptType:I

.field private mProductType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 202
    new-instance v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo$5;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceName:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    .line 22
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceProtocol:I

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mProductType:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceActiveState:I

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceConnectState:I

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mEncryptType:I

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceBTType:I

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->UUID:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDevIdType:I

    return-void
.end method


# virtual methods
.method public conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 258
    new-instance v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 259
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 260
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 262
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 263
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 264
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 265
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getEncryptType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setEncryptType(I)V

    .line 266
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDeviceBTType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 267
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 268
    invoke-virtual {p0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getDevIdType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDevIdType(I)V

    .line 269
    return-object v1
.end method

.method public describeContents()I
    .locals 1

    .line 185
    const/4 v0, 0x0

    return v0
.end method

.method public getDevIdType()I
    .locals 1

    .line 176
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDevIdType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceActiveState()I
    .locals 1

    .line 124
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceActiveState:I

    return v0
.end method

.method public getDeviceBTType()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceBTType:I

    return v0
.end method

.method public getDeviceConnectState()I
    .locals 1

    .line 140
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceConnectState:I

    return v0
.end method

.method public getDeviceIdentify()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceProtocol()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceProtocol:I

    return v0
.end method

.method public getEncryptType()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mEncryptType:I

    return v0
.end method

.method public getProductType()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mProductType:I

    return v0
.end method

.method public getUUID()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->UUID:Ljava/lang/String;

    return-object v0
.end method

.method public procDeviceInfo1()V
    .locals 0

    .line 242
    return-void
.end method

.method public procDeviceInfo10()V
    .locals 0

    .line 251
    return-void
.end method

.method public procDeviceInfo11()V
    .locals 0

    .line 252
    return-void
.end method

.method public procDeviceInfo2()V
    .locals 0

    .line 243
    return-void
.end method

.method public procDeviceInfo3()V
    .locals 0

    .line 244
    return-void
.end method

.method public procDeviceInfo4()V
    .locals 0

    .line 245
    return-void
.end method

.method public procDeviceInfo5()V
    .locals 0

    .line 246
    return-void
.end method

.method public procDeviceInfo6()V
    .locals 0

    .line 247
    return-void
.end method

.method public procDeviceInfo7()V
    .locals 0

    .line 248
    return-void
.end method

.method public procDeviceInfo8()V
    .locals 0

    .line 249
    return-void
.end method

.method public procDeviceInfo9()V
    .locals 0

    .line 250
    return-void
.end method

.method public setDevIdType(I)V
    .locals 1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDevIdType:I

    .line 181
    return-void
.end method

.method public setDeviceActiveState(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceActiveState:I

    .line 117
    return-void
.end method

.method public setDeviceBTType(I)V
    .locals 0

    .line 172
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceBTType:I

    .line 173
    return-void
.end method

.method public setDeviceConnectState(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceConnectState:I

    .line 133
    return-void
.end method

.method public setDeviceIdentify(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setDeviceName(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceName:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setDeviceProtocol(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceProtocol:I

    .line 85
    return-void
.end method

.method public setEncryptType(I)V
    .locals 0

    .line 156
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mEncryptType:I

    .line 157
    return-void
.end method

.method public setProductType(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mProductType:I

    .line 101
    return-void
.end method

.method public setUUID(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->UUID:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[mDeviceName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mProductType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mProductType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mDeviceConnectState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceConnectState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 192
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceProtocol:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mProductType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 194
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceActiveState:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceConnectState:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 196
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mEncryptType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 197
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDeviceBTType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->UUID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 199
    iget v0, p0, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->mDevIdType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    return-void
.end method
