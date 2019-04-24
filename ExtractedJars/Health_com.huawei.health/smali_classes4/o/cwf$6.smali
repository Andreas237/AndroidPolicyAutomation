.class Lo/cwf$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwf;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwf;


# direct methods
.method constructor <init>(Lo/cwf;)V
    .locals 0

    .line 1104
    iput-object p1, p0, Lo/cwf$6;->d:Lo/cwf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 1107
    invoke-static {}, Lo/cwf;->k()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 1108
    move-object v5, p2

    :try_start_0
    check-cast v5, Ljava/util/List;

    .line 1109
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1110
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() smartAlarmInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1115
    :cond_0
    iget-object v0, p0, Lo/cwf$6;->d:Lo/cwf;

    invoke-static {v0}, Lo/cwf;->e(Lo/cwf;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1116
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1117
    iget-object v0, p0, Lo/cwf$6;->d:Lo/cwf;

    invoke-virtual {v0, v5}, Lo/cwf;->d(Ljava/util/List;)V

    .line 1119
    :cond_1
    iget-object v0, p0, Lo/cwf$6;->d:Lo/cwf;

    iget-object v1, p0, Lo/cwf$6;->d:Lo/cwf;

    iget-object v1, v1, Lo/cwf;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Lo/cwf;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1120
    const-string v0, "HWAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() setEventAlarm finish."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1121
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 1122
    :goto_0
    return-void
.end method
