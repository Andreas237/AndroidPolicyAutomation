.class public final Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;
.super Landroid/view/View;
.source "CirclePageIndicator.kt"

# interfaces
.implements Lcom/ibotta/android/views/viewpagerindicator/PageIndicator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCirclePageIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CirclePageIndicator.kt\ncom/ibotta/android/views/viewpagerindicator/CirclePageIndicator\n*L\n1#1,460:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001UB%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0010\u00106\u001a\u00020\u00082\u0006\u00107\u001a\u00020\u0008H\u0002J\u0010\u00108\u001a\u00020\u00082\u0006\u00107\u001a\u00020\u0008H\u0002J\u0008\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=H\u0014J\u0018\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00082\u0006\u0010@\u001a\u00020\u0008H\u0014J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020\u0008H\u0016J \u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020\u00082\u0006\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u0008H\u0016J\u0010\u0010G\u001a\u00020:2\u0006\u0010D\u001a\u00020\u0008H\u0016J\u0010\u0010H\u001a\u00020:2\u0006\u0010B\u001a\u00020IH\u0016J\n\u0010J\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020:2\u0006\u0010O\u001a\u00020\u0008H\u0016J\u0010\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020\u0017H\u0016J\u0010\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020$H\u0016J\u0018\u0010R\u001a\u00020:2\u0006\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020\u0008H\u0016R$\u0010\n\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\u00082\u0006\u0010%\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\u000c\"\u0004\u0008\'\u0010\u000eR$\u0010(\u001a\u00020\u00082\u0006\u0010(\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010\u000c\"\u0004\u0008*\u0010\u000eR$\u0010+\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00158F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R$\u00100\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00081\u0010\u000c\"\u0004\u00082\u0010\u000eR$\u00103\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00158F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00084\u0010-\"\u0004\u00085\u0010/\u00a8\u0006V"
    }
    d2 = {
        "Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;",
        "Landroid/view/View;",
        "Lcom/ibotta/android/views/viewpagerindicator/PageIndicator;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "fillColor",
        "getFillColor",
        "()I",
        "setFillColor",
        "(I)V",
        "mActivePointerId",
        "mCentered",
        "",
        "mCurrentPage",
        "mIsDragging",
        "mLastMotionX",
        "",
        "mListener",
        "Landroid/support/v4/view/ViewPager$OnPageChangeListener;",
        "mOrientation",
        "mPageOffset",
        "mPaintFill",
        "Landroid/graphics/Paint;",
        "mPaintPageFill",
        "mPaintStroke",
        "mRadius",
        "mScrollState",
        "mSnap",
        "mSnapPage",
        "mTouchSlop",
        "mViewPager",
        "Landroid/support/v4/view/ViewPager;",
        "orientation",
        "getOrientation",
        "setOrientation",
        "pageColor",
        "getPageColor",
        "setPageColor",
        "radius",
        "getRadius",
        "()F",
        "setRadius",
        "(F)V",
        "strokeColor",
        "getStrokeColor",
        "setStrokeColor",
        "strokeWidth",
        "getStrokeWidth",
        "setStrokeWidth",
        "measureLong",
        "measureSpec",
        "measureShort",
        "notifyDataSetChanged",
        "",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onPageScrollStateChanged",
        "state",
        "onPageScrolled",
        "position",
        "positionOffset",
        "positionOffsetPixels",
        "onPageSelected",
        "onRestoreInstanceState",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "onTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "setCurrentItem",
        "item",
        "setOnPageChangeListener",
        "listener",
        "setViewPager",
        "view",
        "initialPosition",
        "SavedState",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private mActivePointerId:I

.field private mCentered:Z

.field private mCurrentPage:I

.field private mIsDragging:Z

.field private mLastMotionX:F

.field private mListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mOrientation:I

.field private mPageOffset:F

.field private final mPaintFill:Landroid/graphics/Paint;

.field private final mPaintPageFill:Landroid/graphics/Paint;

.field private final mPaintStroke:Landroid/graphics/Paint;

.field private mRadius:F

.field private mScrollState:I

.field private mSnap:Z

.field private mSnapPage:I

.field private mTouchSlop:I

.field private mViewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
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

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10
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

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    .line 52
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    .line 53
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    const/high16 v0, -0x40800000    # -1.0f

    .line 65
    iput v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    const/4 v0, -0x1

    .line 66
    iput v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 120
    sget v1, Lcom/ibotta/views/R$color;->default_circle_indicator_page_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 121
    sget v2, Lcom/ibotta/views/R$color;->default_circle_indicator_fill_color:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 122
    sget v3, Lcom/ibotta/views/R$integer;->default_circle_indicator_orientation:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v3

    .line 123
    sget v4, Lcom/ibotta/views/R$color;->default_circle_indicator_stroke_color:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 124
    sget v5, Lcom/ibotta/views/R$dimen;->default_circle_indicator_stroke_width:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 125
    sget v6, Lcom/ibotta/views/R$dimen;->default_circle_indicator_radius:I

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 126
    sget v7, Lcom/ibotta/views/R$bool;->default_circle_indicator_centered:I

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v7

    .line 127
    sget v8, Lcom/ibotta/views/R$bool;->default_circle_indicator_snap:I

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    .line 130
    sget-object v8, Lcom/ibotta/views/R$styleable;->CirclePageIndicator:[I

    const/4 v9, 0x0

    invoke-virtual {p1, p2, v8, p3, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 132
    sget p3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_centered:I

    invoke-virtual {p2, p3, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCentered:Z

    .line 133
    sget p3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_android_orientation:I

    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    .line 134
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 135
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    sget v3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_pageColor:I

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 137
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    sget v1, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_strokeColor:I

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 138
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    sget v1, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_strokeWidth:I

    invoke-virtual {p2, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 140
    iget-object p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    sget v1, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_fillColor:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 141
    sget p3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_radius:I

    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    iput p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    .line 142
    sget p3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_snap:I

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnap:Z

    .line 144
    sget p3, Lcom/ibotta/views/R$styleable;->CirclePageIndicator_android_background:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 145
    invoke-virtual {p0, p3}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 147
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 149
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 150
    invoke-static {p1}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mTouchSlop:I

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 46
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 47
    sget p3, Lcom/ibotta/views/R$attr;->vpiCirclePageIndicatorStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final measureLong(I)I
    .locals 5

    .line 394
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 395
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_3

    .line 397
    iget-object v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    .line 402
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 403
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingRight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    int-to-float v3, v1

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v3, v3, v4

    iget v4, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    mul-float v3, v3, v4

    add-float/2addr v2, v3

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    mul-float v1, v1, v4

    add-float/2addr v2, v1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v2, v1

    float-to-int v1, v2

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_2

    .line 406
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_1

    :cond_2
    move p1, v1

    :cond_3
    :goto_1
    return p1
.end method

.method private final measureShort(I)I
    .locals 4

    .line 420
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 421
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    int-to-float v1, v1

    .line 428
    iget v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    mul-float v1, v1, v2

    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingBottom()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    add-float/2addr v1, v2

    float-to-int v1, v1

    const/high16 v2, -0x80000000

    if-ne v0, v2, :cond_1

    .line 431
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    return p1
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final getFillColor()I
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public final getOrientation()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    return v0
.end method

.method public final getPageColor()I
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public final getRadius()F
    .locals 1

    .line 109
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    return v0
.end method

.method public final getStrokeColor()I
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public final getStrokeWidth()F
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method public notifyDataSetChanged()V
    .locals 0

    .line 343
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 11
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 161
    :cond_1
    iget v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    if-lt v2, v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    .line 162
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setCurrentItem(I)V

    return-void

    .line 171
    :cond_2
    iget v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    if-nez v2, :cond_3

    .line 172
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getWidth()I

    move-result v2

    .line 173
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v3

    .line 174
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingRight()I

    move-result v4

    .line 175
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v5

    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getHeight()I

    move-result v2

    .line 178
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingTop()I

    move-result v3

    .line 179
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingBottom()I

    move-result v4

    .line 180
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getPaddingLeft()I

    move-result v5

    .line 183
    :goto_1
    iget v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    const/4 v7, 0x3

    int-to-float v7, v7

    mul-float v7, v7, v6

    int-to-float v5, v5

    add-float/2addr v5, v6

    int-to-float v8, v3

    add-float/2addr v8, v6

    .line 186
    iget-boolean v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCentered:Z

    const/high16 v9, 0x40000000    # 2.0f

    if-eqz v6, :cond_4

    sub-int/2addr v2, v3

    sub-int/2addr v2, v4

    int-to-float v2, v2

    div-float/2addr v2, v9

    int-to-float v3, v0

    mul-float v3, v3, v7

    div-float/2addr v3, v9

    sub-float/2addr v2, v3

    add-float/2addr v8, v2

    .line 193
    :cond_4
    iget v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    .line 194
    iget-object v3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    int-to-float v4, v1

    cmpl-float v3, v3, v4

    if-lez v3, :cond_5

    .line 195
    iget-object v3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    div-float/2addr v3, v9

    sub-float/2addr v2, v3

    :cond_5
    :goto_2
    if-ge v1, v0, :cond_9

    int-to-float v3, v1

    mul-float v3, v3, v7

    add-float/2addr v3, v8

    .line 201
    iget v4, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    if-nez v4, :cond_6

    move v4, v5

    goto :goto_3

    :cond_6
    move v4, v3

    move v3, v5

    .line 209
    :goto_3
    iget-object v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    if-lez v6, :cond_7

    .line 210
    iget-object v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v2, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 214
    :cond_7
    iget v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    cmpg-float v9, v2, v6

    if-eqz v9, :cond_8

    .line 215
    iget-object v9, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v6, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 220
    :cond_9
    iget-boolean v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnap:Z

    if-eqz v0, :cond_a

    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnapPage:I

    goto :goto_4

    :cond_a
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    :goto_4
    int-to-float v0, v0

    mul-float v0, v0, v7

    .line 222
    iget-boolean v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnap:Z

    if-nez v1, :cond_b

    .line 223
    iget v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPageOffset:F

    mul-float v1, v1, v7

    add-float/2addr v0, v1

    .line 225
    :cond_b
    iget v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    if-nez v1, :cond_c

    add-float/2addr v0, v8

    goto :goto_5

    :cond_c
    add-float/2addr v0, v8

    move v10, v5

    move v5, v0

    move v0, v10

    .line 232
    :goto_5
    iget v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    iget-object v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v5, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 378
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    if-nez v0, :cond_0

    .line 379
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->measureLong(I)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->measureShort(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setMeasuredDimension(II)V

    goto :goto_0

    .line 381
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->measureShort(I)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->measureLong(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setMeasuredDimension(II)V

    :goto_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 1

    .line 346
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mScrollState:I

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 351
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    .line 352
    iput p2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPageOffset:F

    .line 353
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 359
    iget-boolean v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnap:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mScrollState:I

    if-nez v0, :cond_1

    .line 360
    :cond_0
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    .line 361
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnapPage:I

    .line 362
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    .line 365
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    :cond_2
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1
    .param p1    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    check-cast p1, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;

    .line 439
    invoke-virtual {p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 440
    invoke-virtual {p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;->getCurrentPage()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    .line 441
    invoke-virtual {p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;->getCurrentPage()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mSnapPage:I

    .line 442
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 446
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 447
    new-instance v1, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;

    invoke-direct {v1, v0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 448
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    invoke-virtual {v1, v0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator$SavedState;->setCurrentPage(I)V

    .line 449
    check-cast v1, Landroid/os/Parcelable;

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x0

    if-eqz v0, :cond_10

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto/16 :goto_2

    .line 243
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 302
    :pswitch_1
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 303
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v3

    .line 304
    iget v4, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    if-ne v3, v4, :cond_4

    if-nez v0, :cond_3

    const/4 v2, 0x1

    .line 306
    :cond_3
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    .line 308
    :cond_4
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result p1

    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    goto/16 :goto_1

    .line 296
    :pswitch_2
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v0

    .line 297
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v2

    iput v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    .line 298
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    goto/16 :goto_1

    .line 252
    :pswitch_3
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v0

    .line 253
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result p1

    .line 254
    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    sub-float v0, p1, v0

    .line 256
    iget-boolean v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mIsDragging:Z

    if-nez v2, :cond_5

    .line 257
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    iget v3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mTouchSlop:I

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_5

    .line 258
    iput-boolean v1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mIsDragging:Z

    .line 262
    :cond_5
    iget-boolean v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mIsDragging:Z

    if-eqz v2, :cond_f

    .line 263
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    .line 264
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-nez p1, :cond_6

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_6
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->isFakeDragging()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-nez p1, :cond_7

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_7
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->beginFakeDrag()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 265
    :cond_8
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_f

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->fakeDragBy(F)V

    goto/16 :goto_1

    .line 271
    :pswitch_4
    iget-boolean v3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mIsDragging:Z

    if-nez v3, :cond_e

    .line 272
    iget-object v3, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-nez v3, :cond_9

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_9
    invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v3

    if-nez v3, :cond_a

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_a
    const-string v4, "mViewPager!!.adapter!!"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    .line 273
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v5, v4, v5

    const/high16 v6, 0x40c00000    # 6.0f

    div-float/2addr v4, v6

    .line 277
    iget v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    const/4 v7, 0x3

    if-lez v6, :cond_c

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    sub-float v8, v5, v4

    cmpg-float v6, v6, v8

    if-gez v6, :cond_c

    if-eq v0, v7, :cond_b

    .line 279
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_b

    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    sub-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_b
    return v1

    .line 282
    :cond_c
    iget v6, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    sub-int/2addr v3, v1

    if-ge v6, v3, :cond_e

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    add-float/2addr v5, v4

    cmpl-float p1, p1, v5

    if-lez p1, :cond_e

    if-eq v0, v7, :cond_d

    .line 284
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_d

    iget v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    add-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    :cond_d
    return v1

    .line 290
    :cond_e
    iput-boolean v2, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mIsDragging:Z

    const/4 p1, -0x1

    .line 291
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->isFakeDragging()Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->endFakeDrag()V

    goto :goto_1

    .line 247
    :pswitch_5
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mActivePointerId:I

    .line 248
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mLastMotionX:F

    :cond_f
    :goto_1
    return v1

    :cond_10
    :goto_2
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    .line 338
    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 339
    :cond_0
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mCurrentPage:I

    .line 340
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void

    .line 336
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager has not been bound."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final setFillColor(I)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintFill:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 1
    .param p1    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    iput-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public final setOrientation(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 91
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Orientation must be either HORIZONTAL or VERTICAL."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 87
    :pswitch_0
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mOrientation:I

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->requestLayout()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final setPageColor(I)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintPageFill:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method public final setRadius(F)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mRadius:F

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method public final setStrokeColor(I)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method public final setStrokeWidth(F)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mPaintStroke:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 2
    .param p1    # Landroid/support/v4/view/ViewPager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 318
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 320
    :cond_1
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 324
    iput-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 325
    iget-object p1, p0, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->mViewPager:Landroid/support/v4/view/ViewPager;

    if-eqz p1, :cond_2

    move-object v0, p0

    check-cast v0, Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 326
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->invalidate()V

    return-void

    .line 321
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager does not have adapter instance."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;I)V
    .locals 1
    .param p1    # Landroid/support/v4/view/ViewPager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setViewPager(Landroid/support/v4/view/ViewPager;)V

    .line 331
    invoke-virtual {p0, p2}, Lcom/ibotta/android/views/viewpagerindicator/CirclePageIndicator;->setCurrentItem(I)V

    return-void
.end method
