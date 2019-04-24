.class public Lo/btp;
.super Lo/btg;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/btg;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 6

    .line 222
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "topic_workouts"

    const-string v2, "userId=? AND topicId=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 225
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 222
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    .line 226
    return-void
.end method

.method private b(Ljava/lang/String;ILjava/util/List;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;II)V"
        }
    .end annotation

    .line 247
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 248
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p4

    move v4, p5

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lo/btp;->e(Ljava/lang/String;IIILcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 249
    invoke-virtual {p0, p1, v7}, Lo/btp;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 250
    goto :goto_0

    .line 251
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Topic;I)V
    .locals 5

    .line 237
    invoke-direct {p0, p1, p2, p3}, Lo/btp;->e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Topic;I)Landroid/content/ContentValues;

    move-result-object v4

    .line 238
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 239
    invoke-static {}, Lo/btp;->e()Ljava/lang/String;

    move-result-object v1

    .line 238
    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 242
    const-string v0, "TopicDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertTopic\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-void
.end method

.method private c(Ljava/lang/String;III)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;III)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 165
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "topic_workouts"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 166
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-static {}, Lo/btg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 168
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".* from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userId"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "topicId"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "type"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 176
    const/4 v0, 0x1

    if-eq p3, v0, :cond_0

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "pageNum"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 180
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userId"

    invoke-static {v4, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "workoutId"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-static {v4, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "version"

    invoke-static {v3, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "version"

    invoke-static {v4, v1}, Lo/btp;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 185
    const/4 v6, 0x0

    .line 187
    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    .line 188
    const/4 v0, 0x5

    new-array v6, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v6, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const/4 v0, 0x4

    aput-object p1, v6, v0

    goto :goto_0

    .line 190
    :cond_1
    const/4 v0, 0x4

    new-array v6, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v6, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const/4 v0, 0x3

    aput-object p1, v6, v0

    .line 194
    :goto_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 196
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    .line 194
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, v6}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 198
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 199
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 200
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    invoke-virtual {p0, v7}, Lo/btp;->a(Landroid/database/Cursor;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v9

    .line 202
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    goto :goto_1

    .line 204
    :cond_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 206
    :cond_3
    return-object v8
.end method

.method private d(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/Topic;
    .locals 2

    .line 210
    new-instance v1, Lcom/huawei/health/suggestion/model/Topic;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/Topic;-><init>()V

    .line 211
    const-string v0, "topicId"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveId(I)V

    .line 212
    const-string v0, "name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveName(Ljava/lang/String;)V

    .line 213
    const-string v0, "displayorder"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveDisplayorder(I)V

    .line 214
    const-string v0, "workoutPreviewNum"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveWorkoutPreviewNum(I)V

    .line 215
    const-string v0, "serialNum"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveSerialNum(Ljava/lang/String;)V

    .line 216
    const-string v0, "version"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/Topic;->saveVersion(Ljava/lang/String;)V

    .line 217
    return-object v1
.end method

.method private e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Topic;I)Landroid/content/ContentValues;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 281
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 282
    const-string v0, "userId"

    invoke-virtual {v2, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string v0, "topicId"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 284
    const-string v0, "name"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string v0, "displayorder"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireDisplayorder()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 286
    const-string v0, "workoutPreviewNum"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutPreviewNum()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 287
    const-string v0, "serialNum"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireSerialNum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "version"

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/Topic;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "pageNum"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 290
    return-object v2
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "topic"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/bse;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;I)V
    .locals 6

    .line 229
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 230
    invoke-static {}, Lo/btp;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "userId=? AND topicId=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 232
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 229
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    .line 233
    return-void
.end method

.method private e(Ljava/lang/String;IIILcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 5

    .line 264
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 265
    const-string v0, "userId"

    invoke-virtual {v4, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string v0, "topicId"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 267
    const-string v0, "pageNum"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 268
    const-string v0, "version"

    invoke-virtual {p5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    const-string v0, "workoutId"

    invoke-virtual {p5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string v0, "type"

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 271
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "topic_workouts"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 275
    const-string v0, "TopicDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertTopicRelation\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;I)V"
        }
    .end annotation

    .line 78
    const-string v0, "TopicDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertTopics\uff1abeginTransaction"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 81
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/Topic;

    .line 82
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lo/btp;->e(Ljava/lang/String;I)V

    .line 83
    invoke-direct {p0, p1, v7, p3}, Lo/btp;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/Topic;I)V

    .line 84
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lo/btp;->a(Ljava/lang/String;I)V

    .line 85
    move-object v0, p0

    move-object v1, p1

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Topic;->acquireWorkoutList()Ljava/util/List;

    move-result-object v3

    move v4, p3

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/btp;->b(Ljava/lang/String;ILjava/util/List;II)V

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 88
    const-string v0, "TopicDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertTopics\uff1aendTransaction"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method public c(Ljava/lang/String;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation

    .line 109
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-static {}, Lo/btp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "pageNum"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 113
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 115
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 119
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 120
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 121
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    invoke-direct {p0, v5}, Lo/btp;->d(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/Topic;

    move-result-object v7

    .line 123
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 128
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/Topic;

    .line 129
    invoke-virtual {v8}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1, p2}, Lo/btp;->c(Ljava/lang/String;III)Ljava/util/List;

    move-result-object v9

    .line 130
    invoke-virtual {v8, v9}, Lcom/huawei/health/suggestion/model/Topic;->saveWorkoutList(Ljava/util/List;)V

    .line 131
    goto :goto_1

    .line 133
    :cond_2
    return-object v6
.end method

.method public c(Ljava/lang/String;ILjava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILjava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;I)V"
        }
    .end annotation

    .line 101
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 102
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p4

    move-object v5, v7

    const/4 v4, 0x2

    invoke-direct/range {v0 .. v5}, Lo/btp;->e(Ljava/lang/String;IIILcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 103
    invoke-virtual {p0, p1, v7}, Lo/btp;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;II)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;II)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 158
    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0, p3}, Lo/btp;->c(Ljava/lang/String;III)Ljava/util/List;

    move-result-object v1

    .line 159
    return-object v1
.end method
