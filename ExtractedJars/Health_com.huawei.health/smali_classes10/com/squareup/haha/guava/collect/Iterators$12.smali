.class final Lcom/squareup/haha/guava/collect/Iterators$12;
.super Lcom/squareup/haha/guava/collect/UnmodifiableIterator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/guava/collect/Iterators;->singletonIterator(Ljava/lang/Object;)Lcom/squareup/haha/guava/collect/UnmodifiableIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/UnmodifiableIterator<TT;>;"
    }
.end annotation


# instance fields
.field private done:Z

.field private synthetic val$value:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1068
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/Iterators$12;->val$value:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/UnmodifiableIterator;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1072
    iget-boolean v0, p0, Lcom/squareup/haha/guava/collect/Iterators$12;->done:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1076
    iget-boolean v0, p0, Lcom/squareup/haha/guava/collect/Iterators$12;->done:Z

    if-eqz v0, :cond_0

    .line 1077
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 1079
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/haha/guava/collect/Iterators$12;->done:Z

    .line 1080
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Iterators$12;->val$value:Ljava/lang/Object;

    return-object v0
.end method
