.class public Lo/abu;
.super Lo/abm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/abu$e;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/motiondetection/MotionDetectionListener;

.field private c:Lcom/huawei/motiondetection/MotionDetectionManager;

.field private d:Landroid/os/Handler;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 32
    invoke-direct {p0}, Lo/abm;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abu;->a:Landroid/content/Context;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/abu;->e:Z

    .line 30
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/abu;->d:Landroid/os/Handler;

    .line 129
    new-instance v0, Lo/abu$2;

    invoke-direct {v0, p0}, Lo/abu$2;-><init>(Lo/abu;)V

    iput-object v0, p0, Lo/abu;->b:Lcom/huawei/motiondetection/MotionDetectionListener;

    .line 33
    if-nez p1, :cond_0

    .line 34
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MotionStepCounter context null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void

    .line 37
    :cond_0
    iput-object p1, p0, Lo/abu;->a:Landroid/content/Context;

    .line 38
    new-instance v0, Lcom/huawei/motiondetection/MotionDetectionManager;

    iget-object v1, p0, Lo/abu;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/motiondetection/MotionDetectionManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    .line 39
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 13

    .line 142
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 145
    const-string v0, "StartTime"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 146
    const-string v0, "MotionNum"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v9

    .line 147
    const-string v0, "motionType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v10

    .line 148
    const-string v0, "motionLevel"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v11

    .line 150
    const-string v0, "[%d] : %s : %s : %s"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 151
    invoke-static {v9}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 152
    invoke-static {v11}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 153
    invoke-static {v10}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 150
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 155
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    move-object v0, p0

    iget-object v1, p0, Lo/abu;->a:Landroid/content/Context;

    move-wide v2, v7

    move-object v4, v9

    move-object v5, v11

    move-object v6, v10

    invoke-virtual/range {v0 .. v6}, Lo/abu;->b(Landroid/content/Context;J[I[I[I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    goto :goto_0

    .line 158
    :catch_0
    move-exception v7

    .line 159
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    :cond_0
    :goto_0
    return-void
.end method

.method private b()V
    .locals 5

    .line 109
    :try_start_0
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    iget-object v1, p0, Lo/abu;->b:Lcom/huawei/motiondetection/MotionDetectionListener;

    invoke-virtual {v0, v1}, Lcom/huawei/motiondetection/MotionDetectionManager;->removeMotionListener(Lcom/huawei/motiondetection/MotionDetectionListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    :try_start_1
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    const/16 v1, 0x44d

    invoke-virtual {v0, v1}, Lcom/huawei/motiondetection/MotionDetectionManager;->stopMotionAppsReco(I)Z

    move-result v4

    .line 114
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unInitSensorHubManager ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 118
    goto :goto_0

    .line 116
    :catch_0
    move-exception v4

    .line 117
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stop failed : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Error;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :goto_0
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/MotionDetectionManager;->stopMotionService()V

    .line 121
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/MotionDetectionManager;->destroy()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 126
    :cond_0
    goto :goto_1

    .line 124
    :catch_1
    move-exception v4

    .line 125
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_1
    return-void
.end method

.method private c()V
    .locals 5

    .line 89
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSensorHubManager enter... mMPManager="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    iget-object v1, p0, Lo/abu;->b:Lcom/huawei/motiondetection/MotionDetectionListener;

    invoke-virtual {v0, v1}, Lcom/huawei/motiondetection/MotionDetectionManager;->addMotionListener(Lcom/huawei/motiondetection/MotionDetectionListener;)V

    .line 92
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/MotionDetectionManager;->startMotionService()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 95
    :try_start_1
    iget-object v0, p0, Lo/abu;->c:Lcom/huawei/motiondetection/MotionDetectionManager;

    const/16 v1, 0x44d

    invoke-virtual {v0, v1}, Lcom/huawei/motiondetection/MotionDetectionManager;->startMotionAppsReco(I)Z

    move-result v4

    .line 96
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initSensorHubManager ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 99
    goto :goto_0

    .line 97
    :catch_0
    move-exception v4

    .line 98
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start error : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Error;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 103
    :cond_0
    :goto_0
    goto :goto_1

    .line 101
    :catch_1
    move-exception v4

    .line 102
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/abu;Landroid/os/Bundle;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lo/abu;->a(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 71
    const-string v0, "Step_MotionStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounter enter... mDeviceOpened="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/abu;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-boolean v0, p0, Lo/abu;->e:Z

    if-nez v0, :cond_0

    .line 73
    invoke-direct {p0}, Lo/abu;->c()V

    .line 74
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/abu;->e:Z

    .line 76
    :cond_0
    return-void
.end method

.method public a(Lo/ala;)V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/abu;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lo/abu;->d:Landroid/os/Handler;

    new-instance v1, Lo/abu$e;

    invoke-direct {v1, p1}, Lo/abu$e;-><init>(Lo/ala;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 67
    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .line 81
    iget-boolean v0, p0, Lo/abu;->e:Z

    if-eqz v0, :cond_0

    .line 82
    invoke-direct {p0}, Lo/abu;->b()V

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/abu;->e:Z

    .line 85
    :cond_0
    return-void
.end method
