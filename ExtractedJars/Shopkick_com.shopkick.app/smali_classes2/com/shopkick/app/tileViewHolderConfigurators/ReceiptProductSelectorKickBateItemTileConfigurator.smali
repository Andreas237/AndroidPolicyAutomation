.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReceiptProductSelectorKickBateItemTileConfigurator.java"


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private context:Landroid/content/Context;

.field private jumpAdapter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private productImage:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;Lcom/shopkick/app/account/AgeVerificationController;Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->jumpAdapter:Ljava/lang/ref/WeakReference;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 32
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 157
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c016b

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    if-nez p2, :cond_0

    return-void

    .line 152
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->productImage:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const v3, 0x7f0903ab

    .line 43
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    .line 44
    iget-object v5, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->jumpAdapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    .line 45
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getAdapterPosition()I

    move-result v6

    .line 46
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;

    invoke-direct {v7, v0, v5, v6}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;I)V

    .line 88
    new-instance v6, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v8, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {v6, v8, v2, v7}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    invoke-virtual {v4, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v6, 0x7f090384

    .line 91
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    const v7, 0x7f090404

    .line 92
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    const v8, 0x7f090543

    .line 93
    invoke-virtual {v1, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v8

    const v9, 0x7f09053e

    .line 94
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v9

    iput-object v9, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->productImage:Landroid/widget/ImageView;

    const v9, 0x7f090386

    .line 95
    invoke-virtual {v1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    const v10, 0x7f090670

    .line 96
    invoke-virtual {v1, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v10

    const v11, 0x7f090662

    .line 97
    invoke-virtual {v1, v11}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    .line 98
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    .line 99
    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v12, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    :goto_0
    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v15, 0x8

    if-eqz v5, :cond_1

    .line 100
    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    invoke-virtual {v5, v12, v13}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isSelected(Ljava/lang/String;Z)Z

    move-result v12

    if-nez v12, :cond_1

    const v12, 0x7f0800dd

    .line 101
    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 103
    invoke-virtual {v3, v14}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    :cond_1
    const v12, 0x7f080099

    .line 105
    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v10, 0x0

    .line 106
    invoke-virtual {v11, v10}, Landroid/view/View;->setVisibility(I)V

    .line 107
    invoke-virtual {v3, v14}, Landroid/view/View;->setAlpha(F)V

    .line 108
    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_3

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v10, :cond_3

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    .line 109
    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const/4 v12, 0x1

    .line 110
    invoke-virtual {v5, v11, v12}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isSelected(Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_2

    const v10, 0x3ecccccd    # 0.4f

    .line 111
    invoke-virtual {v3, v10}, Landroid/view/View;->setAlpha(F)V

    .line 119
    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v10, 0x7f0f000e

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v3, v10, v11}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v3

    .line 120
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v5, :cond_4

    .line 125
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getAdapterPosition()I

    move-result v3

    invoke-virtual {v5, v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isExpanded(I)Z

    move-result v13

    goto :goto_2

    :cond_4
    const/4 v13, 0x0

    :goto_2
    const v3, 0x7f090494

    .line 127
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    .line 128
    iget-object v1, v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v13}, Landroid/view/View;->setActivated(Z)V

    if-eqz v13, :cond_5

    const/4 v1, 0x0

    goto :goto_3

    :cond_5
    move v1, v15

    .line 129
    :goto_3
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 130
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f1104f3

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Object;

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    const/4 v12, 0x0

    aput-object v10, v11, v12

    invoke-virtual {v1, v5, v11}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->context:Landroid/content/Context;

    const v3, 0x7f110452

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    .line 133
    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v5, v12

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    aput-object v10, v5, v11

    .line 132
    invoke-virtual {v1, v3, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setVisibility(I)V

    .line 138
    :cond_6
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0600c7

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 139
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f060022

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 140
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 142
    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
