.class public Lo/dco;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:[B

.field private static c:Ljava/lang/String;

.field private static d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/dco;>;"
        }
    .end annotation
.end field


# instance fields
.field private e:Lnet/sqlcipher/database/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const-string v0, ""

    sput-object v0, Lo/dco;->a:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dco;->d:Ljava/util/Map;

    .line 62
    const/4 v0, 0x1

    new-array v0, v0, [B

    sput-object v0, Lo/dco;->b:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 6

    .line 127
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    const/4 v3, 0x0

    const/16 v4, 0x66

    invoke-direct/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 129
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Lo/dco;
    .locals 8

    .line 73
    sget-object v4, Lo/dco;->b:[B

    monitor-enter v4

    .line 74
    :try_start_0
    sget-object v0, Lo/dco;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    const/16 v0, 0xe

    :try_start_1
    invoke-static {v0}, Lo/def;->b(I)[B

    move-result-object v5

    .line 78
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 79
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v5, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v0, Lo/dco;->c:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    :cond_0
    goto :goto_0

    .line 82
    :catch_0
    move-exception v5

    .line 83
    const-string v0, "SubstituteDataBaseHelper"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UnsupportedEncodingException"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :catch_1
    move-exception v5

    .line 86
    const-string v0, "SubstituteDataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get Key Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :cond_1
    :goto_0
    sget-object v0, Lo/dco;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 91
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 92
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dco;->a:Ljava/lang/String;

    .line 93
    sget-object v0, Lo/dco;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    const-string v0, "SubstituteSportDatas.db"

    sput-object v0, Lo/dco;->a:Ljava/lang/String;

    goto :goto_1

    .line 96
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/dco;->a:Ljava/lang/String;

    const-string v2, "\\."

    const-string v3, "_"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Sub"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dco;->a:Ljava/lang/String;

    .line 98
    :goto_1
    new-instance v5, Lo/dco$3;

    invoke-direct {v5}, Lo/dco$3;-><init>()V

    .line 114
    new-instance v6, Lo/dco;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dco;->a:Ljava/lang/String;

    invoke-direct {v6, v0, v1, v5}, Lo/dco;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 115
    sget-object v0, Lo/dco;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    :cond_3
    sget-object v0, Lo/dco;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dco;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    return-object v0

    .line 118
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method


# virtual methods
.method public d()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 6

    .line 137
    sget-object v4, Lo/dco;->b:[B

    monitor-enter v4

    .line 139
    :try_start_0
    iget-object v0, p0, Lo/dco;->e:Lnet/sqlcipher/database/SQLiteDatabase;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 140
    iget-object v0, p0, Lo/dco;->e:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 143
    :cond_0
    :try_start_1
    sget-object v0, Lo/dco;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    const-string v0, "SubstituteDataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_1
    const-string v0, "SubstituteDataBaseHelper"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy maha:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dco;->c:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    sget-object v0, Lo/dco;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/dco;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lo/dco;->e:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 149
    iget-object v0, p0, Lo/dco;->e:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    return-object v0

    .line 151
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 0

    .line 168
    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 0

    .line 172
    return-void
.end method
