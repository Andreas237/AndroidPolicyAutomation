.class public Lcom/huawei/hwCloudJs/service/b/a;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "BiUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "BiUtils"

    const-string v1, " staticFun NoSuchMethodException!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-eqz v2, :cond_0

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v3

    const-string v0, "BiUtils"

    const-string v1, " staticFun IllegalAccessException!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_2
    move-exception v3

    const-string v0, "BiUtils"

    const-string v1, " staticFun IllegalArgumentException!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_3
    move-exception v3

    const-string v0, "BiUtils"

    const-string v1, " staticFun InvocationTargetException!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p2

    array-length v1, p3

    if-eq v0, v1, :cond_1

    :cond_0
    const-string v0, "BiUtils"

    const-string v1, "invokeFun params invalid"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v2, 0x0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "BiUtils"

    const-string v1, " staticFun ClassNotFoundException!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-eqz v2, :cond_2

    invoke-static {v2, p1, p2, p3}, Lcom/huawei/hwCloudJs/service/b/a;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p0}, Lcom/huawei/hwCloudJs/service/b/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lo/cjz;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p0}, Lcom/huawei/hwCloudJs/service/b/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/huawei/hwCloudJs/d/f;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/huawei/hwCloudJs/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v0, "H5JSInterfaceInvoke"

    invoke-static {p0, v0, v4}, Lo/cjz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lo/cjz;->b(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string v0, "BIREPORT"

    const-string v1, "BIREPORT not allow!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static a()Z
    .locals 10

    const-string v6, ""

    const-string v7, ""

    const-string v0, "android.os.SystemProperties"

    const-string v1, "get"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "ro.product.locale.language"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwCloudJs/service/b/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v0, "android.os.SystemProperties"

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "ro.product.locale.region"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwCloudJs/service/b/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    move-object v0, v8

    check-cast v0, Ljava/lang/String;

    move-object v6, v0

    :cond_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    move-object v0, v9

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v8

    const-string v0, "BiUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isChinaROM Exception!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string v0, "zh"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "cn"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v0, "user_experience_involved"

    const/4 v1, -0x1

    invoke-static {v2, v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v3

    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/service/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 2

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->c()I

    move-result v0

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->c()I

    move-result v0

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_DENIED:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->c()I

    move-result v0

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-static {p0}, Lcom/huawei/hwCloudJs/service/b/a;->b(Landroid/content/Context;)Z

    move-result v0

    return v0

    :cond_2
    invoke-static {}, Lo/cjz;->e()Z

    move-result v0

    return v0
.end method
