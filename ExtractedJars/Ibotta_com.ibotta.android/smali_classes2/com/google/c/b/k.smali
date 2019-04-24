.class public abstract Lcom/google/c/b/k;
.super Ljava/util/AbstractCollection;
.source "IMASDK"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/b/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractCollection<",
        "TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 157
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 3

    .line 305
    invoke-virtual {p0}, Lcom/google/c/b/k;->c()Lcom/google/c/b/aj;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, p2, 0x1

    .line 306
    aput-object v1, p1, p2

    move p2, v2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 203
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 229
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method abstract b()Z
.end method

.method public abstract c()Lcom/google/c/b/aj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/aj<",
            "TE;>;"
        }
    .end annotation
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 267
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract contains(Ljava/lang/Object;)Z
.end method

.method public d()Lcom/google/c/b/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/c/b/m<",
            "TE;>;"
        }
    .end annotation

    .line 281
    invoke-virtual {p0}, Lcom/google/c/b/k;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 287
    new-instance v0, Lcom/google/c/b/z;

    invoke-virtual {p0}, Lcom/google/c/b/k;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/c/b/z;-><init>(Lcom/google/c/b/k;[Ljava/lang/Object;)V

    return-object v0

    .line 285
    :pswitch_0
    invoke-virtual {p0}, Lcom/google/c/b/k;->c()Lcom/google/c/b/aj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/c/b/aj;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/c/b/m;->a(Ljava/lang/Object;)Lcom/google/c/b/m;

    move-result-object v0

    return-object v0

    .line 283
    :pswitch_1
    invoke-static {}, Lcom/google/c/b/m;->e()Lcom/google/c/b/m;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 151
    invoke-virtual {p0}, Lcom/google/c/b/k;->c()Lcom/google/c/b/aj;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 216
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 242
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 255
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 167
    invoke-virtual {p0}, Lcom/google/c/b/k;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 169
    sget-object v0, Lcom/google/c/b/w;->a:[Ljava/lang/Object;

    return-object v0

    .line 171
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 172
    invoke-virtual {p0, v0, v1}, Lcom/google/c/b/k;->a([Ljava/lang/Object;I)I

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 179
    invoke-static {p1}, Lcom/google/c/a/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    invoke-virtual {p0}, Lcom/google/c/b/k;->size()I

    move-result v0

    .line 181
    array-length v1, p1

    if-ge v1, v0, :cond_0

    .line 182
    invoke-static {p1, v0}, Lcom/google/c/b/w;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 183
    :cond_0
    array-length v1, p1

    if-le v1, v0, :cond_1

    const/4 v1, 0x0

    .line 184
    aput-object v1, p1, v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 186
    invoke-virtual {p0, p1, v0}, Lcom/google/c/b/k;->a([Ljava/lang/Object;I)I

    return-object p1
.end method
