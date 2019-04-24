.class public abstract Lcom/shopkick/sdk/core/NonStoppingIntentService;
.super Landroid/app/Service;
.source "NonStoppingIntentService.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "NonStoppingIntentService"


# instance fields
.field private mName:Ljava/lang/String;

.field private mRedelivery:Z

.field protected volatile mServiceHandler:Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;

.field private volatile mServiceLooper:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mRedelivery:Z

    .line 56
    iput-object p1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mName:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    .line 82
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 83
    new-instance v0, Landroid/os/HandlerThread;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IntentService["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 86
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceLooper:Landroid/os/Looper;

    .line 87
    new-instance v0, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;

    iget-object v1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceLooper:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;-><init>(Lcom/shopkick/sdk/core/NonStoppingIntentService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceHandler:Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceLooper:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    return-void
.end method

.method protected abstract onHandleIntent(Landroid/content/Intent;)V
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 2

    if-nez p1, :cond_0

    .line 93
    invoke-virtual {p0, p2}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->stopSelf(I)V

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceHandler:Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;

    invoke-virtual {v0}, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const-string/jumbo v1, "startId"

    .line 97
    invoke-virtual {p1, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 98
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 99
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 100
    iget-object p1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mServiceHandler:Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/core/NonStoppingIntentService$ServiceHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 122
    invoke-virtual {p0, p1, p3}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->onStart(Landroid/content/Intent;I)V

    .line 123
    iget-boolean p1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mRedelivery:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    return p1
.end method

.method public setIntentRedelivery(Z)V
    .locals 0

    .line 77
    iput-boolean p1, p0, Lcom/shopkick/sdk/core/NonStoppingIntentService;->mRedelivery:Z

    return-void
.end method

.method protected stopSelf(Landroid/content/Intent;)V
    .locals 2

    const-string/jumbo v0, "startId"

    const/4 v1, -0x1

    .line 109
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/core/NonStoppingIntentService;->stopSelfResult(I)Z

    return-void
.end method
