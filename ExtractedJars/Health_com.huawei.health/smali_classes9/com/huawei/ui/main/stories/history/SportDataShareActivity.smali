.class public Lcom/huawei/ui/main/stories/history/SportDataShareActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static R:Landroid/graphics/Bitmap;

.field private static final e:I


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/view/View;

.field private C:Landroid/view/View;

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/chj;>;"
        }
    .end annotation
.end field

.field private E:Landroid/widget/Button;

.field private F:Ljava/lang/String;

.field private G:Landroid/view/View;

.field private H:Landroid/view/View;

.field private I:Landroid/widget/TextView;

.field private J:Ljava/lang/String;

.field private K:Ljava/lang/String;

.field private L:Ljava/lang/String;

.field private M:Ljava/lang/String;

.field private N:Ljava/lang/String;

.field private O:Landroid/os/Handler;

.field private Q:Landroid/content/Context;

.field private a:Z

.field b:Lo/dav;

.field private c:Z

.field private d:Z

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Z

.field private i:Lcom/huawei/hihealth/HiHealthData;

.field private j:Landroid/view/View;

.field private k:Z

.field private l:Lo/chj;

.field private m:Lo/che;

.field private n:Lo/chj;

.field private o:Lo/chj;

.field private p:Ljava/lang/String;

.field private q:Lo/chj;

.field private r:Lo/chj;

.field private s:Lo/chj;

.field private t:Landroid/content/res/Resources;

.field private u:Lo/chj;

.field private v:Ljava/lang/String;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->e:I

    .line 93
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->R:Landroid/graphics/Bitmap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 84
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    .line 91
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->O:Landroid/os/Handler;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/widget/Button;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->E:Landroid/widget/Button;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 167
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 168
    if-nez v2, :cond_0

    .line 169
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c:Z

    .line 170
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->finish()V

    goto/16 :goto_1

    .line 172
    :cond_0
    const-string v0, "step_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->F:Ljava/lang/String;

    .line 173
    const-string v0, "dis_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->L:Ljava/lang/String;

    .line 174
    const-string v0, "cal_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->M:Ljava/lang/String;

    .line 175
    const-string v0, "dur_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->K:Ljava/lang/String;

    .line 176
    const-string v0, "count_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->N:Ljava/lang/String;

    .line 177
    const-string v0, "ab_count_sum"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->J:Ljava/lang/String;

    .line 178
    const-string v0, "time_str"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->f:Ljava/lang/String;

    .line 179
    const-string v0, "sum_data"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    .line 180
    const-string v0, "is_bike"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a:Z

    .line 181
    const-string v0, "type_int"

    const/16 v1, 0x102

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->x:I

    .line 182
    const-string v0, "page_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->w:I

    .line 183
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->x:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 185
    :sswitch_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_workout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->p:Ljava/lang/String;

    .line 186
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k:Z

    .line 187
    goto :goto_1

    .line 189
    :sswitch_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_cycle:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->p:Ljava/lang/String;

    .line 190
    goto :goto_1

    .line 192
    :sswitch_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->p:Ljava/lang/String;

    .line 193
    goto :goto_1

    .line 196
    :goto_0
    :sswitch_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->p:Ljava/lang/String;

    .line 201
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_2
        0x102 -> :sswitch_3
        0x103 -> :sswitch_1
        0x2711 -> :sswitch_0
    .end sparse-switch
.end method

.method private a(DD)V
    .locals 8

    .line 486
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    div-double v5, p1, v0

    .line 487
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->g:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, v5, v0

    if-lez v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    const-wide/high16 v1, 0x404e000000000000L    # 60.0

    div-double v1, v5, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_time_hour_value:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 491
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 495
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k:Z

    if-eqz v0, :cond_1

    .line 496
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    goto :goto_1

    .line 499
    :cond_1
    double-to-float v7, p3

    .line 500
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    if-eqz v0, :cond_2

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->I:Landroid/widget/TextView;

    float-to-double v1, v7

    const-wide v3, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 503
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->I:Landroid/widget/TextView;

    float-to-double v1, v7

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->G:Landroid/view/View;

    return-object v0
.end method

.method private b()V
    .locals 16

    .line 121
    const/4 v0, 0x1

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v5

    .line 122
    const/4 v0, 0x1

    const/high16 v1, 0x43610000    # 225.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v6

    .line 124
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 125
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v8

    .line 126
    invoke-virtual {v7}, Landroid/view/Display;->getHeight()I

    move-result v9

    .line 128
    int-to-float v0, v8

    div-float v10, v6, v0

    .line 129
    int-to-float v0, v9

    div-float v11, v5, v0

    .line 130
    cmpl-float v0, v10, v11

    if-lez v0, :cond_0

    move v12, v10

    goto :goto_0

    :cond_0
    move v12, v11

    .line 132
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    const-string v1, "scaleX"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    aput v3, v2, v4

    const/4 v3, 0x1

    aput v12, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    .line 133
    const-wide/16 v0, 0x12c

    invoke-virtual {v13, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    const-string v1, "scaleY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    aput v3, v2, v4

    const/4 v3, 0x1

    aput v12, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 135
    const-wide/16 v0, 0x12c

    invoke-virtual {v14, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 136
    new-instance v15, Landroid/animation/AnimatorSet;

    invoke-direct {v15}, Landroid/animation/AnimatorSet;-><init>()V

    .line 137
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/animation/Animator;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    const/4 v1, 0x1

    aput-object v14, v0, v1

    invoke-virtual {v15, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 138
    new-instance v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$1;-><init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V

    invoke-virtual {v15, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 161
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotY(F)V

    .line 163
    invoke-virtual {v15}, Landroid/animation/AnimatorSet;->start()V

    .line 164
    return-void
.end method

.method private b(DD)V
    .locals 3

    .line 509
    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-lez v0, :cond_0

    const-wide/16 v0, 0x0

    cmpg-double v0, p3, v0

    if-gtz v0, :cond_1

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 514
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    if-eqz v0, :cond_2

    .line 515
    const-wide v0, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, p3

    div-double v0, p1, v0

    double-to-float v2, v0

    goto :goto_0

    .line 517
    :cond_2
    div-double v0, p1, p3

    double-to-float v2, v0

    .line 519
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    invoke-static {v2}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    invoke-static {v2}, Lo/cgl;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 522
    :goto_1
    return-void
.end method

.method private c(Lo/chj$b;)Lo/chj;
    .locals 3

    .line 296
    new-instance v2, Lo/chj;

    invoke-direct {v2, p0}, Lo/chj;-><init>(Landroid/content/Context;)V

    .line 297
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->z:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->y:I

    invoke-virtual {v2, v0, v1}, Lo/chj;->setGroupSize(II)V

    .line 298
    invoke-virtual {v2, p1}, Lo/chj;->setItemView(Lo/chj$b;)V

    .line 299
    sget v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->e:I

    invoke-virtual {v2, v0}, Lo/chj;->setTextColor(I)V

    .line 300
    invoke-virtual {v2}, Lo/chj;->d()V

    .line 301
    return-object v2
.end method

.method private c()V
    .locals 11

    .line 204
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->g:Z

    .line 205
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    .line 206
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    .line 207
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_scrollview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->G:Landroid/view/View;

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_ll:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->B:Landroid/view/View;

    .line 210
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_border:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->H:Landroid/view/View;

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->G:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;-><init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 220
    sget v0, Lcom/huawei/ui/main/R$id;->ll_share_before:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->A:Landroid/view/View;

    .line 221
    sget v0, Lcom/huawei/ui/main/R$id;->ll_share_after:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->C:Landroid/view/View;

    .line 222
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_share_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->j:Landroid/view/View;

    .line 223
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_share_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->E:Landroid/widget/Button;

    .line 224
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_70dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->y:I

    .line 226
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v5

    .line 227
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v5, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->z:I

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->E:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$3;-><init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k()V

    .line 235
    sget v0, Lcom/huawei/ui/main/R$id;->track_detail_map_sport_formal_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_distance_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 237
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_share_date:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->f:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->p:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 238
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_bar_y:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 239
    sget v0, Lcom/huawei/ui/main/R$id;->tv_sport_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 240
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k:Z

    if-eqz v0, :cond_0

    .line 241
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_detail_chart_time_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 245
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    if-eqz v0, :cond_1

    .line 246
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_mi:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    :cond_1
    :goto_0
    invoke-static {p0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 251
    invoke-virtual {v7}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/RelativeLayout$LayoutParams;

    .line 252
    const/4 v0, 0x4

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 253
    const/16 v0, 0xf

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 254
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 256
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->I:Landroid/widget/TextView;

    .line 257
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_detail_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 258
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget-object v2, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->R:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 260
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->R:Landroid/graphics/Bitmap;

    .line 261
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d()V

    .line 262
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o()V

    .line 263
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->e()V

    .line 264
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->j:Landroid/view/View;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 271
    sget v0, Lcom/huawei/ui/main/R$id;->sport_data_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->m:Lo/che;

    .line 272
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 273
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    .line 274
    const-string v7, "/"

    .line 275
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    if-eqz v0, :cond_0

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 278
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 280
    :goto_0
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_avragepace:I

    .line 281
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v7}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    .line 282
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    .line 283
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->d:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    .line 284
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    .line 285
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_calorie:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_calories:I

    .line 286
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    .line 287
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->track_ic_health_img_detail_record_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_steps:I

    .line 288
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    .line 289
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_fitness_times:I

    .line 290
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    .line 291
    new-instance v0, Lo/chj$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->h()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 292
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/chj$b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c(Lo/chj$b;)Lo/chj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    .line 293
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->C:Landroid/view/View;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 305
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->h:Z

    if-eqz v0, :cond_0

    .line 306
    sget v0, Lcom/huawei/ui/main/R$id;->track_detail_show_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->m:Lo/che;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/che;->setVisibility(I)V

    goto :goto_1

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 310
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->g()V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->m:Lo/che;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/che;->e(I)V

    .line 312
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/chj;

    .line 314
    invoke-virtual {v3}, Lo/chj;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 315
    if-eqz v4, :cond_1

    .line 316
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->m:Lo/che;

    invoke-virtual {v0, v3}, Lo/che;->addView(Landroid/view/View;)V

    .line 319
    and-int/lit8 v0, v2, 0x1

    if-nez v0, :cond_2

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->m:Lo/che;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->f()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/che;->addView(Landroid/view/View;)V

    .line 312
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 324
    :cond_3
    :goto_1
    return-void
.end method

.method private f()Landroid/view/View;
    .locals 8

    .line 440
    new-instance v4, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 441
    new-instance v5, Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 442
    sget v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->e:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 443
    const v0, 0x3e99999a    # 0.3f

    invoke-virtual {v5, v0}, Landroid/view/View;->setAlpha(F)V

    .line 444
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$dimen;->sport_data_cut_line_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_32:I

    .line 445
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 444
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_map_target_type_text_top:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 448
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_70dp:I

    .line 449
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, -0x2

    invoke-direct {v7, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 450
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 452
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v6, v1, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 453
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 454
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 456
    return-object v4
.end method

.method private g()V
    .locals 4

    .line 327
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a:Z

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    goto :goto_0

    .line 334
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k:Z

    if-eqz v0, :cond_1

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 338
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->D:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 345
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/chj;->e(ZLandroid/content/Context;Z)V

    .line 351
    return-void
.end method

.method private h()I
    .locals 1

    .line 383
    iget v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->x:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 385
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_ride:I

    return v0

    .line 387
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_walk:I

    return v0

    .line 390
    :goto_0
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_run:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i()V

    return-void
.end method

.method private i()V
    .locals 7

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->B:Landroid/view/View;

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 356
    if-nez v4, :cond_0

    .line 357
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "screenCut is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {p0, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 359
    return-void

    .line 363
    :cond_0
    :try_start_0
    invoke-static {v4}, Lo/ffl;->b(Landroid/graphics/Bitmap;)Lo/dav;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    .line 364
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 365
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0, p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 367
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 369
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 370
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 371
    sget-object v0, Lo/dae;->hY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 372
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    const-string v0, "tabType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v6, v5, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    goto :goto_1

    .line 376
    :catch_0
    move-exception v5

    .line 377
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {p0, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 378
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareTrackData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    :goto_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->H:Landroid/view/View;

    return-object v0
.end method

.method private k()V
    .locals 11

    .line 395
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 396
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 397
    const/4 v6, 0x0

    .line 398
    sget v0, Lcom/huawei/ui/main/R$id;->track_share_detail_title_usrname:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 399
    if-eqz v5, :cond_0

    .line 400
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v6

    .line 402
    :cond_0
    if-eqz v6, :cond_1

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 403
    :cond_1
    new-instance v8, Lcom/huawei/up/api/UpApi;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 404
    invoke-virtual {v8}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v9

    .line 405
    move-object v6, v9

    .line 406
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 407
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 409
    :cond_2
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 411
    :goto_0
    goto :goto_1

    .line 412
    :cond_3
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->track_share_short_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 416
    const/4 v9, 0x0

    .line 417
    if-eqz v5, :cond_4

    .line 418
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v9

    .line 420
    :cond_4
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 421
    invoke-static {p0, v9}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 422
    if-eqz v10, :cond_5

    .line 423
    invoke-virtual {v8, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    .line 425
    :cond_5
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()bmp != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    :goto_2
    goto :goto_3

    .line 428
    :cond_6
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetUserInfoSuccess()! headImgPath is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :goto_3
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 432
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 433
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 435
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$id;->track_short_qrcode:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 437
    :cond_8
    return-void
.end method

.method private l()V
    .locals 8

    .line 478
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n()V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->K:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v4, v0, v2

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v2

    .line 481
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b(DD)V

    .line 482
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a(DD)V

    .line 483
    return-void
.end method

.method private n()V
    .locals 11

    .line 526
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k:Z

    if-eqz v0, :cond_0

    .line 527
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    goto :goto_0

    .line 529
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->J:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    sub-double v5, v0, v2

    .line 531
    :goto_0
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gtz v0, :cond_1

    .line 532
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->h:Z

    .line 534
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    double-to-int v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->M:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v7, v0, v2

    .line 539
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->g:Z

    if-eqz v0, :cond_2

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v7, v0

    if-ltz v0, :cond_2

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v7, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 543
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v7, v8, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 546
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 547
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->g:Z

    if-eqz v0, :cond_3

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    cmpl-double v0, v9, v0

    if-ltz v0, :cond_3

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    const-wide v1, 0x40c3880000000000L    # 10000.0

    div-double v1, v9, v1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_ten_thousand_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    goto :goto_2

    .line 551
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v9, v10, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 554
    :goto_2
    return-void
.end method

.method private o()V
    .locals 4

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->i:Lcom/huawei/hihealth/HiHealthData;

    if-nez v0, :cond_0

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->I:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->o:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->s:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->q:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 466
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->u:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->t:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/chj;->e(Ljava/lang/String;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->n:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->r:Lo/chj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/chj;->a(Ljava/lang/String;)V

    .line 471
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->h:Z

    goto :goto_0

    .line 473
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->l()V

    .line 475
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 5

    .line 579
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 582
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 583
    return-void

    .line 585
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 586
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 587
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 589
    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 590
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 591
    :goto_0
    if-nez v4, :cond_3

    .line 592
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 593
    return-void

    .line 596
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 597
    goto :goto_1

    .line 598
    :cond_4
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 602
    :cond_5
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 100
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 101
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_sport_data_share:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->setContentView(I)V

    .line 102
    sget-object v0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->R:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 103
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mChartImg is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return-void

    .line 106
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->Q:Landroid/content/Context;

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->a()V

    .line 108
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c()V

    .line 109
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c:Z

    if-nez v0, :cond_1

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->O:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$4;-><init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 118
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 558
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->O:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->O:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 562
    :cond_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 566
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 567
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 569
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 570
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Write Permission success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 573
    :cond_0
    const-string v0, "Track_SportDataShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    :cond_1
    :goto_0
    return-void
.end method
