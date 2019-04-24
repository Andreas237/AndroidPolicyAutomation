.class public Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "PermissionsPromptDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$PromptDialogListener;
    }
.end annotation


# static fields
.field private static final KEY_MESSAGE:Ljava/lang/String; = "message"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"


# instance fields
.field protected dismissing:Z

.field protected message:Ljava/lang/String;

.field protected title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method public static buildArgs(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 35
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "title"

    .line 36
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "message"

    .line 37
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static newInstance(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;
    .locals 1

    .line 29
    new-instance v0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;-><init>()V

    .line 30
    invoke-static {p0, p1}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->buildArgs(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public isDismissing()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->dismissing:Z

    return v0
.end method

.method protected loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "title"

    .line 68
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->title:Ljava/lang/String;

    const-string v0, "message"

    .line 69
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->message:Ljava/lang/String;

    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->title:Ljava/lang/String;

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "message"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->message:Ljava/lang/String;

    :cond_1
    :goto_0
    return-void
.end method

.method protected onChoice(I)V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$PromptDialogListener;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$PromptDialogListener;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$PromptDialogListener;->onChoice(Ljava/lang/String;I)V

    .line 87
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->dismissing:Z

    if-nez p1, :cond_1

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->dismissAllowingStateLoss()V

    :cond_1
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->loadState(Landroid/os/Bundle;)V

    .line 46
    new-instance p1, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->title:Ljava/lang/String;

    .line 49
    invoke-virtual {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->message:Ljava/lang/String;

    .line 50
    invoke-virtual {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$2;-><init>(Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;)V

    const v1, 0x7f110171

    .line 51
    invoke-virtual {p1, v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$1;-><init>(Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;)V

    const v1, 0x7f1101bf

    .line 57
    invoke-virtual {p1, v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    .line 63
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 94
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    const/4 p1, 0x1

    .line 95
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->dismissing:Z

    const/4 p1, 0x0

    .line 96
    invoke-virtual {p0, p1}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->onChoice(I)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 78
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "title"

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->title:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "message"

    .line 80
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->message:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
