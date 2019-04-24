.class public Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;
.super Ljava/lang/Object;
.source "UpdateProfileActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

.field private view7f0900a0:Landroid/view/View;

.field private view7f0900a3:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    const-string v0, "field \'etFirstName\'"

    .line 34
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901c7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etFirstName:Landroid/widget/EditText;

    const-string v0, "field \'etLastName\'"

    .line 35
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901cc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etLastName:Landroid/widget/EditText;

    const-string v0, "field \'etEmail\'"

    .line 36
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901c5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etEmail:Landroid/widget/EditText;

    const-string v0, "field \'etBirthDate\'"

    .line 37
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901bf

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etBirthDate:Landroid/widget/EditText;

    const-string v0, "field \'sGender\'"

    .line 38
    const-class v1, Landroid/widget/Spinner;

    const v2, 0x7f0903e3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    const-string v0, "field \'etZip\'"

    .line 39
    const-class v1, Landroid/widget/EditText;

    const v2, 0x7f0901d6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etZip:Landroid/widget/EditText;

    const-string v0, "field \'bSaveProfile\' and method \'onSaveProfileClicked\'"

    const v1, 0x7f0900a3

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bSaveProfile\'"

    .line 41
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->bSaveProfile:Landroid/widget/Button;

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a3:Landroid/view/View;

    .line 43
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0900a0

    const-string v1, "method \'onResetPasswordClicked\'"

    .line 49
    invoke-static {p2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 50
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    .line 51
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 64
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etFirstName:Landroid/widget/EditText;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etLastName:Landroid/widget/EditText;

    .line 68
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etEmail:Landroid/widget/EditText;

    .line 69
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etBirthDate:Landroid/widget/EditText;

    .line 70
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->sGender:Landroid/widget/Spinner;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->etZip:Landroid/widget/EditText;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity;->bSaveProfile:Landroid/widget/Button;

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a3:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 75
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a3:Landroid/view/View;

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 77
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileActivity_ViewBinding;->view7f0900a0:Landroid/view/View;

    return-void

    .line 63
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
