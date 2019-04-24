.class public Lo/coe;
.super Lo/cof;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/coe$e;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/cof;-><init>()V

    .line 38
    return-void
.end method

.method synthetic constructor <init>(Lo/coe$4;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/coe;-><init>()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 54
    const-string v0, "config_data"

    invoke-static {v0}, Lo/cps;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 61
    const-string v0, "configdataIndex"

    const-string v1, "config_data"

    invoke-static {v0, v1}, Lo/cps;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/coe;
    .locals 1

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/coe;->b:Landroid/content/Context;

    .line 42
    sget-object v0, Lo/coe$e;->c:Lo/coe;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 22
    invoke-super {p0}, Lo/cof;->a()V

    return-void
.end method

.method public a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 5

    .line 138
    :try_start_0
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 139
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 140
    invoke-virtual {v4, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 146
    :cond_0
    goto :goto_0

    .line 142
    :catch_0
    move-exception v4

    .line 143
    const-string v0, "Debug_DBConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    goto :goto_0

    .line 144
    :catch_1
    move-exception v4

    .line 145
    const-string v0, "Debug_DBConfigData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 22
    invoke-super {p0, p1, p2}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 22
    invoke-super/range {p0 .. p5}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 22
    invoke-super/range {p0 .. p6}, Lo/cof;->b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 94
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v1

    .line 95
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 96
    invoke-virtual {v1, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0

    .line 98
    :cond_0
    const/16 v0, -0x3e8

    return v0
.end method

.method public bridge synthetic c(Landroid/content/ContentValues;)J
    .locals 2

    .line 22
    invoke-super {p0, p1}, Lo/cof;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    .line 112
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v8

    .line 113
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 114
    move-object v0, v8

    move-object v1, p1

    invoke-virtual {p0}, Lo/coe;->d()[Ljava/lang/String;

    move-result-object v2

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0

    .line 116
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 69
    const-string v0, "config_data"

    return-object v0
.end method

.method public bridge synthetic d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 22
    invoke-super {p0, p1, p2, p3}, Lo/cof;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;Landroid/content/ContentValues;)J
    .locals 3

    .line 86
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v2

    .line 87
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 88
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0

    .line 90
    :cond_0
    const-wide/16 v0, -0x3e8

    return-wide v0
.end method

.method protected d()[Ljava/lang/String;
    .locals 1

    .line 74
    invoke-static {}, Lo/cps;->d()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2

    .line 103
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v1

    .line 104
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 105
    invoke-virtual {v1, p1, p2, p3, p4}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0

    .line 107
    :cond_0
    const/16 v0, -0x3e8

    return v0
.end method

.method public e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 129
    sget-object v0, Lo/coe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v1

    .line 130
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 131
    invoke-virtual {v1, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    return-object v0

    .line 133
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
