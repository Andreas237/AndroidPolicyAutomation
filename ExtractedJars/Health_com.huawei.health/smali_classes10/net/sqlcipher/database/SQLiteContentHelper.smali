.class public Lnet/sqlcipher/database/SQLiteContentHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBlobColumnAsAssetFile(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 50
    const/4 v6, 0x0

    .line 53
    :try_start_0
    invoke-static {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteContentHelper;->simpleQueryForBlobMemoryFile(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/os/MemoryFile;

    move-result-object v7

    .line 54
    if-nez v7, :cond_0

    .line 55
    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "No results."

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v8

    .line 59
    const-string v0, "getParcelFileDescriptor"

    const/4 v1, 0x0

    :try_start_1
    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v8, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 60
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 61
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v9, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/ParcelFileDescriptor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v0

    .line 64
    goto :goto_0

    .line 62
    :catch_0
    move-exception v9

    .line 63
    const-string v0, "SQLiteContentHelper"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SQLiteCursor.java: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    :goto_0
    new-instance v0, Landroid/content/res/AssetFileDescriptor;

    move-object v1, v6

    invoke-virtual {v7}, Landroid/os/MemoryFile;->length()I

    move-result v2

    int-to-long v4, v2

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/content/res/AssetFileDescriptor;-><init>(Landroid/os/ParcelFileDescriptor;JJ)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v9, v0

    .line 66
    return-object v9

    .line 67
    :catch_1
    move-exception v7

    .line 68
    new-instance v0, Ljava/io/FileNotFoundException;

    invoke-virtual {v7}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static simpleQueryForBlobMemoryFile(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)Landroid/os/MemoryFile;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    invoke-virtual {p0, p1, p2}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v3

    .line 85
    if-nez v3, :cond_0

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 89
    :cond_0
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 90
    const/4 v4, 0x0

    .line 102
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v4

    .line 92
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 93
    if-nez v4, :cond_2

    .line 94
    const/4 v5, 0x0

    .line 102
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v5

    .line 96
    :cond_2
    :try_start_2
    new-instance v5, Landroid/os/MemoryFile;

    array-length v0, v4

    const/4 v1, 0x0

    invoke-direct {v5, v1, v0}, Landroid/os/MemoryFile;-><init>(Ljava/lang/String;I)V

    .line 97
    array-length v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v5, v4, v1, v2, v0}, Landroid/os/MemoryFile;->writeBytes([BIII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    move-object v6, v5

    .line 102
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v6

    :catchall_0
    move-exception v7

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    throw v7
.end method
