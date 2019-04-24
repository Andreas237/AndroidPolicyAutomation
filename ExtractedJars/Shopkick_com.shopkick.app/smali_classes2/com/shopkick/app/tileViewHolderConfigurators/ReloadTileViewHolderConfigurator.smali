.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReloadTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;,
        Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;
    }
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0180

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 1

    .line 28
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p2, p2, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz p2, :cond_0

    .line 29
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v0, 0x1

    .line 31
    invoke-virtual {p2, v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    const p2, 0x7f0905a8

    .line 34
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    .line 35
    new-instance p2, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;-><init>(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
