.class public Lcom/huawei/feedback/component/AutoUploadService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "AppLogApi/AutoUploadService"

.field private static final b:I = 0x1

.field private static c:Ljava/io/File; = null

.field private static d:J = 0x0L


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/huawei/feedback/component/AutoUploadService;->d:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method static synthetic a()J
    .locals 2

    .line 33
    sget-wide v0, Lcom/huawei/feedback/component/AutoUploadService;->d:J

    return-wide v0
.end method

.method private a(J)V
    .locals 6

    .line 323
    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v4

    .line 324
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setHasUsedSize netType"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    .line 326
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setHasUsedSize file"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->d(Landroid/content/Context;)I

    move-result v5

    .line 328
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    int-to-long v2, v5

    add-long/2addr v2, p1

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/a/b/b;->b(Landroid/content/Context;I)V

    .line 329
    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 330
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->e(Landroid/content/Context;)I

    move-result v5

    .line 331
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    int-to-long v2, v5

    add-long/2addr v2, p1

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/a/b/b;->c(Landroid/content/Context;I)V

    .line 333
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 18

    .line 185
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogApi;->deleteOverTimeLog(Landroid/content/Context;)V

    .line 187
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 190
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->j(Landroid/content/Context;)Z

    move-result v4

    .line 191
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isUnLimitSize=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v5

    .line 195
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/huawei/common/applog/AppLogApi;->getremainUploadSize(ILandroid/content/Context;)I

    move-result v6

    .line 196
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "remainsize=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    int-to-long v1, v6

    move-object/from16 v3, p1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/common/applog/AppLogApi;->createBiglogzip(Landroid/content/Context;JLandroid/os/Bundle;Z)Ljava/lang/String;

    move-result-object v7

    .line 201
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "biglogFilePath=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 204
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "big file path encryptFile!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-static {v8, v1, v2, v0}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;Ljava/lang/String;ZLandroid/content/Context;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    .line 218
    :cond_0
    invoke-static {v8}, Lcom/huawei/feedback/e;->b(Ljava/io/File;)V

    .line 220
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->c()I

    move-result v9

    .line 221
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkuoloadDB maxsizelimit=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez v4, :cond_2

    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    .line 226
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    int-to-long v2, v9

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 228
    :cond_2
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "begin logupload!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/feedback/component/AutoUploadService;->a(Ljava/io/File;)V

    .line 230
    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    sput-wide v0, Lcom/huawei/feedback/component/AutoUploadService;->d:J

    .line 231
    new-instance v10, Landroid/content/Intent;

    const-string v0, "com.huawei.lcagent.UPLOAD_REQUEST"

    invoke-direct {v10, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 232
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.logupload.LogUploadService"

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    const-string v0, "alert_visible"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 234
    const-string v0, "filepath"

    sget-object v1, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 235
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    .line 236
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v0, "MMddHHmmssSSS"

    invoke-direct {v12, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 237
    invoke-virtual {v12, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    .line 238
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 239
    const-string v0, "id"

    invoke-virtual {v10, v0, v14, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 241
    const-string v0, "usertype"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 245
    const/16 v17, 0x8

    .line 246
    const-string v0, "encrypt"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 247
    const-string v0, "privacy"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 248
    const-string v0, "channelId"

    move/from16 v1, v17

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 249
    const-string v0, "size"

    sget-wide v1, Lcom/huawei/feedback/component/AutoUploadService;->d:J

    invoke-virtual {v10, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 250
    const-string v0, "feedBackPackageName"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    const-string v0, "feedBackClassName"

    const-class v1, Lcom/huawei/feedback/component/AutoUploadService;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 253
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 254
    const/16 v16, 0x1

    goto :goto_0

    .line 257
    :cond_3
    const/16 v16, 0x7

    .line 259
    :goto_0
    const-string v0, "flags"

    move/from16 v1, v16

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 260
    const-string v0, "encryptKey"

    move-object/from16 v1, p2

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 262
    const-string v0, "autoupload"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 263
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 264
    goto :goto_1

    .line 265
    :cond_4
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "waitUploadZipfile failed!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    invoke-static {v0}, Lcom/huawei/feedback/e;->b(Ljava/io/File;)V

    .line 267
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/feedback/component/AutoUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 270
    :goto_1
    goto :goto_2

    .line 271
    :cond_5
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "createBiglogzip failed!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/feedback/component/AutoUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 275
    :goto_2
    goto :goto_3

    .line 277
    :cond_6
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isAllowUpload "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/feedback/e;->m(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "netWorkState "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 278
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/feedback/e;->q(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 277
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/feedback/component/AutoUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 281
    :goto_3
    return-void
.end method

.method private a(Lcom/huawei/feedback/bean/a;)V
    .locals 7

    .line 352
    new-instance v2, Lcom/huawei/feedback/a/a/a;

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/feedback/a/a/a;-><init>(Landroid/content/Context;)V

    .line 353
    sget-object v3, Lcom/huawei/feedback/d;->ag:Ljava/lang/Object;

    monitor-enter v3

    .line 355
    :try_start_0
    invoke-static {v2}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;)Ljava/util/List;

    move-result-object v4

    .line 356
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 358
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    .line 359
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 360
    invoke-static {v2, p1}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;Lcom/huawei/feedback/bean/a;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    .line 364
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/AutoUploadService;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/feedback/component/AutoUploadService;->d()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/AutoUploadService;J)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/component/AutoUploadService;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/AutoUploadService;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/component/AutoUploadService;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/component/AutoUploadService;Lcom/huawei/feedback/bean/a;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/huawei/feedback/component/AutoUploadService;->a(Lcom/huawei/feedback/bean/a;)V

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 8

    .line 337
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 338
    return-void

    .line 340
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v6

    .line 341
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    .line 342
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->f(Landroid/content/Context;)I

    move-result v7

    .line 343
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    int-to-long v2, v7

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    add-long/2addr v2, v4

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/a/b/b;->d(Landroid/content/Context;I)V

    .line 344
    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v6, v0, :cond_2

    .line 345
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/a/b/b;->g(Landroid/content/Context;)I

    move-result v7

    .line 346
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    int-to-long v2, v7

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    add-long/2addr v2, v4

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/feedback/a/b/b;->e(Landroid/content/Context;I)V

    .line 348
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b()Ljava/io/File;
    .locals 1

    .line 33
    sget-object v0, Lcom/huawei/feedback/component/AutoUploadService;->c:Ljava/io/File;

    return-object v0
.end method

.method private c()I
    .locals 2

    .line 286
    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->g(Landroid/content/Context;)I

    move-result v1

    .line 287
    const/4 v0, 0x1

    if-ne v1, v0, :cond_0

    .line 288
    const v0, 0xc8000

    return v0

    .line 289
    :cond_0
    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    .line 290
    const v0, 0x64000

    return v0

    .line 292
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d()V
    .locals 6

    .line 298
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "deleteuploadDB ACTION_AUTOUPLOAD_DELETE_INTENT "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    new-instance v2, Lcom/huawei/feedback/a/a/a;

    invoke-virtual {p0}, Lcom/huawei/feedback/component/AutoUploadService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/huawei/feedback/a/a/a;-><init>(Landroid/content/Context;)V

    .line 301
    sget-object v3, Lcom/huawei/feedback/d;->ag:Ljava/lang/Object;

    monitor-enter v3

    .line 303
    :try_start_0
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->getAutouploadloglist()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 305
    :goto_0
    sget-object v3, Lcom/huawei/feedback/d;->ag:Ljava/lang/Object;

    monitor-enter v3

    .line 307
    :try_start_1
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->getAutonologlist()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/feedback/a/a/b;->a(Lcom/huawei/feedback/a/a/a;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v5

    monitor-exit v3

    throw v5

    .line 309
    :goto_1
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->getAutouploadloglist()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 310
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->getAutouploadloglist()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/a;

    .line 311
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "ACTION_AUTOUPLOAD_DELETE_INTENT getFilepath"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->f(Ljava/lang/String;)V

    .line 313
    goto :goto_2

    .line 315
    :cond_0
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 44
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 49
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 52
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 56
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 58
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 2

    .line 64
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "onStart()"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 66
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 20

    .line 70
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "AutoUploadService onStartCommand()"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    :cond_0
    const-string v0, "AppLogApi/AutoUploadService"

    const-string v1, "onStart() null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->stopSelf()V

    .line 75
    const/4 v0, 0x2

    return v0

    .line 80
    :cond_1
    const/16 v0, 0xb

    new-array v8, v0, [B

    .line 81
    invoke-static {v8}, Lcom/huawei/feedback/g;->a([B)V

    .line 82
    const/4 v0, 0x2

    invoke-static {v8, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v9

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 85
    invoke-static {v9}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v11

    .line 87
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "action "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_REQUEST"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 90
    const-string v0, "metaData"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v12

    .line 91
    const-string v0, "filepath"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 92
    const-string v0, "AppLogApi/AutoUploadService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5c0f\u5305sd\u8def\u5f84"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "aesSecret"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 94
    const-string v0, "uploadFile"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v15

    .line 95
    if-nez v12, :cond_2

    .line 96
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->stopSelf()V

    .line 97
    const/4 v0, 0x2

    return v0

    .line 105
    :cond_2
    const-string v0, "Eventid"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 106
    const-string v0, "HappenTime"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 107
    const-string v0, "MetaData"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 109
    new-instance v19, Lcom/huawei/feedback/bean/a;

    invoke-direct/range {v19 .. v19}, Lcom/huawei/feedback/bean/a;-><init>()V

    .line 110
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/a;->a(I)V

    .line 111
    move-object/from16 v0, v19

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/a;->b(Ljava/lang/String;)V

    .line 112
    move-object/from16 v0, v19

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/a;->c(Ljava/lang/String;)V

    .line 113
    move-object/from16 v0, v19

    invoke-virtual {v0, v15}, Lcom/huawei/feedback/bean/a;->a(Z)V

    .line 116
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/component/a;

    move-object/from16 v2, p0

    move-object v3, v13

    move-object v4, v14

    move-object/from16 v5, v19

    move-object v6, v12

    move-object v7, v10

    invoke-direct/range {v1 .. v7}, Lcom/huawei/feedback/component/a;-><init>(Lcom/huawei/feedback/component/AutoUploadService;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/feedback/bean/a;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 147
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 148
    goto :goto_0

    :cond_3
    const-string v0, "com.huawei.phoneservice.AUTOCHECK"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 149
    const-string v0, "metaData"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v12

    .line 150
    if-nez v12, :cond_4

    .line 151
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/component/AutoUploadService;->stopSelf()V

    .line 152
    const/4 v0, 0x2

    return v0

    .line 154
    :cond_4
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/component/b;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v12, v10}, Lcom/huawei/feedback/component/b;-><init>(Lcom/huawei/feedback/component/AutoUploadService;Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 158
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 159
    goto :goto_0

    :cond_5
    const-string v0, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 160
    const-string v0, "AutoUploadService"

    const-string v1, "ACTION_AUTOUPLOAD_DELETE_INTENT000 "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    const-string v0, "isuploadsuccess"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v12

    .line 162
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/component/c;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v12}, Lcom/huawei/feedback/component/c;-><init>(Lcom/huawei/feedback/component/AutoUploadService;Z)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 177
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 179
    :cond_6
    :goto_0
    const/4 v0, 0x2

    return v0
.end method
