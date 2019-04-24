.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 7

    .line 19
    const-string v5, ""

    .line 21
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 23
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "ro.serialno"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x0

    invoke-virtual {v6, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_4

    move-object v5, v0

    .line 34
    goto :goto_0

    .line 24
    :catch_0
    move-exception v6

    .line 25
    const-string v0, "DeviceUtil"

    const-string v1, "getSN NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    goto :goto_0

    .line 26
    :catch_1
    move-exception v6

    .line 27
    const-string v0, "DeviceUtil"

    const-string v1, "getSN IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    goto :goto_0

    .line 28
    :catch_2
    move-exception v6

    .line 29
    const-string v0, "DeviceUtil"

    const-string v1, "getSN ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    goto :goto_0

    .line 30
    :catch_3
    move-exception v6

    .line 31
    const-string v0, "DeviceUtil"

    const-string v1, "getSN IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    goto :goto_0

    .line 32
    :catch_4
    move-exception v6

    .line 33
    const-string v0, "DeviceUtil"

    const-string v1, "getSN InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    sget-object v5, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 38
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 39
    const-string v5, ""

    .line 41
    :cond_1
    return-object v5
.end method
