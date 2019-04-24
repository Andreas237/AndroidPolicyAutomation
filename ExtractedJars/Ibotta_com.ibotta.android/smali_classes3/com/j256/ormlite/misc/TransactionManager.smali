.class public Lcom/j256/ormlite/misc/TransactionManager;
.super Ljava/lang/Object;
.source "TransactionManager.java"


# static fields
.field private static final logger:Lcom/j256/ormlite/logger/Logger;

.field private static savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    const-class v0, Lcom/j256/ormlite/misc/TransactionManager;

    invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;

    move-result-object v0

    sput-object v0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/j256/ormlite/misc/TransactionManager;->savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static callInTransaction(Lcom/j256/ormlite/support/ConnectionSource;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/support/ConnectionSource;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 121
    invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v0

    .line 123
    :try_start_0
    invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z

    move-result v1

    .line 124
    invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;

    move-result-object v2

    invoke-static {v0, v1, v2, p1}, Lcom/j256/ormlite/misc/TransactionManager;->callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    .line 128
    invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 127
    invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    .line 128
    invoke-interface {p0, v0}, Lcom/j256/ormlite/support/ConnectionSource;->releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    throw p1
.end method

.method public static callInTransaction(Lcom/j256/ormlite/support/DatabaseConnection;ZLcom/j256/ormlite/db/DatabaseType;Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/support/DatabaseConnection;",
            "Z",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    .line 150
    :try_start_0
    invoke-interface {p2}, Lcom/j256/ormlite/db/DatabaseType;->isNestedSavePointsSupported()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_2

    .line 151
    :cond_1
    :goto_0
    invoke-interface {p0}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommitSupported()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 152
    invoke-interface {p0}, Lcom/j256/ormlite/support/DatabaseConnection;->isAutoCommit()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_2

    .line 155
    :try_start_1
    invoke-interface {p0, v2}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V

    .line 156
    sget-object p2, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v0, "had to set auto-commit to false"

    invoke-virtual {p2, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    move v2, p1

    .line 159
    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ORMLITE"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lcom/j256/ormlite/misc/TransactionManager;->savePointCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->setSavePoint(Ljava/lang/String;)Ljava/sql/Savepoint;

    move-result-object v0

    if-nez v0, :cond_4

    .line 161
    sget-object p1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p2, "started savePoint transaction"

    invoke-virtual {p1, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 163
    :cond_4
    sget-object p1, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p2, "started savePoint transaction {}"

    invoke-interface {v0}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, p2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    move p1, v2

    const/4 v2, 0x1

    .line 168
    :goto_2
    :try_start_3
    invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_5

    .line 170
    invoke-static {p0, v0}, Lcom/j256/ormlite/misc/TransactionManager;->commit(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
    :try_end_3
    .catch Ljava/sql/SQLException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    if-eqz p1, :cond_6

    .line 197
    invoke-interface {p0, v1}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V

    .line 198
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p1, "restored auto-commit to true"

    invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V

    :cond_6
    return-object p2

    :catchall_0
    move-exception p2

    move v2, p1

    move-object p1, p2

    goto :goto_5

    :catch_0
    move-exception p2

    if-eqz v2, :cond_7

    .line 186
    :try_start_4
    invoke-static {p0, v0}, Lcom/j256/ormlite/misc/TransactionManager;->rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
    :try_end_4
    .catch Ljava/sql/SQLException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    .line 188
    :catch_1
    :try_start_5
    sget-object p3, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v0, "after commit exception, rolling back to save-point also threw exception"

    invoke-virtual {p3, p2, v0}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_7
    :goto_3
    const-string p3, "Transaction callable threw non-SQL exception"

    .line 192
    invoke-static {p3, p2}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p2

    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_2
    move-exception p2

    if-eqz v2, :cond_8

    .line 176
    :try_start_6
    invoke-static {p0, v0}, Lcom/j256/ormlite/misc/TransactionManager;->rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
    :try_end_6
    .catch Ljava/sql/SQLException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    .line 178
    :catch_3
    :try_start_7
    sget-object p3, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v0, "after commit exception, rolling back to save-point also threw exception"

    invoke-virtual {p3, p2, v0}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 182
    :cond_8
    :goto_4
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_1
    move-exception p1

    :goto_5
    if-eqz v2, :cond_9

    .line 197
    invoke-interface {p0, v1}, Lcom/j256/ormlite/support/DatabaseConnection;->setAutoCommit(Z)V

    .line 198
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p2, "restored auto-commit to true"

    invoke-virtual {p0, p2}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V

    :cond_9
    throw p1
.end method

.method private static commit(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 208
    :cond_0
    invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;

    move-result-object v0

    .line 209
    :goto_0
    invoke-interface {p0, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->commit(Ljava/sql/Savepoint;)V

    if-nez v0, :cond_1

    .line 211
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p1, "committed savePoint transaction"

    invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 213
    :cond_1
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p1, "committed savePoint transaction {}"

    invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static rollBack(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/sql/Savepoint;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 218
    :cond_0
    invoke-interface {p1}, Ljava/sql/Savepoint;->getSavepointName()Ljava/lang/String;

    move-result-object v0

    .line 219
    :goto_0
    invoke-interface {p0, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->rollback(Ljava/sql/Savepoint;)V

    if-nez v0, :cond_1

    .line 221
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p1, "rolled back savePoint transaction"

    invoke-virtual {p0, p1}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 223
    :cond_1
    sget-object p0, Lcom/j256/ormlite/misc/TransactionManager;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p1, "rolled back savePoint transaction {}"

    invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
