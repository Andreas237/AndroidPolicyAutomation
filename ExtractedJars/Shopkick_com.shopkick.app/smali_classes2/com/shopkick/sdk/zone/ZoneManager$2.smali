.class Lcom/shopkick/sdk/zone/ZoneManager$2;
.super Ljava/lang/Object;
.source "ZoneManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/ZoneManager;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/ZoneManager;)V
    .locals 0

    .line 784
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$2;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 790
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 793
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$2;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {p1, p2}, Lcom/shopkick/sdk/zone/ZoneManager;->access$100(Lcom/shopkick/sdk/zone/ZoneManager;Lcom/shopkick/fetchers/DataResponse;)V

    goto :goto_0

    .line 797
    :cond_0
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneManager$2;->this$0:Lcom/shopkick/sdk/zone/ZoneManager;

    invoke-static {p1}, Lcom/shopkick/sdk/zone/ZoneManager;->access$200(Lcom/shopkick/sdk/zone/ZoneManager;)Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Lcom/shopkick/sdk/zone/ZoneManager$2$1;

    invoke-direct {v0, p0, p2}, Lcom/shopkick/sdk/zone/ZoneManager$2$1;-><init>(Lcom/shopkick/sdk/zone/ZoneManager$2;Lcom/shopkick/fetchers/DataResponse;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
