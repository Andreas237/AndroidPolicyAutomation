.class public Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RedeemedRewardEmailConfirmationScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;,
        Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CloseButtonClick;,
        Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;,
        Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;
    }
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private checkbox:Landroid/view/View;

.field private closeButton:Landroid/view/View;

.field private denominationId:Ljava/lang/String;

.field private emailField:Landroid/widget/EditText;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private redeemRequestInFlight:Z

.field private redeemRewardButton:Landroid/widget/TextView;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private rewardId:Ljava/lang/String;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemReward()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->clearEmailField()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->hideClearEmailButton()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->showClearEmailButton()V

    return-void
.end method

.method private clearEmailField()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private handleRedemptionFailure(Ljava/lang/String;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    const/4 p1, 0x0

    .line 130
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemRequestInFlight:Z

    return-void
.end method

.method private handleRedemptionSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 118
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "reward_id"

    .line 119
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->rewardId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "reward_image_url"

    .line 120
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo p1, "share_url"

    .line 121
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "reward_details_url"

    .line 122
    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    const-class p1, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private hideClearEmailButton()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->closeButton:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private redeemReward()V
    .locals 5

    .line 94
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemRequestInFlight:Z

    if-eqz v0, :cond_0

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->checkbox:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110575

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/validators/EmailValidator;->isValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110576

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemRequestInFlight:Z

    .line 104
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->progressDialog:Landroid/app/ProgressDialog;

    if-nez v1, :cond_3

    .line 105
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f11019e

    .line 107
    invoke-virtual {p0, v3}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 105
    invoke-static {v1, v2, v3, v0, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->progressDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 113
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->rewardId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->denominationId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->redeemEmailedReward(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private showClearEmailButton()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->closeButton:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c0188

    .line 59
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f110578

    .line 60
    invoke-virtual {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->setAppScreenTitle(I)V

    .line 61
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 62
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const p2, 0x7f090112

    .line 63
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->closeButton:Landroid/view/View;

    .line 64
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->closeButton:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CloseButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CloseButtonClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090239

    .line 65
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    .line 66
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    const v0, 0x7f11017b

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 68
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 69
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->emailField:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p2, 0x7f0907a0

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->checkbox:Landroid/view/View;

    const p2, 0x7f0907a1

    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->checkbox:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$CheckboxClick;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09059c

    .line 73
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemRewardButton:Landroid/widget/TextView;

    .line 74
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemRewardButton:Landroid/widget/TextView;

    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$RedeemRewardClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0907a3

    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const v0, 0x7f11019d

    .line 76
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 77
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 78
    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1, v2, p3, v0, p3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 79
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    new-instance p3, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {p3, v0, v1, v2}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;-><init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    const-string v0, "reward_id"

    .line 49
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->rewardId:Ljava/lang/String;

    const-string v0, "denomination_id"

    .line 50
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->denominationId:Ljava/lang/String;

    .line 51
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 52
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 53
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 90
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT"

    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "reward_image_url"

    .line 150
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string/jumbo v0, "share_url"

    .line 151
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "reward_details_url"

    .line 153
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 154
    invoke-direct {p0, p1, v0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->handleRedemptionSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "REWARD_ERROR_MESSAGE"

    .line 156
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 157
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->handleRedemptionFailure(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
