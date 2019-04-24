.class Lo/dca$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dca;->d(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dca;


# direct methods
.method constructor <init>(Lo/dca;)V
    .locals 0

    .line 431
    iput-object p1, p0, Lo/dca$3;->b:Lo/dca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 434
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCpcResult onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dca$c;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->d(Lo/dca;)Lo/dca$c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dca$c;->removeMessages(I)V

    .line 438
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    const/4 v0, 0x0

    if-eq v0, p2, :cond_6

    .line 440
    move-object v4, p2

    check-cast v4, Lo/yj;

    .line 441
    invoke-virtual {v4}, Lo/yj;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 442
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-virtual {v4}, Lo/yj;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dca;->d(Lo/dca;Ljava/util/List;)Ljava/util/List;

    .line 444
    :cond_1
    invoke-virtual {v4}, Lo/yj;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 445
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-virtual {v4}, Lo/yj;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dca;->c(Lo/dca;Ljava/util/List;)Ljava/util/List;

    .line 448
    :cond_2
    invoke-virtual {v4}, Lo/yj;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 449
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-virtual {v4}, Lo/yj;->c()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dca;->e(Lo/dca;Ljava/util/List;)Ljava/util/List;

    .line 450
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lo/yj;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 452
    invoke-virtual {v4}, Lo/yj;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/yo;

    .line 453
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get cpc result err errorFrame:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/yo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Lo/yo;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 455
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 456
    const-string v0, "value"

    invoke-interface {v8, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ja:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v8, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 450
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 459
    :cond_3
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->b(Lo/dca;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->a(Lo/dca;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 460
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    const/4 v1, 0x3

    iput v1, v0, Lo/dca;->a:I

    .line 461
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->e(Lo/dca;Z)Z

    .line 462
    return-void

    .line 465
    :cond_4
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get cpc result no error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    :cond_5
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 469
    const-string v0, "value"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ja:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 472
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->i(Lo/dca;)V

    .line 473
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v0}, Lo/dca;->h(Lo/dca;)Lo/dbz;

    move-result-object v0

    iget-object v1, p0, Lo/dca$3;->b:Lo/dca;

    iget-object v2, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v2}, Lo/dca;->b(Lo/dca;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lo/dca$3;->b:Lo/dca;

    invoke-static {v3}, Lo/dca;->a(Lo/dca;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/dbz;->e(Lo/dca;Ljava/util/List;Ljava/util/List;)V

    .line 474
    goto :goto_1

    .line 475
    :cond_6
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get cpc result err"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    const/4 v1, 0x3

    iput v1, v0, Lo/dca;->a:I

    .line 478
    :goto_1
    iget-object v0, p0, Lo/dca$3;->b:Lo/dca;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dca;->e(Lo/dca;Z)Z

    .line 479
    return-void
.end method
