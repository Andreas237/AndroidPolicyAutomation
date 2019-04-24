.class public Lcom/usebutton/sdk/internal/events/DatabaseStore;
.super Ljava/lang/Object;
.source "DatabaseStore.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/events/EventsStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;
    }
.end annotation


# static fields
.field private static final COLUMN_NAME:Ljava/lang/String; = "name"

.field private static final COLUMN_PROPERTIES:Ljava/lang/String; = "properties"

.field private static final COLUMN_REFERRER:Ljava/lang/String; = "referrer"

.field private static final COLUMN_SEQNO:Ljava/lang/String; = "seqno"

.field private static final COLUMN_TIME:Ljava/lang/String; = "time"

.field private static final COLUMN_UUID:Ljava/lang/String; = "uuid"

.field private static final INDEX_NAME:I = 0x2

.field private static final INDEX_PROPERTIES:I = 0x5

.field private static final INDEX_SEQNO:I = 0x0

.field private static final INDEX_TIME:I = 0x1

.field private static final INDEX_UUID:I = 0x4

.field private static final PROJECTION_EVENTS:[Ljava/lang/String;

.field private static final TABLE_EVENTS:Ljava/lang/String; = "events"

.field private static final TAG:Ljava/lang/String; = "DatabaseStore"


# instance fields
.field private final mDelayedExecutor:Ljava/util/concurrent/Executor;

.field private mHelper:Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

.field private mReady:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v0, "seqno"

    const-string/jumbo v1, "time"

    const-string v2, "name"

    const-string v3, "referrer"

    const-string/jumbo v4, "uuid"

    const-string v5, "properties"

    .line 40
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->PROJECTION_EVENTS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mReady:Z

    .line 52
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mDelayedExecutor:Ljava/util/concurrent/Executor;

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->prepareDatabase(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$002(Lcom/usebutton/sdk/internal/events/DatabaseStore;Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;)Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mHelper:Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    return-object p1
.end method

.method static synthetic access$102(Lcom/usebutton/sdk/internal/events/DatabaseStore;Z)Z
    .locals 0

    .line 25
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mReady:Z

    return p1
.end method

.method private declared-synchronized getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 82
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mReady:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 84
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 86
    :catch_0
    :try_start_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "DatabaseHelper.getHelper() interrupted."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mHelper:Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private jsonOrNull(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 165
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 169
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1
.end method

.method private prepareDatabase(Landroid/content/Context;)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/usebutton/sdk/internal/events/DatabaseStore;->mDelayedExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/events/DatabaseStore$1;-><init>(Lcom/usebutton/sdk/internal/events/DatabaseStore;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public add(Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;)Z
    .locals 11

    .line 95
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "name"

    .line 96
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "referrer"

    const-string v2, ""

    .line 97
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "time"

    .line 98
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->getTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string/jumbo v1, "uuid"

    .line 99
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->getProperties()Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "properties"

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 101
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    .line 103
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    move-result-object v5

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "events"

    .line 104
    invoke-virtual {v5, v6, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v6
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1

    cmp-long v2, v6, v3

    if-lez v2, :cond_1

    :try_start_1
    const-string v2, "DatabaseStore"

    const-string v8, "Inserted row id=%d in table %s\n%s"

    const/4 v9, 0x3

    .line 106
    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v9, v1

    const-string v10, "events"

    aput-object v10, v9, p1

    const/4 v10, 0x2

    .line 107
    invoke-virtual {v0}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    .line 106
    invoke-static {v2, v8, v9}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :cond_1
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-wide v6, v3

    :goto_1
    const-string v2, "DatabaseStore"

    const-string v5, "Issue while inserting event"

    .line 111
    invoke-static {v2, v5, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    cmp-long v0, v6, v3

    if-lez v0, :cond_2

    goto :goto_3

    :cond_2
    move p1, v1

    :goto_3
    return p1
.end method

.method deleteDatabase(Landroid/content/Context;)Z
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 238
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "com.usebutton.events"

    invoke-virtual {p1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public peek(I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;"
        }
    .end annotation

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v11, 0x0

    :try_start_1
    const-string v3, "events"

    .line 130
    sget-object v4, Lcom/usebutton/sdk/internal/events/DatabaseStore;->PROJECTION_EVENTS:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "seqno ASC"

    .line 131
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v10

    move-object v2, v1

    .line 130
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 132
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 136
    :try_start_2
    invoke-interface {v11, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const/4 p1, 0x1

    .line 137
    invoke-interface {v11, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 p1, 0x2

    .line 138
    invoke-interface {v11, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 p1, 0x4

    .line 139
    invoke-interface {v11, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x5

    .line 140
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 141
    new-instance v8, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->jsonOrNull(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 142
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;-><init>(Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/UUID;Ljava/lang/String;)V

    .line 143
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    :try_start_3
    const-string v2, "DatabaseStore"

    const-string v3, "Exception while reading event row, skip"

    .line 145
    invoke-static {v2, v3, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 148
    :cond_0
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 149
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v11, :cond_1

    .line 153
    invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z

    move-result p1

    if-nez p1, :cond_1

    .line 154
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_1
    if-eqz v1, :cond_3

    .line 156
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    :try_start_4
    const-string v2, "DatabaseStore"

    const-string v3, "Exception while reading event row, skip"

    .line 151
    invoke-static {v2, v3, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v11, :cond_2

    .line 153
    invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z

    move-result p1

    if-nez p1, :cond_2

    .line 154
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_2
    if-eqz v1, :cond_3

    .line 156
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 157
    :goto_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_3
    return-object v0

    :goto_3
    if-eqz v11, :cond_4

    .line 153
    invoke-interface {v11}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_4

    .line 154
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_4
    if-eqz v1, :cond_5

    .line 156
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 157
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_5
    throw p1

    :catch_3
    move-exception p1

    const-string v1, "DatabaseStore"

    const-string v2, "Could not open database."

    .line 124
    invoke-static {v1, v2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public remove(I)V
    .locals 7

    .line 179
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    const-string v2, "seqno IN (SELECT seqno FROM events ORDER BY seqno ASC LIMIT ?)"

    const/4 v3, 0x1

    .line 180
    new-array v4, v3, [Ljava/lang/String;

    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 180
    invoke-virtual {v0, v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    const-string v2, "DatabaseStore"

    const-string v4, "Deleted %d rows from %s."

    const/4 v5, 0x2

    .line 184
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v6

    const-string v1, "events"

    aput-object v1, v5, v3

    invoke-static {v2, v4, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "DatabaseStore"

    .line 187
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Issue while removing "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " entries."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public size()I
    .locals 11

    const/4 v0, 0x0

    .line 195
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v3, "events"

    const-string v2, "seqno"

    .line 196
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v1

    .line 197
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 199
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 200
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v0

    .line 202
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 203
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "DatabaseStore"

    const-string v3, "Issue while getting size."

    .line 205
    invoke-static {v2, v3, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return v0
.end method

.method public trimToSize(I)V
    .locals 9

    .line 213
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/events/DatabaseStore;->getHelper()Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/events/DatabaseStore$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 214
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v2, "events"

    const-string v1, "seqno"

    .line 215
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "seqno ASC"

    move-object v1, v0

    .line 216
    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 219
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    sub-int/2addr v2, p1

    const/4 v3, 0x0

    .line 220
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v4, v3

    .line 221
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    add-int/lit8 v5, v2, -0x1

    if-lez v2, :cond_0

    .line 222
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const-string v7, "events"

    const-string v8, "seqno = ?"

    .line 223
    new-array v6, v6, [Ljava/lang/String;

    .line 224
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v6, v3

    .line 223
    invoke-virtual {v0, v7, v8, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v2

    add-int/2addr v4, v2

    move v2, v5

    goto :goto_0

    .line 226
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 227
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 228
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    const-string v1, "DatabaseStore"

    const-string v2, "Deleted %d rows from %s."

    const/4 v5, 0x2

    .line 229
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v5, v3

    const-string v3, "events"

    aput-object v3, v5, v6

    invoke-static {v1, v2, v5}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "DatabaseStore"

    .line 232
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Issue while trimming to size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
