.class public final Lcom/google/c/b/t;
.super Ljava/lang/Object;
.source "IMASDK"


# static fields
.field static final a:Lcom/google/c/b/ak;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/c/b/ak<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    new-instance v0, Lcom/google/c/b/t$1;

    invoke-direct {v0}, Lcom/google/c/b/t$1;-><init>()V

    sput-object v0, Lcom/google/c/b/t;->a:Lcom/google/c/b/ak;

    .line 127
    new-instance v0, Lcom/google/c/b/t$4;

    invoke-direct {v0}, Lcom/google/c/b/t$4;-><init>()V

    sput-object v0, Lcom/google/c/b/t;->b:Ljava/util/Iterator;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/c/b/aj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/google/c/b/aj<",
            "TT;>;"
        }
    .end annotation

    .line 1026
    new-instance v0, Lcom/google/c/b/t$3;

    invoke-direct {v0, p0}, Lcom/google/c/b/t$3;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static varargs a([Ljava/lang/Object;)Lcom/google/c/b/aj;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lcom/google/c/b/aj<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 984
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/google/c/b/t;->a([Ljava/lang/Object;III)Lcom/google/c/b/ak;

    move-result-object p0

    return-object p0
.end method

.method static a()Lcom/google/c/b/ak;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/b/ak<",
            "TT;>;"
        }
    .end annotation

    .line 124
    sget-object v0, Lcom/google/c/b/t;->a:Lcom/google/c/b/ak;

    return-object v0
.end method

.method static a([Ljava/lang/Object;III)Lcom/google/c/b/ak;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;III)",
            "Lcom/google/c/b/ak<",
            "TT;>;"
        }
    .end annotation

    if-ltz p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 996
    :goto_0
    invoke-static {v0}, Lcom/google/c/a/h;->a(Z)V

    add-int v0, p1, p2

    .line 1000
    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/c/a/h;->a(III)V

    .line 1001
    invoke-static {p3, p2}, Lcom/google/c/a/h;->b(II)I

    if-nez p2, :cond_1

    .line 1003
    invoke-static {}, Lcom/google/c/b/t;->a()Lcom/google/c/b/ak;

    move-result-object p0

    return-object p0

    .line 1011
    :cond_1
    new-instance v0, Lcom/google/c/b/t$2;

    invoke-direct {v0, p2, p3, p0, p1}, Lcom/google/c/b/t$2;-><init>(II[Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static a(Ljava/util/Iterator;Lcom/google/c/a/i;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;",
            "Lcom/google/c/a/i<",
            "-TT;>;)Z"
        }
    .end annotation

    .line 641
    invoke-static {p0, p1}, Lcom/google/c/b/t;->b(Ljava/util/Iterator;Lcom/google/c/a/i;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static a(Ljava/util/Iterator;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "*>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 208
    invoke-static {p1}, Lcom/google/c/a/j;->a(Ljava/lang/Object;)Lcom/google/c/a/i;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/c/b/t;->a(Ljava/util/Iterator;Lcom/google/c/a/i;)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/Iterator;Ljava/util/Iterator;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "*>;",
            "Ljava/util/Iterator<",
            "*>;)Z"
        }
    .end annotation

    .line 274
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 275
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 278
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 279
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 280
    invoke-static {v0, v2}, Lcom/google/c/a/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 284
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static b(Ljava/util/Iterator;Lcom/google/c/a/i;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "TT;>;",
            "Lcom/google/c/a/i<",
            "-TT;>;)I"
        }
    .end annotation

    const-string v0, "predicate"

    .line 726
    invoke-static {p1, v0}, Lcom/google/c/a/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 727
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 728
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 729
    invoke-interface {p1, v1}, Lcom/google/c/a/i;->a(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method
