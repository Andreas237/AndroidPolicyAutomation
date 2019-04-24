.class public Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;
.super Ljava/lang/Object;
.source "RegisterActionHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/account/UserAccount;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 19
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 20
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 21
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 27
    iput-object p2, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 28
    iput-object p3, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 30
    iput-object p4, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 36
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "LaunchPhoneVerificationPostRegistration"

    const/4 v2, 0x1

    .line 40
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/RegisterActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;->dismiss()V

    :cond_1
    return-void
.end method
