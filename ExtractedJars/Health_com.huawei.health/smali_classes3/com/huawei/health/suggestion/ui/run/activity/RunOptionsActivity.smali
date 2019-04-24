.class public Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Lo/emu;

.field private C:Landroid/widget/ImageView;

.field private D:Lo/emu;

.field private E:Lo/efy;

.field private F:Lo/efy;

.field private G:Lo/efy;

.field private H:Lo/efy;

.field private I:Lo/efy;

.field private J:Lo/efy;

.field private K:Lo/emr;

.field private L:Lo/efy;

.field private M:Lo/efy;

.field private N:Lo/efy;

.field private O:I

.field private P:Landroid/widget/Button;

.field private Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
        }
    .end annotation
.end field

.field private R:Landroid/content/Intent;

.field private S:I

.field private T:Z

.field private U:I

.field private V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

.field private W:Lcom/huawei/health/suggestion/model/PlanStat;

.field private X:Lcom/huawei/health/suggestion/model/RunPlanParams;

.field private Y:Ljava/util/Calendar;

.field private a:Landroid/widget/RelativeLayout;

.field private aa:Z

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Lo/bxh;

.field private r:Lo/byi;

.field private s:Lo/byi;

.field private t:Lo/byi;

.field private u:Lo/byi;

.field private v:Lo/bxh;

.field private w:Lo/egw;

.field private x:Lo/byo;

.field private y:Lo/bxe;

.field private z:Lo/bxe;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 99
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    .line 100
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->T:Z

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->aa:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)I
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(I)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/ExerciseLimits;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;Lcom/huawei/health/suggestion/model/PlanStat;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    return-object p1
.end method

.method private a(I)V
    .locals 4

    .line 414
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(I)I

    move-result v3

    .line 415
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 416
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->E:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->H:Lo/efy;

    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 419
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v2

    invoke-virtual {v0, v3, v1, v2}, Lo/bxe;->b(III)V

    .line 420
    return-void
.end method

.method private b(I)I
    .locals 5

    .line 195
    const/4 v4, 0x0

    .line 196
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 197
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 199
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll5KM()I

    move-result v4

    .line 200
    goto :goto_0

    .line 203
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAll10KM()I

    move-result v4

    .line 204
    goto :goto_0

    .line 207
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllHalfMarathon()I

    move-result v4

    .line 208
    goto :goto_0

    .line 211
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->W:Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanStat;->getBestRecordForAllMarathon()I

    move-result v4

    .line 212
    .line 219
    :goto_0
    if-nez v4, :cond_1

    .line 220
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user has not bestRecord"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-static {v0, p1}, Lo/buc;->b(Lcom/huawei/health/suggestion/model/RunPlanParams;I)I

    move-result v4

    goto :goto_1

    .line 224
    :cond_0
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBestRecord() mRunParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :cond_1
    :goto_1
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/efy;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->H:Lo/efy;

    return-object v0
.end method

.method private b(Landroid/view/View;)V
    .locals 1

    .line 611
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->B:Lo/emu;

    if-ne p1, v0, :cond_0

    .line 612
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w()V

    goto :goto_0

    .line 613
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->D:Lo/emu;

    if-ne p1, v0, :cond_1

    .line 614
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y()V

    .line 616
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    return v0
.end method

.method private c(I)Ljava/lang/String;
    .locals 4

    .line 185
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "Hms"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/Date;

    int-to-long v2, p1

    invoke-static {v2, v3}, Lo/bxz;->a(J)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)I
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lcom/huawei/health/suggestion/model/RunPlanParams;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 151
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    invoke-interface {v0, v1}, Lo/bsp;->a(Lo/bui;)V

    .line 173
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 2

    .line 587
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    if-ne p1, v0, :cond_0

    .line 588
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 589
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 590
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 591
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    goto :goto_0

    .line 592
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    if-ne p1, v0, :cond_1

    .line 593
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 594
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 595
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 596
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    goto :goto_0

    .line 597
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    if-ne p1, v0, :cond_2

    .line 598
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 599
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 600
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 601
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    goto :goto_0

    .line 602
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    if-ne p1, v0, :cond_3

    .line 603
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 604
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 605
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 606
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    .line 608
    :cond_3
    :goto_0
    return-void
.end method

.method private e(I)I
    .locals 2

    .line 177
    invoke-static {p1}, Lo/buc;->b(I)Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    .line 178
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b(I)I

    move-result v1

    .line 179
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 180
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 181
    return v1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)Ljava/lang/String;
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/efy;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->I:Lo/efy;

    return-object v0
.end method

.method private e(Landroid/view/View;)V
    .locals 4

    .line 562
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 563
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z()V

    goto/16 :goto_0

    .line 564
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 565
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v()V

    goto :goto_0

    .line 566
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 567
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x()V

    goto :goto_0

    .line 568
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_3

    .line 569
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    if-eqz v0, :cond_7

    .line 570
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u()V

    goto :goto_0

    .line 572
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 573
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q()V

    goto :goto_0

    .line 574
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_5

    .line 575
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s()V

    goto :goto_0

    .line 576
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 577
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r()V

    goto :goto_0

    .line 578
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_7

    .line 579
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    if-eqz v0, :cond_7

    .line 580
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showExpectedDistanceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t()V

    .line 584
    :cond_7
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/bxe;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 381
    new-instance v0, Lo/bxh;

    invoke-direct {v0}, Lo/bxh;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    .line 382
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 383
    const-string v0, "goal"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 384
    new-instance v0, Lo/bxh;

    invoke-direct {v0}, Lo/bxh;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    .line 385
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    invoke-virtual {v0, v2}, Lo/bxh;->setArguments(Landroid/os/Bundle;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    invoke-virtual {v0, v1}, Lo/bxh;->e(Lo/bxh$c;)V

    .line 392
    return-void
.end method

.method private g()V
    .locals 7

    .line 248
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 250
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 252
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/byi;->setChecked(Z)V

    .line 256
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    .line 258
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->E:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->G:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->J:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x2

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->M:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x3

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->L:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4010000000000000L    # 4.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x4

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->N:Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->IDS_plugin_fitnessadvice_times:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x5

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 268
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w()V

    .line 269
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y()V

    .line 270
    return-void
.end method

.method private g(I)V
    .locals 2

    .line 465
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->I:Lo/efy;

    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 466
    iput p1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    .line 467
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    if-eqz v0, :cond_0

    .line 468
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    .line 469
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    .line 472
    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n()V

    return-void
.end method

.method private h()V
    .locals 2

    .line 273
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_btn_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->P:Landroid/widget/Button;

    .line 274
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->P:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 276
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e:Landroid/widget/RelativeLayout;

    .line 277
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b:Landroid/widget/RelativeLayout;

    .line 278
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a:Landroid/widget/RelativeLayout;

    .line 279
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    .line 283
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    sget v0, Lcom/huawei/health/suggestion/R$id;->run_options_sug_titleBar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->K:Lo/emr;

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->K:Lo/emr;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-static {v1}, Lo/bya;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 287
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_uncertain:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d:Landroid/widget/RelativeLayout;

    .line 288
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    .line 289
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 290
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    .line 291
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 292
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->B:Lo/emu;

    .line 293
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->B:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_image2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->A:Landroid/widget/ImageView;

    .line 297
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_uncertain:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f:Landroid/widget/RelativeLayout;

    .line 298
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_day:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    .line 299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 300
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    .line 301
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    .line 303
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 304
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->D:Lo/emu;

    .line 305
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->D:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_image2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->j:Landroid/widget/ImageView;

    .line 309
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_two_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    .line 310
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_three_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m:Landroid/widget/RelativeLayout;

    .line 311
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_four_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p:Landroid/widget/RelativeLayout;

    .line 312
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_five_times:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    .line 313
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 318
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_cb2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byi;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    .line 319
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_cb3:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byi;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    .line 320
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_cb4:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byi;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    .line 321
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_cb5:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/byi;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->t:Lo/byi;

    invoke-virtual {v0, p0}, Lo/byi;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->u:Lo/byi;

    invoke-virtual {v0, p0}, Lo/byi;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->s:Lo/byi;

    invoke-virtual {v0, p0}, Lo/byi;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->r:Lo/byi;

    invoke-virtual {v0, p0}, Lo/byi;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 327
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_image2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->C:Landroid/widget/ImageView;

    .line 330
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_distance_tv2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->E:Lo/efy;

    .line 331
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_first_set:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->H:Lo/efy;

    .line 332
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_distance_tv2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->G:Lo/efy;

    .line 333
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_set:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->I:Lo/efy;

    .line 334
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_two_times_tv1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->J:Lo/efy;

    .line 335
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_three_times_tv1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->M:Lo/efy;

    .line 336
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_four_times_tv1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->L:Lo/efy;

    .line 337
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_third_five_times_tv1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->N:Lo/efy;

    .line 338
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_run_options_second_day_tv2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->F:Lo/efy;

    .line 339
    return-void
.end method

.method private h(I)V
    .locals 4

    .line 427
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(I)I

    move-result v3

    .line 428
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-ltz p1, :cond_0

    .line 429
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->G:Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->I:Lo/efy;

    invoke-direct {p0, v3}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 432
    iput v3, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    .line 433
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->V:Lcom/huawei/health/suggestion/model/ExerciseLimits;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v2

    invoke-virtual {v0, v3, v1, v2}, Lo/bxe;->b(III)V

    .line 434
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o()V

    return-void
.end method

.method private i()V
    .locals 7

    .line 233
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    .line 234
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x5

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xa

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_half_marathon:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_marathon:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 240
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x5

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xa

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x402a333333333333L    # 13.1

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xd

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Q:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x403a333333333333L    # 26.2

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x1a

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)Lo/bxe;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    return-object v0
.end method

.method private k()V
    .locals 6

    .line 342
    new-instance v0, Lo/byo;

    invoke-direct {v0, p0}, Lo/byo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    .line 344
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 345
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 346
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-static {v0}, Lo/buc;->c(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    invoke-virtual {v0, v4}, Lo/byo;->setStartDate(Ljava/util/Calendar;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->F:Lo/efy;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 350
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 351
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 352
    invoke-static {}, Lo/buc;->a()I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v5, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    invoke-virtual {v0, v5}, Lo/byo;->setEndDate(Ljava/util/Calendar;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    invoke-virtual {v0}, Lo/byo;->getDate()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    .line 356
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setEventDate(Ljava/util/Calendar;)V

    goto :goto_0

    .line 359
    :cond_0
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCompeteDateDialog() mRunParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    :goto_0
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_event_date:I

    .line 363
    invoke-virtual {v0, v1}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    .line 364
    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    .line 365
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    .line 371
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 377
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w:Lo/egw;

    .line 378
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g(I)V

    return-void
.end method

.method private l()V
    .locals 3

    .line 451
    new-instance v0, Lo/bxe;

    invoke-direct {v0}, Lo/bxe;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    .line 452
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 453
    const-string v0, "title"

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_expected_achievement:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 454
    new-instance v0, Lo/bxe;

    invoke-direct {v0}, Lo/bxe;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    invoke-virtual {v0, v2}, Lo/bxe;->setArguments(Landroid/os/Bundle;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    invoke-virtual {v0, v1}, Lo/bxe;->d(Lo/bxe$b;)V

    .line 462
    return-void
.end method

.method private m()V
    .locals 3

    .line 395
    new-instance v0, Lo/bxh;

    invoke-direct {v0}, Lo/bxh;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    .line 396
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 397
    const-string v0, "goal"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 398
    new-instance v0, Lo/bxh;

    invoke-direct {v0}, Lo/bxh;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    .line 399
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    invoke-virtual {v0, v2}, Lo/bxh;->setArguments(Landroid/os/Bundle;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    invoke-virtual {v0, v1}, Lo/bxh;->e(Lo/bxh$c;)V

    .line 407
    return-void
.end method

.method private n()V
    .locals 1

    .line 492
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 493
    return-void
.end method

.method private o()V
    .locals 4

    .line 478
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    invoke-virtual {v0}, Lo/byo;->getDate()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    .line 479
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 480
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setEventDate(Ljava/util/Calendar;)V

    goto :goto_0

    .line 482
    :cond_0
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "conformSetDateDialog() mRunParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->F:Lo/efy;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 486
    return-void
.end method

.method private p()V
    .locals 3

    .line 438
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 439
    const-string v0, "title"

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_my_best_record:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 440
    new-instance v0, Lo/bxe;

    invoke-direct {v0}, Lo/bxe;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    .line 441
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    invoke-virtual {v0, v2}, Lo/bxe;->setArguments(Landroid/os/Bundle;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    new-instance v1, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;)V

    invoke-virtual {v0, v1}, Lo/bxe;->d(Lo/bxe$b;)V

    .line 448
    return-void
.end method

.method private q()V
    .locals 3

    .line 508
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 509
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    invoke-virtual {v0}, Lo/bxe;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 510
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->z:Lo/bxe;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "best_time"

    invoke-virtual {v0, v1, v2}, Lo/bxe;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 512
    :cond_0
    return-void
.end method

.method private r()V
    .locals 2

    .line 530
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->x:Lo/byo;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->Y:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lo/byo;->setDate(Ljava/util/Calendar;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 532
    return-void
.end method

.method private s()V
    .locals 3

    .line 516
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 517
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    invoke-virtual {v0}, Lo/bxe;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->y:Lo/bxe;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "expected_time"

    invoke-virtual {v0, v1, v2}, Lo/bxe;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 520
    :cond_0
    return-void
.end method

.method private t()V
    .locals 3

    .line 523
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 524
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    invoke-virtual {v0}, Lo/bxh;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 525
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->v:Lo/bxh;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "run_type"

    invoke-virtual {v0, v1, v2}, Lo/bxh;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 527
    :cond_0
    return-void
.end method

.method private u()V
    .locals 4

    .line 499
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    .line 500
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    invoke-virtual {v0}, Lo/bxh;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 501
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showRunTypeDialog 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->q:Lo/bxh;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const-string v2, "run_type"

    invoke-virtual {v0, v1, v2}, Lo/bxh;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 504
    :cond_0
    return-void
.end method

.method private v()V
    .locals 2

    .line 678
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 679
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 680
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 681
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 682
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 683
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_up:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 685
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 686
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 687
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 688
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 689
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 691
    :goto_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 638
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->T:Z

    if-eqz v0, :cond_0

    .line 639
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 640
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 641
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 642
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 643
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 645
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 646
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 647
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 648
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 649
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 651
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->T:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->T:Z

    .line 652
    return-void
.end method

.method private x()V
    .locals 2

    .line 655
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 656
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 657
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 658
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 660
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 661
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 663
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 664
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 666
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->C:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_up:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 668
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 669
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 670
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 671
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 673
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->C:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 675
    :goto_1
    return-void
.end method

.method private y()V
    .locals 2

    .line 619
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->aa:Z

    if-eqz v0, :cond_0

    .line 620
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 621
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 622
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 623
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 624
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 625
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 628
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 629
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 630
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 631
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 632
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->n:Landroid/widget/RelativeLayout;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 634
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->aa:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->aa:Z

    .line 635
    return-void
.end method

.method private z()V
    .locals 2

    .line 694
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 695
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 696
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 697
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 698
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 699
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->A:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_up:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 701
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 702
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 703
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 704
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 705
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->A:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 707
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 133
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity is going to finished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_activity_options:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->setContentView(I)V

    .line 138
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->h()V

    .line 139
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d()V

    .line 140
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->f()V

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->m()V

    .line 142
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->p()V

    .line 143
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->l()V

    .line 144
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->k()V

    .line 145
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->g()V

    .line 147
    const-string v0, "FINSH_ALL_KEY_ShowPlanActivity"

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lo/bxd;->e(Ljava/lang/String;Ljava/lang/ref/WeakReference;)V

    .line 148
    return-void
.end method

.method public b()V
    .locals 4

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->R:Landroid/content/Intent;

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->R:Landroid/content/Intent;

    if-nez v0, :cond_0

    .line 116
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mReceiveData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->R:Landroid/content/Intent;

    const-string v1, "runType"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    .line 121
    :goto_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    if-ltz v0, :cond_1

    iget v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    .line 122
    :cond_1
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->finish()V

    .line 124
    return-void

    .line 127
    :cond_2
    invoke-static {}, Lo/buc;->e()Lcom/huawei/health/suggestion/model/RunPlanParams;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    .line 128
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->i()V

    .line 129
    return-void
.end method

.method public e()V
    .locals 0

    .line 536
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 540
    instance-of v0, p1, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 541
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->e(Landroid/view/View;)V

    goto/16 :goto_0

    .line 542
    :cond_0
    instance-of v0, p1, Lo/emu;

    if-eqz v0, :cond_1

    .line 543
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->b(Landroid/view/View;)V

    goto :goto_0

    .line 544
    :cond_1
    instance-of v0, p1, Lo/byi;

    if-eqz v0, :cond_2

    .line 545
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->d(Landroid/view/View;)V

    goto :goto_0

    .line 546
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->P:Landroid/widget/Button;

    if-ne p1, v0, :cond_4

    .line 547
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/run/activity/RunRestSelectedActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 548
    const-string v0, "runType"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->O:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 549
    const-string v0, "runTimes"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->S:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 550
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 551
    const-string v0, "runParameter"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 552
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->X:Lcom/huawei/health/suggestion/model/RunPlanParams;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->U:I

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/RunPlanParams;->setUserChosenTime(I)V

    .line 553
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/run/activity/RunOptionsActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 555
    :cond_3
    const-string v0, "Suggestion_RunOptionsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() mRunParams is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    :cond_4
    :goto_0
    return-void
.end method
