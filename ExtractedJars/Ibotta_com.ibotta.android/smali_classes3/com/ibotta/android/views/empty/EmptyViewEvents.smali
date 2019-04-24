.class public interface abstract Lcom/ibotta/android/views/empty/EmptyViewEvents;
.super Ljava/lang/Object;
.source "EmptyViewComponent.kt"

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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H\u0017\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u0091(0\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/ibotta/android/views/empty/EmptyViewEvents;",
        "Lcom/ibotta/android/views/list/IbottaListViewEvents;",
        "onActionButtonClick",
        "",
        "onEmptyViewClicked",
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
.method public abstract onActionButtonClick()V
.end method

.method public abstract onEmptyViewClicked()V
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation
.end method
