.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "HorizontalReloadTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;
    }
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

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00e1

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 39
    iget-object p2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    const p2, 0x7f09054a

    .line 40
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f0905a9

    .line 43
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p2

    const v0, 0x7f1105a1

    .line 44
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0905a8

    .line 46
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p2

    const/4 v0, 0x1

    .line 47
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 48
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    const v0, 0x7f1105a0

    .line 49
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 50
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0, p1, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator$ReloadClick;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setCallback(Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalReloadTileViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public showLoading(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 2

    .line 54
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    const v0, 0x7f09054a

    .line 55
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0905a9

    .line 56
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1105a4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0905a8

    .line 57
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    const v0, 0x7f1105a3

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    return-void
.end method
