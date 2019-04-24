.class public Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory;
.super Ljava/lang/Object;
.source "GalleryViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;ILcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/view/gallery/holder/AbstractGalleryViewHolder;
    .locals 2

    .line 24
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/holder/GalleryViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$gallery$GalleryRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->values()[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 45
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;

    new-instance p3, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/DividerRowViewHolder;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 42
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;

    new-instance p3, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/SpecialConditionsViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;)V

    goto :goto_0

    .line 39
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;

    new-instance p3, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/ProductRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/product/ProductRowView;)V

    goto :goto_0

    .line 36
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;

    new-instance p3, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/rebate/RebateRowView;)V

    goto :goto_0

    .line 32
    :pswitch_4
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    .line 33
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/RebateCardViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    goto :goto_0

    .line 29
    :pswitch_5
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;

    new-instance p3, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/TitleBarRowViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    goto :goto_0

    .line 26
    :pswitch_6
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;

    new-instance p3, Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/view/featured/FeaturedView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/holder/BannersViewHolder;-><init>(Lcom/ibotta/android/view/featured/FeaturedView;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
