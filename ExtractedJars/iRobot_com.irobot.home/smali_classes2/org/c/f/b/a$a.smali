.class final Lorg/c/f/b/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/b/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/c/f/b/a$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/c/f/b/a$c;
    .locals 2

    invoke-virtual {p0}, Lorg/c/f/b/a$a;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/c/f/b/a$d;->PATH:Lorg/c/f/b/a$d;

    invoke-static {v0, p1, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lorg/c/f/b/a$a;

    invoke-direct {v0, p1}, Lorg/c/f/b/a$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a$c;
    .locals 1

    invoke-virtual {p0}, Lorg/c/f/b/a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lorg/c/f/b/a$a;

    invoke-direct {v0, p1}, Lorg/c/f/b/a$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lorg/c/f/b/a$a;->a:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->PATH:Lorg/c/f/b/a$d;

    invoke-static {v0, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/c/f/b/a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/c/f/b/a$a;

    invoke-virtual {p0}, Lorg/c/f/b/a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/c/f/b/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lorg/c/f/b/a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
