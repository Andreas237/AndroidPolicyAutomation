.class public Lcom/huawei/hwCloudJs/core/a/b;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/huawei/hwCloudJs/core/a/b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwCloudJs/core/a/a;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/core/a/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/core/a/b;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/core/a/b;->b:Lcom/huawei/hwCloudJs/core/a/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/a/b;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/core/a/b;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/core/a/b;->b:Lcom/huawei/hwCloudJs/core/a/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwCloudJs/core/JSRequest;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    const-class v0, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Method;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-class v0, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/annotation/JSMethod;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/annotation/JSMethod;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/b;->a:Ljava/util/Map;

    new-instance v1, Lcom/huawei/hwCloudJs/core/a/a;

    invoke-direct {v1, v6}, Lcom/huawei/hwCloudJs/core/a/a;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/b;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/b;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/hwCloudJs/core/a/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/b;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/core/a/a;

    return-object v0
.end method
