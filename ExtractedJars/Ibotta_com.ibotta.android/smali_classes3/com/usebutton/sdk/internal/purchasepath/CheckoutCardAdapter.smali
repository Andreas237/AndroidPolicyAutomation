.class public Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "CheckoutCardAdapter.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/CardList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;,
        Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        ">;",
        "Lcom/usebutton/sdk/purchasepath/CardList;"
    }
.end annotation


# instance fields
.field private final browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

.field private cardList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

.field private proxy:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V
    .locals 1

    .line 51
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    .line 52
    new-instance v0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;-><init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->proxy:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;

    .line 53
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    return-void
.end method

.method constructor <init>(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 60
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    .line 61
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    .line 62
    iput-object p2, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->proxy:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;

    return-void
.end method

.method private updateCardCheckout(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;)V"
        }
    .end annotation

    .line 131
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 133
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/purchasepath/Card;

    .line 134
    iget-object v2, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->browser:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/purchasepath/Card;->setBrowser(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 135
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 138
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/usebutton/sdk/purchasepath/Card;

    .line 139
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 140
    invoke-virtual {p2, v1}, Lcom/usebutton/sdk/purchasepath/Card;->setBrowser(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public addCard(Lcom/usebutton/sdk/purchasepath/Card;)V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V

    return-void
.end method

.method public getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/purchasepath/Card;

    .line 149
    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getCards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    return-object v0
.end method

.method getCheckoutCardAdapterListener()Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public insertCard(Lcom/usebutton/sdk/purchasepath/Card;I)V
    .locals 2

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 167
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->setCards(Ljava/util/List;)V

    return-void
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/usebutton/sdk/purchasepath/Card;

    .line 96
    iget-object p1, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Landroid/view/ViewGroup;

    .line 97
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/purchasepath/Card;->createView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 98
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 99
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    invoke-virtual {p2, v0}, Lcom/usebutton/sdk/purchasepath/Card;->bindView(Landroid/view/View;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 81
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 82
    sget v0, Lcom/usebutton/sdk/R$layout;->btn_view_card:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/CardView;

    .line 84
    new-instance p2, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$1;

    invoke-direct {p2, p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$1;-><init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public reloadCards()V
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->proxy:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->notifyDataSetChanged()V

    return-void
.end method

.method public removeAllCards()V
    .locals 1

    .line 205
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->setCards(Ljava/util/List;)V

    return-void
.end method

.method public removeCard(Ljava/lang/Object;)V
    .locals 2

    .line 194
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 197
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 199
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 200
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->setCards(Ljava/util/List;)V

    return-void
.end method

.method public replaceCard(Lcom/usebutton/sdk/purchasepath/Card;Ljava/lang/Object;)V
    .locals 2

    .line 172
    invoke-virtual {p0, p2}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getCard(Ljava/lang/Object;)Lcom/usebutton/sdk/purchasepath/Card;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 177
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 180
    iget-object v1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 184
    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 187
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 189
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->setCards(Ljava/util/List;)V

    return-void
.end method

.method public setCards(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/purchasepath/Card;",
            ">;)V"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->updateCardCheckout(Ljava/util/List;Ljava/util/List;)V

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 119
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

    if-eqz p1, :cond_1

    .line 120
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 121
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->cardList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/purchasepath/Card;

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;->onTopCardChanged(Lcom/usebutton/sdk/purchasepath/Card;)V

    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;->onTopCardChanged(Lcom/usebutton/sdk/purchasepath/Card;)V

    .line 127
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->proxy:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->notifyDataSetChanged()V

    return-void
.end method

.method public setCheckoutCardAdapterListener(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->listener:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;

    return-void
.end method
