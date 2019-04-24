.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 1

    .line 106
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 107
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;->e:Ljava/lang/ref/WeakReference;

    .line 108
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V
    .locals 0

    .line 100
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 113
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 114
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 115
    iget v5, p1, Landroid/os/Message;->what:I

    .line 116
    const/16 v0, 0x2710

    if-ne v5, v0, :cond_0

    .line 117
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "what = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v6, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 119
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getRriAndSqi"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)[S

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)[B

    move-result-object v2

    invoke-static {v4, v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Ljava/lang/String;[S[B)V

    .line 122
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    .line 123
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mHandler callbackCounter = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;J)J

    .line 127
    :cond_0
    goto :goto_0

    .line 128
    :cond_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RRIHandler mStressGameBindService == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :goto_0
    return-void
.end method
