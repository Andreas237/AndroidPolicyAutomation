.class final Lcom/huawei/common/applog/AppLogApi$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1086
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1088
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1089
    const-string v0, "ReportApi"

    const-string v1, "reportHandler handleMessage"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1090
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2710

    if-ne v1, v0, :cond_2

    .line 1091
    const-string v0, "ReportApi"

    const-string v1, "instert list sucess"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1092
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$700()I

    move-result v0

    if-nez v0, :cond_0

    .line 1093
    const-string v0, "ReportApi"

    const-string v1, "reportCycle is 0, report immediately"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1094
    invoke-static {}, Lcom/huawei/common/applog/bean/c;->a()Lcom/huawei/common/applog/bean/c;

    move-result-object v0

    new-instance v1, Lcom/huawei/common/applog/AppLogApi$3$1;

    invoke-direct {v1, p0}, Lcom/huawei/common/applog/AppLogApi$3$1;-><init>(Lcom/huawei/common/applog/AppLogApi$3;)V

    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/bean/c;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1104
    :cond_0
    const-string v0, "ReportApi"

    const-string v1, "reportCycle is not 0"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1106
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/e;->c()Ljava/util/Timer;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1107
    const-string v0, "ReportApi"

    const-string v1, "new timer"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1108
    new-instance v6, Ljava/util/Timer;

    invoke-direct {v6}, Ljava/util/Timer;-><init>()V

    .line 1109
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/common/applog/bean/e;->a(Ljava/util/Timer;)V

    .line 1110
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/e;->c()Ljava/util/Timer;

    move-result-object v0

    new-instance v1, Lcom/huawei/common/applog/AppLogApi$3$2;

    invoke-direct {v1, p0}, Lcom/huawei/common/applog/AppLogApi$3$2;-><init>(Lcom/huawei/common/applog/AppLogApi$3;)V

    .line 1118
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$700()I

    move-result v2

    int-to-long v2, v2

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$700()I

    move-result v4

    int-to-long v4, v4

    .line 1110
    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 1119
    goto :goto_0

    .line 1120
    :cond_1
    const-string v0, "ReportApi"

    const-string v1, "already have timer"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1124
    :cond_2
    :goto_0
    return-void
.end method
