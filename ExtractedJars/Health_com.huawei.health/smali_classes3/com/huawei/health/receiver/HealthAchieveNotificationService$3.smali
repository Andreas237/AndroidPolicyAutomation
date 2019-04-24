.class Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 200
    iput-object p1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    iput-object p2, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 203
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go acquireReportNo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 205
    const-string v0, "reportNo"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dwh;

    .line 207
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 208
    return-void

    .line 210
    :cond_0
    invoke-virtual {v5}, Lo/dwh;->b()I

    move-result v6

    .line 211
    invoke-virtual {v5}, Lo/dwh;->n()I

    move-result v7

    .line 212
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReportNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "minReportNo="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 216
    :cond_1
    move v8, v6

    goto :goto_0

    .line 219
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 222
    goto :goto_0

    .line 220
    :catch_0
    move-exception v10

    .line 221
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireReportNo error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    :cond_3
    move v9, v7

    goto :goto_1

    .line 229
    :cond_4
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v9, v0

    .line 232
    goto :goto_1

    .line 230
    :catch_1
    move-exception v10

    .line 231
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireReportNo error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :goto_1
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MaxNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "minNo="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$3;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    iget-object v10, v0, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b:Landroid/os/Handler;

    .line 237
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 238
    if-le v9, v7, :cond_5

    move v0, v9

    goto :goto_2

    :cond_5
    move v0, v7

    :goto_2
    if-le v8, v6, :cond_6

    move v1, v8

    goto :goto_3

    :cond_6
    move v1, v6

    :goto_3
    const/4 v2, 0x1

    invoke-virtual {v10, v2, v0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v11

    .line 239
    invoke-virtual {v10, v11}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 241
    :cond_7
    return-void
.end method
