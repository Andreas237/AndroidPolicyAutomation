.class Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;
.super Ljava/lang/Object;
.source "LoginActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TextChangeWatcher"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$1;)V
    .locals 0

    .line 133
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;-><init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 144
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etEmail:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->etPassword:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity$TextChangeWatcher;->this$0:Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;

    invoke-static {v1}, Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/login/LoginActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;

    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;->onLogInChanged(Ljava/lang/String;Ljava/lang/String;)V

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
