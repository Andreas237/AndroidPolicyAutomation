.class public abstract Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "FlexibleDividerDecoration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;,
        Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;
    }
.end annotation


# static fields
.field private static final ATTRS:[I


# instance fields
.field protected mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

.field protected mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

.field protected mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

.field private mPaint:Landroid/graphics/Paint;

.field protected mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

.field protected mPositionInsideItem:Z

.field protected mShowLastDivider:Z

.field protected mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

.field protected mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    .line 25
    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010214

    aput v2, v0, v1

    sput-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->ATTRS:[I

    return-void
.end method

.method protected constructor <init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V
    .locals 2

    .line 43
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 33
    sget-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    .line 44
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$000(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    sget-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->PAINT:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    .line 46
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$000(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    goto :goto_1

    .line 47
    :cond_0
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$100(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    sget-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->COLOR:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    .line 49
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$100(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    .line 50
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    .line 51
    invoke-direct {p0, p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->setSizeProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V

    goto :goto_1

    .line 53
    :cond_1
    sget-object v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->DRAWABLE:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    .line 54
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$200(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    move-result-object v0

    if-nez v0, :cond_2

    .line 55
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$300(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->ATTRS:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 57
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 58
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;

    invoke-direct {v0, p0, v1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$1;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    goto :goto_0

    .line 65
    :cond_2
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$200(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    .line 67
    :goto_0
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$400(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    .line 70
    :goto_1
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$500(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    move-result-object v0

    iput-object v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    .line 71
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$600(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mShowLastDivider:Z

    .line 72
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$700(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPositionInsideItem:Z

    return-void
.end method

.method private getGroupIndex(ILandroid/support/v7/widget/RecyclerView;)I
    .locals 1

    .line 231
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    .line 232
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/GridLayoutManager;

    .line 233
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanSizeLookup()Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object v0

    .line 234
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result p2

    .line 235
    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;->getSpanGroupIndex(II)I

    move-result p1

    return p1

    :cond_0
    return p1
.end method

.method private getLastDividerOffset(Landroid/support/v7/widget/RecyclerView;)I
    .locals 4

    .line 188
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/GridLayoutManager;

    if-eqz v0, :cond_1

    .line 189
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/GridLayoutManager;

    .line 190
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->getSpanSizeLookup()Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object v1

    .line 191
    invoke-virtual {v0}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result v0

    .line 192
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p1

    add-int/lit8 v2, p1, -0x1

    :goto_0
    if-ltz v2, :cond_1

    .line 194
    invoke-virtual {v1, v2, v0}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;->getSpanIndex(II)I

    move-result v3

    if-nez v3, :cond_0

    sub-int/2addr p1, v2

    return p1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private setSizeProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)V
    .locals 0

    .line 76
    invoke-static {p1}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;->access$400(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    .line 77
    iget-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    if-nez p1, :cond_0

    .line 78
    new-instance p1, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$2;

    invoke-direct {p1, p0}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$2;-><init>(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;)V

    iput-object p1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    :cond_0
    return-void
.end method

.method private wasDividerAlreadyDrawn(ILandroid/support/v7/widget/RecyclerView;)Z
    .locals 2

    .line 212
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    instance-of v0, v0, Landroid/support/v7/widget/GridLayoutManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 213
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/GridLayoutManager;

    .line 214
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanSizeLookup()Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;

    move-result-object v0

    .line 215
    invoke-virtual {p2}, Landroid/support/v7/widget/GridLayoutManager;->getSpanCount()I

    move-result p2

    .line 216
    invoke-virtual {v0, p1, p2}, Landroid/support/v7/widget/GridLayoutManager$SpanSizeLookup;->getSpanIndex(II)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method


# virtual methods
.method protected abstract getDividerBound(ILandroid/support/v7/widget/RecyclerView;Landroid/view/View;)Landroid/graphics/Rect;
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 2

    .line 145
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    .line 146
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p4

    invoke-virtual {p4}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p4

    .line 147
    invoke-direct {p0, p3}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->getLastDividerOffset(Landroid/support/v7/widget/RecyclerView;)I

    move-result v0

    .line 148
    iget-boolean v1, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mShowLastDivider:Z

    if-nez v1, :cond_0

    sub-int/2addr p4, v0

    if-lt p2, p4, :cond_0

    return-void

    .line 153
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->getGroupIndex(ILandroid/support/v7/widget/RecyclerView;)I

    move-result p2

    .line 154
    iget-object p4, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    invoke-interface {p4, p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;->shouldHideDivider(ILandroid/support/v7/widget/RecyclerView;)Z

    move-result p4

    if-eqz p4, :cond_1

    return-void

    .line 158
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->setItemOffsets(Landroid/graphics/Rect;ILandroid/support/v7/widget/RecyclerView;)V

    return-void
.end method

.method protected isReverseLayout(Landroid/support/v7/widget/RecyclerView;)Z
    .locals 1

    .line 168
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object p1

    .line 169
    instance-of v0, p1, Landroid/support/v7/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    .line 170
    check-cast p1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroid/support/v7/widget/LinearLayoutManager;->getReverseLayout()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onDraw(Landroid/graphics/Canvas;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 12

    .line 89
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p3

    if-nez p3, :cond_0

    return-void

    .line 94
    :cond_0
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p3

    .line 95
    invoke-direct {p0, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->getLastDividerOffset(Landroid/support/v7/widget/RecyclerView;)I

    move-result v0

    .line 96
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getChildCount()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 99
    invoke-virtual {p2, v3}, Landroid/support/v7/widget/RecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 100
    invoke-virtual {p2, v4}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v5

    if-ge v5, v2, :cond_1

    goto/16 :goto_2

    .line 108
    :cond_1
    iget-boolean v2, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mShowLastDivider:Z

    if-nez v2, :cond_2

    sub-int v2, p3, v0

    if-lt v5, v2, :cond_2

    goto/16 :goto_1

    .line 113
    :cond_2
    invoke-direct {p0, v5, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->wasDividerAlreadyDrawn(ILandroid/support/v7/widget/RecyclerView;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_1

    .line 118
    :cond_3
    invoke-direct {p0, v5, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->getGroupIndex(ILandroid/support/v7/widget/RecyclerView;)I

    move-result v2

    .line 119
    iget-object v6, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mVisibilityProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;

    invoke-interface {v6, v2, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;->shouldHideDivider(ILandroid/support/v7/widget/RecyclerView;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    .line 123
    :cond_4
    invoke-virtual {p0, v2, p2, v4}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->getDividerBound(ILandroid/support/v7/widget/RecyclerView;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v4

    .line 124
    sget-object v6, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$3;->$SwitchMap$com$yqritc$recyclerviewflexibledivider$FlexibleDividerDecoration$DividerType:[I

    iget-object v7, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDividerType:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;

    invoke-virtual {v7}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DividerType;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    goto :goto_1

    .line 135
    :pswitch_0
    iget-object v6, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    iget-object v7, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mColorProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;

    invoke-interface {v7, v2, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$ColorProvider;->dividerColor(ILandroid/support/v7/widget/RecyclerView;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 136
    iget-object v6, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    iget-object v7, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mSizeProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;

    invoke-interface {v7, v2, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$SizeProvider;->dividerSize(ILandroid/support/v7/widget/RecyclerView;)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 137
    iget v2, v4, Landroid/graphics/Rect;->left:I

    int-to-float v7, v2

    iget v2, v4, Landroid/graphics/Rect;->top:I

    int-to-float v8, v2

    iget v2, v4, Landroid/graphics/Rect;->right:I

    int-to-float v9, v2

    iget v2, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v10, v2

    iget-object v11, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 131
    :pswitch_1
    iget-object v6, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaintProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;

    invoke-interface {v6, v2, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$PaintProvider;->dividerPaint(ILandroid/support/v7/widget/RecyclerView;)Landroid/graphics/Paint;

    move-result-object v2

    iput-object v2, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    .line 132
    iget v2, v4, Landroid/graphics/Rect;->left:I

    int-to-float v7, v2

    iget v2, v4, Landroid/graphics/Rect;->top:I

    int-to-float v8, v2

    iget v2, v4, Landroid/graphics/Rect;->right:I

    int-to-float v9, v2

    iget v2, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v10, v2

    iget-object v11, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 126
    :pswitch_2
    iget-object v6, p0, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration;->mDrawableProvider:Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;

    invoke-interface {v6, v2, p2}, Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$DrawableProvider;->drawableProvider(ILandroid/support/v7/widget/RecyclerView;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 127
    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 128
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :goto_1
    move v2, v5

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected abstract setItemOffsets(Landroid/graphics/Rect;ILandroid/support/v7/widget/RecyclerView;)V
.end method
