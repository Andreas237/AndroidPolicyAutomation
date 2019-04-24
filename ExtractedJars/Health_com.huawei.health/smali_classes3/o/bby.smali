.class public final Lo/bby;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lo/bby;


# instance fields
.field private a:Z

.field private b:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Lo/bby;

    invoke-direct {v0}, Lo/bby;-><init>()V

    sput-object v0, Lo/bby;->c:Lo/bby;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lo/bby;->b:Landroid/util/LongSparseArray;

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bby;->d:Z

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bby;->a:Z

    .line 108
    return-void
.end method

.method private a()V
    .locals 1

    .line 361
    new-instance v0, Lo/atk;

    invoke-direct {v0}, Lo/atk;-><init>()V

    invoke-virtual {v0}, Lo/atk;->c()V

    .line 363
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcb;->a()V

    .line 364
    new-instance v0, Lo/bce;

    invoke-direct {v0}, Lo/bce;-><init>()V

    invoke-virtual {v0}, Lo/bce;->a()V

    .line 365
    return-void
.end method

.method private a(Landroid/content/Context;JLo/ayp;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 414
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "deleteDamageDB begin."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sns_e_1_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 416
    invoke-virtual {p1, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 417
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 420
    invoke-virtual {p1, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    new-instance v0, Lo/ayr;

    const-string v1, "deleteDamageDB delete damage db failed"

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 426
    :cond_0
    const-string v0, "encrypt_type2"

    invoke-virtual {p4, v0}, Lo/ayp;->c(Ljava/lang/String;)V

    .line 427
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "deleteDamageDB end."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    return-void
.end method

.method private b(Lo/ayp;J)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 497
    const-string v0, "encrypt_type1"

    invoke-virtual {p1, v0}, Lo/ayp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 498
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 500
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "getOrCreateType1Pwd sp is empty."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    invoke-static {}, Lo/ays;->a()Ljava/lang/String;

    move-result-object v2

    .line 504
    invoke-virtual {p0, v2, p2, p3}, Lo/bby;->b(Ljava/lang/String;J)V

    .line 505
    return-object v2

    .line 509
    :cond_0
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "getOrCreateType1Pwd sp has record."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    invoke-static {v2}, Lo/ayo;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 512
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 514
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "getOrCreateType1Pwd SNSDBKeyStore decrypt result is empty."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    const-string v0, "getOrCreateType1Pwd SNSDBKeyStore decrypt result is empty."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 521
    :cond_1
    iget-object v0, p0, Lo/bby;->b:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p2, p3, v3}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 523
    :goto_0
    return-object v3
.end method

.method private b(Landroid/content/Context;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 440
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "deleteOldDamageDB begin."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sns_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 442
    invoke-virtual {p1, v2}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 443
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 446
    invoke-virtual {p1, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 448
    new-instance v0, Lo/ayr;

    const-string v1, "deleteOldDamageDB delete damage db failed"

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 451
    :cond_0
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "deleteOldDamageDB end."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    return-void
.end method

.method private b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 463
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    const/4 v0, 0x0

    return v0

    .line 468
    :cond_0
    invoke-static {p1}, Lo/bbv;->c(Landroid/content/Context;)Lo/bbv;

    move-result-object v2

    .line 469
    if-nez v2, :cond_1

    .line 472
    const/4 v0, 0x0

    return v0

    .line 476
    :cond_1
    :try_start_0
    invoke-virtual {v2, p2}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getReadableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
    goto :goto_0

    .line 478
    :catch_0
    move-exception v3

    .line 481
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "DB fix, valid db key can open db."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    const/4 v0, 0x0

    return v0

    .line 484
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private d(J)Ljava/lang/String;
    .locals 2

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sns_dbKey_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/content/Context;JLo/ayp;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    .line 237
    move-object v2, p5

    .line 239
    iget-boolean v0, p0, Lo/bby;->d:Z

    if-eqz v0, :cond_0

    .line 241
    return-object v2

    .line 244
    :cond_0
    const-string v0, "db_error_count"

    invoke-virtual {p4, v0}, Lo/ayp;->d(Ljava/lang/String;)I

    move-result v3

    .line 245
    const/4 v0, 0x5

    if-lt v3, v0, :cond_1

    .line 248
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bby;->a(Landroid/content/Context;JLo/ayp;)V

    .line 250
    invoke-direct {p0}, Lo/bby;->a()V

    .line 252
    invoke-direct {p0, p4}, Lo/bby;->e(Lo/ayp;)V

    .line 254
    invoke-static {}, Lo/ays;->a()Ljava/lang/String;

    move-result-object v2

    .line 256
    invoke-virtual {p0, v2, p2, p3}, Lo/bby;->b(Ljava/lang/String;J)V

    .line 257
    const-string v0, "open db error more then 5 times, clear all data."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 258
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "open db error more then 5 times, clear all data."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 263
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 264
    const-string v0, "db_error_count"

    invoke-virtual {p4, v0, v3}, Lo/ayp;->a(Ljava/lang/String;I)Z

    .line 265
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bby;->d:Z

    .line 267
    :goto_0
    return-object v2
.end method

.method private d(Lo/ayp;)V
    .locals 1

    .line 348
    const-string v0, "db_migrate_error_count"

    invoke-virtual {p1, v0}, Lo/ayp;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    const-string v0, "db_migrate_error_count"

    invoke-virtual {p1, v0}, Lo/ayp;->c(Ljava/lang/String;)V

    .line 351
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bby;->a:Z

    .line 353
    :cond_0
    return-void
.end method

.method private e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 376
    const/4 v3, 0x0

    .line 378
    const/4 v4, 0x0

    .line 380
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v5, v0, :cond_1

    .line 384
    const-string v0, "com.huawei.android.sns"

    :try_start_0
    invoke-static {v0, p2}, Lo/ayj;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 385
    invoke-direct {p0, p1, v4}, Lo/bby;->b(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_0
    .catch Lo/ayr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    .line 386
    if-eqz v3, :cond_0

    .line 388
    return-object v4

    .line 398
    :cond_0
    goto :goto_1

    .line 391
    :catch_0
    move-exception v6

    .line 393
    const-string v0, "SQLiteMigrateManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fix db meet SNSDBKeyException\uff0c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/ayr;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    goto :goto_1

    .line 395
    :catch_1
    move-exception v6

    .line 397
    const-string v0, "SQLiteMigrateManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fix db meet Throwable."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 401
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e()Lo/bby;
    .locals 1

    .line 117
    sget-object v0, Lo/bby;->c:Lo/bby;

    return-object v0
.end method

.method private e(Lo/ayp;)V
    .locals 1

    .line 321
    const-string v0, "db_error_count"

    invoke-virtual {p1, v0}, Lo/ayp;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    const-string v0, "db_error_count"

    invoke-virtual {p1, v0}, Lo/ayp;->c(Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bby;->d:Z

    .line 326
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized b()Ljava/lang/String;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    monitor-enter p0

    .line 160
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 163
    iget-object v0, p0, Lo/bby;->b:Landroid/util/LongSparseArray;

    invoke-virtual {v0, v6, v7}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 164
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    monitor-exit p0

    return-object v8

    .line 170
    :cond_0
    new-instance v9, Lo/ayp;

    invoke-direct {p0, v6, v7}, Lo/bby;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lo/ayp;-><init>(Ljava/lang/String;)V

    .line 171
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v10

    .line 177
    const-string v0, "encrypt_type2"

    invoke-virtual {v9, v0}, Lo/ayp;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "KeyStore key type to SNS type begin."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "encrypt_type2"

    invoke-virtual {v9, v0}, Lo/ayp;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 181
    invoke-direct {p0, v10, v11}, Lo/bby;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 182
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 185
    invoke-virtual {p0, v12, v6, v7}, Lo/bby;->b(Ljava/lang/String;J)V

    .line 187
    const-string v0, "encrypt_type2"

    invoke-virtual {v9, v0}, Lo/ayp;->c(Ljava/lang/String;)V

    .line 188
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "KeyStore key type to SNS Type success."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    monitor-exit p0

    return-object v12

    .line 194
    :cond_1
    invoke-direct {p0, v10, v6, v7, v9}, Lo/bby;->a(Landroid/content/Context;JLo/ayp;)V

    .line 196
    invoke-direct {p0}, Lo/bby;->a()V

    .line 198
    invoke-static {}, Lo/ays;->a()Ljava/lang/String;

    move-result-object v13

    .line 200
    invoke-virtual {p0, v13, v6, v7}, Lo/bby;->b(Ljava/lang/String;J)V

    .line 201
    const-string v0, "back keystore to encrypted error, clear all data."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 202
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "back keystore to encrypted error, clear all data."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    monitor-exit p0

    return-object v13

    .line 209
    :cond_2
    invoke-direct {p0, v9, v6, v7}, Lo/bby;->b(Lo/ayp;J)Ljava/lang/String;

    move-result-object v11

    .line 212
    invoke-direct {p0, v10, v11}, Lo/bby;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 215
    invoke-direct {p0, v9}, Lo/bby;->e(Lo/ayp;)V

    .line 216
    monitor-exit p0

    return-object v11

    .line 221
    :cond_3
    move-object v0, p0

    move-object v1, v10

    move-wide v2, v6

    move-object v4, v9

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lo/bby;->d(Landroid/content/Context;JLo/ayp;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method

.method public declared-synchronized b(Ljava/lang/String;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    monitor-enter p0

    .line 127
    :try_start_0
    new-instance v3, Lo/ayp;

    invoke-direct {p0, p2, p3}, Lo/bby;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/ayp;-><init>(Ljava/lang/String;)V

    .line 129
    invoke-static {p1}, Lo/ayo;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 131
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "SNSDBKeyException encrypt dbKey Result is empty."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    new-instance v0, Lo/ayr;

    const-string v1, "SNSDBKeyException encrypt dbKey Result is empty."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_0
    const-string v0, "encrypt_type1"

    invoke-virtual {v3, v0, v4}, Lo/ayp;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 140
    const-string v0, "SQLiteMigrateManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "save db secKey result "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    if-eqz v5, :cond_1

    .line 144
    iget-object v0, p0, Lo/bby;->b:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p2, p3, p1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_0

    .line 148
    :cond_1
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "Save SNS DBKey TO SharedPreferences meet exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    new-instance v0, Lo/ayr;

    const-string v1, "Save SNS DBKey TO SharedPreferences meet exception."

    invoke-direct {v0, v1}, Lo/ayr;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(J)V
    .locals 2

    monitor-enter p0

    .line 337
    :try_start_0
    new-instance v1, Lo/ayp;

    invoke-direct {p0, p1, p2}, Lo/bby;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/ayp;-><init>(Ljava/lang/String;)V

    .line 338
    invoke-direct {p0, v1}, Lo/bby;->d(Lo/ayp;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(Landroid/content/Context;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ayr;
        }
    .end annotation

    monitor-enter p0

    .line 280
    :try_start_0
    iget-boolean v0, p0, Lo/bby;->a:Z

    if-eqz v0, :cond_0

    .line 282
    monitor-exit p0

    return-void

    .line 285
    :cond_0
    new-instance v2, Lo/ayp;

    invoke-direct {p0, p2, p3}, Lo/bby;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/ayp;-><init>(Ljava/lang/String;)V

    .line 288
    const-string v0, "db_migrate_error_count"

    invoke-virtual {v2, v0}, Lo/ayp;->d(Ljava/lang/String;)I

    move-result v3

    .line 289
    const/4 v0, 0x3

    if-lt v3, v0, :cond_1

    .line 292
    invoke-direct {p0, p1, p2, p3}, Lo/bby;->b(Landroid/content/Context;J)V

    .line 294
    invoke-direct {p0, p1, p2, p3, v2}, Lo/bby;->a(Landroid/content/Context;JLo/ayp;)V

    .line 296
    invoke-direct {p0}, Lo/bby;->a()V

    .line 298
    invoke-direct {p0, v2}, Lo/bby;->d(Lo/ayp;)V

    .line 300
    invoke-static {}, Lo/ays;->a()Ljava/lang/String;

    move-result-object v4

    .line 302
    invoke-virtual {p0, v4, p2, p3}, Lo/bby;->b(Ljava/lang/String;J)V

    .line 303
    const-string v0, "migrate db error more then 3 times, clear all data."

    invoke-static {v0}, Lo/bpj;->b(Ljava/lang/String;)V

    .line 304
    const-string v0, "SQLiteMigrateManager"

    const-string v1, "migrate db error more then 3 times, clear all data."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    goto :goto_0

    .line 308
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 309
    const-string v0, "db_migrate_error_count"

    invoke-virtual {v2, v0, v3}, Lo/ayp;->a(Ljava/lang/String;I)Z

    .line 310
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bby;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
