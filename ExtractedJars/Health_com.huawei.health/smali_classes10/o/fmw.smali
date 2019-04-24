.class public final Lo/fmw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmw$b;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;

.field private static e:Lo/fmw;


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fna;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Properties;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Lo/fmw;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fmw;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/fmw;->c:Ljava/util/List;

    .line 326
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iput-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    .line 327
    invoke-static {p0}, Lo/fmy;->b(Lo/fmw;)V

    .line 328
    return-void
.end method

.method public static a()Lo/fmw;
    .locals 4

    .line 223
    const-class v2, Lo/fmw;

    monitor-enter v2

    .line 224
    :try_start_0
    sget-object v0, Lo/fmw;->e:Lo/fmw;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ljava/io/File;

    const-string v1, "Californium.properties"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/fmw;->a(Ljava/io/File;)Lo/fmw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 227
    :goto_0
    sget-object v0, Lo/fmw;->e:Lo/fmw;

    return-object v0
.end method

.method public static a(Ljava/io/File;)Lo/fmw;
    .locals 2

    .line 294
    const-string v0, "Californium CoAP Properties file"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/fmw;->c(Ljava/io/File;Ljava/lang/String;Lo/fmz;)Lo/fmw;

    move-result-object v0

    sput-object v0, Lo/fmw;->e:Lo/fmw;

    .line 295
    sget-object v0, Lo/fmw;->e:Lo/fmw;

    return-object v0
.end method

.method public static c(Ljava/io/File;Ljava/lang/String;Lo/fmz;)Lo/fmw;
    .locals 2

    .line 309
    new-instance v1, Lo/fmw;

    invoke-direct {v1}, Lo/fmw;-><init>()V

    .line 310
    if-eqz p2, :cond_0

    .line 311
    invoke-interface {p2, v1}, Lo/fmz;->c(Lo/fmw;)V

    .line 313
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    invoke-virtual {v1, p0}, Lo/fmw;->e(Ljava/io/File;)V

    goto :goto_0

    .line 316
    :cond_1
    invoke-virtual {v1, p0, p1}, Lo/fmw;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 318
    :goto_0
    return-object v1
.end method

.method private e(Lo/fmw$b;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lo/fmw$b<TT;>;Ljava/lang/String;TT;)TT;"
        }
    .end annotation

    .line 541
    move-object v5, p3

    .line 542
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 543
    if-eqz v6, :cond_0

    .line 545
    :try_start_0
    invoke-interface {p1, v6}, Lo/fmw$b;->d(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 549
    goto :goto_0

    .line 546
    :catch_0
    move-exception v7

    .line 547
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "value for key [{}] is not a {0}, returning default value"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    goto :goto_0

    .line 551
    :cond_0
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "key [{}] is undefined, returning default value"

    invoke-interface {v0, v1, p2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 553
    :goto_0
    return-object v5
.end method


# virtual methods
.method public a(Ljava/lang/String;)F
    .locals 1

    .line 487
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->a(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;F)F
    .locals 2

    .line 500
    new-instance v0, Lo/fmw$3;

    invoke-direct {v0, p0}, Lo/fmw$3;-><init>(Lo/fmw;)V

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lo/fmw;->e(Lo/fmw$b;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;I)Lo/fmw;
    .locals 1

    .line 617
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;J)Lo/fmw;
    .locals 1

    .line 628
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/io/File;Ljava/lang/String;)V
    .locals 10

    .line 381
    if-nez p1, :cond_0

    .line 382
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "file must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 384
    :cond_0
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "writing properties to file {}"

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 385
    :try_start_0
    new-instance v5, Ljava/io/FileWriter;

    invoke-direct {v5, p1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v6, 0x0

    .line 386
    :try_start_1
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, v5, p2}, Ljava/util/Properties;->store(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 387
    if-eqz v5, :cond_3

    nop

    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileWriter;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 385
    :catch_0
    move-exception v7

    move-object v6, v7

    :try_start_3
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 387
    :catchall_0
    move-exception v8

    if-eqz v5, :cond_2

    if-eqz v6, :cond_1

    :try_start_4
    invoke-virtual {v5}, Ljava/io/FileWriter;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    :catch_1
    move-exception v9

    :try_start_5
    invoke-virtual {v6, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Ljava/io/FileWriter;->close()V

    :cond_2
    :goto_0
    throw v8
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 390
    :cond_3
    :goto_1
    goto :goto_2

    .line 387
    :catch_2
    move-exception v5

    .line 388
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "cannot write properties to file {}: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    :goto_2
    return-void
.end method

.method public b(Ljava/lang/String;J)J
    .locals 2

    .line 469
    new-instance v0, Lo/fmw$2;

    invoke-direct {v0, p0}, Lo/fmw$2;-><init>(Lo/fmw;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lo/fmw;->e(Lo/fmw$b;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 414
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 415
    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;
    .locals 4

    .line 585
    if-nez p1, :cond_0

    .line 586
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "key must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 587
    :cond_0
    if-nez p2, :cond_1

    .line 588
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "value must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 590
    :cond_1
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    iget-object v0, p0, Lo/fmw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fna;

    .line 592
    invoke-interface {v3, p1, p2}, Lo/fna;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 593
    goto :goto_0

    .line 594
    :cond_2
    return-object p0
.end method

.method public b(Ljava/lang/String;)Z
    .locals 3

    .line 563
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 564
    if-eqz v2, :cond_0

    .line 565
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 567
    :cond_0
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "Key [{}] is undefined"

    invoke-interface {v0, v1, p1}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 568
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;I)I
    .locals 2

    .line 439
    new-instance v0, Lo/fmw$4;

    invoke-direct {v0, p0}, Lo/fmw$4;-><init>(Lo/fmw;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lo/fmw;->e(Lo/fmw$b;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/String;)J
    .locals 2

    .line 456
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lo/fmw;->b(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 357
    if-nez p1, :cond_0

    .line 358
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "input stream must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 360
    :cond_0
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 361
    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 402
    iget-object v0, p0, Lo/fmw;->d:Ljava/util/Properties;

    invoke-virtual {v0, p1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lo/fmw;
    .locals 1

    .line 606
    invoke-virtual {p0, p1, p2}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)I
    .locals 1

    .line 426
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->c(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;F)Lo/fmw;
    .locals 1

    .line 639
    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Z)Lo/fmw;
    .locals 1

    .line 661
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/Object;)Lo/fmw;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/io/File;)V
    .locals 10

    .line 337
    if-nez p1, :cond_0

    .line 338
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "file must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_0
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "loading properties from file {}"

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 341
    :try_start_0
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v6, 0x0

    .line 342
    :try_start_1
    invoke-virtual {p0, v5}, Lo/fmw;->c(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 343
    if-eqz v5, :cond_3

    nop

    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 341
    :catch_0
    move-exception v7

    move-object v6, v7

    :try_start_3
    throw v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 343
    :catchall_0
    move-exception v8

    if-eqz v5, :cond_2

    if-eqz v6, :cond_1

    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    :catch_1
    move-exception v9

    :try_start_5
    invoke-virtual {v6, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    :cond_2
    :goto_0
    throw v8
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 346
    :cond_3
    :goto_1
    goto :goto_2

    .line 343
    :catch_2
    move-exception v5

    .line 344
    sget-object v0, Lo/fmw;->a:Lo/fty;

    const-string v1, "cannot load properties from file {}: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    :goto_2
    return-void
.end method
