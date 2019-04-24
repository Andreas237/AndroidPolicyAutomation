.class public Lo/bwc;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/support/v4/widget/ViewDragHelper;

.field private c:Lo/bwb;

.field private d:I

.field private e:Lo/bwf;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-direct {p0, p1}, Lo/bwc;->b(Landroid/content/Context;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-direct {p0, p1}, Lo/bwc;->b(Landroid/content/Context;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    invoke-direct {p0, p1}, Lo/bwc;->b(Landroid/content/Context;)V

    .line 43
    return-void
.end method

.method static synthetic a(Lo/bwc;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bwc;->b:Landroid/support/v4/widget/ViewDragHelper;

    return-object v0
.end method

.method static synthetic b(Lo/bwc;)I
    .locals 1

    .line 22
    iget v0, p0, Lo/bwc;->d:I

    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 6

    .line 46
    new-instance v0, Lo/bwb;

    invoke-direct {v0, p1}, Lo/bwb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bwc;->c:Lo/bwb;

    .line 47
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {p0, v0}, Lo/bwc;->addView(Landroid/view/View;)V

    .line 48
    invoke-virtual {p0}, Lo/bwc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_locktext_padleft:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v3, v0

    .line 49
    invoke-virtual {p0}, Lo/bwc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_locktext_padbutton:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v4, v0

    .line 50
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v0}, Lo/bwb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 51
    const/16 v0, 0xe

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 52
    const/16 v0, 0xc

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 53
    iput v3, v5, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 54
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {p0}, Lo/bwc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_finess_hdjs:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwb;->setText(Ljava/lang/CharSequence;)V

    .line 55
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    const/high16 v1, 0x43480000    # 200.0f

    invoke-static {p1, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x43480000    # 200.0f

    invoke-static {p1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v3, v2, v4}, Lo/bwb;->setPadding(IIII)V

    .line 56
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {p0}, Lo/bwc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$dimen;->sug_locktext_size:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/bwb;->setTextSize(IF)V

    .line 57
    return-void
.end method

.method static synthetic d(Lo/bwc;)Landroid/graphics/Point;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bwc;->a:Landroid/graphics/Point;

    return-object v0
.end method

.method static synthetic e(Lo/bwc;)Lo/bwb;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    return-object v0
.end method


# virtual methods
.method public a(Lo/bwf;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/bwc;->e:Lo/bwf;

    .line 144
    return-void
.end method

.method public computeScroll()V
    .locals 6

    .line 126
    iget-object v0, p0, Lo/bwc;->b:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {p0}, Lo/bwc;->postInvalidate()V

    .line 129
    invoke-virtual {p0}, Lo/bwc;->getPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getPaddingLeft()I

    move-result v1

    sub-int v3, v0, v1

    .line 130
    invoke-virtual {p0}, Lo/bwc;->getWidth()I

    move-result v0

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getPaddingRight()I

    move-result v1

    add-int v4, v0, v1

    .line 131
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v0}, Lo/bwb;->getLeft()I

    move-result v0

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 132
    iget-object v0, p0, Lo/bwc;->a:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    sub-int v0, v5, v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/bwc;->a:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    invoke-virtual {p0, v0}, Lo/bwc;->setAlpha(F)V

    .line 133
    iget-object v0, p0, Lo/bwc;->e:Lo/bwf;

    if-eqz v0, :cond_1

    .line 134
    iget-object v0, p0, Lo/bwc;->e:Lo/bwf;

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-interface {v0, v1}, Lo/bwf;->a(F)V

    .line 135
    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v0}, Lo/bwb;->getLeft()I

    move-result v0

    iget v1, p0, Lo/bwc;->d:I

    iget-object v2, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v2}, Lo/bwb;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v2}, Lo/bwb;->getPaddingLeft()I

    move-result v2

    add-int/2addr v1, v2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v0}, Lo/bwb;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getPaddingLeft()I

    move-result v1

    neg-int v1, v1

    if-ne v0, v1, :cond_1

    .line 136
    :cond_0
    iget-object v0, p0, Lo/bwc;->e:Lo/bwf;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/bwf;->c(Z)V

    .line 140
    :cond_1
    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 61
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 62
    new-instance v0, Lo/bwc$1;

    invoke-direct {v0, p0}, Lo/bwc$1;-><init>(Lo/bwc;)V

    invoke-static {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iput-object v0, p0, Lo/bwc;->b:Landroid/support/v4/widget/ViewDragHelper;

    .line 98
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 115
    iget-object v0, p0, Lo/bwc;->b:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .line 108
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    .line 109
    new-instance v0, Landroid/graphics/Point;

    iget-object v1, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v1}, Lo/bwb;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo/bwc;->c:Lo/bwb;

    invoke-virtual {v2}, Lo/bwb;->getTop()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lo/bwc;->a:Landroid/graphics/Point;

    .line 110
    const-string v0, "LockScreenView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAutoBackPoint.x:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/bwc;->a:Landroid/graphics/Point;

    iget v3, v3, Landroid/graphics/Point;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 102
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 103
    iput p1, p0, Lo/bwc;->d:I

    .line 104
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 120
    iget-object v0, p0, Lo/bwc;->b:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    .line 121
    const/4 v0, 0x1

    return v0
.end method

.method public setVisibility(I)V
    .locals 1

    .line 148
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 149
    if-nez p1, :cond_0

    .line 150
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/bwc;->setAlpha(F)V

    .line 152
    :cond_0
    return-void
.end method
