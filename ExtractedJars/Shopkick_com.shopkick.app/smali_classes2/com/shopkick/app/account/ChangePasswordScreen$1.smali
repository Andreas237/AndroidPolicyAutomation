.class Lcom/shopkick/app/account/ChangePasswordScreen$1;
.super Ljava/lang/Object;
.source "ChangePasswordScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/ChangePasswordScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/ChangePasswordScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/ChangePasswordScreen;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    .line 103
    invoke-virtual {p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-boolean p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdErrorVisible:Z

    if-eqz p1, :cond_0

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdError:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iput-boolean v1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdErrorVisible:Z

    .line 109
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->access$000(Lcom/shopkick/app/account/ChangePasswordScreen;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 111
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changeDialog:Landroid/app/ProgressDialog;

    if-nez p1, :cond_1

    .line 112
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v2, ""

    iget-object v3, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    .line 114
    invoke-virtual {v3}, Lcom/shopkick/app/account/ChangePasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const v4, 0x7f11010d

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 112
    invoke-static {v0, v2, v3, v4, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changeDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 118
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changeDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    .line 120
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;->newPassword:Ljava/lang/String;

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;->oldPassword:Ljava/lang/String;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->access$100(Lcom/shopkick/app/account/ChangePasswordScreen;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/ChangePasswordScreen$1;->this$0:Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method
