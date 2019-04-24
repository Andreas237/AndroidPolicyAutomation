.class public Lcom/shopkick/app/registration/VerifyPhoneScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "VerifyPhoneScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field buttonTapped:Z

.field private callMeClickListener:Landroid/content/DialogInterface$OnClickListener;

.field callMeDialog:Landroid/app/AlertDialog;

.field private callMeDialogDimissListener:Landroid/content/DialogInterface$OnDismissListener;

.field clickListener:Landroid/view/View$OnClickListener;

.field clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

.field disclaimerClickHere:Landroid/widget/TextView;

.field errorDialog:Landroid/app/AlertDialog;

.field haveCodeLink:Landroid/widget/TextView;

.field logger:Lcom/shopkick/app/application/SKLogger;

.field mainView:Landroid/view/View;

.field notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

.field progressDialog:Landroid/app/ProgressDialog;

.field userAccount:Lcom/shopkick/app/account/UserAccount;

.field verifyButton:Lcom/shopkick/app/widget/SKButton;

.field verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    .line 170
    new-instance v0, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen$1;-><init>(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    .line 250
    new-instance v0, Lcom/shopkick/app/registration/VerifyPhoneScreen$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen$2;-><init>(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeClickListener:Landroid/content/DialogInterface$OnClickListener;

    .line 257
    new-instance v0, Lcom/shopkick/app/registration/VerifyPhoneScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen$3;-><init>(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialogDimissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/VerifyPhoneScreen;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userTappedSmsOption()V

    return-void
.end method

.method private setupLegalText()V
    .locals 3

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090219

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 146
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const v2, 0x7f090218

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->disclaimerClickHere:Landroid/widget/TextView;

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->disclaimerClickHere:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 150
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->disclaimerClickHere:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 155
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_1

    .line 156
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const v1, 0x7f09021a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f11074e

    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method private setupVerificationDialogOptions()V
    .locals 4

    .line 242
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f110750

    .line 243
    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const/4 v2, 0x0

    .line 244
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeClickListener:Landroid/content/DialogInterface$OnClickListener;

    const v3, 0x7f11074f

    .line 245
    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 246
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialog:Landroid/app/AlertDialog;

    .line 247
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialog:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->callMeDialogDimissListener:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method private showErrorDialog(Ljava/lang/String;)V
    .locals 3

    .line 232
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 233
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v1, 0x7f11014f

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 234
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->errorDialog:Landroid/app/AlertDialog;

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->errorDialog:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method private updatePhoneNumber()V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 162
    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 161
    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFromNetworkFormattedForDisplay(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberUtils;->formatNumber(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "(\\d{1})(\\d{3})(\\d{3})(\\d+)"

    const-string v2, "$1 ($2) $3-$4"

    .line 166
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method private userTappedSmsOption()V
    .locals 5

    .line 265
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 268
    invoke-virtual {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f110753

    .line 270
    invoke-virtual {p0, v2}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 268
    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 273
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_4

    .line 202
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 203
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;

    .line 204
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setVerificationSMSSent(Z)V

    .line 206
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 207
    const-class p1, Lcom/shopkick/app/registration/EnterCodeScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->setRootScreenForCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 209
    :cond_0
    iget-boolean p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    if-eqz p2, :cond_1

    .line 210
    iput-boolean v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    .line 212
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p2}, Landroid/app/ProgressDialog;->dismiss()V

    .line 213
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;->errorMsg:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->showErrorDialog(Ljava/lang/String;)V

    goto :goto_0

    .line 216
    :cond_2
    iget-boolean p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    if-eqz p1, :cond_3

    .line 217
    iput-boolean v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    .line 219
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 222
    :goto_0
    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    .line 225
    :cond_4
    iget-boolean p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    if-eqz p1, :cond_5

    .line 226
    iput-boolean v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    .line 228
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f110757

    .line 83
    invoke-virtual {p0, p3}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->setAppScreenTitle(I)V

    const p3, 0x7f0c01e4

    const/4 v0, 0x0

    .line 84
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const p2, 0x7f0907f6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    const/4 p2, 0x4

    .line 87
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const p3, 0x7f0907f7

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 89
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const p3, 0x7f0907f5

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyButton:Lcom/shopkick/app/widget/SKButton;

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const p3, 0x7f0907f3

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->phoneNumButton:Lcom/shopkick/app/widget/SKTextView;

    iget-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    const p2, 0x7f0907f4

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->haveCodeLink:Landroid/widget/TextView;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->haveCodeLink:Landroid/widget/TextView;

    const p2, 0x7f11074c

    invoke-virtual {p0, p2}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    sget-object p3, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->haveCodeLink:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-direct {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->setupLegalText()V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->onStartSession(Landroid/content/Context;)V

    .line 110
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "ScreenName"

    const-string p3, "VerifyPhone"

    .line 111
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    const-string p3, "Registration|ScreenViewed"

    invoke-virtual {p2, p3, p1}, Lcom/shopkick/app/application/SKLogger;->onEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 114
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->onEndSession(Landroid/content/Context;)V

    .line 116
    invoke-direct {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->setupVerificationDialogOptions()V

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    .line 71
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 72
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 73
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 74
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 75
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    .line 76
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 77
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iput-object p2, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 78
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "VerifyPhoneCompleteEvent"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 134
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    if-eqz v0, :cond_0

    .line 124
    iget-object v1, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 126
    iput-object v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    .line 127
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    const/4 v0, 0x0

    .line 139
    iput-boolean v0, p0, Lcom/shopkick/app/registration/VerifyPhoneScreen;->buttonTapped:Z

    .line 140
    invoke-direct {p0}, Lcom/shopkick/app/registration/VerifyPhoneScreen;->updatePhoneNumber()V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
