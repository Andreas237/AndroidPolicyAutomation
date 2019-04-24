.class Lcom/huawei/openalliance/ad/net/http/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/net/http/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Lcom/huawei/openalliance/ad/net/http/d;

.field final b:Ljava/lang/reflect/Method;

.field final c:[Ljava/lang/Object;

.field final d:Ljava/lang/String;

.field final e:Lcom/huawei/openalliance/ad/net/http/c;

.field f:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field

.field g:Lcom/huawei/openalliance/ad/net/http/e;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field l:[B

.field m:Ljava/lang/String;

.field n:I

.field o:I

.field p:Lcom/huawei/openalliance/ad/net/http/b/b/d;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/reflect/Method;[Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/c;Lcom/huawei/openalliance/ad/net/http/a/k;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->j:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->k:Ljava/util/Set;

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->n:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->o:I

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->a:Lcom/huawei/openalliance/ad/net/http/d;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->d:Ljava/lang/String;

    if-nez p3, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    iput-object p4, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->e:Lcom/huawei/openalliance/ad/net/http/c;

    if-eqz p5, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e$a;

    invoke-interface {p5}, Lcom/huawei/openalliance/ad/net/http/a/k;->b()Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;-><init>(Z)V

    invoke-interface {p5}, Lcom/huawei/openalliance/ad/net/http/a/k;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;->a()Lcom/huawei/openalliance/ad/net/http/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/huawei/openalliance/ad/net/http/d;->a:Lcom/huawei/openalliance/ad/net/http/e;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    :goto_1
    return-void
.end method

.method private varargs a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_0

    array-length v0, p2

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, " (method: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v0, "AccessMethod.Builder"

    invoke-static {v0, v3}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a/c;Ljava/lang/Object;I)V
    .locals 6

    if-nez p2, :cond_0

    const-string v0, "Argument %d with @Header annotation must not be null!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "Argument %d with @Header annotation can only be String type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/c;->a()Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->e:Lcom/huawei/openalliance/ad/net/http/c;

    invoke-virtual {v0, v4, v5}, Lcom/huawei/openalliance/ad/net/http/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a/g;Ljava/lang/Object;I)V
    .locals 7

    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->n:I

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/g;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->k:Ljava/util/Set;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Path name {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "} (arg "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " not existed in path url!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->n:I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->k:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    const-string v0, "@Path argument number is more than the path param elements in url"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    if-nez p2, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Path {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "} argument value cannot be null!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/a/d;

    move-result-object v5

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->a:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/d;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    invoke-interface {v5, p2, v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d;->a(Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    :catch_0
    move-exception v6

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a/h;Ljava/lang/Object;I)V
    .locals 6

    if-nez p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/a/d;

    move-result-object v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->a:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/d;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    invoke-interface {v4, p2, v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d;->a(Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception v5

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :goto_0
    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/h;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Query name of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " arg cannot not be empty!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->j:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/net/http/a/k;)V
    .locals 2

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e$a;

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/k;->b()Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;-><init>(Z)V

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/net/http/a/k;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;->a()Lcom/huawei/openalliance/ad/net/http/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->o:I

    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->o:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "There are more than one @Body arguments in method!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->l:[B

    goto :goto_1

    :cond_1
    instance-of v0, p1, [B

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, [B

    check-cast v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->l:[B

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/a/d;

    move-result-object v2

    invoke-interface {v2}, Lcom/huawei/openalliance/ad/net/http/b/a/d;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->m:Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->a:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/d;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    invoke-interface {v2, p1, v0}, Lcom/huawei/openalliance/ad/net/http/b/a/d;->a(Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/b/a;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :goto_0
    const-string v0, "UTF-8"

    :try_start_1
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->l:[B
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v4

    const-string v0, "UnsupportedEncodingException in get bytes from content"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :goto_1
    return-void
.end method

.method private a(Ljava/lang/Object;I)V
    .locals 4

    if-nez p1, :cond_0

    const-string v0, "Argument %d with @ResponseConverter annotation must not be null!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/b/b/d;

    if-nez v0, :cond_1

    const-string v0, "Argument %d with @Url annotation can only be IResponseConversionInterceptor type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/b/b/d;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->p:Lcom/huawei/openalliance/ad/net/http/b/b/d;

    return-void
.end method

.method private a(Ljava/lang/Object;ZI)V
    .locals 4

    if-nez p1, :cond_0

    const-string v0, "Argument %d with @Url annotation must not be null!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "Argument %d with @Url annotation can only be String type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Relative path in GET/POST annotation must be empty with @Url annotation as parameter!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/e$a;

    invoke-direct {v0, p2}, Lcom/huawei/openalliance/ad/net/http/e$a;-><init>(Z)V

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/e$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/e$a;->a()Lcom/huawei/openalliance/ad/net/http/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->h:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x3f

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v0, -0x1

    if-eq v3, v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v3, v0, :cond_1

    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "URL query \"%s\" must not have replace block. use @Query instead."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->k:Ljava/util/Set;

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private a(Ljava/lang/annotation/Annotation;)V
    .locals 2

    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/b;

    if-eqz v0, :cond_0

    const-string v0, "GET"

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/net/http/a/b;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/net/http/a/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/f;

    if-eqz v0, :cond_1

    const-string v0, "POST"

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/net/http/a/f;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/net/http/a/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/e;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/a$a;->e()V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/k;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/a/k;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Lcom/huawei/openalliance/ad/net/http/a/k;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/annotation/Annotation;I)V
    .locals 2

    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/a/g;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v1, v1, p2

    invoke-direct {p0, v0, v1, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Lcom/huawei/openalliance/ad/net/http/a/g;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/h;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/a/h;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v1, v1, p2

    invoke-direct {p0, v0, v1, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Lcom/huawei/openalliance/ad/net/http/a/h;Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v0, v0, p2

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/c;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/net/http/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v1, v1, p2

    invoke-direct {p0, v0, v1, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Lcom/huawei/openalliance/ad/net/http/a/c;Ljava/lang/Object;I)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v0, v0, p2

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->c(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/j;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v0, v0, p2

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->b(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/k;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v0, v0, p2

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/net/http/a/k;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/net/http/a/k;->b()Z

    move-result v1

    invoke-direct {p0, v0, v1, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/Object;ZI)V

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lcom/huawei/openalliance/ad/net/http/a/i;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    aget-object v0, v0, p2

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/Object;I)V

    :cond_7
    :goto_0
    return-void
.end method

.method private b()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    const-class v0, Lcom/huawei/openalliance/ad/net/http/Response;

    if-eq v2, v0, :cond_0

    const-string v0, "Return type must be com.huawei.openplatform.baselibrary.net.http.Response!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v3

    instance-of v0, v3, Ljava/lang/reflect/ParameterizedType;

    if-nez v0, :cond_1

    const-string v0, "Return type must be parameterized, eg. Response<Foo>."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    move-object v0, v3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/huawei/openalliance/ad/utils/x;->a(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->f:Ljava/lang/Class;

    return-void
.end method

.method private b(Ljava/lang/Object;I)V
    .locals 4

    if-nez p1, :cond_0

    const-string v0, "Argument %d with @ResponseEntity annotation must not be null!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    if-nez v0, :cond_1

    const-string v0, "Argument %d with @HeaderMap annotation can only be Class type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->f:Ljava/lang/Class;

    return-void
.end method

.method private c()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    array-length v3, v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->c:[Ljava/lang/Object;

    array-length v0, v0

    if-eq v3, v0, :cond_0

    const-string v0, "Parameter annotation number doesn\'t equal to parameter number"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, v2, v4

    if-eqz v5, :cond_1

    array-length v0, v5

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Argument "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " doesn\'t have annotations!"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    const/4 v6, 0x0

    :goto_1
    array-length v0, v5

    if-ge v6, v0, :cond_3

    aget-object v0, v5, v6

    invoke-direct {p0, v0, v4}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/annotation/Annotation;I)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private c(Ljava/lang/Object;I)V
    .locals 11

    if-nez p1, :cond_0

    const-string v0, "Argument %d with @HeaderMap annotation must not be null!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    if-nez v0, :cond_1

    const-string v0, "Argument %d with @HeaderMap annotation can only be Map type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v0, v7, Ljava/util/Map$Entry;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v8, v7

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    instance-of v0, v9, Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, "The key in HeaderMap must be String type [Argument %d]!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_3
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    instance-of v0, v10, Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "The value in HeaderMap must be String type [Argument %d]!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->e:Lcom/huawei/openalliance/ad/net/http/c;

    move-object v1, v9

    check-cast v1, Ljava/lang/String;

    move-object v2, v10

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/net/http/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method private d()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->b:Ljava/lang/reflect/Method;

    const-class v1, Lcom/huawei/openalliance/ad/net/http/a/e;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/net/http/a/e;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->a:Lcom/huawei/openalliance/ad/net/http/d;

    invoke-virtual {v0, v2}, Lcom/huawei/openalliance/ad/net/http/d;->a(Lcom/huawei/openalliance/ad/net/http/a/e;)Lcom/huawei/openalliance/ad/net/http/c;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->e:Lcom/huawei/openalliance/ad/net/http/c;

    invoke-virtual {v0, v3}, Lcom/huawei/openalliance/ad/net/http/c;->a(Lcom/huawei/openalliance/ad/net/http/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/net/http/a;
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/a$a;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/a$a;->d()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Http method annotation is needed! (eg. GET, POST etc."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->i:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "Url is not specified in @GET or @POST etc."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/net/http/a$a;->c()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/a$a;->g:Lcom/huawei/openalliance/ad/net/http/e;

    if-nez v0, :cond_2

    const-string v0, "No url found in the request!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/net/http/a$a;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/net/http/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/openalliance/ad/net/http/a;-><init>(Lcom/huawei/openalliance/ad/net/http/a$a;Lcom/huawei/openalliance/ad/net/http/a$1;)V

    return-object v0
.end method
