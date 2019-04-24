.class abstract Lcom/google/c/b/i;
.super Lcom/google/c/b/m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/m<",
        "TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/google/c/b/m;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Lcom/google/c/b/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TE;>;"
        }
    .end annotation
.end method

.method b()Z
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/google/c/b/i;->a()Lcom/google/c/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/k;->b()Z

    move-result v0

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 41
    invoke-virtual {p0}, Lcom/google/c/b/i;->a()Lcom/google/c/b/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/c/b/k;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 51
    invoke-virtual {p0}, Lcom/google/c/b/i;->a()Lcom/google/c/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/k;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/google/c/b/i;->a()Lcom/google/c/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/k;->size()I

    move-result v0

    return v0
.end method
