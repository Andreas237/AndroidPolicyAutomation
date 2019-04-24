.class public Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;
.super Ljava/lang/Object;
.source "OverlayActionConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;
    }
.end annotation


# instance fields
.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcherFactory;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/controllers/PhoneVerificationController;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 24
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 25
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 32
    iput-object p4, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 34
    iput-object p2, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 35
    iput-object p3, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method


# virtual methods
.method public setActionForButton(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Landroid/view/View;)V
    .locals 9

    if-nez p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 48
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 49
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/CloseActionHandler;

    invoke-direct {v0, p1}, Lcom/shopkick/app/overlays/clicklisteners/CloseActionHandler;-><init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 50
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_2

    .line 51
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->url:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/shopkick/app/overlays/clicklisteners/LaunchURLActionHandler;-><init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/application/AppActivityManager;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    .line 52
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_3

    .line 53
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v2, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-direct {v0, v1, p1, p2, v2}, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/account/UserAccount;)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    .line 54
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_4

    .line 55
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;

    iget-object v6, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v7, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v8, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;-><init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/controllers/PhoneVerificationController;)V

    goto :goto_0

    :cond_4
    const/4 v1, 0x5

    .line 60
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->type:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v1, v2, :cond_5

    .line 61
    new-instance v0, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;

    iget-object v1, p0, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->url:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/shopkick/app/overlays/clicklisteners/LaunchSKURLActionHandler;-><init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/url/URLDispatcherFactory;Ljava/lang/String;)V

    :cond_5
    :goto_0
    if-eqz v0, :cond_6

    .line 65
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    return-void
.end method
