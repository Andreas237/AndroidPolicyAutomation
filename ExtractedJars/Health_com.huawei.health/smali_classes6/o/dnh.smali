.class public Lo/dnh;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static a:Lo/dnh;

.field private static b:Ljava/lang/String;


# instance fields
.field private c:Lnet/sqlcipher/database/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-string v0, ""

    sput-object v0, Lo/dnh;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "healthlabel_9000.db"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    invoke-direct {p0, v0, v1, v2, v3}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;I)V

    .line 30
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lo/dnh;
    .locals 6

    const-class v5, Lo/dnh;

    monitor-enter v5

    .line 33
    :try_start_0
    sget-object v0, Lo/dnh;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    const/16 v0, 0xe

    :try_start_1
    invoke-static {v0}, Lo/def;->b(I)[B

    move-result-object v4

    .line 36
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 37
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v0, Lo/dnh;->b:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :cond_0
    goto :goto_0

    .line 39
    :catch_0
    move-exception v4

    .line 40
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UnsupportedEncodingException"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :catch_1
    move-exception v4

    .line 43
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Key Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :cond_1
    :goto_0
    sget-object v0, Lo/dnh;->a:Lo/dnh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 48
    invoke-static {p0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 49
    new-instance v0, Lo/dnh;

    invoke-direct {v0, p0}, Lo/dnh;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dnh;->a:Lo/dnh;

    .line 51
    :cond_2
    sget-object v0, Lo/dnh;->a:Lo/dnh;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v5

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method


# virtual methods
.method public declared-synchronized c()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 7

    monitor-enter p0

    .line 55
    :try_start_0
    const-class v4, Lo/dnh;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    :try_start_1
    iget-object v0, p0, Lo/dnh;->c:Lnet/sqlcipher/database/SQLiteDatabase;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/dnh;->c:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 60
    :cond_0
    :try_start_2
    sget-object v0, Lo/dnh;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_1
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy maha:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dnh;->b:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    sget-object v0, Lo/dnh;->b:Ljava/lang/String;

    invoke-super {p0, v0}, Lnet/sqlcipher/database/SQLiteOpenHelper;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lo/dnh;->c:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 66
    iget-object v0, p0, Lo/dnh;->c:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_3
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 68
    :catch_0
    move-exception v5

    .line 69
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 71
    :catch_1
    move-exception v5

    .line 72
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy Exception3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 73
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 75
    :catchall_0
    move-exception v6

    monitor-exit v4

    :try_start_6
    throw v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 4

    .line 80
    const-string v0, "UserLabelDBHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {}, Lo/dni;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 0

    .line 87
    return-void
.end method
