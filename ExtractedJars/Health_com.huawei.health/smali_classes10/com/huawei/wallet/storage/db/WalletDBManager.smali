.class public final Lcom/huawei/wallet/storage/db/WalletDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/huawei/wallet/storage/db/WalletDBHelper;

.field private static d:Ljava/util/concurrent/locks/ReentrantLock;

.field private static volatile e:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->d:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    return-void
.end method

.method public static e()Landroid/database/sqlite/SQLiteDatabase;
    .locals 4

    .line 52
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_1

    .line 54
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 57
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->e:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    .line 59
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->a:Lcom/huawei/wallet/storage/db/WalletDBHelper;

    invoke-virtual {v0}, Lcom/huawei/wallet/storage/db/WalletDBHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->e:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    :cond_0
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 70
    goto :goto_0

    .line 62
    :catch_0
    move-exception v2

    .line 65
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getDB SQLiteException:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 70
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v3

    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 70
    throw v3

    .line 73
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/wallet/storage/db/WalletDBManager;->e:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method
