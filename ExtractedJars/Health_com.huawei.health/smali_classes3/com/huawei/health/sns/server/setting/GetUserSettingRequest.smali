.class public Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getUserSNSInfo"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 21
    const-string v0, "/getUserSNSInfo"

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;->method:Ljava/lang/String;

    .line 22
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;->module:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 28
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetUserSettingRequest, v:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingRequest;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
