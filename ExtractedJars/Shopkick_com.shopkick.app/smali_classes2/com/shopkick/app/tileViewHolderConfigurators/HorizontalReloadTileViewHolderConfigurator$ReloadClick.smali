.class Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;
.super Ljava/lang/Object;
.source "HorizontalReloadTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReloadClick"
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;",
            ">;"
        }
    .end annotation
.end field

.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private viewHolderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 70
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->viewHolderRef:Ljava/lang/ref/WeakReference;

    .line 71
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    .line 76
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 77
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 81
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 84
    invoke-virtual {p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->showLoading(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 85
    invoke-interface {v1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;->onReloadClicked()V

    :cond_0
    return-void
.end method
