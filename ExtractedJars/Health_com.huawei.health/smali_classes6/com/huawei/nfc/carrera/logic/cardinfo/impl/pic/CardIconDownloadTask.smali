.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;
.super Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;
.source "SourceFile"


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    .line 47
    return-void
.end method


# virtual methods
.method protected editPicFile(Ljava/lang/String;)Z
    .locals 16

    .line 89
    invoke-static/range {p1 .. p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 91
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    .line 96
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 99
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    invoke-virtual {v0, v2, v4, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getRoundedCornerBitmap(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 101
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 103
    const-string v0, "bitmap is null,return."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 104
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_1
    const/4 v6, 0x0

    .line 111
    :try_start_0
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tem"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 114
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v8

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete .tem file result : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 117
    :cond_2
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 118
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {v5, v0, v1, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 119
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 120
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->getPicFilePath()Ljava/lang/String;

    move-result-object v8

    .line 121
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    const/4 v10, 0x1

    .line 123
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 125
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    move-result v10

    .line 127
    :cond_3
    if-nez v10, :cond_5

    .line 129
    const-string v0, "delete temp file failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v11

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete temp file result : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    const/4 v12, 0x0

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 167
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 173
    :cond_4
    goto :goto_0

    .line 170
    :catch_0
    move-exception v13

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 132
    :goto_0
    return v12

    .line 136
    :cond_5
    :try_start_2
    invoke-virtual {v7, v9}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 138
    const-string v0, "rename failed,return"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v11

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "renameResult : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    const/4 v12, 0x0

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 167
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 173
    :cond_6
    goto :goto_1

    .line 170
    :catch_1
    move-exception v13

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 141
    :goto_1
    return v12

    .line 145
    :cond_7
    :try_start_4
    new-instance v11, Ljava/io/File;

    move-object/from16 v0, p1

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 148
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    move-result v12

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteTmpResult : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 151
    :cond_8
    const/4 v12, 0x1

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_9

    .line 167
    :try_start_5
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 173
    :cond_9
    goto :goto_2

    .line 170
    :catch_2
    move-exception v13

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 151
    :goto_2
    return v12

    .line 153
    :catch_3
    move-exception v7

    .line 155
    const-string v0, "CardIconDownload editPicFile failed. FileNotFoundException"

    :try_start_6
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_a

    .line 167
    :try_start_7
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 173
    :cond_a
    goto :goto_4

    .line 170
    :catch_4
    move-exception v7

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 174
    goto :goto_4

    .line 157
    :catch_5
    move-exception v7

    .line 159
    const-string v0, "CardIconDownload editPicFile failed. IOException"

    :try_start_8
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_b

    .line 167
    :try_start_9
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 173
    :cond_b
    goto :goto_4

    .line 170
    :catch_6
    move-exception v7

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 174
    goto :goto_4

    .line 163
    :catchall_0
    move-exception v14

    .line 165
    const/4 v0, 0x0

    if-eq v0, v6, :cond_c

    .line 167
    :try_start_a
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 173
    :cond_c
    goto :goto_3

    .line 170
    :catch_7
    move-exception v15

    .line 172
    const-string v0, "CardIconDownload editPicFile FileOutputStream close failed. IOException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 174
    :goto_3
    throw v14

    .line 175
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method protected getPicDirPath()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getPicFilePath()Ljava/lang/String;
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->curId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected handleDownloadResult(Ljava/lang/String;I)V
    .locals 5

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card icon downloaded productId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 65
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    if-eqz p2, :cond_0

    .line 68
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardIconDownloadTask download card product icon failed. resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 70
    const-string v0, "productId"

    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const-string v0, "fail_reason"

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    const v0, 0x3611a449

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;->downloadIconResult(ILjava/lang/String;I)V

    .line 78
    :cond_1
    return-void
.end method
