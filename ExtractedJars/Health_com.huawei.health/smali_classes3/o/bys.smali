.class public Lo/bys;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lo/efy;

.field private c:Lo/efy;

.field private d:F

.field private e:F

.field private h:Landroid/widget/ProgressBar;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bys;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0, p1, p2}, Lo/bys;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    return-void
.end method

.method private c()V
    .locals 7

    .line 61
    iget v0, p0, Lo/bys;->k:I

    if-nez v0, :cond_0

    .line 62
    iget v0, p0, Lo/bys;->d:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->b(D)Ljava/lang/String;

    move-result-object v5

    .line 63
    iget v0, p0, Lo/bys;->e:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->b(D)Ljava/lang/String;

    move-result-object v6

    .line 64
    iget-object v0, p0, Lo/bys;->c:Lo/efy;

    invoke-virtual {p0}, Lo/bys;->getUnitResId()I

    move-result v1

    iget v2, p0, Lo/bys;->d:F

    float-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v0, p0, Lo/bys;->b:Lo/efy;

    invoke-virtual {v0, v6}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 67
    :cond_0
    iget v0, p0, Lo/bys;->d:F

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v5

    .line 68
    iget v0, p0, Lo/bys;->e:F

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v6

    .line 69
    iget-object v0, p0, Lo/bys;->c:Lo/efy;

    invoke-virtual {p0}, Lo/bys;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lo/bys;->getUnitResId()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, p0, Lo/bys;->b:Lo/efy;

    invoke-virtual {v0, v6}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :goto_0
    iget-object v0, p0, Lo/bys;->h:Landroid/widget/ProgressBar;

    iget v1, p0, Lo/bys;->d:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 74
    iget-object v0, p0, Lo/bys;->h:Landroid/widget/ProgressBar;

    iget v1, p0, Lo/bys;->e:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 75
    return-void
.end method

.method private d(D)D
    .locals 2

    .line 115
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/bys;->k:I

    if-nez v0, :cond_0

    .line 116
    const/4 v0, 0x3

    invoke-static {p1, p2, v0}, Lo/cxh;->a(DI)D

    move-result-wide v0

    return-wide v0

    .line 118
    :cond_0
    return-wide p1
.end method

.method private e(Landroid/content/Context;)V
    .locals 4

    .line 49
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_plan_progress:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 50
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_plan_progress:I

    invoke-virtual {p0, v0}, Lo/bys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/bys;->h:Landroid/widget/ProgressBar;

    .line 51
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_plan_progress:I

    invoke-virtual {p0, v0}, Lo/bys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bys;->b:Lo/efy;

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt_plan_total:I

    invoke-virtual {p0, v0}, Lo/bys;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bys;->c:Lo/efy;

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    iput v0, p0, Lo/bys;->a:I

    .line 55
    const-string v0, "ProgressView"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mProgressBar:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bys;->h:Landroid/widget/ProgressBar;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",mTxtProgress:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bys;->b:Lo/efy;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",mTxtMax:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bys;->c:Lo/efy;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
.end method

.method private e(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/bys;->e(Landroid/content/Context;)V

    .line 46
    return-void
.end method


# virtual methods
.method public getMax()F
    .locals 1

    .line 83
    iget v0, p0, Lo/bys;->d:F

    return v0
.end method

.method public getUnitResId()I
    .locals 1

    .line 97
    iget v0, p0, Lo/bys;->k:I

    if-nez v0, :cond_0

    .line 98
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    iput v0, p0, Lo/bys;->a:I

    goto :goto_0

    .line 100
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    iput v0, p0, Lo/bys;->a:I

    .line 102
    :goto_0
    iget v0, p0, Lo/bys;->a:I

    return v0
.end method

.method public setMax(F)V
    .locals 2

    .line 78
    float-to-double v0, p1

    invoke-direct {p0, v0, v1}, Lo/bys;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/bys;->d:F

    .line 79
    invoke-direct {p0}, Lo/bys;->c()V

    .line 80
    return-void
.end method

.method public setProgress(F)V
    .locals 2

    .line 87
    float-to-double v0, p1

    invoke-direct {p0, v0, v1}, Lo/bys;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lo/bys;->e:F

    .line 88
    invoke-direct {p0}, Lo/bys;->c()V

    .line 89
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 122
    iput p1, p0, Lo/bys;->k:I

    .line 123
    invoke-direct {p0}, Lo/bys;->c()V

    .line 124
    return-void
.end method

.method public setUnitResId(I)V
    .locals 0

    .line 92
    iput p1, p0, Lo/bys;->a:I

    .line 93
    return-void
.end method
