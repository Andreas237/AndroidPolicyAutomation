.class public Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TermsOfServiceConfirmationScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;,
        Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;
    }
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private crashlyticsPermissionCheckbox:Landroid/view/View;

.field private firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private promotionalEmailCheckbox:Landroid/view/View;

.field private tosCheckbox:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->nextButtonClicked()V

    return-void
.end method

.method private logNextButtonClick()V
    .locals 3

    .line 95
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 96
    iget-object v1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private nextButtonClicked()V
    .locals 4

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->tosCheckbox:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f1104ce

    invoke-virtual {p0, v1}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->crashlyticsPermissionCheckbox:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->promotionalEmailCheckbox:Landroid/view/View;

    .line 87
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    move-result v3

    .line 86
    invoke-virtual {v0, v1, v3}, Lcom/shopkick/app/application/ProfileInfo;->setCrashReportingAndPromotionalEmailSubscription(ZZ)V

    .line 88
    invoke-direct {p0}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->logNextButtonClick()V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->setGottenTOSConfirmation(Z)V

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const/4 p3, 0x0

    const v0, 0x7f0c01de

    .line 42
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0907a0

    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->tosCheckbox:Landroid/view/View;

    const p2, 0x7f0901b5

    .line 44
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->crashlyticsPermissionCheckbox:Landroid/view/View;

    .line 45
    iget-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->crashlyticsPermissionCheckbox:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    const p2, 0x7f09056d

    .line 46
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->promotionalEmailCheckbox:Landroid/view/View;

    .line 47
    iget-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->promotionalEmailCheckbox:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setSelected(Z)V

    const p2, 0x7f0904a8

    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const v1, 0x7f0907a1

    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;

    iget-object v3, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->tosCheckbox:Landroid/view/View;

    invoke-direct {v2, v3}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0901b6

    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;

    iget-object v3, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->crashlyticsPermissionCheckbox:Landroid/view/View;

    invoke-direct {v2, v3}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;-><init>(Landroid/view/View;)V

    .line 53
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09056e

    .line 54
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;

    iget-object v3, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->promotionalEmailCheckbox:Landroid/view/View;

    invoke-direct {v2, v3}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$CheckboxClick;-><init>(Landroid/view/View;)V

    .line 55
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0907a3

    .line 57
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0901b8

    .line 58
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f11019d

    .line 59
    invoke-virtual {p0, v3}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 60
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 61
    new-instance v5, Landroid/text/style/UnderlineSpan;

    invoke-direct {v5}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v4, v5, p3, v3, p3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 62
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    new-instance p3, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    iget-object v5, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v5, v5, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {p3, v3, v0, v5}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;-><init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V

    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    new-instance p3, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;

    invoke-virtual {p0}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v3, 0x2

    invoke-direct {p3, v0, v3, v1}, Lcom/shopkick/app/registration/LegalDetailsWebViewLauncher;-><init>(Lcom/shopkick/app/activities/BaseActivity;ILcom/shopkick/app/account/UserAccountDataSource;)V

    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    new-instance p3, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;

    invoke-direct {p3, p0}, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen$NextButtonClick;-><init>(Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 35
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 36
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 37
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p1, p0, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 79
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_ACTIVITY_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0
.end method
