.class public Lcom/tencent/stat/common/a;
.super Ljava/lang/Object;


# static fields
.field static a:Lcom/tencent/stat/common/c;

.field private static d:Lcom/tencent/stat/common/StatLogger;

.field private static e:Lorg/json/JSONObject;


# instance fields
.field b:Ljava/lang/Integer;

.field c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lcom/tencent/stat/common/a;->a(Landroid/content/Context;)Lcom/tencent/stat/common/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/stat/common/k;->q(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/tencent/stat/common/k;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v0, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/common/c;
    .locals 4

    const-class v3, Lcom/tencent/stat/common/a;

    monitor-enter v3

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/tencent/stat/common/c;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/tencent/stat/common/c;-><init>(Landroid/content/Context;Lcom/tencent/stat/common/b;)V

    sput-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;

    :cond_0
    sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static a(Landroid/content/Context;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/tencent/stat/common/a;->a:Lcom/tencent/stat/common/c;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/c;->a(Lorg/json/JSONObject;)V

    :cond_0
    const-string v0, "cn"

    iget-object v1, p0, Lcom/tencent/stat/common/a;->c:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    const-string v0, "tn"

    iget-object v1, p0, Lcom/tencent/stat/common/a;->b:Ljava/lang/Integer;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v0, "ev"

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, "eva"

    sget-object v1, Lcom/tencent/stat/common/a;->e:Lorg/json/JSONObject;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/a;->d:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
