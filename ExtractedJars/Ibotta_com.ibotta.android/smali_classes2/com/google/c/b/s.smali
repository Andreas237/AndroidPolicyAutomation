.class public abstract Lcom/google/c/b/s;
.super Lcom/google/c/b/k;
.source "IMASDK"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/k<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private transient a:Lcom/google/c/b/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 309
    invoke-direct {p0}, Lcom/google/c/b/k;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/c/b/s<",
            "TE;>;"
        }
    .end annotation

    .line 61
    new-instance v0, Lcom/google/c/b/ah;

    invoke-direct {v0, p0}, Lcom/google/c/b/ah;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static g()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/b/s<",
            "TE;>;"
        }
    .end annotation

    .line 52
    sget-object v0, Lcom/google/c/b/ad;->a:Lcom/google/c/b/ad;

    return-object v0
.end method


# virtual methods
.method public abstract c()Lcom/google/c/b/aj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TE;>;"
        }
    .end annotation
.end method

.method public d()Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 345
    iget-object v0, p0, Lcom/google/c/b/s;->a:Lcom/google/c/b/m;

    if-nez v0, :cond_0

    .line 346
    invoke-virtual {p0}, Lcom/google/c/b/s;->f()Lcom/google/c/b/m;

    move-result-object v0

    iput-object v0, p0, Lcom/google/c/b/s;->a:Lcom/google/c/b/m;

    :cond_0
    return-object v0
.end method

.method e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 320
    :cond_0
    instance-of v0, p1, Lcom/google/c/b/s;

    if-eqz v0, :cond_1

    .line 321
    invoke-virtual {p0}, Lcom/google/c/b/s;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/c/b/s;

    .line 322
    invoke-virtual {v0}, Lcom/google/c/b/s;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    invoke-virtual {p0}, Lcom/google/c/b/s;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 326
    :cond_1
    invoke-static {p0, p1}, Lcom/google/c/b/ae;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method f()Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 350
    new-instance v0, Lcom/google/c/b/z;

    invoke-virtual {p0}, Lcom/google/c/b/s;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/z;-><init>(Lcom/google/c/b/k;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 331
    invoke-static {p0}, Lcom/google/c/b/ae;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 43
    invoke-virtual {p0}, Lcom/google/c/b/s;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method
