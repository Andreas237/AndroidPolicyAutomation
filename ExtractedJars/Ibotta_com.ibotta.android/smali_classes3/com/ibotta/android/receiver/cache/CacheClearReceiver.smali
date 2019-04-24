.class public Lcom/ibotta/android/receiver/cache/CacheClearReceiver;
.super Landroid/content/BroadcastReceiver;
.source "CacheClearReceiver.java"


# static fields
.field private static final KEY_CACHE_CLEAR_FLAGS:Ljava/lang/String; = "cache_clear_flags"


# instance fields
.field protected cacheClearHelper:Lcom/ibotta/android/appcache/CacheClearHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static broadcast(Landroid/content/Context;I)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;->newIntent(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;I)Landroid/content/Intent;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 33
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "cache_clear_flags"

    .line 34
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string p1, "onReceive"

    const/4 v0, 0x0

    .line 40
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/receiver/cache/CacheClearReceiver;)V

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/receiver/cache/CacheClearReceiver;->cacheClearHelper:Lcom/ibotta/android/appcache/CacheClearHelper;

    const-string v1, "cache_clear_flags"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/appcache/CacheClearHelper;->clearCacheForFlags(I)V

    return-void
.end method
