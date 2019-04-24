.class public Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;
.super Lcom/huawei/health/sns/server/AssistRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/check_url"

.field private static final CONN_TIMEOUT:I = 0xbb8

.field private static final READ_TIMEOUT:I = 0xbb8


# instance fields
.field public url_string_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/server/AssistRequestBean;-><init>()V

    .line 41
    const-string v0, "/check_url"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->method:Ljava/lang/String;

    .line 42
    const-string v0, "/api/client"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->module:Ljava/lang/String;

    .line 43
    const-string v0, "0100"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->version:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 49
    new-instance v0, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/assistant/CheckUrlResponse;-><init>()V

    return-object v0
.end method

.method public getConnTimeout()I
    .locals 1

    .line 61
    const/16 v0, 0xbb8

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 74
    const-string v0, "CheckUrlRequest"

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 55
    const/16 v0, 0xbb8

    return v0
.end method

.method public getUrl_string_()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->url_string_:Ljava/lang/String;

    return-object v0
.end method

.method public isRetryRequest()Z
    .locals 1

    .line 68
    const/4 v0, 0x0

    return v0
.end method

.method public setUrl_string_(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/CheckUrlRequest;->url_string_:Ljava/lang/String;

    .line 22
    return-void
.end method
