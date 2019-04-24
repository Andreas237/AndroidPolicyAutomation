.class Lcom/huawei/health/suggestion/ui/HistoryActivity$9;
.super Lo/bvn;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/HistoryActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bvn<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/HistoryActivity;Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-direct {p0, p2, p3, p4}, Lo/bvn;-><init>(Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V

    return-void
.end method


# virtual methods
.method public b(Lo/bvr;ILcom/huawei/health/suggestion/model/PlanRecord;)V
    .locals 15

    .line 154
    const-string v8, "\u6ca1\u53d6\u5230\u65f6\u95f4\u6570\u636e"

    .line 155
    const-string v9, "\u6ca1\u53d6\u5230\u65f6\u95f4\u6570\u636e"

    .line 156
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireEndDate()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 157
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 159
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    const/4 v11, 0x2

    goto :goto_0

    .line 162
    :cond_0
    const/4 v11, 0x3

    .line 165
    :goto_0
    :try_start_0
    invoke-static {v11}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireStartDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    .line 166
    invoke-static {v11}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireEndDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 169
    goto :goto_1

    .line 167
    :catch_0
    move-exception v12

    .line 168
    const-string v0, "Suggestion_HistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u65e5\u671f\u683c\u5f0f\u5316\u51fa\u9519:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :goto_1
    goto :goto_2

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_no_conten:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    move-object v9, v8

    .line 173
    :goto_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_time:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    const/4 v4, 0x1

    aput-object v9, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_name:I

    .line 174
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_iv_his_calen:I

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_history_repeat_create:I

    .line 175
    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_days:I

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_finess_days:I

    .line 177
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireStartDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireEndDate()Ljava/lang/String;

    move-result-object v4

    const-string v5, "yyyy-MM-dd"

    invoke-static {v3, v4, v5}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 178
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireStartDate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireEndDate()Ljava/lang/String;

    move-result-object v6

    const-string v7, "yyyy-MM-dd"

    invoke-static {v5, v6, v7}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 176
    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_time:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/HistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v9, v3, v4

    const/4 v4, 0x1

    aput-object v8, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 182
    :cond_2
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquirePlanType()I

    move-result v10

    .line 183
    const/4 v0, 0x0

    if-ne v0, v10, :cond_3

    .line 185
    invoke-static {}, Lo/bzr;->c()I

    move-result v0

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualDistance()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualDistance()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Lo/bzr;->i(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 186
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_finess_days:I

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v12

    .line 187
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {v0, v1, v11, v2, v3}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v13

    .line 189
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualCalorie()F

    move-result v3

    invoke-static {v3}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v14

    .line 190
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_trains:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v12}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_calorie:I

    .line 191
    invoke-virtual {v0, v1, v13}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_rate:I

    .line 192
    invoke-virtual {v0, v1, v14}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name1:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_unit_runs:I

    .line 193
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name2:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_distance:I

    .line 194
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name3:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_report_traintime:I

    .line 195
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    .line 197
    goto/16 :goto_3

    .line 198
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$plurals;->sug_finess_days:I

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireWorkoutDays()I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v11

    .line 199
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireActualCalorie()F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v12

    .line 201
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->a:Lcom/huawei/health/suggestion/ui/HistoryActivity;

    const-string v1, "\\d+.\\d+|\\d+"

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v2

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x1

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_k:I

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_myplan_n:I

    invoke-static {v0, v1, v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v13

    .line 202
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_trains:I

    move-object/from16 v1, p1

    invoke-virtual {v1, v0, v11}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_rate:I

    .line 203
    invoke-virtual {v0, v1, v13}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_calorie:I

    .line 204
    invoke-virtual {v0, v1, v12}, Lo/bvr;->e(ILandroid/text/SpannableString;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name1:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_myplan_traned:I

    .line 205
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name2:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_report_traintime:I

    .line 206
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_name3:I

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_rate:I

    .line 207
    invoke-virtual {v0, v1, v2}, Lo/bvr;->b(II)Lo/bvr;

    .line 209
    :goto_3
    if-nez p2, :cond_4

    .line 210
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_black:I

    move-object/from16 v1, p1

    const/16 v2, 0x8

    invoke-virtual {v1, v0, v2}, Lo/bvr;->a(II)V

    goto :goto_4

    .line 212
    :cond_4
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_plan_black:I

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lo/bvr;->a(II)V

    .line 214
    :goto_4
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_his_calen:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    invoke-direct {v1, p0, v2, v3}, Lcom/huawei/health/suggestion/ui/HistoryActivity$9$4;-><init>(Lcom/huawei/health/suggestion/ui/HistoryActivity$9;Lcom/huawei/health/suggestion/model/PlanRecord;Lo/bvr;)V

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Lo/bvr;->b(ILandroid/view/View$OnClickListener;)Lo/bvr;

    .line 274
    return-void
.end method

.method public bridge synthetic b(Lo/bvr;ILjava/lang/Object;)V
    .locals 1

    .line 150
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/health/suggestion/ui/HistoryActivity$9;->b(Lo/bvr;ILcom/huawei/health/suggestion/model/PlanRecord;)V

    return-void
.end method
