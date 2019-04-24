.class public Lcom/huawei/wallet/logic/down/AppDownManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;,
        Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;,
        Lcom/huawei/wallet/logic/down/AppDownManager$SingletoneHolder;
    }
.end annotation


# static fields
.field private static volatile b:Landroid/content/Context;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Landroid/os/Handler;

.field private d:Ljava/lang/String;

.field private e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

.field private g:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/logic/down/AppDownManager$1;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/AppDownManager;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/os/Handler;)I
    .locals 3

    .line 407
    new-instance v2, Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    invoke-direct {v2}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;-><init>()V

    .line 409
    invoke-virtual {v2, p1}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 410
    const-string v0, "AppDownManager installAppStatus slient."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 411
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->g:Ljava/lang/String;

    invoke-virtual {v2, p1, p2, v0, v1}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->d(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    return v0

    .line 414
    :cond_1
    const-string v0, "AppDownManager installAppStatus normal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 415
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->a:Ljava/lang/String;

    invoke-virtual {v2, p1, v0}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    :goto_1
    return v0
.end method

.method static synthetic a(Lcom/huawei/wallet/logic/down/AppDownManager;Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)Z
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 329
    const/4 v2, 0x0

    .line 332
    :try_start_0
    invoke-static {p1, p2}, Lcom/huawei/wallet/utils/crypto/PBKDF2;->b(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    const/4 v2, 0x1

    .line 346
    :cond_0
    goto :goto_0

    .line 337
    :catch_0
    move-exception v3

    .line 339
    const/4 v2, 0x0

    .line 340
    const-string v0, "AppDownManager PBKDF2 validate sign name cause exception: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 346
    goto :goto_0

    .line 342
    :catch_1
    move-exception v3

    .line 344
    const/4 v2, 0x0

    .line 345
    const-string v0, "AppDownManager PBKDF2 validate sign name cause exception: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 347
    :goto_0
    return v2
.end method

.method static synthetic b(Lcom/huawei/wallet/logic/down/AppDownManager;)Landroid/os/Handler;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private static b(Landroid/content/Context;)V
    .locals 2

    .line 148
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 149
    return-void

    .line 151
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 152
    const-string v0, "AppDownManager getInstance context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 153
    return-void

    .line 155
    :cond_1
    invoke-static {}, Lcom/huawei/wallet/logic/down/BaseCommonContext;->d()Lcom/huawei/wallet/logic/down/BaseCommonContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/wallet/logic/down/BaseCommonContext;->d(Landroid/content/Context;)V

    .line 156
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    .line 157
    return-void
.end method

.method static synthetic b(Lcom/huawei/wallet/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/wallet/logic/down/AppDownManager;->c(Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method private b(Lcom/huawei/wallet/logic/down/DownloadEntity;Ljava/lang/String;)Z
    .locals 3

    .line 264
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 265
    const-string v0, "AppDownManager dealWithValidate, but entity is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 266
    const/4 v0, 0x0

    return v0

    .line 268
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/wallet/logic/down/DownloadEntity;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    .line 269
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager dealWithValidate isValidateOk = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 270
    return v2
.end method

.method static synthetic c(Lcom/huawei/wallet/logic/down/AppDownManager;)Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->g:Ljava/lang/String;

    return-object v0
.end method

.method private c(Landroid/os/Handler;IILjava/lang/Object;)V
    .locals 3

    .line 440
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 442
    const-string v0, "AppDownManager sendDownMsg handler is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 443
    return-void

    .line 445
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 446
    iput p3, v2, Landroid/os/Message;->arg1:I

    .line 447
    iput-object p4, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 448
    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 449
    return-void
.end method

.method public static d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;
    .locals 1

    .line 143
    invoke-static {p0}, Lcom/huawei/wallet/logic/down/AppDownManager;->b(Landroid/content/Context;)V

    .line 144
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager$SingletoneHolder;->d:Lcom/huawei/wallet/logic/down/AppDownManager;

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 283
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    const-string v0, "AppDownManager encrypPkgSignName is null, do not validate."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 286
    const/4 v0, 0x1

    return v0

    .line 288
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    const-string v0, "AppDownManager filePath is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 291
    const/4 v0, 0x0

    return v0

    .line 293
    :cond_1
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 294
    .line 295
    const/16 v0, 0xc0

    invoke-virtual {v2, p2, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 297
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 298
    const-string v0, "AppDownManager packageInfo is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 299
    const/4 v0, 0x0

    return v0

    .line 302
    :cond_2
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 303
    const-string v0, "AppDownManager packageInfo.signatures is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 304
    const/4 v0, 0x0

    return v0

    .line 307
    :cond_3
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    if-gtz v0, :cond_4

    .line 308
    const-string v0, "AppDownManager packageInfo.signatures.length <= 0 ."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 309
    const/4 v0, 0x0

    return v0

    .line 312
    :cond_4
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v4

    .line 313
    invoke-direct {p0, v4, p1}, Lcom/huawei/wallet/logic/down/AppDownManager;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 314
    const-string v0, "AppDownManager validate success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 315
    const/4 v0, 0x1

    return v0

    .line 317
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private e()V
    .locals 3

    .line 504
    const-string v0, "AppDownManager registerInstallReceiver."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 505
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 507
    const-string v0, "AppDownManager registerInstallReceiver mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 508
    return-void

    .line 510
    :cond_0
    new-instance v0, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;-><init>(Lcom/huawei/wallet/logic/down/AppDownManager;Lcom/huawei/wallet/logic/down/AppDownManager$1;)V

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    .line 511
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 512
    const-string v0, "package"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 513
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 514
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 523
    const-string v0, "AppDownManager unRegisterInstallReceiver."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 524
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 526
    const-string v0, "AppDownManager unRegisterInstallReceiver mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 527
    return-void

    .line 529
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 531
    const-string v0, "AppDownManager unRegisterInstallReceiver appInstallReceive is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->c(Ljava/lang/String;Z)V

    .line 532
    return-void

    .line 534
    :cond_1
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 535
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->e:Lcom/huawei/wallet/logic/down/AppDownManager$AppInstallReceive;

    .line 536
    return-void
.end method

.method public b()Z
    .locals 6

    .line 587
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 588
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v2

    .line 589
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 591
    const-string v0, "AppDownManager packages is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 592
    const/4 v0, 0x0

    return v0

    .line 594
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/pm/ApplicationInfo;

    .line 596
    const-string v0, "com.huawei.appmarket"

    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 598
    const-string v0, "AppDownManager isMarketPackageInstalled market install."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 599
    const/4 v0, 0x1

    return v0

    .line 601
    :cond_1
    goto :goto_0

    .line 602
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 2

    .line 425
    const-string v0, "AppDownManager finishDownFile."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 426
    invoke-static {}, Lcom/huawei/wallet/logic/down/DownloadManager;->c()Lcom/huawei/wallet/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/down/DownloadManager;->e(Ljava/lang/String;)V

    .line 427
    return-void
.end method

.method public d(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 359
    iput-object p4, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->a:Ljava/lang/String;

    .line 360
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 361
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    .line 362
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 364
    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->g:Ljava/lang/String;

    goto :goto_1

    .line 368
    :cond_1
    iput-object p3, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->g:Ljava/lang/String;

    .line 370
    :goto_1
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    .line 371
    if-nez v2, :cond_2

    if-nez v3, :cond_2

    if-eqz v4, :cond_3

    .line 373
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager installPackage isContextNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  isApkFilePathNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " isPackageNameNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 375
    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 376
    return-void

    .line 379
    :cond_3
    iput-object p2, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->c:Landroid/os/Handler;

    .line 381
    invoke-direct {p0, p1, p2}, Lcom/huawei/wallet/logic/down/AppDownManager;->a(Landroid/content/Context;Landroid/os/Handler;)I

    move-result v5

    .line 383
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager installPackage installCode ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 384
    const/4 v0, 0x1

    if-ne v5, v0, :cond_4

    .line 386
    const-string v0, "AppDownManager installPackage silence."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 387
    const/16 v0, 0x3ed

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 389
    :cond_4
    const/4 v0, 0x2

    if-ne v5, v0, :cond_5

    .line 391
    const-string v0, "AppDownManager installPackage normal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 392
    invoke-direct {p0}, Lcom/huawei/wallet/logic/down/AppDownManager;->e()V

    .line 394
    :cond_5
    :goto_2
    return-void
.end method

.method public e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 8

    .line 174
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 176
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p2, v0, v1, v2}, Lcom/huawei/wallet/logic/down/AppDownManager;->c(Landroid/os/Handler;IILjava/lang/Object;)V

    .line 177
    const-string v0, "AppDownManager startDownloadApp context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 178
    return-void

    .line 181
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p2, v0, v1, v2}, Lcom/huawei/wallet/logic/down/AppDownManager;->c(Landroid/os/Handler;IILjava/lang/Object;)V

    .line 184
    const-string v0, "AppDownManager startDownloadApp downUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 185
    return-void

    .line 188
    :cond_1
    new-instance v0, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;

    move-object v1, p0

    move-object v2, p4

    move-object v3, p5

    move-object v4, p2

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/huawei/wallet/logic/down/AppDownManager$MyIDownloadTaskListener;-><init>(Lcom/huawei/wallet/logic/down/AppDownManager;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Lcom/huawei/wallet/logic/down/AppDownManager$1;)V

    move-object v7, v0

    .line 189
    invoke-static {}, Lcom/huawei/wallet/logic/down/DownloadManager;->c()Lcom/huawei/wallet/logic/down/DownloadManager;

    move-result-object v0

    move-object v1, p3

    move-object v2, v7

    move-wide v3, p6

    move-wide/from16 v5, p8

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/wallet/logic/down/DownloadManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/down/IDownloadTaskListener;JJ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/AppDownManager;->d:Ljava/lang/String;

    .line 190
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 7

    .line 547
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 549
    const-string v0, "AppDownManager openHwMarketDetail mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 550
    return-void

    .line 553
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 555
    const-string v0, "AppDownManager openHwMarketDetail appDetailId is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 556
    return-void

    .line 561
    :cond_1
    :try_start_0
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.appmarket.intent.action.AppDetail.withid"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 562
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 563
    const-string v0, "appId"

    invoke-virtual {v6, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 564
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 565
    sget-object v0, Lcom/huawei/wallet/logic/down/AppDownManager;->b:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 575
    goto :goto_0

    .line 567
    :catch_0
    move-exception v6

    .line 571
    const-string v0, " AppDownManager openHwMarketDetail case exception:"

    move-object v1, v6

    const-string v2, "AppDownManager.openHwMarketDetail"

    .line 573
    invoke-virtual {v6}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 571
    const v2, 0x36118617

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;ZZ)V

    .line 576
    :goto_0
    return-void
.end method
