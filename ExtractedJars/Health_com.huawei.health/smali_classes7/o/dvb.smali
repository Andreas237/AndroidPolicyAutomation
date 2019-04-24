.class public Lo/dvb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# static fields
.field private static final b:Ljava/lang/Object;

.field private static final d:Ljava/lang/Object;


# instance fields
.field private a:Lo/dug;

.field private c:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dvb;->d:Ljava/lang/Object;

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dvb;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string v0, ""

    iput-object v0, p0, Lo/dvb;->c:Ljava/lang/String;

    .line 47
    iput-object p1, p0, Lo/dvb;->e:Landroid/content/Context;

    .line 48
    return-void
.end method

.method private a(Ljava/lang/String;)Lo/dvf;
    .locals 11

    .line 60
    sget-object v3, Lo/dvb;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 61
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 62
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    const-string v1, "UserInfoDBMgr, query ,id is null!return null."

    :try_start_0
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 66
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/dvb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v4

    .line 67
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achieve_info"

    invoke-virtual {v4, v1}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 70
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

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

    .line 71
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v5, v0}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 73
    const/4 v7, 0x0

    .line 74
    if-eqz v6, :cond_2

    .line 75
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    new-instance v7, Lo/dvh;

    invoke-direct {v7}, Lo/dvh;-><init>()V

    .line 77
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvh;->setHuid(Ljava/lang/String;)V

    .line 78
    const-string v0, "reach_days"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dvh;->e(I)V

    .line 79
    const-string v0, "points"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dvh;->d(I)V

    .line 80
    const-string v0, "medal_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvh;->c(Ljava/lang/String;)V

    .line 81
    const-string v0, "userReachStandardDays"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 82
    invoke-static {v8}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dvh;->b(D)V

    .line 83
    const-string v0, "syncTimestamp"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 84
    invoke-static {v9}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dvh;->c(J)V

    .line 85
    goto/16 :goto_0

    .line 86
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 88
    :cond_2
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query achieveInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v7, :cond_3

    const-string v2, "null"

    goto :goto_1

    :cond_3
    move-object v2, v7

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    monitor-exit v3

    return-object v7

    .line 91
    :cond_4
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    const-string v1, "mAchieveDBManager is null"

    :try_start_2
    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 94
    :catchall_0
    move-exception v10

    monitor-exit v3

    throw v10
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 142
    sget-object v3, Lo/dvb;->b:Ljava/lang/Object;

    monitor-enter v3

    .line 143
    :try_start_0
    iget-object v0, p0, Lo/dvb;->a:Lo/dug;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 144
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyAMRefresh!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lo/dvb;->a:Lo/dug;

    invoke-interface {v0, p1}, Lo/dug;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 148
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 8

    .line 152
    sget-object v3, Lo/dvb;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 153
    const/4 v4, -0x1

    .line 154
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 155
    monitor-exit v3

    return v4

    .line 158
    :cond_0
    const/4 v5, 0x0

    .line 159
    instance-of v0, p1, Lo/dvh;

    if-eqz v0, :cond_1

    .line 160
    move-object v5, p1

    :try_start_0
    check-cast v5, Lo/dvh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    :cond_1
    if-nez v5, :cond_2

    .line 163
    monitor-exit v3

    return v4

    .line 166
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/dvh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 167
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lo/dvb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "achieve_info"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v6}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v4

    .line 169
    monitor-exit v3

    return v4

    .line 170
    :catchall_0
    move-exception v7

    monitor-exit v3

    throw v7
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 56
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/dvb;->a(Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/dug;)V
    .locals 2

    .line 214
    sget-object v0, Lo/dvb;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 215
    :try_start_0
    iput-object p1, p0, Lo/dvb;->a:Lo/dug;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 217
    :goto_0
    return-void
.end method

.method public b(Lo/dvf;)I
    .locals 9

    .line 175
    const/4 v3, -0x1

    .line 176
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 177
    return v3

    .line 180
    :cond_0
    const/4 v4, 0x0

    .line 181
    instance-of v0, p1, Lo/dvh;

    if-eqz v0, :cond_1

    .line 182
    move-object v4, p1

    check-cast v4, Lo/dvh;

    .line 184
    :cond_1
    if-nez v4, :cond_2

    .line 185
    return v3

    .line 188
    :cond_2
    invoke-static {v4}, Lo/duo;->c(Lo/dvh;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 189
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    const-string v1, "update Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const/4 v0, -0x1

    return v0

    .line 193
    :cond_3
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 194
    const-string v0, "huid"

    invoke-virtual {v4}, Lo/dvh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "reach_days"

    invoke-virtual {v4}, Lo/dvh;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 196
    const-string v0, "points"

    invoke-virtual {v4}, Lo/dvh;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 197
    invoke-virtual {v4}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v6

    .line 200
    iget-object v0, p0, Lo/dvb;->c:Ljava/lang/String;

    invoke-static {v6, v0}, Lo/duo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 201
    const-string v0, "medal_id"

    invoke-virtual {v5, v0, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const-string v0, "userReachStandardDays"

    invoke-virtual {v4}, Lo/dvh;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 203
    const-string v0, "syncTimestamp"

    invoke-virtual {v4}, Lo/dvh;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 205
    iget-object v0, p0, Lo/dvb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "achieve_info"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5, v8}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v3

    .line 206
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update allMds result :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const/4 v0, 0x0

    if-ne v0, v3, :cond_4

    .line 208
    invoke-direct {p0, v7}, Lo/dvb;->b(Ljava/lang/String;)V

    .line 210
    :cond_4
    return v3
.end method

.method public e(Lo/dvf;)J
    .locals 10

    .line 99
    sget-object v3, Lo/dvb;->d:Ljava/lang/Object;

    monitor-enter v3

    .line 100
    const-wide/16 v4, -0x1

    .line 101
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 102
    monitor-exit v3

    return-wide v4

    .line 105
    :cond_0
    const/4 v6, 0x0

    .line 106
    instance-of v0, p1, Lo/dvh;

    if-eqz v0, :cond_1

    .line 107
    move-object v6, p1

    :try_start_0
    check-cast v6, Lo/dvh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :cond_1
    if-nez v6, :cond_2

    .line 110
    monitor-exit v3

    return-wide v4

    .line 114
    :cond_2
    :try_start_1
    invoke-virtual {v6}, Lo/dvh;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dvb;->a(Ljava/lang/String;)Lo/dvf;

    move-result-object v7

    .line 115
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 116
    move-object v0, v7

    check-cast v0, Lo/dvh;

    invoke-virtual {v0}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dvb;->c:Ljava/lang/String;

    .line 117
    invoke-virtual {p0, p1}, Lo/dvb;->b(Lo/dvf;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    int-to-long v0, v0

    monitor-exit v3

    return-wide v0

    .line 120
    :cond_3
    :try_start_2
    invoke-static {v6}, Lo/duo;->c(Lo/dvh;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 121
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    const-string v1, "Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    monitor-exit v3

    const-wide/16 v0, -0x1

    return-wide v0

    .line 125
    :cond_4
    :try_start_3
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 126
    const-string v0, "huid"

    invoke-virtual {v6}, Lo/dvh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v0, "reach_days"

    invoke-virtual {v6}, Lo/dvh;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 128
    const-string v0, "points"

    invoke-virtual {v6}, Lo/dvh;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 129
    const-string v0, "medal_id"

    invoke-virtual {v6}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string v0, "userReachStandardDays"

    invoke-virtual {v6}, Lo/dvh;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 131
    const-string v0, "syncTimestamp"

    invoke-virtual {v6}, Lo/dvh;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 132
    iget-object v0, p0, Lo/dvb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "achieve_info"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v8}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 133
    const-string v0, "PLGACHIEVE_UserInfoDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-nez v0, :cond_5

    .line 135
    invoke-virtual {v6}, Lo/dvh;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dvb;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    :cond_5
    monitor-exit v3

    return-wide v4

    .line 138
    :catchall_0
    move-exception v9

    monitor-exit v3

    throw v9
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 51
    const/4 v0, 0x0

    return-object v0
.end method
