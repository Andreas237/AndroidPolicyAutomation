.class Lcom/usebutton/sdk/internal/InternalRewardsExtension;
.super Ljava/lang/Object;
.source "InternalRewardsExtension.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;


# instance fields
.field private final browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

.field private final buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field private final configuration:Lcom/usebutton/sdk/internal/models/Configuration;

.field private displayInstantRewardsCard:Z

.field private final handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/ButtonRepository;Landroid/os/Handler;Lcom/usebutton/sdk/internal/models/BrowserCardMap;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInstantRewardsCard:Z

    .line 32
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    .line 33
    iput-object p2, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 34
    iput-object p3, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->handler:Landroid/os/Handler;

    .line 35
    iput-object p4, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    return-void
.end method

.method private createInternalRewardCard(Lcom/usebutton/sdk/internal/models/InternalRewardCard;Lcom/usebutton/sdk/internal/models/BrowserCardType;)Lcom/usebutton/sdk/purchasepath/TextCard;
    .locals 8
    .param p1    # Lcom/usebutton/sdk/internal/models/InternalRewardCard;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 141
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    .line 142
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getBody()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v2

    .line 144
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getBody()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v3

    .line 145
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getBackgroundColor()I

    move-result v4

    .line 147
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v5

    .line 148
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getCtaText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    invoke-virtual {v6}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v6

    .line 149
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getCtaIcon()Landroid/net/Uri;

    move-result-object p1

    .line 151
    new-instance v7, Lcom/usebutton/sdk/internal/InternalCallToAction;

    invoke-direct {v7, p1, v5, v6}, Lcom/usebutton/sdk/internal/InternalCallToAction;-><init>(Landroid/net/Uri;Ljava/lang/String;I)V

    .line 153
    new-instance p1, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    invoke-direct {p1, v7, v0, v1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1, v2}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setTitleColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object p1

    .line 155
    invoke-virtual {p1, v3}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setBodyColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object p1

    .line 156
    invoke-virtual {p1, v4}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->setBackgroundColor(I)Lcom/usebutton/sdk/purchasepath/TextCard$Builder;

    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/TextCard$Builder;->build()Lcom/usebutton/sdk/purchasepath/TextCard;

    move-result-object p1

    .line 159
    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/purchasepath/TextCard;->setKey(Ljava/lang/Object;)V

    return-object p1
.end method

.method private displayInternalRewardCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/models/BrowserCardType;)V
    .locals 4

    .line 99
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    .line 100
    iget-object v1, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 101
    invoke-virtual {v1, p2}, Lcom/usebutton/sdk/internal/ButtonRepository;->getInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;)I

    move-result v1

    .line 103
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->getInternalRewardsCard(Lcom/usebutton/sdk/internal/models/BrowserCardType;)Lcom/usebutton/sdk/internal/models/InternalRewardCard;

    move-result-object v2

    if-eqz v0, :cond_4

    if-eqz v2, :cond_4

    .line 105
    invoke-interface {v0, p2}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    invoke-direct {p0, v2, p2}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->createInternalRewardCard(Lcom/usebutton/sdk/internal/models/InternalRewardCard;Lcom/usebutton/sdk/internal/models/BrowserCardType;)Lcom/usebutton/sdk/purchasepath/TextCard;

    move-result-object v3

    .line 110
    invoke-interface {v0, v3}, Lcom/usebutton/sdk/purchasepath/CardList;->addCard(Lcom/usebutton/sdk/purchasepath/Card;)V

    .line 112
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getShowCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 113
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    .line 116
    :cond_1
    sget-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    const/4 v3, 0x1

    if-ne p2, v0, :cond_2

    .line 117
    iput-boolean v3, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInstantRewardsCard:Z

    .line 120
    :cond_2
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getShowCount()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 121
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    add-int/2addr v1, v3

    invoke-virtual {v0, p2, v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->setInternalRewardCardDisplayCount(Lcom/usebutton/sdk/internal/models/BrowserCardType;I)V

    .line 124
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->showTopCard()V

    .line 126
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->getShowDuration()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_3

    .line 129
    iget-object p2, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;

    invoke-direct {v2, p0, p1}, Lcom/usebutton/sdk/internal/InternalRewardsExtension$1;-><init>(Lcom/usebutton/sdk/internal/InternalRewardsExtension;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    invoke-virtual {p2, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3
    return-void

    :cond_4
    :goto_0
    return-void
.end method

.method private getInternalRewardsCard(Lcom/usebutton/sdk/internal/models/BrowserCardType;)Lcom/usebutton/sdk/internal/models/InternalRewardCard;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 174
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->browserCardMap:Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/InternalRewardCard;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private isInstantRewardsCardEnabled()Z
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isInstantRewardsCardEnabled()Z

    move-result v0

    return v0
.end method

.method private isPredictableRewardsCardEnabled()Z
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPredictableRewardsCardEnabled()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onClosed()V
    .locals 0

    return-void
.end method

.method public onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/BrowserPage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/ProductPage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 67
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->isPredictableRewardsCardEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    sget-object v0, Lcom/usebutton/sdk/internal/InternalRewardsExtension$2;->$SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType:[I

    invoke-interface {p2}, Lcom/usebutton/sdk/purchasepath/ProductPage;->getCommission()Lcom/usebutton/sdk/purchasepath/Commission;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/purchasepath/Commission;->getCommissionType()Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/purchasepath/Commission$CommissionType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 75
    :pswitch_0
    sget-object p2, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_UNAVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInternalRewardCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/models/BrowserCardType;)V

    goto :goto_0

    .line 70
    :pswitch_1
    sget-object p2, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_AVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInternalRewardCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/models/BrowserCardType;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/purchasepath/PurchasePage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 87
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->isInstantRewardsCardEnabled()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 88
    sget-object p2, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInternalRewardCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/models/BrowserCardType;)V

    :cond_0
    return-void
.end method

.method public onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 46
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 49
    sget-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_AVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    .line 50
    sget-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->PREDICTABLE_REWARDS_UNAVAILABLE:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    .line 52
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInstantRewardsCard:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 53
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/InternalRewardsExtension;->displayInstantRewardsCard:Z

    goto :goto_0

    .line 55
    :cond_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTANT_REWARDS:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
