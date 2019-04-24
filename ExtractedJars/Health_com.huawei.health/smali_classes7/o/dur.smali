.class public Lo/dur;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lo/dur;->c:Landroid/content/Context;

    .line 42
    return-void
.end method

.method private static c(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 4

    .line 187
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 189
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 194
    :cond_0
    goto :goto_0

    .line 192
    :catch_0
    move-exception v3

    .line 193
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    invoke-virtual {v3}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :goto_0
    return-object v2
.end method

.method private d(Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;)Landroid/content/ContentValues;
    .locals 4

    .line 177
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 178
    const-string v0, "rankType"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v0, "rankVersion"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 180
    const-string v0, "ageSegment"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v0, "gender"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "insightRankItemList"

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->b()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    return-object v3
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 1

    .line 144
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 80
    const-string v0, "ageSegment"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 81
    const-string v0, "gender"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 82
    const-string v0, "rankType"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 83
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    const-string v1, "params is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_1
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query inSightRankRecord ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "insight_rank"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "rankType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ageSegment"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "gender"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 91
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v5, v7, v0

    const/4 v0, 0x1

    aput-object v3, v7, v0

    const/4 v0, 0x2

    aput-object v4, v7, v0

    .line 97
    iget-object v0, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v6, v7}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 98
    const/4 v9, 0x0

    .line 99
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 100
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    const/4 v0, 0x0

    if-ne v0, v9, :cond_2

    .line 102
    new-instance v9, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v9}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 104
    :cond_2
    const-string v0, "rankType"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 105
    const-string v0, "rankVersion"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(J)V

    .line 106
    const-string v0, "ageSegment"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 107
    const-string v0, "gender"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 108
    const-string v0, "insightRankItemList"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dur;->c(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    goto/16 :goto_0

    .line 110
    :cond_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 112
    :cond_4
    return-object v9
.end method

.method public b(Lo/dvf;)I
    .locals 10

    .line 149
    const/4 v6, -0x1

    .line 150
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 151
    return v6

    .line 153
    :cond_0
    const/4 v7, 0x0

    .line 154
    instance-of v0, p1, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    if-eqz v0, :cond_1

    .line 155
    move-object v7, p1

    check-cast v7, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    .line 158
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 159
    return v6

    .line 162
    :cond_2
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 163
    const-string v0, "rankType"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "ageSegment"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "gender"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 164
    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    .line 165
    invoke-virtual {v7}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 166
    invoke-virtual {v7}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 167
    invoke-virtual {v7}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v9, v1

    .line 169
    iget-object v0, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "insight_rank"

    .line 170
    invoke-direct {p0, v7}, Lo/dur;->d(Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;)Landroid/content/ContentValues;

    move-result-object v3

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v9

    .line 169
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 171
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update result = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    return v6
.end method

.method public e(Lo/dvf;)J
    .locals 9

    .line 117
    const-wide/16 v4, -0x1

    .line 118
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 119
    return-wide v4

    .line 121
    :cond_0
    const/4 v6, 0x0

    .line 122
    instance-of v0, p1, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    if-eqz v0, :cond_1

    .line 123
    move-object v6, p1

    check-cast v6, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    .line 126
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 127
    return-wide v4

    .line 130
    :cond_2
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 131
    const-string v0, "rankType"

    invoke-virtual {v6}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    const-string v0, "ageSegment"

    invoke-virtual {v6}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v0, "gender"

    invoke-virtual {v6}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    invoke-virtual {p0, v7}, Lo/dur;->a(Ljava/util/Map;)Lo/dvf;

    move-result-object v8

    .line 135
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 136
    invoke-virtual {p0, v6}, Lo/dur;->b(Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 138
    :cond_3
    iget-object v0, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "insight_rank"

    invoke-direct {p0, v6}, Lo/dur;->d(Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;)Landroid/content/ContentValues;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 139
    return-wide v4
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 46
    const-string v0, "ageSegment"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 47
    const-string v0, "gender"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 48
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    const-string v1, "params is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "insight_rank"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ageSegment"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "gender"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 55
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v3, v6, v0

    const/4 v0, 0x1

    aput-object v4, v6, v0

    .line 60
    iget-object v0, p0, Lo/dur;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v5, v6}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 61
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 62
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 63
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 64
    new-instance v9, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;

    invoke-direct {v9}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;-><init>()V

    .line 65
    const-string v0, "rankType"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->c(Ljava/lang/String;)V

    .line 66
    const-string v0, "rankVersion"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(J)V

    .line 67
    const-string v0, "ageSegment"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->d(Ljava/lang/String;)V

    .line 68
    const-string v0, "gender"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->e(Ljava/lang/String;)V

    .line 69
    const-string v0, "insightRankItemList"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dur;->c(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/pluginachievement/manager/model/InsightRankRecord;->a(Lorg/json/JSONArray;)V

    .line 70
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    goto/16 :goto_0

    .line 72
    :cond_2
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 74
    :cond_3
    const-string v0, "PLGACHIEVE_InsightRankRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query insightRankList ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    return-object v8
.end method
