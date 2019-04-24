.class final Lorg/c/c/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/c/c/a;",
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
.method public a(Lorg/c/c/a;Lorg/c/c/a;)I
    .locals 4

    invoke-virtual {p1}, Lorg/c/c/a;->c()D

    move-result-wide v0

    invoke-virtual {p2}, Lorg/c/c/a;->c()D

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lorg/c/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lorg/c/c/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {p2}, Lorg/c/c/a;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lorg/c/c/a;->b()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-virtual {p1}, Lorg/c/c/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lorg/c/c/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_3

    :cond_3
    return p2
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/c/c/a;

    check-cast p2, Lorg/c/c/a;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/a$1;->a(Lorg/c/c/a;Lorg/c/c/a;)I

    move-result p1

    return p1
.end method
