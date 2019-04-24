.class Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;
.super Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

.field final synthetic val$isCancancel:Z

.field final synthetic val$keyBackClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$negClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

.field final synthetic val$negName:Ljava/lang/String;

.field final synthetic val$posClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

.field final synthetic val$posName:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;Ljava/lang/String;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;ZLcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->this$0:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;

    iput-object p2, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$posName:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$posClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    iput-object p6, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negName:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    iput-boolean p8, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$isCancancel:Z

    iput-object p9, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$keyBackClickListener:Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$OnClickListener;

    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonAlertDialogListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDialogDismiss()V
    .locals 0

    .line 259
    return-void
.end method

.method public onDialogInit(Lo/yr;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$title:Ljava/lang/String;

    invoke-interface {p1, v0}, Lo/yr;->a(Ljava/lang/String;)Lo/yr;

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$message:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$message:Ljava/lang/String;

    invoke-interface {p1, v0}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$posName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 189
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$posName:Ljava/lang/String;

    new-instance v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$1;

    invoke-direct {v1, p0, p2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$1;-><init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    invoke-interface {p1, v0, v1}, Lo/yr;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 208
    :cond_2
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 210
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$negName:Ljava/lang/String;

    new-instance v1, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;

    invoke-direct {v1, p0, p2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$2;-><init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    invoke-interface {p1, v0, v1}, Lo/yr;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 228
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;->val$isCancancel:Z

    invoke-interface {p1, v0}, Lo/yr;->setCancelable(Z)V

    .line 229
    new-instance v0, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;

    invoke-direct {v0, p0, p2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1$3;-><init>(Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment$1;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V

    invoke-interface {p1, v0}, Lo/yr;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 252
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 253
    return-void
.end method
