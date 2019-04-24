.class public Lcom/huawei/feedback/FeedbackApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/FeedbackApi$a;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FeedbackApi"

.field private static aesSecret:Ljava/lang/String; = null

.field private static appId_str:Ljava/lang/String; = null

.field private static applicationcontext:Landroid/content/Context; = null

.field private static logCollectManager:Lcom/huawei/lcagent/client/LogCollectManager; = null

.field private static logfilePath:Ljava/lang/String; = null

.field private static logsdcardpath:Ljava/lang/String; = null

.field private static logwritePath:Ljava/lang/String; = null

.field private static logzipPath:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logCollectManager:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 52
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    .line 53
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logzipPath:Ljava/lang/String;

    .line 54
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    .line 55
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    .line 56
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Huawei/phoneservice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logsdcardpath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logsdcardpath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    return-object v0
.end method

.method public static aesEncryptFile(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 297
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 298
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    :cond_0
    const-string v0, "FeedbackApi"

    const-string v1, "aesEncryptFile input null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 302
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0x500000

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 303
    :cond_2
    const-string v0, "FeedbackApi"

    const-string v1, "aesEncryptFile wrong!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    return-void

    .line 306
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 307
    const/4 v5, 0x0

    .line 308
    const/4 v6, 0x0

    .line 309
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 310
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    .line 311
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 312
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_5

    .line 313
    const-string v0, "FeedbackApi"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_5

    .line 315
    const-string v0, "FeedbackApi"

    const-string v1, "\u6587\u4ef6\u5939\u4e0d\u5b58\u5728\uff0c\u521b\u5efa\u6587\u4ef6\u5939\u5931\u8d25"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    return-void

    .line 320
    :cond_4
    const-string v0, "FeedbackApi"

    const-string v1, "filelocation null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    return-void

    .line 325
    :cond_5
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 326
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 327
    const/16 v0, 0x400

    new-array v9, v0, [B

    .line 328
    const/4 v10, 0x0

    .line 329
    :goto_0
    invoke-virtual {v5, v9}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v10, v0

    if-lez v0, :cond_7

    .line 330
    const/4 v0, 0x0

    invoke-static {v9, v0, v10, v4}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a([BIILjava/lang/String;)[B

    move-result-object v11

    .line 331
    if-eqz v11, :cond_6

    .line 332
    array-length v0, v11

    const/4 v1, 0x0

    invoke-virtual {v6, v11, v1, v0}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    :cond_6
    goto :goto_0

    .line 340
    :cond_7
    const-string v0, "FeedbackApi"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 341
    const-string v0, "FeedbackApi"

    invoke-static {v6, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 342
    goto :goto_1

    .line 335
    :catch_0
    move-exception v9

    .line 336
    const-string v0, "FeedbackApi"

    const-string v1, "FileNotFound"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 340
    const-string v0, "FeedbackApi"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 341
    const-string v0, "FeedbackApi"

    invoke-static {v6, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 342
    goto :goto_1

    .line 337
    :catch_1
    move-exception v9

    .line 338
    const-string v0, "FeedbackApi"

    const-string v1, "IOException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 340
    const-string v0, "FeedbackApi"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 341
    const-string v0, "FeedbackApi"

    invoke-static {v6, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 342
    goto :goto_1

    .line 340
    :catchall_0
    move-exception v12

    const-string v0, "FeedbackApi"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 341
    const-string v0, "FeedbackApi"

    invoke-static {v6, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v12

    .line 344
    :goto_1
    return-void
.end method

.method public static getApplicationcontext()Landroid/content/Context;
    .locals 1

    .line 60
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->applicationcontext:Landroid/content/Context;

    return-object v0
.end method

.method public static getLogCollectManager()Lcom/huawei/lcagent/client/LogCollectManager;
    .locals 1

    .line 68
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logCollectManager:Lcom/huawei/lcagent/client/LogCollectManager;

    return-object v0
.end method

.method public static gotoFeedback(Landroid/content/Context;Landroid/os/Bundle;)I
    .locals 33

    .line 84
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 85
    :cond_0
    const/16 v0, 0x3e9

    return v0

    .line 87
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/FeedbackApi;->setApplicationcontext(Landroid/content/Context;)V

    .line 89
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a()Lcom/huawei/phoneserviceuni/common/d/a/a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/d/a/a;->a(Landroid/content/Context;)V

    .line 90
    const-string v0, "appId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    .line 91
    const-string v0, "questionType"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 92
    const-string v0, "logfilePath"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    .line 93
    const-string v0, "aesSecret"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    .line 94
    const-string v0, "logwritePath"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    .line 95
    const-string v0, "packageName"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 96
    const-string v0, "packageVersion"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 97
    const-string v0, "screenshotPath"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 98
    const-string v0, "logwritePathList"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v15

    .line 99
    const-string v0, "displayHotline"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v16

    .line 101
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v17

    .line 102
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 103
    move-object/from16 v11, v17

    .line 105
    :cond_2
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    :cond_3
    const/16 v0, 0x3e9

    return v0

    .line 109
    :cond_4
    const/16 v18, -0x1

    .line 111
    :try_start_0
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v18

    .line 114
    goto :goto_0

    .line 112
    :catch_0
    move-exception v19

    .line 113
    const/16 v0, 0x3e9

    return v0

    .line 117
    :goto_0
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 118
    const/16 v0, 0x3e9

    return v0

    .line 120
    :cond_5
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 122
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "feedbacklogs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    .line 126
    :cond_6
    sget-object v19, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 127
    sget-object v20, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 128
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    move-object/from16 v21, v0

    .line 129
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v22, v0

    .line 130
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v23

    .line 131
    invoke-static/range {p0 .. p0}, Lcom/huawei/phoneserviceuni/common/e/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v24

    .line 132
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v24

    .line 133
    invoke-static/range {v24 .. v24}, Lcom/huawei/phoneserviceuni/common/e/a/b/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    .line 135
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v27

    .line 137
    const-string v0, "_"

    const-string v1, "-"

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v19

    .line 138
    const-string v0, "_"

    const-string v1, "-"

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v20

    .line 139
    const-string v0, "_"

    const-string v1, "-"

    move-object/from16 v2, v26

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v26

    .line 140
    const/4 v0, 0x0

    move-object/from16 v1, v27

    if-eq v0, v1, :cond_7

    .line 141
    const-string v0, "_"

    const-string v1, "-"

    move-object/from16 v2, v27

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v27

    .line 148
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/temp_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v29

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logzipPath:Ljava/lang/String;

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Huawei/phoneservice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    .line 159
    const/16 v0, 0xb

    new-array v0, v0, [B

    move-object/from16 v30, v0

    .line 160
    invoke-static/range {v30 .. v30}, Lcom/huawei/feedback/g;->a([B)V

    .line 161
    move-object/from16 v0, v30

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v31

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    .line 165
    invoke-static/range {p0 .. p0}, Lcom/huawei/feedback/e;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, Lcom/huawei/feedback/e;->e()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 166
    :cond_8
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/logic/a;

    sget-object v2, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    sget-object v3, Lcom/huawei/feedback/FeedbackApi;->logzipPath:Ljava/lang/String;

    sget-object v4, Lcom/huawei/feedback/FeedbackApi;->logwritePath:Ljava/lang/String;

    sget-object v5, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    sget-object v6, Lcom/huawei/feedback/FeedbackApi;->appId_str:Ljava/lang/String;

    sget-object v7, Lcom/huawei/feedback/FeedbackApi;->logsdcardpath:Ljava/lang/String;

    move-object v8, v15

    const/4 v9, 0x1

    move-object/from16 v10, p0

    invoke-direct/range {v1 .. v10}, Lcom/huawei/feedback/logic/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLandroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    move-object/from16 v32, v0

    .line 168
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Thread;->start()V

    .line 170
    :cond_9
    goto :goto_1

    .line 172
    :cond_a
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/c;

    invoke-direct {v1}, Lcom/huawei/feedback/c;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 183
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 188
    :goto_1
    :try_start_1
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/lcagent/client/LogCollectManager;-><init>(Landroid/content/Context;)V

    move-object/from16 v19, v0

    .line 190
    invoke-static/range {v19 .. v19}, Lcom/huawei/feedback/FeedbackApi;->setLogCollectManager(Lcom/huawei/lcagent/client/LogCollectManager;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 193
    goto :goto_2

    .line 191
    :catch_1
    move-exception v19

    .line 192
    const-string v0, "FeedbackApi"

    const-string v1, "The init of the object logCollectManager is exception!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :goto_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.phoneservice.FEEDBACK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v19, v0

    .line 198
    const-string v0, "appId"

    move-object/from16 v1, v19

    move/from16 v2, v18

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 199
    const-string v0, "questionType"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 200
    const-string v0, "logfilePath"

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->logfilePath:Ljava/lang/String;

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 208
    sget-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AESV2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    .line 211
    :cond_b
    const-string v0, "aesSecret"

    sget-object v1, Lcom/huawei/feedback/FeedbackApi;->aesSecret:Ljava/lang/String;

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 212
    const-string v0, "packageName"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 213
    const-string v0, "packageVersion"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    const-string v0, "displayHotline"

    move-object/from16 v1, v19

    move/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 215
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 217
    const-string v0, "screenshotPath"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    :cond_c
    const/4 v0, 0x1

    move/from16 v1, v18

    if-ne v0, v1, :cond_d

    .line 222
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_3

    .line 236
    :cond_d
    const-string v0, "FeedbackApi"

    const-string v1, "not has phoneservice apk"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-class v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;

    move-object/from16 v1, v19

    move-object/from16 v2, p0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 240
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    :try_start_2
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 250
    goto :goto_4

    .line 241
    :catch_2
    move-exception v20

    .line 243
    const-class v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;

    move-object/from16 v1, v19

    move-object/from16 v2, p0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 245
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    :try_start_3
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 249
    goto :goto_4

    .line 246
    :catch_3
    move-exception v21

    .line 247
    const-string v0, "FeedbackApi"

    const-string v1, "start feedback intent error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const/16 v0, 0x3ea

    return v0

    .line 251
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method public static resetImeiAndEmail()V
    .locals 1

    .line 352
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->h()V

    .line 353
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;)Z

    .line 354
    return-void
.end method

.method public static setApplicationcontext(Landroid/content/Context;)V
    .locals 0

    .line 64
    sput-object p0, Lcom/huawei/feedback/FeedbackApi;->applicationcontext:Landroid/content/Context;

    .line 65
    return-void
.end method

.method public static setLogCollectManager(Lcom/huawei/lcagent/client/LogCollectManager;)V
    .locals 0

    .line 72
    sput-object p0, Lcom/huawei/feedback/FeedbackApi;->logCollectManager:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 73
    return-void
.end method
