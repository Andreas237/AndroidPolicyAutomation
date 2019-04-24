.class public Lcom/huawei/phoneserviceuni/common/e/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "RefectUtilss"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 4

    .line 195
    move v1, p2

    .line 196
    const/4 v2, 0x0

    .line 199
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 200
    invoke-virtual {v2, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 201
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 203
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 205
    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result v0

    move v1, v0

    .line 216
    goto :goto_0

    .line 206
    :catch_0
    move-exception v3

    .line 207
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 216
    goto :goto_0

    .line 208
    :catch_1
    move-exception v3

    .line 209
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 216
    goto :goto_0

    .line 210
    :catch_2
    move-exception v3

    .line 211
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 216
    goto :goto_0

    .line 212
    :catch_3
    move-exception v3

    .line 213
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 216
    goto :goto_0

    .line 214
    :catch_4
    move-exception v3

    .line 215
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 217
    :goto_0
    return v1
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 80
    const/4 v1, 0x0

    .line 83
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v2

    .line 85
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 88
    :goto_0
    if-eqz v1, :cond_0

    .line 90
    :try_start_1
    invoke-virtual {v1, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    return-object v0

    .line 91
    :catch_1
    move-exception v2

    .line 92
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 97
    goto :goto_1

    .line 93
    :catch_2
    move-exception v2

    .line 94
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 97
    goto :goto_1

    .line 95
    :catch_3
    move-exception v2

    .line 96
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 99
    :cond_0
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 27
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p2

    array-length v1, p3

    if-eq v0, v1, :cond_1

    .line 28
    :cond_0
    const-string v0, "RefectUtilss"

    const-string v1, "invokeStaticFun \u53c2\u6570\u6709\u8bef"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 32
    :cond_1
    const/4 v2, 0x0

    .line 34
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 37
    goto :goto_0

    .line 35
    :catch_0
    move-exception v3

    .line 36
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 39
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    .line 40
    const/4 v0, 0x0

    return-object v0

    .line 43
    :cond_2
    const/4 v3, 0x0

    .line 45
    :try_start_1
    invoke-virtual {v2, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 48
    goto :goto_1

    .line 46
    :catch_1
    move-exception v4

    .line 47
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 50
    :goto_1
    if-eqz v3, :cond_3

    .line 52
    :try_start_2
    invoke-virtual {v3, v2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v0

    return-object v0

    .line 53
    :catch_2
    move-exception v4

    .line 54
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 59
    goto :goto_2

    .line 55
    :catch_3
    move-exception v4

    .line 56
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 59
    goto :goto_2

    .line 57
    :catch_4
    move-exception v4

    .line 58
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 61
    :cond_3
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    .line 221
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 222
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 3

    .line 157
    const/4 v1, 0x0

    .line 159
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 162
    goto :goto_0

    .line 160
    :catch_0
    move-exception v2

    .line 161
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 164
    :goto_0
    if-eqz v1, :cond_1

    .line 166
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 167
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 169
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 171
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    return v0

    .line 172
    :catch_1
    move-exception v2

    .line 173
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 178
    goto :goto_1

    .line 174
    :catch_2
    move-exception v2

    .line 175
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 178
    goto :goto_1

    .line 176
    :catch_3
    move-exception v2

    .line 177
    const-string v0, "RefectUtilss"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 180
    :cond_1
    :goto_1
    return p2
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 117
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p2

    array-length v1, p3

    if-eq v0, v1, :cond_1

    .line 118
    :cond_0
    const-string v0, "RefectUtilss"

    const-string v1, "invokeFun params invalid"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const/4 v0, 0x0

    return-object v0

    .line 122
    :cond_1
    const/4 v2, 0x0

    .line 125
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 128
    goto :goto_0

    .line 126
    :catch_0
    move-exception v3

    .line 127
    const-string v0, "RefectUtilss"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 130
    :goto_0
    if-eqz v2, :cond_2

    .line 131
    const/4 v3, 0x0

    .line 133
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    move-object v3, v0

    .line 138
    goto :goto_1

    .line 134
    :catch_1
    move-exception v4

    .line 135
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 138
    goto :goto_1

    .line 136
    :catch_2
    move-exception v4

    .line 137
    const-string v0, "RefectUtilss"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 139
    :goto_1
    invoke-static {v2, v3, p1, p2, p3}, Lcom/huawei/phoneserviceuni/common/e/d;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 142
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
