.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReceiptProductSelectorReceiptTileConfigurator.java"


# static fields
.field private static final IMAGE_SIZE:I = 0x3a

.field private static final INTERNAL_RADIUS:I = 0x5


# instance fields
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
.method public constructor <init>(Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;->jumpAdapter:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 59
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c016c

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    if-nez p2, :cond_0

    return-void

    .line 54
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;->productImage:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f090384

    .line 36
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f090404

    .line 37
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f090543

    .line 38
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    const v3, 0x7f09053e

    .line 39
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;->productImage:Landroid/widget/ImageView;

    .line 40
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorReceiptTileConfigurator;->jumpAdapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;

    .line 44
    invoke-virtual {p1}, Lcom/shopkick/app/receipts/GenericCategoryJumpAdapter;->preSelectRetailerReceipt()V

    return-void
.end method
