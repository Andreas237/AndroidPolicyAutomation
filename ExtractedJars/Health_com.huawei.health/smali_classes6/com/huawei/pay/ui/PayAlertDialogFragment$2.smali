.class Lcom/huawei/pay/ui/PayAlertDialogFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/PayAlertDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/PayAlertDialogFragment;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    iget-object v0, v0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    iget-object v0, v0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

    iget-object v1, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-static {v1}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->access$000(Lcom/huawei/pay/ui/PayAlertDialogFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;->onAlertDialogNegativeClick(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$2;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->dismiss()V

    .line 127
    :cond_0
    return-void
.end method
