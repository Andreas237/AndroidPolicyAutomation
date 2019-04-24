.class public abstract Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;
.super Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/http/AsyncHttpResponseHandler;-><init>()V

    return-void
.end method

.method private getResponseString([BLjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 35
    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    .line 36
    :catch_0
    move-exception v4

    .line 37
    const-string v0, ""

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public abstract OnFailure(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public onFailure(I[Lorg/apache/http/Header;[BLjava/lang/Throwable;)V
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->getCharset()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->getResponseString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p4}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->OnFailure(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    return-void
.end method

.method public onSuccess(I[Lorg/apache/http/Header;[B)V
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->getCharset()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->getResponseString([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/http/SimpleResponseHandler;->onSuccess(Ljava/lang/String;)V

    .line 15
    return-void
.end method

.method public abstract onSuccess(Ljava/lang/String;)V
.end method
