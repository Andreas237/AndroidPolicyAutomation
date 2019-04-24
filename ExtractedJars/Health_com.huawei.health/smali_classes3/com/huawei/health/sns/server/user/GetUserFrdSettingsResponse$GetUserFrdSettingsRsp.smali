.class public Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetUserFrdSettingsRsp"
.end annotation


# instance fields
.field private frdUID_:J

.field private remarkName_:Ljava/lang/String;

.field private setFlags_:Ljava/lang/String;

.field private stickTime_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->setFlags_:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFrdUID_()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->frdUID_:J

    .line 40
    return-wide v0
.end method

.method public getRemarkName_()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->remarkName_:Ljava/lang/String;

    .line 62
    return-object v0
.end method

.method public getSetFlags_()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->setFlags_:Ljava/lang/String;

    .line 68
    return-object v0
.end method

.method public getStickTime_()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 74
    return-object v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->frdUID_:J

    .line 45
    return-void
.end method

.method public setRemarkName_(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->remarkName_:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setSetFlags_(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->setFlags_:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setStickTime_(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    .line 57
    return-void
.end method
