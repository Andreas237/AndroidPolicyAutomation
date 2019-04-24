.class Lorg/junit/runner/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/runner/g$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/g;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/g;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    return-void
.end method

.method public static a([Ljava/lang/String;)Lorg/junit/runner/g;
    .locals 1

    new-instance v0, Lorg/junit/runner/g;

    invoke-direct {v0}, Lorg/junit/runner/g;-><init>()V

    invoke-direct {v0, p0}, Lorg/junit/runner/g;->d([Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Ljava/lang/Throwable;)Lorg/junit/runner/h;
    .locals 1

    const-class v0, Lorg/junit/runner/g;

    invoke-static {v0, p1}, Lorg/junit/runner/h;->a(Ljava/lang/Class;Ljava/lang/Throwable;)Lorg/junit/runner/h;

    move-result-object p1

    return-object p1
.end method

.method private a(Lorg/junit/runner/h;)Lorg/junit/runner/h;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lorg/junit/runner/g;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lorg/junit/runner/d;->a(Lorg/junit/runner/h;Ljava/lang/String;)Lorg/junit/runner/a/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/junit/runner/h;->a(Lorg/junit/runner/a/a;)Lorg/junit/runner/h;

    move-result-object p1
    :try_end_0
    .catch Lorg/junit/runner/e$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lorg/junit/runner/g;->a(Ljava/lang/Throwable;)Lorg/junit/runner/h;

    move-result-object p1

    return-object p1
.end method

.method private a([Ljava/lang/String;II)[Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-eq p2, p3, :cond_0

    aget-object v1, p1, p2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    return-object p1
.end method

.method private d([Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/junit/runner/g;->b([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/runner/g;->c([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/junit/runner/a;)Lorg/junit/runner/h;
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/junit/runner/g;->b:Ljava/util/List;

    iget-object v1, p0, Lorg/junit/runner/g;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Class;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {p1, v0}, Lorg/junit/runner/h;->a(Lorg/junit/runner/a;[Ljava/lang/Class;)Lorg/junit/runner/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/junit/runner/g;->a(Lorg/junit/runner/h;)Lorg/junit/runner/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/junit/c/a/e;

    iget-object v0, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    invoke-direct {p1, v0}, Lorg/junit/c/a/e;-><init>(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lorg/junit/runner/g;->a(Ljava/lang/Throwable;)Lorg/junit/runner/h;

    move-result-object p1

    return-object p1
.end method

.method varargs b([Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-eq v1, v2, :cond_6

    aget-object v2, p1, v1

    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_0
    array-length v0, p1

    invoke-direct {p0, p1, v1, v0}, Lorg/junit/runner/g;->a([Ljava/lang/String;II)[Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v3, "--"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "--filter="

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "--filter"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    new-instance v4, Lorg/junit/runner/g$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JUnit knows nothing about the "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " option"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Lorg/junit/runner/g$a;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    :goto_1
    const-string v3, "--filter"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    add-int/lit8 v1, v1, 0x1

    array-length v3, p1

    if-ge v1, v3, :cond_4

    aget-object v2, p1, v1

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    new-instance v1, Lorg/junit/runner/g$a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " value not specified"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/junit/runner/g$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    const/16 v3, 0x3d

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    :goto_2
    iget-object v3, p0, Lorg/junit/runner/g;->a:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    :goto_4
    new-array p1, v0, [Ljava/lang/String;

    return-object p1
.end method

.method c([Ljava/lang/String;)V
    .locals 8

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    :try_start_0
    iget-object v3, p0, Lorg/junit/runner/g;->b:Ljava/util/List;

    invoke-static {v2}, Lorg/junit/a/b;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    iget-object v4, p0, Lorg/junit/runner/g;->c:Ljava/util/List;

    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Could not find class ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
