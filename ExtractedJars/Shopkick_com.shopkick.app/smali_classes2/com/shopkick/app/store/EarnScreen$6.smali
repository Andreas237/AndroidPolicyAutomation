.class Lcom/shopkick/app/store/EarnScreen$6;
.super Ljava/util/TimerTask;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->startFTUELesson3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/EarnScreen;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/EarnScreen;Landroid/os/Handler;)V
    .locals 0

    .line 1445
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen$6;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$232(Lcom/shopkick/app/store/EarnScreen$6;)V
    .locals 3

    .line 1449
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/store/EarnScreen;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    .line 1450
    invoke-virtual {v0}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->isActiveScreen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1451
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 1452
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay1;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 1453
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    .line 1454
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    .line 1455
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$1600(Lcom/shopkick/app/store/EarnScreen;)V

    .line 1456
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$6;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$1700(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonShouldDisplayJeanOnEarnTab(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1448
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$6;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$6$AOhppeITevbmWEPs0h9a94tL9N8;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$6$AOhppeITevbmWEPs0h9a94tL9N8;-><init>(Lcom/shopkick/app/store/EarnScreen$6;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
