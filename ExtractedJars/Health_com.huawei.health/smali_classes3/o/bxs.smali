.class public Lo/bxs;
.super Lo/bxm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxs$e;,
        Lo/bxs$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bxm<Lo/bxs$e;>;"
    }
.end annotation


# instance fields
.field private final a:Lo/efy;

.field private final b:Lo/bwo;

.field private final d:Lo/efy;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Lo/bxm;-><init>(Landroid/view/View;)V

    .line 54
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxs;->a:Lo/efy;

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_sub_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxs;->d:Lo/efy;

    .line 56
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_chart:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwo;

    iput-object v0, p0, Lo/bxs;->b:Lo/bwo;

    .line 57
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bwn;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/Date;Ljava/util/Calendar;I)Ljava/util/List<Lo/bwn;>;"
        }
    .end annotation

    .line 284
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 285
    invoke-static/range {p0 .. p5}, Lo/bxs;->d(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)V

    .line 287
    :cond_0
    return-object p1
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;ILcom/huawei/health/suggestion/model/WorkoutRecord;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bwn;>;ILcom/huawei/health/suggestion/model/WorkoutRecord;I)V"
        }
    .end annotation

    .line 304
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/bwn;

    .line 305
    if-nez p2, :cond_0

    .line 306
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Lo/bwn;->b(I)V

    .line 307
    invoke-virtual {v7}, Lo/bwn;->q()F

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lo/bwn;->h(F)Lo/bwn;

    .line 308
    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 309
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Lo/bzr;->i(D)D

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    goto/16 :goto_1

    .line 311
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 312
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/bwn;->b(I)V

    .line 313
    invoke-virtual {v7}, Lo/bwn;->q()F

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lo/bwn;->h(F)Lo/bwn;

    .line 314
    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lo/bwn;->k(F)Lo/bwn;

    .line 315
    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->k(D)F

    move-result v0

    invoke-virtual {v7, v0}, Lo/bwn;->i(F)Lo/bwn;

    .line 316
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lo/bwn;->s()F

    move-result v2

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/bwn;->b(Ljava/lang/String;)Lo/bwn;

    goto :goto_1

    .line 318
    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 319
    invoke-virtual {p3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireOxygen()D

    move-result-wide v0

    double-to-int v8, v0

    .line 320
    invoke-static {v8}, Lo/bxs;->b(I)I

    move-result v8

    .line 321
    invoke-virtual {v7}, Lo/bwn;->n()F

    move-result v0

    int-to-float v1, v8

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {v7}, Lo/bwn;->n()F

    move-result v0

    goto :goto_0

    :cond_2
    int-to-float v0, v8

    :goto_0
    invoke-virtual {v7, v0}, Lo/bwn;->i(F)Lo/bwn;

    .line 322
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Lo/bwn;->b(I)V

    .line 324
    :cond_3
    :goto_1
    return-void
.end method

.method private static a(Ljava/util/List;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;I)Z"
        }
    .end annotation

    .line 300
    if-ltz p1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(I)I
    .locals 4

    .line 327
    int-to-double v0, p0

    const-wide v2, 0x40d2492492492492L    # 18724.571428571428

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 328
    int-to-double v0, p0

    invoke-static {v0, v1}, Lo/bxs;->c(D)I

    move-result p0

    .line 330
    :cond_0
    return p0
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Lo/bxs$a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Lo/bxs$a;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 199
    new-instance v4, Lo/bxs$a;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/bxs$a;-><init>(Lo/bxs$2;)V

    .line 200
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, v4, Lo/bxs$a;->e:Ljava/util/Date;

    .line 203
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, v4, Lo/bxs$a;->c:Ljava/util/Date;

    .line 204
    iget-object v0, v4, Lo/bxs$a;->e:Ljava/util/Date;

    iget-object v1, v4, Lo/bxs$a;->c:Ljava/util/Date;

    invoke-static {v0, v1}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v0

    iput v0, v4, Lo/bxs$a;->b:I

    .line 205
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_timeformart_mmmd:I

    .line 206
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 205
    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, v4, Lo/bxs$a;->a:Ljava/text/SimpleDateFormat;

    goto :goto_0

    .line 208
    :cond_0
    const-string v0, "ReportChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "plan date is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :goto_0
    return-object v4
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;Ljava/util/List;)Lo/bxs$e;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Lo/bxs$a;Ljava/util/List<Lo/bwn;>;)Lo/bxs$e;"
        }
    .end annotation

    .line 146
    move-object v0, p0

    move-object v1, p3

    move-object v2, p1

    iget-object v3, p2, Lo/bxs$a;->e:Ljava/util/Date;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/bxs;->a(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v6

    .line 148
    invoke-static {v6}, Lo/bxs;->e(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    invoke-static {p0, v6}, Lo/bxs;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 154
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_vo2max:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_report_vo:I

    .line 155
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_report_vo2:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_report_normal:I

    .line 154
    invoke-static {p0, v0, v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 157
    new-instance v8, Lo/bxs$e;

    invoke-direct {v8}, Lo/bxs$e;-><init>()V

    .line 158
    iput-object v7, v8, Lo/bxs$e;->d:Ljava/lang/CharSequence;

    .line 159
    const/4 v0, 0x2

    iput v0, v8, Lo/bxs$e;->b:I

    .line 160
    const/16 v0, 0x1e

    iput v0, v8, Lo/bxs$e;->c:I

    .line 161
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_event_linewidth:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v8, Lo/bxs$e;->o:F

    .line 162
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_event_line_pointradio:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v8, Lo/bxs$e;->p:F

    .line 163
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v8, Lo/bxs$e;->g:I

    .line 164
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v8, Lo/bxs$e;->h:I

    .line 165
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_report_vo_sgreen:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v8, Lo/bxs$e;->i:I

    .line 166
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v8, Lo/bxs$e;->k:I

    .line 167
    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_vo_shader1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 168
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_vo_shader2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, v8, Lo/bxs$e;->f:[I

    .line 169
    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_vo_sgreen:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 170
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_vo_tgreen:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, v8, Lo/bxs$e;->l:[I

    .line 171
    iput-object v6, v8, Lo/bxs$e;->n:Ljava/util/List;

    .line 172
    return-object v8
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 229
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 232
    :cond_0
    return-void
.end method

.method private static b(Ljava/util/Date;Ljava/util/Date;Ljava/text/SimpleDateFormat;ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Date;Ljava/util/Date;Ljava/text/SimpleDateFormat;ILjava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 235
    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v0, p3, 0x1

    if-ge v2, v0, :cond_2

    .line 236
    const/4 v3, 0x0

    .line 237
    if-nez v2, :cond_0

    .line 238
    new-instance v3, Lo/bwn;

    invoke-virtual {p2, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v3, v1, v0, v2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    goto :goto_1

    .line 239
    :cond_0
    if-ne v2, p3, :cond_1

    .line 240
    new-instance v3, Lo/bwn;

    invoke-virtual {p2, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v3, v1, v0, v2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    goto :goto_1

    .line 242
    :cond_1
    new-instance v3, Lo/bwn;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v3, v1, v0, v2}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 244
    :goto_1
    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 246
    :cond_2
    return-void
.end method

.method private static c(D)I
    .locals 2

    .line 354
    const-wide/high16 v0, 0x400c000000000000L    # 3.5

    mul-double/2addr v0, p0

    double-to-int v0, v0

    const/high16 v1, 0x10000

    div-int/2addr v0, v1

    return v0
.end method

.method public static c(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Ljava/util/List<Lo/bxs$e;>;"
        }
    .end annotation

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    invoke-static {p0, v1, p1, p2}, Lo/bxs;->e(Landroid/content/Context;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)V

    .line 84
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bxs$e;

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, v2, Lo/bxs$e;->a:Z

    .line 89
    :cond_0
    return-object v1
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/bxs$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bxs$e;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Lo/bxs$a;)V"
        }
    .end annotation

    .line 111
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 114
    iget v0, p3, Lo/bxs$a;->b:I

    invoke-static {p0, v0, v1, v2}, Lo/bxs;->e(Landroid/content/Context;ILjava/util/List;Ljava/util/List;)V

    .line 116
    invoke-static {p0, p2, p3, v1}, Lo/bxs;->e(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;Ljava/util/List;)Lo/bxs$e;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bxs;->c(Ljava/util/List;Lo/bxs$e;)V

    .line 117
    invoke-static {p0, p2, p3, v2}, Lo/bxs;->b(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;Ljava/util/List;)Lo/bxs$e;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bxs;->c(Ljava/util/List;Lo/bxs$e;)V

    .line 118
    return-void
.end method

.method private static c(Ljava/util/List;Lo/bxs$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bxs$e;>;Lo/bxs$e;)V"
        }
    .end annotation

    .line 214
    if-eqz p1, :cond_0

    .line 215
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    :cond_0
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;)Lo/bxs$e;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Lo/bxs$a;)Lo/bxs$e;"
        }
    .end annotation

    .line 176
    new-instance v6, Lo/bxs$e;

    invoke-direct {v6}, Lo/bxs$e;-><init>()V

    .line 177
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_report_traintime:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/bxs$e;->d:Ljava/lang/CharSequence;

    .line 178
    const/16 v0, 0x1e

    iput v0, v6, Lo/bxs$e;->c:I

    .line 179
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_50dorign:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->e:I

    .line 180
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->g:I

    .line 181
    const/4 v0, 0x1

    iput v0, v6, Lo/bxs$e;->b:I

    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->h:I

    .line 183
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->i:I

    .line 184
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->k:I

    .line 185
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_chart_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v6, Lo/bxs$e;->m:F

    .line 186
    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_event_dorign:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 187
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_event_qorign:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, v6, Lo/bxs$e;->f:[I

    .line 190
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 191
    iget-object v0, p2, Lo/bxs$a;->e:Ljava/util/Date;

    iget-object v1, p2, Lo/bxs$a;->c:Ljava/util/Date;

    iget-object v2, p2, Lo/bxs$a;->a:Ljava/text/SimpleDateFormat;

    iget v3, p2, Lo/bxs$a;->b:I

    invoke-static {v0, v1, v2, v3, v7}, Lo/bxs;->b(Ljava/util/Date;Ljava/util/Date;Ljava/text/SimpleDateFormat;ILjava/util/List;)V

    .line 192
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    .line 193
    iget-object v0, p2, Lo/bxs$a;->e:Ljava/util/Date;

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 194
    move-object v0, p0

    move-object v1, v7

    move-object v2, p1

    iget-object v3, p2, Lo/bxs$a;->e:Ljava/util/Date;

    move-object v4, v8

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/bxs;->a(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, v6, Lo/bxs$e;->n:Ljava/util/List;

    .line 195
    return-object v6
.end method

.method private static d(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bwn;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/Date;Ljava/util/Calendar;I)V"
        }
    .end annotation

    .line 291
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 292
    invoke-static {p3, p4, v2}, Lo/bxs;->e(Ljava/util/Date;Ljava/util/Calendar;Lcom/huawei/health/suggestion/model/WorkoutRecord;)I

    move-result v3

    .line 293
    invoke-static {p1, v3}, Lo/bxs;->a(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    invoke-static {p0, p1, p5, v2, v3}, Lo/bxs;->a(Landroid/content/Context;Ljava/util/List;ILcom/huawei/health/suggestion/model/WorkoutRecord;I)V

    .line 296
    :cond_0
    goto :goto_0

    .line 297
    :cond_1
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/bxs$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bxs$e;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Lo/bxs$a;)V"
        }
    .end annotation

    .line 121
    invoke-static {p0, p2, p3}, Lo/bxs;->d(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;)Lo/bxs$e;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bxs;->c(Ljava/util/List;Lo/bxs$e;)V

    .line 122
    return-void
.end method

.method private static e(Ljava/util/Date;Ljava/util/Calendar;Lcom/huawei/health/suggestion/model/WorkoutRecord;)I
    .locals 6

    .line 334
    const/4 v4, 0x0

    .line 336
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 337
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-static {p0, v0}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v0

    div-int/lit8 v0, v0, 0x7

    move v4, v0

    goto :goto_0

    .line 339
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 340
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 341
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    sub-int/2addr v0, v1

    move v4, v0

    .line 345
    :goto_0
    goto :goto_1

    .line 343
    :catch_0
    move-exception v5

    .line 344
    const-string v0, "ReportChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e5\u671f\u8f6c\u6362\u5f02\u5e38--refreshExcels"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    :goto_1
    return v4
.end method

.method private static e(Landroid/content/Context;Ljava/util/List;Lo/bxs$a;Ljava/util/List;)Lo/bxs$e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Lo/bxs$a;Ljava/util/List<Lo/bwn;>;)Lo/bxs$e;"
        }
    .end annotation

    .line 125
    new-instance v6, Lo/bxs$e;

    invoke-direct {v6}, Lo/bxs$e;-><init>()V

    .line 126
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_distance:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lo/bxs$e;->d:Ljava/lang/CharSequence;

    .line 127
    const/4 v0, 0x1

    iput v0, v6, Lo/bxs$e;->b:I

    .line 129
    const/16 v0, 0x1e

    iput v0, v6, Lo/bxs$e;->c:I

    .line 130
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_report_dis_50dgreen:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->e:I

    .line 131
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->g:I

    .line 132
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->h:I

    .line 133
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_report_dis_dgreen:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->i:I

    .line 134
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, v6, Lo/bxs$e;->k:I

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_chart_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iput v0, v6, Lo/bxs$e;->m:F

    .line 136
    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_dis_dgreen:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 137
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->sug_report_dis_green:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, v6, Lo/bxs$e;->f:[I

    .line 139
    move-object v0, p0

    move-object v1, p3

    move-object v2, p1

    iget-object v3, p2, Lo/bxs$a;->e:Ljava/util/Date;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/bxs;->a(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v7

    .line 140
    invoke-static {p0, v7}, Lo/bxs;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 141
    iput-object v7, v6, Lo/bxs$e;->n:Ljava/util/List;

    .line 142
    return-object v6
.end method

.method private static e(Landroid/content/Context;ILjava/util/List;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Lo/bwn;>;Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 249
    add-int/lit8 v0, p1, 0x1

    div-int/lit8 v6, v0, 0x7

    .line 251
    const/16 v0, 0x8

    if-gt v6, v0, :cond_1

    .line 252
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    .line 253
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_unit_week:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    add-int/lit8 v2, v7, 0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 254
    new-instance v9, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v8, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 255
    new-instance v10, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v10, v0, v8, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 256
    invoke-interface {p3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    invoke-interface {p2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    goto/16 :goto_3

    .line 260
    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    .line 263
    if-eqz v7, :cond_2

    const/16 v0, 0x9

    if-eq v7, v0, :cond_2

    const/16 v0, 0x13

    if-ne v7, v0, :cond_3

    .line 264
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_unit_week:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    add-int/lit8 v2, v7, 0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v0, v1}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 265
    new-instance v8, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v8, v0, v10, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 266
    new-instance v9, Lo/bwn;

    const/4 v0, 0x0

    invoke-direct {v9, v0, v10, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 267
    goto :goto_2

    .line 268
    :cond_3
    new-instance v8, Lo/bwn;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v8, v1, v0, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 269
    new-instance v9, Lo/bwn;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v9, v1, v0, v7}, Lo/bwn;-><init>(FLjava/lang/String;I)V

    .line 271
    :goto_2
    invoke-interface {p3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 275
    :cond_4
    :goto_3
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/bxs$e;>;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 93
    const/4 v4, 0x0

    .line 95
    :try_start_0
    invoke-static {p0, p2, p3}, Lo/bxs;->b(Landroid/content/Context;Lcom/huawei/health/suggestion/model/Plan;Ljava/util/List;)Lo/bxs$a;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 99
    goto :goto_0

    .line 96
    :catch_0
    move-exception v5

    .line 97
    const-string v0, "ReportChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 102
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_0

    .line 103
    invoke-static {p0, p1, p3, v4}, Lo/bxs;->c(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/bxs$a;)V

    goto :goto_1

    .line 105
    :cond_0
    invoke-static {p0, p1, p3, v4}, Lo/bxs;->d(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Lo/bxs$a;)V

    .line 107
    :goto_1
    return-void
.end method

.method private static e(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;)Z"
        }
    .end annotation

    .line 220
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bwn;

    .line 221
    invoke-virtual {v3}, Lo/bwn;->n()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 222
    const/4 v0, 0x1

    return v0

    .line 224
    :cond_0
    goto :goto_0

    .line 225
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b(Lo/bxs$e;)V
    .locals 2

    .line 61
    iget-object v0, p0, Lo/bxs;->a:Lo/efy;

    iget-boolean v1, p1, Lo/bxs$e;->a:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 62
    iget-object v0, p0, Lo/bxs;->d:Lo/efy;

    iget-object v1, p1, Lo/bxs$e;->d:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->b:I

    invoke-virtual {v0, v1}, Lo/bwo;->a(I)V

    .line 65
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->e:I

    invoke-virtual {v0, v1}, Lo/bwo;->h(I)V

    .line 66
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->m:F

    invoke-virtual {v0, v1}, Lo/bwo;->e(F)V

    .line 67
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->i:I

    invoke-virtual {v0, v1}, Lo/bwo;->d(I)V

    .line 68
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->c:I

    invoke-virtual {v0, v1}, Lo/bwo;->c(I)V

    .line 69
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->g:I

    invoke-virtual {v0, v1}, Lo/bwo;->b(I)V

    .line 70
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->k:I

    invoke-virtual {v0, v1}, Lo/bwo;->k(I)V

    .line 71
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->h:I

    invoke-virtual {v0, v1}, Lo/bwo;->g(I)V

    .line 72
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget-object v1, p1, Lo/bxs$e;->f:[I

    invoke-virtual {v0, v1}, Lo/bwo;->a([I)V

    .line 73
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget-object v1, p1, Lo/bxs$e;->n:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/bwo;->d(Ljava/util/List;)V

    .line 75
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->o:F

    invoke-virtual {v0, v1}, Lo/bwo;->b(F)V

    .line 76
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget v1, p1, Lo/bxs$e;->p:F

    invoke-virtual {v0, v1}, Lo/bwo;->c(F)V

    .line 77
    iget-object v0, p0, Lo/bxs;->b:Lo/bwo;

    iget-object v1, p1, Lo/bxs$e;->l:[I

    invoke-virtual {v0, v1}, Lo/bwo;->d([I)V

    .line 78
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 38
    move-object v0, p1

    check-cast v0, Lo/bxs$e;

    invoke-virtual {p0, v0}, Lo/bxs;->b(Lo/bxs$e;)V

    return-void
.end method
