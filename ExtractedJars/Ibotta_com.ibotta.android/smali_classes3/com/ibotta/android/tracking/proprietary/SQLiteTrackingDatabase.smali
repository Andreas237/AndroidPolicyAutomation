.class public Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;
.super Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
.source "SQLiteTrackingDatabase.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;
    }
.end annotation


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "tracking.db"

.field private static final DATABASE_VERSION:I = 0x19

.field private static final TABLE_ACCOUNT_EVENT:Ljava/lang/String; = "account_event"

.field private static final TABLE_BONUS_EVENT:Ljava/lang/String; = "bonus_event"

.field private static final TABLE_CATEGORY_EVENT:Ljava/lang/String; = "category_event"

.field private static final TABLE_DEAL_EVENT:Ljava/lang/String; = "deal_event"

.field private static final TABLE_DEEPLINK_EVENT:Ljava/lang/String; = "deeplink_event"

.field private static final TABLE_LAUNCH_APP_EVENT:Ljava/lang/String; = "launch_app_event"

.field private static final TABLE_MODULE_EVENT:Ljava/lang/String; = "module_event"

.field private static final TABLE_MY_EARNINGS_EVENT:Ljava/lang/String; = "my_earnings_event"

.field private static final TABLE_NOTIFICATION_EVENT:Ljava/lang/String; = "notification_event"

.field private static final TABLE_OFFER_EVENT:Ljava/lang/String; = "offer_event"

.field private static final TABLE_PARTNER_APP_EVENT:Ljava/lang/String; = "partner_app_event"

.field private static final TABLE_PRODUCT_EVENT:Ljava/lang/String; = "product_event"

.field private static final TABLE_QUEST_EVENT:Ljava/lang/String; = "quest_event"

.field private static final TABLE_REGISTRATION_EVENT:Ljava/lang/String; = "registration_event"

.field private static final TABLE_RETAILER_EVENT:Ljava/lang/String; = "retailer_event"

.field private static final TABLE_REWARD_EVENT:Ljava/lang/String; = "reward_event"

.field private static final TABLE_SEARCH_EVENT:Ljava/lang/String; = "search_event"

.field private static final TABLE_SESSION_EVENT:Ljava/lang/String; = "session_event"

.field private static final TABLE_SETTINGS_EVENT:Ljava/lang/String; = "settings_event"

.field private static final TABLE_TILE_EVENT:Ljava/lang/String; = "tile_event"

.field private static final counter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static database:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;

.field private static final lock:Ljava/util/concurrent/locks/ReentrantLock;

.field private static final tableNameClassMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final daos:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

.field private final maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

.field private final maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

.field private final tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 63
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 64
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 156
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "bonus_event"

    .line 157
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "deeplink_event"

    .line 158
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "launch_app_event"

    .line 159
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "offer_event"

    .line 160
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "registration_event"

    .line 161
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "retailer_event"

    .line 162
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "reward_event"

    .line 163
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "search_event"

    .line 164
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "session_event"

    .line 165
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "tile_event"

    .line 166
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "product_event"

    .line 167
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "deal_event"

    .line 168
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "module_event"

    .line 169
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "partner_app_event"

    .line 170
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "quest_event"

    .line 171
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "category_event"

    .line 172
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "notification_event"

    .line 173
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "account_event"

    .line 174
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "my_earnings_event"

    .line 175
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "settings_event"

    .line 176
    const-class v2, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tableNameClassMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)V
    .locals 6

    const-string v2, "tracking.db"

    .line 226
    sget v5, Lcom/ibotta/android/tracking/R$raw;->ormlite_config_tracking:I

    const/4 v3, 0x0

    const/16 v4, 0x19

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V

    .line 89
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->daos:Ljava/util/Map;

    .line 227
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 228
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

    .line 229
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

    .line 230
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

    return-void
.end method

.method private buildEventsToSendUnions()Ljava/lang/String;
    .locals 6

    .line 629
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 631
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tableNameClassMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "SELECT id, \'%1$s\' as tableName, eventAt FROM %1$s WHERE eventStatus != \'%2$s\'"

    const/4 v4, 0x2

    .line 632
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    sget-object v5, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 636
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v1, " UNION "

    .line 639
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private cleanUp(Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 409
    invoke-virtual {p2}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v0

    .line 410
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxRowAgeSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;

    invoke-interface {v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    .line 413
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v3

    const-string v4, "attempts"

    iget-object v5, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxAttemptsSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;

    invoke-interface {v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/j256/ormlite/stmt/Where;->ge(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object v3

    invoke-virtual {v3}, Lcom/j256/ormlite/stmt/Where;->or()Lcom/j256/ormlite/stmt/Where;

    move-result-object v3

    const-string v4, "eventAt"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/j256/ormlite/stmt/Where;->le(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 414
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result v1

    const-string v2, "Deleted %1$d from %2$s due to too many attempts, or old age."

    const/4 v3, 0x2

    .line 416
    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x1

    aput-object v1, v4, v6

    invoke-static {v2, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->reset()V

    .line 421
    invoke-virtual {p2}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object p2

    const-string v1, "eventAt"

    .line 422
    invoke-virtual {p2, v1, v5}, Lcom/j256/ormlite/stmt/QueryBuilder;->orderBy(Ljava/lang/String;Z)Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->maxRowsPerTableSupplier:Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;

    invoke-interface {v2}, Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v7, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->limit(Ljava/lang/Long;)Lcom/j256/ormlite/stmt/QueryBuilder;

    .line 425
    invoke-virtual {p2}, Lcom/j256/ormlite/stmt/QueryBuilder;->query()Ljava/util/List;

    move-result-object p2

    .line 426
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 427
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 428
    invoke-virtual {v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 431
    :cond_0
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    const-string v2, "id"

    invoke-virtual {p2, v2, v1}, Lcom/j256/ormlite/stmt/Where;->notIn(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    .line 432
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result p2

    const-string v0, "Deleted %1$d from %2$s because there were too many old rows."

    .line 434
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v5

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v6

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private close(Landroid/database/Cursor;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 545
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to close cursor."

    const/4 v1, 0x0

    .line 547
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private create(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 2

    .line 643
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    if-eqz v0, :cond_0

    .line 644
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 645
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 646
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    if-eqz v0, :cond_1

    .line 647
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 648
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 649
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    if-eqz v0, :cond_2

    .line 650
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 651
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 652
    :cond_2
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    if-eqz v0, :cond_3

    .line 653
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 654
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 655
    :cond_3
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    if-eqz v0, :cond_4

    .line 656
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 657
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 658
    :cond_4
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    if-eqz v0, :cond_5

    .line 659
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 660
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 661
    :cond_5
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    if-eqz v0, :cond_6

    .line 662
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 663
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 664
    :cond_6
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    if-eqz v0, :cond_7

    .line 665
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 666
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 667
    :cond_7
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    if-eqz v0, :cond_8

    .line 668
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 669
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 670
    :cond_8
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    if-eqz v0, :cond_9

    .line 671
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 672
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 673
    :cond_9
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    if-eqz v0, :cond_a

    .line 674
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 675
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 676
    :cond_a
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    if-eqz v0, :cond_b

    .line 677
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 678
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 679
    :cond_b
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    if-eqz v0, :cond_c

    .line 680
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 681
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 682
    :cond_c
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    if-eqz v0, :cond_d

    .line 683
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 684
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 685
    :cond_d
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    if-eqz v0, :cond_e

    .line 686
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 687
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 688
    :cond_e
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    if-eqz v0, :cond_f

    .line 689
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 690
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 691
    :cond_f
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    if-eqz v0, :cond_10

    .line 692
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 693
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 694
    :cond_10
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    if-eqz v0, :cond_11

    .line 695
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 696
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 697
    :cond_11
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    if-eqz v0, :cond_12

    .line 698
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 699
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 700
    :cond_12
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    if-eqz v0, :cond_13

    .line 701
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 702
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    goto :goto_0

    .line 703
    :cond_13
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    if-eqz v0, :cond_14

    .line 704
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 705
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->create(Ljava/lang/Object;)I

    .line 708
    :cond_14
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private createNewEvent(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 465
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getCounter()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 466
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setCounter(I)V

    .line 468
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setHashCode(I)V

    .line 470
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->create(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private deleteEvents(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 440
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 442
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 443
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 446
    :cond_0
    invoke-virtual {p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object p1

    .line 447
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object p2

    const-string v1, "id"

    invoke-virtual {p2, v1, v0}, Lcom/j256/ormlite/stmt/Where;->in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    .line 448
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result p1

    return p1
.end method

.method private end(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 527
    :try_start_0
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 528
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to end database transaction."

    const/4 v1, 0x0

    .line 531
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private findEventsToSend(Landroid/database/sqlite/SQLiteDatabase;I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "I)",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation

    .line 556
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 557
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->findEventsToSendRaw(Landroid/database/sqlite/SQLiteDatabase;I)Ljava/util/Map;

    move-result-object p1

    .line 559
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 560
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 561
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getRepresentativeObject()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v2

    .line 562
    invoke-virtual {v2}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v2

    .line 565
    :try_start_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_1

    .line 567
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 568
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    :cond_1
    invoke-virtual {v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-virtual {v1, v2, v4}, Lcom/j256/ormlite/stmt/Where;->in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/Where;->query()Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 573
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 574
    sget-object v3, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventStatus(Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;)V

    .line 575
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAttemptAt(Ljava/lang/Long;)V

    .line 576
    invoke-virtual {v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setHashCode(I)V

    .line 577
    invoke-direct {p0, v2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->update(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 580
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to query events to send: tableName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    return-object v0
.end method

.method private findEventsToSendRaw(Landroid/database/sqlite/SQLiteDatabase;I)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "I)",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation

    .line 590
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 592
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT id, tableName, eventAt "

    .line 593
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "FROM ("

    .line 594
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->buildEventsToSendUnions()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") "

    .line 596
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ORDER BY eventAt "

    .line 597
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "LIMIT "

    .line 598
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 p2, 0x0

    .line 603
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    instance-of v3, p1, Landroid/database/sqlite/SQLiteDatabase;

    if-nez v3, :cond_0

    invoke-virtual {p1, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, v1, v2}, Lcom/newrelic/agent/android/instrumentation/SQLiteInstrumentation;->rawQuery(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    :goto_0
    move-object p2, p1

    .line 604
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_1
    const-string p1, "id"

    .line 606
    invoke-interface {p2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    const-string v1, "tableName"

    .line 607
    invoke-interface {p2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 608
    invoke-static {v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->fromTableName(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    move-result-object v1

    .line 610
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-nez v2, :cond_2

    .line 612
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 613
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 617
    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    .line 622
    :cond_3
    invoke-direct {p0, p2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->close(Landroid/database/Cursor;)V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 620
    :try_start_1
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;

    const-string v1, "Failed to query events to send."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 622
    :goto_1
    invoke-direct {p0, p2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->close(Landroid/database/Cursor;)V

    throw p1
.end method

.method private findExistingEvent(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;"
        }
    .end annotation

    .line 495
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode()I

    move-result v0

    const-string v1, "hashCode"

    .line 497
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 498
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 499
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ")",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "+",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation

    .line 782
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->daos:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    if-nez v0, :cond_14

    .line 785
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    if-eqz v1, :cond_0

    .line 786
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    .line 787
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 788
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    if-eqz v1, :cond_1

    .line 789
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    .line 790
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 791
    :cond_1
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    if-eqz v1, :cond_2

    .line 792
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    .line 793
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 794
    :cond_2
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    if-eqz v1, :cond_3

    .line 795
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    .line 796
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 797
    :cond_3
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    if-eqz v1, :cond_4

    .line 798
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    .line 799
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 800
    :cond_4
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    if-eqz v1, :cond_5

    .line 801
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    .line 802
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 803
    :cond_5
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    if-eqz v1, :cond_6

    .line 804
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    .line 805
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 806
    :cond_6
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    if-eqz v1, :cond_7

    .line 807
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    .line 808
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 809
    :cond_7
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    if-eqz v1, :cond_8

    .line 810
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    .line 811
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 812
    :cond_8
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    if-eqz v1, :cond_9

    .line 813
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    .line 814
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 815
    :cond_9
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    if-eqz v1, :cond_a

    .line 816
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    .line 817
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto/16 :goto_0

    .line 818
    :cond_a
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    if-eqz v1, :cond_b

    .line 819
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    .line 820
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 821
    :cond_b
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    if-eqz v1, :cond_c

    .line 822
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    .line 823
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 824
    :cond_c
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    if-eqz v1, :cond_d

    .line 825
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    .line 826
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 827
    :cond_d
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    if-eqz v1, :cond_e

    .line 828
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    .line 829
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 830
    :cond_e
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    if-eqz v1, :cond_f

    .line 831
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    .line 832
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 833
    :cond_f
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    if-eqz v1, :cond_10

    .line 834
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    .line 835
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 836
    :cond_10
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    if-eqz v1, :cond_11

    .line 837
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    .line 838
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 839
    :cond_11
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    if-eqz v1, :cond_12

    .line 840
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    .line 841
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 842
    :cond_12
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    if-eqz v1, :cond_13

    .line 843
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    .line 844
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    goto :goto_0

    .line 845
    :cond_13
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    if-eqz v1, :cond_14

    .line 846
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    .line 847
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    :cond_14
    :goto_0
    if-eqz v0, :cond_15

    return-object v0

    .line 852
    :cond_15
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported event type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static open(Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)Lcom/ibotta/android/tracking/proprietary/TrackingDatabase;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;
        }
    .end annotation

    .line 188
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 190
    :try_start_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->database:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;

    if-nez v0, :cond_0

    .line 191
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;-><init>(Landroid/content/Context;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowAgeSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxAttemptsSupplier;Lcom/ibotta/android/tracking/proprietary/SQLiteDatabaseConfig$MaxRowsPerTableSupplier;)V

    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->database:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;

    .line 194
    :cond_0
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 201
    sget-object p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->database:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 196
    :try_start_1
    new-instance p1, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;

    const-string p2, "Failed to open database."

    invoke-direct {p1, p2, p0}, Lcom/ibotta/android/tracking/proprietary/TrackingDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    :goto_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p0
.end method

.method private update(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 2

    .line 712
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    if-eqz v0, :cond_0

    .line 713
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 714
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 715
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    if-eqz v0, :cond_1

    .line 716
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 717
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 718
    :cond_1
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    if-eqz v0, :cond_2

    .line 719
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 720
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 721
    :cond_2
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    if-eqz v0, :cond_3

    .line 722
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 723
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 724
    :cond_3
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    if-eqz v0, :cond_4

    .line 725
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 726
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 727
    :cond_4
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    if-eqz v0, :cond_5

    .line 728
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 729
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 730
    :cond_5
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    if-eqz v0, :cond_6

    .line 731
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 732
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 733
    :cond_6
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    if-eqz v0, :cond_7

    .line 734
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 735
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 736
    :cond_7
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    if-eqz v0, :cond_8

    .line 737
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 738
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 739
    :cond_8
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    if-eqz v0, :cond_9

    .line 740
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 741
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 742
    :cond_9
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    if-eqz v0, :cond_a

    .line 743
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 744
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 745
    :cond_a
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    if-eqz v0, :cond_b

    .line 746
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 747
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 748
    :cond_b
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    if-eqz v0, :cond_c

    .line 749
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 750
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 751
    :cond_c
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    if-eqz v0, :cond_d

    .line 752
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 753
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto/16 :goto_0

    .line 754
    :cond_d
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    if-eqz v0, :cond_e

    .line 755
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 756
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 757
    :cond_e
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    if-eqz v0, :cond_f

    .line 758
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 759
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 760
    :cond_f
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    if-eqz v0, :cond_10

    .line 761
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 762
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 763
    :cond_10
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    if-eqz v0, :cond_11

    .line 764
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 765
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 766
    :cond_11
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    if-eqz v0, :cond_12

    .line 767
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 768
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 769
    :cond_12
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    if-eqz v0, :cond_13

    .line 770
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 771
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    goto :goto_0

    .line 772
    :cond_13
    instance-of v0, p1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    if-eqz v0, :cond_14

    .line 773
    const-class v0, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    .line 774
    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-virtual {v0, v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->update(Ljava/lang/Object;)I

    .line 777
    :cond_14
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v0, p1}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method

.method private updateEventsAsErrored(Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;)I"
        }
    .end annotation

    .line 452
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 453
    sget-object v2, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->ERROR:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventStatus(Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;)V

    const/4 v2, 0x1

    .line 454
    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->addAttempts(I)V

    .line 455
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAttemptAt(Ljava/lang/Long;)V

    .line 456
    invoke-virtual {v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setHashCode(I)V

    .line 458
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->update(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_0

    .line 461
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method private updateExistingEvent(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 4

    .line 474
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getCounter()I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    const-string v0, "Oops, did you for get to set the counter value? Assuming a value of 1 event=%1$s"

    .line 478
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 481
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getDuration()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->addDuration(Ljava/lang/Float;)V

    .line 482
    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->addCounter(I)V

    .line 483
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getEngaged()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->addEngaged(I)V

    .line 487
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setHashCode(I)V

    .line 489
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->update(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->daos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 270
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    return-void
.end method

.method public deleteEverything()V
    .locals 3

    .line 510
    new-instance v0, Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-direct {v0, p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    .line 512
    :try_start_0
    const-class v1, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-static {v0, v1}, Lcom/j256/ormlite/table/TableUtils;->clearTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to delete everything from tracking database."

    const/4 v2, 0x0

    .line 514
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public deleteEverythingInFlight()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 386
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 387
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 389
    invoke-static {}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->values()[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 390
    invoke-virtual {v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getRepresentativeObject()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v6

    .line 392
    invoke-virtual {v6}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v6

    .line 393
    invoke-virtual {v6}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v7

    const-string v8, "eventStatus"

    sget-object v9, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->IN_FLIGHT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v9}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 394
    invoke-virtual {v6}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result v6

    const-string v7, "Deleted %1$d IN_FLIGHT rows from %2$s"

    const/4 v8, 0x2

    .line 396
    new-array v8, v8, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v8, v0

    invoke-virtual {v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v8, v6

    invoke-static {v7, v8}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 399
    :cond_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "Failed to delete IN_FLIGHT events."

    .line 401
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 404
    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    throw v0
.end method

.method public findEventsToSend(I)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;"
        }
    .end annotation

    .line 314
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 318
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 319
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 321
    invoke-direct {p0, v1, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->findEventsToSend(Landroid/database/sqlite/SQLiteDatabase;I)Ljava/util/Map;

    move-result-object v0

    .line 323
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v2, "Failed to find events to send."

    const/4 v3, 0x0

    .line 325
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-object v0

    .line 328
    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    throw p1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
    .locals 2

    const-string p1, "onCreate"

    const/4 v0, 0x0

    .line 235
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    :try_start_0
    sget-object p1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tableNameClassMap:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 238
    invoke-static {p2, v1}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Can\'t create database"

    .line 241
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
    .locals 5

    const-string v0, "onUpgrade"

    const/4 v1, 0x0

    .line 248
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "Starting tracking database upgrade: oldVersion=%1$d, newVersion=%2$d"

    const/4 v2, 0x2

    .line 250
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0x19

    if-ge p3, v0, :cond_1

    .line 253
    invoke-static {}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->values()[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    move-result-object p3

    array-length v0, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p3, v2

    .line 254
    invoke-static {v3}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->access$000(Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {p2, v3, v4}, Lcom/j256/ormlite/table/TableUtils;->dropTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 257
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V

    :cond_1
    const-string p1, "Finished tracking database upgrade: newVersion=%1$d"

    .line 260
    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "Can\'t drop databases"

    .line 262
    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public release()V
    .locals 3

    .line 205
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 207
    :try_start_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 208
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->daos:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 210
    sput-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->database:Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :cond_0
    :goto_0
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Failed to release OpenHelperManager."

    const/4 v2, 0x0

    .line 213
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 216
    :goto_2
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public track(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "An attempt to track a null event occurred."

    .line 276
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v1, "track: %1$s"

    const/4 v2, 0x1

    .line 280
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    sget-object v1, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->NEW:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventStatus(Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;)V

    const/4 v1, 0x0

    .line 288
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 289
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 291
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v3

    .line 293
    invoke-direct {p0, v3, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->findExistingEvent(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "Saving a new event: %1$s"

    .line 296
    new-array v4, v2, [Ljava/lang/Object;

    aput-object p1, v4, v0

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->createNewEvent(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_0

    :cond_1
    const-string v4, "An existing event matches the new event. Updating that row: newEvent=%1$s"

    .line 299
    new-array v5, v2, [Ljava/lang/Object;

    aput-object p1, v5, v0

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-direct {p0, v3, p1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->updateExistingEvent(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 303
    :goto_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    :try_start_1
    const-string v4, "Failed to track event: %1$s"

    .line 305
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    invoke-static {v3, v4, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p1

    invoke-interface {p1, v3}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 308
    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    throw p1
.end method

.method public updateEventsSentStatus(Ljava/util/Map;Z)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
            ">;>;Z)V"
        }
    .end annotation

    if-eqz p1, :cond_5

    .line 336
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 342
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 343
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 345
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 346
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    .line 347
    invoke-virtual {v4}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getRepresentativeObject()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v5

    const/4 v6, 0x2

    if-eqz p2, :cond_2

    .line 350
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-direct {p0, v5, v7}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->deleteEvents(Lcom/j256/ormlite/dao/RuntimeExceptionDao;Ljava/util/List;)I

    move-result v5

    .line 353
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 354
    sget-object v8, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->SENT:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v7, v8}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventStatus(Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;)V

    .line 355
    iget-object v8, p0, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v8, v7}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->notify(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    goto :goto_1

    :cond_1
    const-string v2, "Deleted %1$d successfully sent events from %2$s"

    .line 358
    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v6, v1

    invoke-virtual {v4}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v6, v3

    invoke-static {v2, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 360
    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {p0, v2}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->updateEventsAsErrored(Ljava/util/List;)I

    move-result v2

    const-string v5, "Updated %1$d events as errored in %2$s"

    .line 362
    new-array v6, v6, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v6, v1

    invoke-virtual {v4}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v6, v3

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 366
    :cond_3
    invoke-static {}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->values()[Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;

    move-result-object p1

    array-length p2, p1

    const/4 v2, 0x0

    :goto_2
    if-ge v2, p2, :cond_4

    aget-object v4, p1, v2

    const-string v5, "Cleaning up table: %1$s"

    .line 367
    new-array v6, v3, [Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getTableName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v1

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    invoke-virtual {v4}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;->getRepresentativeObject()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->getDao(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v5

    .line 370
    invoke-direct {p0, v4, v5}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->cleanUp(Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase$Table;Lcom/j256/ormlite/dao/RuntimeExceptionDao;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 373
    :cond_4
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to find events to send."

    .line 375
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 378
    :goto_3
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :goto_4
    invoke-direct {p0, v0}, Lcom/ibotta/android/tracking/proprietary/SQLiteTrackingDatabase;->end(Landroid/database/sqlite/SQLiteDatabase;)V

    throw p1

    :cond_5
    :goto_5
    return-void
.end method
