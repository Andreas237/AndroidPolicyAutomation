.class public Lo/etl;
.super Lo/etm;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Lo/etm;-><init>(Landroid/content/Context;)V

    .line 35
    const/16 v0, 0x102

    iput v0, p0, Lo/etl;->e:I

    .line 36
    const-string v0, "Track_Run_Distance_Sum"

    iput-object v0, p0, Lo/etl;->h:Ljava/lang/String;

    .line 37
    const-string v0, "Track_Run_Distance_Sum"

    iput-object v0, p0, Lo/etl;->f:Ljava/lang/String;

    .line 38
    const-string v0, "Track_Run_Count_Sum"

    iput-object v0, p0, Lo/etl;->n:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 5

    .line 78
    const/16 v0, 0x8

    if-gt p1, v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/etl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_run_achievementtarget_bad:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etl;->o:Ljava/lang/String;

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Lo/etl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_run_achievementtarget_good:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x1e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etl;->o:Ljava/lang/String;

    .line 83
    :goto_0
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 48
    new-instance v3, Ljava/util/ArrayList;

    const/16 v0, 0x1e

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v8, v0, :cond_3

    .line 52
    iget-object v0, p0, Lo/etl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    rsub-int/lit8 v0, v8, 0x1e

    add-int/lit8 v6, v0, -0x1

    goto :goto_1

    .line 55
    :cond_0
    move v6, v8

    .line 57
    :goto_1
    iget-wide v0, p0, Lo/etl;->g:J

    invoke-static {v0, v1, v8}, Lo/ffk;->c(JI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 58
    if-eqz v9, :cond_2

    .line 59
    invoke-virtual {p0, v9}, Lo/etl;->d(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v4

    .line 60
    new-instance v0, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v1, v6

    invoke-direct {v0, v1, v4}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    cmpg-float v0, v5, v4

    if-gez v0, :cond_1

    .line 62
    move v5, v4

    .line 64
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 66
    :cond_2
    new-instance v0, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v1, v6

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 69
    :cond_3
    invoke-virtual {p0, v7}, Lo/etl;->a(I)V

    .line 70
    iput v5, p0, Lo/etl;->l:F

    .line 71
    iget-object v0, p0, Lo/etl;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 72
    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 74
    :cond_4
    iput-object v3, p0, Lo/etl;->k:Ljava/util/List;

    .line 75
    return-void
.end method

.method protected b()V
    .locals 0

    .line 43
    invoke-virtual {p0}, Lo/etl;->h()V

    .line 44
    return-void
.end method

.method protected b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 87
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lo/etl;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/etl;->e(D)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etl;->m:Ljava/lang/String;

    .line 89
    .line 90
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "Track_Run_Count_Sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 91
    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hihealth/HiHealthData;

    const-string v3, "Track_Run_Abnormal_Count_Sum"

    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    sub-double/2addr v0, v2

    .line 89
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/etl;->p:Ljava/lang/String;

    .line 95
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->home_item_layout_trend:I

    if-ne v0, v1, :cond_0

    .line 100
    const-string v0, "PLGACHIEVE_RunTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show run history detail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    new-instance v4, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    const-string v0, "sportType"

    iget v1, p0, Lo/etl;->e:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 103
    iget-object v0, p0, Lo/etl;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 104
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 105
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/etl;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->cc:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 109
    :cond_0
    return-void
.end method
