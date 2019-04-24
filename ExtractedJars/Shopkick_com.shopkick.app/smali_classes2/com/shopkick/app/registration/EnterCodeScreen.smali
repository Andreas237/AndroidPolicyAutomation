.class public Lcom/shopkick/app/registration/EnterCodeScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "EnterCodeScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;


# static fields
.field private static final AUTOMATED_CALL_ME_INDEX:I = 0x1

.field private static final CANCEL_INDEX:I = 0x2

.field public static final ENTERED_CODE:Ljava/lang/Object;

.field private static final SMS_ME_INDEX:I


# instance fields
.field acct:Lcom/shopkick/app/account/UserAccount;

.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field clickListener:Landroid/view/View$OnClickListener;

.field code:Ljava/lang/String;

.field codeText:Lcom/shopkick/app/widget/SKEditText;

.field dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

.field haventReceivedSMSButton:Lcom/shopkick/app/widget/SKButton;

.field helpButton:Landroid/widget/TextView;

.field nextButton:Lcom/shopkick/app/widget/SKButton;

.field private noConsentText:Landroid/widget/TextView;

.field private noThanksButton:Lcom/shopkick/app/widget/SKButton;

.field notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private optInButon:Lcom/shopkick/app/widget/SKButton;

.field private optInView:Landroid/widget/LinearLayout;

.field phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

.field progressDialog:Landroid/app/ProgressDialog;

.field resendCodeDialog:Landroid/app/AlertDialog;

.field resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

.field skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

.field verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "entered_code"

    .line 53
    sput-object v0, Lcom/shopkick/app/registration/EnterCodeScreen;->ENTERED_CODE:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 171
    new-instance v0, Lcom/shopkick/app/registration/EnterCodeScreen$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/EnterCodeScreen$2;-><init>(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    .line 214
    new-instance v0, Lcom/shopkick/app/registration/EnterCodeScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/EnterCodeScreen$3;-><init>(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->dialogClickListener:Landroid/content/DialogInterface$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/EnterCodeScreen;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->maybeVerifyCode()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/account/UserAccount;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/registration/EnterCodeScreen;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->resendSMS()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInButon:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/registration/EnterCodeScreen;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribe()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/registration/EnterCodeScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noThanksButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/registration/EnterCodeScreen;)Landroid/widget/LinearLayout;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInView:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/registration/EnterCodeScreen;)Landroid/widget/TextView;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noConsentText:Landroid/widget/TextView;

    return-object p0
.end method

.method private formIsValid()Z
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private maybeVerifyCode()V
    .locals 1

    .line 286
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->formIsValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 287
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyCode()V

    :cond_0
    return-void
.end method

.method private resendSMS()V
    .locals 5

    .line 253
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 254
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 258
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f110753

    .line 260
    invoke-virtual {p0, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 258
    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    if-eqz v0, :cond_0

    .line 267
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 269
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private resubscribe()V
    .locals 3

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    if-nez v0, :cond_0

    .line 275
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f1101b5

    invoke-virtual {p0, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 276
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method private toggleNextButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 383
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080091

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 385
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080093

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method

.method private verifyCode()V
    .locals 5

    .line 293
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f1102b2

    .line 295
    invoke-virtual {p0, v2}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 293
    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 298
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    if-eqz v0, :cond_0

    .line 302
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 304
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;->verificationCode:Ljava/lang/String;

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 394
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->formIsValid()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->toggleNextButton(Z)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 9

    .line 325
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 328
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 329
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;

    .line 330
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eqz p2, :cond_1

    .line 331
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 334
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 336
    :cond_1
    :goto_0
    iput-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    goto/16 :goto_3

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    if-ne p1, v0, :cond_6

    .line 338
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_4

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_4

    .line 339
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallResponse;

    .line 341
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_3

    .line 342
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInView:Landroid/widget/LinearLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 343
    :cond_3
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eqz p2, :cond_5

    .line 344
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_1

    .line 347
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 349
    :cond_5
    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    goto/16 :goto_3

    .line 350
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    if-ne p1, v0, :cond_9

    .line 351
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_8

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_8

    .line 352
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationResponse;

    .line 354
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_7

    .line 355
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->acct:Lcom/shopkick/app/account/UserAccount;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setPhoneVerified(Z)V

    .line 356
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->acct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 357
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 359
    :cond_7
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->showKeyboard()V

    .line 360
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_2

    .line 363
    :cond_8
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 365
    :goto_2
    iput-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    goto :goto_3

    .line 366
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    if-ne p1, v0, :cond_b

    .line 367
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_a

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_a

    .line 368
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 369
    iget-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInView:Landroid/widget/LinearLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 370
    iget-object v2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v3, 0x1

    const-string v4, ""

    const p1, 0x7f1102ae

    .line 372
    invoke-virtual {p0, p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f11014f

    .line 373
    invoke-virtual {p0, p1}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/registration/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/registration/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v8, 0x0

    .line 370
    invoke-virtual/range {v2 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 377
    :cond_a
    iput-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->resubscribePhoneCallsRequest:Lcom/shopkick/app/fetchers/api/skapi/ResubscribePhoneCallsRequest;

    :cond_b
    :goto_3
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f110757

    .line 100
    invoke-virtual {p0, p3}, Lcom/shopkick/app/registration/EnterCodeScreen;->setAppScreenTitle(I)V

    const p3, 0x7f0c00b0

    const/4 v0, 0x0

    .line 101
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f09024f

    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    const/4 p3, 0x4

    .line 104
    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 106
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->acct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    const v0, 0x7f09024d

    .line 108
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 109
    invoke-virtual {v0, p3}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 110
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 111
    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 110
    invoke-static {p2, v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFromNetworkFormattedForDisplay(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 112
    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p2, v1}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberUtils;->formatNumber(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    .line 113
    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_0
    const p2, 0x7f09024c

    .line 116
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 117
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09024e

    .line 119
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKEditText;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    .line 120
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(I)Z

    .line 121
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    new-instance p3, Lcom/shopkick/app/registration/EnterCodeScreen$1;

    invoke-direct {p3, p0}, Lcom/shopkick/app/registration/EnterCodeScreen$1;-><init>(Lcom/shopkick/app/registration/EnterCodeScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 131
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->code:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f09024b

    .line 133
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->haventReceivedSMSButton:Lcom/shopkick/app/widget/SKButton;

    .line 134
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->haventReceivedSMSButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0902dd

    .line 135
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->helpButton:Landroid/widget/TextView;

    .line 137
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 p3, 0x3a

    if-ne p2, p3, :cond_1

    const p2, 0x7f0902df

    .line 138
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f1102a6

    invoke-virtual {p0, p3}, Lcom/shopkick/app/registration/EnterCodeScreen;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->helpButton:Landroid/widget/TextView;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 141
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->helpButton:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    const p2, 0x7f0904e2

    .line 144
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInView:Landroid/widget/LinearLayout;

    const p2, 0x7f0904e1

    .line 146
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInButon:Lcom/shopkick/app/widget/SKButton;

    .line 147
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInButon:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0904b0

    .line 149
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noThanksButton:Lcom/shopkick/app/widget/SKButton;

    .line 150
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noThanksButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0904ad

    .line 152
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noConsentText:Landroid/widget/TextView;

    .line 153
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->noConsentText:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    iget-object p2, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->code:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyCode()V

    :cond_2
    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 86
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 87
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 88
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->acct:Lcom/shopkick/app/account/UserAccount;

    .line 89
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 90
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    iput-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    .line 91
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    if-eqz p2, :cond_0

    .line 94
    sget-object p1, Lcom/shopkick/app/registration/EnterCodeScreen;->ENTERED_CODE:Ljava/lang/Object;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->code:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->validateCodeReq:Lcom/shopkick/app/fetchers/api/skapi/UserValidatePhoneVerificationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->verifyPhoneReq:Lcom/shopkick/app/fetchers/api/skapi/UserSendPhoneVerificationRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->phoneCallReq:Lcom/shopkick/app/fetchers/api/skapi/UserPlacePhoneVerificationCallRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 168
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->optInView:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/registration/EnterCodeScreen;->codeText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 313
    invoke-virtual {p0}, Lcom/shopkick/app/registration/EnterCodeScreen;->showKeyboard()V

    .line 315
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
