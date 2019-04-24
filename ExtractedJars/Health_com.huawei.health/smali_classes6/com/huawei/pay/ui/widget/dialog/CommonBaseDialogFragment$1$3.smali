.class Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->onDialogInit(Lo/yr;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

.field final synthetic val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iput-object p2, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 234
    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 236
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->this$0:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-static {v0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->access$000(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 238
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$keyBackClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$keyBackClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;->onClick(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->dismissAllowingStateLoss()V

    .line 246
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 249
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
