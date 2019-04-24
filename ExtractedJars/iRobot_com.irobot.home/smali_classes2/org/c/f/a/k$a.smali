.class Lorg/c/f/a/k$a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/f/a/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lorg/c/f/a/k;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lorg/c/f/a/k;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lorg/c/f/a/k$a;->a:Lorg/c/f/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/c/f/a/k$a;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Lorg/c/f/a/k;Ljava/lang/Class;Lorg/c/f/a/k$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/c/f/a/k$a;-><init>(Lorg/c/f/a/k;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/c/c/a/e;)V
    .locals 6

    iget-object v0, p0, Lorg/c/f/a/k$a;->b:Ljava/lang/Class;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lorg/c/f/a/k$a;->a:Lorg/c/f/a/k;

    invoke-virtual {v1}, Lorg/c/f/a/k;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/c/c/b/e;

    iget-object v3, p0, Lorg/c/f/a/k$a;->b:Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lorg/c/c/b/e;->a(Ljava/lang/Class;Lorg/c/c/j;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lorg/c/c/b/e;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/c/c/j;

    invoke-virtual {v3}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v4, Lorg/c/c/j;

    invoke-virtual {v3}, Lorg/c/c/j;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lorg/c/c/j;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v4

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Lorg/c/c/j;->a(Ljava/util/List;)V

    const-string v1, "RestTemplate"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "RestTemplate"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Setting request Accept header to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-interface {p1}, Lorg/c/c/a/e;->getHeaders()Lorg/c/c/c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/c/c/c;->a(Ljava/util/List;)V

    :cond_4
    return-void
.end method
