.class public Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/get_recommend_account"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 21
    const-string v0, "/get_recommend_account"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;->method:Ljava/lang/String;

    .line 22
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;->module:Ljava/lang/String;

    .line 23
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantRequest;->version:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 29
    new-instance v0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 35
    const-string v0, "GetRecommendAssistantRequest"

    return-object v0
.end method
