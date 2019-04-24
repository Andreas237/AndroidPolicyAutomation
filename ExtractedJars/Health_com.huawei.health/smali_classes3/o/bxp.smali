.class public Lo/bxp;
.super Lo/bxm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxp$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bxm<Lo/bxp$e;>;"
    }
.end annotation


# instance fields
.field private final a:Lo/efy;

.field private final c:Lo/efy;

.field private e:Lo/egv;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 36
    invoke-direct {p0, p1}, Lo/bxm;-><init>(Landroid/view/View;)V

    .line 37
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_improved:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxp;->c:Lo/efy;

    .line 38
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_recommended:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxp;->a:Lo/efy;

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxp;->c(Landroid/content/Context;)V

    .line 41
    iget-object v0, p0, Lo/bxp;->c:Lo/efy;

    new-instance v1, Lo/bxp$2;

    invoke-direct {v1, p0}, Lo/bxp$2;-><init>(Lo/bxp;)V

    invoke-virtual {v0, v1}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanRecord;)Ljava/lang/CharSequence;
    .locals 10

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 74
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 75
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    invoke-static {v0}, Lo/bya;->d(I)I

    move-result v7

    .line 76
    invoke-static {p0}, Lo/bya;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v8

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->getDifficulty()I

    move-result v1

    invoke-static {v0, v1}, Lo/bya;->d(II)I

    move-result v7

    .line 79
    invoke-static {p0}, Lo/bya;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v8

    .line 83
    :goto_0
    if-eqz p2, :cond_1

    .line 84
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v0

    invoke-static {v0}, Lo/bya;->e(F)I

    move-result v6

    .line 87
    :cond_1
    const/4 v0, 0x4

    if-lt v6, v0, :cond_2

    .line 88
    add-int/lit8 v7, v7, 0x1

    .line 90
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 91
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 93
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 94
    move-object v0, p0

    move-object v1, v9

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_next_plan_recommend:I

    move-object v3, v9

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_report_smasize:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_report_bigsize:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lcom/huawei/health/suggestion/model/PlanStat;)I
    .locals 5

    .line 123
    const/4 v2, 0x0

    .line 124
    if-eqz p0, :cond_0

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForFirst1KM()I

    move-result v0

    int-to-float v3, v0

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordFor1KM()I

    move-result v0

    int-to-float v4, v0

    .line 127
    const v0, 0x38d1b717    # 1.0E-4f

    cmpl-float v0, v3, v0

    if-lez v0, :cond_0

    .line 128
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, v4

    div-float/2addr v0, v3

    const/high16 v1, 0x42c80000    # 100.0f

    sub-float v0, v1, v0

    float-to-int v2, v0

    .line 131
    :cond_0
    return v2
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/CharSequence;
    .locals 10

    .line 99
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_0
    const/4 v7, 0x0

    .line 104
    invoke-static {p2}, Lo/bxp;->b(Lcom/huawei/health/suggestion/model/PlanStat;)I

    move-result v8

    .line 105
    const-string v0, "ReportFootHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "improved:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    if-lez v8, :cond_1

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_achievement_info2:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v8

    .line 108
    invoke-static {v3, v4}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 109
    invoke-static {}, Lo/bzr;->c()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    invoke-static {v5, v6}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    invoke-static {v3, v5, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 107
    invoke-static {p0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 110
    const-string v0, "\\d+%"

    sget v1, Lcom/huawei/health/suggestion/R$style;->sug_report_key:I

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_report_smasize:I

    .line 111
    invoke-static {p0, v0, v9, v1, v2}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    const-string v1, "-"

    sget v2, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_help_gray:I

    .line 110
    invoke-static {p0, v0, v1, v2}, Lo/buk;->b(Landroid/content/Context;Landroid/text/SpannableString;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v7

    .line 114
    :cond_1
    return-object v7
.end method

.method private c(Landroid/content/Context;)V
    .locals 8

    .line 135
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 137
    new-instance v7, Lo/egv$b;

    invoke-direct {v7, p1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 138
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_run_achievement_dialog_reminder:I

    invoke-virtual {v7, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_achievement_dialog_info2:I

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v6, v2, v3

    const/4 v3, 0x2

    aput-object v6, v2, v3

    .line 139
    invoke-static {p1, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v2, Lo/bxp$4;

    invoke-direct {v2, p0}, Lo/bxp$4;-><init>(Lo/bxp;)V

    .line 140
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/bxp;->e:Lo/egv;

    .line 147
    return-void
.end method

.method static synthetic d(Lo/bxp;)Lo/egv;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bxp;->e:Lo/egv;

    return-object v0
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;Lcom/huawei/health/suggestion/model/PlanRecord;)Lo/bxp$e;
    .locals 2

    .line 62
    new-instance v1, Lo/bxp$e;

    invoke-direct {v1}, Lo/bxp$e;-><init>()V

    .line 63
    invoke-static {p0, p1, p2}, Lo/bxp;->b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanStat;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v1, Lo/bxp$e;->a:Ljava/lang/CharSequence;

    .line 64
    invoke-static {p0, p1, p3}, Lo/bxp;->a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanRecord;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v1, Lo/bxp$e;->e:Ljava/lang/CharSequence;

    .line 65
    return-object v1
.end method


# virtual methods
.method public b(Lo/bxp$e;)V
    .locals 2

    .line 51
    iget-object v0, p1, Lo/bxp$e;->a:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    .line 52
    iget-object v0, p0, Lo/bxp;->c:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Lo/bxp;->c:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 55
    iget-object v0, p0, Lo/bxp;->c:Lo/efy;

    iget-object v1, p1, Lo/bxp$e;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 58
    :goto_0
    iget-object v0, p0, Lo/bxp;->a:Lo/efy;

    iget-object v1, p1, Lo/bxp$e;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 26
    move-object v0, p1

    check-cast v0, Lo/bxp$e;

    invoke-virtual {p0, v0}, Lo/bxp;->b(Lo/bxp$e;)V

    return-void
.end method
