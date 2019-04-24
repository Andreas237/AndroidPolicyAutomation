.class public Lo/cwk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cwk$e;
    }
.end annotation


# static fields
.field private static b:Ljava/util/concurrent/ExecutorService;

.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/io/File;>;"
        }
    .end annotation
.end field

.field private e:Ljava/io/File;

.field private f:Ljava/lang/String;

.field private g:Landroid/content/Context;

.field private k:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/phoneservice/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cwk;->c:Ljava/lang/String;

    .line 93
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/cwk;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    const-string v0, ""

    iput-object v0, p0, Lo/cwk;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Ljava/security/SecureRandom;
    .locals 6

    .line 300
    const/4 v4, 0x0

    .line 302
    const-string v0, "SHA1PRNG"

    :try_start_0
    invoke-static {v0}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;)Ljava/security/SecureRandom;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 305
    goto :goto_0

    .line 303
    :catch_0
    move-exception v5

    .line 304
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NoSuchAlgorithmException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    :goto_0
    if-nez v4, :cond_0

    .line 308
    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    .line 312
    :cond_0
    invoke-virtual {v4}, Ljava/security/SecureRandom;->nextInt()I

    .line 313
    return-object v4
.end method

.method static synthetic a(Lo/cwk;)Ljava/util/Timer;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->k:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic b(Lo/cwk;)Landroid/content/Context;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/cwk;Ljava/util/Timer;)Ljava/util/Timer;
    .locals 0

    .line 44
    iput-object p1, p0, Lo/cwk;->k:Ljava/util/Timer;

    return-object p1
.end method

.method private b()V
    .locals 2

    .line 211
    sget-object v0, Lo/cwk;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cwk$3;

    invoke-direct {v1, p0}, Lo/cwk$3;-><init>(Lo/cwk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 240
    return-void
.end method

.method static synthetic c(Lo/cwk;)Ljava/io/File;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->e:Ljava/io/File;

    return-object v0
.end method

.method private d()Ljava/lang/String;
    .locals 4

    .line 290
    const/4 v1, 0x0

    .line 291
    const/16 v0, 0xb

    new-array v2, v0, [B

    .line 292
    invoke-static {}, Lo/cwk;->a()Ljava/security/SecureRandom;

    move-result-object v3

    .line 293
    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 294
    const/4 v0, 0x2

    invoke-static {v2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 296
    return-object v1
.end method

.method private d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 150
    iput-object p3, p0, Lo/cwk;->f:Ljava/lang/String;

    .line 151
    invoke-static {p1}, Lo/dbf;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 152
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cwk;->d:Ljava/util/List;

    .line 154
    iget-object v0, p0, Lo/cwk;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    invoke-static {}, Lo/dhu;->a()Ljava/lang/String;

    move-result-object v6

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 157
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cwk;->e:Ljava/io/File;

    .line 158
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cwk;->g:Landroid/content/Context;

    .line 160
    new-instance v8, Ljava/io/File;

    sget-object v0, Lo/cwk;->c:Ljava/lang/String;

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create phoneService dir fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/cwk;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cwk;->a:Ljava/lang/String;

    .line 168
    sget-object v0, Lo/cwk;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/cwk$2;

    invoke-direct {v1, p0}, Lo/cwk$2;-><init>(Lo/cwk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 205
    iget-object v0, p0, Lo/cwk;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/cwk;)Ljava/util/List;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->d:Ljava/util/List;

    return-object v0
.end method

.method private e(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    .line 254
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 255
    sget-object v5, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 256
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 257
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 258
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 259
    invoke-virtual {v6, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 260
    const/4 v11, 0x0

    .line 262
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v0

    .line 265
    goto :goto_0

    .line 263
    :catch_0
    move-exception v12

    .line 264
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    :goto_0
    const-string v0, "phone"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/telephony/TelephonyManager;

    .line 268
    invoke-static/range {p1 .. p1}, Lo/dbf;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    .line 269
    const-string v0, ""

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    :try_start_1
    invoke-virtual {v12}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v13

    .line 278
    goto :goto_1

    .line 272
    :catch_1
    move-exception v14

    .line 273
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFileName() getSimSerialNumber()->SecurityException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const-string v13, ""

    .line 278
    goto :goto_1

    .line 275
    :catch_2
    move-exception v14

    .line 276
    const-string v0, "HWFeedbackApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFileName() getSimSerialNumber()->Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const-string v13, ""

    .line 279
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v13, :cond_0

    const-string v0, ""

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    :cond_0
    const-string v13, "000000000000000"

    .line 283
    :cond_1
    invoke-static {v13}, Lcom/huawei/common/applog/AppLogApi;->getEncryImei(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 285
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_app-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 286
    return-object v15
.end method

.method static synthetic e(Lo/cwk;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/cwk;->b()V

    return-void
.end method

.method static synthetic i(Lo/cwk;)Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lo/cwk;)Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/cwk;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public c(Landroid/app/Activity;)I
    .locals 9

    .line 113
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/common/applog/AppLogApi;->setAutoUploadFlag(Landroid/content/Context;Z)V

    .line 117
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 119
    const-string v3, "28"

    .line 120
    const/4 v4, 0x0

    .line 121
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 122
    const-string v4, "health"

    .line 123
    const-string v3, "28"

    goto :goto_0

    .line 125
    :cond_1
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 126
    const-string v4, "bone"

    .line 127
    const-string v3, "27"

    .line 129
    :cond_2
    :goto_0
    const-string v0, "appId"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "questionType"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-direct {p0}, Lo/cwk;->d()Ljava/lang/String;

    move-result-object v5

    .line 135
    const-string v0, "aesSecret"

    invoke-virtual {v2, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 138
    const-string v0, "packageName"

    invoke-virtual {v2, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, "packageVersion"

    invoke-static {p1}, Lo/dbf;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-direct {p0, p1, v6, v3}, Lo/cwk;->e(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 144
    invoke-direct {p0, p1, v7, v5}, Lo/cwk;->d(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 145
    const-string v0, "logfilePath"

    invoke-virtual {v2, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-static {p1, v2}, Lcom/huawei/feedback/FeedbackApi;->gotoFeedback(Landroid/content/Context;Landroid/os/Bundle;)I

    move-result v0

    return v0
.end method
