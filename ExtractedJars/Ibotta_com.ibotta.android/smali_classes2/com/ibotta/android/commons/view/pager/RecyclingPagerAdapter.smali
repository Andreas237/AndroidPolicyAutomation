.class public abstract Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "RecyclingPagerAdapter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u0015\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;",
        "Landroid/support/v4/view/PagerAdapter;",
        "recycleBin",
        "Lcom/ibotta/android/commons/view/pager/RecycleBin;",
        "(Lcom/ibotta/android/commons/view/pager/RecycleBin;)V",
        "viewTypeCount",
        "",
        "destroyItem",
        "",
        "container",
        "Landroid/view/ViewGroup;",
        "position",
        "object",
        "",
        "getView",
        "Landroid/view/View;",
        "convertView",
        "instantiateItem",
        "isViewFromObject",
        "",
        "view",
        "notifyDataSetChanged",
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
.field private final recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

.field private final viewTypeCount:I


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;-><init>(Lcom/ibotta/android/commons/view/pager/RecycleBin;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/commons/view/pager/RecycleBin;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/commons/view/pager/RecycleBin;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "recycleBin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

    const/4 p1, 0x1

    .line 42
    iput p1, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->viewTypeCount:I

    .line 45
    iget-object p1, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

    iget v0, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->viewTypeCount:I

    invoke-virtual {p1, v0}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->setViewTypeCount(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/ibotta/android/commons/view/pager/RecycleBin;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 23
    new-instance p1, Lcom/ibotta/android/commons/view/pager/RecycleBin;

    invoke-direct {p1}, Lcom/ibotta/android/commons/view/pager/RecycleBin;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;-><init>(Lcom/ibotta/android/commons/view/pager/RecycleBin;)V

    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "object"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    check-cast p3, Landroid/view/View;

    .line 61
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->addScrapView$ibotta_commons_release(Landroid/view/View;II)V

    return-void
.end method

.method public abstract getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->getScrapView$ibotta_commons_release(II)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p2, v0, p1}, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "object"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/RecyclingPagerAdapter;->recycleBin:Lcom/ibotta/android/commons/view/pager/RecycleBin;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/view/pager/RecycleBin;->scrapActiveViews$ibotta_commons_release()V

    .line 50
    invoke-super {p0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    return-void
.end method
