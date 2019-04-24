.class public Lcom/ibotta/android/view/offer/OfferListAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "OfferListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Lcom/ibotta/android/view/common/CategoryOfferPair;",
        ">;"
    }
.end annotation


# instance fields
.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private showArrow:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/images/ImageCache;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/view/common/CategoryOfferPair;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c0188

    .line 87
    invoke-direct {p0, p1, v0, p3}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter;->showArrow:Z

    .line 88
    iput-object p2, p0, Lcom/ibotta/android/view/offer/OfferListAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method

.method public static getPosition(Landroid/widget/BaseAdapter;I)I
    .locals 1

    .line 82
    instance-of v0, p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;

    if-eqz v0, :cond_0

    .line 83
    check-cast p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/CategorySectionAdapter;->getIndexForPosition(I)I

    move-result p1

    :cond_0
    return p1
.end method

.method public static getWrappedAdapter(Landroid/widget/BaseAdapter;)Lcom/ibotta/android/view/offer/OfferListAdapter;
    .locals 1

    .line 73
    instance-of v0, p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;

    if-eqz v0, :cond_0

    .line 74
    check-cast p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/view/common/CategorySectionAdapter;->getWrappedAdapter()Landroid/widget/ArrayAdapter;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/offer/OfferListAdapter;

    goto :goto_0

    .line 76
    :cond_0
    check-cast p0, Lcom/ibotta/android/view/offer/OfferListAdapter;

    :goto_0
    return-object p0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;Ljava/util/Comparator;Lcom/ibotta/api/helper/offer/OfferHelper;)Landroid/widget/BaseAdapter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/images/ImageCache;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/android/view/common/CategoryOfferPair;",
            ">;",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ")",
            "Landroid/widget/BaseAdapter;"
        }
    .end annotation

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 p2, 0x1

    .line 44
    invoke-interface {p4, v0, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveCategorized(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object p4

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 48
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/OfferModel;

    .line 49
    new-instance v5, Lcom/ibotta/android/view/common/CategoryOfferPair;

    invoke-direct {v5}, Lcom/ibotta/android/view/common/CategoryOfferPair;-><init>()V

    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ibotta/api/model/offer/Category;

    invoke-virtual {v5, v6}, Lcom/ibotta/android/view/common/CategoryOfferPair;->setCategory(Lcom/ibotta/api/model/offer/Category;)V

    .line 51
    invoke-virtual {v5, v4}, Lcom/ibotta/android/view/common/CategoryOfferPair;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 52
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 56
    :cond_1
    invoke-static {v0, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 58
    new-instance p3, Lcom/ibotta/android/view/offer/OfferListAdapter;

    invoke-direct {p3, p0, p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter;-><init>(Landroid/content/Context;Lcom/ibotta/android/images/ImageCache;Ljava/util/List;)V

    .line 61
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    if-ne p1, p2, :cond_2

    const-string p1, "NONE"

    .line 62
    invoke-interface {p4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/offer/Category;

    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    move-object p1, p3

    goto :goto_1

    .line 66
    :cond_2
    new-instance p1, Lcom/ibotta/android/view/common/CategorySectionAdapter;

    invoke-direct {p1, p0, p3}, Lcom/ibotta/android/view/common/CategorySectionAdapter;-><init>(Landroid/content/Context;Landroid/widget/ArrayAdapter;)V

    :goto_1
    return-object p1
.end method

.method private updateProductDetail(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 119
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$200(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateRebateAmount(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Lcom/ibotta/api/model/OfferModel;)V
    .locals 6

    .line 123
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v0

    .line 125
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 126
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/OfferListAdapter;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f1101c4

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 127
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/OfferListAdapter;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1101c5

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 129
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v5

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    aput-object v5, v3, v4

    .line 128
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 132
    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 135
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060027

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 137
    :cond_2
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$300(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0600e9

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    return-void
.end method

.method private updateRightArrow(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)V
    .locals 1

    .line 142
    iget-boolean v0, p0, Lcom/ibotta/android/view/offer/OfferListAdapter;->showArrow:Z

    if-eqz v0, :cond_0

    .line 143
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$400(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/ImageView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 145
    :cond_0
    invoke-static {p1}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$400(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/ImageView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 1

    .line 97
    new-instance p1, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;-><init>(Lcom/ibotta/android/view/offer/OfferListAdapter$1;)V

    const v0, 0x7f0902af

    .line 98
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$102(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    const v0, 0x7f09055e

    .line 99
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$202(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v0, 0x7f09051b

    .line 100
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$302(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v0, 0x7f0902c4

    .line 101
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-static {p1, p2}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$402(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    return-object p1
.end method

.method public setShowArrow(Z)V
    .locals 0

    .line 92
    iput-boolean p1, p0, Lcom/ibotta/android/view/offer/OfferListAdapter;->showArrow:Z

    return-void
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/view/common/CategoryOfferPair;)V
    .locals 3

    .line 107
    check-cast p3, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;

    .line 109
    invoke-virtual {p4}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p1

    .line 111
    iget-object p2, p0, Lcom/ibotta/android/view/offer/OfferListAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/view/offer/OfferListAdapter;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;->access$100(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)Landroid/widget/ImageView;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->PRODUCT_SMALL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {p2, p4, v0, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 113
    invoke-direct {p0, p3, p1}, Lcom/ibotta/android/view/offer/OfferListAdapter;->updateProductDetail(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Lcom/ibotta/api/model/OfferModel;)V

    .line 114
    invoke-direct {p0, p3, p1}, Lcom/ibotta/android/view/offer/OfferListAdapter;->updateRebateAmount(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;Lcom/ibotta/api/model/OfferModel;)V

    .line 115
    invoke-direct {p0, p3}, Lcom/ibotta/android/view/offer/OfferListAdapter;->updateRightArrow(Lcom/ibotta/android/view/offer/OfferListAdapter$OfferViewHolder;)V

    return-void
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 30
    check-cast p4, Lcom/ibotta/android/view/common/CategoryOfferPair;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/view/offer/OfferListAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/android/view/common/CategoryOfferPair;)V

    return-void
.end method
