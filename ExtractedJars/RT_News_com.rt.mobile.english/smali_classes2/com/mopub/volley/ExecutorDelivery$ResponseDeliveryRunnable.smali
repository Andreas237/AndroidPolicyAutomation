.class Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;
.super Ljava/lang/Object;
.source "ExecutorDelivery.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/volley/ExecutorDelivery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ResponseDeliveryRunnable"
.end annotation


# instance fields
.field private final mRequest:Lcom/mopub/volley/Request;

.field private final mResponse:Lcom/mopub/volley/Response;

.field private final mRunnable:Ljava/lang/Runnable;

.field final synthetic this$0:Lcom/mopub/volley/ExecutorDelivery;


# direct methods
.method public constructor <init>(Lcom/mopub/volley/ExecutorDelivery;Lcom/mopub/volley/Request;Lcom/mopub/volley/Response;Ljava/lang/Runnable;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->this$0:Lcom/mopub/volley/ExecutorDelivery;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p2, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    .line 84
    iput-object p3, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/mopub/volley/Response;

    .line 85
    iput-object p4, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    invoke-virtual {v0}, Lcom/mopub/volley/Request;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lcom/mopub/volley/Request;->finish(Ljava/lang/String;)V

    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/mopub/volley/Response;

    invoke-virtual {v0}, Lcom/mopub/volley/Response;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    iget-object v1, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/mopub/volley/Response;

    iget-object v1, v1, Lcom/mopub/volley/Response;->result:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/mopub/volley/Request;->deliverResponse(Ljava/lang/Object;)V

    goto :goto_0

    .line 101
    :cond_1
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    iget-object v1, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/mopub/volley/Response;

    iget-object v1, v1, Lcom/mopub/volley/Response;->error:Lcom/mopub/volley/VolleyError;

    invoke-virtual {v0, v1}, Lcom/mopub/volley/Request;->deliverError(Lcom/mopub/volley/VolleyError;)V

    .line 106
    :goto_0
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mResponse:Lcom/mopub/volley/Response;

    iget-boolean v0, v0, Lcom/mopub/volley/Response;->intermediate:Z

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/mopub/volley/Request;->addMarker(Ljava/lang/String;)V

    goto :goto_1

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRequest:Lcom/mopub/volley/Request;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/mopub/volley/Request;->finish(Ljava/lang/String;)V

    .line 113
    :goto_1
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 114
    iget-object v0, p0, Lcom/mopub/volley/ExecutorDelivery$ResponseDeliveryRunnable;->mRunnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method
