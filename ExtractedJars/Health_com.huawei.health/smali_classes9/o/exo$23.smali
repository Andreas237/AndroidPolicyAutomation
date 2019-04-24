.class Lo/exo$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->e(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;)V
    .locals 0

    .line 552
    iput-object p1, p0, Lo/exo$23;->c:Lo/exo;

    iput-object p2, p0, Lo/exo$23;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 555
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetTodayFitnessTotalData getTodayFitnessTotalData onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 557
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 558
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 559
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 560
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSportType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 563
    :sswitch_0
    goto :goto_1

    .line 566
    :sswitch_1
    goto :goto_1

    .line 569
    :sswitch_2
    goto :goto_1

    .line 572
    :sswitch_3
    goto :goto_1

    .line 575
    :sswitch_4
    goto :goto_1

    .line 577
    :sswitch_5
    iget-object v0, p0, Lo/exo$23;->c:Lo/exo;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->d(Lo/exo;I)I

    .line 578
    iget-object v0, p0, Lo/exo$23;->c:Lo/exo;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->h(Lo/exo;I)I

    .line 579
    iget-object v0, p0, Lo/exo$23;->c:Lo/exo;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->f(Lo/exo;I)I

    .line 583
    iget-object v0, p0, Lo/exo$23;->c:Lo/exo;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->i(Lo/exo;I)I

    .line 584
    iget-object v0, p0, Lo/exo$23;->c:Lo/exo;

    iget-object v1, p0, Lo/exo$23;->c:Lo/exo;

    invoke-static {v1}, Lo/exo;->d(Lo/exo;)I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    invoke-static {v0, v1}, Lo/exo;->k(Lo/exo;I)I

    .line 558
    .line 590
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 596
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetTodayFitnessTotalData getTodayFitnessTotalData onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ,  mTodayTotalCalories = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$23;->c:Lo/exo;

    .line 597
    invoke-static {v3}, Lo/exo;->h(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ,  mTodayTotalStep = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$23;->c:Lo/exo;

    .line 598
    invoke-static {v3}, Lo/exo;->f(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ,  mTodayTotalDistance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$23;->c:Lo/exo;

    .line 599
    invoke-static {v3}, Lo/exo;->k(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ,  mTodayFloorDistance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$23;->c:Lo/exo;

    .line 600
    invoke-static {v3}, Lo/exo;->d(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "    ,  mTodayFloorCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exo$23;->c:Lo/exo;

    .line 601
    invoke-static {v3}, Lo/exo;->i(Lo/exo;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 596
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    :cond_1
    iget-object v0, p0, Lo/exo$23;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 605
    iget-object v0, p0, Lo/exo$23;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 607
    :cond_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0xdd -> :sswitch_5
    .end sparse-switch
.end method
