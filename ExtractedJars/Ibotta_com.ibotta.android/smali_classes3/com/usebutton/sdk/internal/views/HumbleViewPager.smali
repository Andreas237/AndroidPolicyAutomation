.class public Lcom/usebutton/sdk/internal/views/HumbleViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "HumbleViewPager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "HumbleViewPager"


# instance fields
.field private mCanScroll:Z

.field private mCanScrollOverride:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScroll:Z

    .line 41
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScrollOverride:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScroll:Z

    .line 41
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScrollOverride:Z

    return-void
.end method

.method private static ensureDecorViewIfStrip(Landroid/view/View;)V
    .locals 2

    .line 74
    instance-of v0, p0, Landroid/support/v4/view/PagerTabStrip;

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/support/v4/view/PagerTitleStrip;

    if-nez v0, :cond_0

    return-void

    .line 77
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    if-nez p0, :cond_1

    return-void

    .line 83
    :cond_1
    :try_start_0
    const-class v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    const-string v1, "isDecor"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "HumbleViewPager"

    const-string v0, "Not able to set isDecor = true"

    .line 89
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :catch_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 53
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->ensureDecorViewIfStrip(Landroid/view/View;)V

    return-void
.end method

.method protected addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 59
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    move-result p2

    .line 60
    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->ensureDecorViewIfStrip(Landroid/view/View;)V

    return p2
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 157
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScrollOverride:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScroll:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected onMeasure(II)V
    .locals 13
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    const/high16 v0, -0x80000000

    .line 96
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-super {p0, p1, v1}, Landroid/support/v4/view/ViewPager;->onMeasure(II)V

    const/4 v1, 0x0

    .line 97
    invoke-static {v1, p2}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getDefaultSize(II)I

    move-result p2

    .line 99
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 105
    sget v4, Lcom/usebutton/sdk/R$id;->promo_pager_title:I

    invoke-virtual {p0, v4}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "HumbleViewPager"

    const-string v6, "@%s onMeasure %s"

    const/4 v7, 0x2

    .line 106
    new-array v8, v7, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v1

    const/4 v9, 0x1

    aput-object v4, v8, v9

    invoke-static {v5, v6, v8}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v4, :cond_0

    .line 107
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v6, 0x8

    if-eq v5, v6, :cond_0

    add-int/lit8 v5, p2, 0x0

    .line 108
    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v4, v2, v5}, Landroid/view/View;->measure(II)V

    .line 109
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const v5, 0x7fffffff

    const/4 v5, 0x0

    const v6, 0x7fffffff

    .line 113
    :goto_1
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getChildCount()I

    move-result v8

    if-ge v5, v8, :cond_2

    .line 114
    invoke-virtual {p0, v5}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 115
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v10

    sget v11, Lcom/usebutton/sdk/R$id;->group_items_scroller:I

    if-eq v10, v11, :cond_1

    goto :goto_2

    :cond_1
    sub-int v10, p2, v4

    .line 117
    invoke-static {v10, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    invoke-virtual {v8, v2, v10}, Landroid/view/View;->measure(II)V

    .line 118
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v4, v6

    const/4 v0, 0x0

    .line 123
    :goto_3
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getChildCount()I

    move-result v5

    if-ge v0, v5, :cond_4

    .line 124
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 125
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    sget v10, Lcom/usebutton/sdk/R$id;->group_items_scroller:I

    if-eq v8, v10, :cond_3

    goto :goto_4

    .line 127
    :cond_3
    invoke-static {v6, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-virtual {v5, v2, v8}, Landroid/view/View;->measure(II)V

    const-string v8, "HumbleViewPager"

    const-string v10, "Set scroller (%d) to: %d height"

    .line 128
    new-array v11, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v11, v1

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v11, v9

    invoke-static {v8, v10, v11}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 131
    :cond_4
    invoke-static {v4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 133
    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 138
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScrollOverride:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScroll:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 5

    const-string v0, "HumbleViewPager"

    const-string v1, "@%s Removing %s"

    const/4 v2, 0x2

    .line 166
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->onViewRemoved(Landroid/view/View;)V

    return-void
.end method

.method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
    .locals 4

    .line 143
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 146
    :goto_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    if-ge v0, v2, :cond_1

    .line 147
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v2

    add-float/2addr v1, v2

    cmpl-float v2, v1, v3

    if-lez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    cmpl-float v0, v1, v3

    if-lez v0, :cond_2

    const/4 p1, 0x1

    .line 152
    :cond_2
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScroll:Z

    return-void
.end method

.method public setCanScroll(Z)V
    .locals 0

    .line 161
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->mCanScrollOverride:Z

    return-void
.end method
