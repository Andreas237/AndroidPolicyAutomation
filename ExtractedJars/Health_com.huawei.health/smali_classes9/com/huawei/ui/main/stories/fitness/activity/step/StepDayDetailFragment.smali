.class public Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;
.super Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;,
        Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;
    }
.end annotation


# static fields
.field private static e:Ljava/lang/String;


# instance fields
.field private T:Lo/eys;

.field private V:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Double;>;"
        }
    .end annotation
.end field

.field private Y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eut;>;"
        }
    .end annotation
.end field

.field private Z:Lo/fad;

.field private a:Z

.field private aa:Landroid/widget/TextView;

.field private ab:Ljava/util/Date;

.field private ac:D

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/TextView;

.field private ag:Landroid/widget/ImageView;

.field private ah:Landroid/widget/RelativeLayout;

.field private ai:Landroid/view/View$OnClickListener;

.field private aj:Z

.field private ak:Lo/ewz;

.field private al:Landroid/view/View$OnClickListener;

.field private am:Landroid/os/Handler;

.field private b:Ljava/lang/String;

.field private c:I

.field protected d:Lo/exq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 70
    const-string v0, "SCUI_StepDayDetailFragment"

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/base/BaseDetailFragment;-><init>()V

    .line 71
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b:Ljava/lang/String;

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a:Z

    .line 76
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ac:D

    .line 77
    new-instance v0, Lo/fad;

    invoke-direct {v0}, Lo/fad;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Z:Lo/fad;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    .line 103
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->am:Landroid/os/Handler;

    .line 302
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ai:Landroid/view/View$OnClickListener;

    .line 327
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$3;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->al:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Lo/fad;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Z:Lo/fad;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Lo/fad;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/Date;)V
    .locals 6

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->l:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;

    const/4 v4, 0x2

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->e(JLo/exn$d;ILo/egg;)V

    .line 578
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/Date;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    return-object v0
.end method

.method private b(Landroid/content/Context;Ljava/util/Date;)V
    .locals 7

    .line 585
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter requestTotalCaloriesDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c:I

    .line 587
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 588
    invoke-static {p2}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v5, v0, v2

    .line 589
    invoke-virtual {v4, v5, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 590
    const-wide/32 v0, 0x5265c00

    add-long/2addr v0, v5

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 591
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 592
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "calorie_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 593
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 594
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 595
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$c;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    invoke-virtual {v0, v4, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 596
    return-void

    nop

    :array_0
    .array-data 4
        0x9c43
    .end array-data
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/Date;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e(Ljava/util/Date;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Ljava/util/Date;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Ljava/util/Date;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->l()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Lo/fad;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Lo/fad;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;Landroid/content/Context;Ljava/util/Date;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Landroid/content/Context;Ljava/util/Date;)V

    return-void
.end method

.method private e(Ljava/util/Date;)V
    .locals 6

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-static {p1}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v1

    sget-object v3, Lo/exn$d;->i:Lo/exn$d;

    new-instance v5, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;

    const/4 v4, 0x1

    invoke-direct {v5, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)V

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/exq;->d(JLo/exn$d;ILo/egg;)V

    .line 519
    return-void
.end method

.method private f()V
    .locals 7

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c:I

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ak:Lo/ewz;

    invoke-static {v0, v1, v2}, Lo/ewx;->e(Landroid/content/Context;ILo/ewz;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 158
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aj:Z

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ah:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ae:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ak:Lo/ewz;

    invoke-virtual {v0}, Lo/ewz;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 167
    :pswitch_0
    sget v6, Lcom/huawei/ui/main/R$drawable;->step_day_ic_egg:I

    .line 168
    goto :goto_1

    .line 170
    :pswitch_1
    sget v6, Lcom/huawei/ui/main/R$drawable;->step_day_ic_icecream:I

    .line 171
    goto :goto_1

    .line 173
    :pswitch_2
    sget v6, Lcom/huawei/ui/main/R$drawable;->step_day_ic_hamburger:I

    .line 174
    goto :goto_1

    .line 176
    :pswitch_3
    sget v6, Lcom/huawei/ui/main/R$drawable;->step_day_drumsticks:I

    .line 177
    goto :goto_1

    .line 179
    :goto_0
    const/4 v6, -0x1

    .line 183
    :goto_1
    if-gez v6, :cond_1

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ah:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ae:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ae:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ah:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ae:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->af:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ag:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ad:Landroid/widget/TextView;

    const-string v1, "X%1d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ak:Lo/ewz;

    invoke-virtual {v3}, Lo/ewz;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Q:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 69
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->C:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->B:Landroid/view/View;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$9;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 364
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->E:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    return v0
.end method

.method private l()V
    .locals 4

    .line 637
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->E:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->F:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    invoke-virtual {v0}, Lo/exq;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    .line 643
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceOriginalClass="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->S:Lo/cmj;

    invoke-virtual {v2}, Lo/cmj;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->S:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 646
    return-void

    .line 648
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->J:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    if-nez v0, :cond_1

    .line 651
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChartUI stepDayBarData = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    return-void

    .line 654
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateBarChartUI stepDayBarData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(Ljava/util/List;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ac:D

    .line 659
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ac:D

    invoke-static {v0, v1}, Lo/exj;->e(D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ac:D

    .line 675
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave updateBarChartUI"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->f()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 484
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    .line 486
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 490
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showCurrentDate mCurrentDay = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->U:Landroid/widget/TextView;

    return-object v0
.end method

.method private n()V
    .locals 5

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 504
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas fitnessDataOrigin start."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 506
    return-void

    .line 508
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    new-instance v3, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;I)V

    invoke-virtual {v0, v1, v2, v3}, Lo/exo;->c(JLo/egg;)V

    .line 510
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->X:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 446
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Q:Z

    if-nez v0, :cond_1

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a:Z

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->K:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->O:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->R:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 454
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->K:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->O:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->R:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->G:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ai:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 463
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->h:Landroid/widget/TextView;

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 466
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 472
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->am:Landroid/os/Handler;

    const/16 v1, 0x1773

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 475
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b()V

    .line 477
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Landroid/os/Handler;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->am:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->c:I

    return v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)Ljava/util/List;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Y:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 12

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aj:Z

    .line 203
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    .line 204
    new-instance v0, Lo/exq;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/exq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d:Lo/exq;

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->P:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_phone_not_support_recording_detail_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_step_data_title:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(Ljava/lang/String;)V

    .line 208
    move-object v0, p0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 209
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 211
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 212
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 208
    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->b(IIIII)V

    .line 214
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->m()V

    .line 216
    new-instance v7, Lo/fad;

    invoke-direct {v7}, Lo/fad;-><init>()V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d(Lo/fad;Ljava/lang/String;)V

    .line 218
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->h()V

    .line 220
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->Q:Z

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_day_comment_zh:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ah:Landroid/widget/RelativeLayout;

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment_zh:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->af:Landroid/widget/TextView;

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_day_food:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ag:Landroid/widget/ImageView;

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_day_food_num:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ad:Landroid/widget/TextView;

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_average_data_day_comment_less:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ae:Landroid/widget/TextView;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->aa:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    new-instance v0, Lo/ewz;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ewz;-><init>(IZ)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ak:Lo/ewz;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->k:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->step_detail_day_center:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 232
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepDayDetailFragment setColors"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->z:Lo/eyi;

    .line 234
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 235
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 236
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 237
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_three:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 238
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/huawei/ui/main/R$color;->fitness_detail_step_color_four:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 233
    invoke-virtual/range {v0 .. v5}, Lo/eyi;->setColors(IIIII)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->N:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ai:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->N:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->L:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ai:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->L:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->O:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->al:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->R:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->al:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a:Z

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->K:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->O:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->R:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 257
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->K:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->O:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->R:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->G:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ai:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 265
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->T:Lo/eys;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 267
    new-instance v0, Lo/eys;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eys;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->T:Lo/eys;

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->T:Lo/eys;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;)V

    invoke-virtual {v0, v1}, Lo/eys;->setOnMarkViewTextNotify(Lo/elc$c;)V

    .line 286
    new-instance v8, Landroid/graphics/Paint;

    invoke-direct {v8}, Landroid/graphics/Paint;-><init>()V

    .line 287
    const/4 v0, 0x2

    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 288
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v9

    .line 289
    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {}, Lo/eyh;->e()Lo/eyh;

    move-result-object v1

    const-string v2, "00"

    invoke-virtual {v1, v8, v2}, Lo/eyh;->a(Landroid/graphics/Paint;Ljava/lang/String;)F

    move-result v1

    add-float v10, v0, v1

    .line 290
    move v11, v10

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->T:Lo/eys;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 295
    :cond_2
    return-void
.end method

.method public b()V
    .locals 1

    .line 495
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    .line 496
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->n()V

    .line 497
    return-void
.end method

.method public c()V
    .locals 6

    .line 409
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 410
    return-void

    .line 413
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->C:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-nez v0, :cond_2

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->C:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 418
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 422
    :cond_2
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    .line 423
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(II)V

    .line 424
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mRightArrowIV OnClickListener right 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    if-gez v0, :cond_3

    .line 426
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    .line 427
    return-void

    .line 430
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->h(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    .line 432
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->p()V

    .line 434
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 435
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    const-string v0, "type"

    const-string v1, "right"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 441
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 442
    return-void
.end method

.method public c_()Z
    .locals 1

    .line 299
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 6

    .line 368
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    if-eqz v0, :cond_0

    .line 369
    return-void

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->d(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->C:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_right_dissable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_chart_arrow_left_dissable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 379
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_half_year_data_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 380
    return-void

    .line 383
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    .line 384
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    const v1, 0xea60

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->a(II)V

    .line 385
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processChangeDate mLeftArrowIV OnClickListener left 1111 mChangeDateCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    const v1, 0xea60

    if-le v0, v1, :cond_3

    .line 387
    const v0, 0xea60

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->I:I

    .line 388
    return-void

    .line 391
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-static {v0}, Lo/dbu;->k(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    .line 393
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->p()V

    .line 396
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 397
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    const-string v0, "activityName"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    const-string v0, "barSize"

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    const-string v0, "time"

    const-string v1, "yyyy/M/d"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    const-string v0, "type"

    const-string v1, "left"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    sget-object v0, Lo/dae;->gH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 403
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 405
    return-void
.end method

.method public i()V
    .locals 8

    .line 310
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 311
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    sget-object v0, Lo/dae;->gE:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 313
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 315
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    .line 316
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 317
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity isn\'t exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    return-void

    .line 320
    :cond_0
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepsShareActivity;

    invoke-direct {v7, v6, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 321
    const-string v0, "index"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 322
    const-string v0, "mCurrentDay"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/StepDayDetailFragment;->ab:Ljava/util/Date;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 323
    invoke-virtual {v6, v7}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 324
    return-void
.end method
