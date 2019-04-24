.class public Lorg/c/f/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/a/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/c/f/a/i<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "\'responseType\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\'messageConverters\' must not be empty"

    invoke-static {p2, v0}, Lorg/c/e/a;->a(Ljava/util/Collection;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/f/a/c;->a:Ljava/lang/Class;

    iput-object p2, p0, Lorg/c/f/a/c;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/a/i;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/a/i;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lorg/c/f/a/c;->b(Lorg/c/c/a/i;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    const-string v0, "RestTemplate"

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "RestTemplate"

    const-string v2, "No Content-Type header found, defaulting to application/octet-stream"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object v0, Lorg/c/c/j;->f:Lorg/c/c/j;

    :cond_2
    iget-object v2, p0, Lorg/c/f/a/c;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/c/c/b/e;

    iget-object v4, p0, Lorg/c/f/a/c;->a:Ljava/lang/Class;

    invoke-interface {v3, v4, v0}, Lorg/c/c/b/e;->a(Ljava/lang/Class;Lorg/c/c/j;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v2, "RestTemplate"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "RestTemplate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Reading ["

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lorg/c/f/a/c;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] as \""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\" using ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v0, p0, Lorg/c/f/a/c;->a:Ljava/lang/Class;

    invoke-interface {v3, v0, p1}, Lorg/c/c/b/e;->a(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lorg/c/f/a/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not extract response: no suitable HttpMessageConverter found for response type ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/c/f/a/c;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] and content type ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/c/f/a/j;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected b(Lorg/c/c/a/i;)Z
    .locals 5

    invoke-interface {p1}, Lorg/c/c/a/i;->b()Lorg/c/c/i;

    move-result-object v0

    sget-object v1, Lorg/c/c/i;->NO_CONTENT:Lorg/c/c/i;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    sget-object v1, Lorg/c/c/i;->NOT_MODIFIED:Lorg/c/c/i;

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p1}, Lorg/c/c/a/i;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/c;->b()J

    move-result-wide v0

    const-wide/16 v3, 0x0

    cmp-long p1, v0, v3

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method
