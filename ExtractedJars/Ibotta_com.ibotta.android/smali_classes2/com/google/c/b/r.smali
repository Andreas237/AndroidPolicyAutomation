.class final Lcom/google/c/b/r;
.super Lcom/google/c/b/k;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/k<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/c/b/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/c/b/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/c/b/n<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Lcom/google/c/b/k;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/google/c/b/r;->a:Lcom/google/c/b/n;

    return-void
.end method

.method static synthetic a(Lcom/google/c/b/r;)Lcom/google/c/b/n;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/google/c/b/r;->a:Lcom/google/c/b/n;

    return-object p0
.end method


# virtual methods
.method b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TV;>;"
        }
    .end annotation

    .line 47
    new-instance v0, Lcom/google/c/b/r$1;

    invoke-direct {v0, p0}, Lcom/google/c/b/r$1;-><init>(Lcom/google/c/b/r;)V

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/google/c/b/r;->c()Lcom/google/c/b/aj;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/c/b/t;->a(Ljava/util/Iterator;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TV;>;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/google/c/b/r;->a:Lcom/google/c/b/n;

    invoke-virtual {v0}, Lcom/google/c/b/n;->f()Lcom/google/c/b/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/s;->d()Lcom/google/c/b/m;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/google/c/b/r$2;

    invoke-direct {v1, p0, v0}, Lcom/google/c/b/r$2;-><init>(Lcom/google/c/b/r;Lcom/google/c/b/m;)V

    return-object v1
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/google/c/b/r;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/google/c/b/r;->a:Lcom/google/c/b/n;

    invoke-virtual {v0}, Lcom/google/c/b/n;->size()I

    move-result v0

    return v0
.end method
