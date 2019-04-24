.class public Lo/esx;
.super Lo/erc;
.source "SourceFile"


# instance fields
.field public A:Landroid/widget/ImageView;

.field public B:Landroid/widget/ImageView;

.field public C:Landroid/view/View;

.field public D:Lo/egb;

.field public E:Landroid/widget/LinearLayout;

.field public F:Landroid/view/View;

.field public G:Landroid/widget/LinearLayout;

.field public H:Landroid/widget/RelativeLayout;

.field public I:Landroid/view/View;

.field public a:Lo/egb;

.field public b:Lo/egb;

.field public c:Lo/epu;

.field public d:Lo/egb;

.field public e:Lo/egb;

.field public f:Lo/egb;

.field public g:Lo/egb;

.field public h:Lo/egb;

.field public i:Lo/egb;

.field public j:Landroid/widget/ImageView;

.field public k:Lo/egb;

.field public l:Lo/egb;

.field public m:Lo/egb;

.field public n:Lo/egb;

.field public o:Lo/egb;

.field public p:Lo/egb;

.field public q:Landroid/widget/RelativeLayout;

.field public r:Landroid/widget/RelativeLayout;

.field public s:Lo/egb;

.field public t:Lo/egb;

.field public v:Landroid/widget/LinearLayout;

.field public w:Landroid/widget/LinearLayout;

.field public x:Landroid/widget/LinearLayout;

.field public y:Landroid/widget/RelativeLayout;

.field public z:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 5

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 54
    sget v0, Lcom/huawei/ui/homehealth/R$id;->stepView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/epu;

    iput-object v0, p0, Lo/esx;->c:Lo/epu;

    .line 55
    sget v0, Lcom/huawei/ui/homehealth/R$id;->stepsText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->d:Lo/egb;

    .line 56
    iget-object v0, p0, Lo/esx;->d:Lo/egb;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 57
    sget v0, Lcom/huawei/ui/homehealth/R$id;->calories_distance_devider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/esx;->F:Landroid/view/View;

    .line 58
    sget v0, Lcom/huawei/ui/homehealth/R$id;->calories_climb_devider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/esx;->I:Landroid/view/View;

    .line 60
    sget v0, Lcom/huawei/ui/homehealth/R$id;->time_strength_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->w:Landroid/widget/LinearLayout;

    .line 66
    sget v0, Lcom/huawei/ui/homehealth/R$id;->iv_steps_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/esx;->A:Landroid/widget/ImageView;

    .line 67
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_steps:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->p:Lo/egb;

    .line 68
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_intensity_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/esx;->B:Landroid/widget/ImageView;

    .line 69
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_sport_intensity:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->o:Lo/egb;

    .line 70
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_home_dameon_beta_version_no_expire:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/esx;->r:Landroid/widget/RelativeLayout;

    .line 72
    if-eqz p2, :cond_0

    invoke-static {p2}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/esx;->A:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_home_card_data_circle_step_mirror:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 74
    iget-object v0, p0, Lo/esx;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_home_card_zata_circle_time_mirror:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 75
    iget-object v0, p0, Lo/esx;->r:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_beta_tip_logo_rt:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 78
    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Lo/esx;->p:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 80
    iget-object v0, p0, Lo/esx;->A:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lo/esx;->B:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 83
    iget-object v0, p0, Lo/esx;->o:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    goto :goto_0

    .line 85
    :cond_1
    iget-object v0, p0, Lo/esx;->p:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lo/esx;->A:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 88
    iget-object v0, p0, Lo/esx;->B:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lo/esx;->o:Lo/egb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 91
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->timeText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->h:Lo/egb;

    .line 92
    iget-object v0, p0, Lo/esx;->h:Lo/egb;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 93
    sget v0, Lcom/huawei/ui/homehealth/R$id;->unit_meter:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->l:Lo/egb;

    .line 94
    sget v0, Lcom/huawei/ui/homehealth/R$id;->unit_calories:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->f:Lo/egb;

    .line 95
    sget v0, Lcom/huawei/ui/homehealth/R$id;->unit_distance:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->m:Lo/egb;

    .line 96
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_calories_distance_devider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/esx;->C:Landroid/view/View;

    .line 98
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_fitness_data_origin_icon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/esx;->j:Landroid/widget/ImageView;

    .line 99
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_fitness_data_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->n:Lo/egb;

    .line 100
    sget v0, Lcom/huawei/ui/homehealth/R$id;->stepLayout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->G:Landroid/widget/LinearLayout;

    .line 102
    sget v0, Lcom/huawei/ui/homehealth/R$id;->notice_message11:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->i:Lo/egb;

    .line 104
    sget v0, Lcom/huawei/ui/homehealth/R$id;->calories:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->e:Lo/egb;

    .line 105
    iget-object v0, p0, Lo/esx;->e:Lo/egb;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 106
    sget v0, Lcom/huawei/ui/homehealth/R$id;->distance:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->a:Lo/egb;

    .line 107
    iget-object v0, p0, Lo/esx;->a:Lo/egb;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 108
    sget v0, Lcom/huawei/ui/homehealth/R$id;->floor:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->b:Lo/egb;

    .line 109
    sget v0, Lcom/huawei/ui/homehealth/R$id;->climb_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->k:Lo/egb;

    .line 110
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_calories:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->z:Landroid/widget/LinearLayout;

    .line 111
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_floors:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->v:Landroid/widget/LinearLayout;

    .line 112
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_steps_card_distance:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->x:Landroid/widget/LinearLayout;

    .line 113
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_health_home_dameon_killed_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    .line 114
    sget v0, Lcom/huawei/ui/homehealth/R$id;->rl_oppo_vivo_help:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    .line 115
    iget-object v0, p0, Lo/esx;->q:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_show_tips_close:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->g:Lo/egb;

    .line 116
    iget-object v0, p0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->tv_go_to:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->s:Lo/egb;

    .line 117
    iget-object v0, p0, Lo/esx;->y:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->tv_ignore:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->t:Lo/egb;

    .line 126
    sget v0, Lcom/huawei/ui/homehealth/R$id;->opera_msg_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/esx;->D:Lo/egb;

    .line 127
    sget v0, Lcom/huawei/ui/homehealth/R$id;->opera_msg_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/esx;->E:Landroid/widget/LinearLayout;

    .line 128
    sget v0, Lcom/huawei/ui/homehealth/R$id;->no_opera_msg_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/esx;->H:Landroid/widget/RelativeLayout;

    .line 131
    if-eqz p2, :cond_2

    invoke-static {p2}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    iget-object v0, p0, Lo/esx;->e:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 133
    iget-object v0, p0, Lo/esx;->f:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 134
    iget-object v0, p0, Lo/esx;->a:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 135
    iget-object v0, p0, Lo/esx;->m:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 136
    iget-object v0, p0, Lo/esx;->b:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 137
    iget-object v0, p0, Lo/esx;->l:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 140
    :cond_2
    if-eqz p2, :cond_3

    invoke-static {p2}, Lo/cxa;->W(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    iget-object v0, p0, Lo/esx;->k:Lo/egb;

    const/4 v1, 0x1

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v0, v1, v2}, Lo/egb;->setTextSize(IF)V

    .line 145
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 146
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/dbf;->k()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-gtz v0, :cond_4

    invoke-static {}, Lo/dbf;->h()J

    move-result-wide v0

    cmp-long v0, v3, v0

    if-gtz v0, :cond_4

    .line 147
    iget-object v0, p0, Lo/esx;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 150
    :cond_4
    iget-object v0, p0, Lo/esx;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 154
    :goto_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 156
    iget-object v0, p0, Lo/esx;->u:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cds;->e(Landroid/content/Context;I)V

    .line 158
    :cond_5
    return-void
.end method
