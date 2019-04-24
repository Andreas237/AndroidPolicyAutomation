.class public Lo/ats;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ats;->e:Ljava/lang/String;

    .line 85
    iput-object p1, p0, Lo/ats;->b:Landroid/os/Handler;

    .line 86
    return-void
.end method

.method static synthetic a(Lo/ats;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 43
    iput-object p1, p0, Lo/ats;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lo/ats;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ats;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-static {}, Lo/ats;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 317
    const/4 v3, 0x0

    .line 318
    const/4 v4, 0x0

    .line 319
    const/4 v5, 0x0

    .line 323
    :try_start_0
    new-instance v6, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "groupHead.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 324
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    move-result v7

    .line 327
    const-string v0, "UpdateGroupImageTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createNewFile result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    :cond_0
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 331
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 332
    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 333
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x5a

    invoke-virtual {p0, v0, v1, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 343
    if-eqz v5, :cond_1

    .line 345
    :try_start_1
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V

    .line 346
    const/4 v5, 0x0

    .line 348
    :cond_1
    if-eqz v4, :cond_2

    .line 350
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 351
    const/4 v4, 0x0

    .line 357
    :cond_2
    goto :goto_1

    .line 354
    :catch_0
    move-exception v6

    .line 356
    const-string v0, "UpdateGroupImageTask"

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    goto :goto_1

    .line 335
    :catch_1
    move-exception v6

    .line 337
    const-string v0, "UpdateGroupImageTask"

    const-string v1, "saveBitmap exception"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 343
    if-eqz v5, :cond_3

    .line 345
    :try_start_3
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V

    .line 346
    const/4 v5, 0x0

    .line 348
    :cond_3
    if-eqz v4, :cond_4

    .line 350
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 351
    const/4 v4, 0x0

    .line 357
    :cond_4
    goto :goto_1

    .line 354
    :catch_2
    move-exception v6

    .line 356
    const-string v0, "UpdateGroupImageTask"

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    goto :goto_1

    .line 341
    :catchall_0
    move-exception v8

    .line 343
    if-eqz v5, :cond_5

    .line 345
    :try_start_4
    invoke-virtual {v5}, Ljava/io/BufferedOutputStream;->close()V

    .line 346
    const/4 v5, 0x0

    .line 348
    :cond_5
    if-eqz v4, :cond_6

    .line 350
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 351
    const/4 v4, 0x0

    .line 357
    :cond_6
    goto :goto_0

    .line 354
    :catch_3
    move-exception v9

    .line 356
    const-string v0, "UpdateGroupImageTask"

    const-string v1, "saveBitmap close exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    :goto_0
    throw v8

    .line 359
    :goto_1
    return-object v3
.end method

.method private b(III)V
    .locals 2

    .line 218
    iget-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/ats;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 222
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Z)V
    .locals 9

    .line 231
    iget-object v0, p0, Lo/ats;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 233
    invoke-static {p1}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 234
    if-eqz p2, :cond_0

    const-string v4, "_hd.jpg"

    goto :goto_0

    :cond_0
    const-string v4, "_sd.jpg"

    .line 235
    :goto_0
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lo/ats;->e:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 236
    invoke-static {}, Lo/ats;->c()Ljava/lang/String;

    move-result-object v6

    .line 237
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v7

    .line 238
    if-nez v7, :cond_1

    .line 240
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v8

    .line 241
    const-string v0, "UpdateGroupImageTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "renameImageFile : delete file resule = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    :cond_1
    return-void
.end method

.method private static c()Ljava/lang/String;
    .locals 5

    .line 293
    const/4 v2, 0x0

    .line 294
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v3

    .line 295
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    const-string v0, "UpdateGroupImageTask"

    const-string v1, "create cache dir error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    return-object v2

    .line 304
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 305
    return-object v2
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 102
    new-instance v0, Lo/ats$5;

    invoke-direct {v0, p0, p2, p1, p3}, Lo/ats$5;-><init>(Lo/ats;Landroid/graphics/Bitmap;Lcom/huawei/health/sns/model/group/Group;Z)V

    return-object v0
.end method

.method private static c(Ljava/lang/String;)V
    .locals 2

    .line 281
    invoke-static {p0}, Lo/bbk;->c(Ljava/lang/String;)V

    .line 282
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 283
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 284
    return-void
.end method

.method private static c(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 268
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    invoke-static {p0, p1}, Lo/bbn;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 272
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/ats;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/ats;->e:Ljava/lang/String;

    return-object v0
.end method

.method private static d(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 376
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    .line 377
    if-eqz v1, :cond_0

    .line 379
    invoke-virtual {v1, p2}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 380
    invoke-virtual {v1, p3}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 381
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/atc;->c(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 383
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V
    .locals 14

    .line 137
    if-nez p1, :cond_0

    .line 139
    const/16 v0, 0x1a1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/ats;->b(III)V

    .line 141
    return-void

    .line 144
    :cond_0
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-nez v0, :cond_3

    .line 147
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;

    if-eqz v0, :cond_2

    .line 149
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;

    .line 150
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse;->getUpdateGroupImgRsp_()Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;

    move-result-object v4

    .line 151
    if-eqz v4, :cond_1

    .line 153
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->getImageURL_()Ljava/lang/String;

    move-result-object v5

    .line 154
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->getImageURLDownload_()Ljava/lang/String;

    move-result-object v6

    .line 156
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v7

    .line 158
    invoke-static {v7}, Lo/ats;->c(Ljava/lang/String;)V

    .line 160
    move-object/from16 v0, p2

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 161
    move-object/from16 v0, p2

    invoke-virtual {v0, v6}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 164
    move/from16 v0, p4

    invoke-direct {p0, v5, v0}, Lo/ats;->b(Ljava/lang/String;Z)V

    .line 166
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/group/UpdateGroupImageResponse$UpdateGroupImgRsp;->getGrpID_()J

    move-result-wide v8

    .line 168
    invoke-static {v8, v9, v5, v6}, Lo/ats;->d(JLjava/lang/String;Ljava/lang/String;)V

    .line 170
    invoke-static/range {p3 .. p3}, Lo/bbk;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 172
    invoke-static {v5, v10}, Lo/ats;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 173
    move-object/from16 v0, p3

    invoke-static {v5, v0}, Lo/ats;->c(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 175
    new-instance v11, Lo/ayc;

    invoke-direct {v11}, Lo/ayc;-><init>()V

    .line 176
    invoke-virtual {v11, v8, v9}, Lo/ayc;->e(J)V

    .line 177
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/ayc;->e(Z)V

    .line 178
    invoke-virtual {v11, v5}, Lo/ayc;->c(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v11, v7}, Lo/ayc;->d(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v11, v6}, Lo/ayc;->b(Ljava/lang/String;)V

    .line 181
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, v8, v9, v11}, Lo/ata;->b(JLo/ayc;)V

    .line 183
    iget-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v12

    .line 186
    const/16 v0, 0x1a5

    iput v0, v12, Landroid/os/Message;->what:I

    .line 187
    move-object/from16 v0, p3

    iput-object v0, v12, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 188
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 189
    const-string v0, "group_image_url"

    invoke-virtual {v13, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string v0, "group_download_image_url"

    invoke-virtual {v13, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    invoke-virtual {v12, v13}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 192
    iget-object v0, p0, Lo/ats;->b:Landroid/os/Handler;

    invoke-virtual {v0, v12}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 195
    :cond_1
    goto :goto_0

    .line 198
    :cond_2
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0x1a2

    invoke-direct {p0, v2, v0, v1}, Lo/ats;->b(III)V

    .line 199
    const-string v0, "UpdateGroupImageTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupImage error! resultCode_: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 204
    :cond_3
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    iget v1, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/16 v2, 0xaaa

    invoke-direct {p0, v2, v0, v1}, Lo/ats;->b(III)V

    .line 205
    const-string v0, "UpdateGroupImageTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateGroupImage error! responseCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :goto_0
    return-void
.end method

.method private static d(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 254
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 256
    invoke-static {p0, p1}, Lo/bbk;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 258
    :cond_0
    return-void
.end method

.method static synthetic e(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 43
    invoke-static {p0, p1}, Lo/ats;->b(Landroid/graphics/Bitmap;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)V
    .locals 2

    .line 97
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lo/ats;->c(Lcom/huawei/health/sns/model/group/Group;Landroid/graphics/Bitmap;Z)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 98
    return-void
.end method
