.class public Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;
.super Ljava/lang/Object;
.source "VerifyPhoneActionHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/controllers/PhoneVerificationController;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 15
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 16
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 17
    iput-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    .line 27
    iput-object p3, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 28
    iput-object p4, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 29
    iput-object p5, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 34
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 39
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->action:Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlayButtonAction;->shouldRemainOpenAfterAction:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    .line 50
    iget-object p1, p0, Lcom/shopkick/app/overlays/clicklisteners/VerifyPhoneActionHandler;->processor:Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;

    invoke-interface {p1}, Lcom/shopkick/app/overlays/clicklisteners/OverlayActionConfigurator$IOverlayActionProcessor;->dismiss()V

    :cond_2
    return-void
.end method
