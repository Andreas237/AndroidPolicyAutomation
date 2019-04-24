.class Lorg/c/f/a/k$d;
.super Lorg/c/f/a/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lorg/c/f/a/k;

.field private final c:Lorg/c/c/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/c/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lorg/c/f/a/k;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/c/f/a/k$d;->b:Lorg/c/f/a/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p3, v0}, Lorg/c/f/a/k$a;-><init>(Lorg/c/f/a/k;Ljava/lang/Class;Lorg/c/f/a/k$1;)V

    instance-of p1, p2, Lorg/c/c/b;

    if-eqz p1, :cond_0

    check-cast p2, Lorg/c/c/b;

    iput-object p2, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    return-void

    :cond_0
    if-eqz p2, :cond_1

    new-instance p1, Lorg/c/c/b;

    invoke-direct {p1, p2}, Lorg/c/c/b;-><init>(Ljava/lang/Object;)V

    :goto_0
    iput-object p1, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    return-void

    :cond_1
    sget-object p1, Lorg/c/c/b;->a:Lorg/c/c/b;

    goto :goto_0

    return-void
.end method

.method synthetic constructor <init>(Lorg/c/f/a/k;Ljava/lang/Object;Ljava/lang/Class;Lorg/c/f/a/k$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/c/f/a/k$d;-><init>(Lorg/c/f/a/k;Ljava/lang/Object;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/a/e;)V
    .locals 7

    invoke-super {p0, p1}, Lorg/c/f/a/k$a;->a(Lorg/c/c/a/e;)V

    iget-object v0, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    invoke-virtual {v0}, Lorg/c/c/b;->c()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Lorg/c/c/a/e;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    iget-object v0, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    invoke-virtual {v0}, Lorg/c/c/b;->a()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/c/c/c;->putAll(Ljava/util/Map;)V

    :cond_0
    invoke-virtual {p1}, Lorg/c/c/c;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/c/c/c;->a(J)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    invoke-virtual {v0}, Lorg/c/c/b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Lorg/c/f/a/k$d;->c:Lorg/c/c/b;

    invoke-virtual {v2}, Lorg/c/c/b;->a()Lorg/c/c/c;

    move-result-object v2

    invoke-virtual {v2}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v3

    iget-object v4, p0, Lorg/c/f/a/k$d;->b:Lorg/c/f/a/k;

    invoke-virtual {v4}, Lorg/c/f/a/k;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/c/c/b/e;

    invoke-interface {v5, v1, v3}, Lorg/c/c/b/e;->b(Ljava/lang/Class;Lorg/c/c/j;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v2}, Lorg/c/c/c;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-interface {p1}, Lorg/c/c/a/e;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-virtual {v1, v2}, Lorg/c/c/c;->putAll(Ljava/util/Map;)V

    :cond_4
    const-string v1, "RestTemplate"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v3, :cond_5

    const-string v1, "RestTemplate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Writing ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "] as \""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\" using ["

    :goto_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    const-string v1, "RestTemplate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Writing ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "] using ["

    goto :goto_0

    :cond_6
    :goto_1
    invoke-interface {v5, v0, v3, p1}, Lorg/c/c/b/e;->a(Ljava/lang/Object;Lorg/c/c/j;Lorg/c/c/g;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Could not write request: no suitable HttpMessageConverter found for request type ["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz v3, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and content type ["

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_8
    new-instance v0, Lorg/c/f/a/j;

    invoke-direct {v0, p1}, Lorg/c/f/a/j;-><init>(Ljava/lang/String;)V

    throw v0
.end method
