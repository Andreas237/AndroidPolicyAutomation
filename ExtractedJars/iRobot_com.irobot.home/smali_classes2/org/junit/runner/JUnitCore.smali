.class public Lorg/junit/runner/JUnitCore;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lorg/junit/runner/b/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/junit/runner/b/c;

    invoke-direct {v0}, Lorg/junit/runner/b/c;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    return-void
.end method

.method static a()Lorg/junit/runner/a;
    .locals 1

    new-instance v0, Lorg/junit/runner/a;

    invoke-direct {v0}, Lorg/junit/runner/a;-><init>()V

    return-object v0
.end method

.method public static varargs main([Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lorg/junit/runner/JUnitCore;

    invoke-direct {v0}, Lorg/junit/runner/JUnitCore;-><init>()V

    new-instance v1, Lorg/junit/a/e;

    invoke-direct {v1}, Lorg/junit/a/e;-><init>()V

    invoke-virtual {v0, v1, p0}, Lorg/junit/runner/JUnitCore;->a(Lorg/junit/a/c;[Ljava/lang/String;)Lorg/junit/runner/i;

    move-result-object p0

    invoke-virtual {p0}, Lorg/junit/runner/i;->e()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    return-void
.end method


# virtual methods
.method varargs a(Lorg/junit/a/c;[Ljava/lang/String;)Lorg/junit/runner/i;
    .locals 3

    invoke-interface {p1}, Lorg/junit/a/c;->a()Ljava/io/PrintStream;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JUnit version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljunit/runner/Version;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {p2}, Lorg/junit/runner/g;->a([Ljava/lang/String;)Lorg/junit/runner/g;

    move-result-object p2

    new-instance v0, Lorg/junit/a/f;

    invoke-direct {v0, p1}, Lorg/junit/a/f;-><init>(Lorg/junit/a/c;)V

    invoke-virtual {p0, v0}, Lorg/junit/runner/JUnitCore;->a(Lorg/junit/runner/b/b;)V

    invoke-static {}, Lorg/junit/runner/JUnitCore;->a()Lorg/junit/runner/a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/junit/runner/g;->a(Lorg/junit/runner/a;)Lorg/junit/runner/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/runner/JUnitCore;->a(Lorg/junit/runner/h;)Lorg/junit/runner/i;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/junit/runner/h;)Lorg/junit/runner/i;
    .locals 0

    invoke-virtual {p1}, Lorg/junit/runner/h;->a()Lorg/junit/runner/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/runner/JUnitCore;->a(Lorg/junit/runner/k;)Lorg/junit/runner/i;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/junit/runner/k;)Lorg/junit/runner/i;
    .locals 4

    new-instance v0, Lorg/junit/runner/i;

    invoke-direct {v0}, Lorg/junit/runner/i;-><init>()V

    invoke-virtual {v0}, Lorg/junit/runner/i;->f()Lorg/junit/runner/b/b;

    move-result-object v1

    iget-object v2, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {v2, v1}, Lorg/junit/runner/b/c;->d(Lorg/junit/runner/b/b;)V

    :try_start_0
    iget-object v2, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {p1}, Lorg/junit/runner/k;->a()Lorg/junit/runner/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/c;)V

    iget-object v2, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {p1, v2}, Lorg/junit/runner/k;->a(Lorg/junit/runner/b/c;)V

    iget-object p1, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {p1, v0}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lorg/junit/runner/JUnitCore;->b(Lorg/junit/runner/b/b;)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v1}, Lorg/junit/runner/JUnitCore;->b(Lorg/junit/runner/b/b;)V

    throw p1
.end method

.method public a(Lorg/junit/runner/b/b;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {v0, p1}, Lorg/junit/runner/b/c;->a(Lorg/junit/runner/b/b;)V

    return-void
.end method

.method public b(Lorg/junit/runner/b/b;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/JUnitCore;->a:Lorg/junit/runner/b/c;

    invoke-virtual {v0, p1}, Lorg/junit/runner/b/c;->b(Lorg/junit/runner/b/b;)V

    return-void
.end method
