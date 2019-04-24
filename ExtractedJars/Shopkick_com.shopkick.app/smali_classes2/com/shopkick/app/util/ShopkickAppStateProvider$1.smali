.class Lcom/shopkick/app/util/ShopkickAppStateProvider$1;
.super Ljava/lang/Object;
.source "ShopkickAppStateProvider.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ShopkickAppStateProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/ShopkickAppStateProvider;


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/ShopkickAppStateProvider;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider$1;->this$0:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "AppActivityManagerAppForegroundedEvent"

    if-ne p2, p1, :cond_0

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider$1;->this$0:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    invoke-static {p1}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->access$000(Lcom/shopkick/app/util/ShopkickAppStateProvider;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/sdk/presence/AppStateListener;

    .line 99
    sget-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->FOREGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    invoke-interface {p2, v0}, Lcom/shopkick/sdk/presence/AppStateListener;->onStateChange(Lcom/shopkick/sdk/presence/AppStateListener$FocusState;)V

    goto :goto_0

    :cond_0
    const-string p2, "AppActivityManagerAppBackgroundedEvent"

    if-ne p2, p1, :cond_1

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/util/ShopkickAppStateProvider$1;->this$0:Lcom/shopkick/app/util/ShopkickAppStateProvider;

    invoke-static {p1}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->access$000(Lcom/shopkick/app/util/ShopkickAppStateProvider;)Ljava/util/concurrent/ConcurrentSkipListSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentSkipListSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/sdk/presence/AppStateListener;

    .line 105
    sget-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->BACKGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    invoke-interface {p2, v0}, Lcom/shopkick/sdk/presence/AppStateListener;->onStateChange(Lcom/shopkick/sdk/presence/AppStateListener$FocusState;)V

    goto :goto_1

    :cond_1
    return-void
.end method
