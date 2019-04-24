.class public Lo/arh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method


# virtual methods
.method public e(Ljava/lang/String;)I
    .locals 5

    .line 58
    const/4 v1, -0x1

    .line 60
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    return v1

    .line 66
    :cond_0
    new-instance v2, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;-><init>()V

    .line 67
    iput-object p1, v2, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->url_string_:Ljava/lang/String;

    .line 69
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 70
    instance-of v0, v3, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->ok()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;

    .line 73
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;->getResult()I

    move-result v1

    .line 75
    :cond_1
    return v1
.end method
