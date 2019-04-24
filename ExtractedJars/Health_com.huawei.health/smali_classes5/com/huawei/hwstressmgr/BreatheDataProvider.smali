.class public Lcom/huawei/hwstressmgr/BreatheDataProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;

.field private static d:Lcom/huawei/hwstressmgr/BreatheDataProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    const-class v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->c:Ljava/lang/String;

    .line 18
    const-string v0, "JanusBreathJni"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load .so success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 20
    :catch_0
    move-exception v4

    .line 21
    sget-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load .so fail"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/UnsatisfiedLinkError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    :goto_0
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    return-void
.end method

.method public static c()Lcom/huawei/hwstressmgr/BreatheDataProvider;
    .locals 2

    .line 46
    sget-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->d:Lcom/huawei/hwstressmgr/BreatheDataProvider;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 47
    new-instance v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;

    invoke-direct {v0}, Lcom/huawei/hwstressmgr/BreatheDataProvider;-><init>()V

    sput-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->d:Lcom/huawei/hwstressmgr/BreatheDataProvider;

    .line 49
    :cond_0
    sget-object v0, Lcom/huawei/hwstressmgr/BreatheDataProvider;->d:Lcom/huawei/hwstressmgr/BreatheDataProvider;

    return-object v0
.end method

.method public static native getBreatheResultFromAlgorithm(III[I[II)[F
.end method
