.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$a;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;
    }
.end annotation


# instance fields
.field private A:D

.field private B:D

.field private C:D

.field private D:J

.field private E:J

.field private F:Z

.field private G:Z

.field private H:J

.field private I:Z

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:Z

.field private P:Lo/fes;

.field private Q:Ljava/util/Date;

.field private R:Lo/fes;

.field private S:Lo/fes;

.field private V:Landroid/os/Handler;

.field private W:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;

.field private X:Lo/ego;

.field private a:Landroid/content/Context;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Lo/egb;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private j:J

.field private k:Lo/egb;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Landroid/widget/ImageView;

.field private p:Lo/egb;

.field private q:Lo/egd;

.field private r:Lo/emr;

.field private s:Lo/egb;

.field private t:Lo/egb;

.field private u:Lo/fdj;

.field private v:D

.field private w:D

.field private x:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

.field private y:D

.field private z:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 98
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->w:D

    .line 99
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->y:D

    .line 100
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v:D

    .line 105
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    .line 106
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    .line 107
    const-wide v0, 0x4052c00000000000L    # 75.0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->F:Z

    .line 112
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    .line 113
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G:Z

    .line 128
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->V:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fdj;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->h()V

    return-void
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/os/Handler;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->V:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n()V

    return-void
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->z:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->x:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    return-wide v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)J
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    return-wide v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->K:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->Q:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n:Lo/egb;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 298
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isShowInput"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    .line 299
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 303
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d()V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_input:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 312
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d()V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_edit_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_history_record:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(D)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    return-wide v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)D
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->J:I

    return p1
.end method

.method private b()V
    .locals 3

    .line 350
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_input_bloodpres_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 351
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_input_bloodpres_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 354
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 356
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 357
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 359
    :goto_0
    return-void
.end method

.method private b(D)V
    .locals 4

    .line 483
    double-to-int v0, p1

    if-eqz v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 486
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    sub-double v0, p1, v0

    double-to-int v3, v0

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    invoke-virtual {v0, v3}, Lo/fes;->setSelectedPosition(I)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_cancel_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->p:Lo/egb;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 490
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->F:Z

    .line 491
    goto :goto_0

    .line 492
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_add_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 495
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->F:Z

    .line 497
    :goto_0
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v:D

    .line 498
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Z)Z
    .locals 0

    .line 56
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->O:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    return-wide v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)D
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    return-wide p1
.end method

.method private c(I)I
    .locals 4

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 169
    int-to-float v0, p1

    mul-float/2addr v0, v3

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->M:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;J)J
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    return-wide p1
.end method

.method private c()V
    .locals 16

    .line 366
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    if-eqz v0, :cond_2

    .line 367
    const/4 v13, 0x0

    .line 368
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 371
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "BI_Tag"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v13, v0

    .line 374
    goto :goto_0

    .line 372
    :catch_0
    move-exception v14

    .line 373
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDataFromIntent() Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :cond_0
    :goto_0
    sget-object v0, Lo/dae;->cW:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v14

    .line 378
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 379
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    const/4 v0, 0x1

    if-ne v13, v0, :cond_1

    .line 381
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 383
    :cond_1
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v15, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    :goto_1
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v14, v15, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D:J

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D:J

    move-object/from16 v6, p0

    iget-object v6, v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->z:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;

    invoke-virtual/range {v0 .. v6}, Lo/fdj;->a(Landroid/content/Context;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 387
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D:J

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    move-object/from16 v4, p0

    iget-wide v4, v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    move-object/from16 v6, p0

    iget-wide v6, v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    move-object/from16 v8, p0

    iget-wide v8, v8, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    move-object/from16 v10, p0

    iget-wide v10, v10, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    move-object/from16 v12, p0

    iget-object v12, v12, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->x:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

    invoke-virtual/range {v0 .. v12}, Lo/fdj;->d(Landroid/content/Context;JJDDDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 390
    :cond_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)D
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    return-wide v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->L:I

    return p1
.end method

.method private d()V
    .locals 3

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_rtl_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 292
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;D)D
    .locals 0

    .line 56
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;I)I
    .locals 0

    .line 56
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->N:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g:Lo/egb;

    return-object v0
.end method

.method private e()V
    .locals 8

    .line 173
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_inputbloodpress_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_top_datelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c:Landroid/widget/LinearLayout;

    .line 175
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_top_timelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d:Landroid/widget/LinearLayout;

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->k:Lo/egb;

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->k:Lo/egb;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 179
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->i:Lo/egb;

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->i:Lo/egb;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_pulse_heart_bmp:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_top_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f:Lo/egb;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_top_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->h:Lo/egb;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodpresure_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q:Lo/egd;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_mid_highblood:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g:Lo/egb;

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_bloodpressure_high_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m:Lo/egb;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_bloodpressure_low_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l:Lo/egb;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_mid_lowblood:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n:Lo/egb;

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_bmp_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->p:Lo/egb;

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputbloodpresure_bmptitle_add:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o:Landroid/widget/ImageView;

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_inputbloodpressure_bpm_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->t:Lo/egb;

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodpresure_bind_device:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->s:Lo/egb;

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_bmp_desc_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e:Landroid/widget/LinearLayout;

    .line 196
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputblodpressure_bmp_scale_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b:Landroid/widget/LinearLayout;

    .line 200
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b()V

    .line 202
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 204
    const/16 v5, 0x28

    :goto_0
    const/16 v0, 0x12c

    if-gt v5, v0, :cond_0

    .line 205
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    add-int/lit8 v5, v5, 0xa

    goto :goto_0

    .line 207
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputbloodpresure_highblood_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v4, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 219
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 221
    const/16 v6, 0x1e

    :goto_1
    const/16 v0, 0xc8

    if-gt v6, v0, :cond_1

    .line 222
    int-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    add-int/lit8 v6, v6, 0xa

    goto :goto_1

    .line 224
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputbloodpresure_lowblood_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v5, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 236
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 237
    const/16 v7, 0x1e

    :goto_2
    const/16 v0, 0x96

    if-ge v7, v0, :cond_2

    .line 238
    int-to-double v0, v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    add-int/lit8 v7, v7, 0xa

    goto :goto_2

    .line 240
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_imputbloodpresure_bmp_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v6, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 252
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a()V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->s:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/emr;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->r:Lo/emr;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 456
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->w:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    .line 457
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->y:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    .line 458
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    .line 459
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    .line 460
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->j:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    .line 461
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(D)V

    .line 462
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->i()V

    .line 463
    return-void
.end method

.method private g()V
    .locals 9

    .line 397
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 398
    if-eqz v7, :cond_1

    .line 400
    const-string v0, "high"

    const-wide/high16 v1, 0x4060000000000000L    # 128.0

    :try_start_0
    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    .line 401
    const-string v0, "low"

    const-wide/high16 v1, 0x4056000000000000L    # 88.0

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    .line 402
    const-string v0, "deletetime"

    const-wide/16 v1, -0x1

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    .line 403
    const-string v0, "bmp"

    const-wide/16 v1, 0x0

    invoke-virtual {v7, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    goto :goto_0

    .line 404
    :catch_0
    move-exception v8

    .line 405
    const-string v0, "UIHLH_InputBloodpressureActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDataFromIntent() Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    :goto_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->w:D

    .line 408
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->y:D

    .line 409
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->D:J

    .line 410
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 411
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->E:J

    new-instance v6, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;

    invoke-direct {v6, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    invoke-virtual/range {v0 .. v6}, Lo/fdj;->d(Landroid/content/Context;JJLo/egg;)V

    goto :goto_1

    .line 414
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(D)V

    .line 415
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    .line 417
    :goto_1
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->A:D

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->v:D

    .line 418
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->j:J

    .line 422
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G:Z

    return v0
.end method

.method private h()V
    .locals 3

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->X:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->isFinishing()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fej;->a(Landroid/content/Context;Lo/ego;Ljava/lang/Boolean;)V

    .line 545
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    return v0
.end method

.method private i()V
    .locals 10

    .line 427
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    sub-double/2addr v0, v2

    double-to-int v5, v0

    .line 428
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    sub-double/2addr v0, v2

    double-to-int v6, v0

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    invoke-virtual {v0, v5}, Lo/fes;->setSelectedPosition(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    invoke-virtual {v0, v6}, Lo/fes;->setSelectedPosition(I)V

    .line 432
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 433
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 434
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->N:I

    .line 435
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->M:I

    .line 436
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->L:I

    .line 437
    const/16 v0, 0xb

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->J:I

    .line 438
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->K:I

    .line 441
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->Q:Ljava/util/Date;

    .line 442
    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v9

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->Q:Ljava/util/Date;

    invoke-virtual {v8, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->h:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->Q:Ljava/util/Date;

    invoke-virtual {v9, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g:Lo/egb;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->n:Lo/egb;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 450
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->O:Z

    return v0
.end method

.method private k()Ljava/lang/Boolean;
    .locals 6

    .line 470
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 471
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_timeerror:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 473
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 475
    :cond_0
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C:D

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->B:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bloodpresserror:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 477
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 479
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->p:Lo/egb;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->R:Lo/fes;

    return-object v0
.end method

.method private l()V
    .locals 9

    .line 554
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 555
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->H:J

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 557
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 558
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fgi;

    .line 560
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 561
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_string_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 562
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;

    invoke-direct {v2, p0, v6, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;Lo/fgi;Ljava/util/Calendar;)V

    .line 563
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$6;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    .line 579
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 585
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 586
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->N:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedYear(I)V

    .line 587
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->M:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedMonth(I)V

    .line 588
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->L:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedDay(I)V

    .line 589
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 590
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->S:Lo/fes;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/fes;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->P:Lo/fes;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->X:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->isFinishing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fej;->d(Lo/ego;Ljava/lang/Boolean;)V

    .line 549
    return-void
.end method

.method private o()V
    .locals 8

    .line 593
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 594
    new-instance v0, Lo/fey$c;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fey$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_measure_time:I

    .line 595
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fey$c;->a(Ljava/lang/String;)Lo/fey$c;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$10;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    .line 596
    invoke-virtual {v0, v1}, Lo/fey$c;->c(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    .line 618
    invoke-virtual {v0, v1}, Lo/fey$c;->d(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    .line 625
    const/16 v1, 0xa

    invoke-virtual {v5, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v5, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    .line 626
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v3

    const/16 v4, 0x9

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 625
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fey$c;->d(IIZI)Lo/fey$c;

    move-result-object v6

    .line 627
    invoke-virtual {v6}, Lo/fey$c;->b()Lo/fey;

    move-result-object v7

    .line 628
    invoke-virtual {v7}, Lo/fey;->show()V

    .line 629
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Ljava/lang/Boolean;
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->k()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->J:I

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->N:I

    return v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->M:I

    return v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->L:I

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c()V

    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/content/Context;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->h:Lo/egb;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Lo/egb;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->f:Lo/egb;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->K:I

    return v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Ljava/util/Date;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->Q:Ljava/util/Date;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 503
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    if-eqz v0, :cond_0

    .line 504
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l()V

    goto/16 :goto_0

    .line 506
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G:Z

    if-eqz v0, :cond_7

    .line 507
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l()V

    goto/16 :goto_0

    .line 510
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->d:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    .line 511
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->I:Z

    if-eqz v0, :cond_2

    .line 512
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o()V

    goto/16 :goto_0

    .line 514
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->G:Z

    if-eqz v0, :cond_7

    .line 515
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o()V

    goto/16 :goto_0

    .line 518
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->o:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_5

    .line 519
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->F:Z

    if-eqz v0, :cond_4

    .line 520
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(D)V

    goto/16 :goto_0

    .line 522
    :cond_4
    const-wide v0, 0x4052c00000000000L    # 75.0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->b(D)V

    goto/16 :goto_0

    .line 524
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->q:Lo/egd;

    if-ne p1, v0, :cond_6

    .line 525
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->k()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->W:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;

    invoke-static {v0, v1}, Lo/fjb;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 529
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->s:Lo/egb;

    if-ne p1, v0, :cond_7

    .line 530
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 531
    const-string v0, "com.huaei.health"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 532
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 533
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_PRESSURE"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 534
    sget-object v0, Lo/dae;->cT:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 535
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 536
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 537
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 538
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 539
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->startActivity(Landroid/content/Intent;)V

    .line 541
    :cond_7
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 133
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 134
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_inputbloodpressure:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->setContentView(I)V

    .line 135
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->a:Landroid/content/Context;

    .line 136
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->x:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$c;

    .line 137
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->W:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$e;

    .line 138
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$1;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->z:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$b;

    .line 139
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->u:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 141
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->e()V

    .line 142
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->g()V

    .line 144
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->i()V

    .line 145
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 149
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 150
    invoke-static {}, Lo/fiu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 152
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v1, v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m:Lo/egb;

    invoke-virtual {v0, v4}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 155
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v1, v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l:Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->t:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    .line 158
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->c(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v1, v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->t:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 160
    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->m:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->l:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->t:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 165
    :goto_0
    return-void
.end method
