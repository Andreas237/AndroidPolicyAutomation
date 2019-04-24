.class public Lo/bxr;
.super Lo/bxm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxr$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bxm<Lo/bxr$d;>;"
    }
.end annotation


# instance fields
.field private final b:Lo/efy;

.field private final c:Landroid/view/View;

.field private final e:Lo/efy;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/bxm;-><init>(Landroid/view/View;)V

    .line 34
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxr;->b:Lo/efy;

    .line 35
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxr;->e:Lo/efy;

    .line 36
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_divider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxr;->c:Landroid/view/View;

    .line 37
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List<Lo/bxr$d;>;)V"
        }
    .end annotation

    .line 81
    new-instance v0, Lo/bxr$d;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_ltpw:I

    invoke-static {p0, p1}, Lo/bxr;->d(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v0, Lo/bxr$d;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_mcbrpw:I

    invoke-static {p0, p1}, Lo/bxr;->c(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v0, Lo/bxr$d;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_fitness_hcr:I

    invoke-static {p1}, Lo/bxr;->e(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List<Lo/bxr$d;>;)V"
        }
    .end annotation

    .line 64
    new-instance v0, Lo/bxr$d;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_report_tfr:I

    invoke-static {p1}, Lo/bxr;->c(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    new-instance v0, Lo/bxr$d;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_report_tlr:I

    invoke-static {p1}, Lo/bxr;->d(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_1br:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor1KM()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/bxr;->d(IILjava/util/List;)V

    .line 70
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_5br:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor5KM()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/bxr;->d(IILjava/util/List;)V

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_10br:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor10KM()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/bxr;->d(IILjava/util/List;)V

    .line 74
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_hmbr:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForHalfMarathon()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/bxr;->d(IILjava/util/List;)V

    .line 76
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_mbr:I

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForMarathon()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/bxr;->d(IILjava/util/List;)V

    .line 77
    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;
    .locals 4

    .line 117
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getMostCaloriePerWeek()F

    move-result v2

    invoke-static {v2}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;
    .locals 9

    .line 89
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getFarthestRunning()F

    move-result v3

    .line 91
    invoke-static {}, Lo/bzr;->c()I

    move-result v4

    .line 92
    float-to-double v0, v3

    invoke-static {v0, v1}, Lo/bzr;->i(D)D

    move-result-wide v5

    .line 93
    invoke-static {v5, v6}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v7

    .line 94
    float-to-int v0, v3

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-static {v4, v0, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 95
    return-object v8
.end method

.method private static d(I)Ljava/lang/String;
    .locals 3

    .line 103
    new-instance v0, Ljava/util/Date;

    int-to-long v1, p0

    invoke-static {v1, v2}, Lo/bxz;->a(J)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const-string v1, "HH:mm:ss"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;
    .locals 4

    .line 113
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestTimePerWeek()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;
    .locals 3

    .line 99
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getLongestRunning()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Lo/bxz;->a(J)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const-string v1, "HH:mm:ss"

    invoke-static {v0, v1}, Lo/bzv;->e(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(IILjava/util/List;)V
    .locals 2
    .param p0    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Lo/bxr$d;>;)V"
        }
    .end annotation

    .line 107
    if-eqz p1, :cond_0

    .line 108
    new-instance v0, Lo/bxr$d;

    invoke-static {p1}, Lo/bxr;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/bxr$d;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    :cond_0
    return-void
.end method

.method private static e(Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/String;
    .locals 4

    .line 121
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getHighestCompleteRate()F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/util/List<Lo/bxr$d;>;"
        }
    .end annotation

    .line 47
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 49
    invoke-static {p0, p2, v2}, Lo/bxr;->b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List;)V

    goto :goto_0

    .line 51
    :cond_0
    invoke-static {p0, p2, v2}, Lo/bxr;->a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/PlanStat;Ljava/util/List;)V

    .line 54
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bxr$d;

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, v3, Lo/bxr$d;->c:Z

    .line 59
    :cond_1
    return-object v2
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 26
    move-object v0, p1

    check-cast v0, Lo/bxr$d;

    invoke-virtual {p0, v0}, Lo/bxr;->c(Lo/bxr$d;)V

    return-void
.end method

.method public c(Lo/bxr$d;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lo/bxr;->b:Lo/efy;

    iget v1, p1, Lo/bxr$d;->e:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 42
    iget-object v0, p0, Lo/bxr;->e:Lo/efy;

    iget-object v1, p1, Lo/bxr$d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object v0, p0, Lo/bxr;->c:Landroid/view/View;

    iget-boolean v1, p1, Lo/bxr$d;->c:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    return-void
.end method
