.class Lcom/google/c/b/aa$a$a$1;
.super Lcom/google/c/b/i;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/c/b/aa$a$a;->f()Lcom/google/c/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/i<",
        "Ljava/util/Map$Entry<",
        "TV;TK;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/aa$a$a;


# direct methods
.method constructor <init>(Lcom/google/c/b/aa$a$a;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/google/c/b/aa$a$a$1;->a:Lcom/google/c/b/aa$a$a;

    invoke-direct {p0}, Lcom/google/c/b/i;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "Ljava/util/Map$Entry<",
            "TV;TK;>;>;"
        }
    .end annotation

    .line 244
    iget-object v0, p0, Lcom/google/c/b/aa$a$a$1;->a:Lcom/google/c/b/aa$a$a;

    return-object v0
.end method

.method public b(I)Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TV;TK;>;"
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/google/c/b/aa$a$a$1;->a:Lcom/google/c/b/aa$a$a;

    iget-object v0, v0, Lcom/google/c/b/aa$a$a;->a:Lcom/google/c/b/aa$a;

    iget-object v0, v0, Lcom/google/c/b/aa$a;->b:Lcom/google/c/b/aa;

    invoke-static {v0}, Lcom/google/c/b/aa;->d(Lcom/google/c/b/aa;)[Ljava/util/Map$Entry;

    move-result-object v0

    aget-object p1, v0, p1

    .line 239
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/c/b/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 235
    invoke-virtual {p0, p1}, Lcom/google/c/b/aa$a$a$1;->b(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method
