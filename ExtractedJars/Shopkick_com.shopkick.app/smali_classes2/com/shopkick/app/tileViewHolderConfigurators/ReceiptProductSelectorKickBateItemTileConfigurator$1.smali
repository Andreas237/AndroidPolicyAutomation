.class Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;
.super Ljava/lang/Object;
.source "ReceiptProductSelectorKickBateItemTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;

.field final synthetic val$adapterPosition:I

.field final synthetic val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;I)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iput p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$adapterPosition:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    const v0, 0x7f090670

    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f090662

    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0903ab

    .line 57
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 60
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    if-eqz v2, :cond_3

    .line 61
    iget v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$adapterPosition:I

    invoke-virtual {v2, v3}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getItem(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v2

    .line 62
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v3, :cond_0

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 63
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v3, v6, v4}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getStateForID(Ljava/lang/String;Z)Z

    move-result v3

    goto :goto_0

    .line 65
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v6, v5}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->getStateForID(Ljava/lang/String;Z)Z

    move-result v3

    .line 66
    iget-object v6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    iget v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$adapterPosition:I

    invoke-virtual {v6, v7}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->maybeExpandOrCollapseMPR(I)V

    :goto_0
    const/high16 v6, 0x3f800000    # 1.0f

    if-nez v3, :cond_1

    const v2, 0x7f0800dd

    .line 69
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    const/16 v0, 0x8

    .line 70
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 71
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    :cond_1
    const v3, 0x7f080099

    .line 73
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 74
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 75
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V

    .line 76
    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 77
    iget-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 78
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorKickBateItemTileConfigurator$1;->val$genericCategoryJumpAdapter:Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    invoke-virtual {v2, v1, v4}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->isSelected(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0x3ecccccd    # 0.4f

    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    :goto_1
    return-void
.end method
