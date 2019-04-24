.class final Lo/bbv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/sqlcipher/database/SQLiteDatabaseHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbv;->c(Landroid/content/Context;)Lo/bbv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public postKey(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 5

    .line 165
    :try_start_0
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    const-string v0, "PRAGMA cipher_migrate;"

    invoke-virtual {p1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->rawExecSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 172
    :cond_0
    goto :goto_0

    .line 168
    :catch_0
    move-exception v4

    .line 169
    const-string v0, "SNSSQLiteOpenHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hook sqliteexception e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    goto :goto_0

    .line 170
    :catch_1
    move-exception v4

    .line 171
    const-string v0, "SNSSQLiteOpenHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hook exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :goto_0
    return-void
.end method

.method public preKey(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 0

    .line 161
    return-void
.end method
