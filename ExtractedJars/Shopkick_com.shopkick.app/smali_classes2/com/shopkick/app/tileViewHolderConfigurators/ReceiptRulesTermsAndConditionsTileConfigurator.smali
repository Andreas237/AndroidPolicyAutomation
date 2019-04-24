.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReceiptRulesTermsAndConditionsTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final LEARN_MORE:Ljava/lang/String; = "LEARN_MORE"

.field public static final SHORT_TEXT:Ljava/lang/String; = "SHORT_TEXT"


# instance fields
.field private learnMoreWebview:Ljava/lang/String;

.field private screenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 24
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;->screenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01d8

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    const v0, 0x7f09072e

    .line 34
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    .line 35
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    const-string v1, "LEARN_MORE"

    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;->learnMoreWebview:Ljava/lang/String;

    .line 36
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;->learnMoreWebview:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 37
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const p2, 0x7f09072f

    .line 40
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f110524

    invoke-virtual {p2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;->screenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_0

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "background"

    const-string v2, "paper_texture"

    .line 50
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "url"

    .line 51
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptRulesTermsAndConditionsTileConfigurator;->learnMoreWebview:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    const-class v1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
