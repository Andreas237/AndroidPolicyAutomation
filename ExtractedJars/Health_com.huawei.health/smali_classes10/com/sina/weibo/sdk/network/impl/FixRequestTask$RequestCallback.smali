.class Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sina/weibo/sdk/network/impl/FixRequestTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RequestCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;


# direct methods
.method private constructor <init>(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)V
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;Lcom/sina/weibo/sdk/network/impl/FixRequestTask$1;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;-><init>(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 109
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/sina/weibo/sdk/network/base/RequestResult;

    .line 110
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;->access$100(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)Lcom/sina/weibo/sdk/network/target/Target;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 111
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;->access$100(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)Lcom/sina/weibo/sdk/network/target/Target;

    move-result-object v0

    invoke-interface {v0}, Lcom/sina/weibo/sdk/network/target/Target;->onRequestDone()V

    .line 112
    invoke-virtual {v2}, Lcom/sina/weibo/sdk/network/base/RequestResult;->getE()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;->access$100(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)Lcom/sina/weibo/sdk/network/target/Target;

    move-result-object v0

    invoke-virtual {v2}, Lcom/sina/weibo/sdk/network/base/RequestResult;->getE()Ljava/lang/Exception;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/network/target/Target;->onFailure(Ljava/lang/Exception;)V

    .line 114
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;->access$100(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)Lcom/sina/weibo/sdk/network/target/Target;

    move-result-object v0

    invoke-interface {v0}, Lcom/sina/weibo/sdk/network/target/Target;->onError()V

    goto :goto_0

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/network/impl/FixRequestTask$RequestCallback;->this$0:Lcom/sina/weibo/sdk/network/impl/FixRequestTask;

    invoke-static {v0}, Lcom/sina/weibo/sdk/network/impl/FixRequestTask;->access$100(Lcom/sina/weibo/sdk/network/impl/FixRequestTask;)Lcom/sina/weibo/sdk/network/target/Target;

    move-result-object v0

    invoke-virtual {v2}, Lcom/sina/weibo/sdk/network/base/RequestResult;->getResponse()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sina/weibo/sdk/network/target/Target;->onRequestSuccess(Ljava/lang/Object;)V

    .line 119
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
