.class public Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;
.super Lcom/shopkick/app/activities/BaseActivity;
.source "DeeplinkInvisibleActivity.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/shopkick/app/activities/BaseActivity;-><init>()V

    return-void
.end method

.method private logEventWithAction(Ljava/lang/Integer;)V
    .locals 1

    .line 38
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 39
    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private startSplashActivity(Landroid/net/Uri;)V
    .locals 3

    .line 30
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v1, 0x10008000

    .line 31
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 32
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 33
    invoke-virtual {p0, v0}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->startActivity(Landroid/content/Intent;)V

    .line 34
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->finish()V

    return-void
.end method


# virtual methods
.method public getTopScreen()Lcom/shopkick/app/screens/AppScreen;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected goToScreenInCurrentActivity(Lcom/shopkick/app/activities/PageIdentifierV2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected handleOnCreate()V
    .locals 2

    .line 18
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnCreate()V

    .line 19
    invoke-virtual {p0}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    const/16 v1, 0x4d

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->logEventWithAction(Ljava/lang/Integer;)V

    .line 21
    invoke-direct {p0, v0}, Lcom/shopkick/app/activities/DeeplinkInvisibleActivity;->startSplashActivity(Landroid/net/Uri;)V

    return-void
.end method

.method protected handleOnDestroy()V
    .locals 0

    .line 45
    invoke-super {p0}, Lcom/shopkick/app/activities/BaseActivity;->handleOnDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    return-void
.end method

.method public setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
