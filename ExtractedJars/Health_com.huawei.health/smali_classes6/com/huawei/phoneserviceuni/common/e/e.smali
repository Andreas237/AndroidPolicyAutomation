.class public Lcom/huawei/phoneserviceuni/common/e/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "CommonUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 97
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 103
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 104
    const-string v0, "get"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 109
    goto :goto_0

    .line 105
    :catch_0
    move-exception v7

    .line 106
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 109
    goto :goto_0

    .line 107
    :catch_1
    move-exception v7

    .line 108
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 111
    :goto_0
    if-eqz v6, :cond_0

    .line 113
    const/4 v0, 0x1

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v4, v0

    .line 120
    goto :goto_1

    .line 114
    :catch_2
    move-exception v7

    .line 115
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 120
    goto :goto_1

    .line 116
    :catch_3
    move-exception v7

    .line 117
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 120
    goto :goto_1

    .line 118
    :catch_4
    move-exception v7

    .line 119
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 123
    :cond_0
    :goto_1
    return-object v4
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 22
    move-object v4, p1

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 28
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 29
    const-string v0, "get"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 34
    goto :goto_0

    .line 30
    :catch_0
    move-exception v7

    .line 31
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 34
    goto :goto_0

    .line 32
    :catch_1
    move-exception v7

    .line 33
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 36
    :goto_0
    if-eqz v6, :cond_0

    .line 38
    const/4 v0, 0x2

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v4, v0

    .line 45
    goto :goto_1

    .line 39
    :catch_2
    move-exception v7

    .line 40
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 45
    goto :goto_1

    .line 41
    :catch_3
    move-exception v7

    .line 42
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 45
    goto :goto_1

    .line 43
    :catch_4
    move-exception v7

    .line 44
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 48
    :cond_0
    :goto_1
    return-object v4
.end method

.method private static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    .line 127
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 8

    .line 60
    move v4, p1

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 66
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 67
    const-string v0, "getBoolean"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 72
    goto :goto_0

    .line 68
    :catch_0
    move-exception v7

    .line 69
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 72
    goto :goto_0

    .line 70
    :catch_1
    move-exception v7

    .line 71
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 74
    :goto_0
    if-eqz v6, :cond_0

    .line 76
    const/4 v0, 0x2

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-result v0

    move v4, v0

    .line 83
    goto :goto_1

    .line 77
    :catch_2
    move-exception v7

    .line 78
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 83
    goto :goto_1

    .line 79
    :catch_3
    move-exception v7

    .line 80
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 83
    goto :goto_1

    .line 81
    :catch_4
    move-exception v7

    .line 82
    const-string v0, "CommonUtils"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/e;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 86
    :cond_0
    :goto_1
    return v4
.end method
