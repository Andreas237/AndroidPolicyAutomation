.class public Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsLoadingPlaceHolderTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "StoreDetailsLoadingPlaceHolderTileViewHolderConfigurator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01c9

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/StoreDetailsLoadingPlaceHolderTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-void
.end method
