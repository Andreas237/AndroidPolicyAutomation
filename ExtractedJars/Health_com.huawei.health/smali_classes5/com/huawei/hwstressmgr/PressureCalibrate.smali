.class public Lcom/huawei/hwstressmgr/PressureCalibrate;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/huawei/hwstressmgr/PressureCalibrate;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 15
    const-string v0, "JanusStressJni"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load .so success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    goto :goto_0

    .line 17
    :catch_0
    move-exception v4

    .line 18
    const-string v0, "PressureMeasureMessage"

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

    .line 20
    :goto_0
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method

.method public static c()Lcom/huawei/hwstressmgr/PressureCalibrate;
    .locals 2

    .line 29
    sget-object v0, Lcom/huawei/hwstressmgr/PressureCalibrate;->d:Lcom/huawei/hwstressmgr/PressureCalibrate;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lcom/huawei/hwstressmgr/PressureCalibrate;

    invoke-direct {v0}, Lcom/huawei/hwstressmgr/PressureCalibrate;-><init>()V

    sput-object v0, Lcom/huawei/hwstressmgr/PressureCalibrate;->d:Lcom/huawei/hwstressmgr/PressureCalibrate;

    .line 32
    :cond_0
    sget-object v0, Lcom/huawei/hwstressmgr/PressureCalibrate;->d:Lcom/huawei/hwstressmgr/PressureCalibrate;

    return-object v0
.end method


# virtual methods
.method public native libPressureCalibrate([FII[I[I)[F
.end method
