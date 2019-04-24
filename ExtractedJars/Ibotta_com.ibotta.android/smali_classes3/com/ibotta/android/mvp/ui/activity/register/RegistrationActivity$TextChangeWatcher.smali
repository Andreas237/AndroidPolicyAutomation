.class Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;
.super Ljava/lang/Object;
.source "RegistrationActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TextChangeWatcher"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$1;)V
    .locals 0

    .line 423
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 434
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etFirstName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setFirstName(Ljava/lang/String;)V

    .line 435
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etLastName:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setLastName(Ljava/lang/String;)V

    .line 436
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setEmail(Ljava/lang/String;)V

    .line 437
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setPassword(Ljava/lang/String;)V

    .line 438
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etDateOfBirth:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setDateOfBirth(Ljava/lang/String;)V

    .line 439
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etZipCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setZipCode(Ljava/lang/String;)V

    .line 440
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etGender:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setGender(Ljava/lang/String;)V

    .line 441
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->setReferralCode(Ljava/lang/String;)V

    .line 443
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;)Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;->onRegistrationChanged(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V

    .line 445
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 446
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;

    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->etReferralCode:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;->access$302(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationActivity;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
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
