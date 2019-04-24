.class public Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

.field private static e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 10
    const-class v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->e:Ljava/lang/String;

    .line 15
    const-string v0, "BiofeedBack"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->e:Ljava/lang/String;

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
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->e:Ljava/lang/String;

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

    .line 21
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native bioFeedbackAlgorithm([S[BIII)[F
.end method

.method public static c()Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;
    .locals 4

    .line 25
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->d:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 26
    const-class v2, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    monitor-enter v2

    .line 27
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->d:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 28
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->d:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 32
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;->d:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/algorithm/BIO;

    return-object v0
.end method
