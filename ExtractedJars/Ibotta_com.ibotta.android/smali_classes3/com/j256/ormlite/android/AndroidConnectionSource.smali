.class public Lcom/j256/ormlite/android/AndroidConnectionSource;
.super Lcom/j256/ormlite/support/BaseConnectionSource;
.source "AndroidConnectionSource.java"

# interfaces
.implements Lcom/j256/ormlite/support/ConnectionSource;


# static fields
.field private static connectionProxyFactory:Lcom/j256/ormlite/support/DatabaseConnectionProxyFactory;

.field private static final logger:Lcom/j256/ormlite/logger/Logger;


# instance fields
.field private cancelQueriesEnabled:Z

.field private connection:Lcom/j256/ormlite/support/DatabaseConnection;

.field private final databaseType:Lcom/j256/ormlite/db/DatabaseType;

.field private final helper:Landroid/database/sqlite/SQLiteOpenHelper;

.field private volatile isOpen:Z

.field private final sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;

    move-result-object v0

    sput-object v0, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Lcom/j256/ormlite/support/BaseConnectionSource;-><init>()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z

    .line 33
    new-instance v1, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;

    invoke-direct {v1}, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;-><init>()V

    iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    const/4 v1, 0x0

    .line 35
    iput-boolean v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->cancelQueriesEnabled:Z

    .line 38
    iput-object p1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 39
    iput-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method


# virtual methods
.method public clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
    .locals 1

    .line 93
    sget-object v0, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;

    invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->clearSpecial(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/logger/Logger;)Z

    return-void
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x0

    .line 98
    iput-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z

    return-void
.end method

.method public closeQuietly()V
    .locals 0

    .line 102
    invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->close()V

    return-void
.end method

.method public getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->databaseType:Lcom/j256/ormlite/db/DatabaseType;

    return-object v0
.end method

.method public getReadOnlyConnection()Lcom/j256/ormlite/support/DatabaseConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 54
    invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v0

    return-object v0
.end method

.method public getReadWriteConnection()Lcom/j256/ormlite/support/DatabaseConnection;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->getSavedConnection()Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    if-nez v0, :cond_3

    .line 64
    iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->sqliteDatabase:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_1

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Getting a writable database from helper "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    .line 73
    :cond_1
    :goto_0
    new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->cancelQueriesEnabled:Z

    invoke-direct {v1, v0, v2, v3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    .line 74
    sget-object v1, Lcom/j256/ormlite/android/AndroidConnectionSource;->connectionProxyFactory:Lcom/j256/ormlite/support/DatabaseConnectionProxyFactory;

    if-eqz v1, :cond_2

    .line 75
    iget-object v2, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    invoke-interface {v1, v2}, Lcom/j256/ormlite/support/DatabaseConnectionProxyFactory;->createProxy(Lcom/j256/ormlite/support/DatabaseConnection;)Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v1

    iput-object v1, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    .line 77
    :cond_2
    sget-object v1, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v2, "created connection {} for db {}, helper {}"

    iget-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    iget-object v4, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1, v2, v3, v0, v4}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 79
    :cond_3
    sget-object v1, Lcom/j256/ormlite/android/AndroidConnectionSource;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v2, "{}: returning read-write connection {}, helper {}"

    iget-object v3, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->helper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1, v2, p0, v0, v3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    :goto_1
    iget-object v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->connection:Lcom/j256/ormlite/support/DatabaseConnection;

    return-object v0
.end method

.method public isOpen()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/j256/ormlite/android/AndroidConnectionSource;->isOpen:Z

    return v0
.end method

.method public releaseConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V
    .locals 0

    return-void
.end method

.method public saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 89
    invoke-virtual {p0, p1}, Lcom/j256/ormlite/android/AndroidConnectionSource;->saveSpecial(Lcom/j256/ormlite/support/DatabaseConnection;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
