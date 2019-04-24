.class public Lo/cie;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static h:I

.field private static o:I


# instance fields
.field private a:I

.field private b:Lo/ekw;

.field private c:I

.field private d:Landroid/content/Context;

.field private e:Lo/chq;

.field private f:I

.field private g:Landroid/view/View;

.field private i:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/4 v0, 0x1

    sput v0, Lo/cie;->h:I

    .line 46
    const/4 v0, 0x0

    sput v0, Lo/cie;->o:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/cie;->k:I

    .line 50
    iput-object p1, p0, Lo/cie;->d:Landroid/content/Context;

    .line 51
    iput p2, p0, Lo/cie;->a:I

    .line 52
    iput p3, p0, Lo/cie;->c:I

    .line 53
    return-void
.end method

.method private a()V
    .locals 3

    .line 188
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chq;->setType(I)V

    .line 189
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/chq;->e(I)V

    .line 190
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    iget-object v1, p0, Lo/cie;->e:Lo/chq;

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {v1, v2}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/chq;->setLineWidth(F)V

    .line 191
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    iget-object v1, p0, Lo/cie;->e:Lo/chq;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v1, v2}, Lo/chq;->c(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/chq;->b(F)V

    .line 192
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Lo/chq;->a(F)V

    .line 193
    iget v0, p0, Lo/cie;->c:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 194
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    sget v1, Lo/cdw;->i:I

    sget v2, Lo/cdw;->k:I

    invoke-virtual {v0, v1, v2}, Lo/chq;->c(II)V

    .line 195
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    sget v1, Lo/cdw;->r:I

    invoke-virtual {v0, v1}, Lo/chq;->setLineColor(I)V

    goto :goto_0

    .line 197
    :cond_0
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    sget v1, Lo/cdw;->q:I

    sget v2, Lo/cdw;->t:I

    invoke-virtual {v0, v1, v2}, Lo/chq;->c(II)V

    .line 198
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    sget v1, Lo/cdw;->y:I

    invoke-virtual {v0, v1}, Lo/chq;->setLineColor(I)V

    .line 200
    :goto_0
    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 8

    .line 124
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->limit_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 125
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->anaerobic_endurance_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 126
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->aerobic_endurance_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 127
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->burning_fat_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->warm_time_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 130
    invoke-static {p2}, Lo/cgm;->e(I)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v6

    .line 131
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v7

    .line 132
    const/4 v0, 0x1

    if-ne v0, v7, :cond_0

    .line 133
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_anaerobicAdvance_threshold:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 134
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_anaerobicBase_threshold:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 135
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_lacticAcid_threshold:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 136
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_aerobicAdvance_threshold:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 137
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_hrr_aerobicBase_threshold:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 139
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 140
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 141
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 142
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(I)V

    .line 143
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 145
    :goto_0
    return-void
.end method

.method private b()Landroid/view/View;
    .locals 4

    .line 172
    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_steprate:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 173
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->step_rate_info:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 174
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->step_avg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 175
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinrate:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 176
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->step_max:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 177
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinbig:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 178
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_sc_j_bupin:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chq;

    iput-object v0, p0, Lo/cie;->e:Lo/chq;

    .line 179
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinbig_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 180
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinrate_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->h:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 181
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->step_rate_y_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 182
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->step_rate_x_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->i:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 183
    invoke-direct {p0}, Lo/cie;->a()V

    .line 184
    return-object v3
.end method

.method private b(I)Landroid/view/View;
    .locals 4

    .line 93
    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_heart:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 94
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_detail_heart_chart:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ekw;

    iput-object v0, p0, Lo/cie;->b:Lo/ekw;

    .line 95
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_heart_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 96
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_avg_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 97
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_avg_num:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 98
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_avg_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 99
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_right_unit:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 100
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_max_num:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 101
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->limit_time_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 102
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->limit_time_value:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 103
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->anaerobic_endurance_time_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 104
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->anaerobic_endurance_time_value:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 105
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->aerobic_endurance_time_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 106
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->aerobic_endurance_time_value:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 107
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->burning_fat_time_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 108
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->burning_fat_time_value:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 109
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->warm_time_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 110
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->warm_time_value:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->s:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 111
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_track_detail_right_title:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lo/cdw;->q:I

    invoke-direct {p0, v0, v1}, Lo/cie;->e(Landroid/widget/TextView;I)V

    .line 112
    invoke-direct {p0, v3, p1}, Lo/cie;->a(Landroid/view/View;I)V

    .line 113
    return-object v3
.end method

.method private b(Lo/cgt;)V
    .locals 7

    .line 237
    iget v5, p0, Lo/cie;->i:I

    .line 238
    iget v6, p0, Lo/cie;->f:I

    .line 240
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_avg_num:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_device_heart_max_num:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    int-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 242
    invoke-direct {p0, p1}, Lo/cie;->d(Lo/cgt;)V

    .line 243
    return-void
.end method

.method private c()Landroid/view/View;
    .locals 4

    .line 165
    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_steprate:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 166
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_sc_j_bupin:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chq;

    iput-object v0, p0, Lo/cie;->e:Lo/chq;

    .line 167
    invoke-direct {p0}, Lo/cie;->a()V

    .line 168
    return-object v3
.end method

.method private c(I)Landroid/view/View;
    .locals 4

    .line 117
    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_viewholder_heart:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 118
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_detail_heart_chart:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ekw;

    iput-object v0, p0, Lo/cie;->b:Lo/ekw;

    .line 119
    invoke-direct {p0, v3, p1}, Lo/cie;->a(Landroid/view/View;I)V

    .line 120
    return-object v3
.end method

.method private d(I)Ljava/lang/String;
    .locals 6

    .line 286
    const/4 v5, 0x0

    .line 287
    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 288
    if-lez p1, :cond_0

    const/16 v0, 0x3c

    if-ge p1, v0, :cond_0

    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cie;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 291
    :cond_0
    div-int/lit8 v0, p1, 0x3c

    invoke-static {v0}, Lo/cdl;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 294
    :cond_1
    :goto_0
    return-object v5
.end method

.method private d(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 0

    .line 210
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    return-void
.end method

.method private d(Lo/cgt;)V
    .locals 13

    .line 247
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 248
    :cond_0
    return-void

    .line 250
    :cond_1
    const/4 v3, 0x0

    .line 251
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 252
    invoke-virtual {p1}, Lo/cgt;->b()Lo/cew;

    move-result-object v0

    invoke-virtual {v0}, Lo/cew;->h()Ljava/util/ArrayList;

    move-result-object v5

    .line 253
    .line 254
    invoke-virtual {p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestmHeartrateZoneType()I

    move-result v0

    .line 255
    invoke-virtual {p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    .line 253
    invoke-static {v5, v0, v1, v2}, Lo/cgm;->a(Ljava/util/List;IJ)[I

    move-result-object v6

    .line 256
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 257
    const/4 v0, 0x1

    aget v8, v6, v0

    .line 258
    const/4 v0, 0x2

    aget v9, v6, v0

    .line 259
    const/4 v0, 0x3

    aget v10, v6, v0

    .line 260
    const/4 v0, 0x4

    aget v11, v6, v0

    .line 261
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->limit_time_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v10}, Lo/cie;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->anaerobic_endurance_time_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v11}, Lo/cie;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->aerobic_endurance_time_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v9}, Lo/cie;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->burning_fat_time_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v8}, Lo/cie;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->warm_time_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, v7}, Lo/cie;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 268
    add-int v0, v7, v8

    add-int/2addr v0, v9

    add-int/2addr v0, v10

    add-int v3, v0, v11

    .line 270
    if-nez v3, :cond_2

    .line 271
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->heart_rate_chart_show_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 272
    return-void

    .line 274
    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_sc_j_heart_pie:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/chg;

    .line 280
    iget v0, p0, Lo/cie;->k:I

    invoke-virtual {v12, v4, v0}, Lo/chg;->setTime(Ljava/util/ArrayList;I)V

    .line 281
    return-void
.end method

.method private e()Landroid/view/View;
    .locals 5

    .line 149
    iget v0, p0, Lo/cie;->c:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 151
    :sswitch_0
    invoke-direct {p0}, Lo/cie;->b()Landroid/view/View;

    move-result-object v4

    .line 152
    goto :goto_1

    .line 154
    :sswitch_1
    invoke-direct {p0}, Lo/cie;->c()Landroid/view/View;

    move-result-object v4

    .line 155
    goto :goto_1

    .line 157
    :goto_0
    const-string v0, "Track_ChartViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStepRateChart unknow styletype"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 161
    :goto_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_1
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(I)Landroid/view/View;
    .locals 5

    .line 75
    iget v0, p0, Lo/cie;->c:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 77
    :sswitch_0
    invoke-direct {p0, p1}, Lo/cie;->c(I)Landroid/view/View;

    move-result-object v4

    .line 78
    sget v0, Lo/cie;->h:I

    iput v0, p0, Lo/cie;->k:I

    .line 79
    goto :goto_1

    .line 81
    :sswitch_1
    invoke-direct {p0, p1}, Lo/cie;->b(I)Landroid/view/View;

    move-result-object v4

    .line 82
    sget v0, Lo/cie;->o:I

    iput v0, p0, Lo/cie;->k:I

    .line 83
    goto :goto_1

    .line 85
    :goto_0
    const-string v0, "Track_ChartViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHeartRateChart unknow styletype"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 89
    :goto_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_1
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Landroid/widget/TextView;I)V
    .locals 0

    .line 205
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 206
    return-void
.end method

.method private e(Lo/cgt;)V
    .locals 7

    .line 302
    invoke-virtual {p1}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 303
    invoke-virtual {p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v1

    .line 302
    const/16 v2, 0x2710

    invoke-static {v0, v1, v2}, Lo/cgm;->d(Ljava/util/ArrayList;II)Ljava/util/ArrayList;

    move-result-object v5

    .line 304
    iget v6, p0, Lo/cie;->f:I

    .line 305
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinbig:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    int-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_tv_tb_bupinrate:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lo/cie;->i:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cie;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    int-to-float v1, v6

    invoke-static {v1}, Lo/cgm;->c(F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v1, v3}, Lo/chq;->setYaxisValues(III)V

    .line 308
    iget-object v0, p0, Lo/cie;->e:Lo/chq;

    invoke-virtual {p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/chq;->a(J)V

    .line 309
    invoke-virtual {p1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v0

    iget-object v1, p0, Lo/cie;->e:Lo/chq;

    invoke-static {v5, v0, v1}, Lo/cgm;->d(Ljava/util/ArrayList;ILo/chq;)V

    .line 310
    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 5

    .line 57
    iget v0, p0, Lo/cie;->a:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 59
    :sswitch_0
    invoke-direct {p0, p1}, Lo/cie;->e(I)Landroid/view/View;

    move-result-object v4

    .line 60
    goto :goto_1

    .line 62
    :sswitch_1
    invoke-direct {p0}, Lo/cie;->e()Landroid/view/View;

    move-result-object v4

    .line 63
    goto :goto_1

    .line 65
    :goto_0
    const-string v0, "Track_ChartViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildView unknow charttype"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/cie;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 69
    :goto_1
    iput-object v4, p0, Lo/cie;->g:Landroid/view/View;

    .line 70
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(Lo/cgt;II)V
    .locals 4

    .line 215
    iget-object v0, p0, Lo/cie;->g:Landroid/view/View;

    if-nez v0, :cond_0

    .line 216
    return-void

    .line 219
    :cond_0
    iput p2, p0, Lo/cie;->f:I

    .line 220
    iput p3, p0, Lo/cie;->i:I

    .line 222
    iget v0, p0, Lo/cie;->a:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 224
    :sswitch_0
    invoke-direct {p0, p1}, Lo/cie;->b(Lo/cgt;)V

    .line 225
    goto :goto_1

    .line 227
    :sswitch_1
    invoke-direct {p0, p1}, Lo/cie;->e(Lo/cgt;)V

    .line 228
    goto :goto_1

    .line 230
    :goto_0
    const-string v0, "Track_ChartViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addData unknow charttype"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public d()Lo/ekw;
    .locals 1

    .line 314
    iget-object v0, p0, Lo/cie;->b:Lo/ekw;

    return-object v0
.end method
