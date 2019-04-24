.class public Lo/bve;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/bwa;F)V
    .locals 4

    .line 147
    float-to-double v0, p1

    const-wide v2, 0x3fe3333333333333L    # 0.6

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 148
    iget-object v0, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bwa;->a(Z)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lo/bwa;->d:Landroid/view/SurfaceView;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setTag(Ljava/lang/Object;)V

    .line 154
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lo/bwa;I)V
    .locals 2

    .line 173
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lo/bwa;->b:Landroid/widget/ImageView;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 175
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 176
    iget-object v0, p0, Lo/bwa;->b:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    add-int/lit8 v1, p1, -0x1

    if-ne v0, v1, :cond_2

    .line 178
    iget-object v0, p0, Lo/bwa;->e:Landroid/widget/ImageView;

    const v1, 0x3ecccccd    # 0.4f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 179
    :cond_2
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    add-int/lit8 v1, p1, -0x2

    if-ne v0, v1, :cond_3

    .line 180
    iget-object v0, p0, Lo/bwa;->e:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 182
    :cond_3
    :goto_0
    return-void
.end method

.method public static a(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 4

    .line 72
    const-string v0, "CoachViewUIHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "state go"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lo/bwa;->d(J)V

    .line 74
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 75
    const/16 v0, 0xbe

    invoke-virtual {p0, v0}, Lo/bwa;->c(I)V

    .line 76
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwt;->a(F)Lo/bwt;

    .line 77
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bwt;->d(IZ)Lo/bwt;

    .line 79
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bwt;->c(IZ)Lo/bwt;

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bwt;->d(IZ)Lo/bwt;

    .line 82
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireRepeat()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bwt;->c(IZ)Lo/bwt;

    .line 84
    :goto_0
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/bwt;->setRoundProgressMax(F)V

    .line 85
    return-void
.end method

.method public static a(ZIZ)Z
    .locals 1

    .line 142
    if-eqz p0, :cond_0

    const/16 v0, -0x64

    if-eq p1, v0, :cond_0

    if-nez p2, :cond_0

    const/16 v0, 0xc0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b()F
    .locals 5

    .line 132
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v4

    .line 133
    if-eqz v4, :cond_0

    .line 134
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v0

    return v0

    .line 136
    :cond_0
    const-string v0, "CoachViewUIHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_weight_error:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 124
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p0}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    const-string v1, "1000"

    .line 128
    :cond_0
    return-object v1
.end method

.method public static b(Lo/bwa;I)V
    .locals 4

    .line 63
    const-string v0, "CoachViewUIHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    const/16 v1, 0xbe

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 65
    const/16 v0, 0xbe

    invoke-virtual {p0, v0}, Lo/bwa;->c(I)V

    .line 66
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bwt;->setAutoProgress(I)V

    .line 67
    return-void
.end method

.method public static b(Lo/bwa;II)V
    .locals 2

    .line 89
    if-nez p1, :cond_0

    .line 90
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 91
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 92
    :cond_0
    if-ne p1, p2, :cond_1

    .line 93
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 97
    invoke-virtual {p0}, Lo/bwa;->B()Lo/bwp;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    :goto_0
    return-void
.end method

.method public static b(Lo/bwa;ILcom/huawei/health/suggestion/ui/fitness/module/Motion;I)V
    .locals 2

    .line 111
    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->d()I

    move-result v0

    if-ne v0, p3, :cond_0

    .line 112
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Lo/bvh;->e(ZLcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->E()Lo/bvh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p2}, Lo/bvh;->e(ZLcom/huawei/health/suggestion/ui/fitness/module/Motion;)Lo/bvx;

    .line 120
    :goto_0
    return-void
.end method

.method public static c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4

    .line 185
    const-string v0, "timer"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_second_nogap:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, p1

    invoke-static {v2, v3}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 188
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_times:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    int-to-double v2, p1

    invoke-static {v2, v3}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, p1, v1}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lo/bwa;I)V
    .locals 4

    .line 192
    invoke-static {}, Lo/bvo;->c()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v3

    .line 193
    invoke-virtual {v3, p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 195
    :pswitch_0
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_blue:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 196
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 197
    goto/16 :goto_0

    .line 199
    :pswitch_1
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_green:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 200
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 201
    goto :goto_0

    .line 203
    :pswitch_2
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_yellow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 204
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 205
    goto :goto_0

    .line 207
    :pswitch_3
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_orange:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 208
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 209
    goto :goto_0

    .line 211
    :pswitch_4
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_red:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 212
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 213
    goto :goto_0

    .line 215
    :pswitch_5
    iget-object v0, p0, Lo/bwa;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->pic_video_rate_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 216
    iget-object v0, p0, Lo/bwa;->w:Lo/efy;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 217
    .line 222
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static c(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 6

    .line 35
    const-string v0, "timer"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->e()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bwt;->d(IZ)Lo/bwt;

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lo/bwa;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->e()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bwt;->d(IZ)Lo/bwt;

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->e()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bwt;->d(IZ)Lo/bwt;

    .line 44
    :goto_0
    const-string v0, "hotbody"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    invoke-virtual {p0}, Lo/bwa;->w()Lo/bus;

    move-result-object v0

    invoke-virtual {v0}, Lo/bus;->q()I

    move-result v0

    int-to-float v5, v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v5

    .line 47
    :goto_1
    const-string v0, "hotbody"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    invoke-virtual {p0}, Lo/bwa;->H()Lo/bwg;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    .line 49
    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lo/bwa;->H()Lo/bwg;

    move-result-object v3

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v4

    invoke-virtual {v4}, Lo/bwa$d;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Lo/bwg;->a(I)F

    move-result v3

    mul-float/2addr v2, v3

    div-float/2addr v2, v5

    .line 48
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lo/bwg;->setProgress(IIF)V

    .line 50
    invoke-virtual {p0}, Lo/bwa;->A()Lo/bwg;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    .line 51
    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lo/bwa;->H()Lo/bwg;

    move-result-object v3

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v4

    invoke-virtual {v4}, Lo/bwa$d;->d()I

    move-result v4

    invoke-virtual {v3, v4}, Lo/bwg;->a(I)F

    move-result v3

    mul-float/2addr v2, v3

    div-float/2addr v2, v5

    .line 50
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lo/bwg;->setProgress(IIF)V

    goto :goto_2

    .line 53
    :cond_3
    invoke-virtual {p0}, Lo/bwa;->H()Lo/bwg;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwa$d;->c()I

    move-result v2

    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo/bwg;->setProgress(IIF)V

    .line 54
    invoke-virtual {p0}, Lo/bwa;->A()Lo/bwg;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->d()I

    move-result v1

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwa$d;->c()I

    move-result v2

    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo/bwg;->setProgress(IIF)V

    .line 57
    :goto_2
    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->v()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/bwa;->G()Lo/bwt;

    move-result-object v2

    invoke-virtual {v2}, Lo/bwt;->getRoundProgressMax()F

    move-result v2

    mul-float/2addr v1, v2

    div-float/2addr v1, v5

    invoke-virtual {v0, v1}, Lo/bwt;->a(F)Lo/bwt;

    .line 58
    return-void
.end method

.method public static d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 102
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCommentaryGap()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCommentaryGap()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 103
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCommentaryGap()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireContent()Ljava/lang/String;

    move-result-object p1

    .line 105
    :cond_0
    return-object p1
.end method

.method public static d(Lo/bwa;Lcom/huawei/health/suggestion/ui/fitness/module/Motion;)V
    .locals 3

    .line 166
    invoke-virtual {p0}, Lo/bwa;->F()Lo/bwi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    invoke-virtual {p0}, Lo/bwa;->F()Lo/bwi;

    move-result-object v0

    invoke-virtual {p0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/bwa$d;->c()I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v2

    invoke-interface {v0, p1, v1, v2}, Lo/bwi;->d(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;II)V

    .line 169
    :cond_0
    return-void
.end method

.method public static d(I)Z
    .locals 1

    .line 162
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_iv_continue:I

    if-eq p0, v0, :cond_0

    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_voice_ok:I

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Lo/bwa;I)Z
    .locals 1

    .line 158
    invoke-virtual {p0}, Lo/bwa;->F()Lo/bwi;

    move-result-object v0

    if-eqz v0, :cond_0

    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_set_iv_stop:I

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
