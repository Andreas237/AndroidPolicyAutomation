.class public Lo/bxc;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxc$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bxc$a;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 90
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxc;->d:Z

    .line 91
    iput-object p2, p0, Lo/bxc;->e:Landroid/content/Context;

    .line 92
    iput-object p1, p0, Lo/bxc;->c:Ljava/util/List;

    .line 93
    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 2

    .line 464
    const/16 v0, -0x194

    if-eq v0, p1, :cond_0

    .line 465
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_data_fetch_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 467
    :cond_0
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 4

    .line 384
    new-instance v3, Lo/egy$b;

    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 385
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_home_finishplan:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 386
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v1, Lo/bxc$2;

    invoke-direct {v1, p0, p1}, Lo/bxc$2;-><init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 404
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v1, Lo/bxc$3;

    invoke-direct {v1, p0}, Lo/bxc$3;-><init>(Lo/bxc;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 411
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 412
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 413
    return-void
.end method

.method private b(ILo/bxc$a;)V
    .locals 3

    .line 444
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 446
    :pswitch_0
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_five:I

    iget-object v1, p2, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 447
    goto :goto_1

    .line 449
    :pswitch_1
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_ten:I

    iget-object v1, p2, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 450
    goto :goto_1

    .line 452
    :pswitch_2
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_half:I

    iget-object v1, p2, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 453
    goto :goto_1

    .line 455
    :pswitch_3
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    iget-object v1, p2, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 456
    goto :goto_1

    .line 458
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->pic_marathon:I

    iget-object v1, p2, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 461
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Lo/bxc;)Landroid/content/Context;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 416
    new-instance v3, Lo/egv$b;

    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 417
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 418
    invoke-direct {p0, p1}, Lo/bxc;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_yes:I

    new-instance v2, Lo/bxc$1;

    invoke-direct {v2, p0}, Lo/bxc$1;-><init>(Lo/bxc;)V

    .line 419
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 426
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 427
    return-void
.end method

.method private c(Lo/bxc$a;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 17

    .line 123
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDoingFitnessPlansData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bxc$4;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/bxc$4;-><init>(Lo/bxc;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 146
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->getPicture()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    iget-object v1, v1, Lo/bxc$a;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->c(Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 147
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->a:Lo/efy;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 149
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 151
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 153
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v9}, Lo/bxc;->e(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 154
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/suggestion/model/PlanWorkout;

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    .line 155
    :goto_0
    if-nez v11, :cond_1

    .line 156
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bxc;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_restday:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 157
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->b:Lo/efy;

    invoke-virtual {v0, v12}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 158
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    invoke-virtual {v0, v12}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 160
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 161
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 164
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$5;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/bxc$5;-><init>(Lo/bxc;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    goto/16 :goto_3

    .line 170
    :cond_1
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 171
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/btj;->e(J)I

    move-result v12

    .line 174
    if-nez v12, :cond_2

    .line 175
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_1

    .line 176
    :cond_2
    const/4 v0, 0x1

    if-ne v12, v0, :cond_3

    .line 177
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_continue_workout:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_1

    .line 178
    :cond_3
    const/4 v0, 0x2

    if-ne v12, v0, :cond_4

    .line 179
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_repeat_workout:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 181
    :cond_4
    :goto_1
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 183
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v10, v1}, Lo/brt;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    .line 184
    if-eqz v13, :cond_6

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 185
    invoke-virtual {v11}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDayTitle()Ljava/lang/String;

    move-result-object v14

    .line 186
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 187
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->b:Lo/efy;

    invoke-virtual {v0, v14}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 188
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 189
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 190
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$10;

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-direct {v1, v2, v13, v3}, Lo/bxc$10;-><init>(Lo/bxc;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 209
    :cond_5
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 211
    :goto_2
    goto :goto_3

    .line 212
    :cond_6
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 216
    :goto_3
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v12

    .line 218
    const/4 v13, 0x0

    .line 220
    :try_start_0
    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v8, v12}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int v0, v0

    move v13, v0

    .line 223
    goto :goto_4

    .line 221
    :catch_0
    move-exception v14

    .line 222
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :goto_4
    add-int/lit8 v0, v13, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v1

    if-le v0, v1, :cond_7

    .line 226
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_finish_plan:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 227
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->b:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_overdueplan:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 228
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 229
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$9;

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lo/bxc$9;-><init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v0

    add-int/lit8 v13, v0, -0x1

    goto :goto_5

    .line 237
    :cond_7
    add-int/lit8 v0, v13, 0x1

    if-gez v0, :cond_8

    .line 238
    const/4 v13, -0x1

    .line 240
    :cond_8
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bxc;->e:Landroid/content/Context;

    add-int/lit8 v1, v13, 0x1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/buk;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v14

    .line 241
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->c:Lo/efy;

    invoke-virtual {v0, v14}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 242
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brt;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v15

    .line 243
    const/4 v0, 0x0

    if-ne v0, v15, :cond_9

    .line 244
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "plan is not exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    return-void

    .line 247
    :cond_9
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v16

    .line 249
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->f:Landroid/widget/ProgressBar;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 250
    move-object/from16 v0, p1

    iget-object v0, v0, Lo/bxc$a;->e:Lo/efy;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_home_finishpercent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v15}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v4

    float-to-double v4, v4

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 251
    return-void
.end method

.method static synthetic c(Lo/bxc;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/bxc;->c(I)V

    return-void
.end method

.method static synthetic d(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/bxc;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 430
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 431
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 432
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 433
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 435
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 436
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    :cond_0
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==today have workouts: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 441
    :cond_2
    return-object v5
.end method

.method private e(Lo/bxc$a;)V
    .locals 13

    .line 254
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDoingRunPlansData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v4

    .line 256
    if-nez v4, :cond_0

    .line 257
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrent run plan is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    return-void

    .line 260
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/Plan;

    .line 261
    invoke-static {v5}, Lo/bxn;->b(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 262
    invoke-static {v5}, Lo/bxn;->c(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 264
    iget-object v0, p1, Lo/bxc$a;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/bxc$8;

    invoke-direct {v1, p0}, Lo/bxc$8;-><init>(Lo/bxc;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireGoal()I

    move-result v0

    invoke-direct {p0, v0, p1}, Lo/bxc;->b(ILo/bxc$a;)V

    .line 283
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 284
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    iget-object v1, p0, Lo/bxc;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 285
    iget-object v0, p1, Lo/bxc$a;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 286
    iget-object v0, p1, Lo/bxc$a;->c:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 287
    iget-object v0, p1, Lo/bxc$a;->a:Lo/efy;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 289
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 291
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 293
    invoke-direct {p0, v5, v7}, Lo/bxc;->e(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 294
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/PlanWorkout;

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    .line 296
    :goto_0
    if-nez v9, :cond_2

    .line 297
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_restday:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 298
    iget-object v0, p1, Lo/bxc$a;->b:Lo/efy;

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 299
    iget-object v0, p1, Lo/bxc$a;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 300
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 301
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    invoke-virtual {v0, v10}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 302
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    iget-object v1, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 303
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$7;

    invoke-direct {v1, p0}, Lo/bxc$7;-><init>(Lo/bxc;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    goto :goto_2

    .line 309
    :cond_2
    iget-object v0, p1, Lo/bxc$a;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 310
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 312
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/brt;->b(Lcom/huawei/health/suggestion/model/Plan;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 313
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_start_train:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_1

    .line 315
    :cond_3
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_repeat_workout:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 317
    :goto_1
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    iget-object v1, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 318
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v10

    .line 319
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 320
    iget-object v0, p1, Lo/bxc$a;->b:Lo/efy;

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 321
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$6;

    invoke-direct {v1, p0, v5, v9}, Lo/bxc$6;-><init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/PlanWorkout;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    :cond_4
    :goto_2
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v10

    .line 337
    const/4 v11, 0x0

    .line 339
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v6, v10}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int v0, v0

    move v11, v0

    .line 342
    goto :goto_3

    .line 340
    :catch_0
    move-exception v12

    .line 341
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    :goto_3
    add-int/lit8 v0, v11, 0x1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v1

    if-le v0, v1, :cond_5

    .line 345
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_finish_plan:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 346
    iget-object v0, p1, Lo/bxc$a;->b:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_home_overdueplan:I

    invoke-virtual {v0, v1}, Lo/efy;->setText(I)V

    .line 347
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    iget-object v1, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->white:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 348
    iget-object v0, p1, Lo/bxc$a;->k:Landroid/widget/Button;

    new-instance v1, Lo/bxc$15;

    invoke-direct {v1, p0, v5}, Lo/bxc$15;-><init>(Lo/bxc;Lcom/huawei/health/suggestion/model/Plan;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 355
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v0

    add-int/lit8 v11, v0, -0x1

    goto :goto_4

    .line 356
    :cond_5
    add-int/lit8 v0, v11, 0x1

    if-gez v0, :cond_6

    .line 357
    const/4 v11, -0x1

    .line 359
    :cond_6
    :goto_4
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    add-int/lit8 v1, v11, 0x1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->getDays()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/buk;->b(Landroid/content/Context;III)Ljava/lang/String;

    move-result-object v12

    .line 360
    iget-object v0, p1, Lo/bxc$a;->c:Lo/efy;

    invoke-virtual {v0, v12}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 362
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/bxc$14;

    invoke-direct {v1, p0, p1}, Lo/bxc$14;-><init>(Lo/bxc;Lo/bxc$a;)V

    invoke-virtual {v0, v1}, Lo/brt;->d(Lo/bui;)V

    .line 380
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/bxc$a;
    .locals 5

    .line 96
    iget-object v0, p0, Lo/bxc;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_my_plans_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 97
    new-instance v4, Lo/bxc$a;

    invoke-direct {v4, v3}, Lo/bxc$a;-><init>(Landroid/view/View;)V

    .line 98
    return-object v4
.end method

.method public a()Z
    .locals 1

    .line 478
    iget-boolean v0, p0, Lo/bxc;->d:Z

    return v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/Plan;>;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    return-object v0
.end method

.method public d(Lo/bxc$a;I)V
    .locals 5

    .line 107
    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 108
    :cond_0
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurrentPlansList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 111
    :cond_1
    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/Plan;

    .line 112
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    if-nez v0, :cond_2

    .line 113
    invoke-direct {p0, p1}, Lo/bxc;->e(Lo/bxc$a;)V

    goto :goto_0

    .line 114
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 115
    invoke-direct {p0, p1, v4}, Lo/bxc;->c(Lo/bxc$a;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 117
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p2, :cond_4

    .line 118
    iget-object v0, p1, Lo/bxc$a;->h:Landroid/view/View;

    iget-object v1, p0, Lo/bxc;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_ui_custom_dialog_transparent_bg:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 120
    :cond_4
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 482
    iput-boolean p1, p0, Lo/bxc;->d:Z

    .line 483
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 473
    iget-object v0, p0, Lo/bxc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 49
    move-object v0, p1

    check-cast v0, Lo/bxc$a;

    invoke-virtual {p0, v0, p2}, Lo/bxc;->d(Lo/bxc$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 49
    invoke-virtual {p0, p1, p2}, Lo/bxc;->a(Landroid/view/ViewGroup;I)Lo/bxc$a;

    move-result-object v0

    return-object v0
.end method
