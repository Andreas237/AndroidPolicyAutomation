.class public Lcom/shopkick/app/kicksActivity/KicksActivityPastViewHolderConfigurator;
.super Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.source "KicksActivityPastViewHolderConfigurator.java"


# static fields
.field private static final LOGO_ROUNDED_CORNER_RADIUS:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00fb

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 27
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 28
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->updateKicksCountUi(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
