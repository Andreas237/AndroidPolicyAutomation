.class public Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;
.super Ljava/lang/Object;
.source "RegistrationActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

.field private view7f0900a8:Landroid/view/View;

.field private view7f0901c4:Landroid/view/View;

.field private view7f0901c5:Landroid/view/View;

.field private view7f0901c7:Landroid/view/View;

.field private view7f0901c8:Landroid/view/View;

.field private view7f0901cc:Landroid/view/View;

.field private view7f0901cf:Landroid/view/View;

.field private view7f0901d3:Landroid/view/View;

.field private view7f0901d7:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    const-string v0, "field \'tilFirstName\'"

    .line 49
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f09046f

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etFirstName\' and method \'onFirstNameFocusChange\'"

    const v1, 0x7f0901c7

    .line 50
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etFirstName\'"

    .line 51
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    .line 52
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c7:Landroid/view/View;

    .line 53
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'tilLastName\'"

    .line 59
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f090472

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etLastName\' and method \'onLastNameFocusChange\'"

    const v1, 0x7f0901cc

    .line 60
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etLastName\'"

    .line 61
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    .line 62
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cc:Landroid/view/View;

    .line 63
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'tilEmail\'"

    .line 69
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f09046e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etEmail\' and method \'onEmailFocusChange\'"

    const v1, 0x7f0901c5

    .line 70
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etEmail\'"

    .line 71
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    .line 72
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c5:Landroid/view/View;

    .line 73
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'tilPassword\'"

    .line 79
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f090473

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etPassword\' and method \'onPasswordFocusChange\'"

    const v1, 0x7f0901cf

    .line 80
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etPassword\'"

    .line 81
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    .line 82
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cf:Landroid/view/View;

    .line 83
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$4;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'tilDateOfBirth\'"

    .line 89
    const-class v1, Landroid/support/design/widget/TextInputLayout;

    const v2, 0x7f09046c

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etDateOfBirth\', method \'onDateOfBirthClicked\', and method \'onBirthdateFocusChange\'"

    const v1, 0x7f0901c4

    .line 90
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etDateOfBirth\'"

    .line 91
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    .line 92
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c4:Landroid/view/View;

    .line 93
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$5;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$5;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 99
    :goto_0
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$6;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$6;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const v0, 0x7f090476

    const-string v1, "field \'tilZipCode\'"

    .line 105
    const-class v2, Landroid/support/design/widget/TextInputLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etZipCode\' and method \'onZipCodeFocusChange\'"

    const v1, 0x7f0901d7

    .line 106
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etZipCode\'"

    .line 107
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    .line 108
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d7:Landroid/view/View;

    .line 109
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$7;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'etGender\' and method \'onGenderClicked\'"

    const v1, 0x7f0901c8

    .line 115
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etGender\'"

    .line 116
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    .line 117
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c8:Landroid/view/View;

    .line 118
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$8;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$8;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090475

    const-string v1, "field \'tilReferralCode\'"

    .line 124
    const-class v2, Landroid/support/design/widget/TextInputLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    const-string v0, "field \'etReferralCode\' and method \'onReferralCodeFocusChange\'"

    const v1, 0x7f0901d3

    .line 125
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'etReferralCode\'"

    .line 126
    const-class v3, Landroid/widget/EditText;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    .line 127
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d3:Landroid/view/View;

    .line 128
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$9;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$9;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const-string v0, "field \'bSignUp\' and method \'onSignUpClicked\'"

    const v1, 0x7f0900a8

    .line 134
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSignUp\'"

    .line 135
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->bSignUp:Landroid/widget/Button;

    .line 136
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0900a8:Landroid/view/View;

    .line 137
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding$10;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f0902ed

    const-string v1, "field \'legalFooterView\'"

    .line 143
    const-class v2, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->legalFooterView:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 151
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    .line 153
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilFirstName:Landroid/support/design/widget/TextInputLayout;

    .line 154
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    .line 155
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilLastName:Landroid/support/design/widget/TextInputLayout;

    .line 156
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    .line 157
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilEmail:Landroid/support/design/widget/TextInputLayout;

    .line 158
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    .line 159
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilPassword:Landroid/support/design/widget/TextInputLayout;

    .line 160
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    .line 161
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilDateOfBirth:Landroid/support/design/widget/TextInputLayout;

    .line 162
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    .line 163
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilZipCode:Landroid/support/design/widget/TextInputLayout;

    .line 164
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    .line 165
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    .line 166
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->tilReferralCode:Landroid/support/design/widget/TextInputLayout;

    .line 167
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    .line 168
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->bSignUp:Landroid/widget/Button;

    .line 169
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->legalFooterView:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c7:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 172
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c7:Landroid/view/View;

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cc:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 174
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cc:Landroid/view/View;

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c5:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 176
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c5:Landroid/view/View;

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cf:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 178
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901cf:Landroid/view/View;

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c4:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 180
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c4:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 181
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c4:Landroid/view/View;

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d7:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 183
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d7:Landroid/view/View;

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c8:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 185
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901c8:Landroid/view/View;

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d3:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 187
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0901d3:Landroid/view/View;

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0900a8:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 189
    :goto_2
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity_ViewBinding;->view7f0900a8:Landroid/view/View;

    return-void

    .line 150
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
