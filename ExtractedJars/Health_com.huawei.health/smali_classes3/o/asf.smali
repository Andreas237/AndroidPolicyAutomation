.class public final Lo/asf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Landroid/net/Uri;

.field private static final e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "mimetype"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "data12"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/asf;->e:[Ljava/lang/String;

    .line 35
    sget-object v0, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    sput-object v0, Lo/asf;->d:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 4

    .line 51
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "priority"

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "timestamp"

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    .line 51
    return-object v0
.end method

.method private static a(Landroid/graphics/Bitmap;)[B
    .locals 2

    .line 184
    if-eqz p0, :cond_0

    .line 186
    const/16 v0, 0x60

    const/16 v1, 0x60

    invoke-static {p0, v0, v1}, Lo/boe;->b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 188
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p0, v0}, Lo/boe;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)[B

    move-result-object v0

    return-object v0

    .line 192
    :cond_0
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "getByteFromBitmap bitmap is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 155
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v3

    .line 156
    invoke-static {p0}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 157
    if-eqz v3, :cond_0

    if-nez v4, :cond_3

    .line 159
    :cond_0
    const-string v0, "ContactPhotoManagerHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBitmapFromFile dir or name is null.d:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "n:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_3
    const/4 v5, 0x0

    .line 164
    new-instance v6, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_sd.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 167
    invoke-static {v6}, Lo/boe;->c(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_2

    .line 171
    :cond_4
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "getBitmapFromFile file is not exist."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    :goto_2
    return-object v5
.end method

.method public static b(Landroid/content/ContentResolver;JLjava/lang/String;)Z
    .locals 15

    .line 205
    invoke-static/range {p3 .. p3}, Lo/asf;->e(Ljava/lang/String;)[B

    move-result-object v7

    .line 207
    const/4 v8, 0x0

    .line 208
    array-length v0, v7

    if-nez v0, :cond_0

    .line 210
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "Not Found Photo File."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    return v8

    .line 214
    :cond_0
    const/4 v9, 0x0

    .line 216
    const/4 v10, 0x0

    .line 223
    move-object v0, p0

    :try_start_0
    sget-object v1, Lo/asf;->d:Landroid/net/Uri;

    sget-object v2, Lo/asf;->e:[Ljava/lang/String;

    const-string v3, "raw_contact_id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    .line 224
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 223
    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 226
    if-eqz v9, :cond_3

    .line 228
    :cond_1
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 230
    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 232
    const-string v0, "vnd.android.cursor.item/photo"

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    const/4 v10, 0x1

    .line 236
    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 238
    if-eqz v12, :cond_2

    const/16 v0, 0x14

    if-lt v12, v0, :cond_1

    .line 240
    :cond_2
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {p0, v0, v1, v7, v2}, Lo/asf;->d(Landroid/content/ContentResolver;J[BLjava/lang/String;)Z

    move-result v0

    move v8, v0

    goto :goto_0

    .line 246
    :cond_3
    if-nez v10, :cond_4

    .line 248
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    invoke-static {p0, v0, v1, v7, v2}, Lo/asf;->d(Landroid/content/ContentResolver;J[BLjava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    move v8, v0

    .line 257
    :cond_4
    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 258
    goto :goto_1

    .line 251
    :catch_0
    move-exception v13

    .line 253
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "updateContactPhoto exception."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 258
    goto :goto_1

    .line 257
    :catchall_0
    move-exception v14

    invoke-static {v9}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 258
    throw v14

    .line 259
    :goto_1
    return v8
.end method

.method public static b(Lcom/huawei/health/sns/logic/contacts/SnsFriend;Lo/aso;)Z
    .locals 2

    .line 57
    invoke-virtual {p0}, Lcom/huawei/health/sns/logic/contacts/SnsFriend;->getPhoneDigest()Ljava/lang/String;

    move-result-object v1

    .line 58
    if-eqz v1, :cond_0

    .line 60
    invoke-virtual {p1}, Lo/aso;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 62
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .line 138
    const/4 v1, 0x0

    .line 139
    invoke-static {p0}, Lo/bbk;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 140
    if-eqz v2, :cond_0

    .line 142
    invoke-static {v2}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 144
    :cond_0
    return-object v1
.end method

.method public static d(Landroid/content/ContentResolver;J[BLjava/lang/String;)Z
    .locals 8

    .line 73
    sget-object v0, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    .line 74
    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "display_photo"

    .line 73
    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 76
    invoke-static {v2}, Lo/asf;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x0

    .line 82
    const-string v0, "rw"

    :try_start_0
    invoke-virtual {p0, v2, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v5

    .line 84
    if-nez v5, :cond_0

    .line 86
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "Fail to write contact display photo."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    const/4 v6, 0x0

    .line 103
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 87
    return v6

    .line 90
    :cond_0
    :try_start_1
    invoke-virtual {v5}, Landroid/content/res/AssetFileDescriptor;->createOutputStream()Ljava/io/FileOutputStream;

    move-result-object v0

    move-object v3, v0

    .line 92
    invoke-virtual {v3, p3}, Ljava/io/FileOutputStream;->write([B)V

    .line 93
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    const/4 v4, 0x1

    .line 103
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 104
    goto :goto_0

    .line 97
    :catch_0
    move-exception v5

    .line 99
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "Fail to write contact display photo."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 104
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v7

    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 104
    throw v7

    .line 105
    :goto_0
    return v4
.end method

.method public static e(Ljava/lang/String;)[B
    .locals 3

    .line 117
    invoke-static {p0}, Lo/asf;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 118
    if-nez v2, :cond_0

    .line 120
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "photo not in cache."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-static {p0}, Lo/asf;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_0

    .line 125
    :cond_0
    const-string v0, "ContactPhotoManagerHelper"

    const-string v1, "photo is in cache."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    invoke-static {v2}, Lo/asf;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v0

    return-object v0
.end method
