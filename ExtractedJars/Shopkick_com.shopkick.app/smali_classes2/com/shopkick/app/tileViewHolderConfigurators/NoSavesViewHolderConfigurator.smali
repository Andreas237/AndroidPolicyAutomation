.class public Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "NoSavesViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator$SeeProductsClick;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;->context:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00ad

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 40
    check-cast p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;

    .line 42
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0904b6

    .line 44
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 45
    iget-object v1, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->header:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0904b5

    .line 46
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 47
    iget-object p2, p2, Lcom/shopkick/app/feed/ClientExtendedTileInfoV2;->message:Ljava/lang/String;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p2, 0x7f09065b

    .line 49
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    const/4 p2, 0x0

    .line 50
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 51
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;->context:Landroid/content/Context;

    const v0, 0x7f11060e

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 52
    new-instance p2, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator$SeeProductsClick;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoSavesViewHolderConfigurator$SeeProductsClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
