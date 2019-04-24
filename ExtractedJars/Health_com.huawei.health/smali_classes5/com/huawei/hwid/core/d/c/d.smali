.class public final Lcom/huawei/hwid/core/d/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/core/d/c/a;


# static fields
.field private static a:Lcom/huawei/hwid/core/d/c/d;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method

.method public static declared-synchronized b()Lcom/huawei/hwid/core/d/c/d;
    .locals 4

    const-class v2, Lcom/huawei/hwid/core/d/c/d;

    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/d;->a:Lcom/huawei/hwid/core/d/c/d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lcom/huawei/hwid/core/d/c/d;

    invoke-direct {v0}, Lcom/huawei/hwid/core/d/c/d;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/c/d;->a:Lcom/huawei/hwid/core/d/c/d;

    .line 33
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/d/c/d;->a:Lcom/huawei/hwid/core/d/c/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private static c()I
    .locals 6

    .line 47
    const-string v0, "android.telephony.TelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 48
    const-string v0, "getDefaultSim"

    const/4 v1, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 49
    const-string v0, "getDefault"

    const/4 v1, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 50
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 51
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 52
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-virtual {v3, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 53
    :catch_0
    move-exception v2

    .line 55
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    goto :goto_0

    .line 56
    :catch_1
    move-exception v2

    .line 58
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "Error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :goto_0
    const/4 v0, -0x1

    return v0
.end method

.method private static d()Ljava/lang/Object;
    .locals 5

    .line 96
    const/4 v2, 0x0

    .line 98
    const-string v0, "com.mediatek.telephony.TelephonyManagerEx"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 99
    const-string v0, "getDefault"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 100
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 103
    goto :goto_0

    .line 101
    :catch_0
    move-exception v3

    .line 102
    const-string v0, "mutiCardMTKImpl"

    const-string v1, " getDefaultTelephonyManagerEx wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :goto_0
    return-object v2
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 42
    invoke-static {}, Lcom/huawei/hwid/core/d/c/d;->c()I

    move-result v0

    return v0
.end method

.method public a(I)I
    .locals 7

    .line 70
    const/4 v2, 0x0

    .line 72
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Class;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 73
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 75
    :try_start_0
    invoke-static {}, Lcom/huawei/hwid/core/d/c/d;->d()Ljava/lang/Object;

    move-result-object v5

    .line 76
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 77
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getSimState"

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 78
    invoke-virtual {v6, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    move v2, v0

    .line 90
    :cond_0
    goto :goto_0

    .line 82
    :catch_0
    move-exception v5

    .line 83
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "NoSuchMethodException getSimState wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    goto :goto_0

    .line 84
    :catch_1
    move-exception v5

    .line 85
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "IllegalArgumentException getSimState wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    goto :goto_0

    .line 86
    :catch_2
    move-exception v5

    .line 87
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "InvocationTargetException getSimState wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    goto :goto_0

    .line 88
    :catch_3
    move-exception v5

    .line 89
    const-string v0, "mutiCardMTKImpl"

    const-string v1, "Exception getSimState wrong "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    :goto_0
    return v2
.end method
