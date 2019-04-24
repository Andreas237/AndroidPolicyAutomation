.class public Lcom/huawei/hwid/core/d/c/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/core/d/c/a;


# static fields
.field private static a:Lcom/huawei/hwid/core/d/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()Lcom/huawei/hwid/core/d/c/c;
    .locals 4

    const-class v2, Lcom/huawei/hwid/core/d/c/c;

    monitor-enter v2

    .line 33
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/c;->a:Lcom/huawei/hwid/core/d/c/c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 34
    new-instance v0, Lcom/huawei/hwid/core/d/c/c;

    invoke-direct {v0}, Lcom/huawei/hwid/core/d/c/c;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/c/c;->a:Lcom/huawei/hwid/core/d/c/c;

    .line 36
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/c;->a:Lcom/huawei/hwid/core/d/c/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static c()Ljava/lang/Object;
    .locals 5

    .line 107
    const/4 v2, 0x0

    .line 109
    const-string v0, "android.telephony.MSimTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 110
    const-string v0, "getDefault"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 111
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 114
    goto :goto_0

    .line 112
    :catch_0
    move-exception v3

    .line 113
    const-string v0, "MutiCardHwImpl"

    const-string v1, " getDefaultMSimTelephonyManager wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    :goto_0
    return-object v2
.end method


# virtual methods
.method public a()I
    .locals 6

    .line 47
    const/4 v3, 0x0

    .line 49
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/c;->c()Ljava/lang/Object;

    move-result-object v4

    .line 50
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getDefaultSubscription"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 53
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v5, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result v3

    .line 68
    :cond_0
    goto :goto_0

    .line 56
    :catch_0
    move-exception v4

    .line 57
    const-string v0, "MutiCardHwImpl"

    const-string v1, " NoSuchMethodException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const/4 v3, -0x1

    .line 68
    goto :goto_0

    .line 59
    :catch_1
    move-exception v4

    .line 60
    const-string v0, "MutiCardHwImpl"

    const-string v1, " IllegalArgumentException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const/4 v3, -0x1

    .line 68
    goto :goto_0

    .line 62
    :catch_2
    move-exception v4

    .line 63
    const-string v0, "MutiCardHwImpl"

    const-string v1, " InvocationTargetException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const/4 v3, -0x1

    .line 68
    goto :goto_0

    .line 65
    :catch_3
    move-exception v4

    .line 66
    const-string v0, "MutiCardHwImpl"

    const-string v1, " Exception wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const/4 v3, -0x1

    .line 69
    :goto_0
    return v3
.end method

.method public a(I)I
    .locals 7

    .line 79
    const/4 v2, 0x0

    .line 80
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 81
    const/4 v2, 0x5

    .line 83
    :cond_0
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 84
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 86
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/c;->c()Ljava/lang/Object;

    move-result-object v5

    .line 88
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getSimState"

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 90
    invoke-virtual {v6, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    move v2, v0

    .line 101
    :cond_1
    goto :goto_0

    .line 93
    :catch_0
    move-exception v5

    .line 94
    const-string v0, "MutiCardHwImpl"

    const-string v1, " IllegalAccessException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    goto :goto_0

    .line 95
    :catch_1
    move-exception v5

    .line 96
    const-string v0, "MutiCardHwImpl"

    const-string v1, " NoSuchMethodException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    goto :goto_0

    .line 97
    :catch_2
    move-exception v5

    .line 98
    const-string v0, "MutiCardHwImpl"

    const-string v1, " IllegalArgumentException wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    goto :goto_0

    .line 99
    :catch_3
    move-exception v5

    .line 100
    const-string v0, "MutiCardHwImpl"

    const-string v1, " getSimState wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :goto_0
    return v2
.end method
