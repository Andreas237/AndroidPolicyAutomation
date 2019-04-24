.class Lo/dms$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dms;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dms;


# direct methods
.method constructor <init>(Lo/dms;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lo/dms$4;->a:Lo/dms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 568
    const-string v0, "HWStressMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRelaxDetailsListToHiHealth onResult type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",obj = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    if-nez p1, :cond_1

    .line 570
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRelaxDetailsListToHiHealth success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dms;->e(Lo/dms;Z)Z

    .line 572
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->d(Lo/dms;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->b(Lo/dms;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    iget-object v1, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v1}, Lo/dms;->i(Lo/dms;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/dms;->d(Lo/dms;J)V

    .line 575
    :cond_0
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 576
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "save successful."

    const v2, 0x61a81

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 579
    :cond_1
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dms;->e(Lo/dms;Z)Z

    .line 580
    const-string v0, "HWStressMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRelaxDetailsListToHiHealth not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 582
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "save fail."

    const v2, 0x61a83

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 585
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->a(Lo/dms;)Lo/dms$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 586
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    invoke-static {v0}, Lo/dms;->a(Lo/dms;)Lo/dms$e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dms$e;->removeMessages(I)V

    .line 588
    :cond_3
    iget-object v0, p0, Lo/dms$4;->a:Lo/dms;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dms;->c(Lo/dms;Z)Z

    .line 589
    return-void
.end method
