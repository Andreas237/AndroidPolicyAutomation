.class public abstract Lorg/b/a/c/c;
.super Lorg/b/a/g;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x237280647325c782L


# instance fields
.field private final a:Lorg/b/a/h;


# direct methods
.method protected constructor <init>(Lorg/b/a/h;)V
    .locals 1

    invoke-direct {p0}, Lorg/b/a/g;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The type must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lorg/b/a/c/c;->a:Lorg/b/a/h;

    return-void
.end method


# virtual methods
.method public a(Lorg/b/a/g;)I
    .locals 4

    invoke-virtual {p1}, Lorg/b/a/g;->d()J

    move-result-wide v0

    invoke-virtual {p0}, Lorg/b/a/c/c;->d()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final a()Lorg/b/a/h;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/c;->a:Lorg/b/a/h;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/b/a/g;

    invoke-virtual {p0, p1}, Lorg/b/a/c/c;->a(Lorg/b/a/g;)I

    move-result p1

    return p1
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/c;->a:Lorg/b/a/h;

    invoke-virtual {v0}, Lorg/b/a/h;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DurationField["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/b/a/c/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
