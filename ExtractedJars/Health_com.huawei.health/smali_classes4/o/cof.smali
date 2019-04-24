.class abstract Lo/cof;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static b:Landroid/content/Context;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DELETE FROM  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 49
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v5

    .line 50
    if-eqz v5, :cond_0

    .line 51
    invoke-virtual {v5, v4}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 57
    :cond_0
    goto :goto_0

    .line 53
    :catch_0
    move-exception v5

    .line 54
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    goto :goto_0

    .line 55
    :catch_1
    move-exception v5

    .line 56
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 5

    .line 177
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 178
    if-eqz v4, :cond_0

    .line 179
    invoke-virtual {v4, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 185
    :cond_0
    goto :goto_0

    .line 181
    :catch_0
    move-exception v4

    .line 182
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    goto :goto_0

    .line 183
    :catch_1
    move-exception v4

    .line 184
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClearAllInfo Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 5

    .line 94
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 95
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 96
    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 104
    :cond_0
    goto :goto_0

    .line 98
    :catch_0
    move-exception v4

    .line 99
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/16 v0, -0x3e9

    return v0

    .line 101
    :catch_1
    move-exception v4

    .line 102
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/16 v0, -0x3e9

    return v0

    .line 105
    :goto_0
    const/16 v0, -0x3e8

    return v0
.end method

.method public b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    .line 128
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v8

    .line 129
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 130
    move-object v0, v8

    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lo/cof;->d()[Ljava/lang/String;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 138
    :cond_0
    goto :goto_0

    .line 132
    :catch_0
    move-exception v8

    .line 133
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x0

    return-object v0

    .line 135
    :catch_1
    move-exception v8

    .line 136
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v0, 0x0

    return-object v0

    .line 139
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    .line 145
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v8

    .line 146
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 147
    move-object v0, v8

    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 155
    :cond_0
    goto :goto_0

    .line 149
    :catch_0
    move-exception v8

    .line 150
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryEX SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v0, 0x0

    return-object v0

    .line 152
    :catch_1
    move-exception v8

    .line 153
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryEX Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    return-object v0

    .line 156
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Landroid/content/ContentValues;)J
    .locals 5

    .line 78
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 79
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 80
    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    return-wide v0

    .line 88
    :cond_0
    goto :goto_0

    .line 82
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const-wide/16 v0, -0x3e9

    return-wide v0

    .line 85
    :catch_1
    move-exception v4

    .line 86
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const-wide/16 v0, -0x3e9

    return-wide v0

    .line 89
    :goto_0
    const-wide/16 v0, -0x3e8

    return-wide v0
.end method

.method protected abstract c()Ljava/lang/String;
.end method

.method public d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 5

    .line 111
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 112
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 113
    invoke-virtual {p0}, Lo/cof;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    return v0

    .line 121
    :cond_0
    goto :goto_0

    .line 115
    :catch_0
    move-exception v4

    .line 116
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/16 v0, -0x3e9

    return v0

    .line 118
    :catch_1
    move-exception v4

    .line 119
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/16 v0, -0x3e9

    return v0

    .line 122
    :goto_0
    const/16 v0, -0x3e8

    return v0
.end method

.method protected abstract d()[Ljava/lang/String;
.end method

.method public e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 5

    .line 161
    :try_start_0
    sget-object v0, Lo/cof;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->d()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v4

    .line 162
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 163
    invoke-virtual {v4, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 171
    :cond_0
    goto :goto_0

    .line 165
    :catch_0
    move-exception v4

    .line 166
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rawQuery SQLiteException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    return-object v0

    .line 168
    :catch_1
    move-exception v4

    .line 169
    const-string v0, "HiH_DBCommon"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rawQuery Exception!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const/4 v0, 0x0

    return-object v0

    .line 172
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
