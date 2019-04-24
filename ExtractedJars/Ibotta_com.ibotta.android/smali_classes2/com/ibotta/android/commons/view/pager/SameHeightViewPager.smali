.class public final Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;
.super Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;
.source "SameHeightViewPager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0008H\u0014\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;",
        "Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "measureHeight",
        "",
        "measureSpec",
        "view",
        "Landroid/view/View;",
        "onMeasure",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 16
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final measureHeight(ILandroid/view/View;)I
    .locals 2

    .line 50
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 51
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 58
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_2

    .line 61
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_1

    :cond_2
    move p1, p2

    :goto_1
    return p1
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 6

    .line 20
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->onMeasure(II)V

    const/4 v0, 0x0

    .line 22
    check-cast v0, Landroid/view/View;

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 27
    invoke-virtual {p0, v2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 28
    invoke-virtual {v4, p1, p2}, Landroid/view/View;->measure(II)V

    .line 30
    :cond_0
    invoke-direct {p0, p2, v4}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->measureHeight(ILandroid/view/View;)I

    move-result v5

    if-le v5, v3, :cond_1

    move-object v0, v4

    move v3, v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->getMeasuredWidth()I

    move-result p1

    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->measureHeight(ILandroid/view/View;)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/commons/view/pager/SameHeightViewPager;->setMeasuredDimension(II)V

    return-void
.end method
