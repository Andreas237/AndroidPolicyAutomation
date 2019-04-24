.class final Lcom/google/c/b/aa$a$a;
.super Lcom/google/c/b/p;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/b/aa$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/c/b/p<",
        "TV;TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/c/b/aa$a;


# direct methods
.method constructor <init>(Lcom/google/c/b/aa$a;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/google/c/b/aa$a$a;->a:Lcom/google/c/b/aa$a;

    invoke-direct {p0}, Lcom/google/c/b/p;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/c/b/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/n<",
            "TV;TK;>;"
        }
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/google/c/b/aa$a$a;->a:Lcom/google/c/b/aa$a;

    return-object v0
.end method

.method public c()Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "Ljava/util/Map$Entry<",
            "TV;TK;>;>;"
        }
    .end annotation

    .line 230
    invoke-virtual {p0}, Lcom/google/c/b/aa$a$a;->d()Lcom/google/c/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/m;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method f()Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "Ljava/util/Map$Entry<",
            "TV;TK;>;>;"
        }
    .end annotation

    .line 235
    new-instance v0, Lcom/google/c/b/aa$a$a$1;

    invoke-direct {v0, p0}, Lcom/google/c/b/aa$a$a$1;-><init>(Lcom/google/c/b/aa$a$a;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/google/c/b/aa$a$a;->a:Lcom/google/c/b/aa$a;

    iget-object v0, v0, Lcom/google/c/b/aa$a;->b:Lcom/google/c/b/aa;

    invoke-static {v0}, Lcom/google/c/b/aa;->c(Lcom/google/c/b/aa;)I

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 211
    invoke-virtual {p0}, Lcom/google/c/b/aa$a$a;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method
