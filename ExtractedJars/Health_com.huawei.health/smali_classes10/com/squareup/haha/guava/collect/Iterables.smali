.class public final Lcom/squareup/haha/guava/collect/Iterables;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic access$100(Ljava/lang/Iterable;)Ljava/util/Iterator;
    .locals 3

    .line 60
    move-object v2, p0

    .line 1508
    new-instance v0, Lcom/squareup/haha/guava/collect/Iterables$3;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/haha/guava/collect/Iterables$3;-><init>(Ljava/util/Iterator;)V

    .line 60
    return-object v0
.end method

.method public static concat(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/Iterable<+TT;>;Ljava/lang/Iterable<+TT;>;)Ljava/lang/Iterable<TT;>;"
        }
    .end annotation

    .line 435
    invoke-static {p0, p1}, Lcom/squareup/haha/guava/collect/ImmutableList;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/ImmutableList;

    move-result-object v1

    .line 1494
    invoke-static {v1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    new-instance v0, Lcom/squareup/haha/guava/collect/Iterables$2;

    invoke-direct {v0, v1}, Lcom/squareup/haha/guava/collect/Iterables$2;-><init>(Ljava/lang/Iterable;)V

    .line 435
    return-object v0
.end method

.method public static toString(Ljava/lang/Iterable;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<*>;)Ljava/lang/String;"
        }
    .end annotation

    .line 278
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Iterators;->toString(Ljava/util/Iterator;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
