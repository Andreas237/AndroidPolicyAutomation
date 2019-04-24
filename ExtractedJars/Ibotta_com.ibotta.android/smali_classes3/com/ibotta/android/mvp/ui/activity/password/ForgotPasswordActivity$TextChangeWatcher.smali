.class Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;
.super Ljava/lang/Object;
.source "ForgotPasswordActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TextChangeWatcher"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$1;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 111
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;->onEmailChanged(Ljava/lang/String;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
