.class public interface abstract Lcom/ibotta/android/views/components/ViewComponent;
.super Ljava/lang/Object;
.source "ViewComponent.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ViewStateType::",
        "Lcom/ibotta/android/views/components/ViewState;",
        "ViewEventsType::",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u0002*\u0008\u0008\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "ViewStateType",
        "Lcom/ibotta/android/views/components/ViewState;",
        "ViewEventsType",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "",
        "bindViewEvents",
        "",
        "viewEvents",
        "(Lcom/ibotta/android/views/components/ViewEvents;)V",
        "updateViewState",
        "viewState",
        "(Lcom/ibotta/android/views/components/ViewState;)V",
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
.method public abstract bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TViewEventsType;)V"
        }
    .end annotation
.end method

.method public abstract updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TViewStateType;)V"
        }
    .end annotation
.end method
