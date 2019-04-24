.class Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$2;
.super Ljava/lang/Object;
.source "PermissionsPromptDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;


# direct methods
.method constructor <init>(Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$2;->this$0:Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment$2;->this$0:Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;

    const p2, 0x7f110171

    invoke-virtual {p1, p2}, Lcom/ibotta/android/fragment/dialog/PermissionsPromptDialogFragment;->onChoice(I)V

    return-void
.end method
