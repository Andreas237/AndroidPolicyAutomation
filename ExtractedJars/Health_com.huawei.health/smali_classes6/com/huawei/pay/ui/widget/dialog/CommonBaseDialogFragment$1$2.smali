.class Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


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

    .line 211
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iput-object p2, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 216
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->this$1:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;

    iget-object v0, v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    iget-object v1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-interface {v0, v1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;->onClick(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    goto :goto_0

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;->val$dialogFragment:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;->dismissAllowingStateLoss()V

    .line 224
    :goto_0
    return-void
.end method
