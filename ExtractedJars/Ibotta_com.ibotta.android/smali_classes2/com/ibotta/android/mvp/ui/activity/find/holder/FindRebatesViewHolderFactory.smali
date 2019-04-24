.class public Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory;
.super Ljava/lang/Object;
.source "FindRebatesViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/activity/find/holder/AbstractFindRebatesViewHolder;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 21
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FindRebatesViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$find$FindRebatesRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->values()[Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 29
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;

    new-instance v1, Lcom/ibotta/android/views/categories/RetailerCategoriesView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/ibotta/android/views/categories/RetailerCategoriesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p2, v1}, Lcom/ibotta/android/mvp/ui/activity/find/holder/RetailerCategoriesViewHolder;-><init>(Lcom/ibotta/android/views/categories/RetailerCategoriesView;)V

    move-object v0, p2

    goto :goto_0

    .line 26
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;

    new-instance p2, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/empty/EmptyView;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/EmptyFavoriteRetailersViewHolder;-><init>(Lcom/ibotta/android/views/empty/EmptyView;)V

    goto :goto_0

    .line 23
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;

    new-instance p2, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p2}, Lcom/ibotta/android/mvp/ui/activity/find/holder/FavoriteRetailersSSCardViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;)V

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
