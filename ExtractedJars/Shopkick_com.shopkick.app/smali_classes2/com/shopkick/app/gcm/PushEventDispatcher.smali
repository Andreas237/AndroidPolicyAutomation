.class public Lcom/shopkick/app/gcm/PushEventDispatcher;
.super Ljava/lang/Object;
.source "PushEventDispatcher.java"


# instance fields
.field protected context:Landroid/content/Context;

.field protected handler:Landroid/os/Handler;

.field private progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

.field protected pushEventHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/gcm/PushEventHandler;",
            ">;"
        }
    .end annotation
.end field

.field protected pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->context:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->handler:Landroid/os/Handler;

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getProgress()Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object v0
.end method

.method public handleEvents()Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-virtual {p0, v0}, Lcom/shopkick/app/gcm/PushEventDispatcher;->handleEvents(Lcom/shopkick/app/gcm/PushEventHandler;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    move-result-object v0

    return-object v0
.end method

.method public handleEvents(Lcom/shopkick/app/gcm/PushEventHandler;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 63
    iget-object v1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 67
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 68
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    .line 72
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_5

    .line 73
    iget-object v1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    add-int/lit8 v2, p1, 0x1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/gcm/PushEventHandler;

    if-eqz p1, :cond_2

    .line 75
    iget-object v1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/gcm/PushEventHandler;->onPushEvent(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 77
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lt v2, p1, :cond_3

    .line 78
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    .line 79
    iput-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 81
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Pause:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v2

    goto :goto_0

    .line 85
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-object p1
.end method

.method public isHandlingEvents()Z
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    sget-object v1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Done:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public registerHandler(Lcom/shopkick/app/gcm/PushEventHandler;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    invoke-virtual {p1, p0}, Lcom/shopkick/app/gcm/PushEventHandler;->setPushEventHandler(Lcom/shopkick/app/gcm/PushEventDispatcher;)V

    return-void
.end method

.method public setPushMessage(Lcom/shopkick/app/fetchers/api/skapi/PushMessage;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushMessage:Lcom/shopkick/app/fetchers/api/skapi/PushMessage;

    .line 37
    sget-object p1, Lcom/shopkick/app/gcm/PushEventHandler$Progress;->Continue:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    iput-object p1, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->progress:Lcom/shopkick/app/gcm/PushEventHandler$Progress;

    return-void
.end method

.method public unregisterHandler(Ljava/lang/Integer;)V
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/gcm/PushEventDispatcher;->pushEventHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
