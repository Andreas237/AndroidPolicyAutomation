.class Lo/exp$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->b(JLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic e:Lo/exp;


# direct methods
.method constructor <init>(Lo/exp;Lo/egg;)V
    .locals 0

    .line 569
    iput-object p1, p0, Lo/exp$12;->e:Lo/exp;

    iput-object p2, p0, Lo/exp$12;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 8

    .line 572
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 573
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepDetailTotalData  xxxx requestGetSleepDetailData 0003 onResponse null != objData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    :cond_0
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSleepDetailTotalData xxxx requestGetSleepDetailData code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 579
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 581
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 582
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 583
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->b(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getTotalSleepTime()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->b(Lo/exp;I)I

    .line 584
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->c(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepTime()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->e(Lo/exp;I)I

    .line 585
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->e(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getShallowSleepTime()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->c(Lo/exp;I)I

    .line 586
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->h(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupDuration()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->a(Lo/exp;I)I

    .line 587
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->f(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSlumberSleepTime()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->d(Lo/exp;I)I

    .line 588
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    iget-object v1, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v1}, Lo/exp;->g(Lo/exp;)I

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getNoonSleepTime()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->k(Lo/exp;I)I

    .line 589
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeupTimes()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->h(Lo/exp;I)I

    .line 590
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getDeepSleepPart()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->g(Lo/exp;I)I

    .line 591
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getSnoreFreq()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->i(Lo/exp;I)I

    .line 592
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getScore()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->f(Lo/exp;I)I

    .line 593
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getFallTime()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->o(Lo/exp;I)I

    .line 594
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getWakeUpTime()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->l(Lo/exp;I)I

    .line 595
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getType()I

    move-result v1

    invoke-static {v0, v1}, Lo/exp;->m(Lo/exp;I)I

    .line 596
    iget-object v0, p0, Lo/exp$12;->e:Lo/exp;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->getValidData()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/exp;->b(Lo/exp;D)D

    .line 581
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 598
    :cond_1
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    invoke-static {v3}, Lo/exp;->k(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    const-string v0, "FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSleepDetailTotalData requestGetSleepDetailData xxxx  TT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 600
    invoke-static {v3}, Lo/exp;->b(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " DT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 601
    invoke-static {v3}, Lo/exp;->c(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ST = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 602
    invoke-static {v3}, Lo/exp;->e(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " WD = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 603
    invoke-static {v3}, Lo/exp;->h(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ST = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 604
    invoke-static {v3}, Lo/exp;->f(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " WT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 605
    invoke-static {v3}, Lo/exp;->i(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " DP = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 606
    invoke-static {v3}, Lo/exp;->m(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " SF = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 607
    invoke-static {v3}, Lo/exp;->l(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " S = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 608
    invoke-static {v3}, Lo/exp;->o(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " FT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 609
    invoke-static {v3}, Lo/exp;->p(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " WT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 610
    invoke-static {v3}, Lo/exp;->n(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " DT = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 611
    invoke-static {v3}, Lo/exp;->g(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ST = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 612
    invoke-static {v3}, Lo/exp;->k(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " VD = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exp$12;->e:Lo/exp;

    .line 613
    invoke-static {v3}, Lo/exp;->t(Lo/exp;)D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 599
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    :cond_2
    iget-object v0, p0, Lo/exp$12;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 618
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepDetailTotalData requestGetSleepDetailData updateResponse onResponse !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lo/exp$12;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 622
    :cond_3
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSleepDetailTotalData requestGetSleepDetailData 0003 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    return-void
.end method
