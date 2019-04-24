.class public Lcom/huawei/common/applog/AppLogPackLogService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String; = "AppLogApi/AppLogPackLogService"

.field private static final d:Ljava/lang/String; = "0"

.field private static final e:Ljava/lang/String; = "100001"

.field private static final f:Ljava/lang/String; = "100002"

.field private static final g:Ljava/lang/String; = "100003"

.field private static final h:Ljava/lang/String; = "100004"

.field private static final i:Ljava/lang/String; = "100005"


# instance fields
.field public final a:Ljava/lang/Object;

.field b:Lcom/huawei/logupload/g$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/common/applog/AppLogPackLogService;->a:Ljava/lang/Object;

    .line 63
    new-instance v0, Lcom/huawei/common/applog/b;

    invoke-direct {v0, p0}, Lcom/huawei/common/applog/b;-><init>(Lcom/huawei/common/applog/AppLogPackLogService;)V

    iput-object v0, p0, Lcom/huawei/common/applog/AppLogPackLogService;->b:Lcom/huawei/logupload/g$a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 185
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 187
    const-string v0, "status"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string v0, "message"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string v0, "filePath"

    invoke-virtual {v1, v0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string v0, "encryKey"

    invoke-virtual {v1, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-object v1
.end method

.method private a()V
    .locals 1

    .line 302
    invoke-virtual {p0}, Lcom/huawei/common/applog/AppLogPackLogService;->stopSelf()V

    .line 303
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->f()V

    .line 304
    return-void
.end method

.method static synthetic a(Lcom/huawei/common/applog/AppLogPackLogService;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/common/applog/AppLogPackLogService;->a()V

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 5

    .line 290
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v3, v0, :cond_1

    .line 292
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v4

    .line 293
    const-string v0, "AppLogApi/AppLogPackLogService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resultZipFile delete success ? "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    if-eqz v4, :cond_0

    .line 295
    goto :goto_1

    .line 291
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 299
    :cond_1
    :goto_1
    return-void
.end method

.method private a(Ljava/io/File;Ljava/io/File;)Z
    .locals 1

    .line 285
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/common/applog/AppLogPackLogService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/common/applog/AppLogPackLogService;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 13

    .line 209
    const/4 v4, 0x0

    .line 210
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    const-string v0, "AppLogApi/AppLogPackLogService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "logwritePath"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    invoke-static/range {p3 .. p3}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 214
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 215
    const-string v0, "100004"

    const-string v1, "get log fail"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 218
    :cond_1
    array-length v5, v4

    .line 219
    if-lez v5, :cond_8

    .line 220
    new-array v6, v5, [Ljava/io/File;

    .line 221
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    .line 222
    const-string v0, "AppLogApi/AppLogPackLogService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fileName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, v4, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    new-instance v0, Ljava/io/File;

    aget-object v1, v4, v7

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v0, v6, v7

    .line 221
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 225
    :cond_2
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 226
    const-string v0, "AppLogApi/AppLogPackLogService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "waitUploadZipfile"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    const/4 v8, 0x0

    :goto_1
    const/4 v0, 0x2

    if-ge v8, v0, :cond_8

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 229
    invoke-static {v6, v7, v0}, Lcom/huawei/feedback/e;->a([Ljava/io/File;Ljava/io/File;Landroid/content/Context;)Z

    move-result v9

    .line 231
    if-eqz v9, :cond_6

    .line 232
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "waitUploadZipfile zipflag good"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 235
    .line 236
    invoke-static/range {p4 .. p4}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 237
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 239
    .line 240
    invoke-virtual {p0}, Lcom/huawei/common/applog/AppLogPackLogService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 239
    const/4 v1, 0x1

    invoke-static {v7, v10, v1, v0}, Lcom/huawei/phoneserviceuni/common/e/a/b/a/a;->a(Ljava/io/File;Ljava/lang/String;ZLandroid/content/Context;)Ljava/io/File;

    move-result-object v11

    .line 242
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 243
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 244
    invoke-direct {p0, v11, v12}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/io/File;Ljava/io/File;)Z

    .line 245
    invoke-direct {p0, v7}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/io/File;)V

    .line 247
    const-string v0, "0"

    const-string v1, ""

    move-object/from16 v2, p4

    invoke-direct {p0, v0, v1, p1, v2}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 251
    :cond_3
    const-string v0, "100003"

    const-string v1, "Write data to sdcard failed "

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 258
    :cond_4
    invoke-direct {p0, v7}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/io/File;)V

    .line 259
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "encryptKey null,encryptFile failed!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    const-string v0, "100005"

    const-string v1, "secretKey is null"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 267
    :cond_5
    invoke-direct {p0, v7}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/io/File;)V

    .line 268
    const-string v0, "100005"

    const-string v1, "secretKey is null"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 273
    :cond_6
    const/4 v0, 0x1

    if-ne v8, v0, :cond_7

    .line 275
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "zipflag fail!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 276
    const-string v0, "100004"

    const-string v1, "zip fail"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 227
    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 281
    :cond_8
    const-string v0, "100005"

    const-string v1, "other exception"

    const-string v2, ""

    const-string v3, ""

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/common/applog/AppLogPackLogService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 60
    const-string v0, "AppLogApi/AppLogPackLogService"

    const-string v1, "onBind"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogPackLogService;->b:Lcom/huawei/logupload/g$a;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 309
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 310
    invoke-static {}, Lcom/huawei/common/applog/bean/d;->a()Lcom/huawei/common/applog/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/d;->f()V

    .line 311
    return-void
.end method
