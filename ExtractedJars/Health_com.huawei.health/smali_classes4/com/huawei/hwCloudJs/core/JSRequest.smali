.class public abstract Lcom/huawei/hwCloudJs/core/JSRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/enables/INoProguard;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/reflect/Method;Ljava/lang/Object;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-lez v3, :cond_0

    new-array v5, v3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, v5, v0

    add-int/lit8 v0, v3, -0x1

    aget-object v0, v2, v0

    const-class v1, Lcom/huawei/hwCloudJs/core/JsCallback;

    if-ne v0, v1, :cond_0

    add-int/lit8 v0, v3, -0x1

    aput-object p3, v5, v0

    const/4 v4, 0x1

    :cond_0
    :try_start_0
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "JSRequest"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    return-void

    :catch_1
    move-exception v6

    const-string v0, "JSRequest"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    return-void

    :goto_0
    if-nez v4, :cond_1

    invoke-virtual {p3}, Lcom/huawei/hwCloudJs/core/JsCallback;->success()V

    :cond_1
    return-void
.end method
