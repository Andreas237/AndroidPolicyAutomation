.class public Lcom/huawei/hms/update/e/s;
.super Lcom/huawei/hms/update/e/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/update/e/s$a;
    }
.end annotation


# instance fields
.field private k:Landroid/content/BroadcastReceiver;

.field private l:Landroid/os/Handler;

.field private m:I

.field private n:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/hms/update/e/a;-><init>()V

    .line 42
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/e/s;->m:I

    .line 376
    new-instance v0, Lcom/huawei/hms/update/e/t;

    invoke-direct {v0, p0}, Lcom/huawei/hms/update/e/t;-><init>(Lcom/huawei/hms/update/e/s;)V

    iput-object v0, p0, Lcom/huawei/hms/update/e/s;->n:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    .line 248
    const/4 v1, 0x0

    .line 249
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 253
    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 255
    :cond_1
    return-void

    .line 258
    :cond_2
    const-string v0, "downloadtask.status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 259
    const-string v0, "downloadtask.status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 261
    const/4 v0, 0x3

    if-eq v2, v0, :cond_3

    const/4 v0, 0x5

    if-eq v2, v0, :cond_3

    const/4 v0, 0x6

    if-eq v2, v0, :cond_3

    const/16 v0, 0x8

    if-ne v2, v0, :cond_4

    .line 265
    :cond_3
    invoke-direct {p0, v2}, Lcom/huawei/hms/update/e/s;->c(I)V

    goto :goto_0

    .line 266
    :cond_4
    const/4 v0, 0x4

    if-ne v2, v0, :cond_5

    .line 268
    const v0, 0xea60

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/e/s;->b(I)V

    goto :goto_0

    .line 271
    :cond_5
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/e/s;->b(I)V

    .line 274
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/update/e/s;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method private a(Landroid/app/Activity;)Z
    .locals 9

    .line 128
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    const/4 v0, 0x0

    return v0

    .line 132
    :cond_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.intent.action.ThirdUpdateAction"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 133
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 135
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 136
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 138
    const-string v0, "pkgName"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hms/update/e/s;->g:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    const-string v0, "versioncode"

    iget v1, p0, Lcom/huawei/hms/update/e/s;->i:I

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    goto :goto_0

    .line 140
    :catch_0
    move-exception v8

    .line 141
    const-string v0, "SilentUpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "create hmsJsonObject fail"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const/4 v0, 0x0

    return v0

    .line 145
    :goto_0
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 147
    const-string v0, "params"

    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    const-string v0, "isHmsOrApkUpgrade"

    iget-object v1, p0, Lcom/huawei/hms/update/e/s;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v1}, Lcom/huawei/hms/update/e/u;->a()Z

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 149
    const-string v0, "buttonDlgY"

    const-string v1, "hms_install"

    invoke-static {v1}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 150
    const-string v0, "buttonDlgN"

    const-string v1, "hms_cancel"

    invoke-static {v1}, Lcom/huawei/hms/c/h;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 151
    const-string v0, "upgradeDlgContent"

    const-string v1, "hms_update_message_new"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "%P"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Lcom/huawei/hms/c/h;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->c()I

    move-result v0

    invoke-virtual {p1, v5, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 158
    goto :goto_1

    .line 155
    :catch_1
    move-exception v8

    .line 156
    const-string v0, "SilentUpdateWizard"

    const-string v1, "ActivityNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const/4 v0, 0x0

    return v0

    .line 159
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method private b(I)V
    .locals 4

    .line 203
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/hms/update/e/s$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hms/update/e/s$a;-><init>(Lcom/huawei/hms/update/e/s;Lcom/huawei/hms/update/e/t;)V

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 205
    return-void
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 3

    .line 281
    const/4 v1, 0x0

    .line 282
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    const-string v0, "UpgradePkgName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 287
    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 289
    :cond_1
    return-void

    .line 292
    :cond_2
    const-string v0, "UpgradeDownloadProgress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "UpgradeAppName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 294
    const-string v0, "UpgradeDownloadProgress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 296
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/e/s;->b(I)V

    .line 300
    const/16 v0, 0x63

    if-lt v2, v0, :cond_3

    .line 301
    const/16 v2, 0x63

    .line 304
    :cond_3
    iput v2, p0, Lcom/huawei/hms/update/e/s;->m:I

    .line 306
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;

    if-nez v0, :cond_4

    .line 307
    const-class v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/s;->a(Ljava/lang/Class;)V

    .line 310
    :cond_4
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;

    if-eqz v0, :cond_5

    .line 311
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;

    check-cast v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/update/e/i;->b(I)V

    .line 314
    :cond_5
    return-void
.end method

.method static synthetic b(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method private c(I)V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 226
    invoke-direct {p0}, Lcom/huawei/hms/update/e/s;->f()V

    .line 227
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->b()V

    .line 229
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/s;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hms/update/e/s;->b(II)V

    goto :goto_0

    .line 232
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hms/update/e/s;->a(II)V

    .line 234
    :goto_0
    return-void
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 4

    .line 323
    const-string v0, "packagename"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 324
    const-string v0, "packagename"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 325
    const-string v0, "status"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 327
    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->g:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 329
    :cond_0
    return-void

    .line 333
    :cond_1
    const/4 v0, 0x2

    if-ne v3, v0, :cond_3

    .line 335
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;

    if-eqz v0, :cond_2

    .line 337
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;

    check-cast v0, Lcom/huawei/hms/update/e/i;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/i;->b(I)V

    .line 339
    :cond_2
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/s;->b(II)V

    goto :goto_0

    .line 340
    :cond_3
    const/4 v0, -0x1

    if-eq v3, v0, :cond_4

    const/4 v0, -0x2

    if-ne v3, v0, :cond_5

    .line 342
    :cond_4
    invoke-direct {p0, v3}, Lcom/huawei/hms/update/e/s;->c(I)V

    goto :goto_0

    .line 345
    :cond_5
    const v0, 0xea60

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/e/s;->b(I)V

    .line 348
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/hms/update/e/s;Landroid/os/Bundle;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method private e()V
    .locals 4

    .line 171
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 172
    const-string v0, "com.huawei.appmarket.service.downloadservice.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 173
    const-string v0, "com.huawei.appmarket.service.downloadservice.progress.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 174
    const-string v0, "com.huawei.appmarket.service.installerservice.Receiver"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 175
    new-instance v0, Lcom/huawei/hms/update/d/a;

    iget-object v1, p0, Lcom/huawei/hms/update/e/s;->n:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/huawei/hms/update/d/a;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/hms/update/e/s;->k:Landroid/content/BroadcastReceiver;

    .line 176
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->a()Landroid/app/Activity;

    move-result-object v3

    .line 177
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v3, v0, v2}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 180
    :cond_0
    return-void
.end method

.method private f()V
    .locals 2

    .line 186
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->a()Landroid/app/Activity;

    move-result-object v1

    .line 187
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->k:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/s;->k:Landroid/content/BroadcastReceiver;

    .line 191
    :cond_0
    return-void
.end method


# virtual methods
.method a(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hms/update/e/b;>;)V"
        }
    .end annotation

    .line 356
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/update/e/b;

    .line 357
    iget v0, p0, Lcom/huawei/hms/update/e/s;->m:I

    if-lez v0, :cond_0

    instance-of v0, v3, Lcom/huawei/hms/update/e/i;

    if-eqz v0, :cond_0

    .line 358
    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/update/e/i;

    iget v1, p0, Lcom/huawei/hms/update/e/s;->m:I

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/i;->a(I)V

    .line 360
    :cond_0
    invoke-virtual {v3, p0}, Lcom/huawei/hms/update/e/b;->a(Lcom/huawei/hms/update/e/a;)V

    .line 361
    iput-object v3, p0, Lcom/huawei/hms/update/e/s;->d:Lcom/huawei/hms/update/e/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 364
    goto :goto_0

    .line 362
    :catch_0
    move-exception v3

    .line 363
    const-string v0, "SilentUpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In showDialog, Failed to show the dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    :goto_0
    return-void
.end method

.method public c()I
    .locals 1

    .line 195
    const/16 v0, 0x7d0

    return v0
.end method

.method d()V
    .locals 2

    .line 369
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/s;->b(II)V

    .line 370
    return-void
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 2

    .line 56
    invoke-super {p0, p1}, Lcom/huawei/hms/update/e/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 58
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_0

    .line 59
    return-void

    .line 62
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    .line 66
    invoke-direct {p0, p1}, Lcom/huawei/hms/update/e/s;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/s;->a(Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/s;->b(II)V

    goto :goto_0

    .line 71
    :cond_1
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/s;->a(II)V

    .line 75
    :cond_2
    :goto_0
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 2

    .line 79
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/hms/update/e/s;->f()V

    .line 81
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeActivityDestroy()V

    .line 82
    return-void
.end method

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/s;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/huawei/hms/update/e/s;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hms/activity/a;->onBridgeActivityResult(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 99
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->c()I

    move-result v0

    if-ne p1, v0, :cond_4

    .line 100
    if-nez p2, :cond_1

    .line 102
    invoke-direct {p0}, Lcom/huawei/hms/update/e/s;->e()V

    .line 103
    const/16 v0, 0x4e20

    invoke-direct {p0, v0}, Lcom/huawei/hms/update/e/s;->b(I)V

    .line 104
    const/4 v0, 0x1

    return v0

    .line 105
    :cond_1
    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 107
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/s;->d()V

    .line 108
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/s;->a(Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 113
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    invoke-virtual {p0, p2, v0}, Lcom/huawei/hms/update/e/s;->b(II)V

    goto :goto_0

    .line 115
    :cond_3
    iget v0, p0, Lcom/huawei/hms/update/e/s;->f:I

    invoke-virtual {p0, p2, v0}, Lcom/huawei/hms/update/e/s;->a(II)V

    .line 117
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public onBridgeConfigurationChanged()V
    .locals 0

    .line 164
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeConfigurationChanged()V

    .line 165
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 0

    .line 239
    invoke-super {p0, p1, p2}, Lcom/huawei/hms/update/e/a;->onKeyUp(ILandroid/view/KeyEvent;)V

    .line 240
    return-void
.end method
