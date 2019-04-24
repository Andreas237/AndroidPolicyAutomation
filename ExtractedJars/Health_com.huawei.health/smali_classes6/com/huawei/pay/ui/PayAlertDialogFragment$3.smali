.class Lcom/huawei/pay/ui/PayAlertDialogFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


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

    .line 135
    iput-object p1, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 141
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    iget-object v0, v0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 145
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 146
    iget-object v0, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    iget-object v0, v0, Lcom/huawei/pay/ui/PayAlertDialogFragment;->mListener:Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;

    iget-object v1, p0, Lcom/huawei/pay/ui/PayAlertDialogFragment$3;->this$0:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-static {v1}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->access$000(Lcom/huawei/pay/ui/PayAlertDialogFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;->onAlertDialogKeyBack(I)V

    .line 147
    const/4 v0, 0x1

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
