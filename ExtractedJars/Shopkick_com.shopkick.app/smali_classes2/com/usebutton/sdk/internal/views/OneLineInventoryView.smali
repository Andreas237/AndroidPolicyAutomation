.class public Lcom/usebutton/sdk/internal/views/OneLineInventoryView;
.super Landroid/widget/LinearLayout;
.source "OneLineInventoryView.java"


# instance fields
.field final mDescriptionBuilder:Ljava/lang/StringBuilder;

.field protected mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

.field mPlaceholderBackground:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private mPrimary:Landroid/widget/TextView;

.field private mPrimaryPlaceholder:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    .line 49
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->init()V

    return-void
.end method

.method private setText(Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimary:Landroid/widget/TextView;

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setTextAndVisibility(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    return-void
.end method


# virtual methods
.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hidePlaceholders()V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const/4 v0, 0x1

    .line 156
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setClickable(Z)V

    .line 157
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimaryPlaceholder:Landroid/view/View;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    return-void
.end method

.method protected init()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 60
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$color;->btn_placeholder:I

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPlaceholderBackground:I

    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 65
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 66
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_primary:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimary:Landroid/widget/TextView;

    .line 67
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_primary_placeholder:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimaryPlaceholder:Landroid/view/View;

    .line 68
    sget v0, Lcom/usebutton/sdk/R$id;->inventory_icon:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/AssetImageView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    return-void
.end method

.method public setFooter(Lcom/usebutton/sdk/internal/models/Footer;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/models/Footer;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 124
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 127
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setClickable(Z)V

    const/4 v0, 0x0

    .line 128
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setVisibility(I)V

    .line 129
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Footer;->getText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setText(Lcom/usebutton/sdk/internal/models/Text;)V

    .line 130
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Footer;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setIcon(Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/ImageLoader;)V

    .line 131
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Footer;->getBackgroundColor()I

    move-result v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/CompatHelpers$RippleBackground;->fromColor(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 132
    new-instance v0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;

    invoke-direct {v0, p0, p2, p1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$2;-><init>(Lcom/usebutton/sdk/internal/views/OneLineInventoryView;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/models/Footer;)V

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected setIcon(Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/models/Asset;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/ImageLoader;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-virtual {p0, v0, p2, p1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setOrLoadAsset(Lcom/usebutton/sdk/internal/views/AssetImageView;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    return-void
.end method

.method public setInventory(Lcom/usebutton/sdk/models/Inventory;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/ImageLoader;)V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

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

    .line 73
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->hidePlaceholders()V

    const/4 v0, 0x1

    .line 74
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setClickable(Z)V

    .line 75
    invoke-virtual {p1}, Lcom/usebutton/sdk/models/Inventory;->getPrimary()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setText(Lcom/usebutton/sdk/internal/models/Text;)V

    .line 76
    invoke-virtual {p1}, Lcom/usebutton/sdk/models/Inventory;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setIcon(Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/ImageLoader;)V

    .line 78
    new-instance p3, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;

    invoke-direct {p3, p0, p2, p1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView$1;-><init>(Lcom/usebutton/sdk/internal/views/OneLineInventoryView;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/models/Inventory;)V

    invoke-virtual {p0, p3}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected setOrLoadAsset(Lcom/usebutton/sdk/internal/views/AssetImageView;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 92
    invoke-virtual {p3}, Lcom/usebutton/sdk/internal/models/Asset;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 93
    invoke-virtual {p1, p2, p3}, Lcom/usebutton/sdk/internal/views/AssetImageView;->loadAsset(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {p1, p3}, Lcom/usebutton/sdk/internal/views/AssetImageView;->setAsset(Lcom/usebutton/sdk/internal/models/Asset;)V

    :goto_0
    return-void
.end method

.method public setTextAndVisibility(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 1

    if-eqz p2, :cond_2

    .line 104
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    .line 109
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 111
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 112
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 114
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mDescriptionBuilder:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    :goto_0
    const/16 p2, 0x8

    .line 105
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public showPlaceHolders()V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    const/4 v0, 0x0

    .line 144
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setClickable(Z)V

    .line 145
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mIcon:Lcom/usebutton/sdk/internal/views/AssetImageView;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimary:Landroid/widget/TextView;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    .line 147
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->mPrimaryPlaceholder:Landroid/view/View;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    return-void
.end method
