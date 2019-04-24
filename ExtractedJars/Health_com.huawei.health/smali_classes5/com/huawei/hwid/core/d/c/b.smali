.class public Lcom/huawei/hwid/core/d/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hwid/core/d/c/a$a;

.field private static b:Lcom/huawei/hwid/core/d/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    sget-object v0, Lcom/huawei/hwid/core/d/c/a$a;->a:Lcom/huawei/hwid/core/d/c/a$a;

    sput-object v0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;

    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/hwid/core/d/c/a;
    .locals 4

    const-class v2, Lcom/huawei/hwid/core/d/c/b;

    monitor-enter v2

    .line 34
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/b;->b()Z

    .line 37
    sget-object v0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->d:Lcom/huawei/hwid/core/d/c/a$a;

    if-ne v0, v1, :cond_0

    .line 38
    invoke-static {}, Lcom/huawei/hwid/core/d/c/d;->b()Lcom/huawei/hwid/core/d/c/d;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/c/b;->b:Lcom/huawei/hwid/core/d/c/a;

    goto :goto_0

    .line 40
    :cond_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/c;->b()Lcom/huawei/hwid/core/d/c/c;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/c/b;->b:Lcom/huawei/hwid/core/d/c/a;

    .line 43
    :goto_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/b;->b:Lcom/huawei/hwid/core/d/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private static declared-synchronized a(Lcom/huawei/hwid/core/d/c/a$a;)V
    .locals 1

    const-class v0, Lcom/huawei/hwid/core/d/c/b;

    monitor-enter v0

    .line 82
    :try_start_0
    sput-object p0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b()Z
    .locals 5

    const-class v4, Lcom/huawei/hwid/core/d/c/b;

    monitor-enter v4

    .line 53
    const/4 v2, 0x0

    .line 55
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->a:Lcom/huawei/hwid/core/d/c/a$a;

    if-eq v0, v1, :cond_1

    .line 56
    sget-object v0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->c:Lcom/huawei/hwid/core/d/c/a$a;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/huawei/hwid/core/d/c/b;->a:Lcom/huawei/hwid/core/d/c/a$a;

    sget-object v1, Lcom/huawei/hwid/core/d/c/a$a;->d:Lcom/huawei/hwid/core/d/c/a$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_4

    .line 57
    :cond_0
    const/4 v2, 0x1

    goto :goto_1

    .line 61
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/huawei/hwid/core/d/c/b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    sget-object v0, Lcom/huawei/hwid/core/d/c/a$a;->d:Lcom/huawei/hwid/core/d/c/a$a;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/c/b;->a(Lcom/huawei/hwid/core/d/c/a$a;)V

    .line 63
    const/4 v2, 0x1

    goto :goto_0

    .line 64
    :cond_2
    invoke-static {}, Lcom/huawei/hwid/core/d/c/b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 65
    sget-object v0, Lcom/huawei/hwid/core/d/c/a$a;->c:Lcom/huawei/hwid/core/d/c/a$a;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/c/b;->a(Lcom/huawei/hwid/core/d/c/a$a;)V

    .line 66
    const/4 v2, 0x1

    goto :goto_0

    .line 68
    :cond_3
    sget-object v0, Lcom/huawei/hwid/core/d/c/a$a;->b:Lcom/huawei/hwid/core/d/c/a$a;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/c/b;->a(Lcom/huawei/hwid/core/d/c/a$a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    :goto_0
    goto :goto_1

    .line 70
    :catch_0
    move-exception v3

    .line 72
    const-string v0, "mutiCardFactory"

    const-string v1, " Exception"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    goto :goto_1

    .line 73
    :catch_1
    move-exception v3

    .line 75
    const-string v0, "mutiCardFactory"

    const-string v1, "Error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    :cond_4
    :goto_1
    monitor-exit v4

    return v2

    :catchall_0
    move-exception v2

    monitor-exit v4

    throw v2
.end method

.method public static c()Z
    .locals 6

    .line 92
    const/4 v3, 0x0

    .line 94
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/c;->c()Ljava/lang/Object;

    move-result-object v4

    .line 95
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "isMultiSimEnabled"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 97
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v3, v0

    .line 106
    :cond_0
    goto :goto_0

    .line 100
    :catch_0
    move-exception v4

    .line 102
    const-string v0, "mutiCardFactory"

    const-string v1, "MSimTelephonyManager.getDefault().Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    goto :goto_0

    .line 103
    :catch_1
    move-exception v4

    .line 105
    const-string v0, "mutiCardFactory"

    const-string v1, "MSimTelephonyManager.getDefault().Error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :goto_0
    const-string v0, "mutiCardFactory"

    const-string v1, "isHwGeminiSupport1 "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    return v3
.end method

.method private static d()Z
    .locals 5

    .line 113
    const/4 v2, 0x0

    .line 115
    const-string v0, "com.mediatek.common.featureoption.FeatureOption"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 116
    const-string v0, "MTK_GEMINI_SUPPORT"

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 117
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 118
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v2, v0

    .line 125
    goto :goto_0

    .line 119
    :catch_0
    move-exception v3

    .line 121
    const-string v0, "mutiCardFactory"

    const-string v1, "FeatureOption.MTK_GEMINI_SUPPORT"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    goto :goto_0

    .line 122
    :catch_1
    move-exception v3

    .line 124
    const-string v0, "mutiCardFactory"

    const-string v1, "FeatureOption.MTK_GEMINI_SUPPORT"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :goto_0
    const-string v0, "mutiCardFactory"

    const-string v1, "isMtkGeminiSupport "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    return v2
.end method
