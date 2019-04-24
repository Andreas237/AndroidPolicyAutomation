.class Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;
.super Ljava/util/TimerTask;
.source "InvitePromoCodeScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/invite/InvitePromoCodeScreen;->closeDiscoveryLesson()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen;Landroid/os/Handler;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    iput-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$111(Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;)V
    .locals 2

    .line 343
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getCurrentOverlay()Lcom/shopkick/app/overlays/base/Overlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 345
    invoke-virtual {v0}, Lcom/shopkick/app/overlays/base/Overlay;->getSkOverlay()Lcom/shopkick/app/overlays/base/SKOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 347
    instance-of v0, v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;

    if-eqz v0, :cond_0

    .line 348
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;->this$0:Lcom/shopkick/app/invite/InvitePromoCodeScreen;

    invoke-virtual {v1}, Lcom/shopkick/app/invite/InvitePromoCodeScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->clearTopOverlay(Lcom/shopkick/app/activities/BaseActivity;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 342
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/invite/-$$Lambda$InvitePromoCodeScreen$4$NtJR1Ddjx8gwlBERKd-avSs5F8k;

    invoke-direct {v1, p0}, Lcom/shopkick/app/invite/-$$Lambda$InvitePromoCodeScreen$4$NtJR1Ddjx8gwlBERKd-avSs5F8k;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeScreen$4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
