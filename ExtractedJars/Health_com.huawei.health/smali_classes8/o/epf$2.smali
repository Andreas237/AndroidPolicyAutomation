.class Lo/epf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/epf;


# direct methods
.method constructor <init>(Lo/epf;)V
    .locals 0

    .line 1470
    iput-object p1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1472
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "2 WLAN_AUTO_UPDATE err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ; objData = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    if-ne v2, p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1473
    const/4 v4, 0x0

    .line 1474
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 1475
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 1476
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1477
    const/4 v4, 0x0

    goto :goto_1

    .line 1479
    :cond_1
    const/4 v4, 0x1

    .line 1482
    :cond_2
    :goto_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get auto ota checkbox status,isAutoupdate = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1483
    if-nez v4, :cond_7

    .line 1485
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 1486
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1487
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->f(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1488
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->f(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1489
    :cond_3
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is otaing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1490
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 1491
    :cond_4
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1492
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device ota is showing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1493
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    goto/16 :goto_2

    .line 1495
    :cond_5
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can show dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1496
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 1497
    const-string v0, "name"

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->t(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1498
    const-string v0, "size"

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->u(Lo/epf;)I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1499
    const-string v0, "message"

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->s(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1500
    const-string v0, "show"

    iget-object v1, p0, Lo/epf$2;->a:Lo/epf;

    invoke-static {v1}, Lo/epf;->r(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 1501
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1502
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1504
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1505
    goto :goto_2

    .line 1507
    :cond_6
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsNeedShowDialog have no new version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1508
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1510
    :goto_2
    goto :goto_3

    .line 1512
    :cond_7
    iget-object v0, p0, Lo/epf$2;->a:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1514
    :goto_3
    return-void
.end method
