.class public Lo/dcq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/dcq;

.field private static final b:[Ljava/lang/String;

.field private static e:Landroid/content/Context;


# instance fields
.field private c:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 25
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "key"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/dcq;->b:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter KeyValDbManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/dcq;->e:Landroid/content/Context;

    .line 43
    const-string v0, "module_200007_keyvaldb"

    invoke-static {v0}, Lo/dcr;->c(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lo/dcq;->c:Landroid/net/Uri;

    .line 44
    return-void
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    .line 23
    sget-object v0, Lo/dcq;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lo/dcq;)Landroid/net/Uri;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/dcq;->c:Landroid/net/Uri;

    return-object v0
.end method

.method static synthetic a(Lo/dcx;Lo/ddb;)V
    .locals 0

    .line 23
    invoke-static {p0, p1}, Lo/dcq;->e(Lo/dcx;Lo/ddb;)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dcq;
    .locals 4

    .line 30
    sget-object v0, Lo/dcq;->a:Lo/dcq;

    if-nez v0, :cond_1

    .line 31
    const-class v2, Lo/dcq;

    monitor-enter v2

    .line 32
    :try_start_0
    sget-object v0, Lo/dcq;->a:Lo/dcq;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lo/dcq;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dcq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dcq;->a:Lo/dcq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 37
    :cond_1
    :goto_0
    sget-object v0, Lo/dcq;->a:Lo/dcq;

    return-object v0
.end method

.method private static e(Lo/dcx;Lo/ddb;)V
    .locals 1

    .line 118
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 119
    invoke-interface {p0, p1}, Lo/dcx;->onProcessed(Lo/ddb;)V

    .line 121
    :cond_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 49
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getValue, key is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    const-string v7, "key = ?"

    .line 53
    const/4 v0, 0x1

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v8, v0

    .line 54
    const/4 v9, 0x0

    .line 56
    :try_start_0
    sget-object v0, Lo/dcq;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lo/dcq;->c:Landroid/net/Uri;

    sget-object v2, Lo/dcq;->b:[Ljava/lang/String;

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 57
    if-eqz v9, :cond_2

    .line 58
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 61
    :cond_1
    invoke-interface {v9}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    :cond_2
    if-eqz v9, :cond_4

    .line 69
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 63
    :catch_0
    move-exception v10

    .line 64
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryStorage error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    if-eqz v9, :cond_4

    .line 69
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 65
    :catch_1
    move-exception v10

    .line 66
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryStorage Exception error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

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

    .line 68
    if-eqz v9, :cond_4

    .line 69
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 68
    :catchall_0
    move-exception v11

    if-eqz v9, :cond_3

    .line 69
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 71
    :cond_3
    throw v11

    .line 74
    :cond_4
    :goto_0
    return-object v6
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 78
    const-string v0, "VersionDbManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setValue, key="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", value="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {}, Lo/eeq;->b()Lo/eeq;

    move-result-object v0

    new-instance v1, Lo/dcq$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/dcq$2;-><init>(Lo/dcq;Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    invoke-virtual {v0, v1}, Lo/eeq;->e(Ljava/lang/Runnable;)V

    .line 115
    return-void
.end method
