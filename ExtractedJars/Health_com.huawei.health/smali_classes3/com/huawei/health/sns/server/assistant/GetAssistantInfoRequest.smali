.class public Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/get_account_info"


# instance fields
.field public account_id_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 42
    const-string v0, "/get_account_info"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->method:Ljava/lang/String;

    .line 43
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->module:Ljava/lang/String;

    .line 44
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->version:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 50
    new-instance v0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoResponse;-><init>()V

    return-object v0
.end method

.method public getAccount_id_()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->account_id_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    const-string v0, "GetAssistantInfoRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 59
    if-eqz v1, :cond_0

    instance-of v0, v1, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 61
    return-object v1

    .line 63
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/health/sns/server/AssistRequestBean;->getValue(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setAccount_id_(J)V
    .locals 0

    .line 32
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/GetAssistantInfoRequest;->account_id_:J

    .line 33
    return-void
.end method
