.class public final Lcom/ibotta/android/commons/view/pager/RecycleBin;
.super Ljava/lang/Object;
.source "RecycleBin.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u0016J\u0008\u0010\u0017\u001a\u00020\u0010H\u0002J \u0010\u0018\u001a\u0004\u0018\u00010\u00072\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\r\u0010\u0019\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\u0008\u001aJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0012\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/pager/RecycleBin;",
        "",
        "()V",
        "activeViewTypes",
        "",
        "activeViews",
        "",
        "Landroid/view/View;",
        "[Landroid/view/View;",
        "currentScrapViews",
        "Landroid/util/SparseArray;",
        "scrapViews",
        "[Landroid/util/SparseArray;",
        "viewTypeCount",
        "",
        "addScrapView",
        "",
        "scrap",
        "position",
        "viewType",
        "addScrapView$ibotta_commons_release",
        "getScrapView",
        "getScrapView$ibotta_commons_release",
        "pruneScrapViews",
        "retrieveFromScrap",
        "scrapActiveViews",
        "scrapActiveViews$ibotta_commons_release",
        "setViewTypeCount",
        "shouldRecycleViewType",
        "",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final activeViewTypes:[I

.field private final activeViews:[Landroid/view/View;

.field private currentScrapViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private scrapViews:[Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private viewTypeCount:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    new-array v1, v0, [Landroid/view/View;

    iput-object v1, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->activeViews:[Landroid/view/View;

    .line 36
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->activeViewTypes:[I

    return-void
.end method

.method private final pruneScrapViews()V
    .locals 10

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->activeViews:[Landroid/view/View;

    array-length v0, v0

    .line 127
    iget v1, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->viewTypeCount:I

    .line 128
    iget-object v2, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    if-nez v2, :cond_0

    .line 130
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    aget-object v5, v2, v4

    if-nez v5, :cond_1

    .line 131
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v6

    sub-int v7, v6, v0

    add-int/lit8 v6, v6, -0x1

    move v8, v6

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v7, :cond_2

    add-int/lit8 v9, v8, -0x1

    .line 136
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v6, v6, 0x1

    move v8, v9

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final retrieveFromScrap(Landroid/util/SparseArray;I)Landroid/view/View;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;I)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 143
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 147
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 148
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-ne v2, p2, :cond_0

    .line 150
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    return-object v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 155
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    .line 157
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    return-object p2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final shouldRecycleViewType(I)Z
    .locals 0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final addScrapView$ibotta_commons_release(Landroid/view/View;II)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "scrap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->viewTypeCount:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 79
    iget-object p3, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->currentScrapViews:Landroid/util/SparseArray;

    if-nez p3, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-virtual {p3, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    aget-object p3, v0, p3

    if-eqz p3, :cond_3

    invoke-virtual {p3, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_3
    :goto_0
    const/4 p2, 0x0

    .line 85
    invoke-virtual {p1, p2}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public final getScrapView$ibotta_commons_release(II)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 64
    iget v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->viewTypeCount:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 65
    iget-object p2, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->currentScrapViews:Landroid/util/SparseArray;

    if-nez p2, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->retrieveFromScrap(Landroid/util/SparseArray;I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-ltz p2, :cond_5

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    array-length v0, v0

    if-ge p2, v0, :cond_5

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    if-nez v0, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    aget-object p2, v0, p2

    if-nez p2, :cond_4

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_4
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->retrieveFromScrap(Landroid/util/SparseArray;I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final scrapActiveViews$ibotta_commons_release()V
    .locals 9

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->activeViews:[Landroid/view/View;

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->activeViewTypes:[I

    .line 92
    iget v2, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->viewTypeCount:I

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 94
    :goto_0
    iget-object v4, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->currentScrapViews:Landroid/util/SparseArray;

    .line 95
    array-length v5, v0

    sub-int/2addr v5, v3

    :goto_1
    if-ltz v5, :cond_6

    .line 97
    aget-object v3, v0, v5

    if-eqz v3, :cond_5

    .line 99
    aget v6, v1, v5

    const/4 v7, 0x0

    .line 101
    move-object v8, v7

    check-cast v8, Landroid/view/View;

    aput-object v8, v0, v5

    const/4 v8, -0x1

    .line 102
    aput v8, v1, v5

    .line 104
    invoke-direct {p0, v6}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->shouldRecycleViewType(I)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v2, :cond_3

    .line 109
    iget-object v4, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    if-nez v4, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    aget-object v4, v4, v6

    :cond_3
    if-nez v4, :cond_4

    .line 111
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_4
    invoke-virtual {v4, v5, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 114
    invoke-virtual {v3, v7}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    :cond_5
    :goto_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 118
    :cond_6
    invoke-direct {p0}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->pruneScrapViews()V

    return-void
.end method

.method public final setViewTypeCount(I)V
    .locals 4

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    .line 50
    new-array v0, p1, [Landroid/util/SparseArray;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 52
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 54
    :cond_0
    iput p1, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->viewTypeCount:I

    .line 55
    aget-object p1, v0, v1

    iput-object p1, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->currentScrapViews:Landroid/util/SparseArray;

    .line 56
    iput-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapViews:[Landroid/util/SparseArray;

    return-void

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can\'t have a viewTypeCount < 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method
