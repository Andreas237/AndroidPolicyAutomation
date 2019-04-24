.class public Lorg/researchstack/backbone/storage/NotificationHelper;
.super Lco/touchlab/squeaky/db/sqlite/SqueakyOpenHelper;
.source "NotificationHelper.java"


# static fields
.field public static final DB_NAME:Ljava/lang/String; = "db_notification"

.field private static DB_VERSION:I

.field private static sInstance:Lorg/researchstack/backbone/storage/NotificationHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x1

    sput v0, Lorg/researchstack/backbone/storage/NotificationHelper;->DB_VERSION:I

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 24
    const-string v0, "db_notification"

    const/4 v1, 0x0

    sget v2, Lorg/researchstack/backbone/storage/NotificationHelper;->DB_VERSION:I

    invoke-direct {p0, p1, v0, v1, v2}, Lco/touchlab/squeaky/db/sqlite/SqueakyOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 25
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lorg/researchstack/backbone/storage/NotificationHelper;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 29
    sget-object v0, Lorg/researchstack/backbone/storage/NotificationHelper;->sInstance:Lorg/researchstack/backbone/storage/NotificationHelper;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lorg/researchstack/backbone/storage/NotificationHelper;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/storage/NotificationHelper;-><init>(Landroid/content/Context;)V

    sput-object v0, Lorg/researchstack/backbone/storage/NotificationHelper;->sInstance:Lorg/researchstack/backbone/storage/NotificationHelper;

    .line 33
    :cond_0
    sget-object v0, Lorg/researchstack/backbone/storage/NotificationHelper;->sInstance:Lorg/researchstack/backbone/storage/NotificationHelper;

    return-object v0
.end method


# virtual methods
.method public deleteTaskNotification(I)V
    .locals 4
    .param p1, "taskNotificationId"    # I

    .prologue
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteTaskNotification() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 97
    :try_start_0
    const-class v1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/storage/NotificationHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Lco/touchlab/squeaky/dao/Dao;->deleteById(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    return-void

    .line 99
    :catch_0
    move-exception v0

    .line 101
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public loadTaskNotifications()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "loadTaskNotifications()"

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 69
    :try_start_0
    const-class v1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/storage/NotificationHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v1

    invoke-interface {v1}, Lco/touchlab/squeaky/dao/Dao;->queryForAll()Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v1

    invoke-interface {v1}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 71
    :catch_0
    move-exception v0

    .line 73
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5
    .param p1, "sqLiteDatabase"    # Landroid/database/sqlite/SQLiteDatabase;

    .prologue
    .line 41
    :try_start_0
    new-instance v1, Lco/touchlab/squeaky/db/sqlite/SQLiteDatabaseImpl;

    invoke-direct {v1, p1}, Lco/touchlab/squeaky/db/sqlite/SQLiteDatabaseImpl;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Lorg/researchstack/backbone/storage/database/TaskNotification;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lco/touchlab/squeaky/table/TableUtils;->createTables(Lco/touchlab/squeaky/db/SQLiteDatabase;[Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-void

    .line 43
    :catch_0
    move-exception v0

    .line 45
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 6
    .param p1, "sqLiteDatabase"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "i"    # I
    .param p3, "i1"    # I

    .prologue
    .line 54
    :try_start_0
    new-instance v1, Lco/touchlab/squeaky/db/sqlite/SQLiteDatabaseImpl;

    invoke-direct {v1, p1}, Lco/touchlab/squeaky/db/sqlite/SQLiteDatabaseImpl;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    const/4 v2, 0x1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lorg/researchstack/backbone/storage/database/TaskNotification;

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lco/touchlab/squeaky/table/TableUtils;->dropTables(Lco/touchlab/squeaky/db/SQLiteDatabase;Z[Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 60
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public saveTaskNotification(Lorg/researchstack/backbone/storage/database/TaskNotification;)V
    .locals 4
    .param p1, "notification"    # Lorg/researchstack/backbone/storage/database/TaskNotification;

    .prologue
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveTaskNotification() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->id:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 83
    :try_start_0
    const-class v1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, v1}, Lorg/researchstack/backbone/storage/NotificationHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v1

    invoke-interface {v1, p1}, Lco/touchlab/squeaky/dao/Dao;->createOrUpdate(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    return-void

    .line 85
    :catch_0
    move-exception v0

    .line 87
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
