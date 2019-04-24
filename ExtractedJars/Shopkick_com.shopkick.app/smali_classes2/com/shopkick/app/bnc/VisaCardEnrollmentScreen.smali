.class public Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "VisaCardEnrollmentScreen.java"

# interfaces
.implements Lcom/shopkick/app/webview/IWebViewStatusCallback;
.implements Lcom/shopkick/app/url/IURLDispatcherCallback;
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final CLOSE_STATUS_KEY:Ljava/lang/String; = "close_status"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

.field private listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

.field private listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

.field private loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

.field private loadingToastDismissed:Z

.field private receivedWebViewError:Z

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

.field private visaSuccessfullyEnrolled:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private hideLoadingToast()V
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToastDismissed:Z

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private setupVisaView()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollInVisaProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherVisaCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/webview/SKWebView;->setStatusCallback(Lcom/shopkick/app/webview/IWebViewStatusCallback;)V

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/webview/SKWebView;->setDispatcherCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->setVerticalScrollBarEnabled(Z)V

    .line 124
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    iget-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    invoke-static {v1}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->getVisaWebViewUrl(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->hideLoadingToast()V

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    const v1, 0x7f11008b

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->hideLoadingToast()V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    const v1, 0x7f110142

    invoke-virtual {p0, v1}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private showLoadingToast()V
    .locals 3

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0056

    const/4 v2, 0x0

    .line 105
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 106
    new-instance v1, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/content/DialogInterface$OnCancelListener;)V

    iput-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToast:Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/BuyAndCollectCustomDialog;->show()V

    return-void
.end method

.method private showSuccessScreen()V
    .locals 3

    .line 137
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-eqz v1, :cond_0

    const-string v2, "debit_card_url"

    .line 139
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->debitCardHelpWebviewUrl:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "num_previous_cards"

    .line 140
    iget-object v2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 141
    invoke-static {v2}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->numVisaCards(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 140
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "loyalty_program_id"

    const/16 v2, 0x8

    .line 144
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lcom/shopkick/app/util/TypeUtils;->toString(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v2

    .line 143
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    const-class v1, Lcom/shopkick/app/bnc/BCPostEnrollmentScreen;

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    .line 155
    iput-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz p2, :cond_0

    .line 156
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 157
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    iput-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->setupVisaView()V

    goto :goto_0

    .line 160
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->hideLoadingToast()V

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->getMessageForResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p1

    .line 162
    iget-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 73
    new-instance p1, Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/webview/SKWebView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    const p2, 0x7f0600c6

    invoke-virtual {p0, p2}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getResourceColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/webview/SKWebView;->setBackgroundColor(I)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1, p2, p3}, Lcom/shopkick/app/webview/SKWebView;->setup(Landroid/app/Activity;Lcom/shopkick/app/url/URLDispatcherFactory;)V

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    return-object p1
.end method

.method public handleLink(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string p2, "close"

    .line 192
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "close_status"

    .line 193
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 196
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaSuccessfullyEnrolled:Z

    if-nez p1, :cond_0

    .line 198
    iput-boolean p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaSuccessfullyEnrolled:Z

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setBuyAndCollectEnrolled(Z)V

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Lcom/shopkick/app/account/UserAccount;->setLoyaltyProgramEnrolled(I)Z

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 202
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->showSuccessScreen()V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 60
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 63
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 64
    new-instance p2, Lcom/shopkick/app/bnc/BCDialogsController;

    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    invoke-direct {p2, p0, v0, v1, p1}, Lcom/shopkick/app/bnc/BCDialogsController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/controllers/PhoneVerificationController;)V

    iput-object p2, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    .line 68
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 211
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 212
    invoke-virtual {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->popScreen()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->visaEnrollmentWebView:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {v0}, Lcom/shopkick/app/webview/SKWebView;->destroy()V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    if-eqz v0, :cond_0

    .line 83
    iget-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 85
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onPageClosed()V
    .locals 0

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 174
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->hideLoadingToast()V

    .line 175
    iget-boolean p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->receivedWebViewError:Z

    if-nez p1, :cond_0

    .line 176
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x1

    .line 182
    iput-boolean p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->receivedWebViewError:Z

    .line 183
    iget-object p1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    const p2, 0x7f110142

    invoke-virtual {p0, p2}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/bnc/BCDialogsController;->showAlertWithDialogDismissClickListener(Ljava/lang/String;)V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->bcDialogsController:Lcom/shopkick/app/bnc/BCDialogsController;

    invoke-virtual {v0}, Lcom/shopkick/app/bnc/BCDialogsController;->handlingRegistrationOrVerification()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 93
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->loadingToastDismissed:Z

    if-nez v0, :cond_1

    .line 94
    invoke-direct {p0}, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->showLoadingToast()V

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listResponse:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;

    if-nez v0, :cond_2

    .line 97
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    .line 98
    iget-object v0, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/bnc/VisaCardEnrollmentScreen;->listRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListRequestV4;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
