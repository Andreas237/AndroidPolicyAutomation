.class public final synthetic Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;

.field private final synthetic f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;->f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsOfferNotAvailableTileConfigurator$vQ_AWMWBIIFz9UQ19GBTxG93xz0;->f$1:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;->lambda$onBindViewHolder$250(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsOfferNotAvailableTileConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V

    return-void
.end method
