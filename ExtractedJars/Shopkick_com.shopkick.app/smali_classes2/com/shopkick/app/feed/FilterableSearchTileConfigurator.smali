.class public Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "FilterableSearchTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private callbackWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/feed/ISearchBarPressedCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/feed/ISearchBarPressedCallback;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00d0

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    const p2, 0x7f09063b

    .line 32
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09064a

    .line 33
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    .line 34
    new-instance p2, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator$1;-><init>(Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;->callbackWeakReference:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/feed/ISearchBarPressedCallback;

    .line 47
    invoke-interface {p1}, Lcom/shopkick/app/feed/ISearchBarPressedCallback;->searchBarSelected()V

    :cond_0
    return-void
.end method
