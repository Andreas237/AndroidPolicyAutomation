.class public Lorg/c/f/a/k;
.super Lorg/c/c/a/a/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/f/a/k$e;,
        Lorg/c/f/a/k$c;,
        Lorg/c/f/a/k$b;,
        Lorg/c/f/a/k$f;,
        Lorg/c/f/a/k$d;,
        Lorg/c/f/a/k$a;
    }
.end annotation


# instance fields
.field private final a:Lorg/c/f/a/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/f/a/i<",
            "Lorg/c/c/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Lorg/c/f/a/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/c/f/a/k;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Lorg/c/c/a/a/b;-><init>()V

    new-instance v0, Lorg/c/f/a/k$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/c/f/a/k$c;-><init>(Lorg/c/f/a/k$1;)V

    iput-object v0, p0, Lorg/c/f/a/k;->a:Lorg/c/f/a/i;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/c/f/a/k;->b:Ljava/util/List;

    new-instance v0, Lorg/c/f/a/a;

    invoke-direct {v0}, Lorg/c/f/a/a;-><init>()V

    iput-object v0, p0, Lorg/c/f/a/k;->c:Lorg/c/f/a/h;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/c/f/a/k;->b:Ljava/util/List;

    invoke-static {p1}, Lorg/c/f/a/k$b;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private a(Lorg/c/c/f;Ljava/net/URI;Lorg/c/c/a/i;)V
    .locals 2

    const-string v0, "RestTemplate"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "RestTemplate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/c/c/f;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " request for \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" resulted in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Lorg/c/c/a/i;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private b(Lorg/c/c/f;Ljava/net/URI;Lorg/c/c/a/i;)V
    .locals 2

    const-string v0, "RestTemplate"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v0, "RestTemplate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/c/c/f;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " request for \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" resulted in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Lorg/c/c/a/i;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "); invoking error handler"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    invoke-virtual {p0}, Lorg/c/f/a/k;->d()Lorg/c/f/a/h;

    move-result-object p1

    invoke-interface {p1, p3}, Lorg/c/f/a/h;->b(Lorg/c/c/a/i;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;Ljava/util/Map;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/c/c/f;",
            "Lorg/c/f/a/f;",
            "Lorg/c/f/a/i<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)TT;"
        }
    .end annotation

    new-instance v0, Lorg/c/f/a/k$e;

    invoke-direct {v0, p1}, Lorg/c/f/a/k$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, Lorg/c/f/b/c;->a(Ljava/util/Map;)Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/c/f/a/k;->a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public varargs a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/c/c/f;",
            "Lorg/c/f/a/f;",
            "Lorg/c/f/a/i<",
            "TT;>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lorg/c/f/a/k$e;

    invoke-direct {v0, p1}, Lorg/c/f/a/k$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, Lorg/c/f/b/c;->a([Ljava/lang/Object;)Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/c/f/a/k;->a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/net/URI;",
            "Lorg/c/c/f;",
            "Lorg/c/f/a/f;",
            "Lorg/c/f/a/i<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "\'url\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\'method\' must not be null"

    invoke-static {p2, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/c/f/a/k;->a(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;

    move-result-object v1

    if-eqz p3, :cond_0

    invoke-interface {p3, v1}, Lorg/c/f/a/f;->a(Lorg/c/c/a/e;)V

    :cond_0
    invoke-interface {v1}, Lorg/c/c/a/e;->b()Lorg/c/c/a/i;

    move-result-object p3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Lorg/c/f/a/k;->d()Lorg/c/f/a/h;

    move-result-object v1

    invoke-interface {v1, p3}, Lorg/c/f/a/h;->a(Lorg/c/c/a/i;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0, p2, p1, p3}, Lorg/c/f/a/k;->a(Lorg/c/c/f;Ljava/net/URI;Lorg/c/c/a/i;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2, p1, p3}, Lorg/c/f/a/k;->b(Lorg/c/c/f;Ljava/net/URI;Lorg/c/c/a/i;)V

    :goto_0
    if-eqz p4, :cond_3

    invoke-interface {p4, p3}, Lorg/c/f/a/i;->a(Lorg/c/c/a/i;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lorg/c/c/a/i;->c()V

    :cond_2
    return-object p1

    :cond_3
    if-eqz p3, :cond_4

    invoke-interface {p3}, Lorg/c/c/a/i;->c()V

    :cond_4
    return-object v0

    :catchall_0
    move-exception p1

    move-object v0, p3

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v0, p3

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_1
    :try_start_2
    new-instance p2, Lorg/c/f/a/g;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "I/O error: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lorg/c/f/a/g;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v0, :cond_5

    invoke-interface {v0}, Lorg/c/c/a/i;->c()V

    :cond_5
    throw p1
.end method

.method public a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/c/b;Ljava/lang/Class;Ljava/util/Map;)Lorg/c/c/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/c/c/f;",
            "Lorg/c/c/b<",
            "*>;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lorg/c/c/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v3, Lorg/c/f/a/k$d;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p3, p4, v0}, Lorg/c/f/a/k$d;-><init>(Lorg/c/f/a/k;Ljava/lang/Object;Ljava/lang/Class;Lorg/c/f/a/k$1;)V

    new-instance v4, Lorg/c/f/a/k$f;

    invoke-direct {v4, p0, p4}, Lorg/c/f/a/k$f;-><init>(Lorg/c/f/a/k;Ljava/lang/Class;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/c/f/a/k;->a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/c/c/k;

    return-object p1
.end method

.method public varargs a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/c/b;Ljava/lang/Class;[Ljava/lang/Object;)Lorg/c/c/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lorg/c/c/f;",
            "Lorg/c/c/b<",
            "*>;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Object;",
            ")",
            "Lorg/c/c/k<",
            "TT;>;"
        }
    .end annotation

    new-instance v3, Lorg/c/f/a/k$d;

    const/4 v0, 0x0

    invoke-direct {v3, p0, p3, p4, v0}, Lorg/c/f/a/k$d;-><init>(Lorg/c/f/a/k;Ljava/lang/Object;Ljava/lang/Class;Lorg/c/f/a/k$1;)V

    new-instance v4, Lorg/c/f/a/k$f;

    invoke-direct {v4, p0, p4}, Lorg/c/f/a/k$f;-><init>(Lorg/c/f/a/k;Ljava/lang/Class;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/c/f/a/k;->a(Ljava/lang/String;Lorg/c/c/f;Lorg/c/f/a/f;Lorg/c/f/a/i;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/c/c/k;

    return-object p1
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/f/a/k;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lorg/c/f/a/h;
    .locals 1

    iget-object v0, p0, Lorg/c/f/a/k;->c:Lorg/c/f/a/h;

    return-object v0
.end method
