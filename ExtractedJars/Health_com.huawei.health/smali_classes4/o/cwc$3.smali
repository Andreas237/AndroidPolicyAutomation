.class Lo/cwc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 1310
    iput-object p1, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 8

    .line 1322
    if-nez p4, :cond_0

    .line 1323
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange runningPosture HiHealthData is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1324
    return-void

    .line 1326
    :cond_0
    invoke-virtual {p4}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v4

    .line 1329
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 1330
    const-class v0, Lcom/huawei/datatype/RunPostureDataInfo;

    invoke-virtual {v6, v4, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/datatype/RunPostureDataInfo;

    .line 1331
    if-nez v5, :cond_2

    .line 1332
    iget-object v0, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->n(Lo/cwc;)Lo/cet;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1333
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RunPostureDataInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1334
    iget-object v0, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->n(Lo/cwc;)Lo/cet;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cet;->d(Lo/cvv;)V

    .line 1336
    :cond_1
    return-void

    .line 1340
    :cond_2
    new-instance v7, Lo/cvv;

    invoke-direct {v7}, Lo/cvv;-><init>()V

    .line 1342
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmGroundContactTime()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->a(I)V

    .line 1343
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmGroundImpactAcceleration()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->b(I)V

    .line 1344
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmSwingAngle()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->e(I)V

    .line 1345
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmEversionExcursion()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->c(I)V

    .line 1346
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmForeFootStrikePattern()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->d(I)V

    .line 1347
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmWholeFootStrikePattern()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->k(I)V

    .line 1348
    invoke-virtual {v5}, Lcom/huawei/datatype/RunPostureDataInfo;->getmHindPawStrikePattern()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cvv;->i(I)V

    .line 1351
    const-string v0, "TRACKTrack_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lo/cvv;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1352
    iget-object v0, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->n(Lo/cwc;)Lo/cet;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1353
    iget-object v0, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->n(Lo/cwc;)Lo/cet;

    move-result-object v0

    invoke-interface {v0, v7}, Lo/cet;->d(Lo/cvv;)V

    .line 1356
    :cond_3
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 1314
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1315
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regRunningPostureListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1316
    iget-object v0, p0, Lo/cwc$3;->a:Lo/cwc;

    invoke-static {v0, p1}, Lo/cwc;->d(Lo/cwc;Ljava/util/List;)Ljava/util/List;

    .line 1318
    :cond_0
    return-void
.end method
