.class public Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "DeviceInfo"


# instance fields
.field private UUID:Ljava/lang/String;

.field private bTversion:Ljava/lang/String;

.field private mAuthVersion:I

.field private mAutoDetectSwitchStatus:I

.field private mDevIdType:I

.field private mDeviceActiveState:I

.field private mDeviceBTType:I

.field private mDeviceConnectState:I

.field private mDeviceIdentify:Ljava/lang/String;

.field private mDeviceModelName:Ljava/lang/String;

.field private mDeviceName:Ljava/lang/String;

.field private mDeviceProtocol:I

.field private mEncryptType:I

.field private mFootWearPosition:I

.field private mProductType:I

.field private soft_version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 270
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceProtocol:I

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceModelName:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceActiveState:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceConnectState:I

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mEncryptType:I

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceBTType:I

    .line 38
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAuthVersion:I

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAutoDetectSwitchStatus:I

    .line 46
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mFootWearPosition:I

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->bTversion:Ljava/lang/String;

    .line 49
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->soft_version:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public configureDeviceBTType(I)V
    .locals 1

    .line 363
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceBTType:I

    .line 364
    return-void
.end method

.method public configureDeviceIdentify(Ljava/lang/String;)V
    .locals 1

    .line 355
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    .line 356
    return-void
.end method

.method public configureDeviceName(Ljava/lang/String;)V
    .locals 1

    .line 359
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    .line 360
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 246
    const/4 v0, 0x0

    return v0
.end method

.method public getAutoDetectSwitchStatus()I
    .locals 1

    .line 375
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAutoDetectSwitchStatus:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDevIdType()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

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

    .line 193
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceActiveState:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceBTType()I
    .locals 1

    .line 233
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceBTType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceConnectState()I
    .locals 1

    .line 209
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceConnectState:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceIdentify()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceModelName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceProtocol()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceProtocol:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getEncryptType()I
    .locals 1

    .line 217
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mEncryptType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFootWearPosition()I
    .locals 1

    .line 383
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mFootWearPosition:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getProductType()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSecDeviceID()Ljava/lang/String;
    .locals 2

    .line 84
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSecUUID()Ljava/lang/String;
    .locals 2

    .line 92
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_2

    .line 93
    :cond_0
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 94
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    return-object v0

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    return-object v0
.end method

.method public getSoft_version()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->soft_version:Ljava/lang/String;

    return-object v0
.end method

.method public getUUID()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getbTversion()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->bTversion:Ljava/lang/String;

    return-object v0
.end method

.method public getmAuthVersion()I
    .locals 1

    .line 367
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAuthVersion:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public initDeviceInfo1()V
    .locals 0

    .line 338
    return-void
.end method

.method public initDeviceInfo10()V
    .locals 0

    .line 347
    return-void
.end method

.method public initDeviceInfo11()V
    .locals 0

    .line 348
    return-void
.end method

.method public initDeviceInfo12()V
    .locals 0

    .line 349
    return-void
.end method

.method public initDeviceInfo13()V
    .locals 0

    .line 350
    return-void
.end method

.method public initDeviceInfo14()V
    .locals 0

    .line 351
    return-void
.end method

.method public initDeviceInfo15()V
    .locals 0

    .line 352
    return-void
.end method

.method public initDeviceInfo2()V
    .locals 0

    .line 339
    return-void
.end method

.method public initDeviceInfo3()V
    .locals 0

    .line 340
    return-void
.end method

.method public initDeviceInfo4()V
    .locals 0

    .line 341
    return-void
.end method

.method public initDeviceInfo5()V
    .locals 0

    .line 342
    return-void
.end method

.method public initDeviceInfo6()V
    .locals 0

    .line 343
    return-void
.end method

.method public initDeviceInfo7()V
    .locals 0

    .line 344
    return-void
.end method

.method public initDeviceInfo8()V
    .locals 0

    .line 345
    return-void
.end method

.method public initDeviceInfo9()V
    .locals 0

    .line 346
    return-void
.end method

.method public resetDeviceInfo(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Ljava/lang/String;)V
    .locals 4

    .line 323
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 324
    :cond_0
    return-void

    .line 326
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 328
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 329
    const-string v0, "DeviceInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u66f4\u65b0DeviceActiveState\u4e3adisable,\u8bbe\u5907\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 332
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 333
    const-string v0, "DeviceInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u66f4\u65b0DeviceActiveState\u4e3aenable,\u8bbe\u5907\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    :goto_0
    return-void
.end method

.method public setAutoDetectSwitchStatus(I)V
    .locals 1

    .line 379
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAutoDetectSwitchStatus:I

    .line 380
    return-void
.end method

.method public setDevIdType(I)V
    .locals 1

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    .line 81
    return-void
.end method

.method public setDeviceActiveState(I)V
    .locals 1

    .line 185
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceActiveState:I

    .line 186
    return-void
.end method

.method public setDeviceBTType(I)V
    .locals 1

    .line 241
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceBTType:I

    .line 242
    return-void
.end method

.method public setDeviceConnectState(I)V
    .locals 1

    .line 201
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceConnectState:I

    .line 202
    return-void
.end method

.method public setDeviceIdentify(Ljava/lang/String;)V
    .locals 1

    .line 124
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setDeviceModel(Ljava/lang/String;)V
    .locals 1

    .line 170
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceModelName:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setDeviceName(Ljava/lang/String;)V
    .locals 1

    .line 108
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setDeviceProtocol(I)V
    .locals 1

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceProtocol:I

    .line 141
    return-void
.end method

.method public setEncryptType(I)V
    .locals 1

    .line 225
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mEncryptType:I

    .line 226
    return-void
.end method

.method public setFootWearPosition(I)V
    .locals 1

    .line 387
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mFootWearPosition:I

    .line 388
    return-void
.end method

.method public setProductType(I)V
    .locals 1

    .line 156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    .line 157
    return-void
.end method

.method public setSoft_version(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->soft_version:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setUUID(Ljava/lang/String;)V
    .locals 1

    .line 72
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setbTversion(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->bTversion:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setmAuthVersion(I)V
    .locals 1

    .line 371
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAuthVersion:I

    .line 372
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 318
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[mDeviceName = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mProductType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mDeviceConnectState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceConnectState:I

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

    .line 251
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceIdentify:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 253
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceProtocol:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 254
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mProductType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 255
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceActiveState:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 256
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceConnectState:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 257
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mEncryptType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 258
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceBTType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 259
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->UUID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDeviceModelName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 261
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mDevIdType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 262
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAuthVersion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 263
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mAutoDetectSwitchStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 264
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->mFootWearPosition:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->bTversion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->soft_version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 268
    return-void
.end method
