.class final Lcom/squareup/haha/guava/collect/Iterables$2;
.super Lcom/squareup/haha/guava/collect/FluentIterable;
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
        "Lcom/squareup/haha/guava/collect/FluentIterable<TT;>;"
    }
.end annotation


# instance fields
.field private synthetic val$inputs:Ljava/lang/Iterable;


# direct methods
.method constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .line 495
    iput-object p1, p0, Lcom/squareup/haha/guava/collect/Iterables$2;->val$inputs:Ljava/lang/Iterable;

    invoke-direct {p0}, Lcom/squareup/haha/guava/collect/FluentIterable;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TT;>;"
        }
    .end annotation

    .line 498
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Iterables$2;->val$inputs:Ljava/lang/Iterable;

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Iterables;->access$100(Ljava/lang/Iterable;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/haha/guava/collect/Iterators;->concat(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
