.class Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;
.super Ljava/lang/Object;
.source "EarnTabTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OnTabClickListener"
.end annotation


# instance fields
.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;",
            ">;"
        }
    .end annotation
.end field

.field private onClickTabCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;",
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
.method public constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/ref/WeakReference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;",
            "Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;",
            ">;)V"
        }
    .end annotation

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 166
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    .line 167
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->onClickTabCallbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;

    .line 173
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->viewHolderRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;

    .line 174
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-nez v2, :cond_0

    goto :goto_1

    .line 179
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v0, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->access$002(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;I)I

    const v3, 0x7f09071c

    .line 180
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_1

    move v4, v6

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    invoke-static {v0, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;Landroid/view/View;Z)V

    const v3, 0x7f09071d

    .line 181
    invoke-virtual {v1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    move v5, v6

    :cond_2
    invoke-static {v0, v1, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->access$100(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;Landroid/view/View;Z)V

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;->onClickTabCallbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    .line 184
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;

    if-eqz v0, :cond_3

    .line 186
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;->OnClickTab(Landroid/view/View;I)V

    :cond_3
    return-void

    :cond_4
    :goto_1
    return-void
.end method
