.class public abstract Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private A:Ljava/lang/String;

.field protected B:F

.field protected C:Landroid/os/Handler;

.field private D:Landroid/view/View;

.field private F:Landroid/widget/ImageView;

.field private H:Lo/fac$c;

.field private I:Landroid/widget/ImageView;

.field protected a:Landroid/widget/TextView;

.field protected b:Lo/fac;

.field protected c:Lo/fab;

.field protected d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected e:Landroid/content/Context;

.field protected f:Landroid/widget/LinearLayout;

.field protected g:Landroid/widget/LinearLayout;

.field protected h:Landroid/widget/LinearLayout;

.field protected i:Landroid/widget/TextView;

.field private j:Landroid/widget/ImageView;

.field protected k:Landroid/widget/TextView;

.field protected l:Landroid/widget/TextView;

.field protected m:Landroid/widget/TextView;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/widget/TextView;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/view/View;

.field protected s:Landroid/widget/TextView;

.field protected t:Landroid/view/View;

.field protected u:Landroid/widget/TextView;

.field protected v:Z

.field protected w:Landroid/graphics/drawable/AnimationDrawable;

.field protected x:I

.field protected y:Landroid/widget/ImageView;

.field protected z:Lo/exr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 43
    const-string v0, "BaseHeartRateDetailFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->A:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->d:Ljava/util/ArrayList;

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->v:Z

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->z:Lo/exr;

    .line 97
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->x:I

    .line 99
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->C:Landroid/os/Handler;

    .line 237
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->B:F

    .line 246
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->H:Lo/fac$c;

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    .line 128
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->a:Landroid/widget/TextView;

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->g:Landroid/widget/LinearLayout;

    .line 131
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_min_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->h:Landroid/widget/LinearLayout;

    .line 132
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_max_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->f:Landroid/widget/LinearLayout;

    .line 133
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->k:Landroid/widget/TextView;

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->k:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_latest_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->i:Landroid/widget/TextView;

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->i:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_min_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->p:Landroid/widget/TextView;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->p:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_max_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->n:Landroid/widget/TextView;

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->n:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_maximum_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->l:Landroid/widget/TextView;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->l:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_anaerobic_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->o:Landroid/widget/TextView;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->o:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_aerobic_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->m:Landroid/widget/TextView;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->m:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_fat_burn_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->q:Landroid/widget/TextView;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->q:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_warm_up_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->u:Landroid/widget/TextView;

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->u:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_zone_except_fitness_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->s:Landroid/widget/TextView;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->s:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->I:Landroid/widget/ImageView;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->r:Landroid/view/View;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->j:Landroid/widget/ImageView;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    .line 160
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_details:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->F:Landroid/widget/ImageView;

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->F:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->F:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->F:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 180
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->x:I

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 183
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 2

    .line 221
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->y:Landroid/widget/ImageView;

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->y:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 227
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fac;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    .line 229
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->d:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->c:Lo/fab;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->c:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fac;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 232
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->d()V

    .line 233
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b()V
    .locals 0

    .line 236
    return-void
.end method

.method public abstract c()V
.end method

.method protected d()V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fac;->setScanScroll(Z)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->b:Lo/fac;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->H:Lo/fac$c;

    invoke-virtual {v0, v1}, Lo/fac;->setOnViewPagerTouchEventListener(Lo/fac$c;)V

    .line 245
    return-void
.end method

.method protected d(II)V
    .locals 2

    .line 293
    if-lez p1, :cond_0

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 297
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->t:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 300
    :goto_0
    if-lt p1, p2, :cond_1

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 304
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 306
    :goto_1
    return-void
.end method

.method public e()V
    .locals 0

    .line 240
    return-void
.end method

.method protected e(Lo/ext;)V
    .locals 12

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateTotalDatasUI null == hrZoneConf return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void

    .line 192
    :cond_0
    iget v0, p1, Lo/ext;->c:F

    float-to-int v6, v0

    .line 193
    iget v0, p1, Lo/ext;->f:F

    float-to-int v7, v0

    .line 194
    iget v0, p1, Lo/ext;->a:F

    float-to-int v8, v0

    .line 195
    iget v0, p1, Lo/ext;->e:F

    float-to-int v9, v0

    .line 196
    iget v0, p1, Lo/ext;->d:F

    float-to-int v10, v0

    .line 197
    iget v0, p1, Lo/ext;->b:F

    float-to-int v11, v0

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->u:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v7, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v7

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v8, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v8

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v9, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v9

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v10, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v10

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v11

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->u:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v7, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v8, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v7

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v9, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v8

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v10, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v9

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v11

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v10

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v2, v6

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->A:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->D:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 105
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_heart_rate_detail:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->D:Landroid/view/View;

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    .line 109
    new-instance v0, Lo/exr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/exr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->z:Lo/exr;

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->v:Z

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->D:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->a(Landroid/view/View;)V

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->a()V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->D:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->d(Landroid/view/View;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->C:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/BaseHeartRateDetailFragment;->D:Landroid/view/View;

    return-object v0
.end method
