.class abstract Lcom/google/c/b/p;
.super Lcom/google/c/b/s;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/s<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/google/c/b/s;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Lcom/google/c/b/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method b()Z
    .locals 1

    .line 80
    invoke-virtual {p0}, Lcom/google/c/b/p;->a()Lcom/google/c/b/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/n;->l()Z

    move-result v0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 70
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 71
    check-cast p1, Ljava/util/Map$Entry;

    .line 72
    invoke-virtual {p0}, Lcom/google/c/b/p;->a()Lcom/google/c/b/n;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/c/b/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method e()Z
    .locals 1

    .line 86
    invoke-virtual {p0}, Lcom/google/c/b/p;->a()Lcom/google/c/b/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/n;->m()Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 91
    invoke-virtual {p0}, Lcom/google/c/b/p;->a()Lcom/google/c/b/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/n;->hashCode()I

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .line 65
    invoke-virtual {p0}, Lcom/google/c/b/p;->a()Lcom/google/c/b/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/n;->size()I

    move-result v0

    return v0
.end method
