.class public interface abstract Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;
.super Ljava/lang/Object;
.source "RetailerSSCardViewEvents.kt"

# interfaces
.implements Lcom/ibotta/android/views/list/IbottaListViewEvents;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u0091(0\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        "onRetailerClicked",
        "",
        "contentId",
        "Lcom/ibotta/android/apiandroid/content/ContentId;",
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
.method public abstract onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
