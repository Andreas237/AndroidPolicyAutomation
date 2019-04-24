.class public Lcom/shopkick/app/overlays/base/OverlaysManager;
.super Ljava/lang/Object;
.source "OverlaysManager.java"

# interfaces
.implements Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;
.implements Lcom/appboy/ui/inappmessage/listeners/IInAppMessageManagerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;,
        Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "OverlaysManager"

.field private static overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;


# instance fields
.field private currentOverlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/base/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field private currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

.field private handler:Landroid/os/Handler;

.field private isAppboyOverlayPresent:Z

.field private overlayEnabled:Z

.field private overlaySpecStates:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/overlays/common/OverlaySpecState;",
            ">;"
        }
    .end annotation
.end field

.field private screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 73
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    .line 79
    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 81
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    .line 82
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/overlays/base/OverlaysManager;->replaceTopOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V

    return-void
.end method

.method public static buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/overlays/base/SKOverlay;",
            ">;)",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;"
        }
    .end annotation

    .line 455
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 456
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    return-object v0
.end method

.method private createAndShowTopOverlay()V
    .locals 5

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-nez v0, :cond_0

    goto :goto_0

    .line 268
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 269
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v1

    .line 270
    new-instance v2, Lcom/shopkick/app/overlays/base/Overlay;

    iget-object v3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    .line 274
    invoke-direct {p0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->createOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v4

    invoke-direct {v2, v0, v3, v1, v4}, Lcom/shopkick/app/overlays/base/Overlay;-><init>(Landroid/content/Context;Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V

    .line 276
    invoke-virtual {v2, p0}, Lcom/shopkick/app/overlays/base/Overlay;->addOverlayListener(Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayListener()Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/shopkick/app/overlays/base/Overlay;->addOverlayListener(Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 278
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/base/Overlay;->show()V

    .line 280
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private createOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/overlays/base/SKOverlay;
    .locals 1

    .line 284
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/overlays/OverlayInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 291
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/base/SKOverlay;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 296
    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    return-object v0

    :catch_1
    move-exception p1

    .line 293
    invoke-virtual {p1}, Ljava/lang/InstantiationException;->printStackTrace()V

    return-object v0
.end method

.method private didGoToStoreDetailsScreen()Z
    .locals 6

    .line 535
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    const-string v1, "instant"

    .line 537
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 538
    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isFirstTimeUserExperienceEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 539
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFtueInPauseState()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 540
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFtueInCompleteState()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 542
    :cond_0
    iget-boolean v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    const/4 v2, 0x1

    if-nez v1, :cond_1

    return v2

    .line 546
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v3, "location_id"

    .line 547
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "from_walkin"

    .line 548
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 550
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->screenTransitionPerformanceLogger:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger;->startAutoTransition()V

    .line 551
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    new-instance v3, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v4, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v5, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {v3, v4, v5, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 552
    invoke-virtual {v0, v3}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    .line 554
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->setHasWalkinTransitionedToStoreDetails(Z)V

    return v2

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private enqueueOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z
    .locals 8

    .line 163
    new-instance v0, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/shopkick/app/overlays/common/OverlaySpecState;-><init>(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)V

    .line 167
    iget-object p3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-nez p3, :cond_0

    .line 168
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p3

    .line 169
    invoke-virtual {p3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 170
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    const-string v6, "OverlaysManager: [BLE_MESSAGING] overlay queue size: %d, enqueuing overlay with spec: %s, listener %s"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    .line 172
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v3, v2

    aput-object p1, v3, v1

    aput-object p2, v3, p4

    .line 170
    invoke-virtual {p3, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 177
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p3

    .line 178
    invoke-virtual {p3}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p3

    sget-object v4, Lcom/shopkick/logging/Area;->PRESENCE:Lcom/shopkick/logging/Area;

    .line 179
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    const-string v6, "OverlaysManager: [BLE_MESSAGING] overlay queue size: %d, already queued same overlay for spec: %s, listener %s"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    .line 181
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v3, v2

    aput-object p1, v3, v1

    aput-object p2, v3, p4

    .line 179
    invoke-virtual {p3, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :goto_0
    invoke-virtual {v0, p0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->prepare(Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;)V

    .line 186
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->isReadyToShow()Z

    move-result p1

    return p1
.end method

.method public static getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;
    .locals 1

    .line 55
    sget-object v0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    return-object v0
.end method

.method public static init(Lcom/shopkick/app/application/ScreenGlobals;)V
    .locals 1

    .line 50
    new-instance v0, Lcom/shopkick/app/overlays/base/OverlaysManager;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;-><init>(Lcom/shopkick/app/application/ScreenGlobals;)V

    sput-object v0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    .line 51
    invoke-static {}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->getInstance()Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;

    move-result-object p0

    sget-object v0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    invoke-virtual {p0, v0}, Lcom/appboy/ui/inappmessage/AppboyInAppMessageManager;->setCustomInAppMessageManagerListener(Lcom/appboy/ui/inappmessage/listeners/IInAppMessageManagerListener;)V

    return-void
.end method

.method private removeOverlaySpecStateForOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/overlays/common/OverlaySpecState;
    .locals 2

    const/4 v0, 0x0

    .line 304
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 305
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 306
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private replaceTopOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 399
    :cond_0
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 400
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 402
    invoke-virtual {p2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p2

    .line 404
    invoke-direct {p0, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->createOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v0

    .line 403
    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/overlays/base/Overlay;->replaceOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V

    if-eqz p3, :cond_1

    .line 407
    invoke-interface {p3, p2}, Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;->onOverlayReplaceSuccess(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    .line 394
    invoke-virtual {p2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;->onOverlayReplaceSuccess(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void
.end method

.method public addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enqueueOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return-void
.end method

.method public addOverlays(Ljava/util/ArrayList;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ">;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            "Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 130
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_4

    if-eqz p2, :cond_4

    if-nez p3, :cond_0

    goto :goto_1

    .line 135
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v1, v0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 v4, 0x0

    .line 136
    invoke-direct {p0, v2, v4, p2, p3}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enqueueOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v1, v3

    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    .line 143
    iget-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    move v0, v3

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v0
.end method

.method public addRawOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 105
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/OverlayInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 108
    const-class v1, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 109
    invoke-static {p1}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    goto :goto_0

    .line 110
    :cond_0
    const-class v1, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    invoke-static {p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    .line 115
    :cond_1
    :goto_0
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void

    .line 102
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'overlaySpec\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public beforeInAppMessageDisplayed(Lcom/appboy/models/IInAppMessage;)Lcom/appboy/ui/inappmessage/InAppMessageOperation;
    .locals 0

    .line 593
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 602
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-nez p1, :cond_1

    .line 607
    sget-object p1, Lcom/appboy/ui/inappmessage/InAppMessageOperation;->DISPLAY_LATER:Lcom/appboy/ui/inappmessage/InAppMessageOperation;

    return-object p1

    .line 609
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->acceptAppboyIAM()Z

    move-result p1

    if-nez p1, :cond_2

    .line 613
    sget-object p1, Lcom/appboy/ui/inappmessage/InAppMessageOperation;->DISPLAY_LATER:Lcom/appboy/ui/inappmessage/InAppMessageOperation;

    return-object p1

    :cond_2
    const/4 p1, 0x1

    .line 620
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    .line 621
    sget-object p1, Lcom/appboy/ui/inappmessage/InAppMessageOperation;->DISPLAY_NOW:Lcom/appboy/ui/inappmessage/InAppMessageOperation;

    return-object p1

    .line 600
    :cond_3
    :goto_0
    sget-object p1, Lcom/appboy/ui/inappmessage/InAppMessageOperation;->DISPLAY_LATER:Lcom/appboy/ui/inappmessage/InAppMessageOperation;

    return-object p1
.end method

.method public clearTopOverlay(Lcom/shopkick/app/activities/BaseActivity;)V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 249
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/base/Overlay;

    if-eqz v0, :cond_1

    .line 251
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 252
    instance-of v1, v0, Landroid/view/ContextThemeWrapper;

    if-eqz v1, :cond_0

    .line 253
    check-cast v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    :cond_0
    if-ne v0, p1, :cond_1

    .line 257
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->removeOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_1
    return-void
.end method

.method public enableOverlay(Z)V
    .locals 0

    .line 507
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    if-eqz p1, :cond_0

    .line 509
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    :cond_0
    return-void
.end method

.method public getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;
    .locals 1

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/base/Overlay;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public maybeReplaceCurrentOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V
    .locals 7

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 362
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/OverlayInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 366
    const-class v1, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 367
    invoke-static {p2}, Lcom/shopkick/app/overlays/common/LayeredSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    goto :goto_0

    .line 368
    :cond_0
    const-class v1, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    invoke-static {p2}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->preloadUrls:Ljava/util/List;

    .line 373
    :cond_1
    :goto_0
    new-instance v0, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 374
    invoke-virtual {v1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayListener()Lcom/shopkick/app/overlays/interfaces/IOverlayListener;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 375
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayRequest()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 376
    invoke-virtual {v3}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getAPICommonHandlerCallback()Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    move-result-object v3

    invoke-direct {v0, p2, v1, v2, v3}, Lcom/shopkick/app/overlays/common/OverlaySpecState;-><init>(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;)V

    .line 379
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->isReadyToShow()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 380
    invoke-direct {p0, p1, v0, p3}, Lcom/shopkick/app/overlays/base/OverlaysManager;->replaceTopOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;)V

    goto :goto_1

    .line 382
    :cond_2
    new-instance p2, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p0

    move-object v3, p1

    move-object v4, v0

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/overlays/base/OverlaysManager$ReplaceCurrentOverlayRunnable;-><init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/common/OverlaySpecState;Lcom/shopkick/app/overlays/interfaces/IOverlayReplaceListener;Lcom/shopkick/app/overlays/base/OverlaysManager$1;)V

    invoke-virtual {v0, p2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->prepare(Lcom/shopkick/app/overlays/common/OverlaySpecState$OnPreparedListener;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public maybeUpdateCurrentOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 338
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 340
    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/Overlay;->updateOverlay()V

    :cond_0
    return-void
.end method

.method public onInAppMessageButtonClicked(Lcom/appboy/models/MessageButton;Lcom/appboy/ui/inappmessage/InAppMessageCloser;)Z
    .locals 0

    const/4 p1, 0x0

    .line 652
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    .line 653
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return p1
.end method

.method public onInAppMessageClicked(Lcom/appboy/models/IInAppMessage;Lcom/appboy/ui/inappmessage/InAppMessageCloser;)Z
    .locals 0

    const/4 p1, 0x0

    .line 634
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    .line 635
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return p1
.end method

.method public onInAppMessageDismissed(Lcom/appboy/models/IInAppMessage;)V
    .locals 0

    const/4 p1, 0x0

    .line 663
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    .line 664
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return-void
.end method

.method public onInAppMessageReceived(Lcom/appboy/models/IInAppMessage;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 1

    .line 489
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->handler:Landroid/os/Handler;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 493
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getAPICommonHandlerCallback()Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 494
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getAPICommonHandlerCallback()Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayRequest()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/shopkick/app/fetchers/api/IAPICommonHandlerCallback;->finishedProcessing(Lcom/shopkick/app/fetchers/api/IAPIObject;)V

    .line 496
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 497
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 498
    iput-object p2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    .line 499
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 4

    .line 481
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->autoDismissDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->autoDismissDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;

    invoke-direct {v1, p0, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager$AutoDismissRunnable;-><init>(Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/overlays/base/SKOverlay;)V

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->autoDismissDuration:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onPrepareFailed(Lcom/shopkick/app/overlays/common/OverlaySpecState;)V
    .locals 1

    .line 471
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onPrepared()V
    .locals 0

    .line 466
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->showNextOverlay()V

    return-void
.end method

.method public removeOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 319
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->removeOverlaySpecStateForOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlaySpec()Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 322
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 324
    invoke-virtual {p1}, Lcom/shopkick/app/overlays/base/Overlay;->dismiss()V

    :cond_0
    return-void
.end method

.method public setIsAppboyOverlayPresent(Z)V
    .locals 0

    .line 668
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    return-void
.end method

.method public showNextOverlay()V
    .locals 5

    .line 193
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlayEnabled:Z

    if-nez v0, :cond_0

    return-void

    .line 197
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_1

    return-void

    .line 202
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->isAppboyOverlayPresent:Z

    if-eqz v0, :cond_2

    return-void

    .line 206
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 209
    instance-of v1, v0, Lcom/shopkick/app/activities/SplashActivity;

    if-nez v1, :cond_9

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 214
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 215
    iget-object v2, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 216
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->isReadyToShow()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 218
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayRequest()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v2

    if-lez v1, :cond_4

    if-eqz v2, :cond_4

    .line 219
    iget-object v3, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, -0x1

    .line 220
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    invoke-virtual {v3}, Lcom/shopkick/app/overlays/common/OverlaySpecState;->getOverlayRequest()Lcom/shopkick/app/fetchers/api/IAPIObject;

    move-result-object v3

    if-ne v2, v3, :cond_4

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_2
    if-gez v0, :cond_7

    return-void

    .line 234
    :cond_7
    iget-object v1, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->overlaySpecStates:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/common/OverlaySpecState;

    iput-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    .line 238
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->didGoToStoreDetailsScreen()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 241
    :cond_8
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->createAndShowTopOverlay()V

    return-void

    :cond_9
    :goto_3
    return-void
.end method

.method public showWalkinOverlayForStoreDetails()V
    .locals 1

    .line 568
    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentOverlayRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->currentSpecState:Lcom/shopkick/app/overlays/common/OverlaySpecState;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/base/OverlaysManager;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 569
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 572
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->createAndShowTopOverlay()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
