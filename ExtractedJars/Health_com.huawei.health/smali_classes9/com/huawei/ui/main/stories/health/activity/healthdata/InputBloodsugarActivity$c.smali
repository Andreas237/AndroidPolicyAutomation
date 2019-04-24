.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 1

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 178
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 16

    .line 182
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showHealthDataSyncDialogResponseCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    .line 184
    if-nez v8, :cond_0

    .line 185
    return-void

    .line 187
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 188
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-gez v0, :cond_1

    .line 189
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_timeerror:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 190
    return-void

    .line 192
    :cond_1
    sget-object v0, Lo/dae;->cZ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v11

    .line 193
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 194
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v11, v12, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 201
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Z)Z

    .line 202
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v13

    .line 203
    const/4 v0, 0x4

    iput v0, v13, Landroid/os/Message;->what:I

    .line 204
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v13, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 205
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dmn;->f(J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    goto :goto_0

    :cond_2
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dmn;->f(J)J

    move-result-wide v14

    .line 206
    :goto_0
    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/fdj;

    move-result-object v0

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I

    move-result v2

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lo/dmn;->i(J)J

    move-result-wide v3

    move-wide v5, v14

    iget-object v7, v8, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;

    invoke-virtual/range {v0 .. v7}, Lo/fdj;->c(Landroid/content/Context;IJJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 207
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/dmn;->i(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void
.end method
