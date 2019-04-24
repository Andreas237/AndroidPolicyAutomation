.class Lcom/shopkick/app/browse/BrowseScreen$2;
.super Ljava/util/TimerTask;
.source "BrowseScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/browse/BrowseScreen;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/os/Handler;)V
    .locals 0

    .line 971
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$46(Lcom/shopkick/app/browse/BrowseScreen$2;)V
    .locals 4

    .line 975
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    .line 976
    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->isActiveScreen()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 978
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 980
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->getSkOverlay()Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 982
    instance-of v0, v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 988
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 989
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v2

    const-class v3, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 990
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    .line 991
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 974
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$2;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$2$iKXuUndTqDhLIxXav7zMeADoO38;

    invoke-direct {v1, p0}, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$2$iKXuUndTqDhLIxXav7zMeADoO38;-><init>(Lcom/shopkick/app/browse/BrowseScreen$2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
