.class Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;
.super Ljava/lang/Object;
.source "DeleteAccountConfirmationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-boolean v0, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-boolean v0, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorVisible:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorText:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iput-boolean v1, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorVisible:Z

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v2, 0x1

    if-ne p1, v0, :cond_3

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deletingDialog:Landroid/app/ProgressDialog;

    if-nez p1, :cond_2

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v3, ""

    iget-object v4, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    .line 79
    invoke-virtual {v4}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    const v5, 0x7f110259

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 77
    invoke-static {v0, v3, v4, v2, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deletingDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 83
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deletingDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    .line 85
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;-><init>()V

    iput-object v0, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-static {v0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->access$000(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->password:Ljava/lang/String;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-static {v0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->access$100(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->facebookAccessToken:Ljava/lang/String;

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object p1, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-static {v0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->access$200(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->googleIdToken:Ljava/lang/String;

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-static {p1}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->access$300(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iget-object v0, v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 93
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;->this$0:Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    iput-boolean v2, p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->buttonTapped:Z

    return-void
.end method
