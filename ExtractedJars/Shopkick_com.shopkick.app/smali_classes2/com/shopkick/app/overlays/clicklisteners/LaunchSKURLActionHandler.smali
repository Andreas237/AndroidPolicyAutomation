.class public Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;
.super Ljava/lang/Object;
.source "LaunchSKURLActionHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

.field private processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field private urlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/url/URLDispatcherFactory;Ljava/lang/String;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 13
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlString:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 15
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 22
    iput-object p2, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 23
    iput-object p3, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 24
    iput-object p4, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlString:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 29
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->urlString:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 31
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 33
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;->dismiss()V

    :cond_0
    return-void
.end method
