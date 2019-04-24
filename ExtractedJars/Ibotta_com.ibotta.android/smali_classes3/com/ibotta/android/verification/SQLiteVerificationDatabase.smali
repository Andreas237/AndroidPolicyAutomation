.class public Lcom/ibotta/android/verification/SQLiteVerificationDatabase;
.super Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
.source "SQLiteVerificationDatabase.java"

# interfaces
.implements Lcom/ibotta/android/verification/VerificationDatabase;


# static fields
.field private static final DATABASE_NAME:Ljava/lang/String; = "verification.db"

.field private static final DATABASE_VERSION:I = 0x4

.field private static final DEFAULT_VERIFICATION_VALIDITY:J = 0xe10L

.field private static final counter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static database:Lcom/ibotta/android/verification/VerificationDatabase;

.field private static final lock:Ljava/util/concurrent/locks/ReentrantLock;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/android/verification/Verification;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 41
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 43
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 6

    const-string v2, "verification.db"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const v5, 0x7f100012

    move-object v0, p0

    move-object v1, p1

    .line 87
    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V

    .line 88
    iput-object p2, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method

.method private getAgeLimit()J
    .locals 4

    .line 439
    iget-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getVerificationValidity()Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0xe10

    .line 441
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 444
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 445
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "Lcom/ibotta/android/verification/Verification;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 432
    iget-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    if-nez v0, :cond_0

    .line 433
    const-class v0, Lcom/ibotta/android/verification/Verification;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    return-object v0
.end method

.method public static open(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/verification/VerificationDatabase;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 64
    sget-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 66
    :try_start_0
    sget-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->database:Lcom/ibotta/android/verification/VerificationDatabase;

    if-nez v0, :cond_0

    .line 67
    new-instance v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)V

    sput-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->database:Lcom/ibotta/android/verification/VerificationDatabase;

    .line 70
    :cond_0
    sget-object p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    sget-object p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 78
    sget-object p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->database:Lcom/ibotta/android/verification/VerificationDatabase;

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_1
    const-string p1, "Failed to open database."

    const/4 v0, 0x0

    .line 72
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    new-instance p1, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v0, "Failed to open database."

    invoke-direct {p1, v0, p0}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :goto_0
    sget-object p1, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p0
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 422
    iput-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 423
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    return-void
.end method

.method public deleteEverything()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 339
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 343
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to delete all verifications."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    new-instance v1, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v2, "Failed to delete all verifications."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public deleteOldVerifications()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 157
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getAgeLimit()J

    move-result-wide v3

    sub-long/2addr v1, v3

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v3

    invoke-virtual {v3}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v3

    .line 159
    invoke-virtual {v3}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v4

    const-string v5, "saveTime"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Lcom/j256/ormlite/stmt/Where;->lt(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 160
    invoke-virtual {v3}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I

    move-result v1

    const-string v2, "%1$d old verifications deleted."

    const/4 v3, 0x1

    .line 162
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 166
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Failed to delete old verifications."

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v2, "Failed to delete old verifications."

    invoke-direct {v0, v2, v1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public deleteVerification(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 138
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 140
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 144
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to delete verification."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to delete verification."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public deleteVerifications(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 118
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->deleteBuilder()Lcom/j256/ormlite/stmt/DeleteBuilder;

    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "offerId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 120
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/DeleteBuilder;->delete()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 124
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to delete verifications."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to delete verifications."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public findByOfferId(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 183
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v0

    const-string v1, "offerId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/Where;->query()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 187
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to query for verifications."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to query for verifications."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 209
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v0

    .line 210
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v0

    const-string v1, "offerId"

    .line 211
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    if-eqz p2, :cond_0

    .line 214
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    const-string v1, "productGroupId"

    invoke-virtual {p1, v1, p2}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 217
    :cond_0
    invoke-virtual {v0}, Lcom/j256/ormlite/stmt/Where;->query()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 221
    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "Failed to query for verifications."

    invoke-static {p1, v0, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    new-instance p2, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v0, "Failed to query for verifications."

    invoke-direct {p2, v0, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public findByOfferIds(Ljava/util/Set;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 278
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 281
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v1

    .line 282
    invoke-virtual {v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v1

    .line 283
    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v1

    const-string v2, "offerId"

    .line 284
    invoke-virtual {v1, v2, p1}, Lcom/j256/ormlite/stmt/Where;->in(Ljava/lang/String;Ljava/lang/Iterable;)Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    .line 285
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/Where;->query()Ljava/util/List;

    move-result-object p1

    .line 287
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/Verification;

    .line 288
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getOfferId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    .line 290
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 291
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getOfferId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 298
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to query for verifications by offer ids."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to query for verifications by offer ids."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public findCountWithScannedData(ILjava/lang/Integer;Ljava/lang/String;)S
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 244
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v1

    invoke-virtual {v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v1

    .line 245
    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v2

    const-string v3, "COUNT(*)"

    .line 247
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRaw([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;

    const-string v3, "offerId"

    .line 249
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    if-eqz p2, :cond_0

    .line 252
    invoke-virtual {v2}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    const-string v3, "productGroupId"

    invoke-virtual {p1, v3, p2}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 255
    :cond_0
    invoke-virtual {v2}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    const-string p2, "scannedData"

    invoke-virtual {p1, p2, p3}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    .line 257
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p1

    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepareStatementString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v0, [Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryRawValue(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int p2, p1

    int-to-short p1, p2

    return p1

    :catch_0
    move-exception p1

    .line 261
    new-array p2, v0, [Ljava/lang/Object;

    const-string p3, "Failed to query for verifications."

    invoke-static {p1, p3, p2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    new-instance p2, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string p3, "Failed to query for verifications."

    invoke-direct {p2, p3, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getScanCountByOfferId(I)S
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 317
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v1

    invoke-virtual {v1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryBuilder()Lcom/j256/ormlite/stmt/QueryBuilder;

    move-result-object v1

    const-string v2, "COUNT(*)"

    .line 318
    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/j256/ormlite/stmt/QueryBuilder;->selectRaw([Ljava/lang/String;)Lcom/j256/ormlite/stmt/QueryBuilder;

    .line 319
    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->where()Lcom/j256/ormlite/stmt/Where;

    move-result-object v2

    const-string v3, "offerId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lcom/j256/ormlite/stmt/Where;->eq(Ljava/lang/String;Ljava/lang/Object;)Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/Where;->and()Lcom/j256/ormlite/stmt/Where;

    move-result-object p1

    const-string v2, "scannedData"

    invoke-virtual {p1, v2}, Lcom/j256/ormlite/stmt/Where;->isNotNull(Ljava/lang/String;)Lcom/j256/ormlite/stmt/Where;

    .line 320
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object p1

    invoke-virtual {v1}, Lcom/j256/ormlite/stmt/QueryBuilder;->prepareStatementString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->queryRawValue(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int p1, v0

    int-to-short p1, p1

    return p1

    :catch_0
    move-exception p1

    .line 324
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to query for scan count by offer."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to query for scan count by offer."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
    .locals 2

    const-string p1, "onCreate"

    const/4 v0, 0x0

    .line 381
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    :try_start_0
    const-class p1, Lcom/ibotta/android/verification/Verification;

    invoke-static {p2, p1}, Lcom/j256/ormlite/table/TableUtils;->createTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Can\'t create database"

    .line 385
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
    .locals 4

    const-string v0, "onUpgrade"

    const/4 v1, 0x0

    .line 400
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "Starting verification database upgrade: oldVersion=%1$d, newVersion=%2$d"

    const/4 v2, 0x2

    .line 402
    new-array v2, v2, [Ljava/lang/Object;

    .line 404
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, v1

    .line 405
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v3, 0x1

    aput-object p3, v2, v3

    .line 402
    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    const-class p3, Lcom/ibotta/android/verification/Verification;

    invoke-static {p2, p3, v3}, Lcom/j256/ormlite/table/TableUtils;->dropTable(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;Z)I

    .line 408
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V

    const-string p1, "Finished verification database upgrade: newVersion=%1$d"

    .line 410
    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p2, v1

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Can\'t drop databases"

    .line 412
    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public release()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 356
    sget-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 358
    :try_start_0
    sget-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    .line 359
    invoke-super {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->close()V

    const/4 v0, 0x0

    .line 360
    iput-object v0, p0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->verificationDao:Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    .line 361
    sput-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->database:Lcom/ibotta/android/verification/VerificationDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    :cond_0
    sget-object v0, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Failed to release database."

    const/4 v2, 0x0

    .line 366
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    new-instance v1, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v2, "Failed to release database."

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    :goto_0
    sget-object v1, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->lock:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public saveVerification(Lcom/ibotta/android/verification/Verification;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 100
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->getVerificationDao()Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;->createOrUpdate(Ljava/lang/Object;)Lcom/j256/ormlite/dao/Dao$CreateOrUpdateStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 v0, 0x0

    .line 104
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failed to save verification."

    invoke-static {p1, v1, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    new-instance v0, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;

    const-string v1, "Failed to save verification."

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/verification/VerificationDatabaseFatalException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
