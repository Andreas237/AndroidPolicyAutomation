.class public Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder_ViewBinding;
.super Ljava/lang/Object;
.source "CategoryGalleryPagerAdapter$ViewHolder_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;

    const-string v0, "field \'rplvRetailerList\'"

    .line 23
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f0903d2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    const-string v0, "field \'rplvFastBubbleScroller\'"

    .line 24
    const-class v1, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    const v2, 0x7f0903d1

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;

    .line 34
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvRetailerList:Lcom/ibotta/android/views/list/IbottaListView;

    .line 35
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryPagerAdapter$ViewHolder;->rplvFastBubbleScroller:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
