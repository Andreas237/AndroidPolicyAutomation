.class public Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;
.source "PersonalStoreViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final pscvStore:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;-><init>(Landroid/view/View;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolder;->pscvStore:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolder;->pscvStore:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setListener(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView$PersonalStoreCardListener;)V

    .line 21
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/PersonalStoreViewHolder;->pscvStore:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreCardView;->setPersonalStoresItem(Lcom/ibotta/android/view/model/PersonalStoresItem;)V

    return-void
.end method
