.class public interface abstract Lcom/squareup/haha/trove/TObjectHashingStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/squareup/haha/trove/TObjectIdentityHashingStrategy;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TObjectIdentityHashingStrategy;-><init>()V

    .line 44
    new-instance v0, Lcom/squareup/haha/trove/TObjectCanonicalHashingStrategy;

    invoke-direct {v0}, Lcom/squareup/haha/trove/TObjectCanonicalHashingStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract computeHashCode(Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method public abstract equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation
.end method
