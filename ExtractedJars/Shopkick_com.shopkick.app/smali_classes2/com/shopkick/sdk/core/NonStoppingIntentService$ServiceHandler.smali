.class public final Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;
.super Landroid/os/Handler;
.source "NonStoppingIntentService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/core/NonStoppingIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "ServiceHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/core/NonStoppingIntentService;


# direct methods
.method public constructor <init>(Lcom/shopkick/sdk/core/NonStoppingIntentService;Landroid/os/Looper;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;->this$0:Lcom/shopkick/sdk/core/NonStoppingIntentService;

    .line 28
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 3

    .line 38
    invoke-static {}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "arg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " what:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    invoke-virtual {p1}, Landroid/os/Message;->getCallback()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p1}, Landroid/os/Message;->getCallback()Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;->handleMessage(Landroid/os/Message;)V

    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;->this$0:Lcom/shopkick/sdk/core/NonStoppingIntentService;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {v0, p1}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->onHandleIntent(Landroid/content/Intent;)V

    return-void
.end method
