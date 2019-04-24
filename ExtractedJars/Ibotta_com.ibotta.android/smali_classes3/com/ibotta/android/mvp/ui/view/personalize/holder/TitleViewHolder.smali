.class public Lcom/ibotta/android/mvp/ui/view/personalize/holder/TitleViewHolder;
.super Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;
.source "TitleViewHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder<",
        "Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;",
        ">;"
    }
.end annotation


# instance fields
.field private final pshvHeader:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/AbstractPersonalStoreViewHolder;-><init>(Landroid/view/View;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/TitleViewHolder;->pshvHeader:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/personalize/holder/TitleViewHolder;->bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V

    return-void
.end method

.method public bind(Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresRecyclerListener;)V
    .locals 1

    .line 20
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/holder/TitleViewHolder;->pshvHeader:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/personalize/row/TitleRow;->getPrompt()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresHeaderView;->setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V

    return-void
.end method
