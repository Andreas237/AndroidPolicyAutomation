.class public interface abstract Lcom/ibotta/android/views/search/SearchViewEvents;
.super Ljava/lang/Object;
.source "SearchViewComponent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH&J\u0008\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/views/search/SearchViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onLeftButtonClicked",
        "",
        "viewState",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "onRightButtonClicked",
        "onSearch",
        "searchTerm",
        "",
        "onSearchTextChanged",
        "onSearchTextFocusChanged",
        "isFocused",
        "",
        "onSearchTextPostDelay",
        "searchText",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract onLeftButtonClicked(Lcom/ibotta/android/views/search/SearchViewState;)V
    .param p1    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onRightButtonClicked(Lcom/ibotta/android/views/search/SearchViewState;)V
    .param p1    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onSearch(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract onSearchTextChanged()V
.end method

.method public abstract onSearchTextFocusChanged(Z)V
.end method

.method public abstract onSearchTextPostDelay(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
