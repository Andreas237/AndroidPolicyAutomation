.class public abstract Lcom/sina/weibo/sdk/network/target/SimpleTarget;
.super Lcom/sina/weibo/sdk/network/target/BaseTarget;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/sina/weibo/sdk/network/target/BaseTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public final onRequestSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sina/weibo/sdk/network/target/SimpleTarget;->onSuccess(Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public abstract onSuccess(Ljava/lang/String;)V
.end method

.method public bridge synthetic transResponse(Lcom/sina/weibo/sdk/network/base/WbResponse;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p1}, Lcom/sina/weibo/sdk/network/target/SimpleTarget;->transResponse(Lcom/sina/weibo/sdk/network/base/WbResponse;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transResponse(Lcom/sina/weibo/sdk/network/base/WbResponse;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 12
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/network/base/WbResponse;->body()Lcom/sina/weibo/sdk/network/base/WbResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->string()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
