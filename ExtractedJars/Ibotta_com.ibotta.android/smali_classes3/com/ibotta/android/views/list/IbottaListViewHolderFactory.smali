.class public interface abstract Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;
.super Ljava/lang/Object;
.source "IbottaListViewHolderFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008f\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/ibotta/android/views/list/IbottaListViewHolderFactory;",
        "",
        "createViewHolder",
        "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;",
        "parent",
        "Landroid/view/ViewGroup;",
        "type",
        "",
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
.method public abstract createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/views/list/holder/IbottaListViewHolder;
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/ibotta/android/views/list/holder/IbottaListViewHolder<",
            "**>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
