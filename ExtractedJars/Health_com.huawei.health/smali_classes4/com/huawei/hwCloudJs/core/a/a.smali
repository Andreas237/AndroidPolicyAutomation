.class public final Lcom/huawei/hwCloudJs/core/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/reflect/Method;

.field private b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->b:Ljava/lang/Class;

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/a/a;->a:Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v0, v2

    if-lez v0, :cond_0

    const-class v0, Lcom/huawei/hwCloudJs/core/JsCallback;

    const/4 v1, 0x0

    aget-object v1, v2, v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    aget-object v0, v2, v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->b:Ljava/lang/Class;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Class<*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public a(Ljava/lang/Object;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwCloudJs/core/JSRequest;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v3, v0, p1, p2}, Lcom/huawei/hwCloudJs/core/JSRequest;->execute(Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "CallObject"

    const-string v1, "call IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "CallObject"

    const-string v1, "call InstantiationException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public b()Ljava/lang/reflect/Method;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/a/a;->a:Ljava/lang/reflect/Method;

    return-object v0
.end method
