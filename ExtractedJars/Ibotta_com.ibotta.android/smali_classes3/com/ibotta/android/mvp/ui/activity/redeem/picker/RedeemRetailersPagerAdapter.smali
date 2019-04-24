.class public Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "RedeemRetailersPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$ViewHolder;,
        Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter$RetailersTab;
    }
.end annotation


# instance fields
.field private final views:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addView(ILandroid/view/View;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 62
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 67
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 68
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x2

    return p1
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/picker/RedeemRetailersPagerAdapter;->views:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    .line 56
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
