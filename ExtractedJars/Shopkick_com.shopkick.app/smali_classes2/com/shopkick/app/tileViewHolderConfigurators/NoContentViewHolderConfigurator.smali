.class public Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "NoContentViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;,
        Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$ReloadClick;
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

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->context:Landroid/content/Context;

    return-void
.end method

.method public static getNoContentTile(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-static {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->getNoContentTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p0

    return-object p0
.end method

.method public static getNoContentTile(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 2

    .line 61
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;-><init>()V

    const/16 v1, 0x3ed

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->type:Ljava/lang/Integer;

    .line 63
    iput-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 64
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0122

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 36
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0904ae

    .line 38
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 39
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0905a8

    .line 41
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object p1

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 44
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 46
    :goto_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 47
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 48
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 49
    new-instance p2, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$ReloadClick;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-direct {p2, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$ReloadClick;-><init>(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    const/16 p2, 0x8

    .line 51
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 52
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method public setCallback(Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator$IReloadButtonClickCallback;)V
    .locals 1

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/NoContentViewHolderConfigurator;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method
