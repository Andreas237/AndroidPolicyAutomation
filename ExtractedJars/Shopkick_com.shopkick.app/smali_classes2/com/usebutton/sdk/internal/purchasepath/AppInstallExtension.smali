.class public Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;
.super Ljava/lang/Object;
.source "AppInstallExtension.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;
.implements Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;
    }
.end annotation


# static fields
.field private static final SHOW_CARD_DELAY_COUNT_MS:I = 0x7d0


# instance fields
.field private final handler:Landroid/os/Handler;

.field private final imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private final internalInstallCard:Lcom/usebutton/sdk/internal/models/InternalInstallCard;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private isFirstPage:Z

.field private final listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Landroid/os/Handler;Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->isFirstPage:Z

    .line 44
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->internalInstallCard:Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    .line 45
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    .line 46
    iput-object p3, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->handler:Landroid/os/Handler;

    .line 47
    iput-object p4, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;)Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;

    return-object p0
.end method

.method private dismissInstallCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 4

    .line 146
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 147
    :cond_0
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    .line 148
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCards()Ljava/util/List;

    move-result-object v0

    .line 151
    iget-boolean v1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->isFirstPage:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 152
    iput-boolean v2, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->isFirstPage:Z

    return-void

    .line 157
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/purchasepath/Card;

    invoke-virtual {v0}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "btn_app_install_card"

    if-ne v0, v1, :cond_2

    .line 158
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    :cond_2
    return-void
.end method

.method private ensureAppInstallCardIsLastInList(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 5

    .line 117
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 118
    :cond_0
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    .line 119
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCards()Ljava/util/List;

    move-result-object v1

    .line 122
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/purchasepath/Card;

    invoke-virtual {v2}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v4, "btn_app_install_card"

    if-ne v2, v4, :cond_1

    return-void

    :cond_1
    const-string v2, "btn_app_install_card"

    .line 127
    invoke-interface {v0, v2}, Lcom/usebutton/sdk/purchasepath/CardList;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_2

    .line 131
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    if-eq v0, v1, :cond_3

    .line 132
    :cond_2
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    const-string v1, "btn_app_install_card"

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/CardList;->removeCard(Ljava/lang/Object;)V

    .line 133
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object p1

    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->internalInstallCard:Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-direct {v0, v1, v2, p0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;-><init>(Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;)V

    .line 134
    invoke-interface {p1, v0}, Lcom/usebutton/sdk/purchasepath/CardList;->addCard(Lcom/usebutton/sdk/purchasepath/Card;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public onAcceptClicked()V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;->onAcceptClicked()V

    return-void
.end method

.method public onClosed()V
    .locals 0

    return-void
.end method

.method public onDeclineClicked()V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->listener:Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;->onDeclineClicked()V

    return-void
.end method

.method public onInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 4

    .line 52
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 55
    :cond_0
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->internalInstallCard:Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->imageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-direct {v1, v2, v3, p0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard;-><init>(Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/purchasepath/AppInstallCard$Listener;)V

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/purchasepath/CardList;->addCard(Lcom/usebutton/sdk/purchasepath/Card;)V

    .line 56
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/CardList;->getCards()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onPageNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->dismissInstallCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 80
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->ensureAppInstallCardIsLastInList(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method

.method public onProductNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/ProductPage;)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->dismissInstallCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 86
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;->ensureAppInstallCardIsLastInList(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    return-void
.end method

.method public onPurchaseNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/purchasepath/PurchasePage;)V
    .locals 0

    return-void
.end method

.method public onStartNavigate(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 0

    return-void
.end method
