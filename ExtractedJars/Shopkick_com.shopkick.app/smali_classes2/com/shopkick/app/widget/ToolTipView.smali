.class public abstract Lcom/shopkick/app/widget/ToolTipView;
.super Ljava/lang/Object;
.source "ToolTipView.java"


# instance fields
.field protected ARROW_VIEW_WIDTH_DP:I

.field protected HIDE_ANIMATION_DURATION_MS:I

.field protected SHOW_ANIMATION_DURATION_MS:I

.field private anchorViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private animatePointX:I

.field private animatePointY:I

.field private blockerView:Landroid/view/View;

.field private containerRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private displayedTimestampMs:J

.field private extCloseButtonRefs:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private isShown:Z

.field private marginBottom:I

.field private marginLeft:I

.field private marginRight:I

.field private marginTop:I

.field private shouldLocatedAboveAnchorView:Z

.field private tooltipHeight:I

.field private tooltipView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x190

    .line 25
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->SHOW_ANIMATION_DURATION_MS:I

    const/16 v0, 0xc8

    .line 26
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->HIDE_ANIMATION_DURATION_MS:I

    const/16 v0, 0x14

    .line 27
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->ARROW_VIEW_WIDTH_DP:I

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->extCloseButtonRefs:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginLeft:I

    .line 37
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginTop:I

    .line 38
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginRight:I

    .line 39
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginBottom:I

    .line 40
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    .line 42
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    .line 43
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    const-wide/16 v1, -0x1

    .line 45
    iput-wide v1, p0, Lcom/shopkick/app/widget/ToolTipView;->displayedTimestampMs:J

    .line 47
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    .line 51
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    .line 52
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->containerRef:Ljava/lang/ref/WeakReference;

    .line 53
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->anchorViewRef:Ljava/lang/ref/WeakReference;

    const/high16 p2, -0x80000000

    .line 55
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/widget/ToolTipView;->setupTooltipView(Landroid/view/ViewGroup;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 3

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x190

    .line 25
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->SHOW_ANIMATION_DURATION_MS:I

    const/16 v0, 0xc8

    .line 26
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->HIDE_ANIMATION_DURATION_MS:I

    const/16 v0, 0x14

    .line 27
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->ARROW_VIEW_WIDTH_DP:I

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->extCloseButtonRefs:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginLeft:I

    .line 37
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginTop:I

    .line 38
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginRight:I

    .line 39
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->marginBottom:I

    .line 40
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    .line 42
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    .line 43
    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    const-wide/16 v1, -0x1

    .line 45
    iput-wide v1, p0, Lcom/shopkick/app/widget/ToolTipView;->displayedTimestampMs:J

    .line 47
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    .line 59
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    .line 60
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->containerRef:Ljava/lang/ref/WeakReference;

    .line 61
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->anchorViewRef:Ljava/lang/ref/WeakReference;

    .line 63
    invoke-direct {p0, p1, p3}, Lcom/shopkick/app/widget/ToolTipView;->setupTooltipView(Landroid/view/ViewGroup;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/widget/ToolTipView;)Z
    .locals 0

    .line 23
    iget-boolean p0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/widget/ToolTipView;)Ljava/util/HashSet;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/shopkick/app/widget/ToolTipView;->extCloseButtonRefs:Ljava/util/HashSet;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/widget/ToolTipView;FFLandroid/view/View;)Z
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/widget/ToolTipView;->isPointInsideView(FFLandroid/view/View;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/widget/ToolTipView;J)J
    .locals 0

    .line 23
    iput-wide p1, p0, Lcom/shopkick/app/widget/ToolTipView;->displayedTimestampMs:J

    return-wide p1
.end method

.method private isPointInsideView(FFLandroid/view/View;)Z
    .locals 5

    const/4 v0, 0x2

    .line 149
    new-array v0, v0, [I

    .line 150
    invoke-virtual {p3, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x0

    .line 151
    aget v2, v0, v1

    const/4 v3, 0x1

    .line 152
    aget v0, v0, v3

    int-to-float v4, v2

    cmpl-float v4, p1, v4

    if-lez v4, :cond_0

    .line 155
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v2, v4

    int-to-float v2, v2

    cmpg-float p1, p1, v2

    if-gez p1, :cond_0

    int-to-float p1, v0

    cmpl-float p1, p2, p1

    if-lez p1, :cond_0

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr v0, p1

    int-to-float p1, v0

    cmpg-float p1, p2, p1

    if-gez p1, :cond_0

    move v1, v3

    :cond_0
    return v1
.end method

.method public static synthetic lambda$setupTooltipView$226(Lcom/shopkick/app/widget/ToolTipView;Landroid/view/View;)V
    .locals 0

    .line 87
    invoke-virtual {p0}, Lcom/shopkick/app/widget/ToolTipView;->dismiss()V

    return-void
.end method

.method private setTooltipPosition()V
    .locals 13

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->containerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 301
    iget-object v1, p0, Lcom/shopkick/app/widget/ToolTipView;->anchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v0, :cond_6

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 305
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v3, 0x7f090047

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    const/4 v2, 0x2

    .line 308
    new-array v5, v2, [I

    .line 309
    new-array v6, v2, [I

    .line 310
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v7

    .line 311
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v8

    .line 312
    iget v9, p0, Lcom/shopkick/app/widget/ToolTipView;->ARROW_VIEW_WIDTH_DP:I

    iget-object v10, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {v9, v10}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v9

    .line 314
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 315
    invoke-virtual {v1, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 319
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const/4 v10, -0x1

    const/4 v11, -0x2

    invoke-virtual {v0, v10, v11}, Landroid/view/View;->measure(II)V

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    .line 321
    iget-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v0, :cond_2

    .line 322
    iget v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    aget v7, v6, v11

    if-ge v0, v7, :cond_1

    move v0, v11

    goto :goto_0

    :cond_1
    move v0, v10

    :goto_0
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    goto :goto_2

    .line 324
    :cond_2
    iget v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    aget v12, v5, v11

    add-int/2addr v12, v7

    aget v7, v6, v11

    sub-int/2addr v12, v7

    sub-int/2addr v12, v8

    if-lt v0, v12, :cond_3

    move v0, v11

    goto :goto_1

    :cond_3
    move v0, v10

    :goto_1
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    .line 329
    :goto_2
    aget v0, v6, v10

    aget v7, v5, v10

    sub-int/2addr v0, v7

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/2addr v1, v2

    add-int/2addr v0, v1

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->marginLeft:I

    sub-int/2addr v0, v1

    div-int/2addr v9, v2

    sub-int/2addr v0, v9

    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    .line 332
    iget-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    const v1, 0x7f090046

    if-eqz v0, :cond_4

    .line 333
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x7f090045

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    goto :goto_3

    .line 337
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x7f090044

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 343
    :goto_3
    aget v0, v6, v11

    aget v1, v5, v11

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    if-eqz v1, :cond_5

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    neg-int v8, v1

    :cond_5
    add-int/2addr v0, v8

    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_6
    :goto_4
    return-void
.end method

.method private setupTooltipView(Landroid/view/ViewGroup;I)V
    .locals 5

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 68
    invoke-virtual {p0}, Lcom/shopkick/app/widget/ToolTipView;->getLayout()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    new-instance v3, Lcom/shopkick/app/widget/ToolTipView$1;

    invoke-direct {v3, p0}, Lcom/shopkick/app/widget/ToolTipView$1;-><init>(Lcom/shopkick/app/widget/ToolTipView;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v3, 0x7f090671

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 79
    iget-object v3, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v4, 0x7f090112

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/widget/ToolTipView;->shouldShowCloseButton()Z

    move-result v4

    if-nez v4, :cond_1

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    if-eqz v3, :cond_3

    .line 82
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 84
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    if-eqz v3, :cond_3

    .line 86
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 87
    new-instance v0, Lcom/shopkick/app/widget/-$$Lambda$ToolTipView$1hAAn6RLRpYqt2JShaCKtUqeUk4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/widget/-$$Lambda$ToolTipView$1hAAn6RLRpYqt2JShaCKtUqeUk4;-><init>(Lcom/shopkick/app/widget/ToolTipView;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    :cond_3
    :goto_0
    new-instance v0, Landroid/view/View;

    iget-object v2, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/widget/ToolTipView$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/widget/ToolTipView$2;-><init>(Lcom/shopkick/app/widget/ToolTipView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    if-ltz p2, :cond_4

    .line 114
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_1

    .line 119
    :cond_4
    iget-object p2, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    iget-object p2, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public addExtCloseButton(Landroid/view/View;)V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->extCloseButtonRefs:Ljava/util/HashSet;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract after(Lcom/shopkick/app/widget/ToolTipView;)V
.end method

.method public destroy()V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->extCloseButtonRefs:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 290
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->containerRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 294
    iget-object v1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 3

    .line 257
    iget-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 258
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 262
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget-boolean v1, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    int-to-float v1, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotY(F)V

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 265
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->HIDE_ANIMATION_DURATION_MS:I

    int-to-long v1, v1

    .line 266
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/widget/ToolTipView$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/widget/ToolTipView$4;-><init>(Lcom/shopkick/app/widget/ToolTipView;)V

    .line 267
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 285
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public getAnchorView()Landroid/view/View;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->anchorViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public getBlockerView()Landroid/view/View;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    return-object v0
.end method

.method public getDisplayedTimestampMs()J
    .locals 2

    .line 162
    iget-wide v0, p0, Lcom/shopkick/app/widget/ToolTipView;->displayedTimestampMs:J

    return-wide v0
.end method

.method protected getLayout()I
    .locals 1

    const v0, 0x7f0c01dd

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    return-object v0
.end method

.method public isShown()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    return v0
.end method

.method public setMargin(IIII)V
    .locals 1

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/widget/ToolTipView;->marginLeft:I

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/widget/ToolTipView;->marginTop:I

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {p3, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/widget/ToolTipView;->marginRight:I

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView;->context:Landroid/content/Context;

    invoke-static {p4, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/widget/ToolTipView;->marginBottom:I

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 205
    iget p2, p0, Lcom/shopkick/app/widget/ToolTipView;->marginLeft:I

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 206
    iget p2, p0, Lcom/shopkick/app/widget/ToolTipView;->marginTop:I

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 207
    iget p2, p0, Lcom/shopkick/app/widget/ToolTipView;->marginRight:I

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 208
    iget p2, p0, Lcom/shopkick/app/widget/ToolTipView;->marginBottom:I

    iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 209
    iget-object p2, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setText(I)V
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x7f09078e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x7f09078e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTextSize(F)V
    .locals 2

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x7f09078e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method

.method public setTooltipPosition(Z)V
    .locals 0

    .line 195
    iput-boolean p1, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    return-void
.end method

.method public setYPosition(I)V
    .locals 1

    .line 177
    iget v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget v0, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointY:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method protected shouldShowCloseButton()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public show()V
    .locals 3

    .line 222
    iget-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 223
    iput-boolean v0, p0, Lcom/shopkick/app/widget/ToolTipView;->isShown:Z

    const-wide/16 v0, -0x1

    .line 224
    iput-wide v0, p0, Lcom/shopkick/app/widget/ToolTipView;->displayedTimestampMs:J

    .line 226
    invoke-direct {p0}, Lcom/shopkick/app/widget/ToolTipView;->setTooltipPosition()V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->blockerView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->animatePointX:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    iget-boolean v1, p0, Lcom/shopkick/app/widget/ToolTipView;->shouldLocatedAboveAnchorView:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipHeight:I

    int-to-float v1, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotY(F)V

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/widget/ToolTipView;->tooltipView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 236
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/widget/ToolTipView;->SHOW_ANIMATION_DURATION_MS:I

    int-to-long v1, v1

    .line 237
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/widget/ToolTipView$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/widget/ToolTipView$3;-><init>(Lcom/shopkick/app/widget/ToolTipView;)V

    .line 238
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 253
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method protected useBlocker()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
