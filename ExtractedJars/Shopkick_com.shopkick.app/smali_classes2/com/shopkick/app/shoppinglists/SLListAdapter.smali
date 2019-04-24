.class public Lcom/shopkick/app/shoppinglists/SLListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SLListAdapter.java"


# instance fields
.field private final CREATE_BUTTON_INDEX:I

.field private context:Landroid/content/Context;

.field private selectedListId:Ljava/lang/String;

.field private shoppingListSummaries:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->CREATE_BUTTON_INDEX:I

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getButtonRowPosition()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemById(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    .line 55
    iget-object v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c01be

    .line 74
    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 75
    new-instance p3, Lcom/shopkick/app/adapter/ViewHolder;

    invoke-direct {p3}, Lcom/shopkick/app/adapter/ViewHolder;-><init>()V

    .line 76
    invoke-virtual {p3, p2}, Lcom/shopkick/app/adapter/ViewHolder;->populate(Landroid/view/View;)V

    .line 77
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/adapter/ViewHolder;

    .line 82
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    if-eqz v1, :cond_4

    const v2, 0x7f090694

    .line 85
    invoke-virtual {p3, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090100

    .line 86
    invoke-virtual {p3, v3}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0901bb

    .line 87
    invoke-virtual {p3, v4}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f090425

    .line 88
    invoke-virtual {p3, v5}, Lcom/shopkick/app/adapter/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f06015d

    const/16 v7, 0x8

    if-nez p1, :cond_1

    .line 91
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 92
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_3

    .line 95
    :cond_1
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 96
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 99
    invoke-virtual {p0}, Lcom/shopkick/app/shoppinglists/SLListAdapter;->getCount()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    if-ne p1, v4, :cond_2

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    :cond_2
    const p1, 0x7f080182

    .line 102
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_1
    const p1, 0x7f09042a

    .line 105
    invoke-virtual {p3, p1}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    const v2, 0x7f090422

    .line 106
    invoke-virtual {p3, v2}, Lcom/shopkick/app/adapter/ViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p3

    .line 109
    iget-object v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->shoppingListId:Ljava/lang/String;

    iget-object v4, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->selectedListId:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v5

    goto :goto_2

    :cond_3
    move v2, v0

    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setSelected(Z)V

    .line 113
    iget v2, v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->entryCount:I

    .line 114
    iget-object v3, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f003c

    new-array v5, v5, [Ljava/lang/Object;

    .line 116
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    .line 115
    invoke-virtual {v3, v4, v2, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object p3, v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->title:Ljava/lang/String;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_3
    return-object p2
.end method

.method public setListSummaries(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;",
            ">;)V"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    new-instance v1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    invoke-direct {v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->shoppingListSummaries:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setSelectedListId(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/SLListAdapter;->selectedListId:Ljava/lang/String;

    return-void
.end method
