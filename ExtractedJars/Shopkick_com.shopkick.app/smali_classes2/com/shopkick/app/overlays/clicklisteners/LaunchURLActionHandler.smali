.class public Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;
.super Ljava/lang/Object;
.source "LaunchURLActionHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

.field private urlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/application/AppActivityManager;Ljava/lang/String;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 17
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 19
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->urlString:Ljava/lang/String;

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 27
    iput-object p3, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 28
    iput-object p4, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->urlString:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 33
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->urlString:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    .line 42
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 43
    iget-object v1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->urlString:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 46
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 48
    :catch_0
    const-class p1, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find activity to handle url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->urlString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;->dismiss()V

    :cond_2
    return-void
.end method
