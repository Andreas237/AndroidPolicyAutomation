.class public Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "UpdateProfileActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;
.implements Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;
.implements Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$FormTextWatcher;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
        "Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;",
        "Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;"
    }
.end annotation


# static fields
.field private static final TAG_EMAIL_UPDATE_NOTICE:Ljava/lang/String; = "email_update_notice"

.field private static final TAG_PASSWORD_RESET:Ljava/lang/String; = "password_reset"

.field private static final TAG_RESET_PASSWORD_CONF:Ljava/lang/String; = "reset_password_conf"

.field private static final TAG_VALIDATION_ERROR:Ljava/lang/String; = "validation_error"


# instance fields
.field protected bSaveProfile:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a3
    .end annotation
.end field

.field protected etBirthDate:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901bf
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

.field protected etLastName:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901cc
    .end annotation
.end field

.field protected etZip:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d6
    .end annotation
.end field

.field protected passwordCache:Lcom/ibotta/android/security/PasswordCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected passwordPrompterFactory:Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected sGender:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e3
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initGenders()V
    .locals 2

    const/high16 v0, 0x7f030000

    const v1, 0x7f0c0165

    .line 95
    invoke-static {p0, v0, v1}, Landroid/widget/ArrayAdapter;->createFromResource(Landroid/content/Context;II)Landroid/widget/ArrayAdapter;

    move-result-object v0

    const v1, 0x7f0c01c9

    .line 97
    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method private initListeners()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etFirstName:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etLastName:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etEmail:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etZip:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$4;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etBirthDate:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfileActivity$nkQBciHxnexQk2K7DG-S_gJbLZM;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfileActivity$nkQBciHxnexQk2K7DG-S_gJbLZM;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etBirthDate:Landroid/widget/EditText;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfileActivity$yTctV2s96mToldoZgrgZtx4prdQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfileActivity$yTctV2s96mToldoZgrgZtx4prdQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 133
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity$5;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public static synthetic lambda$initListeners$0(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Landroid/view/View;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 129
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onChooseBirthDateFocused()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$initListeners$1(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Landroid/view/View;)V
    .locals 0

    .line 132
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onChooseBirthDateFocused()V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 66
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private showValidationError(I)V
    .locals 2

    .line 314
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object p1

    .line 315
    sget-object v0, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v1, "validation_error"

    invoke-virtual {v0, p0, p1, v1}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 62
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;
    .locals 1

    .line 71
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;

    move-result-object v0

    .line 72
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    .line 73
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->updateProfileModule(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileModule;)Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;

    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/DaggerUpdateProfileComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 39
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;)V
    .locals 0

    .line 79
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string v0, "reset_password_conf"

    .line 299
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f11020d

    if-ne p2, v0, :cond_0

    .line 300
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onResetPasswordConfirmed()V

    goto :goto_0

    :cond_0
    const-string v0, "email_update_notice"

    .line 301
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onEmailUpdateDialogClosed()V

    goto :goto_0

    .line 304
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onChoice(Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f11064e

    .line 86
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->setTitle(I)V

    const p1, 0x7f0c0074

    .line 87
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->setContentView(I)V

    .line 88
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->initGenders()V

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->initListeners()V

    return-void
.end method

.method public onDateSet(Landroid/widget/DatePicker;III)V
    .locals 0

    .line 310
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onBirthDateChanged(III)V

    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 1

    .line 281
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDialogFragmentCancelled(Ljava/lang/String;)V

    const-string v0, "password_reset"

    .line 283
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 284
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onResetPasswordDialogClosed()V

    :cond_0
    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 1

    .line 290
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onDialogFragmentDismissed(Ljava/lang/String;)V

    const-string v0, "password_reset"

    .line 292
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 293
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onResetPasswordDialogClosed()V

    :cond_0
    return-void
.end method

.method public onPasswordCaptured(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 246
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onPasswordCaptured(Ljava/lang/String;)V

    return-void
.end method

.method protected onResetPasswordClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a0
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onResetPasswordClicked()V

    return-void
.end method

.method protected onSaveProfileClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a3
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;->onSaveProfileClicked()V

    return-void
.end method

.method public setBirthDate(Ljava/lang/String;)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etBirthDate:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setFirstName(Ljava/lang/String;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setGender(Ljava/lang/String;)V
    .locals 3

    .line 177
    invoke-static {p1}, Lcom/ibotta/api/call/customer/Gender;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;

    move-result-object p1

    const/4 v0, 0x0

    .line 179
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/Spinner;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 180
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 181
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/Gender;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 182
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 188
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    return-void
.end method

.method public setLastName(Ljava/lang/String;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSaveEnabled(Z)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->bSaveProfile:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setZip(Ljava/lang/String;)V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etZip:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showBirthDateChooser(III)V
    .locals 8

    .line 203
    new-instance v7, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;

    const v2, 0x7f120291

    move-object v0, v7

    move-object v1, p0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;-><init>(Landroid/content/Context;ILcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog$OnDateSetListener;III)V

    .line 205
    invoke-virtual {v7}, Lcom/ibotta/android/support/pickerdialogs/SupportedDatePickerDialog;->show()V

    return-void
.end method

.method public showBirthDateInvalid()V
    .locals 1

    const v0, 0x7f11019a

    .line 266
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method

.method public showEmailInvalid()V
    .locals 1

    const v0, 0x7f11019b

    .line 261
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method

.method public showEmailUpdateInstructions()V
    .locals 5

    const v0, 0x7f110205

    .line 236
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110204

    .line 237
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 239
    new-array v2, v2, [I

    const/4 v3, 0x0

    const v4, 0x7f1101c8

    aput v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 240
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 241
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "email_update_notice"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method public showFirstNameInvalid()V
    .locals 1

    const v0, 0x7f11019c

    .line 251
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method

.method public showGenderInvalid()V
    .locals 1

    const v0, 0x7f11019d

    .line 271
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method

.method public showLastNameInvalid()V
    .locals 1

    const v0, 0x7f11019e

    .line 256
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method

.method public showPasswordCapture(Ljava/lang/String;)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->passwordPrompterFactory:Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;

    invoke-interface {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompterFactory;->create(Lcom/ibotta/android/mvp/ui/misc/password/PasswordListener;Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/misc/password/PasswordPrompter;->capturePassword()V

    return-void
.end method

.method public showResetPasswordConfirmation()V
    .locals 3

    const v0, 0x7f1101df

    .line 211
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1101de

    .line 212
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 213
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 215
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 216
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "reset_password_conf"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f1101b9
        0x7f11020d
    .end array-data
.end method

.method public showResetPasswordSuccess()V
    .locals 3

    const/4 v0, 0x1

    const-wide/16 v1, 0x1388

    .line 226
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    .line 227
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 228
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "password_reset"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->passwordCache:Lcom/ibotta/android/security/PasswordCache;

    invoke-interface {v0}, Lcom/ibotta/android/security/PasswordCache;->clear()V

    return-void
.end method

.method public showZipInvalid()V
    .locals 1

    const v0, 0x7f1101a1

    .line 276
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->showValidationError(I)V

    return-void
.end method
