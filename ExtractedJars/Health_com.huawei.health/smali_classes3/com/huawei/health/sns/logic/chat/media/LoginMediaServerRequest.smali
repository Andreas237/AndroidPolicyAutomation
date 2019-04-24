.class public Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;
.super Lcom/huawei/health/sns/logic/chat/media/MtsRequest;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/login"


# instance fields
.field private appid_:Ljava/lang/String;

.field private channel_:I

.field private device_id_:Ljava/lang/String;

.field private device_type_:Ljava/lang/String;

.field private service_token_:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lo/axr;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Lcom/huawei/health/sns/logic/chat/media/MtsRequest;-><init>()V

    .line 85
    const-string v0, "/login"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->method:Ljava/lang/String;

    .line 86
    const-string v0, "com.huawei.health"

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->appid_:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_id_:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Lo/axr;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_type_:Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Lo/axr;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->service_token_:Ljava/lang/String;

    .line 90
    const v0, 0x2aea541

    iput v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->channel_:I

    .line 91
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 95
    new-instance v0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;-><init>()V

    return-object v0
.end method

.method public getAppid_()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->appid_:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel_()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->channel_:I

    return v0
.end method

.method public getDevice_id_()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_id_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevice_type_()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_type_:Ljava/lang/String;

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    const-string v0, "LoginMediaServerRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getService_token_()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->service_token_:Ljava/lang/String;

    return-object v0
.end method

.method public setAppid_(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->appid_:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setChannel_(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->channel_:I

    .line 79
    return-void
.end method

.method public setDevice_id_(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_id_:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setDevice_type_(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->device_type_:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setService_token_(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;->service_token_:Ljava/lang/String;

    .line 71
    return-void
.end method
