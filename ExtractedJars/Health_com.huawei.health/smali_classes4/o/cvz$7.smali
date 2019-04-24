.class Lo/cvz$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->c(Landroid/content/Context;JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvz;

.field final synthetic d:I

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;I)V
    .locals 0

    .line 1287
    iput-object p1, p0, Lo/cvz$7;->b:Lo/cvz;

    iput-object p2, p0, Lo/cvz$7;->e:Lo/duh;

    iput p3, p0, Lo/cvz$7;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 1290
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1291
    iget-object v0, p0, Lo/cvz$7;->e:Lo/duh;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1292
    return-void

    .line 1294
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1295
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepDataAsDayUnit the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1296
    iget-object v0, p0, Lo/cvz$7;->e:Lo/duh;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1297
    return-void

    .line 1300
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1301
    new-instance v5, Lo/cvz$d;

    invoke-direct {v5}, Lo/cvz$d;-><init>()V

    .line 1302
    iget v0, p0, Lo/cvz$7;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 1303
    invoke-static {v4, v5}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v6

    .line 1304
    invoke-static {v4, v5}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 1305
    const/4 v9, 0x0

    .line 1306
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 1307
    const-string v0, "sum"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    const v1, 0x461c4000    # 10000.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 1308
    add-int/lit8 v9, v9, 0x1

    .line 1310
    :cond_2
    goto :goto_0

    .line 1311
    :cond_3
    new-instance v10, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;

    invoke-direct {v10}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;-><init>()V

    .line 1312
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setKey(I)V

    .line 1313
    invoke-virtual {v10, v7, v8}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setTimeStamp(J)V

    .line 1314
    invoke-virtual {v10, v9}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setOverGoal(I)V

    .line 1315
    float-to-int v0, v6

    invoke-virtual {v10, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setValue(I)V

    .line 1317
    iget-object v0, p0, Lo/cvz$7;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v10}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1318
    goto :goto_1

    :cond_4
    iget v0, p0, Lo/cvz$7;->d:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_5

    .line 1319
    invoke-static {v4, v5}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v6

    .line 1320
    invoke-static {v4, v5}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v7

    .line 1321
    new-instance v9, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;

    invoke-direct {v9}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;-><init>()V

    .line 1322
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setKey(I)V

    .line 1323
    invoke-virtual {v9, v7, v8}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setTimeStamp(J)V

    .line 1324
    float-to-int v0, v6

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStepResult;->setValue(I)V

    .line 1325
    iget-object v0, p0, Lo/cvz$7;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v9}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1327
    :cond_5
    :goto_1
    return-void
.end method
