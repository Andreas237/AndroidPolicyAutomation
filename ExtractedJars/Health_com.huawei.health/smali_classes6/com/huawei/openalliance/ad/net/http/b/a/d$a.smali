.class public Lcom/huawei/openalliance/ad/net/http/b/a/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/net/http/b/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/reflect/Type;Lcom/huawei/openalliance/ad/net/http/b/a/d;>;"
        }
    .end annotation
.end field

.field private static b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

.field private static c:Lcom/huawei/openalliance/ad/net/http/b/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/a/b;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/b/a/c;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/b/a/c;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->c:Lcom/huawei/openalliance/ad/net/http/b/a/c;

    invoke-static {}, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/huawei/openalliance/ad/net/http/b/a/d;
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/net/http/b/a/d;

    if-nez v1, :cond_0

    sget-object v1, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->c:Lcom/huawei/openalliance/ad/net/http/b/a/c;

    :cond_0
    return-object v1
.end method

.method private static a()V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/String;

    new-instance v2, Lcom/huawei/openalliance/ad/net/http/b/a/e;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/net/http/b/a/e;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Integer;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Float;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Long;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Short;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Byte;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Character;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->a:Ljava/util/Map;

    const-class v1, Ljava/lang/Boolean;

    sget-object v2, Lcom/huawei/openalliance/ad/net/http/b/a/d$a;->b:Lcom/huawei/openalliance/ad/net/http/b/a/b;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
