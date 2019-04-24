.class public Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "PayPalEnterEmailScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;


# static fields
.field private static final OverlayDismissedOk:Ljava/lang/String; = "ok"

.field private static final PERMITED_CHARACTERS_LIST:Ljava/lang/String; = "[A-Za-z0-9@!#$%&\'*+-/=?^_`.{|}~]"

.field private static final PayPalEnterEmailScreenParamsEmail:Ljava/lang/String; = "email"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private costInKicks:Ljava/lang/String;

.field private denominationId:Ljava/lang/String;

.field private emailsMatching:Z

.field private firstEmailValidated:Z

.field private inFirstEmailWasTyped:Z

.field private inSecondEmailWasTyped:Z

.field private final mainViewOnTouchListener:Landroid/view/View$OnTouchListener;

.field private final paypalConfirmEmailEditTextWatcher:Landroid/text/TextWatcher;

.field private final paypalConfirmEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

.field private paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private final paypalEmailEditTextWatcher:Landroid/text/TextWatcher;

.field private final paypalEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

.field private paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

.field private paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private final paypalOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

.field private paypalScrollView:Landroid/widget/ScrollView;

.field private paypalSpace:Landroid/widget/Space;

.field private paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

.field private final paypalSubmitButtonClickListener:Landroid/view/View$OnClickListener;

.field private final paypayKeyImeChange:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

.field private progressBar:Landroid/widget/ProgressBar;

.field private rewardId:Ljava/lang/String;

.field private toolbarDefaultTextSize:F

.field private userEmail:Ljava/lang/String;

.field private validateEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 99
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    .line 102
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inFirstEmailWasTyped:Z

    .line 104
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inSecondEmailWasTyped:Z

    .line 106
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->emailsMatching:Z

    .line 303
    new-instance v0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XatPGIkP1ReXtvUku2leJ1SNNi4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XatPGIkP1ReXtvUku2leJ1SNNi4;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 312
    new-instance v0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$uYwEHydPBKXygI7M5fuKXs9AIEc;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$uYwEHydPBKXygI7M5fuKXs9AIEc;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypayKeyImeChange:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

    .line 318
    new-instance v0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$wCYSFVA8TMI1araBY4H6D-7-_UM;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$wCYSFVA8TMI1araBY4H6D-7-_UM;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 332
    new-instance v0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    .line 347
    new-instance v0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$4;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailEditTextWatcher:Landroid/text/TextWatcher;

    .line 368
    new-instance v0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$5;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$5;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailEditTextWatcher:Landroid/text/TextWatcher;

    .line 387
    new-instance v0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$pJOzS9GBX7FUt3-x0L7cPw8WPuU;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$pJOzS9GBX7FUt3-x0L7cPw8WPuU;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButtonClickListener:Landroid/view/View$OnClickListener;

    .line 513
    new-instance v0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->mainViewOnTouchListener:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->scrollToSecondEmail()V

    return-void
.end method

.method static synthetic access$202(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)Z
    .locals 0

    .line 58
    iput-boolean p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inFirstEmailWasTyped:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/text/Editable;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkFirstEmailLocally(Landroid/text/Editable;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->onSecondEmailAfterTextChanged()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->hideOrShowSubmitButton(Z)V

    return-void
.end method

.method private checkEmail()V
    .locals 3

    .line 616
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 620
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 622
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmail(Landroid/text/Editable;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 624
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 626
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 628
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;

    .line 630
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;->email:Ljava/lang/String;

    .line 631
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->userEmail:Ljava/lang/String;

    .line 633
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method private checkEmailMatching()V
    .locals 2

    .line 407
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    if-eqz v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    .line 411
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 415
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 417
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    const v1, 0x7f080221

    .line 423
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupConfirmEmailLayout(Ljava/lang/String;I)V

    const/4 v0, 0x1

    .line 424
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->emailsMatching:Z

    goto :goto_0

    :cond_0
    const v0, 0x7f11047e

    .line 429
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupConfirmEmailLayout(Ljava/lang/String;I)V

    .line 430
    iput-boolean v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->emailsMatching:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private checkFirstEmailLocally(Landroid/text/Editable;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 645
    invoke-virtual {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmail(Landroid/text/Editable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 647
    iput-boolean p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    const-string p1, ""

    const v0, 0x7f080221

    .line 651
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    .line 653
    iget-boolean p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inSecondEmailWasTyped:Z

    if-eqz p1, :cond_2

    .line 655
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkEmailMatching()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 659
    iput-boolean p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    const-string v0, ""

    .line 661
    iget-boolean v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inSecondEmailWasTyped:Z

    if-eqz v1, :cond_1

    const v0, 0x7f11047f

    .line 662
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 667
    :cond_1
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    .line 669
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, ""

    .line 670
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupConfirmEmailLayout(Ljava/lang/String;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private firstEmailIsEmpty()Z
    .locals 1

    .line 573
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 575
    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private getSpaceInputFilter()Landroid/text/InputFilter;
    .locals 1

    .line 784
    new-instance v0, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XgYhB74_MGBVfzasbhhyp5gFIsM;

    invoke-direct {v0, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$XgYhB74_MGBVfzasbhhyp5gFIsM;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    return-object v0
.end method

.method private hideOrShowSubmitButton(Z)V
    .locals 4

    .line 598
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 599
    new-instance v1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$7swOI25ZmZd23OUPN60cggB_2gU;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private initKeyboardBellowEditTexts()V
    .locals 4

    .line 590
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 591
    new-instance v1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$CX1nkFhyLPtzzqdWQQRSuSsRRPU;

    invoke-direct {v1, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$CX1nkFhyLPtzzqdWQQRSuSsRRPU;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private isAllowedCharacter(C)Z
    .locals 1

    .line 795
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    const-string v0, "[A-Za-z0-9@!#$%&\'*+-/=?^_`.{|}~]"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public static synthetic lambda$createScreen$169(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/view/View;)V
    .locals 1

    .line 218
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCursorVisible(Z)V

    .line 222
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->scrollToSecondEmail()V

    return-void
.end method

.method static synthetic lambda$createScreen$170(Landroid/view/View;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic lambda$createScreen$171(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/view/View;)V
    .locals 1

    .line 247
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 249
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCursorVisible(Z)V

    .line 251
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->scrollToSecondEmail()V

    return-void
.end method

.method public static synthetic lambda$getSpaceInputFilter$179(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 0

    :goto_0
    if-ge p2, p3, :cond_2

    .line 786
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    invoke-static {p4}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result p4

    if-nez p4, :cond_1

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p4

    invoke-direct {p0, p4}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->isAllowedCharacter(C)Z

    move-result p4

    if-nez p4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, ""

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic lambda$hideOrShowSubmitButton$178(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V
    .locals 2

    .line 600
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->emailsMatching:Z

    if-eqz v0, :cond_0

    .line 601
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    if-eqz p1, :cond_1

    .line 603
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkEmail()V

    goto :goto_0

    .line 606
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic lambda$initKeyboardBellowEditTexts$177(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 1

    .line 591
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->performClick()Z

    return-void
.end method

.method public static synthetic lambda$new$172(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 304
    iget-boolean p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->emailsMatching:Z

    if-eqz p1, :cond_0

    .line 305
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->hideKeyboard()V

    const/4 p1, 0x1

    .line 306
    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->hideOrShowSubmitButton(Z)V

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic lambda$new$173(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;ILandroid/view/KeyEvent;)V
    .locals 0

    .line 313
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 p2, 0x4

    if-ne p2, p1, :cond_0

    const/4 p1, 0x0

    .line 314
    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->hideOrShowSubmitButton(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$new$174(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 322
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->onFirstEmailReceiveFocus()V

    .line 324
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    goto :goto_0

    .line 327
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->onFirstEmailReleaseFocus()V

    :goto_0
    return-void
.end method

.method public static synthetic lambda$new$175(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Landroid/view/View;)V
    .locals 0

    .line 387
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkEmail()V

    return-void
.end method

.method public static synthetic lambda$scrollToSecondEmail$176(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 3

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalScrollView:Landroid/widget/ScrollView;

    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSpace:Landroid/widget/Space;

    invoke-virtual {v1}, Landroid/widget/Space;->getBottom()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    return-void
.end method

.method private onFirstEmailReceiveFocus()V
    .locals 3

    .line 695
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 698
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    if-eqz v0, :cond_0

    const v0, 0x7f080221

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, ""

    .line 703
    iget-boolean v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inFirstEmailWasTyped:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    if-nez v2, :cond_1

    const v1, 0x7f11047f

    .line 704
    invoke-virtual {p0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 707
    :cond_1
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    return-void
.end method

.method private onFirstEmailReleaseFocus()V
    .locals 2

    .line 715
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inFirstEmailWasTyped:Z

    if-eqz v0, :cond_1

    .line 717
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 721
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 725
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmail(Landroid/text/Editable;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 727
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    const-string v0, ""

    const v1, 0x7f080221

    .line 731
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    .line 733
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inSecondEmailWasTyped:Z

    if-eqz v0, :cond_1

    .line 735
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkEmailMatching()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 739
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    const v1, 0x7f11047f

    .line 743
    invoke-virtual {p0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private onSecondEmailAfterTextChanged()V
    .locals 2

    const/4 v0, 0x1

    .line 681
    iput-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inSecondEmailWasTyped:Z

    .line 683
    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->inFirstEmailWasTyped:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailValidated:Z

    if-eqz v0, :cond_0

    .line 685
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->checkEmailMatching()V

    goto :goto_0

    .line 686
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->firstEmailIsEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f11047f

    .line 687
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setupEmailLayout(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private scrollToSecondEmail()V
    .locals 2

    .line 586
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalScrollView:Landroid/widget/ScrollView;

    new-instance v1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$F3GHsf9O4Psrk9dDtr51aI1zsL4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$F3GHsf9O4Psrk9dDtr51aI1zsL4;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private setDenominationAmountInDollars(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "$%s"

    const/4 v1, 0x1

    .line 751
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private setupConfirmEmailLayout(Ljava/lang/String;I)V
    .locals 1

    .line 452
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 454
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 456
    invoke-virtual {p1, v0, v0, p2, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    :cond_0
    return-void
.end method

.method private setupEmailLayout(Ljava/lang/String;I)V
    .locals 1

    .line 440
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 442
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 444
    invoke-virtual {p1, v0, v0, p2, v0}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    :cond_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 473
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->progressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 475
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const v3, 0x7f11047a

    const v4, 0x7f11047b

    if-eqz p1, :cond_1

    .line 477
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressResponse;

    .line 479
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    .line 480
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    .line 481
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->userEmail:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userEmail:Ljava/lang/String;

    .line 482
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->denominationId:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->denominationId:Ljava/lang/String;

    .line 483
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->rewardId:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rewardId:Ljava/lang/String;

    .line 484
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->costInKicks:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->costInKicks:Ljava/lang/Integer;

    .line 485
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object p2

    const-class v0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 486
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p2

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    goto :goto_0

    .line 489
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->denominationId:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setDenominationAmountInDollars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 490
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 491
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 492
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 493
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->userEmail:Ljava/lang/String;

    aput-object p1, v2, v0

    invoke-virtual {v5, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 491
    invoke-virtual {p2, v4, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 499
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->denominationId:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setDenominationAmountInDollars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 500
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 501
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 502
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 503
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getContext()Landroid/content/Context;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->userEmail:Ljava/lang/String;

    aput-object p1, v2, v0

    invoke-virtual {v5, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 501
    invoke-virtual {p2, v4, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 508
    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->validateEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateEmailAddressRequest;

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c014f

    .line 136
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f110483

    .line 139
    invoke-virtual {p0, p2}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const p2, 0x7f080233

    .line 142
    invoke-virtual {p0, p2}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setHomeAsUpIndicator(I)V

    const p2, 0x7f090517

    .line 144
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ScrollView;

    iput-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalScrollView:Landroid/widget/ScrollView;

    const p2, 0x7f090518

    .line 145
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Space;

    iput-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSpace:Landroid/widget/Space;

    .line 147
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTextSize()F

    move-result p2

    iput p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->toolbarDefaultTextSize:F

    .line 150
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    const-string v0, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {p2, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2

    const v0, 0x7f09051a

    .line 153
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 154
    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 155
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getSpaceInputFilter()Landroid/text/InputFilter;

    move-result-object v0

    const v1, 0x7f090514

    .line 158
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/design/widget/TextInputLayout;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f090513

    .line 160
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    .line 161
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    new-instance v2, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$1;

    invoke-direct {v2, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$1;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 176
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 177
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    const v1, 0x7f090512

    .line 180
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/design/widget/TextInputLayout;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f090511

    .line 182
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    .line 185
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    new-instance v2, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$2;

    invoke-direct {v2, p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$2;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 198
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 199
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    const v1, 0x7f090519

    .line 202
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f090434

    .line 206
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 209
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 210
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypayKeyImeChange:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setKeyImeChangeListener(Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;)V

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 214
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailEditTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 216
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    new-instance v2, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$dEc9c7PbyQZCmP1wYoVc7rn857A;

    invoke-direct {v2, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$dEc9c7PbyQZCmP1wYoVc7rn857A;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 226
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    .line 227
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    sget-object v2, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$E1NL-NVbwcSMwpJJHC3zPHY5M7c;->INSTANCE:Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$E1NL-NVbwcSMwpJJHC3zPHY5M7c;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v1, p2}, Landroid/support/design/widget/TextInputLayout;->setTypeface(Landroid/graphics/Typeface;)V

    .line 231
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->requestFocus()Z

    .line 234
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    const/4 v2, 0x1

    new-array v3, v2, [Landroid/text/InputFilter;

    aput-object v0, v3, p3

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 236
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->showKeyboard()V

    .line 238
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 239
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypayKeyImeChange:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setKeyImeChangeListener(Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;)V

    .line 241
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailOnFocusChangeListener:Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 243
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    iget-object v3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailEditTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 245
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    new-instance v3, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$gAjGu7nMGQHKKPImlFV0AQnLSiA;

    invoke-direct {v3, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalEnterEmailScreen$gAjGu7nMGQHKKPImlFV0AQnLSiA;-><init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    invoke-virtual {v1, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setLongClickable(Z)V

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTextIsSelectable(Z)V

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v1, p2}, Landroid/support/design/widget/TextInputLayout;->setTypeface(Landroid/graphics/Typeface;)V

    .line 259
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 260
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalConfirmEmailTextInputEditText:Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    new-array v1, v2, [Landroid/text/InputFilter;

    aput-object v0, v1, p3

    invoke-virtual {p2, v1}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 262
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->paypalSubmitButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090515

    .line 265
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/paypal/PayPalLinearLayout;

    .line 267
    iget-object p3, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->mainViewOnTouchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/paypal/PayPalLinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 271
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->mainViewOnTouchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-object p1
.end method

.method protected getLocationOnScreen(Landroid/widget/EditText;)Landroid/graphics/Rect;
    .locals 5

    .line 552
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x2

    .line 554
    new-array v1, v1, [I

    .line 557
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    .line 560
    aget v3, v1, v2

    iput v3, v0, Landroid/graphics/Rect;->left:I

    const/4 v3, 0x1

    .line 561
    aget v4, v1, v3

    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 562
    aget v2, v1, v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getWidth()I

    move-result v4

    add-int/2addr v2, v4

    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 563
    aget v1, v1, v3

    invoke-virtual {p1}, Landroid/widget/EditText;->getHeight()I

    move-result p1

    add-int/2addr v1, p1

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    return-object v0
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

    if-eqz p2, :cond_0

    const-string v0, "reward_id"

    .line 115
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->rewardId:Ljava/lang/String;

    const-string v0, "denomination_id"

    .line 116
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->denominationId:Ljava/lang/String;

    const-string v0, "quantity"

    .line 117
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->costInKicks:Ljava/lang/String;

    :cond_0
    if-eqz p1, :cond_1

    .line 122
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 125
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 297
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->setHomeAsUpIndicator(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    throw v0
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 768
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardDeptName:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 769
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardDeptName:Ljava/lang/String;

    const-string p2, "ok"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 770
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "denomination_id"

    .line 771
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->denominationId:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "email"

    .line 772
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->userEmail:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    const-class p2, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;

    invoke-virtual {p0, p2, p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    return-void
.end method

.method public onPause()V
    .locals 3

    .line 285
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 286
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->initKeyboardBellowEditTexts()V

    .line 287
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->toolbarDefaultTextSize:F

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 278
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 279
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->initKeyboardBellowEditTexts()V

    .line 280
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method protected validateEmail(Landroid/text/Editable;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 396
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 398
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Lcom/shopkick/app/validators/EmailValidator;->isValid(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :cond_1
    return v0
.end method
