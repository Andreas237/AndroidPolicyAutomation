.class public Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;
.super Lcom/usebutton/sdk/internal/views/OneLineInventoryView;
.source "TwoLineInventoryView.java"


# instance fields
.field private mIconFull:Lcom/usebutton/sdk/internal/views/AssetImageView;

.field private mIconText:Landroid/widget/TextView;

.field private mSecondary:Landroid/widget/TextView;

.field private mSecondaryPlaceholder:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public hidePlaceholders()V
    .locals 1

    .line 97
    invoke-super {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->hidePlaceholders()V

    .line 98
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondaryPlaceholder:Landroid/view/View;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 48
    invoke-super {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->onFinishInflate()V

    .line 49
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_secondary:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondary:Landroid/widget/TextView;

    .line 50
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_secondary_placeholder:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondaryPlaceholder:Landroid/view/View;

    .line 51
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_icon_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconText:Landroid/widget/TextView;

    .line 52
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_icon_full:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/AssetImageView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconFull:Lcom/usebutton/sdk/internal/views/AssetImageView;

    return-void
.end method

.method protected setIcon(Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/Asset;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/ImageLoader;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconText:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p0, v0, p2, p1}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setOrLoadAsset(Lcom/usebutton/sdk/internal/views/AssetImageView;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    .line 72
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconFull:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p1, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setVisibility(I)V

    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconFull:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p0, v0, p2, p1}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setOrLoadAsset(Lcom/usebutton/sdk/internal/views/AssetImageView;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    .line 75
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p1, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/models/Inventory;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/util/Receiver;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/ImageLoader;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/models/Inventory;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;",
            "Lcom/usebutton/sdk/internal/ImageLoader;",
            ")V"
        }
    .end annotation

    .line 61
    invoke-super {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V

    .line 63
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->hidePlaceholders()V

    .line 64
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondary:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/models/Inventory;->getSecondary()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setTextAndVisibility(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 65
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconText:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/models/Inventory;->getIconText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->setTextAndVisibility(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    return-void
.end method

.method public showPlaceHolders()V
    .locals 2

    .line 84
    invoke-super {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->showPlaceHolders()V

    .line 85
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondary:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconFull:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setVisibility(I)V

    .line 87
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mIconText:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/TwoLineInventoryView;->mSecondaryPlaceholder:Landroid/view/View;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    return-void
.end method
