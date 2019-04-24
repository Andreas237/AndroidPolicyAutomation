.class public abstract Lcom/huawei/openalliance/ad/utils/p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/utils/p$a;,
        Lcom/huawei/openalliance/ad/utils/p$b;,
        Lcom/huawei/openalliance/ad/utils/p$g;,
        Lcom/huawei/openalliance/ad/utils/p$c;,
        Lcom/huawei/openalliance/ad/utils/p$d;,
        Lcom/huawei/openalliance/ad/utils/p$f;,
        Lcom/huawei/openalliance/ad/utils/p$e;,
        Lcom/huawei/openalliance/ad/utils/p$h;
    }
.end annotation


# static fields
.field private static final a:[Ljava/lang/Class;

.field private static final b:[Ljava/lang/Class;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Class;Lcom/huawei/openalliance/ad/utils/p$h;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Integer;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Short;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Long;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Byte;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Float;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Double;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Character;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Boolean;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/utils/p;->a:[Ljava/lang/Class;

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Integer;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Short;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Long;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Byte;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Float;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Double;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-class v1, Ljava/lang/Boolean;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/openalliance/ad/utils/p;->b:[Ljava/lang/Class;

    const-class v0, Lcom/huawei/openalliance/ad/utils/p;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    new-instance v3, Lcom/huawei/openalliance/ad/utils/p$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/openalliance/ad/utils/p$e;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Integer;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/huawei/openalliance/ad/utils/p$f;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/huawei/openalliance/ad/utils/p$f;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Long;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lcom/huawei/openalliance/ad/utils/p$d;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lcom/huawei/openalliance/ad/utils/p$d;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Float;

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lcom/huawei/openalliance/ad/utils/p$c;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lcom/huawei/openalliance/ad/utils/p$c;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lcom/huawei/openalliance/ad/utils/p$g;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Lcom/huawei/openalliance/ad/utils/p$g;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Short;

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lcom/huawei/openalliance/ad/utils/p$b;

    const/4 v0, 0x0

    invoke-direct {v8, v0}, Lcom/huawei/openalliance/ad/utils/p$b;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Byte;

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lcom/huawei/openalliance/ad/utils/p$a;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Lcom/huawei/openalliance/ad/utils/p$a;-><init>(Lcom/huawei/openalliance/ad/utils/p$1;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    const-class v1, Ljava/lang/Boolean;

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p2}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_0
    const-class v0, Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lorg/json/JSONObject;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Lorg/json/JSONObject;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, p0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Lorg/json/JSONObject;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    instance-of v0, p2, Lorg/json/JSONArray;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Lorg/json/JSONArray;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, p0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Lorg/json/JSONArray;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_4
    const-string v0, "value from json error, field class: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :goto_0
    return-object v3
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v4, 0x0

    const-class v0, Ljava/lang/String;

    if-ne v0, p0, :cond_0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Number;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_3

    move-object v5, p1

    check-cast v5, Ljava/lang/Number;

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/utils/p$h;

    if-eqz v6, :cond_2

    invoke-interface {v6, v5}, Lcom/huawei/openalliance/ad/utils/p$h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "cannot find value reader for: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    goto :goto_2

    :cond_3
    const-class v0, Ljava/lang/Boolean;

    if-ne p0, v0, :cond_5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->d:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/utils/p$h;

    if-eqz v5, :cond_4

    invoke-interface {v5, p1}, Lcom/huawei/openalliance/ad/utils/p$h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "cannot find value reader for: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    goto :goto_2

    :cond_5
    move-object v4, p1

    :goto_2
    return-object v4
.end method

.method public static varargs a(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljava/lang/Class;)TT;"
        }
    .end annotation

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Input json string cannot be empty!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(ZLjava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;)V

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/json/JSONArray;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lorg/json/JSONArray;Ljava/lang/Class<TT;>;[Ljava/lang/Class;)TT;"
        }
    .end annotation

    const-class v0, Ljava/util/List;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Obj class (%s) is not List type"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_0
    const/4 v3, 0x0

    if-eqz p2, :cond_1

    array-length v0, p2

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-object v3, p2, v0

    :cond_1
    invoke-static {p1, v3, p0}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lorg/json/JSONObject;Ljava/lang/Class<TT;>;[Ljava/lang/Class;)TT;"
        }
    .end annotation

    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Obj class %s is Collection type which mismatches with JsonObject"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Obj class %s is array type which mismatches with JsonObject"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_1
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v4, 0x0

    if-eqz p2, :cond_2

    array-length v0, p2

    if-lez v0, :cond_2

    const/4 v0, 0x0

    aget-object v4, p2, v0

    :cond_2
    invoke-static {p1, v4, p0}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0, v3}, Lcom/huawei/openalliance/ad/utils/p;->a(Lorg/json/JSONObject;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "No default constructor for class %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v4

    const-string v0, "New instance failed for %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v4

    const-string v0, "New instance failed for %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :catch_3
    move-exception v4

    const-string v0, "New instance failed for %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :goto_0
    return-object v3
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lorg/json/JSONObject;TT;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v5, 0x0

    :goto_0
    array-length v0, v2

    if-ge v5, v0, :cond_3

    aget-object v0, v2, v5

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/reflect/Field;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, v6, v4}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Z)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    throw v2

    :catch_1
    move-exception v2

    const-string v0, "toJson error"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0
.end method

.method private static a(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;)V

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 4

    const-class v0, Lcom/huawei/openalliance/ad/annotations/c;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/annotations/c;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/annotations/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/annotations/c;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v0, "__"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "__"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_1
    :goto_0
    return-object v2
.end method

.method private static a(Ljava/util/List;Z)Ljava/lang/String;
    .locals 5

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x5b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/StringBuilder;)V

    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/util/Map;Z)Ljava/lang/String;
    .locals 11

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x7b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v8

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    add-int/lit8 v7, v7, 0x1

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, p1}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    if-ge v7, v8, :cond_2

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/16 v0, 0x2c

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    goto :goto_0

    :cond_3
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static varargs a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0, p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(ZLjava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    return-object v0
.end method

.method private static varargs a(ZLjava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz p0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lorg/json/JSONException;

    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static a(Ljava/lang/Class;)V
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Root obj class (%s) cannot be primitive type!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->a:[Ljava/lang/Class;

    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->a:[Ljava/lang/Class;

    aget-object v5, v0, v4

    if-ne p0, v5, :cond_1

    const-string v0, "Root obj class (%s) is invalid in conversion"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static a(Ljava/lang/Object;Ljava/lang/reflect/Field;)V
    .locals 7

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v0, v3, v5

    invoke-static {v0}, Lcom/huawei/openalliance/ad/annotations/a/a;->a(Ljava/lang/annotation/Annotation;)Lcom/huawei/openalliance/ad/annotations/a/b;

    move-result-object v6

    if-eqz v6, :cond_0

    aget-object v0, v3, v5

    invoke-interface {v6, p0, p1, v0}, Lcom/huawei/openalliance/ad/annotations/a/b;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/annotation/Annotation;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "postProcessFieldAnnotation exception, fieldName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "postProcessFieldAnnotation "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", fieldName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private static a(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 6

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/reflect/Field;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    invoke-virtual {p1, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    goto/16 :goto_0

    :catch_0
    move-exception v4

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".fromJson runtime exception, fieldName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", field: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    goto :goto_0

    :catch_1
    move-exception v4

    :try_start_2
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".fromJson error, fieldName: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", field:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1, v3}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    goto :goto_0

    :catchall_0
    move-exception v5

    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    throw v5

    :goto_0
    return-void
.end method

.method private static a(Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    add-int/lit8 v0, v2, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, v2, -0x1

    invoke-virtual {p0, v0, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public static varargs b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljava/lang/Class;)TT;"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "toObject JSONException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "toObject error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    :try_start_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "toJson JSONException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method

.method private static b(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v2

    array-length v0, v2

    if-gtz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x7b

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    array-length v7, v2

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_5

    aget-object v0, v2, v8

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Field;

    move-result-object v0

    aput-object v0, v2, v8

    aget-object v0, v2, v8

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/reflect/Field;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    aget-object v0, v2, v8

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v4

    aget-object v0, v2, v8

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz p1, :cond_3

    aget-object v0, v2, v8

    const-class v1, Lcom/huawei/openalliance/ad/annotations/a;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz v5, :cond_2

    const-string v6, "\"******\""

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    goto :goto_2

    :cond_3
    invoke-static {v5, p1}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v6

    :goto_2
    if-eqz v6, :cond_4

    const/16 v0, 0x22

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v7, -0x1

    if-ge v8, v0, :cond_4

    const/16 v0, 0x2c

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_5
    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/StringBuilder;)V

    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/Map;
    .locals 8

    if-nez p1, :cond_0

    const-class p1, Ljava/lang/String;

    :cond_0
    instance-of v0, p2, Lorg/json/JSONObject;

    if-nez v0, :cond_1

    const-string v0, "jsonValue is not JSONObject"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_1
    const-class v0, Ljava/util/Map;

    if-ne v0, p0, :cond_2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    goto :goto_0

    :cond_2
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "Fail to initiate %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v4

    const-string v0, "Fail to initiate %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_3
    const-string v0, "%s is not Map type"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :goto_0
    move-object v4, p2

    check-cast v4, Lorg/json/JSONObject;

    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mapFromJson error, memberClass:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", valueClass:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    return-object v3
.end method

.method private static b(Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 3

    if-eqz p2, :cond_0

    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    :try_start_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_4

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_5

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_6

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_7

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_7
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_8

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_8
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_9

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_9
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, v2, :cond_a

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_a
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "processValueError"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private static b(Ljava/lang/Class;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->b:[Ljava/lang/Class;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->b:[Ljava/lang/Class;

    aget-object v3, v0, v2

    if-ne p0, v3, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Ljava/lang/reflect/Field;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    const-string v0, "$"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Lcom/huawei/openalliance/ad/annotations/e;

    invoke-virtual {p0, v0}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljava/lang/Class;)TT;"
        }
    .end annotation

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v2, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->a(Lorg/json/JSONObject;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v3, p1, p2}, Lcom/huawei/openalliance/ad/utils/p;->a(Lorg/json/JSONArray;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v3

    const-string v0, "Input string is not valid json string!"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Z)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "toAnonymousJson JSONException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    const-string v1, "toAnonymousJson IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method

.method private static c(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 3

    const/4 v2, 0x0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    return-object v2

    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/Character;

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ad;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Byte;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Double;

    if-nez v0, :cond_3

    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_4

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/util/List;Z)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_5
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/util/Map;Z)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->d(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_7
    invoke-static {p0, p1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v2

    :goto_0
    return-object v2
.end method

.method private static c(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;
    .locals 8

    if-nez p1, :cond_0

    const-class p1, Ljava/lang/String;

    :cond_0
    instance-of v0, p2, Lorg/json/JSONArray;

    if-nez v0, :cond_1

    const-string v0, "jsonobject is not JSONArray"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_1
    const-class v0, Ljava/util/List;

    if-ne p0, v0, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_2
    const-class v0, Ljava/util/List;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "Fail to initiate %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v4

    const-string v0, "Fail to initiate %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :cond_3
    const-string v0, "%s is not List type"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/json/JSONException;

    move-result-object v0

    throw v0

    :goto_0
    move-object v4, p2

    check-cast v4, Lorg/json/JSONArray;

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_6

    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/huawei/openalliance/ad/utils/p;->c:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "listFromJson error, memberClass:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", valueClass:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    return-object v3
.end method

.method private static d(Ljava/lang/Object;Z)Ljava/lang/String;
    .locals 6

    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    if-gtz v2, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x5b

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    invoke-static {p0, v5}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/p;->c(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/StringBuilder;)V

    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
