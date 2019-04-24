.class public final Lcom/ibotta/android/views/list/IbottaListViewDecorator;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "IbottaListViewDecorator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListViewDecorator;",
        "Landroid/support/v7/widget/RecyclerView$ItemDecoration;",
        "spanCount",
        "",
        "spacing",
        "(II)V",
        "getItemOffsets",
        "",
        "outRect",
        "Landroid/graphics/Rect;",
        "view",
        "Landroid/view/View;",
        "parent",
        "Landroid/support/v7/widget/RecyclerView;",
        "state",
        "Landroid/support/v7/widget/RecyclerView$State;",
        "initBottomSpacing",
        "initGridRLSpacing",
        "column",
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
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    iput p1, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spanCount:I

    iput p2, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spacing:I

    return-void
.end method

.method private final initBottomSpacing(Landroid/graphics/Rect;)V
    .locals 2

    .line 19
    iget v0, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spacing:I

    div-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method private final initGridRLSpacing(Landroid/graphics/Rect;I)V
    .locals 3

    .line 23
    iget v0, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spacing:I

    mul-int v1, p2, v0

    iget v2, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spanCount:I

    div-int/2addr v1, v2

    sub-int v1, v0, v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p2, p2, 0x1

    mul-int p2, p2, v0

    .line 24
    div-int/2addr p2, v2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/support/v7/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/support/v7/widget/RecyclerView$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->initBottomSpacing(Landroid/graphics/Rect;)V

    .line 15
    iget p3, p0, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->spanCount:I

    rem-int/2addr p2, p3

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewDecorator;->initGridRLSpacing(Landroid/graphics/Rect;I)V

    return-void
.end method
