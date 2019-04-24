.class public Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;
.super Ljava/lang/Object;
.source "IbottaListViewHolderFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;


# instance fields
.field private final ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
    .locals 3

    .line 57
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl$1;->$SwitchMap$com$ibotta$android$views$list$ContentViewState$ContentType:[I

    invoke-static {}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->values()[Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    .line 123
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid ItemType"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/views/list/holder/DecoratorViewHolder;

    new-instance v0, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/views/list/holder/DecoratorViewHolder;-><init>(Landroid/view/View;)V

    goto/16 :goto_0

    .line 115
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;

    .line 116
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01b2

    .line 117
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/list/holder/RedeemRetailerViewHolder;-><init>(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;)V

    goto/16 :goto_0

    .line 111
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/views/search/suggested/SuggestedSearhTitleViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01af

    .line 112
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchTitleView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearhTitleViewHolder;-><init>(Lcom/ibotta/android/views/search/suggested/SuggestedSearchTitleView;)V

    goto/16 :goto_0

    .line 107
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01d7

    .line 108
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewHolder;-><init>(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;)V

    goto/16 :goto_0

    .line 103
    :pswitch_4
    new-instance p2, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c019f

    .line 104
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewHolder;-><init>(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;)V

    goto/16 :goto_0

    .line 98
    :pswitch_5
    new-instance p2, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentMethodViewHolder;

    .line 99
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01f6

    .line 100
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentMethodViewHolder;-><init>(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowView;)V

    goto/16 :goto_0

    .line 93
    :pswitch_6
    new-instance p2, Lcom/ibotta/android/views/pwi/home/payments/PaymentSelectorViewHolder;

    .line 94
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c018a

    .line 95
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentSelectorViewHolder;-><init>(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorRowView;)V

    goto/16 :goto_0

    .line 88
    :pswitch_7
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;

    .line 89
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01d3

    .line 90
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/view/listview/holder/RetailerSSCardViewHolder;-><init>(Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V

    goto/16 :goto_0

    .line 85
    :pswitch_8
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;

    new-instance v0, Lcom/ibotta/android/view/featured/FeaturedView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/featured/FeaturedView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/listview/holder/FeaturedViewHolder;-><init>(Lcom/ibotta/android/view/featured/FeaturedView;)V

    goto/16 :goto_0

    .line 81
    :pswitch_9
    new-instance p2, Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/views/list/IbottaListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 82
    new-instance p1, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;

    invoke-direct {p1, p2}, Lcom/ibotta/android/mvp/ui/view/listview/holder/IbottaNestedListViewHolder;-><init>(Lcom/ibotta/android/views/list/IbottaListView;)V

    move-object p2, p1

    goto/16 :goto_0

    .line 78
    :pswitch_a
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/listview/holder/NoResultsViewHolder;-><init>(Lcom/ibotta/android/views/empty/EmptyView;)V

    goto :goto_0

    .line 74
    :pswitch_b
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    .line 75
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    invoke-direct {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentCardViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V

    goto :goto_0

    .line 70
    :pswitch_c
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0142

    .line 71
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/listview/IbottaListViewHolderFactoryImpl;->ibottaListViewTracking:Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/view/listview/holder/ContentRowViewHolder;-><init>(Lcom/ibotta/android/views/content/row/ContentRowView;Lcom/ibotta/android/tracking/scrolltracking/listview/IbottaListViewTracking;)V

    goto :goto_0

    .line 66
    :pswitch_d
    new-instance p2, Lcom/ibotta/android/views/list/holder/InfoViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0169

    .line 67
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowView;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/list/holder/InfoViewHolder;-><init>(Lcom/ibotta/android/views/base/info/InformationRowView;)V

    goto :goto_0

    .line 63
    :pswitch_e
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;

    new-instance v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/listview/holder/TitleBarRowViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    goto :goto_0

    .line 59
    :pswitch_f
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01c2

    .line 60
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/view/listview/holder/GenericViewHolder;-><init>(Landroid/view/View;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
