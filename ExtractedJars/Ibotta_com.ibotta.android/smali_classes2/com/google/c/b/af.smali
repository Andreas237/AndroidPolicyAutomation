.class final Lcom/google/c/b/af;
.super Lcom/google/c/b/j;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/j<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final transient b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field final transient c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field transient d:Lcom/google/c/b/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/j<",
            "TV;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Lcom/google/c/b/j;-><init>()V

    .line 40
    invoke-static {p1, p2}, Lcom/google/c/b/e;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    iput-object p1, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    .line 42
    iput-object p2, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/c/b/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/c/b/j<",
            "TV;TK;>;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Lcom/google/c/b/j;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    .line 47
    iput-object p2, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    .line 48
    iput-object p3, p0, Lcom/google/c/b/af;->d:Lcom/google/c/b/j;

    return-void
.end method


# virtual methods
.method public b()Lcom/google/c/b/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/j<",
            "TV;TK;>;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/google/c/b/af;->d:Lcom/google/c/b/j;

    if-nez v0, :cond_0

    .line 95
    new-instance v0, Lcom/google/c/b/af;

    iget-object v1, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p0}, Lcom/google/c/b/af;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/c/b/j;)V

    iput-object v0, p0, Lcom/google/c/b/af;->d:Lcom/google/c/b/j;

    return-object v0

    :cond_0
    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method g()Lcom/google/c/b/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/google/c/b/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Lcom/google/c/b/s;->a(Ljava/lang/Object;)Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/c/b/af;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method i()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "TK;>;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/google/c/b/af;->b:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/c/b/s;->a(Ljava/lang/Object;)Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
