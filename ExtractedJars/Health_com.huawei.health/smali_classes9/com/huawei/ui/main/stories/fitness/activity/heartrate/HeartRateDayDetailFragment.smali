.class public Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;
    }
.end annotation


# instance fields
.field private A:Lo/fbf;

.field private B:Landroid/view/View;

.field private C:Landroid/widget/ImageView;

.field private D:Landroid/widget/ImageView;

.field private E:J

.field private F:Lo/eya;

.field private G:Lo/exr;

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eux;>;"
        }
    .end annotation
.end field

.field private I:Ljava/util/Date;

.field private J:Landroid/os/Handler;

.field private L:F

.field private M:Landroid/view/View$OnClickListener;

.field private N:Landroid/view/View$OnClickListener;

.field protected a:Landroid/content/Context;

.field protected b:Landroid/widget/TextView;

.field protected c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected d:Lo/fab;

.field protected e:Lo/fba;

.field protected f:Landroid/widget/TextView;

.field protected g:Landroid/widget/LinearLayout;

.field protected h:Landroid/widget/TextView;

.field protected i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/ImageView;

.field protected k:Landroid/widget/LinearLayout;

.field protected l:Landroid/widget/TextView;

.field protected m:Landroid/widget/TextView;

.field protected n:Landroid/widget/TextView;

.field protected o:Landroid/widget/TextView;

.field protected p:Landroid/widget/TextView;

.field protected q:Landroid/widget/TextView;

.field protected r:Landroid/view/View;

.field protected s:Landroid/view/View;

.field protected t:Landroid/widget/TextView;

.field protected u:Landroid/widget/TextView;

.field protected v:Z

.field protected w:Landroid/graphics/drawable/AnimationDrawable;

.field protected x:Landroid/widget/ImageView;

.field private y:Ljava/lang/String;

.field protected z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 120
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 66
    const-string v0, "HeartRateDayDetailFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c:Ljava/util/ArrayList;

    .line 104
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->F:Lo/eya;

    .line 107
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->E:J

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    .line 165
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->J:Landroid/os/Handler;

    .line 274
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->N:Landroid/view/View$OnClickListener;

    .line 288
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->M:Landroid/view/View$OnClickListener;

    .line 394
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->L:F

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;F)F
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->L:F

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->J:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Landroid/view/View;)V
    .locals 2

    .line 371
    sget v0, Lcom/huawei/ui/main/R$id;->loading_iv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->sleep_loading_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 377
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_viewpager:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fba;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e:Lo/fba;

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->A:Lo/fbf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 380
    new-instance v0, Lo/fbf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fbf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->A:Lo/fbf;

    .line 383
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->A:Lo/fbf;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 386
    new-instance v0, Lo/fab;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lo/fab;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    .line 388
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e:Lo/fba;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    invoke-virtual {v0, v1}, Lo/fba;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 390
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e()V

    .line 391
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->k()V

    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 5

    .line 195
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->E:J

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    .line 196
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_time_date_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b:Landroid/widget/TextView;

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->k:Landroid/widget/LinearLayout;

    .line 207
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_min_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->i:Landroid/widget/LinearLayout;

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_max_heart_rate_layout:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->g:Landroid/widget/LinearLayout;

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_latest_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->h:Landroid/widget/TextView;

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->h:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->f:Landroid/widget/TextView;

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->f:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_max_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->n:Landroid/widget/TextView;

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->n:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_min_value:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->l:Landroid/widget/TextView;

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->l:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_anaerobic_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->p:Landroid/widget/TextView;

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->p:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_maximum_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->m:Landroid/widget/TextView;

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->m:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_fat_burn_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->u:Landroid/widget/TextView;

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->u:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_warm_up_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->q:Landroid/widget/TextView;

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->q:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_aerobic_zone_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->o:Landroid/widget/TextView;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->o:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_heart_rate_zone_except_fitness_tv:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->t:Landroid/widget/TextView;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->t:Landroid/widget/TextView;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    sget v0, Lcom/huawei/ui/main/R$id;->right_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    .line 233
    sget v0, Lcom/huawei/ui/main/R$id;->left_arrow_iv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->s:Landroid/view/View;

    .line 234
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_right:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->D:Landroid/widget/ImageView;

    .line 235
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_detail_up_arrow_left:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->C:Landroid/widget/ImageView;

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->fitness_avg_resting_heart_rate_details:I

    invoke-static {p1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->j:Landroid/widget/ImageView;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->j:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 242
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->j:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->D:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->C:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 252
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->D:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->C:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 256
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->i()V

    .line 257
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->f()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)F
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->L:F

    return v0
.end method

.method private e(II)V
    .locals 2

    .line 260
    if-lez p1, :cond_0

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 267
    :goto_0
    if-lt p1, p2, :cond_1

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->s:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 271
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->s:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 273
    :goto_1
    return-void
.end method

.method private f()V
    .locals 5

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 483
    return-void

    .line 486
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SleepDayDetail updateBarChartUI mDataList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    .line 492
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mDataList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    .line 493
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 491
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->F:Lo/eya;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->A:Lo/fbf;

    sget-object v2, Lo/eic;->U:Lo/eic;

    invoke-virtual {v0, v1, v2}, Lo/eya;->a(Lo/eih;Lo/eic;)Lo/eii;

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->A:Lo/fbf;

    invoke-virtual {v0}, Lo/fbf;->c()V

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh chart view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->c(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 514
    const-string v4, "--"

    .line 516
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->g:Landroid/widget/LinearLayout;

    invoke-static {v4, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 520
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 522
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->b(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 523
    const-string v4, "--"

    .line 525
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->i:Landroid/widget/LinearLayout;

    invoke-static {v4, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 529
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->e(I)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 532
    const-string v4, "--"

    .line 534
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->k:Landroid/widget/LinearLayout;

    invoke-static {v4, v0}, Lo/fiu;->d(Ljava/lang/String;Landroid/widget/LinearLayout;)V

    .line 538
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/exr;->d(I)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 542
    :cond_8
    return-void
.end method

.method private i()V
    .locals 2

    .line 281
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    .line 282
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->s:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->s:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->N:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->r:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->M:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 287
    return-void
.end method

.method private k()V
    .locals 13

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d()Lo/ext;

    move-result-object v6

    .line 547
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateTotalDatasUI null == hrZoneConf return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    return-void

    .line 551
    :cond_0
    iget v0, v6, Lo/ext;->c:F

    float-to-int v7, v0

    .line 552
    iget v0, v6, Lo/ext;->f:F

    float-to-int v8, v0

    .line 553
    iget v0, v6, Lo/ext;->a:F

    float-to-int v9, v0

    .line 554
    iget v0, v6, Lo/ext;->e:F

    float-to-int v10, v0

    .line 555
    iget v0, v6, Lo/ext;->d:F

    float-to-int v11, v0

    .line 556
    iget v0, v6, Lo/ext;->b:F

    float-to-int v12, v0

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->q:Landroid/widget/TextView;

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

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->u:Landroid/widget/TextView;

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

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->o:Landroid/widget/TextView;

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

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->p:Landroid/widget/TextView;

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

    add-int/lit8 v2, v11, -0x1

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

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->m:Landroid/widget/TextView;

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

    int-to-double v2, v12

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->t:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<"

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

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 564
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->q:Landroid/widget/TextView;

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

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->u:Landroid/widget/TextView;

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

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->o:Landroid/widget/TextView;

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

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v11, -0x1

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

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-double v2, v12

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

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->t:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v2, v7

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

    .line 571
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateTotalDatasUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 330
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    .line 331
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    const v1, 0xea60

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e(II)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 334
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    .line 335
    return-void

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 362
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c()V

    .line 363
    return-void
.end method

.method public b()V
    .locals 4

    .line 295
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    .line 296
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    const v1, 0xea60

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e(II)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    const v1, 0xea60

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    if-eqz v0, :cond_1

    .line 299
    :cond_0
    return-void

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d:Lo/fab;

    invoke-virtual {v0}, Lo/fab;->notifyDataSetChanged()V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->w:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 326
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c()V

    .line 327
    return-void
.end method

.method public c()V
    .locals 6

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->I:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v5, v2, v1}, Lo/exr;->d(JILo/egg;)V

    .line 452
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestDatas"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    return-void
.end method

.method public d()Lo/ext;
    .locals 5

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    invoke-virtual {v0}, Lo/exr;->d()Lo/ext;

    move-result-object v4

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartRateZone hrZoneConf = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    return-object v4
.end method

.method public e()V
    .locals 2

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->e:Lo/fba;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$8;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/fba;->setOnViewPagerTouchEventListener(Lo/fba$b;)V

    .line 438
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

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "START:onCreateView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->B:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 132
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_fitness_heart_rate_detail_day:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->B:Landroid/view/View;

    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    .line 145
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->E:J

    .line 147
    new-instance v0, Lo/exr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/exr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->G:Lo/exr;

    .line 149
    new-instance v0, Lo/eya;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eya;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->F:Lo/eya;

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->B:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d(Landroid/view/View;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->B:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c(Landroid/view/View;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->J:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->y:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "END:onCreateView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->B:Landroid/view/View;

    return-object v0
.end method
