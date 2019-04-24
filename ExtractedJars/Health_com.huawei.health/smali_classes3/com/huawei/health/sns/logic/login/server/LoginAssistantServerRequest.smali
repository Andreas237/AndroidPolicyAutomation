.class public Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/login"


# instance fields
.field private appid_:Ljava/lang/String;

.field private channel_:Ljava/lang/String;

.field private device_id_:Ljava/lang/String;

.field private device_type_:I

.field private service_token_:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 75
    const-string v0, "/login"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->method:Ljava/lang/String;

    .line 76
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->module:Ljava/lang/String;

    .line 77
    iput p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_type_:I

    .line 78
    iput-object p2, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_id_:Ljava/lang/String;

    .line 79
    iput-object p3, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->service_token_:Ljava/lang/String;

    .line 80
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->appid_:Ljava/lang/String;

    .line 81
    const v0, 0x2aea541

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->channel_:Ljava/lang/String;

    .line 82
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->version:Ljava/lang/String;

    .line 83
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 88
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerResponse;-><init>()V

    return-object v0
.end method

.method public getAppid_()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->appid_:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel_()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->channel_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_id_()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_id_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_type_()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_type_:I

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    const-string v0, "LoginAssistantServerRequest "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const-string v0, "ver:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->version:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getService_token_()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->service_token_:Ljava/lang/String;

    return-object v0
.end method

.method public setAppid_(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->appid_:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setChannel_(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->channel_:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setDevice_id_(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_id_:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setDevice_type_(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->device_type_:I

    .line 55
    return-void
.end method

.method public setService_token_(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/health/sns/logic/login/server/LoginAssistantServerRequest;->service_token_:Ljava/lang/String;

    .line 63
    return-void
.end method
