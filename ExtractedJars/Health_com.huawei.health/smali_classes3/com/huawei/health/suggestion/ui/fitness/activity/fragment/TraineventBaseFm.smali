.class public Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;
.implements Landroid/view/View$OnClickListener;
.implements Lo/bwo$d;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ValidFragment"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lcom/huawei/health/suggestion/model/Plan;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Date;

.field private h:Ljava/lang/String;

.field private i:Lo/buv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/buv<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private k:Lo/bsp;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private m:I

.field private n:Landroid/widget/ImageView;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private p:Landroid/widget/ImageView;

.field private q:Lo/efy;

.field private r:Landroid/support/v7/widget/RecyclerView;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/view/animation/TranslateAnimation;

.field private v:Z

.field private x:Lcom/huawei/health/suggestion/model/Userinfo;

.field private z:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 76
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->v:Z

    .line 122
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->x:Lcom/huawei/health/suggestion/model/Userinfo;

    return-void
.end method

.method private a()V
    .locals 2

    .line 372
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setRotation(F)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setRotation(F)V

    .line 376
    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 5

    .line 467
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v2

    .line 468
    if-eqz v2, :cond_0

    .line 469
    invoke-interface {v2}, Lo/brr;->e()Lo/brv;

    move-result-object v3

    .line 470
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireTrajectoryId()Ljava/lang/String;

    move-result-object v4

    .line 471
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object v4, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 472
    invoke-interface {v3, v4}, Lo/brv;->a(Ljava/lang/String;)V

    .line 475
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    return-void
.end method

.method private a(Ljava/util/Calendar;)V
    .locals 2

    .line 363
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 365
    const/4 v0, 0x6

    const/4 v1, -0x6

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    goto :goto_0

    .line 366
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 367
    const/4 v0, 0x6

    const/16 v1, -0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 369
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Ljava/util/Calendar;Ljava/text/DateFormat;Ljava/text/SimpleDateFormat;)V
    .locals 7

    .line 674
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b()V

    .line 675
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b:Ljava/lang/String;

    .line 676
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 677
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Ljava/util/Calendar;)V

    .line 678
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d:Ljava/lang/String;

    .line 679
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 680
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->q:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    const/4 v4, 0x1

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 681
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 682
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->q:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v6, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 684
    :cond_0
    return-void
.end method

.method private a(Lo/bvr;I)V
    .locals 2

    .line 345
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->i:Lo/buv;

    invoke-virtual {v0}, Lo/buv;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 346
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_bottom_:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    goto :goto_0

    .line 348
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_bottom_:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    .line 350
    :goto_0
    return-void
.end method

.method private a(Lo/bvr;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bvr;Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 219
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->v:Z

    if-eqz v0, :cond_0

    .line 220
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "holderItem0 mIsUpDownScrolling"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    return-void

    .line 223
    :cond_0
    move-object v4, p2

    .line 224
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_b:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_sc_tevent_chart2:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/bvr;->d(II)Lo/bvr;

    .line 225
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_b_line:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v5

    .line 226
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 227
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_sc_tevent_chart:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bwo;

    .line 228
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/bwo;->a(I)V

    .line 229
    const/16 v0, 0x1e

    invoke-virtual {v6, v0}, Lo/bwo;->c(I)V

    .line 230
    invoke-virtual {v6, p0}, Lo/bwo;->c(Lo/bwo$d;)V

    .line 231
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_1

    .line 232
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_t:I

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 233
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_overcolor:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->h(I)V

    .line 234
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_dgreen:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_green:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {v6, v0}, Lo/bwo;->a([I)V

    .line 235
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg3:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->d(I)V

    goto :goto_0

    .line 237
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_overcolor_k:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->h(I)V

    .line 238
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_dorign:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_qorign:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {v6, v0}, Lo/bwo;->a([I)V

    .line 239
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg4:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->d(I)V

    .line 241
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->b(I)V

    .line 242
    sget v0, Lcom/huawei/health/suggestion/R$dimen;->sug_chart_textsize:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(I)F

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->e(F)V

    .line 243
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bwo;->k(I)V

    .line 244
    invoke-direct {p0, v4, v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Ljava/util/List;Lo/bwo;)V

    .line 245
    invoke-virtual {v6, v4}, Lo/bwo;->d(Ljava/util/List;)V

    .line 246
    return-void
.end method

.method private a(ZZLjava/util/Calendar;)V
    .locals 2

    .line 424
    invoke-virtual {p3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    invoke-static {v0, v1}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v0

    if-gtz v0, :cond_0

    .line 425
    invoke-direct {p0, p2, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(ZLjava/util/Calendar;)V

    .line 426
    invoke-direct {p0, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Ljava/util/Calendar;)V

    goto :goto_0

    .line 428
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->h(Z)V

    .line 430
    :goto_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 687
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    if-gez v0, :cond_0

    .line 688
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 692
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 508
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_0

    .line 509
    invoke-static {p1}, Lo/bxn;->a(Ljava/util/List;)V

    .line 512
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 513
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->f:Ljava/util/List;

    .line 514
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5468\u5386\u53f2\u6570\u636e\u6570\u91cf\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 515
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 516
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->o:Ljava/util/List;

    .line 517
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6708\u5386\u53f2\u6570\u636e\u6570\u91cf\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 519
    :cond_2
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->l:Ljava/util/List;

    .line 520
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6240\u6709\u5386\u53f2\u6570\u636e\u6570\u91cf\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    :goto_0
    return-void
.end method

.method private b(Lo/bvr;ILjava/lang/Object;)V
    .locals 9

    .line 290
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Lo/bvr;I)V

    .line 291
    instance-of v0, p3, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    if-eqz v0, :cond_0

    .line 292
    move-object v3, p3

    check-cast v3, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 293
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 294
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 295
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 297
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v5, v7, v0

    const/4 v0, 0x1

    aput-object v6, v7, v0

    .line 298
    invoke-direct {p0, p1, v3, v4, v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Lo/bvr;Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/text/SimpleDateFormat;[Ljava/lang/String;)V

    .line 299
    const/4 v0, 0x0

    aget-object v5, v7, v0

    .line 300
    const/4 v0, 0x1

    aget-object v6, v7, v0

    .line 301
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_date:I

    invoke-virtual {p1, v0, v6}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_name:I

    .line 302
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_execute:I

    .line 303
    invoke-virtual {v0, v1, v5}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 304
    new-instance v8, Ljava/util/Date;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 305
    invoke-direct {p0, p1, v8}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Lo/bvr;Ljava/util/Date;)V

    .line 307
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_trainevent_event:I

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;

    invoke-direct {v1, p0, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    invoke-virtual {p1, v0, v1}, Lo/bvr;->b(ILandroid/view/View$OnClickListener;)Lo/bvr;

    .line 318
    :cond_0
    return-void
.end method

.method private b(Lo/bvr;Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/text/SimpleDateFormat;[Ljava/lang/String;)V
    .locals 12

    .line 321
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_1

    .line 322
    move-object/from16 v0, p4

    invoke-static {p2, p3, v0}, Lo/bvt;->c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/text/SimpleDateFormat;[Ljava/lang/String;)V

    .line 324
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const-wide/16 v7, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Lo/bzr;->i(D)D

    move-result-wide v2

    div-double v7, v0, v2

    .line 325
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/bzr;->i(D)D

    move-result-wide v9

    .line 327
    invoke-static {v9, v10}, Lo/bzr;->a(D)Ljava/lang/String;

    move-result-object v11

    .line 329
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_kcal:I

    .line 330
    invoke-static {}, Lo/bzr;->c()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v2

    float-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v11, v3, v4

    .line 329
    invoke-static {v1, v2, v3}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_duration:I

    const-string v2, "%02d:%02d:%02d"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    .line 331
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v4

    div-int/lit16 v4, v4, 0xe10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v4

    rem-int/lit16 v4, v4, 0xe10

    div-int/lit8 v4, v4, 0x3c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v4

    rem-int/lit8 v4, v4, 0x3c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_heartbeat:I

    .line 332
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {}, Lo/bzr;->e()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 333
    invoke-static {v7, v8}, Lo/bvt;->e(D)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 332
    invoke-static {v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 335
    goto :goto_1

    .line 336
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_kcal:I

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 337
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v4}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 336
    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_duration:I

    .line 338
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 339
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v5

    invoke-static {v5}, Lo/bzr;->a(F)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 338
    invoke-static {v2, v3, v4}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_heartbeat:I

    .line 340
    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v2

    float-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 342
    :goto_1
    return-void
.end method

.method private b(Z)V
    .locals 10

    .line 379
    if-eqz p1, :cond_0

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v9, -0x40800000    # -1.0f

    .line 380
    :goto_0
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    move v4, v9

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->u:Landroid/view/animation/TranslateAnimation;

    .line 385
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->u:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, p0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->u:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 387
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->u:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 388
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->u:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 389
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;)I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    return v0
.end method

.method private c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/Calendar;I)Ljava/util/List<Lo/bwn;>;"
        }
    .end annotation

    .line 635
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 636
    new-instance v8, Ljava/text/DecimalFormat;

    const-string v0, "##.##"

    invoke-direct {v8, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 637
    invoke-static {p2}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 639
    const/4 v11, 0x0

    .line 641
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    move-object/from16 v1, p3

    invoke-static {v1, v7, v10, v0}, Lo/bvt;->e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;Lcom/huawei/health/suggestion/model/WorkoutRecord;Ljava/util/Date;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v11

    .line 645
    goto :goto_1

    .line 642
    :catch_0
    move-exception v12

    .line 643
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65e5\u671f\u683c\u5f0f\u5316\u5f02\u5e38\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    goto :goto_2

    .line 646
    :goto_1
    move-object/from16 v0, p3

    move-object v1, p1

    move/from16 v2, p4

    move-object v3, v8

    move-object v4, v10

    move v5, v11

    iget-object v6, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->x:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-static/range {v0 .. v6}, Lo/bvt;->e(Ljava/util/Calendar;Ljava/util/List;ILjava/text/DecimalFormat;Lcom/huawei/health/suggestion/model/WorkoutRecord;ILcom/huawei/health/suggestion/model/Userinfo;)V

    .line 647
    goto :goto_0

    .line 649
    :cond_0
    :goto_2
    return-object p1
.end method

.method private c(Ljava/text/DateFormat;Ljava/text/SimpleDateFormat;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 701
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 702
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    .line 703
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    .line 704
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d:Ljava/lang/String;

    .line 705
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b:Ljava/lang/String;

    .line 706
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->q:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    .line 707
    invoke-virtual {p1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    invoke-virtual {p1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 706
    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 708
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 709
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->q:Lo/efy;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_his_time_formart:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    .line 710
    invoke-virtual {p1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    invoke-virtual {p1, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 709
    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 712
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 713
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mJoinedPlan.getWeekCount()  planData error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 714
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/Plan;->saveWeekCount(I)V

    .line 717
    :cond_1
    return-void
.end method

.method private c(Ljava/util/Calendar;)V
    .locals 5

    .line 493
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u672c\u5730\u6570\u636e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->k:Lo/bsp;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 497
    invoke-static {v4}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 498
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    invoke-direct {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Ljava/util/List;)V

    goto :goto_0

    .line 501
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->l:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->o:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->f:Ljava/util/List;

    .line 502
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u7684\u5386\u53f2\u6570\u636e\u4e3anull---getWorkoutRecords"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Ljava/util/Calendar;)V

    .line 505
    return-void
.end method

.method private c(Lo/bvr;Ljava/util/Date;)V
    .locals 2

    .line 353
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {p2, v0}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v0

    if-nez v0, :cond_0

    .line 354
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_date:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    .line 355
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_execute:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    goto :goto_0

    .line 357
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_date:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    .line 358
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_item_train_workout_execute:I

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/bvr;->d(II)Lo/bvr;

    .line 360
    :goto_0
    return-void
.end method

.method private c(Lo/bvr;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bvr;Ljava/util/List<Lo/bwn;>;)V"
        }
    .end annotation

    .line 249
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->v:Z

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "holderItem1 mIsUpDownScrolling"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void

    .line 253
    :cond_0
    move-object v4, p2

    .line 254
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_b:I

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_sc_tevent_chart:I

    .line 255
    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/bvr;->d(II)Lo/bvr;

    .line 256
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_sc_tevent_chart2:I

    invoke-virtual {p1, v0}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/bwo;

    .line 257
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/bwo;->a(I)V

    .line 258
    const/16 v0, 0x1e

    invoke-virtual {v5, v0}, Lo/bwo;->c(I)V

    .line 259
    invoke-virtual {v5, p0}, Lo/bwo;->c(Lo/bwo$d;)V

    .line 260
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_1

    .line 261
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_t:I

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_history_pace:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 262
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_50dorign:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->h(I)V

    .line 263
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_dgreen2:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_green1:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {v5, v0}, Lo/bwo;->a([I)V

    .line 264
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->d(I)V

    .line 265
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->e(I)V

    goto :goto_0

    .line 267
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_cb_tevent_t:I

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_coach_rate:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 268
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_overcolor_k:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->h(I)V

    .line 269
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_dorign1:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$color;->sug_event_qorign1:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-virtual {v5, v0}, Lo/bwo;->a([I)V

    .line 270
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->d(I)V

    .line 271
    sget v0, Lcom/huawei/health/suggestion/R$color;->sug_event_selebg:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->e(I)V

    .line 273
    :goto_0
    sget v0, Lcom/huawei/health/suggestion/R$dimen;->sug_event_linewidth:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(I)F

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->b(F)V

    .line 274
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->k(I)V

    .line 275
    sget v0, Lcom/huawei/health/suggestion/R$dimen;->sug_event_line_pointradio:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(I)F

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->c(F)V

    .line 276
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_black_50alpha:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->b(I)V

    .line 277
    sget v0, Lcom/huawei/health/suggestion/R$color;->common_black_10alpha:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/bwo;->g(I)V

    .line 279
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Ljava/util/List;Lo/bwo;)V

    .line 280
    invoke-virtual {v5, v4}, Lo/bwo;->d(Ljava/util/List;)V

    .line 281
    return-void
.end method

.method private c(ZLjava/util/Calendar;)V
    .locals 4

    .line 442
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Lo/buk;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 444
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v3, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 447
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Z)V

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->t:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 451
    invoke-virtual {p0, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Ljava/util/Calendar;)V

    .line 452
    return-void
.end method

.method private d(Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Calendar;Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/List<Lo/bwn;>;I)Ljava/util/List;"
        }
    .end annotation

    .line 577
    if-nez p2, :cond_0

    .line 578
    return-object p3

    .line 580
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 582
    if-nez p4, :cond_6

    .line 584
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_3

    .line 586
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 587
    const/4 v0, 0x0

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 588
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 589
    const/4 v0, 0x0

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 591
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p3, p2, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 595
    :cond_3
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 596
    const/4 v0, 0x1

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 597
    :cond_4
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 598
    const/4 v0, 0x1

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_0

    .line 600
    :cond_5
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p3, p2, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 605
    :cond_6
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    if-nez v0, :cond_9

    .line 607
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 608
    const/4 v0, 0x2

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 609
    :cond_7
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 610
    const/4 v0, 0x2

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 612
    :cond_8
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p3, p2, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 616
    :cond_9
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_a

    .line 617
    const/4 v0, 0x3

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 618
    :cond_a
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_b

    .line 619
    const/4 v0, 0x3

    invoke-direct {p0, p3, p2, p1, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    .line 621
    :cond_b
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, p3, p2, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/List;Ljava/util/List;Ljava/util/Calendar;I)Ljava/util/List;

    move-result-object v2

    .line 625
    :goto_0
    return-object v2
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;Ljava/util/List;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Lo/bvr;Ljava/util/List;)V

    return-void
.end method

.method private d(Ljava/util/Calendar;)V
    .locals 12

    .line 530
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 531
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 533
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_timeformart_mmmd:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 535
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 537
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 541
    move-object v0, p0

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->f:Ljava/util/List;

    move-object v3, p1

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move-object v7, v11

    const/4 v1, 0x7

    invoke-direct/range {v0 .. v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(ILjava/util/List;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;Ljava/text/SimpleDateFormat;Ljava/util/List;)V

    goto :goto_0

    .line 542
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 543
    move-object v0, p0

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->o:Ljava/util/List;

    move-object v3, p1

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move-object v7, v11

    const/16 v1, 0x1f

    invoke-direct/range {v0 .. v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(ILjava/util/List;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;Ljava/text/SimpleDateFormat;Ljava/util/List;)V

    goto :goto_0

    .line 545
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_2

    .line 546
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v8, v9, v0}, Lo/bvt;->c(Ljava/util/List;Ljava/util/List;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v8, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 548
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->l:Ljava/util/List;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v9, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 549
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->l:Ljava/util/List;

    invoke-static {v0, v11}, Lo/bvt;->b(Ljava/util/List;Ljava/util/List;)V

    .line 552
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->i:Lo/buv;

    invoke-virtual {v0, v11}, Lo/buv;->e(Ljava/util/List;)V

    .line 553
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 554
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Z)Z
    .locals 0

    .line 76
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->v:Z

    return p1
.end method

.method private d(Z)Z
    .locals 2

    .line 420
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    if-ltz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(ILjava/util/List;Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;Ljava/text/SimpleDateFormat;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Ljava/util/Calendar;Ljava/util/List<Lo/bwn;>;Ljava/util/List<Lo/bwn;>;Ljava/text/SimpleDateFormat;Ljava/util/List<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 557
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 558
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    invoke-static {p3, p6, v2, v0}, Lo/bvt;->e(Ljava/util/Calendar;Ljava/text/SimpleDateFormat;II)Lo/bwn;

    move-result-object v3

    .line 559
    invoke-interface {p4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    invoke-virtual {v3}, Lo/bwn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwn;

    invoke-interface {p5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 562
    :cond_0
    neg-int v0, p1

    const/4 v1, 0x6

    invoke-virtual {p3, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 563
    const/4 v0, 0x0

    invoke-direct {p0, p3, p2, p4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    const/4 v0, 0x1

    invoke-direct {p0, p3, p2, p5, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Ljava/util/Calendar;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {p7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 565
    invoke-static {p2, p7}, Lo/bvt;->b(Ljava/util/List;Ljava/util/List;)V

    .line 566
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 3

    .line 458
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 459
    const-string v0, "workout_record"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 460
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->startActivity(Landroid/content/Intent;)V

    .line 461
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;ILjava/lang/Object;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Lo/bvr;ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Lo/bvr;Ljava/util/List;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Lo/bvr;Ljava/util/List;)V

    return-void
.end method

.method private e(Ljava/util/Calendar;)V
    .locals 2

    .line 695
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    invoke-static {v0, v1}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 696
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 698
    :cond_0
    return-void
.end method

.method private e(Ljava/util/List;Lo/bwo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bwn;>;Lo/bwo;)V"
        }
    .end annotation

    .line 284
    invoke-virtual {p2}, Lo/bwo;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 287
    :cond_0
    return-void
.end method

.method private e(Z)Z
    .locals 2

    .line 410
    if-eqz p1, :cond_0

    .line 411
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    .line 412
    const/4 v0, 0x0

    return v0

    .line 414
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    .line 415
    const/4 v0, 0x1

    return v0
.end method

.method private h(Z)V
    .locals 2

    .line 433
    if-eqz p1, :cond_0

    .line 434
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    goto :goto_0

    .line 436
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    .line 438
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 392
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->v:Z

    .line 393
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 394
    return-void

    .line 396
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Z)Z

    move-result v2

    .line 398
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 400
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 401
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    const/4 v1, 0x3

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 402
    invoke-direct {p0, p1, v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(ZZLjava/util/Calendar;)V

    goto :goto_0

    .line 403
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 404
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->m:I

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x6

    invoke-virtual {v3, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 405
    invoke-direct {p0, p1, v2, v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(ZZLjava/util/Calendar;)V

    .line 407
    :cond_2
    :goto_0
    return-void
.end method

.method protected b(Ljava/util/Calendar;)V
    .locals 7

    .line 656
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Ljava/util/Calendar;)V

    .line 657
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v4

    .line 658
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 659
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 660
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 662
    :try_start_0
    invoke-direct {p0, v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/text/DateFormat;Ljava/text/SimpleDateFormat;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 665
    goto :goto_0

    .line 663
    :catch_0
    move-exception v6

    .line 664
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6\u5386\u53f2\u8ba1\u5212\uff0c\u89e3\u6790\u65e5\u671f\u51fa\u9519"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    goto :goto_0

    .line 667
    :cond_0
    invoke-direct {p0, p1, v4, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Ljava/util/Calendar;Ljava/text/DateFormat;Ljava/text/SimpleDateFormat;)V

    .line 669
    :goto_0
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u83b7\u53d6\u6570\u636e\u65f6\u95f4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c(Ljava/util/Calendar;)V

    .line 671
    return-void
.end method

.method public c(I)F
    .locals 1

    .line 482
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    .line 746
    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Z)V

    .line 747
    return-void
.end method

.method public e(I)I
    .locals 1

    .line 478
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 726
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 727
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 732
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .line 721
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 722
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 736
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "last and next click disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_event_last:I

    if-ne v0, v1, :cond_0

    .line 738
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Z)V

    goto :goto_0

    .line 740
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Z)V

    .line 742
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8
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

    .line 127
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->k:Lo/bsp;

    .line 128
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 129
    const-string v0, "plantype"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a:I

    .line 130
    const-string v0, "planid"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->h:Ljava/lang/String;

    .line 131
    const-string v0, "timezone"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e:I

    .line 132
    const-string v0, "joined"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/Plan;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    .line 134
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_trainevent_basefm:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 135
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_iv_ani:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->s:Landroid/widget/ImageView;

    .line 136
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_trainevent_time:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 137
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_train_rcv_events:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->r:Landroid/support/v7/widget/RecyclerView;

    .line 138
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->r:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 139
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_state_progressBar:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->t:Landroid/widget/RelativeLayout;

    .line 140
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 141
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [I

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_train_event_chart2:I

    const/4 v4, 0x0

    aput v3, v2, v4

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_item_rcvtrain_event:I

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;Ljava/util/List;[I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->i:Lo/buv;

    .line 172
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_tevent_stime:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->q:Lo/efy;

    .line 173
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_last:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    .line 174
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_next:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    .line 175
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a()V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->n:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 180
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 181
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireStartDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->g:Ljava/util/Date;

    .line 182
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->c:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->getEndDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->z:Ljava/util/Date;

    .line 184
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 185
    invoke-direct {p0, v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->a(Ljava/util/Calendar;)V

    .line 186
    invoke-direct {p0, v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->e(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    goto :goto_0

    .line 188
    :catch_0
    move-exception v7

    .line 189
    const-string v0, "TraineventBaseFm"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->i:Lo/buv;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 192
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 193
    invoke-virtual {p0, v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->b(Ljava/util/Calendar;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->r:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 215
    return-object v6
.end method
