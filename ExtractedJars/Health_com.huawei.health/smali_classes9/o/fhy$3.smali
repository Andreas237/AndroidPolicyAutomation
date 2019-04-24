.class Lo/fhy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhy;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhy;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/fhy;Landroid/content/Context;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lo/fhy$3;->a:Lo/fhy;

    iput-object p2, p0, Lo/fhy$3;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 121
    iget-object v0, p0, Lo/fhy$3;->d:Landroid/content/Context;

    const-string v1, "IsSignVamllArg"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/xt;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 122
    const-string v0, "VmallPravicyNotice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user cancel sign vmall agr IS_SIGN_VMALL_ARG = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/fhy$3;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    .line 124
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_revoke_auth_notice:I

    .line 125
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lo/fhy$3$1;

    invoke-direct {v2, p0}, Lo/fhy$3$1;-><init>(Lo/fhy$3;)V

    .line 126
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 132
    iget-object v0, p0, Lo/fhy$3;->a:Lo/fhy;

    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fhy;->d(Lo/fhy;Lo/egv;)Lo/egv;

    .line 133
    iget-object v0, p0, Lo/fhy$3;->a:Lo/fhy;

    invoke-static {v0}, Lo/fhy;->e(Lo/fhy;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 134
    iget-object v0, p0, Lo/fhy$3;->a:Lo/fhy;

    invoke-static {v0}, Lo/fhy;->e(Lo/fhy;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/fhy$3;->a:Lo/fhy;

    invoke-static {v0}, Lo/fhy;->e(Lo/fhy;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 137
    :cond_0
    return-void
.end method
