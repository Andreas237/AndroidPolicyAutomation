.class public Lo/dcl;
.super Lnet/sqlcipher/database/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/dcl;>;"
        }
    .end annotation
.end field

.field private static e:Ljava/lang/String;

.field private static f:I

.field private static h:I

.field private static i:I

.field private static k:Ljava/lang/String;


# instance fields
.field private b:Lnet/sqlcipher/database/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const-string v0, ""

    sput-object v0, Lo/dcl;->c:Ljava/lang/String;

    .line 66
    const-string v0, ""

    sput-object v0, Lo/dcl;->e:Ljava/lang/String;

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dcl;->d:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V
    .locals 6

    .line 160
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    const/4 v3, 0x0

    const/16 v4, 0x6d

    invoke-direct/range {v0 .. v5}, Lnet/sqlcipher/database/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 161
    return-void
.end method

.method public static declared-synchronized c(Ljava/lang/String;)I
    .locals 5

    const-class v4, Lo/dcl;

    monitor-enter v4

    .line 172
    const/4 v1, 0x0

    .line 173
    const/16 v0, 0x4e23

    :try_start_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 174
    const/16 v0, 0x4e25

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 175
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    sget v1, Lo/dcl;->f:I

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    sget v1, Lo/dcl;->i:I

    goto :goto_0

    .line 180
    :cond_1
    sget v1, Lo/dcl;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    :goto_0
    monitor-exit v4

    return v1

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method public static declared-synchronized c(I)V
    .locals 1

    const-class v0, Lo/dcl;

    monitor-enter v0

    .line 168
    :try_start_0
    sput p0, Lo/dcl;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized d()I
    .locals 3

    const-class v1, Lo/dcl;

    monitor-enter v1

    .line 164
    :try_start_0
    sget v0, Lo/dcl;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static declared-synchronized d(I)V
    .locals 4

    const-class v3, Lo/dcl;

    monitor-enter v3

    .line 186
    const/16 v0, 0x4e23

    :try_start_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 187
    const/16 v0, 0x4e25

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 188
    sget-object v0, Lo/dcl;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    sput p0, Lo/dcl;->f:I

    goto :goto_0

    .line 190
    :cond_0
    sget-object v0, Lo/dcl;->e:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    sput p0, Lo/dcl;->i:I

    goto :goto_0

    .line 193
    :cond_1
    sput p0, Lo/dcl;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :goto_0
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method private d(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 312
    const-string v2, "select sql from sqlite_master where type = \'table\' and name = \'%s\'"

    .line 313
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 314
    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v3

    .line 315
    const/4 v4, 0x0

    .line 317
    if-eqz v3, :cond_0

    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    const-string v0, "sql"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 321
    :cond_0
    if-eqz v3, :cond_2

    .line 322
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 321
    :catchall_0
    move-exception v5

    if-eqz v3, :cond_1

    .line 322
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 324
    :cond_1
    throw v5

    .line 325
    :cond_2
    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 326
    const/4 v0, 0x1

    return v0

    .line 328
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static declared-synchronized e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;
    .locals 7

    const-class v6, Lo/dcl;

    monitor-enter v6

    .line 105
    :try_start_0
    sput-object p0, Lo/dcl;->a:Landroid/content/Context;

    .line 106
    sput-object p1, Lo/dcl;->e:Ljava/lang/String;

    .line 107
    sget-object v0, Lo/dcl;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    const/16 v0, 0xe

    :try_start_1
    invoke-static {v0}, Lo/def;->b(I)[B

    move-result-object v4

    .line 110
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 111
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v4, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    sput-object v0, Lo/dcl;->k:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    :cond_0
    goto :goto_0

    .line 113
    :catch_0
    move-exception v4

    .line 114
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UnsupportedEncodingException"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :catch_1
    move-exception v4

    .line 117
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Key Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    :cond_1
    :goto_0
    sget-object v0, Lo/dcl;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 122
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/dcl;->a:Landroid/content/Context;

    .line 124
    sget-object v0, Lo/dcl;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;)V

    .line 125
    sget-object v0, Lo/dcl;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dcl;->c:Ljava/lang/String;

    .line 126
    sget-object v0, Lo/dcl;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    const-string v0, "SportDatas.db"

    sput-object v0, Lo/dcl;->c:Ljava/lang/String;

    goto :goto_1

    .line 129
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/dcl;->c:Ljava/lang/String;

    const-string v2, "\\."

    const-string v3, "_"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".db"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dcl;->c:Ljava/lang/String;

    .line 131
    :goto_1
    new-instance v4, Lo/dcl$4;

    invoke-direct {v4}, Lo/dcl$4;-><init>()V

    .line 147
    new-instance v5, Lo/dcl;

    sget-object v0, Lo/dcl;->a:Landroid/content/Context;

    sget-object v1, Lo/dcl;->c:Ljava/lang/String;

    invoke-direct {v5, v0, v1, v4}, Lo/dcl;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabaseHook;)V

    .line 148
    sget-object v0, Lo/dcl;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    :cond_3
    sget-object v0, Lo/dcl;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dcl;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v6

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v6

    throw p0
.end method


# virtual methods
.method public declared-synchronized b()Lnet/sqlcipher/database/SQLiteDatabase;
    .locals 8

    monitor-enter p0

    .line 213
    :try_start_0
    const-class v4, Lo/dcl;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 215
    :try_start_1
    iget-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 216
    iget-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_1
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 218
    :cond_0
    :try_start_2
    sget-object v0, Lo/dcl;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 220
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 222
    :cond_1
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy maha:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/dcl;->k:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    sget-object v0, Lo/dcl;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/dcl;->getWritableDatabase(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 224
    iget-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_3
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 226
    :catch_0
    move-exception v5

    .line 227
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 229
    :try_start_5
    sget-object v0, Lo/dcl;->a:Landroid/content/Context;

    sget-object v1, Lo/dcl;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dco;->c(Landroid/content/Context;Ljava/lang/String;)Lo/dco;

    move-result-object v0

    invoke-virtual {v0}, Lo/dco;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 230
    iget-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v4

    monitor-exit p0

    return-object v0

    .line 231
    :catch_1
    move-exception v6

    .line 232
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy Exception2 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 233
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 235
    :catch_2
    move-exception v5

    .line 236
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "xxxxyyy Exception3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 237
    monitor-exit v4

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 239
    :catchall_0
    move-exception v7

    monitor-exit v4

    :try_start_8
    throw v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_1
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method public declared-synchronized c()V
    .locals 3

    monitor-enter p0

    .line 246
    :try_start_0
    iget-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 247
    invoke-virtual {p0}, Lo/dcl;->b()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lo/dcl;->b:Lnet/sqlcipher/database/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 0

    .line 256
    return-void
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 7

    .line 260
    const-class v4, Lo/dcl;

    monitor-enter v4

    .line 261
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onUpgrade enter oldVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",newVersion"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",dbName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dcl;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    invoke-static {p2}, Lo/dcl;->c(I)V

    .line 263
    invoke-static {p2}, Lo/dcl;->d(I)V

    .line 264
    const/16 v0, 0x65

    if-ne v0, p2, :cond_1

    const-string v0, "com_huawei_bone8.db"

    sget-object v1, Lo/dcl;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 266
    const-string v0, "select name from sqlite_master where type=\'table\' order by name"

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p1, v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v5

    .line 267
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "table name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v5, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 270
    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 271
    const-string v0, "ALTER TABLE module_8_event_alarm RENAME TO module_8_event_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 272
    const-string v0, "CREATE TABLE IF NOT EXISTS module_8_event_alarm(event_alarm_index integer,event_alarm_enable integer,event_alarm_time varchar(50),event_alarm_cycle integer,event_alarm_name varchar(50),User_ID varchar(50))"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 273
    const-string v0, "insert into module_8_event_alarm(event_alarm_index,event_alarm_enable,event_alarm_time,event_alarm_cycle,event_alarm_name,User_ID) select event_alarm_index,event_alarm_enable,event_alarm_time,event_alarm_cycle,event_alarm_name,User_ID from module_8_event_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 274
    const-string v0, "DROP TABLE IF EXISTS module_8_event_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 277
    const-string v0, "ALTER TABLE module_8_smart_alarm RENAME TO module_8_smart_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 278
    const-string v0, "CREATE TABLE IF NOT EXISTS module_8_smart_alarm(smart_alarm_index integer,smart_alarm_enable integer,smart_alarm_time varchar(50),smart_alarm_cycle integer,smart_alarm_ahead_time integer,User_ID varchar(50))"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 279
    const-string v0, "insert into module_8_smart_alarm(smart_alarm_index,smart_alarm_enable,smart_alarm_time,smart_alarm_cycle,smart_alarm_ahead_time,User_ID) select     smart_alarm_index,smart_alarm_enable,smart_alarm_time,smart_alarm_cycle,smart_alarm_ahead_time,User_ID from module_8_smart_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 280
    const-string v0, "DROP TABLE IF EXISTS module_8_smart_alarm_temp"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 281
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "alarm db upgrade"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    goto :goto_1

    .line 282
    :catch_0
    move-exception v5

    .line 283
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade SQLiteException e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    goto :goto_1

    .line 284
    :catch_1
    move-exception v5

    .line 285
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade Exception e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    :cond_1
    :goto_1
    const/16 v0, 0x6d

    if-ge p2, v0, :cond_3

    const-string v0, "com_huawei_health10033.db"

    sget-object v1, Lo/dcl;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 290
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade device_db WiFi dvice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const-string v0, "module_10033_WiFiBindDevice"

    const-string v1, "mac"

    invoke-direct {p0, p1, v0, v1}, Lo/dcl;->d(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 293
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade device_db WiFi dvice isHas;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    if-nez v5, :cond_2

    .line 295
    const-string v0, "alter table module_10033_WiFiBindDevice add mac TEXT end"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 299
    :cond_2
    goto :goto_2

    .line 297
    :catch_2
    move-exception v5

    .line 298
    const-string v0, "DataBaseHelper"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgrade device_db Exception e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 301
    :cond_3
    :goto_2
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 302
    :goto_3
    return-void
.end method
