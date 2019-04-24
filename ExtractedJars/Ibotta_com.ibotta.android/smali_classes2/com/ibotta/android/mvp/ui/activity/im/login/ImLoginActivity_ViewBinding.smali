.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ImLoginActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    const-string v0, "field \'clImDetailHeader\'"

    .line 30
    const-class v1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const v2, 0x7f0900f6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    const-string v0, "field \'etImEmail\'"

    .line 31
    const-class v1, Landroid/support/design/widget/TextInputEditText;

    const v2, 0x7f0901c9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImEmail:Landroid/support/design/widget/TextInputEditText;

    const-string v0, "field \'etImPassword\'"

    .line 32
    const-class v1, Landroid/support/design/widget/TextInputEditText;

    const v2, 0x7f0901ca

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImPassword:Landroid/support/design/widget/TextInputEditText;

    const-string v0, "field \'bImConnect\'"

    .line 33
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f09008b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bImConnect:Landroid/widget/Button;

    const-string v0, "field \'tvLogin\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/base/text/LinkTextView;

    const v2, 0x7f090544

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/text/LinkTextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvLogin:Lcom/ibotta/android/views/base/text/LinkTextView;

    const-string v0, "field \'tvDisclaimer\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090519

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvDisclaimer:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 43
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->clImDetailHeader:Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImEmail:Landroid/support/design/widget/TextInputEditText;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->etImPassword:Landroid/support/design/widget/TextInputEditText;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->bImConnect:Landroid/widget/Button;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvLogin:Lcom/ibotta/android/views/base/text/LinkTextView;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;->tvDisclaimer:Landroid/widget/TextView;

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
