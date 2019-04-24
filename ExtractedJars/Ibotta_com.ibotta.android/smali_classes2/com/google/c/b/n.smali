.class public abstract Lcom/google/c/b/n;
.super Ljava/lang/Object;
.source "IMASDK"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field static final a:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "**>;"
        }
    .end annotation
.end field


# instance fields
.field private transient b:Lcom/google/c/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field private transient c:Lcom/google/c/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/s<",
            "TK;>;"
        }
    .end annotation
.end field

.field private transient d:Lcom/google/c/b/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/k<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    .line 372
    new-array v0, v0, [Ljava/util/Map$Entry;

    sput-object v0, Lcom/google/c/b/n;->a:[Ljava/util/Map$Entry;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(ZLjava/lang/String;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/util/Map$Entry<",
            "**>;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-void

    .line 136
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x22

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Multiple entries with same "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation

    .line 70
    invoke-static {p0, p1}, Lcom/google/c/b/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/j;

    move-result-object p0

    return-object p0
.end method

.method static c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/c/b/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Lcom/google/c/b/o<",
            "TK;TV;>;"
        }
    .end annotation

    .line 122
    new-instance v0, Lcom/google/c/b/o;

    invoke-direct {v0, p0, p1}, Lcom/google/c/b/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e()Lcom/google/c/b/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/b/n<",
            "TK;TV;>;"
        }
    .end annotation

    .line 60
    invoke-static {}, Lcom/google/c/b/j;->a()Lcom/google/c/b/j;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 444
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 454
    invoke-virtual {p0, p1}, Lcom/google/c/b/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 459
    invoke-virtual {p0}, Lcom/google/c/b/n;->d()Lcom/google/c/b/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/c/b/k;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TV;>;"
        }
    .end annotation

    .line 522
    iget-object v0, p0, Lcom/google/c/b/n;->d:Lcom/google/c/b/k;

    if-nez v0, :cond_0

    .line 523
    invoke-virtual {p0}, Lcom/google/c/b/n;->k()Lcom/google/c/b/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/c/b/n;->d:Lcom/google/c/b/k;

    :cond_0
    return-object v0
.end method

.method public synthetic entrySet()Ljava/util/Set;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/c/b/n;->f()Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 621
    invoke-static {p0, p1}, Lcom/google/c/b/v;->a(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 475
    iget-object v0, p0, Lcom/google/c/b/n;->b:Lcom/google/c/b/s;

    if-nez v0, :cond_0

    .line 476
    invoke-virtual {p0}, Lcom/google/c/b/n;->g()Lcom/google/c/b/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/c/b/n;->b:Lcom/google/c/b/s;

    :cond_0
    return-object v0
.end method

.method abstract g()Lcom/google/c/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation
.end method

.method public h()Lcom/google/c/b/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/s<",
            "TK;>;"
        }
    .end annotation

    .line 490
    iget-object v0, p0, Lcom/google/c/b/n;->c:Lcom/google/c/b/s;

    if-nez v0, :cond_0

    .line 491
    invoke-virtual {p0}, Lcom/google/c/b/n;->i()Lcom/google/c/b/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/c/b/n;->c:Lcom/google/c/b/s;

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 628
    invoke-virtual {p0}, Lcom/google/c/b/n;->f()Lcom/google/c/b/s;

    move-result-object v0

    invoke-static {v0}, Lcom/google/c/b/ae;->a(Ljava/util/Set;)I

    move-result v0

    return v0
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

    .line 495
    invoke-virtual {p0}, Lcom/google/c/b/n;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/c/b/s;->g()Lcom/google/c/b/s;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/c/b/q;

    invoke-direct {v0, p0}, Lcom/google/c/b/q;-><init>(Lcom/google/c/b/n;)V

    :goto_0
    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 449
    invoke-virtual {p0}, Lcom/google/c/b/n;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method j()Lcom/google/c/b/aj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TK;>;"
        }
    .end annotation

    .line 499
    invoke-virtual {p0}, Lcom/google/c/b/n;->f()Lcom/google/c/b/s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/s;->c()Lcom/google/c/b/aj;

    move-result-object v0

    .line 500
    new-instance v1, Lcom/google/c/b/n$1;

    invoke-direct {v1, p0, v0}, Lcom/google/c/b/n$1;-><init>(Lcom/google/c/b/n;Lcom/google/c/b/aj;)V

    return-object v1
.end method

.method k()Lcom/google/c/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/k<",
            "TV;>;"
        }
    .end annotation

    .line 527
    new-instance v0, Lcom/google/c/b/r;

    invoke-direct {v0, p0}, Lcom/google/c/b/r;-><init>(Lcom/google/c/b/n;)V

    return-object v0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/c/b/n;->h()Lcom/google/c/b/s;

    move-result-object v0

    return-object v0
.end method

.method abstract l()Z
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 407
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 432
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 420
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 637
    invoke-static {p0}, Lcom/google/c/b/v;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/c/b/n;->d()Lcom/google/c/b/k;

    move-result-object v0

    return-object v0
.end method
