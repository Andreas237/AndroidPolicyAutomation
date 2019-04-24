.class Lcom/shopkick/app/store/EarnScreen$7;
.super Ljava/util/TimerTask;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->closeDiscoveryLesson()V
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

    .line 1603
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$7;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen$7;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$233(Lcom/shopkick/app/store/EarnScreen$7;)V
    .locals 2

    .line 1607
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1609
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->getSkOverlay()Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1611
    instance-of v0, v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    if-eqz v0, :cond_0

    .line 1612
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen$7;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->clearTopOverlay(Lcom/shopkick/app/activities/BaseActivity;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1606
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$7;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$7$qADXz_MpR1P-1hrYMmz3grKNIoQ;

    invoke-direct {v1, p0}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$7$qADXz_MpR1P-1hrYMmz3grKNIoQ;-><init>(Lcom/shopkick/app/store/EarnScreen$7;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
