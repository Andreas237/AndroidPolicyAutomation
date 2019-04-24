.class public Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_ViewBinding;
.super Ljava/lang/Object;
.source "RelatedOffersList_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    const-string v0, "field \'rvRelatedOffers\'"

    .line 27
    const-class v1, Landroid/support/v7/widget/RecyclerView;

    const v2, 0x7f0903dc

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    const-string v0, "field \'tbvTitleBarView\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->tbvTitleBarView:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->rvRelatedOffers:Landroid/support/v7/widget/RecyclerView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;->tbvTitleBarView:Lcom/ibotta/android/views/base/title/TitleBarView;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
