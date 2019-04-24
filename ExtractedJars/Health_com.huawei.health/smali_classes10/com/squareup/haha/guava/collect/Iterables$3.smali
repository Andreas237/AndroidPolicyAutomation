.class final Lcom/squareup/haha/guava/collect/Iterables$3;
.super Lcom/squareup/haha/guava/collect/TransformedIterator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/Iterables;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/TransformedIterator<Ljava/lang/Iterable<+TT;>;Ljava/util/Iterator<+TT;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 509
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/TransformedIterator;-><init>(Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method final synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 509
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 1512
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 509
    return-object v0
.end method
