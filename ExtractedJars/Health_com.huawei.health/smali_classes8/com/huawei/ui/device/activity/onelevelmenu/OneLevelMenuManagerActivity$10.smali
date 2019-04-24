.class Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)V
    .locals 0

    .line 485
    iput-object p1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 488
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===getDataFromBand isTimeout="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->o(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 491
    return-void

    .line 493
    :cond_0
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===getDataFromBand err_code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "objData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    const/4 v0, 0x0

    if-ne v0, p1, :cond_7

    .line 495
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter getDataFromBand():mOneMenuHandler="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/Map;

    iput-object v1, v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 500
    goto :goto_0

    .line 498
    :catch_0
    move-exception v4

    .line 499
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "catch (Exception e)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b:Ljava/util/Map;

    const-string v1, "all"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [B

    .line 503
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 504
    return-void

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 507
    const/4 v5, 0x0

    :goto_1
    array-length v0, v4

    if-ge v5, v0, :cond_3

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v1

    aget-byte v2, v4, v5

    invoke-virtual {v1, v2}, Lo/eod;->a(B)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eod;->e(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 509
    goto :goto_2

    .line 511
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v1

    aget-byte v2, v4, v5

    invoke-virtual {v1, v2}, Lo/eod;->a(B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 513
    :cond_3
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===getDataFromBand mAllList="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->m(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->b:Ljava/util/Map;

    const-string v1, "open"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [B

    .line 515
    const/4 v0, 0x0

    if-ne v0, v5, :cond_4

    .line 516
    return-void

    .line 518
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 520
    const/4 v6, 0x0

    :goto_3
    array-length v0, v5

    if-ge v6, v0, :cond_6

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v1

    aget-byte v2, v5, v6

    invoke-virtual {v1, v2}, Lo/eod;->a(B)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eod;->e(I)Z

    move-result v0

    if-nez v0, :cond_5

    .line 522
    goto :goto_4

    .line 524
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v1

    aget-byte v2, v5, v6

    invoke-virtual {v1, v2}, Lo/eod;->a(B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->h(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Lo/eod;

    move-result-object v1

    aget-byte v2, v5, v6

    invoke-virtual {v1, v2}, Lo/eod;->a(B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 527
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->f(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 529
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===getDataFromBand mMenuTables="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->c(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    const-string v0, "OneLevelMenuManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===getDataFromBand mMenuItemFromBandTables="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity$10;->a:Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;->u(Lcom/huawei/ui/device/activity/onelevelmenu/OneLevelMenuManagerActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    :cond_7
    return-void
.end method
