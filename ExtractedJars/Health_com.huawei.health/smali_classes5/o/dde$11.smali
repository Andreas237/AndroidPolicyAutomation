.class Lo/dde$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;I)V
    .locals 0

    .line 4998
    iput-object p1, p0, Lo/dde$11;->d:Lo/dde;

    iput p2, p0, Lo/dde$11;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 6

    .line 5000
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 5001
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8d44\u6e90\u6587\u4ef6(\u5355\u4e2a)\u4e0b\u8f7d\u6210\u529f "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5002
    iget v0, p0, Lo/dde$11;->c:I

    iget-object v1, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->l(Lo/dde;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-gt v0, v1, :cond_0

    iget v0, p0, Lo/dde$11;->c:I

    if-gez v0, :cond_1

    .line 5003
    :cond_0
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "index is out wearPluginSize."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5004
    return-void

    .line 5006
    :cond_1
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->l(Lo/dde;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/dde$11;->c:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ear;

    invoke-virtual {v1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v4

    .line 5007
    invoke-static {v4}, Lo/dda;->c(Lo/eav;)V

    .line 5010
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v0}, Lo/dde;->p(Lo/dde;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->l(Lo/dde;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/dde$11;->c:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5011
    iget v0, p0, Lo/dde$11;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v1}, Lo/dde;->l(Lo/dde;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 5012
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    iget v1, p0, Lo/dde$11;->c:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/dde;->a(Lo/dde;I)V

    goto :goto_0

    .line 5015
    :cond_2
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v0}, Lo/dde;->m(Lo/dde;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5016
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dde;->c(Lo/dde;Z)Z

    .line 5017
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    const-string v1, "SMART_WATCH"

    invoke-static {v0, v1}, Lo/dde;->b(Lo/dde;Ljava/lang/String;)V

    .line 5019
    :cond_3
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8d44\u6e90\u6587\u4ef6\uff08\u5168\u90e8\uff09\u4e0b\u8f7d\u6210\u529f "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5020
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 5021
    const-string v0, "com.huawei.health.action.ACTION_BACKGROUND_DOWNLOAD_DEVICE"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5022
    iget-object v0, p0, Lo/dde$11;->d:Lo/dde;

    invoke-static {v0}, Lo/dde;->f(Lo/dde;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 5023
    return-void

    .line 5026
    :cond_4
    :goto_0
    return-void
.end method
