.class public Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mImgBusCardLogo:Landroid/widget/ImageView;

.field private mTextBusCardDes:Landroid/widget/TextView;

.field private mTextBusCardStatus:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;Landroid/view/ViewGroup;)V
    .locals 4

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 26
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mContext:Landroid/content/Context;

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->nfc_bind_bus_card_switch_item:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 28
    sget v0, Lcom/huawei/wallet/R$id;->bus_card_icon:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mImgBusCardLogo:Landroid/widget/ImageView;

    .line 29
    sget v0, Lcom/huawei/wallet/R$id;->bus_card_type:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardDes:Landroid/widget/TextView;

    .line 30
    sget v0, Lcom/huawei/wallet/R$id;->bus_card_status:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardStatus:Landroid/widget/TextView;

    .line 31
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mImgBusCardLogo:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getLogo()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardDes:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardStatus:Landroid/widget/TextView;

    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->getCardStatusText(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    return-void
.end method

.method private getCardStatusText(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Ljava/lang/String;
    .locals 2

    .line 45
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_status_added:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 49
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getStatus()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    .line 50
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getStatus()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    .line 51
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getStatus()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    .line 53
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_status_continue:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 57
    :cond_2
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public setData(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)V
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mImgBusCardLogo:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getLogo()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardDes:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->mTextBusCardStatus:Landroid/widget/TextView;

    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/widget/BindBusCardSwitchItem;->getCardStatusText(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    return-void
.end method
