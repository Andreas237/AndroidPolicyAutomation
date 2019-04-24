.class public abstract Lcom/google/c/b/m;
.super Lcom/google/c/b/k;
.source "IMASDK"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/c/b/k<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 362
    invoke-direct {p0}, Lcom/google/c/b/k;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 76
    new-instance v0, Lcom/google/c/b/ag;

    invoke-direct {v0, p0}, Lcom/google/c/b/ag;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 235
    instance-of v0, p0, Lcom/google/c/b/k;

    if-eqz v0, :cond_1

    .line 237
    check-cast p0, Lcom/google/c/b/k;

    invoke-virtual {p0}, Lcom/google/c/b/k;->d()Lcom/google/c/b/m;

    move-result-object p0

    .line 238
    invoke-virtual {p0}, Lcom/google/c/b/m;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/c/b/m;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/c/b/m;->a([Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object p0

    :cond_0
    return-object p0

    .line 240
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/c/b/m;->b([Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object p0

    return-object p0
.end method

.method static a([Ljava/lang/Object;)Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 339
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/google/c/b/m;->b([Ljava/lang/Object;I)Lcom/google/c/b/m;

    move-result-object p0

    return-object p0
.end method

.method private static varargs b([Ljava/lang/Object;)Lcom/google/c/b/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 330
    invoke-static {p0}, Lcom/google/c/b/w;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/google/c/b/m;->a([Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object p0

    return-object p0
.end method

.method static b([Ljava/lang/Object;I)Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    .line 355
    array-length v0, p0

    if-ge p1, v0, :cond_0

    .line 356
    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    .line 352
    :pswitch_0
    new-instance p1, Lcom/google/c/b/ag;

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-direct {p1, p0}, Lcom/google/c/b/ag;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 349
    :pswitch_1
    invoke-static {}, Lcom/google/c/b/m;->e()Lcom/google/c/b/m;

    move-result-object p0

    return-object p0

    .line 358
    :cond_0
    :goto_0
    new-instance p1, Lcom/google/c/b/ab;

    invoke-direct {p1, p0}, Lcom/google/c/b/ab;-><init>([Ljava/lang/Object;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e()Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 64
    sget-object v0, Lcom/google/c/b/ab;->a:Lcom/google/c/b/m;

    return-object v0
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 4

    .line 531
    invoke-virtual {p0}, Lcom/google/c/b/m;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    .line 533
    invoke-virtual {p0, v1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public a(I)Lcom/google/c/b/ak;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/c/b/ak<",
            "TE;>;"
        }
    .end annotation

    .line 378
    new-instance v0, Lcom/google/c/b/m$1;

    invoke-virtual {p0}, Lcom/google/c/b/m;->size()I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lcom/google/c/b/m$1;-><init>(Lcom/google/c/b/m;II)V

    return-object v0
.end method

.method public a(II)Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 411
    invoke-virtual {p0}, Lcom/google/c/b/m;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/google/c/a/h;->a(III)V

    sub-int v0, p2, p1

    .line 413
    invoke-virtual {p0}, Lcom/google/c/b/m;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 422
    invoke-virtual {p0, p1, p2}, Lcom/google/c/b/m;->b(II)Lcom/google/c/b/m;

    move-result-object p1

    return-object p1

    .line 420
    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/c/b/m;->a(Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object p1

    return-object p1

    .line 418
    :pswitch_1
    invoke-static {}, Lcom/google/c/b/m;->e()Lcom/google/c/b/m;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 502
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 477
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method b(II)Lcom/google/c/b/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 432
    new-instance v0, Lcom/google/c/b/m$a;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, Lcom/google/c/b/m$a;-><init>(Lcom/google/c/b/m;II)V

    return-object v0
.end method

.method public c()Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TE;>;"
        }
    .end annotation

    .line 368
    invoke-virtual {p0}, Lcom/google/c/b/m;->f()Lcom/google/c/b/ak;

    move-result-object v0

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 398
    invoke-virtual {p0, p1}, Lcom/google/c/b/m;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d()Lcom/google/c/b/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 612
    invoke-static {p0, p1}, Lcom/google/c/b/u;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Lcom/google/c/b/ak;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/ak<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 373
    invoke-virtual {p0, v0}, Lcom/google/c/b/m;->a(I)Lcom/google/c/b/ak;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 618
    invoke-virtual {p0}, Lcom/google/c/b/m;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    .line 620
    invoke-virtual {p0, v2}, Lcom/google/c/b/m;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    not-int v1, v1

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 388
    :cond_0
    invoke-static {p0, p1}, Lcom/google/c/b/u;->b(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/google/c/b/m;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 393
    :cond_0
    invoke-static {p0, p1}, Lcom/google/c/b/u;->c(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/google/c/b/m;->f()Lcom/google/c/b/ak;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 52
    invoke-virtual {p0, p1}, Lcom/google/c/b/m;->a(I)Lcom/google/c/b/ak;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 515
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 490
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/google/c/b/m;->a(II)Lcom/google/c/b/m;

    move-result-object p1

    return-object p1
.end method
