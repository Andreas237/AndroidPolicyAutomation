.class public Lo/bto;
.super Lo/bsk;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lo/bsk;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)Lcom/huawei/pluginFitnessAdvice/TrainAction;
    .locals 7

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 182
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "action_info"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "actionId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 184
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const/4 v0, 0x1

    aput-object p1, v4, v0

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 186
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 191
    const/4 v6, 0x0

    .line 192
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 193
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {p0, v5}, Lo/bto;->a(Landroid/database/Cursor;)Lcom/huawei/pluginFitnessAdvice/TrainAction;

    move-result-object v6

    .line 196
    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 198
    :cond_1
    return-object v6
.end method

.method private c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V
    .locals 5

    .line 147
    invoke-direct {p0, p1, p2}, Lo/bto;->e(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)Landroid/content/ContentValues;

    move-result-object v4

    .line 148
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "action_info"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 152
    const-string v0, "TrainActionDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertMotion\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-void
.end method

.method private e(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)Landroid/content/ContentValues;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 157
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 158
    const-string v0, "actionId"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "userId"

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "name"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "motionType"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireMotionType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "difficulty"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireDifficulty()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 163
    const-string v0, "covers"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireCovers()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "description"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "equipments"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireEquipments()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "trainingpoints"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireTrainingpoints()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "videos"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVideos()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "version"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "modified"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireModified()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 171
    const-string v0, "TrainActionDao"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getContentValues() motion="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ", values="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-object v4
.end method


# virtual methods
.method protected a(Landroid/database/Cursor;)Lcom/huawei/pluginFitnessAdvice/TrainAction;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 203
    new-instance v2, Lcom/huawei/pluginFitnessAdvice/TrainAction;

    invoke-direct {v2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;-><init>()V

    .line 204
    const-string v0, "actionId"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveId(Ljava/lang/String;)V

    .line 205
    const-string v0, "userId"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveUserId(Ljava/lang/String;)V

    .line 206
    const-string v0, "name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveName(Ljava/lang/String;)V

    .line 207
    const-string v0, "motionType"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveMotionType(Ljava/lang/String;)V

    .line 208
    const-string v0, "difficulty"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDifficulty(I)V

    .line 209
    const-string v0, "covers"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveCovers(Ljava/util/List;)V

    .line 210
    const-string v0, "description"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDescription(Ljava/lang/String;)V

    .line 211
    const-string v0, "equipments"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Equipment;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveEquipments(Ljava/util/List;)V

    .line 212
    const-string v0, "trainingpoints"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Trainingpoint;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveTrainingpoints(Ljava/util/List;)V

    .line 213
    const-string v0, "videos"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Video;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVideos(Ljava/util/List;)V

    .line 214
    const-string v0, "version"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVersion(Ljava/lang/String;)V

    .line 215
    const-string v0, "modified"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveModified(J)V

    .line 217
    return-object v2
.end method

.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;)V"
        }
    .end annotation

    .line 136
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 137
    :cond_0
    const-string v0, "TrainActionDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 141
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/TrainAction;

    invoke-virtual {p0, p1, v0}, Lo/bto;->d(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V

    .line 140
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 144
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V
    .locals 8

    .line 418
    invoke-direct {p0, p1, p2}, Lo/bto;->e(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)Landroid/content/ContentValues;

    move-result-object v7

    .line 419
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "action_info"

    move-object v3, v7

    const-string v4, "actionId=? and version=? and userId=?"

    const/4 v2, 0x3

    new-array v5, v2, [Ljava/lang/String;

    .line 421
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x1

    aput-object v2, v5, v6

    const/4 v2, 0x2

    aput-object p1, v5, v2

    .line 419
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/data/DBFactory;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 422
    const-string v0, "TrainActionDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateMotion \uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    return-void
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/TrainAction;>;"
        }
    .end annotation

    .line 356
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 357
    :cond_0
    const-string v0, "TrainActionDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrainActions actionIdList  == null || actionIdList.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    const/4 v0, 0x0

    return-object v0

    .line 361
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 362
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 365
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "action_info"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "actionId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 367
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 369
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v6, v7}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 374
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 375
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 376
    new-instance v9, Lcom/huawei/pluginFitnessAdvice/TrainAction;

    invoke-direct {v9}, Lcom/huawei/pluginFitnessAdvice/TrainAction;-><init>()V

    .line 378
    const-string v0, "actionId"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveId(Ljava/lang/String;)V

    .line 379
    const-string v0, "userId"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveUserId(Ljava/lang/String;)V

    .line 380
    const-string v0, "name"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveName(Ljava/lang/String;)V

    .line 381
    const-string v0, "motionType"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveMotionType(Ljava/lang/String;)V

    .line 382
    const-string v0, "difficulty"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDifficulty(I)V

    .line 383
    const-string v0, "covers"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveCovers(Ljava/util/List;)V

    .line 384
    const-string v0, "description"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveDescription(Ljava/lang/String;)V

    .line 385
    const-string v0, "equipments"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Equipment;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveEquipments(Ljava/util/List;)V

    .line 386
    const-string v0, "trainingpoints"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Trainingpoint;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveTrainingpoints(Ljava/util/List;)V

    .line 387
    const-string v0, "videos"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-class v1, [Lcom/huawei/pluginFitnessAdvice/Video;

    invoke-static {v0, v1}, Lo/cae;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVideos(Ljava/util/List;)V

    .line 388
    const-string v0, "version"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveVersion(Ljava/lang/String;)V

    .line 389
    const-string v0, "modified"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->saveModified(J)V

    .line 390
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 393
    :cond_2
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 362
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 396
    :cond_4
    return-object v4
.end method

.method public d(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V
    .locals 6

    .line 108
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 109
    const-string v0, "TrainActionDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "motion is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    const-string v0, "TrainActionDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-direct {p0, p1, p2}, Lo/bto;->a(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)Lcom/huawei/pluginFitnessAdvice/TrainAction;

    move-result-object v4

    .line 114
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 115
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v5

    .line 116
    if-eqz v5, :cond_2

    .line 117
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/TrainAction;->acquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    return-void

    .line 122
    :cond_1
    invoke-virtual {p0, p1, p2}, Lo/bto;->b(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V

    .line 123
    return-void

    .line 127
    :cond_2
    invoke-virtual {p0, p1, p2}, Lo/bto;->b(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V

    .line 128
    return-void

    .line 132
    :cond_3
    invoke-direct {p0, p1, p2}, Lo/bto;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/TrainAction;)V

    .line 133
    return-void
.end method
