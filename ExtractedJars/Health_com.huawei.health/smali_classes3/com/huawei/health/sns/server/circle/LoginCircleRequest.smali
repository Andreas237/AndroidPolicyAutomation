.class public Lcom/huawei/health/sns/server/circle/LoginCircleRequest;
.super Lcom/huawei/health/sns/server/CircleRequestBean;
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
.method public constructor <init>(Lo/axr;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Lcom/huawei/health/sns/server/CircleRequestBean;-><init>()V

    .line 70
    const-string v0, "/login"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->method:Ljava/lang/String;

    .line 71
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->module:Ljava/lang/String;

    .line 72
    invoke-virtual {p1}, Lo/axr;->e()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_type_:I

    .line 73
    invoke-virtual {p1}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_id_:Ljava/lang/String;

    .line 74
    invoke-virtual {p1}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->service_token_:Ljava/lang/String;

    .line 75
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->appid_:Ljava/lang/String;

    .line 76
    const v0, 0x2aea541

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->channel_:Ljava/lang/String;

    .line 77
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->version:Ljava/lang/String;

    .line 78
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 83
    new-instance v0, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/circle/LoginCircleResponse;-><init>()V

    return-object v0
.end method

.method public getAppid_()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->appid_:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel_()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->channel_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_id_()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_id_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_type_()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_type_:I

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    const-string v0, "LoginCircleRequest, "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    const-string v0, "ver:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->version:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getService_token_()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->service_token_:Ljava/lang/String;

    return-object v0
.end method

.method public setAppid_(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->appid_:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setChannel_(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->channel_:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setDevice_id_(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_id_:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setDevice_type_(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->device_type_:I

    .line 40
    return-void
.end method

.method public setService_token_(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/LoginCircleRequest;->service_token_:Ljava/lang/String;

    .line 48
    return-void
.end method
