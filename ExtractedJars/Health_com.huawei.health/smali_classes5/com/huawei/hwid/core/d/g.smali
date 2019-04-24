.class public Lcom/huawei/hwid/core/d/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 150
    invoke-static {p0, p3, p4}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Object;)V

    .line 151
    const/4 v2, 0x0

    .line 153
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v2

    .line 155
    :try_start_1
    invoke-virtual {v2, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    return-object v0

    .line 156
    :catch_0
    move-exception v3

    .line 157
    const-string v0, "HwInvoke"

    const-string v1, "IllegalAccessException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 158
    :catch_1
    move-exception v3

    .line 159
    const-string v0, "HwInvoke"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    goto :goto_0

    .line 160
    :catch_2
    move-exception v3

    .line 161
    const-string v0, "HwInvoke"

    const-string v1, "InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 168
    :goto_0
    goto :goto_1

    .line 163
    :catch_3
    move-exception v3

    .line 165
    throw v3

    .line 166
    :catch_4
    move-exception v3

    .line 167
    const-string v0, "HwInvoke"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 68
    invoke-static {p0, p2, p3}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Object;)V

    .line 70
    const/4 v2, 0x0

    .line 72
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v2

    .line 75
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-result-object v0

    return-object v0

    .line 76
    :catch_0
    move-exception v3

    .line 77
    const-string v0, "HwInvoke"

    const-string v1, "IllegalAccessException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 78
    :catch_1
    move-exception v3

    .line 79
    const-string v0, "HwInvoke"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 80
    :catch_2
    move-exception v3

    .line 81
    const-string v0, "HwInvoke"

    const-string v1, "InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    .line 87
    :goto_0
    goto :goto_1

    .line 83
    :catch_3
    move-exception v3

    .line 84
    const-string v0, "HwInvoke"

    const-string v1, "NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    goto :goto_1

    .line 85
    :catch_4
    move-exception v3

    .line 86
    const-string v0, "HwInvoke"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 113
    const/4 v2, 0x0

    .line 115
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 116
    invoke-static {v2, p1, p2, p3}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    .line 117
    :catch_0
    move-exception v3

    .line 118
    const-string v0, "HwInvoke"

    const-string v1, "ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    goto :goto_0

    .line 119
    :catch_1
    move-exception v3

    .line 120
    const-string v0, "HwInvoke"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    goto :goto_0

    .line 121
    :catch_2
    move-exception v3

    .line 122
    const-string v0, "HwInvoke"

    const-string v1, "Throwable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 38
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "class is null in staticFun"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 42
    if-eqz p2, :cond_3

    .line 43
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "paramsType is null, but params is not null"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 47
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "paramsType or params should be same"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_2
    array-length v0, p1

    array-length v1, p2

    if-eq v0, v1, :cond_3

    .line 50
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "paramsType len:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " should equal params.len:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_3
    return-void
.end method
