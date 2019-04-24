.class public Lo/cpz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpz$b;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# instance fields
.field private a:Lo/coi;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    sget-object v0, Lo/cpz;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/coi;->a(Landroid/content/Context;)Lo/coi;

    move-result-object v0

    iput-object v0, p0, Lo/cpz;->a:Lo/coi;

    .line 46
    return-void
.end method

.method synthetic constructor <init>(Lo/cpz$3;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/cpz;-><init>()V

    return-void
.end method

.method public static a()[Ljava/lang/String;
    .locals 3

    .line 62
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "date"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "hihealth_type"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "stat_type"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "user_id"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "unit_id"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "client_id"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "timeZone"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "sync_status"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "modified_time"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " CREATE INDEX IF NOT EXISTS ConfigStatIndex ON "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "date,"

    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stat_type,"

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id)"

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/cpz;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 57
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpz;->b:Landroid/content/Context;

    .line 58
    sget-object v0, Lo/cpz$b;->c:Lo/cpz;

    return-object v0
.end method

.method private declared-synchronized b(Ljava/lang/String;Lo/cob;)Z
    .locals 8

    monitor-enter p0

    .line 148
    const/4 v4, 0x0

    .line 149
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 150
    const/4 v4, 0x1

    .line 152
    :cond_0
    invoke-virtual {p2}, Lo/cob;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/cob;->e(J)V

    .line 155
    :cond_1
    invoke-virtual {p2}, Lo/cob;->d()D

    move-result-wide v5

    .line 156
    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v0

    invoke-virtual {p2}, Lo/cob;->a()I

    move-result v1

    invoke-virtual {p2}, Lo/cob;->h()I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Lo/cpz;->b(Ljava/lang/String;III)Lo/cob;

    move-result-object v7

    .line 158
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 159
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gtz v0, :cond_2

    .line 160
    const-string v0, "Debug_ConfigDataStatManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStatData() newStat value <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 163
    :cond_2
    if-eqz v4, :cond_3

    .line 164
    const-string v0, "HiH_ConfigDataStatManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStatData() new date ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", type="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 165
    invoke-virtual {p2}, Lo/cob;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/cob;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",old=null"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 164
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :cond_3
    invoke-direct {p0, p1, p2}, Lo/cpz;->d(Ljava/lang/String;Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 169
    :cond_4
    if-eqz v4, :cond_5

    .line 170
    const-string v0, "HiH_ConfigDataStatManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStatData() new date ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", type="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 171
    invoke-virtual {p2}, Lo/cob;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/cob;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",old="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lo/cob;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 170
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_5
    invoke-static {v7, p2}, Lo/cql;->e(Lo/cob;Lo/cob;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 174
    invoke-direct {p0, p1, p2}, Lo/cpz;->c(Ljava/lang/String;Lo/cob;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 176
    :cond_6
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(III)[Ljava/lang/String;
    .locals 3

    .line 215
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

.method private c(Ljava/lang/String;Lo/cob;)J
    .locals 6

    .line 131
    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 132
    const-string v0, "Debug_ConfigDataStatManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateStatData today stat need to upload, statTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/cob;->f(I)V

    .line 135
    :cond_0
    invoke-static {p2}, Lo/cpi;->b(Lo/cob;)Landroid/content/ContentValues;

    move-result-object v5

    .line 136
    invoke-virtual {p2}, Lo/cob;->k()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 137
    const-string v0, "sync_status"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 139
    :cond_1
    iget-object v0, p0, Lo/cpz;->a:Lo/coi;

    invoke-direct {p0}, Lo/cpz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/cob;->b()I

    move-result v2

    .line 140
    invoke-virtual {p2}, Lo/cob;->a()I

    move-result v3

    invoke-virtual {p2}, Lo/cob;->h()I

    move-result v4

    .line 139
    invoke-direct {p0, v2, v3, v4}, Lo/cpz;->b(III)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v5, v1, v2}, Lo/coi;->d(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method private c()Ljava/lang/String;
    .locals 3

    .line 207
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 208
    const-string v0, "date"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 211
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create table  IF NOT EXISTS "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_id integer primary key not null,"

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "date integer not null,"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hihealth_type integer not null,"

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stat_type integer not null,"

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "value double not null,"

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "user_id integer,"

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "unit_id integer not null,"

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "client_id integer,"

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "timeZone text not null,"

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sync_status integer not null,"

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "modified_time integer not null"

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;Lo/cob;)J
    .locals 3

    .line 94
    invoke-static {p2}, Lo/cpi;->e(Lo/cob;)Landroid/content/ContentValues;

    move-result-object v2

    .line 95
    iget-object v0, p0, Lo/cpz;->a:Lo/coi;

    invoke-virtual {v0, v2}, Lo/coi;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private e()Ljava/lang/String;
    .locals 3

    .line 219
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 220
    const-string v0, "date"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "date"

    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " <=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "stat_type"

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "client_id"

    .line 223
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 224
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;III)Lo/cob;
    .locals 8

    .line 115
    iget-object v0, p0, Lo/cpz;->a:Lo/coi;

    move-object v1, p1

    invoke-direct {p0}, Lo/cpz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p2, p3, p4}, Lo/cpz;->b(III)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coi;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 116
    invoke-static {v7}, Lo/cph;->g(Landroid/database/Cursor;)Lo/cob;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/hihealth/HiDataReadOption;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 120
    const-string v0, "date"

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getSortOrder()I

    move-result v1

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getAnchor()I

    move-result v2

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/cpn;->b(Ljava/lang/String;III)Ljava/lang/String;

    move-result-object v7

    .line 121
    const/4 v0, 0x4

    new-array v8, v0, [Ljava/lang/String;

    .line 122
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 123
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 124
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 125
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    .line 126
    iget-object v0, p0, Lo/cpz;->a:Lo/coi;

    move-object v1, p1

    invoke-direct {p0}, Lo/cpz;->e()Ljava/lang/String;

    move-result-object v2

    move-object v3, v8

    move-object v6, v7

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/coi;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 127
    invoke-static {v9}, Lo/cph;->k(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Lo/cob;)Z
    .locals 1

    .line 144
    invoke-direct {p0, p1, p2}, Lo/cpz;->b(Ljava/lang/String;Lo/cob;)Z

    move-result v0

    return v0
.end method
