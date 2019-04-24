.class public Lo/bxq;
.super Lo/bxm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxq$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bxm<Lo/bxq$e;>;"
    }
.end annotation


# instance fields
.field private final a:Lo/efy;

.field private final b:Lo/efy;

.field private final c:Landroid/widget/ImageView;

.field private final d:Lo/efy;

.field private final e:Landroid/widget/RatingBar;

.field private final f:Lo/efy;

.field private final g:Lo/efy;

.field private final i:Lo/efy;

.field private final k:Lo/efy;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Lo/bxm;-><init>(Landroid/view/View;)V

    .line 51
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_user_pic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bxq;->c:Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_rating:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lo/bxq;->e:Landroid/widget/RatingBar;

    .line 53
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_train_times:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->d:Lo/efy;

    .line 54
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->b:Lo/efy;

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_trains:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->a:Lo/efy;

    .line 56
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->f:Lo/efy;

    .line 57
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_calorie:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->k:Lo/efy;

    .line 58
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name3:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->g:Lo/efy;

    .line 59
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_rate:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxq;->i:Lo/efy;

    .line 60
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanRecord;)Lo/bxq$e;
    .locals 10

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v8, 0x0

    .line 85
    if-eqz p2, :cond_0

    .line 86
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v8

    .line 87
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualCalorie()F

    move-result v6

    .line 88
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    .line 89
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v5

    .line 92
    :cond_0
    new-instance v9, Lo/bxq$e;

    invoke-direct {v9}, Lo/bxq$e;-><init>()V

    .line 93
    invoke-static {}, Lo/bxq;->b()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v9, Lo/bxq$e;->e:Landroid/net/Uri;

    .line 94
    invoke-static {v8}, Lo/bya;->e(F)I

    move-result v0

    iput v0, v9, Lo/bxq$e;->c:I

    .line 95
    invoke-static {p0, p1}, Lo/bxq;->b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Lo/bxq$e;->b:Ljava/lang/CharSequence;

    .line 97
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_myplan_traned:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Lo/bxq$e;->a:Ljava/lang/CharSequence;

    .line 98
    const-string v0, "\\d"

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_finess_days:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v5

    .line 99
    invoke-static {v3, v4}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v5, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    .line 98
    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, v9, Lo/bxq$e;->d:Ljava/lang/CharSequence;

    .line 101
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_1

    .line 102
    invoke-static {p0, v6, v7, v9}, Lo/bxq;->a(Landroid/content/Context;FFLo/bxq$e;)V

    goto :goto_0

    .line 104
    :cond_1
    invoke-static {p0, v6, v8, v9}, Lo/bxq;->d(Landroid/content/Context;FFLo/bxq$e;)V

    .line 106
    :goto_0
    return-object v9
.end method

.method private static a(Landroid/content/Context;FFLo/bxq$e;)V
    .locals 6

    .line 111
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_distance:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->i:Ljava/lang/CharSequence;

    .line 112
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    float-to-int v1, p2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    float-to-double v3, p2

    .line 113
    invoke-static {v3, v4}, Lo/bzr;->i(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Lo/bzr;->b(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 112
    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 114
    const-string v0, "\\d+.\\d+|\\d+"

    sget v1, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {p0, v0, v5, v1, v2}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->k:Ljava/lang/CharSequence;

    .line 117
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_traintime:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->h:Ljava/lang/CharSequence;

    .line 118
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, v0}, Lo/bzx;->e(Landroid/content/Context;F)I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 119
    invoke-static {p1}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 118
    invoke-static {v0, v1, p0, v2}, Lo/bxy;->e(IILandroid/content/Context;[Ljava/lang/Object;)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->f:Ljava/lang/CharSequence;

    .line 120
    return-void
.end method

.method private static b()Landroid/net/Uri;
    .locals 7

    .line 135
    const/4 v4, 0x0

    .line 136
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v5

    .line 137
    if-eqz v5, :cond_0

    .line 138
    invoke-interface {v5}, Lo/brr;->a()Lo/brw;

    move-result-object v6

    .line 139
    if-eqz v6, :cond_0

    .line 140
    invoke-interface {v6}, Lo/brw;->getPortrait()Landroid/net/Uri;

    move-result-object v4

    .line 143
    :cond_0
    const-string v0, "ReportHeaderHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserPic: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-object v4
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;)Ljava/lang/String;
    .locals 7

    .line 148
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 149
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 151
    const-string v5, "yyyy-MM-dd"

    .line 152
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 153
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 156
    :cond_0
    const-string v6, "yyyy-MM-dd"

    .line 157
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 158
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 161
    :cond_1
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 162
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 164
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;FFLo/bxq$e;)V
    .locals 5

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_traintime:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->i:Ljava/lang/CharSequence;

    .line 125
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p0, v0}, Lo/bzx;->e(Landroid/content/Context;F)I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 126
    invoke-static {p1}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 125
    invoke-static {v0, v1, p0, v2}, Lo/bxy;->e(IILandroid/content/Context;[Ljava/lang/Object;)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->k:Ljava/lang/CharSequence;

    .line 129
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_coach_rate:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->h:Ljava/lang/CharSequence;

    .line 130
    const-string v0, "\\d+.\\d+|\\d+"

    float-to-double v1, p2

    .line 131
    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_repirt_big:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_report_sma:I

    .line 130
    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p3, Lo/bxq$e;->f:Ljava/lang/CharSequence;

    .line 132
    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 35
    move-object v0, p1

    check-cast v0, Lo/bxq$e;

    invoke-virtual {p0, v0}, Lo/bxq;->c(Lo/bxq$e;)V

    return-void
.end method

.method public c(Lo/bxq$e;)V
    .locals 4

    .line 63
    iget-object v0, p0, Lo/bxq;->e:Landroid/widget/RatingBar;

    iget v1, p1, Lo/bxq$e;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    .line 64
    iget-object v0, p0, Lo/bxq;->d:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v0, p0, Lo/bxq;->b:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lo/bxq;->a:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v0, p0, Lo/bxq;->f:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->i:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v0, p0, Lo/bxq;->k:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->k:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lo/bxq;->g:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->h:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, p0, Lo/bxq;->i:Lo/efy;

    iget-object v1, p1, Lo/bxq$e;->f:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, p1, Lo/bxq$e;->e:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 73
    iget-object v0, p1, Lo/bxq$e;->e:Landroid/net/Uri;

    iget-object v1, p0, Lo/bxq;->c:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/cam;->b(Landroid/net/Uri;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lo/bxq;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 76
    const-string v0, "ReportHeaderHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    :goto_0
    return-void
.end method
