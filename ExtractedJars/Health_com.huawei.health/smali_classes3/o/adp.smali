.class public Lo/adp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/adp$e;
    }
.end annotation


# static fields
.field private static b:Lo/adp;

.field private static final r:Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[B>;"
        }
    .end annotation
.end field

.field private c:J

.field private d:Landroid/os/Handler;

.field private e:Lo/adp$e;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I

.field private l:B

.field private m:I

.field private n:I

.field private o:Z

.field private p:B

.field private q:[B

.field private s:[B

.field private t:[B

.field private u:[B

.field private v:Ljava/lang/Runnable;

.field private w:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 93
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/adp;->r:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/adp;->c:J

    .line 72
    const/4 v0, 0x2

    iput v0, p0, Lo/adp;->h:I

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->i:I

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->f:I

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->k:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->g:I

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->n:I

    .line 82
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/adp;->p:B

    .line 83
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/adp;->l:B

    .line 85
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->m:I

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adp;->o:Z

    .line 308
    new-instance v0, Lo/adp$3;

    invoke-direct {v0, p0}, Lo/adp$3;-><init>(Lo/adp;)V

    iput-object v0, p0, Lo/adp;->v:Ljava/lang/Runnable;

    .line 316
    new-instance v0, Lo/adp$5;

    invoke-direct {v0, p0}, Lo/adp$5;-><init>(Lo/adp;)V

    iput-object v0, p0, Lo/adp;->w:Ljava/lang/Runnable;

    .line 106
    new-instance v0, Lo/adp$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/adp$1;-><init>(Lo/adp;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    .line 150
    return-void
.end method

.method static synthetic a(Lo/adp;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/adp;->i:I

    return v0
.end method

.method static synthetic a(Lo/adp;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/adp;->i:I

    return p1
.end method

.method public static declared-synchronized a()Lo/adp;
    .locals 4

    const-class v3, Lo/adp;

    monitor-enter v3

    .line 96
    :try_start_0
    sget-object v1, Lo/adp;->r:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 97
    :try_start_1
    sget-object v0, Lo/adp;->b:Lo/adp;

    if-nez v0, :cond_0

    .line 98
    new-instance v0, Lo/adp;

    invoke-direct {v0}, Lo/adp;-><init>()V

    sput-object v0, Lo/adp;->b:Lo/adp;

    .line 100
    :cond_0
    sget-object v0, Lo/adp;->b:Lo/adp;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    monitor-exit v3

    return-object v0

    .line 101
    :catchall_0
    move-exception v2

    monitor-exit v1

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    monitor-exit v3

    throw v1
.end method

.method private a(I)V
    .locals 3

    .line 159
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 160
    const-string v0, "update_progress"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 161
    new-instance v0, Lo/ahi$a;

    const-string v1, "upgrade_update_progress"

    invoke-direct {v0, v1, v2}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 162
    return-void
.end method

.method static synthetic b(Lo/adp;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/adp;->k:I

    return v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 380
    const-string v4, ""

    .line 381
    const/4 v5, 0x0

    .line 383
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 384
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 385
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v7

    .line 387
    const/4 v8, 0x0

    .line 388
    :goto_0
    invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v8, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 389
    const/4 v0, 0x0

    invoke-virtual {v7, v6, v0, v8}, Ljava/security/MessageDigest;->update([BII)V

    goto :goto_0

    .line 392
    :cond_0
    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lo/adp;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 398
    if-eqz v5, :cond_2

    .line 400
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 403
    goto/16 :goto_2

    .line 401
    :catch_0
    move-exception v6

    .line 402
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    goto/16 :goto_2

    .line 393
    :catch_1
    move-exception v6

    .line 394
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update IOException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 398
    if-eqz v5, :cond_2

    .line 400
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 403
    goto/16 :goto_2

    .line 401
    :catch_2
    move-exception v6

    .line 402
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    goto/16 :goto_2

    .line 395
    :catch_3
    move-exception v6

    .line 396
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update NoSuchAlgorithmException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 398
    if-eqz v5, :cond_2

    .line 400
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 403
    goto :goto_2

    .line 401
    :catch_4
    move-exception v6

    .line 402
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    goto :goto_2

    .line 398
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_1

    .line 400
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 403
    goto :goto_1

    .line 401
    :catch_5
    move-exception v10

    .line 402
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    :cond_1
    :goto_1
    throw v9

    .line 406
    :cond_2
    :goto_2
    return-object v4
.end method

.method private static b([B)Ljava/lang/String;
    .locals 5

    .line 415
    new-instance v2, Ljava/lang/StringBuffer;

    array-length v0, p0

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 416
    const/4 v3, 0x0

    .line 417
    const/4 v4, 0x0

    :goto_0
    array-length v0, p0

    if-ge v4, v0, :cond_1

    .line 418
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 419
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 420
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 422
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 417
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 424
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 329
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------setScaleOtaByte------- name1: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", name2: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->g:I

    .line 331
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->n:I

    .line 332
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/adp;->p:B

    .line 333
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/adp;->l:B

    .line 334
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/adp;->a:Ljava/util/List;

    .line 335
    const/4 v4, 0x0

    .line 337
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 338
    const/16 v0, 0x10

    new-array v5, v0, [B

    .line 340
    :goto_0
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 341
    invoke-virtual {v5}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [B

    .line 342
    iget-byte v0, p0, Lo/adp;->p:B

    invoke-direct {p0, v7, v0}, Lo/adp;->d([BB)B

    move-result v0

    iput-byte v0, p0, Lo/adp;->p:B

    .line 343
    iget-object v0, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    iget v0, p0, Lo/adp;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/adp;->g:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    goto :goto_0

    .line 348
    :cond_0
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 351
    goto :goto_1

    .line 349
    :catch_0
    move-exception v7

    .line 350
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 1 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    :goto_1
    if-eqz p2, :cond_1

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 355
    :goto_2
    invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 356
    invoke-virtual {v5}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [B

    .line 357
    iget-byte v0, p0, Lo/adp;->l:B

    invoke-direct {p0, v7, v0}, Lo/adp;->d([BB)B

    move-result v0

    iput-byte v0, p0, Lo/adp;->l:B

    .line 358
    iget-object v0, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    iget v0, p0, Lo/adp;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/adp;->n:I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 360
    goto :goto_2

    .line 365
    :cond_1
    if-eqz v4, :cond_3

    .line 367
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 370
    goto/16 :goto_4

    .line 368
    :catch_1
    move-exception v5

    .line 369
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    goto/16 :goto_4

    .line 362
    :catch_2
    move-exception v5

    .line 363
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 365
    if-eqz v4, :cond_3

    .line 367
    :try_start_5
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 370
    goto :goto_4

    .line 368
    :catch_3
    move-exception v5

    .line 369
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    goto :goto_4

    .line 365
    :catchall_0
    move-exception v8

    if-eqz v4, :cond_2

    .line 367
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 370
    goto :goto_3

    .line 368
    :catch_4
    move-exception v9

    .line 369
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setScaleOtaByte 3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    :cond_2
    :goto_3
    throw v8

    .line 374
    :cond_3
    :goto_4
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ota byte list size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mOtaCheckCrc8_1: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-byte v3, p0, Lo/adp;->p:B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mOtaCheckCrc8_2: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-byte v3, p0, Lo/adp;->l:B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mOtaPkgLen1: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adp;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mOtaPkgLen2: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adp;->n:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/adp;->k:I

    .line 377
    return-void
.end method

.method static synthetic b(Lo/adp;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/adp;->a(I)V

    return-void
.end method

.method static synthetic c(Lo/adp;I)I
    .locals 0

    .line 31
    iput p1, p0, Lo/adp;->f:I

    return p1
.end method

.method static synthetic c(Lo/adp;)Landroid/os/Handler;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    return-object v0
.end method

.method private c(I)V
    .locals 3

    .line 153
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 154
    const-string v0, "update_status"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 155
    new-instance v0, Lo/ahi$a;

    const-string v1, "upgrade_update_status"

    invoke-direct {v0, v1, v2}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 156
    return-void
.end method

.method private d([BB)B
    .locals 4

    .line 436
    array-length v1, p1

    .line 438
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 439
    aget-byte v0, p1, v2

    xor-int/2addr v0, p2

    int-to-byte p2, v0

    .line 440
    const/4 v3, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v3, v0, :cond_1

    .line 441
    and-int/lit16 v0, p2, 0x80

    if-lez v0, :cond_0

    .line 442
    shl-int/lit8 v0, p2, 0x1

    int-to-byte p2, v0

    .line 443
    xor-int/lit8 v0, p2, 0x7

    int-to-byte p2, v0

    goto :goto_2

    .line 445
    :cond_0
    shl-int/lit8 v0, p2, 0x1

    int-to-byte p2, v0

    .line 440
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 438
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 449
    :cond_2
    return p2
.end method

.method static synthetic d(Lo/adp;)Ljava/lang/Runnable;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/adp;->v:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic e(Lo/adp;)Ljava/lang/Runnable;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/adp;->w:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic e(Lo/adp;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/adp;->c(I)V

    return-void
.end method

.method static synthetic i(Lo/adp;)I
    .locals 1

    .line 31
    iget v0, p0, Lo/adp;->f:I

    return v0
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 216
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------onOtaUpgradeReady------- result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mFirstPkgDataIdx: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/adp;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mOtaByteList size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/adp;->c:J

    .line 219
    iget-boolean v0, p0, Lo/adp;->o:Z

    if-eqz v0, :cond_0

    .line 220
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start scale"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->s:[B

    invoke-static {v1}, Lo/adl;->e([B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 223
    :cond_0
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start ble "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->q:[B

    invoke-static {v1}, Lo/adl;->e([B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 226
    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 229
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "------onReceiveSha256PkgOne-------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-boolean v0, p0, Lo/adp;->o:Z

    if-eqz v0, :cond_0

    .line 231
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start scale 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->t:[B

    invoke-static {v1}, Lo/adl;->b([B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 234
    :cond_0
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start ble 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->u:[B

    invoke-static {v1}, Lo/adl;->b([B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 237
    :goto_0
    return-void
.end method

.method public c(IZ)V
    .locals 6

    .line 285
    move v4, p1

    .line 286
    iget v0, p0, Lo/adp;->k:I

    iget v1, p0, Lo/adp;->g:I

    if-le v0, v1, :cond_0

    iget v0, p0, Lo/adp;->m:I

    iget v1, p0, Lo/adp;->g:I

    if-ne v0, v1, :cond_0

    .line 287
    iget v0, p0, Lo/adp;->g:I

    add-int v4, v0, p1

    .line 290
    :cond_0
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 291
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 292
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 293
    iput v4, v5, Landroid/os/Message;->arg1:I

    .line 294
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 296
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------onUpgradeResponse-------pkgNo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", currProgress: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mOtaByteList size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    add-int/lit8 v0, v4, 0x1

    iget-object v1, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 299
    if-eqz p2, :cond_1

    .line 300
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->a:Ljava/util/List;

    add-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v2}, Lo/adl;->d([BI)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 302
    :cond_1
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-static {v1, p1}, Lo/adl;->d([BI)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 305
    :cond_2
    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 243
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "------onReceiveSha256PkgTwo-------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/adp;->c:J

    .line 246
    iget v0, p0, Lo/adp;->m:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/adp;->m:I

    iget-object v1, p0, Lo/adp;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 247
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lo/adp;->a:Ljava/util/List;

    iget v2, p0, Lo/adp;->m:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lo/adl;->d([BI)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 249
    :cond_0
    return-void
.end method

.method public d(II)V
    .locals 8

    .line 257
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------onUpgradeResult-------result\uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mIsUpgradeOtaAndBle: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adp;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->m:I

    .line 259
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "upgrade type is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adp;->e:Lo/adp$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lo/adp;->c:J

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "ms"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-boolean v0, p0, Lo/adp;->o:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 262
    iget v0, p0, Lo/adp;->g:I

    iput v0, p0, Lo/adp;->m:I

    .line 263
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adp;->o:Z

    .line 266
    sget-object v0, Lo/adp$e;->d:Lo/adp$e;

    iput-object v0, p0, Lo/adp;->e:Lo/adp$e;

    .line 267
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget v1, p0, Lo/adp;->n:I

    iget-byte v2, p0, Lo/adp;->l:B

    const/4 v3, 0x1

    invoke-static {v3, v1, v2}, Lo/adl;->d(IIB)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 270
    :cond_0
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    invoke-static {}, Lo/adl;->e()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 272
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 273
    const/4 v0, 0x2

    iput v0, v7, Landroid/os/Message;->what:I

    .line 274
    iput p1, v7, Landroid/os/Message;->arg1:I

    .line 275
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 277
    :goto_0
    return-void
.end method

.method public d(I[BLjava/lang/Object;)V
    .locals 8

    .line 459
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 461
    :pswitch_0
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----ota pkg response----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    const/4 v4, 0x0

    .line 465
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 466
    const-string v0, "pkgNo"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 467
    const-string v0, "result"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 468
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json object pkgNo: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    invoke-virtual {p0, v5, v6}, Lo/adp;->c(IZ)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 472
    goto/16 :goto_2

    .line 470
    :catch_0
    move-exception v5

    .line 471
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json analysis fail. error msg: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    goto/16 :goto_2

    .line 476
    :pswitch_1
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ota result..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    const/4 v5, 0x0

    .line 479
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 480
    const-string v0, "type"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 481
    const-string v0, "result"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 482
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----------ota update result ----------- type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-virtual {p0, v7, v6}, Lo/adp;->d(II)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 486
    goto/16 :goto_2

    .line 484
    :catch_1
    move-exception v6

    .line 485
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json analysis fail. error msg: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    goto/16 :goto_2

    .line 489
    :pswitch_2
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---OTA readied---"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    const/4 v0, 0x3

    aget-byte v0, p2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lo/adp;->a(Z)V

    .line 491
    goto :goto_2

    .line 493
    :pswitch_3
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---TYPE_SHA256PKG1--- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    invoke-virtual {p0}, Lo/adp;->b()V

    .line 495
    goto :goto_2

    .line 497
    :pswitch_4
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---TYPE_SHA256PKG2--- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-virtual {p0}, Lo/adp;->d()V

    .line 499
    goto :goto_2

    .line 501
    :goto_1
    :pswitch_5
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 168
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "scalePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   blePath  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->i:I

    .line 170
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->f:I

    .line 171
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->k:I

    .line 172
    const/4 v0, 0x0

    iput v0, p0, Lo/adp;->m:I

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/adp;->o:Z

    .line 175
    invoke-static {p1}, Lo/adp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 176
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 178
    const/4 v0, 0x2

    iput v0, v5, Landroid/os/Message;->what:I

    .line 179
    const/4 v0, 0x2

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 180
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 181
    return-void

    .line 183
    :cond_0
    invoke-static {v4}, Lo/adm;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/adp;->s:[B

    .line 184
    const/16 v0, 0x20

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adm;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/adp;->t:[B

    .line 186
    invoke-static {p2}, Lo/adp;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 187
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 189
    const/4 v0, 0x2

    iput v0, v6, Landroid/os/Message;->what:I

    .line 190
    const/4 v0, 0x2

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 191
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 192
    return-void

    .line 194
    :cond_1
    invoke-static {v5}, Lo/adm;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/adp;->q:[B

    .line 195
    const/16 v0, 0x20

    invoke-virtual {v5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adm;->d(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/adp;->u:[B

    .line 197
    sget-object v0, Lo/adp$e;->e:Lo/adp$e;

    iput-object v0, p0, Lo/adp;->e:Lo/adp$e;

    .line 198
    const/4 v0, 0x2

    iput v0, p0, Lo/adp;->h:I

    .line 199
    invoke-direct {p0, p1, p2}, Lo/adp;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/adp;->o:Z

    .line 202
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    invoke-virtual {v0}, Lo/adn;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ota is connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget v1, p0, Lo/adp;->h:I

    iget v2, p0, Lo/adp;->g:I

    iget-byte v3, p0, Lo/adp;->p:B

    invoke-static {v1, v2, v3}, Lo/adl;->d(IIB)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 206
    :cond_2
    const-string v0, "WeightScalesUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no connect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :goto_0
    iget-object v0, p0, Lo/adp;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/adp;->v:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 209
    return-void
.end method
