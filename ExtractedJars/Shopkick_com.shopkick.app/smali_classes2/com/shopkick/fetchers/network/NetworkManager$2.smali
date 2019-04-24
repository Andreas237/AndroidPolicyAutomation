.class Lcom/shopkick/fetchers/network/NetworkManager$2;
.super Ljava/lang/Object;
.source "NetworkManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/fetchers/network/NetworkManager;->cancel(Lcom/shopkick/fetchers/network/NetworkRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/fetchers/network/NetworkManager;

.field final synthetic val$request:Lcom/shopkick/fetchers/network/NetworkRequest;


# direct methods
.method constructor <init>(Lcom/shopkick/fetchers/network/NetworkManager;Lcom/shopkick/fetchers/network/NetworkRequest;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$2;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    iput-object p2, p0, Lcom/shopkick/fetchers/network/NetworkManager$2;->val$request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-wide/16 v0, 0x14d

    .line 324
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 325
    iget-object v0, p0, Lcom/shopkick/fetchers/network/NetworkManager$2;->val$request:Lcom/shopkick/fetchers/network/NetworkRequest;

    invoke-virtual {v0}, Lcom/shopkick/fetchers/network/NetworkRequest;->getRequestWorkId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 327
    iget-object v1, p0, Lcom/shopkick/fetchers/network/NetworkManager$2;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lcom/shopkick/fetchers/network/NetworkManager;->access$200(Lcom/shopkick/fetchers/network/NetworkManager;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 330
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v5, "cancel work thread failed"

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method
