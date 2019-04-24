.class public Lo/cil;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:I

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private m:Lo/ekw;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;IZI)V
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/cil;->b:I

    .line 35
    const/16 v0, 0x64

    iput v0, p0, Lo/cil;->e:I

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->m:Lo/ekw;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->p:Landroid/widget/ImageView;

    .line 71
    invoke-direct {p0, p1, p2, p3, p4}, Lo/cil;->c(Landroid/content/Context;IZI)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 81
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/cil;->b:I

    .line 35
    const/16 v0, 0x64

    iput v0, p0, Lo/cil;->e:I

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->m:Lo/ekw;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cil;->p:Landroid/widget/ImageView;

    .line 82
    const/16 v0, 0x64

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lo/cil;->c(Landroid/content/Context;IZI)V

    .line 83
    return-void
.end method

.method private a(F)V
    .locals 7

    .line 357
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    .line 359
    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    .line 358
    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    float-to-double v0, p1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 363
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    goto :goto_0

    .line 366
    :cond_0
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    :goto_0
    return-void
.end method

.method private b(F)V
    .locals 7

    .line 293
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    .line 295
    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    .line 294
    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    float-to-double v0, p1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 299
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_ft_string:I

    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    goto :goto_0

    .line 302
    :cond_0
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;IZI)V
    .locals 9

    .line 89
    iput-object p1, p0, Lo/cil;->a:Landroid/content/Context;

    .line 91
    iget-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 92
    const-string v0, "Track_TrackChartViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-void

    .line 95
    :cond_0
    iput p2, p0, Lo/cil;->e:I

    .line 96
    iput p4, p0, Lo/cil;->b:I

    .line 99
    iget-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->layout_track_chart_viewholder:I

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 100
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_left_value:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_curve_title:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_left_unit:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_left_title:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    .line 106
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_right_title:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_right_unit:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    .line 108
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_right_value:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    .line 110
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->img_title_view:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    .line 111
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->img_scale_icon:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cil;->p:Landroid/widget/ImageView;

    .line 113
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->detail_chart:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ekw;

    iput-object v0, p0, Lo/cil;->m:Lo/ekw;

    .line 115
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->rl_title_parent:I

    invoke-virtual {p0, v0}, Lo/cil;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/cil;->o:Landroid/widget/RelativeLayout;

    .line 118
    if-eqz p3, :cond_3

    .line 119
    iget-object v0, p0, Lo/cil;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 120
    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 122
    iget v0, p0, Lo/cil;->e:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_1

    .line 123
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->common_black_50alpha:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    .line 124
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->common_black_100alpha:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    .line 125
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 126
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 127
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 128
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 132
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 133
    goto :goto_0

    .line 135
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->common_white_50alpha:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    .line 136
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->common_color_white:I

    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    .line 137
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 138
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 140
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 143
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 144
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    :goto_0
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lo/cil;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 149
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 150
    iget-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    const/high16 v1, 0x40600000    # 3.5f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 151
    const/4 v0, -0x2

    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 152
    iget-object v0, p0, Lo/cil;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 156
    :cond_2
    iget-object v0, p0, Lo/cil;->m:Lo/ekw;

    invoke-virtual {v0}, Lo/ekw;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 157
    iget-object v0, p0, Lo/cil;->a:Landroid/content/Context;

    const/high16 v1, 0x43150000    # 149.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v8, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 158
    iget-object v0, p0, Lo/cil;->m:Lo/ekw;

    invoke-virtual {v0, v8}, Lo/ekw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    :cond_3
    iget v0, p0, Lo/cil;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_6

    .line 164
    :sswitch_0
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 165
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_heartrate:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 166
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 167
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_heartbest:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 168
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 169
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_heartrate:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 170
    goto/16 :goto_6

    .line 172
    :sswitch_1
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupin:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 173
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupinrate:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 174
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_stempsmin:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 175
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_bupinbig:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 176
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_stempsmin:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 177
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_img_detail_record_stride_rate:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 178
    goto/16 :goto_6

    .line 180
    :sswitch_2
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_climbed_withot_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 181
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_climbed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 182
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_total_descent:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 183
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 184
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 185
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 187
    :cond_4
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 188
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 190
    :goto_1
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_climb:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 191
    goto/16 :goto_6

    .line 193
    :sswitch_3
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 194
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_averagespeed_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 195
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_fast_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 196
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 197
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 198
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 200
    :cond_5
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 201
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 203
    :goto_2
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 204
    goto/16 :goto_6

    .line 206
    :sswitch_4
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_swim_SWOLF:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 207
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_avg_swolf_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 208
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_max_SWOLF:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 209
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 210
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 211
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_swolf:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 212
    goto/16 :goto_6

    .line 214
    :sswitch_5
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pull_frequence:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 215
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_avg_frequence_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 216
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_max_frequence_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 217
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_stroke_rate_unit:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_stroke_rate_unit:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_slide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 220
    goto/16 :goto_6

    .line 222
    :sswitch_6
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 223
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_avragepace_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 224
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_pace_fastpace_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 225
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 226
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 229
    :cond_6
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    :goto_3
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 233
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 234
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 236
    goto/16 :goto_6

    .line 238
    :sswitch_7
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_map_sport_peisu_1:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 239
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_avragepace_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 240
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_pace_fastpace_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 241
    const-string v6, "/"

    .line 242
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 245
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 247
    :goto_4
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 253
    goto/16 :goto_6

    .line 255
    :sswitch_8
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_alti:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 256
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_min_alti_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 257
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_max_alti_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 259
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 260
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 261
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_ft:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_5

    .line 263
    :cond_8
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 264
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 266
    :goto_5
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_health_sportdetail_climb:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 267
    goto/16 :goto_6

    .line 269
    :sswitch_9
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_contact_time:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 270
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_msec_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 271
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_msec_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 272
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_duration_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 273
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_min_duration_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 274
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_touchtime:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 275
    goto :goto_6

    .line 277
    :sswitch_a
    iget-object v0, p0, Lo/cil;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_ground_impact_acceleration:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 278
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_gravity_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 279
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_gravity_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 280
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_ground_impact_acceleration_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 281
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_max_ground_impact_acceleration_simplified:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 282
    iget-object v0, p0, Lo/cil;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->ic_shock:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 283
    .line 289
    :goto_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_9
        0x8 -> :sswitch_a
        0x9 -> :sswitch_7
        0x64 -> :sswitch_8
    .end sparse-switch
.end method

.method private e(F)Z
    .locals 1

    .line 307
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Landroid/widget/ImageView;
    .locals 1

    .line 421
    iget-object v0, p0, Lo/cil;->p:Landroid/widget/ImageView;

    return-object v0
.end method

.method public b()Lo/ekw;
    .locals 1

    .line 418
    iget-object v0, p0, Lo/cil;->m:Lo/ekw;

    return-object v0
.end method

.method public c(F)V
    .locals 5

    .line 371
    iget v0, p0, Lo/cil;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 376
    :sswitch_0
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 377
    goto/16 :goto_0

    .line 379
    :sswitch_1
    invoke-direct {p0, p1}, Lo/cil;->a(F)V

    .line 380
    invoke-direct {p0, p1}, Lo/cil;->e(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 383
    iget-object v0, p0, Lo/cil;->i:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 387
    :sswitch_2
    invoke-direct {p0, p1}, Lo/cil;->a(F)V

    .line 388
    goto/16 :goto_0

    .line 390
    :sswitch_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    .line 392
    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    .line 391
    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 398
    :cond_0
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 399
    iget-object v0, p0, Lo/cil;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    goto :goto_0

    .line 404
    :sswitch_4
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    invoke-static {p1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 405
    goto :goto_0

    .line 407
    :sswitch_5
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 408
    goto :goto_0

    .line 410
    :sswitch_6
    iget-object v0, p0, Lo/cil;->f:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 411
    .line 415
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
        0x4 -> :sswitch_0
        0x5 -> :sswitch_0
        0x6 -> :sswitch_4
        0x7 -> :sswitch_5
        0x8 -> :sswitch_6
        0x9 -> :sswitch_4
        0x64 -> :sswitch_2
    .end sparse-switch
.end method

.method public d(F)V
    .locals 5

    .line 310
    iget v0, p0, Lo/cil;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 315
    :sswitch_0
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    goto/16 :goto_0

    .line 318
    :sswitch_1
    invoke-direct {p0, p1}, Lo/cil;->b(F)V

    .line 319
    invoke-direct {p0, p1}, Lo/cil;->e(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lo/cil;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 326
    :sswitch_2
    invoke-direct {p0, p1}, Lo/cil;->b(F)V

    .line 327
    goto/16 :goto_0

    .line 329
    :sswitch_3
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    .line 331
    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    .line 330
    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 338
    iget-object v0, p0, Lo/cil;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/cil;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    goto :goto_0

    .line 343
    :sswitch_4
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    invoke-static {p1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    goto :goto_0

    .line 346
    :sswitch_5
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    goto :goto_0

    .line 349
    :sswitch_6
    iget-object v0, p0, Lo/cil;->c:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    .line 354
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x3 -> :sswitch_3
        0x4 -> :sswitch_0
        0x5 -> :sswitch_0
        0x6 -> :sswitch_4
        0x7 -> :sswitch_5
        0x8 -> :sswitch_6
        0x9 -> :sswitch_4
        0x64 -> :sswitch_2
    .end sparse-switch
.end method
