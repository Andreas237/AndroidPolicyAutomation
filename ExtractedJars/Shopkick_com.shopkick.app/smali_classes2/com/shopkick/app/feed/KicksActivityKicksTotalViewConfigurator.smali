.class public Lcom/shopkick/app/feed/KicksActivityKicksTotalViewConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "KicksActivityKicksTotalViewConfigurator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0102

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    const v0, 0x7f090384

    .line 21
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0903e7

    .line 22
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f090386

    .line 23
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    .line 24
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kicksActivityType:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    return-void

    .line 33
    :pswitch_0
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0600c7

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    goto :goto_0

    .line 27
    :pswitch_1
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060022

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    goto :goto_0

    .line 30
    :pswitch_2
    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0600c8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 38
    :goto_0
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    .line 39
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 41
    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 42
    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 43
    invoke-virtual {v1, v5}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 44
    invoke-virtual {p1, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    goto :goto_1

    .line 45
    :cond_0
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 46
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 47
    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 48
    invoke-virtual {p1, v5}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 49
    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 50
    invoke-virtual {v1, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
