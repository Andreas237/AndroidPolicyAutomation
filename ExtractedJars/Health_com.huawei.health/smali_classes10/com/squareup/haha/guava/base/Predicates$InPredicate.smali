.class final Lcom/squareup/haha/guava/base/Predicates$InPredicate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/guava/base/Predicate;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/base/Predicates;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "InPredicate"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lcom/squareup/haha/guava/base/Predicate<TT;>;Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private final target:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<*>;)V"
        }
    .end annotation

    .line 506
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 507
    invoke-static {p1}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    .line 508
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;B)V
    .locals 0

    .line 503
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/base/Predicates$InPredicate;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 513
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 514
    .line 515
    :catch_0
    const/4 v0, 0x0

    return v0

    .line 516
    .line 517
    :catch_1
    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 522
    instance-of v0, p1, Lcom/squareup/haha/guava/base/Predicates$InPredicate;

    if-eqz v0, :cond_0

    .line 523
    move-object v2, p1

    check-cast v2, Lcom/squareup/haha/guava/base/Predicates$InPredicate;

    .line 524
    iget-object v0, p0, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    iget-object v1, v2, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 526
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 530
    iget-object v0, p0, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Predicates.in("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/squareup/haha/guava/base/Predicates$InPredicate;->target:Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
