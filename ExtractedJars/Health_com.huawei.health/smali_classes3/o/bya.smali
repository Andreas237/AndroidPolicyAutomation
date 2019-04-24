.class public Lo/bya;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/util/List;)Lo/bxx;
    .locals 5
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)Lo/bxx;"
        }
    .end annotation

    .line 313
    new-instance v2, Lo/bxx;

    invoke-direct {v2}, Lo/bxx;-><init>()V

    .line 314
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 315
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireCalorie()F

    move-result v0

    invoke-virtual {v2}, Lo/bxx;->d()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v2, v0}, Lo/bxx;->a(F)V

    .line 316
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDistance()F

    move-result v0

    invoke-virtual {v2}, Lo/bxx;->c()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v2, v0}, Lo/bxx;->d(F)V

    .line 317
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-virtual {v2}, Lo/bxx;->b()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v2, v0}, Lo/bxx;->e(F)V

    .line 318
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    invoke-virtual {v2}, Lo/bxx;->e()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v2, v0}, Lo/bxx;->b(F)V

    .line 319
    goto :goto_0

    .line 320
    :cond_0
    return-object v2
.end method

.method public static b(Landroid/widget/AbsListView;I)Z
    .locals 3

    .line 234
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v1

    .line 235
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v2

    .line 236
    if-lt p1, v1, :cond_0

    if-gt p1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Landroid/widget/AbsListView;II)Z
    .locals 2

    .line 267
    invoke-static {p0, p1}, Lo/bya;->b(Landroid/widget/AbsListView;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    const/4 v0, 0x0

    return v0

    .line 271
    :cond_0
    invoke-static {p0, p1}, Lo/bya;->e(Landroid/widget/AbsListView;I)Landroid/view/View;

    move-result-object v1

    .line 272
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    if-ne v0, p2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Ljava/lang/String;I)Z
    .locals 2

    .line 406
    invoke-static {p0}, Lo/bya;->e(Ljava/lang/String;)I

    move-result v1

    .line 407
    if-nez p1, :cond_0

    const/4 v0, 0x1

    if-eq v1, v0, :cond_1

    :cond_0
    if-nez v1, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 408
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 410
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static c(F)F
    .locals 4

    .line 107
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 108
    const-string v0, "Suggestion_PlanUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "truncateOverOneHundred target = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/high16 v0, 0x42c80000    # 100.0f

    return v0

    .line 111
    :cond_0
    return p0
.end method

.method public static c(Landroid/content/Context;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 167
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 168
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_low_level_loss_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_mid_level_loss_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_high_level_loss_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_low_level_shape_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_mid_level_shape_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_high_level_shape_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    return-object v2
.end method

.method public static d(FI)F
    .locals 3

    .line 98
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float/2addr v0, p0

    int-to-float v1, p1

    div-float v2, v0, v1

    .line 99
    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    .line 100
    const/high16 v2, 0x42c80000    # 100.0f

    .line 103
    :cond_0
    return v2
.end method

.method public static d(I)I
    .locals 1

    .line 123
    add-int/lit8 v0, p0, 0x0

    return v0
.end method

.method public static d(II)I
    .locals 4

    .line 153
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 154
    :goto_0
    add-int/lit8 v2, p1, 0x0

    .line 155
    const/4 v3, 0x3

    .line 156
    mul-int/lit8 v0, v1, 0x3

    add-int/2addr v0, v2

    return v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 1

    .line 35
    if-nez p0, :cond_0

    .line 36
    const/4 v0, 0x0

    return v0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    const/4 v0, 0x0

    return v0

    .line 43
    :cond_1
    const-string v0, "_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    const/16 v0, 0x66

    return v0

    .line 46
    :cond_2
    const/16 v0, 0x65

    return v0
.end method

.method public static d(Landroid/content/Context;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 134
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 135
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_5km_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "5"

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    invoke-static {v2, v3}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_10km_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "10"

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_half_marathon_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_defalut_marathon_plan_name:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, v0, v1}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    return-object v4
.end method

.method public static d(Landroid/widget/AbsListView;)Z
    .locals 4

    .line 283
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v2

    .line 284
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v2, v0, :cond_0

    .line 285
    const/4 v0, 0x0

    return v0

    .line 288
    :cond_0
    invoke-static {p0, v2}, Lo/bya;->e(Landroid/widget/AbsListView;I)Landroid/view/View;

    move-result-object v3

    .line 289
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/AbsListView;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(F)I
    .locals 2

    .line 60
    const/high16 v0, 0x42b40000    # 90.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 61
    const/4 v1, 0x5

    goto :goto_0

    .line 62
    :cond_0
    const/high16 v0, 0x42a00000    # 80.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    .line 63
    const/4 v1, 0x4

    goto :goto_0

    .line 64
    :cond_1
    const/high16 v0, 0x42700000    # 60.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_2

    .line 65
    const/4 v1, 0x3

    goto :goto_0

    .line 66
    :cond_2
    const/high16 v0, 0x41f00000    # 30.0f

    cmpl-float v0, p0, v0

    if-lez v0, :cond_3

    .line 67
    const/4 v1, 0x2

    goto :goto_0

    .line 68
    :cond_3
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_4

    .line 69
    const/4 v1, 0x1

    goto :goto_0

    .line 71
    :cond_4
    const/4 v1, 0x0

    .line 74
    :goto_0
    return v1
.end method

.method public static e(Ljava/lang/String;)I
    .locals 3

    .line 379
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    .line 380
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 382
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 383
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/16 v0, 0x33

    if-ne v2, v0, :cond_3

    .line 384
    :cond_2
    const/4 v0, 0x3

    return v0

    .line 387
    :cond_3
    const/16 v0, 0x30

    if-ne v2, v0, :cond_4

    .line 388
    const/4 v0, 0x0

    return v0

    .line 391
    :cond_4
    const/16 v0, 0x31

    if-ne v2, v0, :cond_5

    .line 392
    const/4 v0, 0x1

    return v0

    .line 395
    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method public static e(Landroid/widget/AbsListView;I)Landroid/view/View;
    .locals 2

    .line 301
    invoke-virtual {p0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v1

    .line 302
    sub-int v0, p1, v1

    invoke-virtual {p0, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 10
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 187
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_defalut_5km_plan_name:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 189
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 193
    :pswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_trainplan:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x4014000000000000L    # 5.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x5

    invoke-static {v3, v5, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 194
    goto/16 :goto_0

    .line 197
    :pswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_trainplan:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/16 v5, 0xa

    invoke-static {v3, v5, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 199
    goto/16 :goto_0

    .line 202
    :pswitch_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_trainplan:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide v5, 0x402a333333333333L    # 13.1

    invoke-static {v5, v6}, Lo/buk;->e(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/16 v5, 0xd

    invoke-static {v3, v5, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 205
    :cond_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_defalut_half_marathon_plan_name:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 207
    goto :goto_0

    .line 210
    :pswitch_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_run_trainplan:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide v5, 0x403a333333333333L    # 26.2

    invoke-static {v5, v6}, Lo/buk;->e(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/16 v5, 0x1a

    invoke-static {v3, v5, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 213
    :cond_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_defalut_marathon_plan_name:I

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lo/bxy;->d(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 216
    .line 222
    :goto_0
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static e(Landroid/widget/AbsListView;II)Z
    .locals 2

    .line 249
    invoke-static {p0, p1}, Lo/bya;->b(Landroid/widget/AbsListView;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    const/4 v0, 0x0

    return v0

    .line 253
    :cond_0
    invoke-static {p0, p1}, Lo/bya;->e(Landroid/widget/AbsListView;I)Landroid/view/View;

    move-result-object v1

    .line 254
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    if-lt v0, p2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
