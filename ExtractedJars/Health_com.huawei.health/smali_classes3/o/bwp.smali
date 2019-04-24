.class public Lo/bwp;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v4/view/ViewPager;

.field public b:Landroid/widget/ImageView;

.field private c:Lo/bwm;

.field private d:Lo/efy;

.field private e:Landroid/widget/ImageView;

.field private g:Lo/efy;

.field private h:I

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0, p1, p2}, Lo/bwp;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0, p1, p2}, Lo/bwp;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method private d(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 54
    sget-object v0, Lcom/huawei/health/suggestion/R$styleable;->ActionIntro:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$styleable;->ActionIntro_intro:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/bwp;->h:I

    .line 56
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_traindetail_action_intro:I

    .line 58
    iget v0, p0, Lo/bwp;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 59
    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_coach_action_intro:I

    .line 61
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/bwp;->setClickable(Z)V

    .line 62
    invoke-virtual {p0}, Lo/bwp;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_ll_yaodian:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwm;

    iput-object v0, p0, Lo/bwp;->c:Lo/bwm;

    .line 64
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_vp_action_yaodian:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lo/bwp;->a:Landroid/support/v4/view/ViewPager;

    .line 65
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_intro_motionc:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwp;->d:Lo/efy;

    .line 66
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_intro_totle:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwp;->g:Lo/efy;

    .line 67
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_pre:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwp;->e:Landroid/widget/ImageView;

    .line 68
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_nex:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwp;->k:Landroid/widget/ImageView;

    .line 69
    invoke-static {p1}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    iget-object v0, p0, Lo/bwp;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_coach_train_next:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 71
    iget-object v0, p0, Lo/bwp;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_coach_train_last:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coachiv_close:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwp;->b:Landroid/widget/ImageView;

    .line 74
    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 5

    .line 116
    iget-object v0, p0, Lo/bwp;->d:Lo/efy;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object v0, p0, Lo/bwp;->g:Lo/efy;

    int-to-double v1, p2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 120
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 111
    iget-object v0, p0, Lo/bwp;->d:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 112
    iget-object v0, p0, Lo/bwp;->g:Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 113
    return-void
.end method

.method public getCloseImg()Landroid/widget/ImageView;
    .locals 1

    .line 131
    iget-object v0, p0, Lo/bwp;->b:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getCurrentIndex()I
    .locals 1

    .line 98
    iget-object v0, p0, Lo/bwp;->d:Lo/efy;

    invoke-virtual {v0}, Lo/efy;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getNextAction()Landroid/widget/ImageView;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/bwp;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getPreAction()Landroid/widget/ImageView;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/bwp;->e:Landroid/widget/ImageView;

    return-object v0
.end method

.method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lo/bwp;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 78
    return-void
.end method

.method public setCurrent(I)V
    .locals 1

    .line 81
    iget-object v0, p0, Lo/bwp;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 82
    return-void
.end method

.method public setCurrentIndex(I)V
    .locals 5

    .line 102
    iget-object v0, p0, Lo/bwp;->d:Lo/efy;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 104
    return-void
.end method

.method public setCurrentIndex(Ljava/lang/String;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lo/bwp;->d:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 108
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lo/bwp;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 89
    return-void
.end method

.method public setOnSlidingListener(Lo/bwf;)V
    .locals 1

    .line 92
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 93
    iget-object v0, p0, Lo/bwp;->c:Lo/bwm;

    invoke-virtual {v0, p1}, Lo/bwm;->setOnSlidingListener(Lo/bwf;)V

    .line 95
    :cond_0
    return-void
.end method
