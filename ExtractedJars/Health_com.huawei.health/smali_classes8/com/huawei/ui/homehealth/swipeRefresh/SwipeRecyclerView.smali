.class public Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$RecyclerViewNoBugLinearLayoutManager;,
        Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/view/View;

.field private c:Lhuawei/widget/HwProgressBar;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/TextView;

.field private f:I

.field private g:I

.field private h:Landroid/support/v7/widget/RecyclerView;

.field private i:I

.field private k:Landroid/widget/LinearLayout;

.field private l:I

.field private m:I

.field private n:F

.field private o:I

.field private p:I

.field private q:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;

.field private r:Z

.field private s:Landroid/content/Context;

.field private t:Z

.field private u:I

.field private x:Landroid/animation/ObjectAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 69
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 70
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 77
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->m:I

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->o:I

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    .line 78
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c(Landroid/content/Context;)V

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    .line 80
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    return v0
.end method

.method private a(FFI)V
    .locals 4

    .line 221
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hideTranslationY yStart ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",yEnd"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 223
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "objectAnimator.cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    const-string v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p1, v2, v3

    const/4 v3, 0x1

    aput p2, v2, v3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-long v1, p3

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->x:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$1;-><init>(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;FF)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 244
    return-void
.end method

.method private b(Landroid/content/Context;F)I
    .locals 5

    .line 113
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dpToPx() dpValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    .line 115
    mul-float v0, p2, v4

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Lhuawei/widget/HwProgressBar;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c:Lhuawei/widget/HwProgressBar;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/content/Context;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 5

    .line 85
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter SwipeRecyclerView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 88
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->fragment_home:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d:Landroid/view/View;

    .line 94
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->swipe_recyclerview_headview:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b:Landroid/view/View;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->id_recyclerview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->h:Landroid/support/v7/widget/RecyclerView;

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->h:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$RecyclerViewNoBugLinearLayoutManager;

    invoke-direct {v1, p1}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$RecyclerViewNoBugLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_recycler_loading_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e:Landroid/widget/TextView;

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_recycler_loading_hpb:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c:Lhuawei/widget/HwProgressBar;

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_recycler_pull_image:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a:Landroid/widget/ImageView;

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 108
    const/high16 v0, 0x42700000    # 60.0f

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    .line 110
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;I)I
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/widget/TextView;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;)Landroid/widget/ImageView;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e(I)Z
    .locals 4

    .line 144
    if-lez p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->h:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    if-nez v0, :cond_0

    .line 145
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRefreshViewScroll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->m:I

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->l:I

    .line 147
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    .line 148
    const/4 v0, 0x1

    return v0

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;Z)Z
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    return p1
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 213
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Pull Refresh Finish isLoading ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    if-eqz v0, :cond_0

    .line 215
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    neg-int v0, v0

    int-to-float v0, v0

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-direct {p0, v1, v0, v2}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(FFI)V

    .line 216
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    .line 218
    :cond_0
    return-void
.end method

.method public getRecyclerView()Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->h:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v3, v0

    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 126
    :sswitch_0
    iput v2, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->i:I

    .line 127
    iput v3, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->f:I

    .line 128
    goto :goto_0

    .line 130
    :sswitch_1
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->i:I

    sub-int v4, v2, v0

    .line 131
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->f:I

    sub-int v5, v3, v0

    .line 132
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 133
    invoke-direct {p0, v5}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x1

    return v0

    .line 139
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 7

    .line 266
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onLayout called. changed is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "linearView is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 270
    sub-int v4, p5, p3

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 277
    if-eqz p1, :cond_0

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 279
    iput v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->d:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 282
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    add-int/2addr v0, v4

    iput v0, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTranslationY(F)V

    .line 286
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->invalidate()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :cond_1
    goto :goto_0

    .line 288
    :catch_0
    move-exception v4

    .line 289
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLayout Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 256
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 257
    if-eqz p2, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->u:I

    if-eq p2, v0, :cond_0

    .line 258
    iput p2, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->u:I

    .line 260
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 155
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v4, v0

    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 158
    :pswitch_0
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->f:I

    sub-int v0, v4, v0

    int-to-float v5, v0

    .line 159
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->l:I

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->m:I

    if-ne v0, v1, :cond_5

    .line 160
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->u:I

    if-eqz v0, :cond_0

    .line 161
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->u:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    mul-float/2addr v1, v5

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    .line 163
    :cond_0
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    if-gez v0, :cond_1

    .line 164
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    .line 166
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->n:F

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->k:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->n:F

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setTranslationY(F)V

    .line 169
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->g:I

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    if-lt v0, v1, :cond_3

    .line 170
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    if-nez v0, :cond_2

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_step_release_synchordata:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->icon_refresh_up:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 174
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    goto :goto_0

    .line 176
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    if-eqz v0, :cond_4

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_step_pull_synchordata:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->icon_refresh_down:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 180
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    .line 183
    :cond_5
    :goto_0
    iput v4, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->f:I

    .line 184
    const/4 v0, 0x1

    return v0

    .line 187
    :pswitch_1
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    if-eqz v0, :cond_7

    .line 188
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->o:I

    iput v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->l:I

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->q:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;

    if-eqz v0, :cond_6

    .line 190
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pull Refresh Start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->q:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;

    invoke-interface {v0}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;->d()V

    .line 192
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->n:F

    const/4 v1, 0x0

    const/16 v2, 0x1f4

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(FFI)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->s:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_home_step_is_synchordata:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->c:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    goto :goto_1

    .line 198
    :cond_6
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->n:F

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    neg-int v1, v1

    int-to-float v1, v1

    const/16 v2, 0x64

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(FFI)V

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    .line 200
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->t:Z

    goto :goto_1

    .line 203
    :cond_7
    const-string v0, "UIHLH_SwipeRecyclerView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Pull Refresh Cancle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->n:F

    iget v1, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->p:I

    neg-int v1, v1

    int-to-float v1, v1

    const/16 v2, 0x64

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->a(FFI)V

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->r:Z

    .line 207
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 209
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setOnSwipeRecyclerViewListener(Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;)V
    .locals 1

    .line 247
    invoke-static {p1}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView;->q:Lcom/huawei/ui/homehealth/swipeRefresh/SwipeRecyclerView$c;

    .line 248
    return-void
.end method
