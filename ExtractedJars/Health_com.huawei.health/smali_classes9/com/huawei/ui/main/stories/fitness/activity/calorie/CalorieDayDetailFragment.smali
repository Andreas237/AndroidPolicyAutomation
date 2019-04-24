.class public Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$d;
    }
.end annotation


# static fields
.field private static b:Ljava/lang/String;


# instance fields
.field private T:Lo/fad;

.field private V:Ljava/lang/String;

.field private Y:Ljava/util/Date;

.field private Z:Landroid/os/Handler;

.field protected a:Lo/exq;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private d:D

.field private e:Lo/eys;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const-string v0, "SCUI_CalorieDayDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->V:Ljava/lang/String;

    .line 52
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->T:Lo/fad;

    .line 65
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Z:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->m()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;Lo/fad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(Lo/fad;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 329
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestTotalDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->l:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$d;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 336
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestTotalDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Lo/fad;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->T:Lo/fad;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 45
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->V:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 272
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestBarChartDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->i:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$d;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$d;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 279
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave requestBarChartDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 245
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b()V

    .line 247
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 253
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    .line 254
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mCurrentDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    .line 259
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->U:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 8

    .line 343
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 350
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: null == calDayBarData or not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 352
    return-void

    .line 354
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 357
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all calores is less than 1 kcal don\'t show barview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    return-void

    .line 360
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI calDayBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->c:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    .line 368
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    .line 371
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v6, v0

    .line 372
    int-to-double v0, v5

    cmpl-double v0, v6, v0

    if-nez v0, :cond_2

    .line 373
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    .line 376
    :cond_2
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave updateBarChartUI maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->d:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Z:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    .line 98
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a:Lo/exq;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b(Ljava/lang/String;)V

    .line 106
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 106
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b(IIIII)V

    .line 111
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CalorieDayDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 114
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 115
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 116
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 117
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 113
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 119
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->h()V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e:Lo/eys;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 121
    new-instance v0, Lo/eys;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eys;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e:Lo/eys;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e:Lo/eys;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/eys;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_dark_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 141
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 142
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 143
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 144
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v1

    const-string v2, "00"

    invoke-virtual {v1, v7, v2}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    add-float v9, v0, v1

    .line 145
    move v10, v9

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e:Lo/eys;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 151
    :cond_0
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    .line 153
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->f()V

    .line 154
    return-void
.end method

.method public b()V
    .locals 1

    .line 263
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->e(Ljava/util/Date;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b(Ljava/util/Date;)V

    .line 266
    return-void
.end method

.method public c()V
    .locals 6

    .line 203
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 204
    return-void

    .line 207
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    .line 208
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(II)V

    .line 210
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieDayDetailFragment processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 212
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    .line 213
    return-void

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    .line 218
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g()V

    .line 220
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 221
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 226
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 228
    return-void
.end method

.method public d()V
    .locals 6

    .line 175
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 176
    return-void

    .line 179
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    .line 180
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->a(II)V

    .line 182
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieDayDetailFragment processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    const v1, 0xea60

    if-le v0, v1, :cond_1

    .line 184
    const v0, 0xea60

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->I:I

    .line 185
    return-void

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    .line 190
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g()V

    .line 192
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 193
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->Y:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 199
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 200
    return-void
.end method
