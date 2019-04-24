.class final Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$RandomAccessWrappedList;
.super Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RandomAccessWrappedList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedList;Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/List;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Ljava/util/List<TV;>;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V"
        }
    .end annotation

    .line 907
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedList;-><init>(Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap;Ljava/lang/Object;Ljava/util/List;Lcom/squareup/haha/guava/collect/AbstractMapBasedMultimap$WrappedCollection;)V

    .line 908
    return-void
.end method
