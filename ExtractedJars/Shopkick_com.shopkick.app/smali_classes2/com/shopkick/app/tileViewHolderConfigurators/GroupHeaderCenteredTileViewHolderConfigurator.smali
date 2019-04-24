.class public Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderCenteredTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "GroupHeaderCenteredTileViewHolderConfigurator.java"


# static fields
.field private static final CONTAINER_HEIGHT_1X:I = 0x62


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00d2

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderCenteredTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 26
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/16 v1, 0x62

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithScaling(Landroid/view/View;I)V

    const v0, 0x7f09073a

    .line 29
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 30
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void
.end method
