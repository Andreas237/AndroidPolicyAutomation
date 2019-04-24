.class public abstract Lorg/c/c/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/b/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/c/c/b/e<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lorg/c/c/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/c/c/b/a;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/c/c/b/a;->a(Ljava/util/List;)V

    return-void
.end method

.method protected varargs constructor <init>([Lorg/c/c/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/c/c/b/a;->a:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/c/c/b/a;->a(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/j;",
            ")",
            "Ljava/lang/Long;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Lorg/c/c/d;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/a;->b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b/a;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Object;)Lorg/c/c/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lorg/c/c/j;"
        }
    .end annotation

    invoke-virtual {p0}, Lorg/c/c/b/a;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/c/c/j;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected abstract a(Ljava/lang/Object;Lorg/c/c/g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation
.end method

.method public final a(Ljava/lang/Object;Lorg/c/c/j;Lorg/c/c/g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/j;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v1

    if-nez v1, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lorg/c/c/j;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lorg/c/c/j;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/c/c/b/a;->a(Ljava/lang/Object;)Lorg/c/c/j;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v0, p2}, Lorg/c/c/c;->a(Lorg/c/c/j;)V

    :cond_2
    invoke-virtual {v0}, Lorg/c/c/c;->b()J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long p2, v1, v3

    if-nez p2, :cond_3

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/a;->a(Ljava/lang/Object;Lorg/c/c/j;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/c/c/c;->a(J)V

    :cond_3
    invoke-virtual {p0, p1, p3}, Lorg/c/c/b/a;->a(Ljava/lang/Object;Lorg/c/c/g;)V

    invoke-interface {p3}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;)V"
        }
    .end annotation

    const-string v0, "\'supportedMediaTypes\' must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/util/Collection;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lorg/c/c/b/a;->a:Ljava/util/List;

    return-void
.end method

.method protected abstract a(Ljava/lang/Class;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public a(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/c/c/b/a;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/c/c/b/a;->a(Lorg/c/c/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected a(Lorg/c/c/j;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/b/a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/c/c/j;

    invoke-virtual {v2, p1}, Lorg/c/c/j;->a(Lorg/c/c/j;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method protected abstract b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Lorg/c/c/d;",
            ")TT;"
        }
    .end annotation
.end method

.method public b(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/c/c/b/a;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Lorg/c/c/b/a;->b(Lorg/c/c/j;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected b(Lorg/c/c/j;)Z
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    sget-object v1, Lorg/c/c/j;->a:Lorg/c/c/j;

    invoke-virtual {v1, p1}, Lorg/c/c/j;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/b/a;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/c/c/j;

    invoke-virtual {v2, p1}, Lorg/c/c/j;->b(Lorg/c/c/j;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    return v0
.end method
