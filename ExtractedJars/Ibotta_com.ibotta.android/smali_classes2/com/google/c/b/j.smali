.class public abstract Lcom/google/c/b/j;
.super Lcom/google/c/b/n;
.source "IMASDK"

# interfaces
.implements Lcom/google/c/b/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/n<",
        "TK;TV;>;",
        "Lcom/google/c/b/c<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 295
    invoke-direct {p0}, Lcom/google/c/b/n;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/c/b/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/b/j<",
            "TK;TV;>;"
        }
    .end annotation

    .line 42
    sget-object v0, Lcom/google/c/b/aa;->b:Lcom/google/c/b/aa;

    return-object v0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Lcom/google/c/b/j<",
            "TK;TV;>;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/google/c/b/af;

    invoke-direct {v0, p0, p1}, Lcom/google/c/b/af;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lcom/google/c/b/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/j<",
            "TV;TK;>;"
        }
    .end annotation
.end method

.method public c()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "TV;>;"
        }
    .end annotation

    .line 312
    invoke-virtual {p0}, Lcom/google/c/b/j;->b()Lcom/google/c/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/j;->h()Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d()Lcom/google/c/b/k;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/google/c/b/j;->c()Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/google/c/b/j;->c()Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method
