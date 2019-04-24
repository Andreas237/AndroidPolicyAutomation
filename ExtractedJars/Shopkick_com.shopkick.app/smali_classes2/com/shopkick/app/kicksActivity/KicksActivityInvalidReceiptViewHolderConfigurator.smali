.class public Lcom/shopkick/app/kicksActivity/KicksActivityInvalidReceiptViewHolderConfigurator;
.super Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;
.source "KicksActivityInvalidReceiptViewHolderConfigurator.java"


# static fields
.field private static final LOGO_ROUNDED_CORNER_RADIUS:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00f7

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 31
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/kicksActivity/KicksActivityViewHolderConfiguratorBase;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 34
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    if-eqz v0, :cond_0

    const v0, 0x7f09036a

    .line 35
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 37
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->flagText:Ljava/lang/String;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const p2, 0x7f09036b

    .line 40
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    const p2, 0x7f0801c9

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
