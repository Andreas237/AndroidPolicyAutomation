.class Lcom/huawei/openalliance/ad/net/http/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/net/http/d;->a(Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Class;

.field final synthetic b:Lcom/huawei/openalliance/ad/net/http/d;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->a:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->a:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/net/http/d;->a(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/a/k;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->a:Ljava/lang/Class;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/net/http/d;->b(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/c;

    move-result-object v7

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/a$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    move-object v2, p2

    move-object v3, p3

    move-object v4, v7

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/net/http/a$a;-><init>(Lcom/huawei/openalliance/ad/net/http/d;Ljava/lang/reflect/Method;[Ljava/lang/Object;Lcom/huawei/openalliance/ad/net/http/c;Lcom/huawei/openalliance/ad/net/http/a/k;)V

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/a$a;->a()Lcom/huawei/openalliance/ad/net/http/a;

    move-result-object v8

    new-instance v9, Lcom/huawei/openalliance/ad/net/http/Response;

    invoke-direct {v9}, Lcom/huawei/openalliance/ad/net/http/Response;-><init>()V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/net/http/d;->d:Lcom/huawei/openalliance/ad/net/http/g;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/net/http/d$1;->b:Lcom/huawei/openalliance/ad/net/http/d;

    invoke-interface {v0, v1, v8}, Lcom/huawei/openalliance/ad/net/http/g;->a(Lcom/huawei/openalliance/ad/net/http/d;Lcom/huawei/openalliance/ad/net/http/a;)Lcom/huawei/openalliance/ad/net/http/Response;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :catch_0
    move-exception v10

    const/4 v0, -0x1

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/net/http/Response;->a(I)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/net/http/Response;->a(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v10

    const/4 v0, -0x1

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/net/http/Response;->a(I)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/openalliance/ad/net/http/Response;->a(Ljava/lang/String;)V

    :goto_0
    const-string v0, "HttpCall"

    const-string v1, "response http code: %d exception: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/net/http/Response;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v9
.end method
