.class Lo/bgr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgr;->b(Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/bgr;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bgr;ILjava/lang/String;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lo/bgr$1;->b:Lo/bgr;

    iput p2, p0, Lo/bgr$1;->a:I

    iput-object p3, p0, Lo/bgr$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/widget/EditText;)V
    .locals 0

    .line 392
    return-void
.end method

.method public d(Landroid/widget/EditText;)V
    .locals 7

    .line 350
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 352
    iget v0, p0, Lo/bgr$1;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 354
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->e(Lo/bgr;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_null:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 357
    return-void

    .line 360
    :cond_0
    iget-object v0, p0, Lo/bgr$1;->d:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->c(Lo/bgr;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 363
    return-void

    .line 365
    :cond_1
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->a(Lo/bgr;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x246

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 366
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    iget-object v1, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->i(Lo/bgr;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2, v6}, Lo/bgr;->a(Lo/bgr;JLjava/lang/String;)V

    goto :goto_0

    .line 368
    :cond_2
    iget v0, p0, Lo/bgr$1;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 371
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 373
    const-string v0, "NormalGroupEvent"

    const-string v1, "showEditDialog network is not connected"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->f(Lo/bgr;)V

    .line 375
    return-void

    .line 378
    :cond_3
    iget-object v0, p0, Lo/bgr$1;->d:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 380
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->c(Lo/bgr;)Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 381
    return-void

    .line 383
    :cond_4
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v0}, Lo/bgr;->a(Lo/bgr;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x246

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 384
    iget-object v0, p0, Lo/bgr$1;->b:Lo/bgr;

    iget-object v1, p0, Lo/bgr$1;->b:Lo/bgr;

    invoke-static {v1}, Lo/bgr;->i(Lo/bgr;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v3

    invoke-virtual {v3}, Lo/aoq;->a()J

    move-result-wide v3

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Lo/bgr;->e(Lo/bgr;JJLjava/lang/String;)V

    .line 386
    :cond_5
    :goto_0
    return-void
.end method
