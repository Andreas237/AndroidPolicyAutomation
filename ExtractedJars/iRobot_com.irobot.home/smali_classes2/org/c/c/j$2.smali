.class final Lorg/c/c/j$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/c/c/j;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/j;Lorg/c/c/j;)I
    .locals 5

    invoke-virtual {p1}, Lorg/c/c/j;->f()D

    move-result-wide v0

    invoke-virtual {p2}, Lorg/c/c/j;->f()D

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lorg/c/c/j;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lorg/c/c/j;->b()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p2}, Lorg/c/c/j;->b()Z

    move-result v0

    const/4 v2, -0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lorg/c/c/j;->b()Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Lorg/c/c/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lorg/c/c/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_3

    return v3

    :cond_3
    invoke-virtual {p1}, Lorg/c/c/j;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lorg/c/c/j;->d()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-virtual {p2}, Lorg/c/c/j;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lorg/c/c/j;->d()Z

    move-result v0

    if-nez v0, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1}, Lorg/c/c/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lorg/c/c/j;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    return v3

    :cond_6
    invoke-static {p1}, Lorg/c/c/j;->d(Lorg/c/c/j;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    invoke-static {p2}, Lorg/c/c/j;->d(Lorg/c/c/j;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result p2

    if-ge p2, p1, :cond_7

    const/4 v1, -0x1

    return v1

    :cond_7
    if-ne p2, p1, :cond_8

    const/4 v1, 0x0

    :cond_8
    return v1
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/c/c/j;

    check-cast p2, Lorg/c/c/j;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/j$2;->a(Lorg/c/c/j;Lorg/c/c/j;)I

    move-result p1

    return p1
.end method
