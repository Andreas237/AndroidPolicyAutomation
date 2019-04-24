.class public Lo/cpg;
.super Lo/cof;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpg$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/cof;-><init>()V

    .line 45
    return-void
.end method

.method synthetic constructor <init>(Lo/cpg$4;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lo/cpg;-><init>()V

    return-void
.end method

.method public static b(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 6

    .line 130
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 131
    const-string v0, "Debug_DBUserPreference"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseUserPreferenceCursor query is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    return-object v0

    .line 134
    :cond_0
    const/4 v4, 0x0

    .line 136
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    invoke-static {p0}, Lo/cpg;->c(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 140
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 141
    goto :goto_0

    .line 140
    :catchall_0
    move-exception v5

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 141
    throw v5

    .line 142
    :goto_0
    return-object v4
.end method

.method public static b()Ljava/lang/String;
    .locals 2

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    const-string v0, "create table  IF NOT EXISTS user_preference("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    const-string v0, "_id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    const-string v0, "key text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    const-string v0, "value text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v0, "user_id integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    const-string v0, "sync_status integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    const-string v0, "create_time integer not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    const-string v0, "modified_time integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/huawei/hihealth/HiUserPreference;)Landroid/content/ContentValues;
    .locals 4

    .line 104
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 105
    const-string v0, "value"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string v0, "sync_status"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getSyncStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 107
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getModifiedTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 108
    return-object v3
.end method

.method private static c(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 148
    new-instance v2, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 149
    const-string v0, "_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setId(I)V

    .line 150
    const-string v0, "key"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 151
    const-string v0, "value"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 152
    const-string v0, "user_id"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setUserId(I)V

    .line 153
    const-string v0, "sync_status"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setSyncStatus(I)V

    .line 154
    const-string v0, "create_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;->setCreateTime(J)V

    .line 155
    const-string v0, "modified_time"

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiUserPreference;->setModifiedTime(J)V

    .line 156
    return-object v2
.end method

.method public static d(Landroid/database/Cursor;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 112
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 113
    const-string v0, "Debug_DBUserPreference"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseUserPreferencesCursor query is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    return-object v0

    .line 116
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 119
    :goto_0
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    invoke-static {p0}, Lo/cpg;->c(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v5

    .line 121
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 124
    :cond_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 125
    goto :goto_1

    .line 124
    :catchall_0
    move-exception v6

    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 125
    throw v6

    .line 126
    :goto_1
    return-object v4
.end method

.method public static d(Landroid/content/Context;)Lo/cpg;
    .locals 1

    .line 56
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpg;->b:Landroid/content/Context;

    .line 57
    sget-object v0, Lo/cpg$b;->a:Lo/cpg;

    return-object v0
.end method

.method public static e(Lcom/huawei/hihealth/HiUserPreference;)Landroid/content/ContentValues;
    .locals 4

    .line 93
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 94
    const-string v0, "key"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "value"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v0, "user_id"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getUserId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 97
    const-string v0, "sync_status"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getSyncStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 98
    const-string v0, "create_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 99
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiUserPreference;->getModifiedTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 100
    return-object v3
.end method

.method public static e()Ljava/lang/String;
    .locals 3

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    const-string v0, " CREATE INDEX UserPreferenceIndex ON user_preference("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "user_id,"

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "key)"

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 21
    invoke-super {p0}, Lo/cof;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super/range {p0 .. p5}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super/range {p0 .. p6}, Lo/cof;->b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroid/content/ContentValues;)J
    .locals 2

    .line 21
    invoke-super {p0, p1}, Lo/cof;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 84
    const-string v0, "user_preference"

    return-object v0
.end method

.method public bridge synthetic d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 21
    invoke-super {p0, p1, p2, p3}, Lo/cof;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 3

    .line 89
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "key"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "user_id"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "sync_status"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "create_time"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "modified_time"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 21
    invoke-super {p0, p1, p2}, Lo/cof;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
