.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:I

.field private c:Landroid/content/Context;

.field private d:Lo/egb;

.field private e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private f:Lo/egb;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private k:Lo/egb;

.field private l:Landroid/widget/LinearLayout;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 45
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->p:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public static c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;
    .locals 3

    .line 50
    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    invoke-direct {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;-><init>()V

    .line 51
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 52
    const-string v0, "layoutType"

    invoke-virtual {v2, v0, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 53
    const-string v0, "motionPathSimplify"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 54
    invoke-virtual {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->setArguments(Landroid/os/Bundle;)V

    .line 55
    return-object v1
.end method

.method private c(D)Ljava/lang/String;
    .locals 6

    .line 252
    double-to-float v0, p1

    const/high16 v1, 0x41200000    # 10.0f

    div-float v5, v0, v1

    .line 253
    float-to-double v0, v5

    const-wide v2, 0x4115f90000000000L    # 360000.0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    float-to-double v0, v5

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->p:Ljava/lang/String;

    return-object v0

    .line 256
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 257
    float-to-double v0, v5

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v5, v0

    .line 259
    :cond_2
    invoke-static {v5}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    .line 260
    return-object v4
.end method

.method private c(J)Ljava/lang/String;
    .locals 2

    .line 268
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 238
    const-string v5, ""

    .line 239
    if-nez p1, :cond_0

    .line 240
    const-string v0, "Track_SportShareDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aquireSwinUnit  and context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    return-object v5

    .line 243
    :cond_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 246
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 248
    :goto_0
    return-object v5
.end method

.method private c()V
    .locals 6

    .line 154
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e()V

    .line 157
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->n:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 158
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 159
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    const/high16 v1, 0x417a0000    # 15.625f

    invoke-static {v0, v1}, Lo/cdl;->c(Landroid/content/Context;F)I

    move-result v5

    .line 160
    if-eqz v4, :cond_1

    .line 161
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1, v5, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 162
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->n:Lo/egb;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/egb;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->n:Lo/egb;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v1, v2, v3}, Lo/egb;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 168
    :cond_1
    :goto_0
    return-void
.end method

.method private e()V
    .locals 16

    .line 171
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    if-nez v0, :cond_0

    .line 172
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 173
    return-void

    .line 175
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(J)Ljava/lang/String;

    move-result-object v4

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v5, v0, v2

    .line 177
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v7

    .line 178
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    const/4 v0, 0x3

    invoke-static {v5, v6, v0}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->h:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 181
    float-to-double v0, v7

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    double-to-float v7, v0

    .line 184
    :cond_1
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gtz v0, :cond_2

    .line 185
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 187
    :cond_2
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 190
    :goto_0
    const/4 v0, 0x0

    cmpg-float v0, v7, v0

    if-gtz v0, :cond_3

    .line 191
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 193
    :cond_3
    invoke-static {v7}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v9

    .line 195
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    long-to-int v0, v0

    div-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 197
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->d:Lo/egb;

    invoke-virtual {v0, v8}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->i:Lo/egb;

    invoke-virtual {v0, v10}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->k:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-static {v1}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 200
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->f:Lo/egb;

    invoke-virtual {v0, v9}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 201
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->g:Lo/egb;

    invoke-virtual {v0, v4}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_5

    .line 204
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float v11, v0, v1

    .line 207
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 208
    float-to-double v0, v11

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v14

    .line 209
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v12

    .line 210
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v14, v15, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 211
    goto :goto_2

    .line 212
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 213
    float-to-double v0, v11

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 215
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->f:Lo/egb;

    invoke-virtual {v0, v13}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 216
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/egb;

    .line 217
    invoke-virtual {v14, v12}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 218
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lo/egb;->setVisibility(I)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_datatype:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    .line 220
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_climbed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 221
    goto/16 :goto_3

    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x103

    if-ne v0, v1, :cond_7

    .line 222
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->o:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 223
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 224
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->f:Lo/egb;

    invoke-static {v7}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 225
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 226
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 228
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 230
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-eq v0, v1, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-ne v0, v1, :cond_9

    .line 231
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->f:Lo/egb;

    float-to-double v1, v7

    move-object/from16 v3, p0

    invoke-direct {v3, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 233
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    move-object/from16 v2, p0

    invoke-direct {v2, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 236
    :cond_9
    :goto_3
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 4

    .line 136
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 137
    const-string v0, "Track_SportShareDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView() view is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_distance_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->d:Lo/egb;

    .line 141
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_targetUnit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->h:Lo/egb;

    .line 142
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_during_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->i:Lo/egb;

    .line 143
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_calorie_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->k:Lo/egb;

    .line 144
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->f:Lo/egb;

    .line 145
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_sport_formal_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->g:Lo/egb;

    .line 146
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_share_appname:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->n:Lo/egb;

    .line 147
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_linear_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->l:Landroid/widget/LinearLayout;

    .line 148
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_map_speed_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->m:Lo/egb;

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_main_page_mid_datatype:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->o:Lo/egb;

    .line 150
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    .line 276
    const-string v2, ""

    .line 277
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 281
    :cond_0
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 282
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 286
    :cond_1
    :goto_0
    return-object v2
.end method

.method public b()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 294
    const/4 v2, 0x0

    .line 295
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$mipmap;->hw_show_app_logo:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    .line 299
    :cond_0
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 300
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->com_huawei_wear:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 302
    :cond_1
    :goto_0
    return-object v2
.end method

.method public d()I
    .locals 2

    .line 106
    const/4 v1, 0x0

    .line 107
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 110
    :pswitch_0
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_1:I

    .line 111
    goto :goto_1

    .line 113
    :pswitch_1
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_2:I

    .line 114
    goto :goto_1

    .line 116
    :pswitch_2
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_3:I

    .line 117
    goto :goto_1

    .line 120
    :pswitch_3
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_4:I

    .line 121
    goto :goto_1

    .line 124
    :pswitch_4
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_5:I

    .line 125
    goto :goto_1

    .line 128
    :goto_0
    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_fragment_sport_share_detail_1:I

    .line 132
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 89
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 91
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    .line 96
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 97
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 63
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 64
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "layoutType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->b:I

    .line 66
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "motionPathSimplify"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 68
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 73
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    .line 74
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->d()I

    move-result v1

    .line 76
    const/4 v0, 0x0

    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    .line 77
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->e(Landroid/view/View;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->h:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 80
    const/16 v0, 0x11

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 81
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->h:Lo/egb;

    invoke-virtual {v0, v2}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c()V

    .line 84
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->a:Landroid/view/View;

    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .line 101
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 102
    return-void
.end method
