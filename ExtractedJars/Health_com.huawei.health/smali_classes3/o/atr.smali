.class public Lo/atr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Landroid/os/Handler;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lo/atr;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/atr;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lo/atr;->d:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lo/atr;->a:Landroid/os/Handler;

    .line 66
    return-void
.end method

.method private a(Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 141
    new-instance v0, Lo/atr$3;

    invoke-direct {v0, p0, p1}, Lo/atr$3;-><init>(Lo/atr;Ljava/lang/String;)V

    return-object v0
.end method

.method private b(ILjava/lang/String;)V
    .locals 2

    .line 280
    iget-object v0, p0, Lo/atr;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 282
    iget-object v0, p0, Lo/atr;->a:Landroid/os/Handler;

    iget-object v1, p0, Lo/atr;->a:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 284
    :cond_0
    return-void
.end method

.method private b(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    .line 184
    const/4 v3, 0x0

    .line 185
    const/4 v4, 0x0

    .line 189
    const/4 v5, 0x1

    .line 190
    :try_start_0
    new-instance v6, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v5

    .line 195
    :cond_0
    if-nez v5, :cond_1

    .line 197
    const/4 v0, 0x2

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1}, Lo/atr;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    nop

    .line 241
    .line 242
    .line 244
    nop

    .line 246
    .line 247
    .line 253
    nop

    .line 198
    .line 250
    .line 252
    return-void

    .line 200
    :cond_1
    :try_start_1
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 201
    const/4 v8, 0x1

    .line 202
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v8

    .line 206
    :cond_2
    if-nez v8, :cond_3

    .line 208
    const/4 v0, 0x2

    move-object/from16 v1, p2

    invoke-direct {p0, v0, v1}, Lo/atr;->b(ILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 239
    nop

    .line 241
    .line 242
    .line 244
    nop

    .line 246
    .line 247
    .line 253
    nop

    .line 209
    .line 250
    .line 252
    return-void

    .line 211
    :cond_3
    :try_start_2
    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z

    move-result v9

    .line 212
    sget-object v0, Lo/atr;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveBitmap result "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 215
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    .line 216
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v10

    .line 217
    const-string v11, ""

    .line 218
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 222
    const-string v11, "SDCard"

    .line 224
    :cond_4
    if-eqz v10, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/bbu;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/atr;->b(ILjava/lang/String;)V

    .line 225
    if-eqz v10, :cond_6

    .line 227
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/atr;->c(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    :cond_6
    if-eqz v4, :cond_7

    .line 241
    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 242
    const/4 v4, 0x0

    .line 244
    :cond_7
    if-eqz v3, :cond_8

    .line 246
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 247
    const/4 v3, 0x0

    .line 253
    :cond_8
    goto :goto_2

    .line 250
    :catch_0
    move-exception v5

    .line 252
    sget-object v0, Lo/atr;->e:Ljava/lang/String;

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    goto :goto_2

    .line 230
    :catch_1
    move-exception v5

    .line 232
    const/4 v0, 0x2

    move-object/from16 v1, p2

    :try_start_4
    invoke-direct {p0, v0, v1}, Lo/atr;->b(ILjava/lang/String;)V

    .line 233
    sget-object v0, Lo/atr;->e:Ljava/lang/String;

    const-string v1, "saveBitmap exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 239
    if-eqz v4, :cond_9

    .line 241
    :try_start_5
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 242
    const/4 v4, 0x0

    .line 244
    :cond_9
    if-eqz v3, :cond_a

    .line 246
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 247
    const/4 v3, 0x0

    .line 253
    :cond_a
    goto :goto_2

    .line 250
    :catch_2
    move-exception v5

    .line 252
    sget-object v0, Lo/atr;->e:Ljava/lang/String;

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    goto :goto_2

    .line 237
    :catchall_0
    move-exception v12

    .line 239
    if-eqz v4, :cond_b

    .line 241
    :try_start_6
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 242
    const/4 v4, 0x0

    .line 244
    :cond_b
    if-eqz v3, :cond_c

    .line 246
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 247
    const/4 v3, 0x0

    .line 253
    :cond_c
    goto :goto_1

    .line 250
    :catch_3
    move-exception v13

    .line 252
    sget-object v0, Lo/atr;->e:Ljava/lang/String;

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    :goto_1
    throw v12

    .line 255
    :goto_2
    return-void
.end method

.method private c(Ljava/lang/String;Landroid/graphics/Bitmap;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/graphics/Bitmap;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 119
    new-instance v0, Lo/atr$5;

    invoke-direct {v0, p0, p1, p2}, Lo/atr$5;-><init>(Lo/atr;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 262
    iget-object v0, p0, Lo/atr;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 265
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 266
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    .line 267
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 268
    invoke-static {v2}, Lo/aob;->e(Landroid/content/Intent;)V

    .line 270
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/atr;ILjava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lo/atr;->b(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/atr;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lo/atr;->b(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 76
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lo/atr;->c(Ljava/lang/String;Landroid/graphics/Bitmap;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 77
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 87
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 89
    :cond_0
    return-void

    .line 92
    :cond_1
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lo/atr;->c(Ljava/lang/String;Landroid/graphics/Bitmap;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 93
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    return-void

    .line 107
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1}, Lo/atr;->a(Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 108
    return-void
.end method
