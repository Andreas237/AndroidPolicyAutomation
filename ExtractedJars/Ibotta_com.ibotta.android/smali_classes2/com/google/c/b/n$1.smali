.class Lcom/google/c/b/n$1;
.super Lcom/google/c/b/aj;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/n;->j()Lcom/google/c/b/aj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/aj<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/aj;


# direct methods
.method constructor <init>(Lcom/google/c/b/n;Lcom/google/c/b/aj;)V
    .locals 0

    .line 500
    iput-object p2, p0, Lcom/google/c/b/n$1;->a:Lcom/google/c/b/aj;

    invoke-direct {p0}, Lcom/google/c/b/aj;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 503
    iget-object v0, p0, Lcom/google/c/b/n$1;->a:Lcom/google/c/b/aj;

    invoke-virtual {v0}, Lcom/google/c/b/aj;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 508
    iget-object v0, p0, Lcom/google/c/b/n$1;->a:Lcom/google/c/b/aj;

    invoke-virtual {v0}, Lcom/google/c/b/aj;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
