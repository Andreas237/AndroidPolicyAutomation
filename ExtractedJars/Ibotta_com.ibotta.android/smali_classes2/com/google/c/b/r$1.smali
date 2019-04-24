.class Lcom/google/c/b/r$1;
.super Lcom/google/c/b/aj;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/r;->c()Lcom/google/c/b/aj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/aj<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/c/b/aj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/aj<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/google/c/b/r;


# direct methods
.method constructor <init>(Lcom/google/c/b/r;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/google/c/b/r$1;->b:Lcom/google/c/b/r;

    invoke-direct {p0}, Lcom/google/c/b/aj;-><init>()V

    .line 48
    iget-object p1, p0, Lcom/google/c/b/r$1;->b:Lcom/google/c/b/r;

    invoke-static {p1}, Lcom/google/c/b/r;->a(Lcom/google/c/b/r;)Lcom/google/c/b/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/c/b/n;->f()Lcom/google/c/b/s;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/c/b/s;->c()Lcom/google/c/b/aj;

    move-result-object p1

    iput-object p1, p0, Lcom/google/c/b/r$1;->a:Lcom/google/c/b/aj;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/google/c/b/r$1;->a:Lcom/google/c/b/aj;

    invoke-virtual {v0}, Lcom/google/c/b/aj;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/google/c/b/r$1;->a:Lcom/google/c/b/aj;

    invoke-virtual {v0}, Lcom/google/c/b/aj;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
