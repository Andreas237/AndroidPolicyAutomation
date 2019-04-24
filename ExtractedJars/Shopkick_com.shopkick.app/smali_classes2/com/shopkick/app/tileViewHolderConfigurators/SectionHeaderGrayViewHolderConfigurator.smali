.class public Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "SectionHeaderGrayViewHolderConfigurator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01a3

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 19
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f090659

    .line 21
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 22
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    instance-of v0, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    iget-object v0, v0, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->backgroundColor:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->backgroundColor:Ljava/lang/String;

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method
