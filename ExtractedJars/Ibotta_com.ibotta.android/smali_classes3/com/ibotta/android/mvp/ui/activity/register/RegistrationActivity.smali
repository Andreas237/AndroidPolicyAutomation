.class public Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "RegistrationActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;
.implements Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;
.implements Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;",
        "Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;",
        "Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;"
    }
.end annotation


# static fields
.field public static final KEY_ONBOARDING_RETAILERS:Ljava/lang/String; = "onboarding_retailers"

.field public static final RESP_CODE_SUCCESS:I = 0x1


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected bSignUp:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a8
    .end annotation
.end field

.field protected etDateOfBirth:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c4
    .end annotation
.end field

.field protected etEmail:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c5
    .end annotation
.end field

.field protected etFirstName:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c7
    .end annotation
.end field

.field protected etGender:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901c8
    .end annotation
.end field

.field protected etLastName:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901cc
    .end annotation
.end field

.field protected etPassword:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901cf
    .end annotation
.end field

.field protected etReferralCode:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d3
    .end annotation
.end field

.field protected etZipCode:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d7
    .end annotation
.end field

.field private lastReferralCodeEntered:Ljava/lang/String;

.field protected legalFooterView:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ed
    .end annotation
.end field

.field private registrationForm:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

.field private textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

.field protected tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09046c
    .end annotation
.end field

.field protected tilEmail:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09046e
    .end annotation
.end field

.field protected tilFirstName:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09046f
    .end annotation
.end field

.field protected tilLastName:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090472
    .end annotation
.end field

.field protected tilPassword:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090473
    .end annotation
.end field

.field protected tilReferralCode:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090475
    .end annotation
.end field

.field protected tilZipCode:Landroid/support/design/widget/TextInputLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090476
    .end annotation
.end field

.field protected trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    .line 84
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->registrationForm:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->registrationForm:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->lastReferralCodeEntered:Ljava/lang/String;

    return-object p1
.end method

.method private initDateOfBirth()V
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$MHaNQSJ6ILliRGkxETogV7dlGTo;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$MHaNQSJ6ILliRGkxETogV7dlGTo;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initEmail()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initFirstName()V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initGender()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$JwSTMc8IEd8eKJUkDCAt3n-ZFk8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$JwSTMc8IEd8eKJUkDCAt3n-ZFk8;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method

.method private initLastName()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initLegalClickListener()V
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->legalFooterView:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->setLegalUrlClickListener(Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;)V

    return-void
.end method

.method private initPassword()V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private initReferralCode()V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$UxyYmgHG2HGHyLmsB35x7dotpcw;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$UxyYmgHG2HGHyLmsB35x7dotpcw;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method private initTextChangeWatcher()V
    .locals 2

    .line 139
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$1;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    return-void
.end method

.method private initZipCode()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->textChangeWatcher:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static synthetic lambda$initDateOfBirth$0(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 163
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onDateOfBirthFocused()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initGender$1(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 182
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onGenderFocused()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initReferralCode$2(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    .line 201
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->onSignUpClicked()V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$showGenderPicker$3(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/content/DialogInterface;I)V
    .locals 1

    .line 243
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/high16 v0, 0x7f030000

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, p2

    .line 244
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onGenderSelected(Ljava/lang/String;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 96
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static startForResult(Landroid/app/Activity;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 92
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private trackRegistrationEnd()V
    .locals 2

    .line 508
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;-><init>()V

    .line 509
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->REGISTRATION_STOP:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 510
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->lastReferralCodeEntered:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;->setReferralCode(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 511
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;->setCounter(I)V

    .line 512
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private trackRegistrationStart()V
    .locals 2

    .line 501
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;-><init>()V

    .line 502
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->REGISTRATION_START:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    const/4 v1, 0x1

    .line 503
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;->setCounter(I)V

    .line 504
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->trackingQueue:Lcom/ibotta/android/tracking/proprietary/TrackingQueue;

    invoke-interface {v1, v0}, Lcom/ibotta/android/tracking/proprietary/TrackingQueue;->send(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 46
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;
    .locals 1

    .line 101
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;

    move-result-object v0

    .line 102
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;)V

    .line 103
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->registrationModule(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationModule;)Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/DaggerRegistrationComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;

    move-result-object p1

    return-object p1
.end method

.method protected initToolBar()V
    .locals 2

    .line 210
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->initToolBar()V

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 214
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const v1, 0x7f08028d

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setLogo(I)V

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 216
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 46
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;)V
    .locals 0

    .line 109
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    return-void
.end method

.method public notifySuccess(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation

    .line 382
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->trackRegistrationEnd()V

    .line 384
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "onboarding_retailers"

    .line 386
    invoke-static {p1}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleHelper;->convertToParcelableArrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    .line 385
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 387
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->setResult(ILandroid/content/Intent;)V

    .line 389
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->finish()V

    return-void
.end method

.method public onBirthdateFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901c4
        }
    .end annotation

    .line 481
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onBirthdateChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 114
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0065

    .line 116
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->setContentView(I)V

    .line 117
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 119
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initTextChangeWatcher()V

    .line 120
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initFirstName()V

    .line 121
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initLastName()V

    .line 122
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initEmail()V

    .line 123
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initPassword()V

    .line 124
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initDateOfBirth()V

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initZipCode()V

    .line 126
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initGender()V

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initReferralCode()V

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->initLegalClickListener()V

    .line 130
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->trackRegistrationStart()V

    return-void
.end method

.method protected onDateOfBirthClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901c4
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onDateOfBirthFocused()V

    return-void
.end method

.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 0

    .line 221
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onBirthdateSet(III)V

    return-void
.end method

.method public onEmailFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901c5
        }
    .end annotation

    .line 467
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 468
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onEmailChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onFirstNameFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901c7
        }
    .end annotation

    .line 453
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 454
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onFirstNameChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onGenderClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901c8
        }
    .end annotation

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onGenderFocused()V

    return-void
.end method

.method public onLastNameFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901cc
        }
    .end annotation

    .line 460
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 461
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onLastNameChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onLegalUrlClicked(Ljava/lang/String;)V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/util/AppHelper;->openUrlExternally(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public onPasswordFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901cf
        }
    .end annotation

    .line 474
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onPasswordChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReferralCodeFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901d3
        }
    .end annotation

    .line 495
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 496
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onReferralCodeChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onSignUpClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a8
        }
    .end annotation

    .line 420
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->registrationForm:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onSignUpClicked(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V

    return-void
.end method

.method public onZipCodeFocusChange()V
    .locals 2
    .annotation runtime Lbutterknife/OnFocusChange;
        value = {
            0x7f0901d7
        }
    .end annotation

    .line 488
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 489
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onZipCodeChanged(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setBirthdate(Ljava/lang/String;)V
    .locals 1

    .line 409
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setBirthdateInputStateError()V
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f11019a

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setBirthdateInputStateValid()V
    .locals 2

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 353
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setDateOfBirth(Ljava/lang/String;)V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 235
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    .line 404
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setEmailInputStateError()V
    .locals 2

    .line 322
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f110590

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setEmailInputStateValid()V
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 1

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setFirstNameInputStateError()V
    .locals 2

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 299
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f11019c

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setFirstNameInputStateValid()V
    .locals 2

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setGender(Ljava/lang/String;)V
    .locals 1

    .line 414
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 415
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 1

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLastNameInputStateError()V
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 311
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f11019e

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setLastNameInputStateValid()V
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setPasswordInputStateError()V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 335
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f110591

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordInputStateValid()V
    .locals 2

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 341
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setReferralCodeInputStateError()V
    .locals 2

    .line 370
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f1101a0

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setReferralCodeInputStateValid()V
    .locals 2

    .line 376
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public setSignUpEnabled(Z)V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->bSignUp:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setZipCodeInputStateError()V
    .locals 2

    .line 358
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    const v1, 0x7f110592

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setZipCodeInputStateValid()V
    .locals 2

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 365
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    return-void
.end method

.method public showDateOfBirthPicker(IIILjava/util/Calendar;)V
    .locals 8

    .line 226
    new-instance v7, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;

    const v2, 0x7f120291

    move-object v0, v7

    move-object v1, p0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V

    .line 228
    invoke-virtual {v7}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p1

    invoke-virtual {p4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 229
    invoke-virtual {v7}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->show()V

    return-void
.end method

.method public showGenderPicker()V
    .locals 4

    .line 240
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f11058e

    .line 241
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(I)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$0NZDJGYMk_78cnnJeB1lbzcWNYw;

    invoke-direct {v2, p0}, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationActivity$0NZDJGYMk_78cnnJeB1lbzcWNYw;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    const/high16 v3, 0x7f030000

    .line 242
    invoke-virtual {v1, v3, v2}, Landroid/support/v7/app/AlertDialog$Builder;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 246
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method public showInvalidDateOfBirth()V
    .locals 2

    const v0, 0x7f11019a

    const/4 v1, 0x0

    .line 286
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidEmail()V
    .locals 2

    const v0, 0x7f11019b

    const/4 v1, 0x0

    .line 268
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidFirstName()V
    .locals 2

    const v0, 0x7f11019c

    const/4 v1, 0x0

    .line 256
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidLastName()V
    .locals 2

    const v0, 0x7f11019e

    const/4 v1, 0x0

    .line 262
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidPassword()V
    .locals 2

    const v0, 0x7f11019f

    const/4 v1, 0x0

    .line 274
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidReferralCode()V
    .locals 2

    const v0, 0x7f1101a0

    const/4 v1, 0x0

    .line 292
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method

.method public showInvalidZipCode()V
    .locals 2

    const v0, 0x7f1101a1

    const/4 v1, 0x0

    .line 280
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->showErrorMessage(ILjava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    return-void
.end method
