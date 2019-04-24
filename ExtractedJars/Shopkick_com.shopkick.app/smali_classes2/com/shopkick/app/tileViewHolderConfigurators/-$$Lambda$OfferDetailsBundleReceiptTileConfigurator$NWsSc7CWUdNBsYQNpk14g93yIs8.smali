.class public final synthetic Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;

.field private final synthetic f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

.field private final synthetic f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$1:Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsBundleReceiptTileConfigurator$NWsSc7CWUdNBsYQNpk14g93yIs8;->f$2:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0, v1, v2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;->lambda$onBindViewHolder$248(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsBundleReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V

    return-void
.end method
