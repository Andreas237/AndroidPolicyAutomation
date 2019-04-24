.class public Lcom/huawei/hwid/update/d/i;
.super Lcom/huawei/hwid/update/d/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/update/d/i$a;
    }
.end annotation


# instance fields
.field private j:Landroid/content/BroadcastReceiver;

.field private k:Landroid/os/Handler;

.field private l:I

.field private m:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/a;-><init>()V

    .line 43
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/d/i;->l:I

    .line 387
    new-instance v0, Lcom/huawei/hwid/update/d/i$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwid/update/d/i$1;-><init>(Lcom/huawei/hwid/update/d/i;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/i;->m:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    .line 255
    const/4 v1, 0x0

    .line 256
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 257
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 260
    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 262
    :cond_1
    return-void

    .line 265
    :cond_2
    const-string v0, "downloadtask.status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 266
    const-string v0, "downloadtask.status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 268
    const/4 v0, 0x3

    if-eq v2, v0, :cond_3

    const/4 v0, 0x5

    if-eq v2, v0, :cond_3

    const/4 v0, 0x6

    if-eq v2, v0, :cond_3

    const/16 v0, 0x8

    if-ne v2, v0, :cond_4

    .line 272
    :cond_3
    invoke-direct {p0, v2}, Lcom/huawei/hwid/update/d/i;->c(I)V

    goto :goto_0

    .line 273
    :cond_4
    const/4 v0, 0x4

    if-ne v2, v0, :cond_5

    .line 275
    const v0, 0xea60

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/i;->b(I)V

    goto :goto_0

    .line 278
    :cond_5
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/i;->b(I)V

    .line 281
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/update/d/i;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method private b(I)V
    .locals 4

    .line 209
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/hwid/update/d/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hwid/update/d/i$a;-><init>(Lcom/huawei/hwid/update/d/i;Lcom/huawei/hwid/update/d/i$1;)V

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 211
    return-void
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 3

    .line 288
    const/4 v1, 0x0

    .line 289
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 294
    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    :cond_1
    return-void

    .line 299
    :cond_2
    const-string v0, "UpgradeDownloadProgress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "UpgradeAppName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 301
    const-string v0, "UpgradeDownloadProgress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 303
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/i;->b(I)V

    .line 307
    const/16 v0, 0x63

    if-lt v2, v0, :cond_3

    .line 308
    const/16 v2, 0x63

    .line 311
    :cond_3
    iput v2, p0, Lcom/huawei/hwid/update/d/i;->l:I

    .line 313
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;

    if-nez v0, :cond_4

    .line 314
    const-class v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/i;->a(Ljava/lang/Class;)V

    .line 317
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;

    if-eqz v0, :cond_5

    .line 318
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;

    check-cast v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {v0, v2}, Lcom/huawei/hwid/update/d/e;->b(I)V

    .line 321
    :cond_5
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method private b(Landroid/app/Activity;)Z
    .locals 9

    .line 133
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.intent.action.ThirdUpdateAction"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 138
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 141
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 144
    const-string v0, "pkgName"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hwid/update/d/i;->g:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    const-string v0, "versioncode"

    iget v1, p0, Lcom/huawei/hwid/update/d/i;->i:I

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    goto :goto_0

    .line 146
    :catch_0
    move-exception v8

    .line 147
    const-string v0, "SilentUpdateWizard"

    const-string v1, "create hmsJsonObject fail"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const/4 v0, 0x0

    return v0

    .line 151
    :goto_0
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 153
    const-string v0, "params"

    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    const-string v0, "isHmsOrApkUpgrade"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 155
    const-string v0, "buttonDlgY"

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v2

    const-string v3, "CS_install"

    invoke-static {v2, v3}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 156
    const-string v0, "buttonDlgN"

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v2

    const-string v3, "cs_cancel"

    invoke-static {v2, v3}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    const-string v0, "upgradeDlgContent"

    const-string v1, "cs_update_message_new"

    invoke-static {p1, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "%P"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->f()I

    move-result v0

    invoke-virtual {p1, v5, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    goto :goto_1

    .line 161
    :catch_1
    move-exception v8

    .line 162
    const-string v0, "SilentUpdateWizard"

    const-string v1, "ActivityNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private c(I)V
    .locals 2

    .line 231
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 232
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/i;->h()V

    .line 233
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->e()V

    .line 235
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/i;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 236
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwid/update/d/i;->a(II)V

    .line 241
    :cond_0
    return-void
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 4

    .line 330
    const-string v0, "packagename"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 331
    const-string v0, "packagename"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 332
    const-string v0, "status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 334
    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->g:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 336
    :cond_0
    return-void

    .line 340
    :cond_1
    const/4 v0, 0x2

    if-ne v3, v0, :cond_3

    .line 342
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;

    if-eqz v0, :cond_2

    .line 344
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;

    check-cast v0, Lcom/huawei/hwid/update/d/e;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/update/d/e;->b(I)V

    .line 346
    :cond_2
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/i;->a(II)V

    goto :goto_0

    .line 347
    :cond_3
    const/4 v0, -0x1

    if-eq v3, v0, :cond_4

    const/4 v0, -0x2

    if-ne v3, v0, :cond_5

    .line 349
    :cond_4
    invoke-direct {p0, v3}, Lcom/huawei/hwid/update/d/i;->c(I)V

    goto :goto_0

    .line 352
    :cond_5
    const v0, 0xea60

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/i;->b(I)V

    .line 355
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/update/d/i;Landroid/os/Bundle;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method private g()V
    .locals 4

    .line 177
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 178
    const-string v0, "com.huawei.appmarket.service.downloadservice.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 179
    const-string v0, "com.huawei.appmarket.service.downloadservice.progress.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 180
    const-string v0, "com.huawei.appmarket.service.installerservice.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 181
    new-instance v0, Lcom/huawei/hwid/update/receive/SilentInstallReceive;

    iget-object v1, p0, Lcom/huawei/hwid/update/d/i;->m:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/huawei/hwid/update/receive/SilentInstallReceive;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/i;->j:Landroid/content/BroadcastReceiver;

    .line 182
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v3

    .line 183
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 184
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v3, v0, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 186
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 192
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->d()Landroid/app/Activity;

    move-result-object v1

    .line 193
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->j:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 195
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/i;->j:Landroid/content/BroadcastReceiver;

    .line 197
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 82
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/i;->h()V

    .line 83
    invoke-super {p0}, Lcom/huawei/hwid/update/d/a;->a()V

    .line 84
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)V
    .locals 0

    .line 246
    invoke-super {p0, p1, p2}, Lcom/huawei/hwid/update/d/a;->a(ILandroid/view/KeyEvent;)V

    .line 247
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    .line 57
    invoke-super {p0, p1}, Lcom/huawei/hwid/update/d/a;->a(Landroid/app/Activity;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->c:Lcom/huawei/hwid/update/d/j;

    if-nez v0, :cond_0

    .line 60
    return-void

    .line 63
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/d/i;->b(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/i;->a(Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 70
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/i;->a(II)V

    .line 77
    :cond_1
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwid/update/d/b;>;)V"
        }
    .end annotation

    .line 363
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/update/d/b;

    .line 364
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->l:I

    if-lez v0, :cond_0

    instance-of v0, v2, Lcom/huawei/hwid/update/d/e;

    if-eqz v0, :cond_0

    .line 365
    move-object v0, v2

    check-cast v0, Lcom/huawei/hwid/update/d/e;

    iget v1, p0, Lcom/huawei/hwid/update/d/i;->l:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/update/d/e;->a(I)V

    .line 367
    :cond_0
    invoke-virtual {v2, p0}, Lcom/huawei/hwid/update/d/b;->a(Lcom/huawei/hwid/update/d/a;)V

    .line 368
    iput-object v2, p0, Lcom/huawei/hwid/update/d/i;->d:Lcom/huawei/hwid/update/d/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    .line 375
    goto :goto_0

    .line 369
    :catch_0
    move-exception v2

    .line 370
    const-string v0, "SilentUpdateWizard"

    const-string v1, "In showDialog, InstantiationException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    goto :goto_0

    .line 371
    :catch_1
    move-exception v2

    .line 372
    const-string v0, "SilentUpdateWizard"

    const-string v1, "In showDialog, IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    goto :goto_0

    .line 373
    :catch_2
    move-exception v2

    .line 374
    const-string v0, "SilentUpdateWizard"

    const-string v1, "In showDialog, IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    :goto_0
    return-void
.end method

.method public a(IILandroid/content/Intent;)Z
    .locals 2

    .line 97
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/i;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/huawei/hwid/update/d/i;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwid/activity/a;->a(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 101
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->f()I

    move-result v0

    if-ne p1, v0, :cond_5

    .line 102
    if-nez p2, :cond_1

    .line 104
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/i;->g()V

    .line 105
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/i;->b(I)V

    .line 106
    const/4 v0, 0x1

    return v0

    .line 108
    :cond_1
    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 110
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/i;->c()V

    .line 111
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_2
    const/4 v1, 0x1

    .line 114
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 115
    const/4 v1, 0x0

    .line 120
    :cond_3
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/update/d/i;->a(Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 121
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    invoke-virtual {p0, p2, v0}, Lcom/huawei/hwid/update/d/i;->a(II)V

    .line 123
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 125
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 0

    .line 170
    invoke-super {p0}, Lcom/huawei/hwid/update/d/a;->b()V

    .line 171
    return-void
.end method

.method c()V
    .locals 2

    .line 380
    iget v0, p0, Lcom/huawei/hwid/update/d/i;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/i;->a(II)V

    .line 381
    return-void
.end method

.method public f()I
    .locals 1

    .line 201
    const/16 v0, 0x7d0

    return v0
.end method
