.class public Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$a;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private T:Ljava/util/Date;

.field private V:Lo/fad;

.field private ab:Landroid/os/Handler;

.field private ac:Ljava/util/Date;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private c:Lo/eyf;

.field private d:D

.field protected e:Lo/exq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const-string v0, "SCUI_CalorieWeekDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 51
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->V:Lo/fad;

    .line 58
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ab:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)Lo/fad;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->V:Lo/fad;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->m()V

    return-void
.end method

.method private b(Ljava/util/Date;)V
    .locals 6

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->u:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$a;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 337
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ab:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 45
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->e:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$a;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;I)V

    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 284
    return-void
.end method

.method private f()V
    .locals 5

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    .line 224
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 223
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 227
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 226
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 2222 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 238
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 240
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b()V

    .line 242
    return-void
.end method

.method private g()V
    .locals 5

    .line 248
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    .line 252
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    .line 259
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 258
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 262
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 261
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mStartDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mEndDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    return-void
.end method

.method private h()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    return-void
.end method

.method private m()V
    .locals 16

    .line 343
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 346
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    .line 348
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 349
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 350
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI: null == calWeekBarData or not valid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 352
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    return-void

    .line 355
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 357
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI calWeekBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 360
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all calores is less than 1 kcal don\'t show barview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    return-void

    .line 365
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v5}, Lo/eyf;->e(Ljava/util/List;)D

    move-result-wide v6

    .line 366
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v8, v6, v0

    .line 367
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v10, v0

    .line 368
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    .line 369
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-virtual {v0, v1, v2, v8, v9}, Lo/eyf;->c(DD)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    .line 370
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    .line 373
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v11, v0

    .line 374
    int-to-double v0, v10

    cmpl-double v0, v11, v0

    if-nez v0, :cond_2

    .line 375
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    .line 377
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-virtual {v0, v1, v2}, Lo/eyf;->a(D)V

    .line 378
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v13, v0

    .line 380
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 381
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    int-to-double v0, v13

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    int-to-double v0, v13

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 385
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v15, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v14}, Lo/eyf;->c(Ljava/util/ArrayList;)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eyf;->c(Z)V

    .line 389
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 391
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI avgValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       avgKcalValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       avgKcal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "       maxData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->d:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e:Lo/exq;

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->t:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_calorie_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_average_calorie_data_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 99
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 100
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 101
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 103
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 99
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b(IIIII)V

    .line 104
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CalorieWeekDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->z:Lo/eyi;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 107
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 109
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_four:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 110
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_color_five:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 106
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 112
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g()V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 114
    new-instance v0, Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eyf;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Lo/eyf;->setDiagramAnchorType(I)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/eyh;->b(IF)F

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(F)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    .line 120
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_dark_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 119
    invoke-virtual {v0, v1, v2}, Lo/eyf;->setBarColor(II)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_light_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eyf;->setAnchorBackground(I)V

    .line 123
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 124
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 126
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v8, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v9

    .line 127
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v7, v1}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v10

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    invoke-virtual {v0, v9, v10}, Lo/eyf;->setPadding(FF)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyf;->d(Ljava/lang/String;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-static {v1, v2}, Lo/ezz;->e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b:Ljava/util/List;

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Lo/eyf;->c(Ljava/util/List;Ljava/util/List;I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->c:Lo/eyf;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 135
    :cond_0
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(Lo/fad;Ljava/lang/String;)V

    .line 137
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->h()V

    .line 138
    return-void
.end method

.method public b()V
    .locals 1

    .line 270
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->e(Ljava/util/Date;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->b(Ljava/util/Date;)V

    .line 273
    return-void
.end method

.method public c()V
    .locals 7

    .line 189
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 190
    return-void

    .line 193
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    .line 194
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(II)V

    .line 195
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieWeekDetailFragment processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    if-gez v0, :cond_1

    .line 197
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    .line 198
    return-void

    .line 202
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 205
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->f()V

    .line 207
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 208
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 210
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 214
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 213
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 216
    return-void
.end method

.method public d()V
    .locals 7

    .line 159
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 160
    return-void

    .line 163
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    .line 164
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a(II)V

    .line 165
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CalorieWeekDetailFragment processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    const/16 v1, 0x217b

    if-le v0, v1, :cond_1

    .line 167
    const/16 v0, 0x217b

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->I:I

    .line 168
    return-void

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    const/4 v1, -0x6

    invoke-static {v0, v1}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    .line 175
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->f()V

    .line 177
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 178
    const-string v0, "time"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->T:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u2014"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy/M/d"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->ac:Ljava/util/Date;

    .line 179
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v0, "barSize"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 185
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/calorie/CalorieWeekDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 186
    return-void
.end method
