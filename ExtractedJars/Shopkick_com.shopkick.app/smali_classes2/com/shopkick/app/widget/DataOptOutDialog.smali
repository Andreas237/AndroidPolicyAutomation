.class public Lcom/shopkick/app/widget/DataOptOutDialog;
.super Landroid/support/v7/app/AppCompatDialogFragment;
.source "DataOptOutDialog.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final DESCRIPTION_KEY:Ljava/lang/String; = "description_key"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private progressDialog:Landroid/app/ProgressDialog;

.field public updateDataOptOutStateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatDialogFragment;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/widget/DataOptOutDialog;)Landroid/app/ProgressDialog;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/shopkick/app/widget/DataOptOutDialog;->progressDialog:Landroid/app/ProgressDialog;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/widget/DataOptOutDialog;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog;->progressDialog:Landroid/app/ProgressDialog;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/widget/DataOptOutDialog;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/shopkick/app/widget/DataOptOutDialog;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method public static newInstance(ILcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/widget/DataOptOutDialog;
    .locals 3

    .line 42
    new-instance v0, Lcom/shopkick/app/widget/DataOptOutDialog;

    invoke-direct {v0}, Lcom/shopkick/app/widget/DataOptOutDialog;-><init>()V

    .line 43
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "description_key"

    .line 44
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 45
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/DataOptOutDialog;->setArguments(Landroid/os/Bundle;)V

    .line 46
    iput-object p1, v0, Lcom/shopkick/app/widget/DataOptOutDialog;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object v0
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/widget/DataOptOutDialog;->updateDataOptOutStateRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateRequest;

    if-ne p1, v0, :cond_1

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/widget/DataOptOutDialog;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 102
    invoke-virtual {p0}, Lcom/shopkick/app/widget/DataOptOutDialog;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    check-cast p1, Landroid/app/AlertDialog;

    if-eqz p1, :cond_1

    .line 104
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    .line 105
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateResponse;

    .line 106
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateDataOptOutStateResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    .line 107
    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    return-void

    :cond_0
    const p2, 0x7f110223

    .line 112
    invoke-virtual {p0, p2}, Lcom/shopkick/app/widget/DataOptOutDialog;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/widget/DataOptOutDialog;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "description_key"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 58
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/widget/DataOptOutDialog;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const/4 p1, 0x0

    const v1, 0x7f11016f

    .line 60
    invoke-virtual {v0, v1, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f110145

    .line 61
    invoke-virtual {v0, v1, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 62
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 72
    invoke-super {p0}, Landroid/support/v7/app/AppCompatDialogFragment;->onResume()V

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/widget/DataOptOutDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    check-cast v0, Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    .line 75
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    .line 76
    new-instance v1, Lcom/shopkick/app/widget/DataOptOutDialog$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/widget/DataOptOutDialog$1;-><init>(Lcom/shopkick/app/widget/DataOptOutDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
