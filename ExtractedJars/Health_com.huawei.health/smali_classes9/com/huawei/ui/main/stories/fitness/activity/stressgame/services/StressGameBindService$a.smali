.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 1

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;->d:Ljava/lang/ref/WeakReference;

    .line 181
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V
    .locals 0

    .line 174
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 185
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 186
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 187
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enterCallBackTime =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 190
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 191
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "objData onResponse"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "onResponse err_code"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IBaseResponseCallback err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GET_DEVICE_DATA == 10000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "objData == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->k(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1, p2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$e;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto/16 :goto_2

    .line 198
    :cond_0
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8bbe\u5907\u4fa7\u56de\u8c03\u5931\u8d25 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 201
    :sswitch_0
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6d4b\u91cf\u5931\u8d25 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    goto :goto_1

    .line 204
    :sswitch_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u84dd\u7259\u8f93\u5165\u53c2\u6570\u975e\u6cd5\u5bfc\u81f4\u5931\u8d25 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    goto :goto_1

    .line 207
    :goto_0
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5176\u4ed6\u5f02\u5e38\u5bfc\u81f4\u7684\u6d4b\u91cf\u5931\u8d25 err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :goto_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter is12SecondWithoutData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 213
    invoke-static {v7}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c()I

    move-result v1

    int-to-float v1, v1

    invoke-interface {v0, v1}, Lo/exb;->a(F)V

    .line 216
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    .line 223
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 224
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "endCallBackTime =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "endCallBackTime - enterCallBackTime =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v10, v8

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    goto :goto_3

    .line 227
    :cond_2
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IBaseResponseCallbackImp mStressGameBindService == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1e849 -> :sswitch_1
        0x1e84a -> :sswitch_0
    .end sparse-switch
.end method
