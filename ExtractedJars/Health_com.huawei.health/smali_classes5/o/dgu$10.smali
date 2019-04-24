.class Lo/dgu$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;)V
    .locals 0

    .line 1268
    iput-object p1, p0, Lo/dgu$10;->d:Lo/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1275
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Limit_Flag"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 1276
    if-nez v4, :cond_0

    .line 1277
    new-instance v5, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HeartRate_Limit_Flag"

    const-string v1, "0"

    invoke-direct {v5, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1278
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v5, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1279
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeHeartDataToDataBase userPreferenceLimitHeart is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1283
    :cond_0
    goto :goto_0

    .line 1281
    :catch_0
    move-exception v4

    .line 1282
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    :goto_0
    :try_start_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Flag"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v4

    .line 1288
    if-nez v4, :cond_1

    .line 1289
    new-instance v5, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HeartRate_Flag"

    const-string v1, "0"

    invoke-direct {v5, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1290
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v5, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1291
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeHeartDataToDataBase userPreferenceMaxHeart is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1295
    :cond_1
    goto :goto_1

    .line 1293
    :catch_1
    move-exception v4

    .line 1294
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1297
    :goto_1
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HeartRate_Classify_Method"

    iget-object v1, p0, Lo/dgu$10;->d:Lo/dgu;

    .line 1298
    invoke-static {v1}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1299
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1301
    new-instance v5, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_Rest_HeartRate"

    iget-object v1, p0, Lo/dgu$10;->d:Lo/dgu;

    .line 1302
    invoke-static {v1}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRate()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1303
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v5, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1305
    new-instance v6, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HRRHeartZone_Config"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/dgu$10;->d:Lo/dgu;

    .line 1306
    invoke-static {v2}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRHRZoneConfStr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dgu$10;->d:Lo/dgu;

    invoke-static {v2}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRThresholdString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1307
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v6, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1309
    new-instance v7, Lcom/huawei/hihealth/HiUserPreference;

    const-string v0, "custom.UserPreference_HeartZone_Config"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lo/dgu$10;->d:Lo/dgu;

    .line 1310
    invoke-static {v2}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRZoneConfStr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dgu$10;->d:Lo/dgu;

    invoke-static {v2}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getThresholdString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1311
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v7, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserPreference;Z)Z

    .line 1312
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHRRHeartRateThrosholdConf write over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1315
    new-instance v8, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 1316
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 1317
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 1318
    const/16 v0, 0x2712

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 1319
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 1320
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 1321
    invoke-static {}, Lo/dgu;->j()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v8, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 1324
    :cond_2
    invoke-static {}, Lo/dgu;->j()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->y(Landroid/content/Context;)V

    .line 1325
    return-void
.end method
