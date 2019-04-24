.class public Lo/cqd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqd$a;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private a:Lo/cox;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v0, Lo/cqd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cox;->b(Landroid/content/Context;)Lo/cox;

    move-result-object v0

    iput-object v0, p0, Lo/cqd;->a:Lo/cox;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Lo/cqd$4;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/cqd;-><init>()V

    return-void
.end method

.method private a(III)[Ljava/lang/String;
    .locals 3

    .line 255
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    int-to-long v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .line 244
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 245
    const-string v0, "date"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 248
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 249
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 251
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/cob;)J
    .locals 6

    .line 119
    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 120
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateStatData today stat need to upload, statTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/cob;->f(I)V

    .line 123
    :cond_0
    invoke-static {p1}, Lo/cpi;->b(Lo/cob;)Landroid/content/ContentValues;

    move-result-object v5

    .line 124
    invoke-virtual {p1}, Lo/cob;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 125
    const-string v0, "sync_status"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 127
    :cond_1
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-direct {p0}, Lo/cqd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v2

    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v3

    .line 128
    invoke-virtual {p1}, Lo/cob;->h()I

    move-result v4

    .line 127
    invoke-direct {p0, v2, v3, v4}, Lo/cqd;->a(III)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v1, v2}, Lo/cox;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public static d(Landroid/content/Context;)Lo/cqd;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqd;->c:Landroid/content/Context;

    .line 52
    sget-object v0, Lo/cqd$a;->e:Lo/cqd;

    return-object v0
.end method

.method private e(Lo/cob;)J
    .locals 3

    .line 56
    invoke-static {p1}, Lo/cpi;->e(Lo/cob;)Landroid/content/ContentValues;

    move-result-object v2

    .line 57
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v0, v2}, Lo/cox;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private e()Ljava/lang/String;
    .locals 3

    .line 259
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 260
    const-string v0, "date"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "date"

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    .line 263
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 267
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 268
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized f(Lo/cob;)Z
    .locals 12

    monitor-enter p0

    .line 153
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateVO2MaxData newStat ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-virtual {p1}, Lo/cob;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lo/cob;->e(J)V

    .line 157
    :cond_0
    invoke-virtual {p1}, Lo/cob;->d()D

    move-result-wide v6

    .line 158
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 159
    const-string v0, "stat_type"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 163
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    invoke-virtual {p1}, Lo/cob;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v9, v1

    .line 164
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 165
    invoke-static {v10}, Lo/cph;->g(Landroid/database/Cursor;)Lo/cob;

    move-result-object v11

    .line 166
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateVO2MaxData() oldStat ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    if-ne v0, v11, :cond_2

    .line 168
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateVO2MaxData a new stat comes , stat is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-wide/16 v0, 0x0

    cmpg-double v0, v6, v0

    if-gtz v0, :cond_1

    .line 170
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateVO2MaxData() newStat value <= 0 ! it is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 173
    :cond_1
    invoke-direct {p0, p1}, Lo/cqd;->e(Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 176
    :cond_2
    invoke-static {v11, p1}, Lo/cql;->e(Lo/cob;Lo/cob;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 177
    invoke-direct {p0, p1}, Lo/cqd;->h(Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 179
    :cond_3
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private g(Lo/cob;)Z
    .locals 2

    .line 301
    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v0

    const v1, 0xb798

    if-lt v1, v0, :cond_0

    .line 302
    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v0

    const v1, 0xb3b1

    if-gt v1, v0, :cond_0

    .line 303
    const/4 v0, 0x1

    return v0

    .line 305
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private h(Lo/cob;)J
    .locals 5

    .line 132
    invoke-static {p1}, Lo/cpi;->b(Lo/cob;)Landroid/content/ContentValues;

    move-result-object v2

    .line 133
    const-string v0, "date"

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 134
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 135
    const-string v0, "stat_type"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 139
    const/4 v0, 0x2

    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 140
    invoke-virtual {p1}, Lo/cob;->h()I

    move-result v0

    .line 139
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 141
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v4}, Lo/cox;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method private declared-synchronized i(Lo/cob;)Z
    .locals 8

    monitor-enter p0

    .line 183
    const/4 v4, 0x0

    .line 184
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Lo/cqd;->g(Lo/cob;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    const/4 v4, 0x1

    .line 187
    :cond_0
    invoke-virtual {p1}, Lo/cob;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lo/cob;->e(J)V

    .line 190
    :cond_1
    invoke-virtual {p1}, Lo/cob;->d()D

    move-result-wide v5

    .line 191
    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v0

    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v1

    invoke-virtual {p1}, Lo/cob;->h()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lo/cqd;->c(III)Lo/cob;

    move-result-object v7

    .line 193
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 194
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gtz v0, :cond_2

    .line 195
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateStatData() newStat value <= 0, type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", new date = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 196
    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", old = null"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 195
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 199
    :cond_2
    if-eqz v4, :cond_3

    .line 200
    const-string v0, "HiH_DataStatManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateStatData() new date ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", type="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 201
    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 200
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :cond_3
    invoke-direct {p0, p1}, Lo/cqd;->e(Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 205
    :cond_4
    if-eqz v4, :cond_5

    .line 206
    const-string v0, "HiH_DataStatManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateStatData() new date ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", type="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 207
    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v2

    .line 206
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :cond_5
    invoke-static {v7, p1}, Lo/cql;->e(Lo/cob;Lo/cob;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 210
    invoke-direct {p0, p1}, Lo/cqd;->c(Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 212
    :cond_6
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized k(Lo/cob;)I
    .locals 4

    monitor-enter p0

    .line 286
    :try_start_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 287
    const-string v0, "date"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 289
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 292
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 293
    const/4 v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    .line 294
    invoke-virtual {p1}, Lo/cob;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 295
    invoke-virtual {p1}, Lo/cob;->a()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 296
    invoke-virtual {p1}, Lo/cob;->h()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 297
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(I[I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 216
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 217
    array-length v0, p2

    add-int/lit8 v0, v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    .line 218
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 219
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 220
    const-string v0, "client_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 221
    const-string v0, "sync_status"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 222
    const-string v0, "stat_type"

    move-object v1, p2

    array-length v2, p2

    move-object v3, v6

    move-object v4, v7

    const/4 v5, 0x2

    invoke-static/range {v0 .. v5}, Lo/cpn;->d(Ljava/lang/String;[IILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 223
    const-string v0, "date"

    invoke-static {v6, v0}, Lo/cpn;->e(Ljava/lang/StringBuffer;Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 225
    invoke-static {v8}, Lo/cph;->n(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/cob;)Z
    .locals 1

    .line 149
    invoke-direct {p0, p1}, Lo/cqd;->f(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method public b(IIII)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 272
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 273
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    .line 274
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 275
    const-string v0, "client_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 276
    const-string v0, "date"

    invoke-static {v0, p2, p3, p4}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v8

    .line 277
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object v5, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 278
    invoke-static {v9}, Lo/cph;->f(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/cob;)Z
    .locals 2

    .line 282
    invoke-direct {p0, p1}, Lo/cqd;->k(Lo/cob;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    return v0
.end method

.method public c(IJI)I
    .locals 5

    .line 229
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 230
    const-string v0, "sync_status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 231
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 232
    const-string v0, "client_id"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "date"

    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 238
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    invoke-static {p2, p3}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 239
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 240
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v4}, Lo/cox;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 320
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 321
    const-string v0, "stat_type"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 324
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 325
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const v0, 0xabe4

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 327
    const-string v0, "date"

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v8

    .line 328
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object v5, v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 329
    const-string v0, "date"

    invoke-static {v9, v0}, Lo/cph;->l(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(III)Lo/cob;
    .locals 7

    .line 85
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-direct {p0}, Lo/cqd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3}, Lo/cqd;->a(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 87
    invoke-static {v6}, Lo/cph;->g(Landroid/database/Cursor;)Lo/cob;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 8

    .line 309
    const-string v6, "stat_type =?  or stat_type =?  or stat_type =?  or stat_type =? "

    .line 312
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    move-object v1, v6

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const v3, 0xb3c0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 313
    const v3, 0xb3c1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 314
    const v3, 0xb3c3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const v3, 0xb3c2

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 312
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 316
    invoke-static {v7}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 97
    const-string v0, "date"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    .line 98
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    .line 97
    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v6

    .line 99
    const/4 v0, 0x4

    new-array v7, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 100
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 100
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v7, v1

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 103
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-direct {p0}, Lo/cqd;->e()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    move-object v5, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 104
    invoke-static {v8}, Lo/cph;->k(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/cob;)Z
    .locals 1

    .line 145
    invoke-direct {p0, p1}, Lo/cqd;->i(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method public e(JJIII)I
    .locals 6

    .line 61
    const-string v0, "Debug_DataStatManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteStatDatas()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 63
    const/4 v0, 0x5

    new-array v5, v0, [Ljava/lang/String;

    .line 64
    const-string v0, "date"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "date"

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 74
    invoke-static {p1, p2}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 75
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 76
    int-to-long v0, p5

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 77
    int-to-long v0, p6

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 78
    int-to-long v0, p7

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    .line 81
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public e(II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 108
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 109
    const-string v0, "stat_type"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 113
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 114
    iget-object v0, p0, Lo/cqd;->a:Lo/cox;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cox;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 115
    invoke-static {v8}, Lo/cph;->k(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
