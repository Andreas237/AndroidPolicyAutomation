.class public Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bugType:I

.field private buildNumber:Ljava/lang/String;

.field private deviceID:Ljava/lang/String;

.field private productType:Ljava/lang/String;

.field private responseCode:I

.field private uniqueID:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBugType()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->bugType:I

    return v0
.end method

.method public getBuildNumber()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->buildNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceID()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->deviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getProductType()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->productType:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseCode()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->responseCode:I

    return v0
.end method

.method public getUniqueID()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->uniqueID:J

    return-wide v0
.end method

.method public setBugType(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->bugType:I

    .line 30
    return-void
.end method

.method public setBuildNumber(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->buildNumber:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setDeviceID(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->deviceID:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setProductType(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->productType:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setResponseCode(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->responseCode:I

    .line 54
    return-void
.end method

.method public setUniqueID(J)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->uniqueID:J

    .line 22
    return-void
.end method
