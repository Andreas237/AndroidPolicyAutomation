.class Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)V
    .locals 0

    .line 691
    iput-object p1, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 693
    const/4 v2, 0x0

    .line 695
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    .line 696
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_btn_positive:I

    if-ne v3, v0, :cond_0

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->d(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v2

    goto :goto_0

    .line 698
    :cond_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_btn_negative:I

    if-ne v3, v0, :cond_1

    .line 699
    iget-object v0, p0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a$4;->a:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;

    invoke-static {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;->c(Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$a;)Landroid/os/Message;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object v2

    .line 702
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 703
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 706
    :cond_2
    invoke-static {}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->a()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 707
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 708
    return-void
.end method
