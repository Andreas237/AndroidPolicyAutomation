.class public Lo/arp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/arp$c;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arp;->b:Z

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lo/arp;->c:I

    .line 74
    iput-object p1, p0, Lo/arp;->a:Landroid/content/Context;

    .line 75
    return-void
.end method

.method private a()Landroid/graphics/Bitmap;
    .locals 20

    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, -0x1

    .line 140
    const-wide/16 v9, -0x1

    .line 141
    const/4 v11, 0x0

    .line 143
    const/4 v0, 0x3

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v12, v1

    const-string v0, "date_added"

    const/4 v1, 0x1

    aput-object v0, v12, v1

    const-string v0, "_data"

    const/4 v1, 0x2

    aput-object v0, v12, v1

    .line 152
    const-string v13, "_id desc limit 1"

    .line 154
    const/4 v14, 0x0

    .line 158
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/arp;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    move-object v2, v12

    const-string v3, "mime_type!=? "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "image/gif"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    move-object v5, v13

    invoke-static/range {v0 .. v5}, Landroid/provider/MediaStore$Images$Media;->query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v14, v0

    .line 160
    if-eqz v14, :cond_0

    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    const-string v0, "_id"

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move v8, v0

    .line 163
    const-string v0, "date_added"

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-wide v9, v0

    .line 164
    const-string v0, "_data"

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v11, v0

    .line 173
    :cond_0
    if-eqz v14, :cond_2

    .line 175
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 167
    :catch_0
    move-exception v15

    .line 169
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    if-eqz v14, :cond_2

    .line 175
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 173
    :catchall_0
    move-exception v16

    if-eqz v14, :cond_1

    .line 175
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 177
    :cond_1
    throw v16

    .line 180
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    .line 181
    if-ltz v8, :cond_3

    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_3

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 182
    :cond_3
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap not validata."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const/4 v0, 0x0

    return-object v0

    .line 188
    :cond_4
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/arp;->b:Z

    if-eqz v0, :cond_5

    .line 190
    const-string v0, ""

    const-string v1, "getRecentlyBitmap canceled1. "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const/4 v0, 0x0

    return-object v0

    .line 195
    :cond_5
    new-instance v15, Lo/bca;

    invoke-direct {v15}, Lo/bca;-><init>()V

    .line 197
    invoke-virtual {v15}, Lo/bca;->a()J

    move-result-wide v16

    .line 200
    int-to-long v0, v8

    invoke-virtual {v15, v0, v1}, Lo/bca;->c(J)V

    .line 203
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v18, v0, v2

    .line 205
    const-wide/16 v0, 0x3c

    add-long/2addr v0, v9

    cmp-long v0, v0, v18

    if-gez v0, :cond_6

    .line 207
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap after one minute."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x0

    return-object v0

    .line 212
    :cond_6
    int-to-long v0, v8

    cmp-long v0, v16, v0

    if-ltz v0, :cond_7

    .line 214
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap no new picture."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const/4 v0, 0x0

    return-object v0

    .line 219
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v11, :cond_8

    sget-object v0, Lo/bbu;->c:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 221
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap data contains chat dir."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const/4 v0, 0x0

    return-object v0

    .line 225
    :cond_8
    move-object/from16 v0, p0

    iput v8, v0, Lo/arp;->c:I

    .line 226
    const/4 v0, 0x0

    if-eq v0, v11, :cond_9

    .line 227
    const/16 v0, 0xc8

    const/16 v1, 0xc8

    invoke-static {v11, v0, v1}, Lo/bbw;->e(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 230
    :cond_9
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/arp;->b:Z

    if-eqz v0, :cond_a

    .line 232
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap canceled2. "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const/4 v0, 0x0

    return-object v0

    .line 235
    :cond_a
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap build bitmap complete."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    return-object v7
.end method

.method static synthetic d(Lo/arp;)I
    .locals 1

    .line 25
    iget v0, p0, Lo/arp;->c:I

    return v0
.end method

.method static synthetic e(Lo/arp;)Landroid/graphics/Bitmap;
    .locals 1

    .line 25
    invoke-direct {p0}, Lo/arp;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arp;->b:Z

    .line 83
    return-void
.end method

.method public c(I)V
    .locals 3

    .line 249
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lo/bca;->c(J)V

    .line 251
    invoke-static {}, Lo/aps;->a()Lo/aps;

    move-result-object v0

    invoke-virtual {v0}, Lo/aps;->e()V

    .line 252
    return-void
.end method

.method public c(Lo/arp$c;)V
    .locals 4

    .line 103
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap begin."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-static {}, Lo/aps;->a()Lo/aps;

    move-result-object v0

    invoke-virtual {v0}, Lo/aps;->d()Z

    move-result v3

    .line 106
    if-nez v3, :cond_0

    .line 108
    const-string v0, "GetRecentPicTask"

    const-string v1, "getRecentlyBitmap isChanged false "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    return-void

    .line 113
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arp;->b:Z

    .line 115
    new-instance v0, Lo/arp$3;

    invoke-direct {v0, p0, p1}, Lo/arp$3;-><init>(Lo/arp;Lo/arp$c;)V

    sget-object v1, Lo/brb;->e:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 132
    invoke-virtual {v0, v1, v2}, Lo/arp$3;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 133
    return-void
.end method

.method public e()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Lo/arp;->b:Z

    return v0
.end method
