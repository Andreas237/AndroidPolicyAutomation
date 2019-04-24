.class public abstract Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "OrmLiteSqliteOpenHelper.java"


# static fields
.field protected static logger:Lcom/j256/ormlite/logger/Logger;


# instance fields
.field protected cancelQueriesEnabled:Z

.field protected connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

.field private volatile isOpen:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;

    invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;

    move-result-object v0

    sput-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 37
    new-instance p1, Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-direct {p1, p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object p1, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z

    .line 55
    sget-object p1, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p2, "{}: constructed connectionSource {}"

    iget-object p3, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-virtual {p1, p2, p0, p3}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;II)V
    .locals 6

    .line 76
    invoke-static {p1, p5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->openFileId(Landroid/content/Context;I)Ljava/io/InputStream;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/File;)V
    .locals 6

    .line 96
    invoke-static {p5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->openFile(Ljava/io/File;)Ljava/io/InputStream;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILjava/io/InputStream;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 37
    new-instance p1, Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-direct {p1, p0}, Lcom/j256/ormlite/android/AndroidConnectionSource;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object p1, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z

    if-nez p5, :cond_0

    return-void

    .line 124
    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/BufferedReader;

    new-instance p2, Ljava/io/InputStreamReader;

    invoke-direct {p2, p5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 p3, 0x1000

    invoke-direct {p1, p2, p3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 125
    invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->loadDatabaseConfigFromReader(Ljava/io/BufferedReader;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/j256/ormlite/dao/DaoManager;->addCachedDatabaseConfigs(Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    :try_start_1
    invoke-virtual {p5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 127
    :try_start_2
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Could not load object config file"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    :goto_0
    :try_start_3
    invoke-virtual {p5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 134
    :catch_2
    throw p1
.end method

.method private static openFile(Ljava/io/File;)Ljava/io/InputStream;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 322
    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 325
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not open config file "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static openFileId(Landroid/content/Context;I)Ljava/io/InputStream;
    .locals 2

    .line 310
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    .line 312
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find object config file with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 253
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 254
    iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    invoke-virtual {v0}, Lcom/j256/ormlite/android/AndroidConnectionSource;->close()V

    const/4 v0, 0x0

    .line 259
    iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z

    return-void
.end method

.method public getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
    .locals 3

    .line 179
    iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z

    if-nez v0, :cond_0

    .line 181
    sget-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->logger:Lcom/j256/ormlite/logger/Logger;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v2, "Getting connectionSource was called after closed"

    invoke-virtual {v0, v1, v2}, Lcom/j256/ormlite/logger/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->connectionSource:Lcom/j256/ormlite/android/AndroidConnectionSource;

    return-object v0
.end method

.method public getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D::",
            "Lcom/j256/ormlite/dao/Dao<",
            "TT;*>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TD;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 279
    invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/j256/ormlite/dao/DaoManager;->createDao(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;

    move-result-object p1

    return-object p1
.end method

.method public getRuntimeExceptionDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/RuntimeExceptionDao;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lcom/j256/ormlite/dao/RuntimeExceptionDao<",
            "TT;*>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TD;"
        }
    .end annotation

    .line 295
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getDao(Ljava/lang/Class;)Lcom/j256/ormlite/dao/Dao;

    move-result-object v0

    .line 297
    new-instance v1, Lcom/j256/ormlite/dao/RuntimeExceptionDao;

    invoke-direct {v1, v0}, Lcom/j256/ormlite/dao/RuntimeExceptionDao;-><init>(Lcom/j256/ormlite/dao/Dao;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 300
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create RuntimeExcepitionDao for class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public isOpen()Z
    .locals 1

    .line 266
    iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->isOpen:Z

    return v0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 191
    invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;

    move-result-object v0

    .line 197
    invoke-interface {v0}, Lcom/j256/ormlite/support/ConnectionSource;->getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 200
    new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;

    iget-boolean v3, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->cancelQueriesEnabled:Z

    invoke-direct {v1, p1, v2, v3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    .line 202
    :try_start_0
    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 205
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not save special connection"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 v2, 0x0

    .line 209
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1, v0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 212
    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_2

    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    :cond_2
    throw p1
.end method

.method public abstract onCreate(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;)V
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 4

    .line 222
    invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;

    move-result-object v0

    .line 228
    invoke-interface {v0}, Lcom/j256/ormlite/support/ConnectionSource;->getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 231
    new-instance v1, Lcom/j256/ormlite/android/AndroidDatabaseConnection;

    iget-boolean v3, p0, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->cancelQueriesEnabled:Z

    invoke-direct {v1, p1, v2, v3}, Lcom/j256/ormlite/android/AndroidDatabaseConnection;-><init>(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    .line 233
    :try_start_0
    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->saveSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 236
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Could not save special connection"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 v2, 0x0

    .line 240
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 243
    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_2

    invoke-interface {v0, v1}, Lcom/j256/ormlite/support/ConnectionSource;->clearSpecialConnection(Lcom/j256/ormlite/support/DatabaseConnection;)V

    :cond_2
    throw p1
.end method

.method public abstract onUpgrade(Landroid/database/sqlite/SQLiteDatabase;Lcom/j256/ormlite/support/ConnectionSource;II)V
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 306
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
