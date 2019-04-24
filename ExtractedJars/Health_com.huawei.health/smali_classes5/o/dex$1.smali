.class Lo/dex$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dex;->c(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dex;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dex;I)V
    .locals 0

    .line 1177
    iput-object p1, p0, Lo/dex$1;->a:Lo/dex;

    iput p2, p0, Lo/dex$1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 7

    .line 1180
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "insertSampPointHiHealthData onResult type="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, " obj="

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    if-nez p1, :cond_0

    .line 1182
    iget-object v0, p0, Lo/dex$1;->a:Lo/dex;

    invoke-static {v0}, Lo/dex;->c(Lo/dex;)Lo/dex$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dex$d;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1184
    :cond_0
    iget-object v0, p0, Lo/dex$1;->a:Lo/dex;

    invoke-static {v0}, Lo/dex;->c(Lo/dex;)Lo/dex$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dex$d;->sendEmptyMessage(I)Z

    .line 1185
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSampPointHiHealthData not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1188
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v5

    .line 1189
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 1190
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBroadcast, but localBroadcastManager is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1191
    return-void

    .line 1193
    :cond_1
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveDataToHiHealth enter stage is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dex$1;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    iget v0, p0, Lo/dex$1;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1195
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.COMMON_DATA_SAVE_COMPLETED"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1196
    invoke-virtual {v5, v6}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1198
    :cond_2
    return-void
.end method
