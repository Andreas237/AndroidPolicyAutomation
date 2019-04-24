.class public Lcom/huawei/hwid/update/d/k;
.super Lcom/huawei/hwid/update/d/a;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/update/a/a/b;


# instance fields
.field private j:Lcom/huawei/hwid/update/a/a/a;

.field private k:Lcom/huawei/hwid/update/a/a/c;

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/a;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/d/k;->l:I

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 6

    .line 241
    new-instance v2, Lcom/huawei/hwid/d/d;

    invoke-direct {v2, p0}, Lcom/huawei/hwid/d/d;-><init>(Landroid/content/Context;)V

    .line 242
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hwid.update.provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 245
    const/4 v5, 0x0

    .line 247
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_1

    .line 248
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 249
    const/4 v5, 0x1

    goto :goto_0

    .line 250
    :cond_0
    invoke-virtual {v2, v3, v4}, Lcom/huawei/hwid/d/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    const/4 v5, 0x1

    .line 255
    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    .line 256
    invoke-static {p0, v4, p1}, Lcom/huawei/hwid/update/provider/UpdateProvider;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 258
    :cond_2
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/hwid/update/a/a/b;)V
    .locals 3

    .line 365
    if-nez p1, :cond_0

    .line 366
    return-void

    .line 369
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->d()Landroid/app/Activity;

    move-result-object v2

    .line 370
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    :cond_1
    const/16 v0, 0x4b1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/huawei/hwid/update/d/k;->b(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    .line 372
    return-void

    .line 375
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwid/update/d/k$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwid/update/d/k$1;-><init>(Lcom/huawei/hwid/update/d/k;Lcom/huawei/hwid/update/a/a/b;)V

    invoke-static {v2, v0, v1}, Lcom/huawei/updatesdk/UpdateSdkAPI;->checkTargetAppUpdate(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V

    .line 447
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V
    .locals 0

    .line 37
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/update/d/k;->b(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 6

    .line 200
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->d()Landroid/app/Activity;

    move-result-object v2

    .line 201
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 202
    :cond_0
    return-void

    .line 213
    :cond_1
    invoke-static {v2, p1}, Lcom/huawei/hwid/update/d/k;->a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    .line 214
    if-nez v3, :cond_2

    .line 215
    const-string v0, "UpdateWizard"

    const-string v1, "In startInstaller, Failed to creates a Uri from a file."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    .line 217
    return-void

    .line 220
    :cond_2
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 221
    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 222
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 225
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->f()I

    move-result v0

    invoke-virtual {v2, v4, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    goto :goto_0

    .line 226
    :catch_0
    move-exception v5

    .line 227
    const-string v0, "UpdateWizard"

    const-string v1, "In startInstaller, Failed to start package installer."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    .line 231
    :goto_0
    return-void
.end method

.method private static b(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V
    .locals 2

    .line 450
    if-eqz p0, :cond_0

    .line 451
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hwid/update/d/k$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hwid/update/d/k$2;-><init>(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 460
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 319
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 320
    iget v0, p0, Lcom/huawei/hwid/update/d/k;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/k;->a(II)V

    .line 325
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 466
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->d()Landroid/app/Activity;

    move-result-object v2

    .line 467
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 468
    :cond_0
    const-class v0, Lcom/huawei/hwid/update/d/h$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 469
    return-void

    .line 473
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->i()V

    .line 474
    new-instance v0, Lcom/huawei/hwid/update/a/c;

    new-instance v1, Lcom/huawei/hwid/update/a/d;

    invoke-direct {v1, v2}, Lcom/huawei/hwid/update/a/d;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/huawei/hwid/update/a/c;-><init>(Lcom/huawei/hwid/update/a/a/a;)V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/k;->j:Lcom/huawei/hwid/update/a/a/a;

    .line 475
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->j:Lcom/huawei/hwid/update/a/a/a;

    iget-object v1, p0, Lcom/huawei/hwid/update/d/k;->k:Lcom/huawei/hwid/update/a/a/c;

    invoke-interface {v0, p0, v1}, Lcom/huawei/hwid/update/a/a/a;->a(Lcom/huawei/hwid/update/a/a/b;Lcom/huawei/hwid/update/a/a/c;)V

    .line 476
    return-void
.end method

.method private i()V
    .locals 1

    .line 482
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->j:Lcom/huawei/hwid/update/a/a/a;

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->j:Lcom/huawei/hwid/update/a/a/a;

    invoke-interface {v0}, Lcom/huawei/hwid/update/a/a/a;->a()V

    .line 484
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/k;->j:Lcom/huawei/hwid/update/a/a/a;

    .line 486
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->i()V

    .line 90
    invoke-super {p0}, Lcom/huawei/hwid/update/d/a;->a()V

    .line 91
    return-void
.end method

.method public a(IIILjava/io/File;)V
    .locals 5

    .line 156
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 158
    :sswitch_0
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->e()V

    .line 159
    if-nez p4, :cond_0

    .line 160
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    goto :goto_0

    .line 162
    :cond_0
    invoke-direct {p0, p4}, Lcom/huawei/hwid/update/d/k;->a(Ljava/io/File;)V

    .line 164
    goto :goto_0

    .line 167
    :sswitch_1
    goto :goto_0

    .line 169
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->d:Lcom/huawei/hwid/update/d/b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->d:Lcom/huawei/hwid/update/d/b;

    instance-of v0, v0, Lcom/huawei/hwid/update/d/e;

    if-eqz v0, :cond_2

    .line 170
    const/4 v4, 0x0

    .line 171
    if-ltz p2, :cond_1

    if-lez p3, :cond_1

    .line 172
    int-to-long v0, p2

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    int-to-long v2, p3

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 175
    :cond_1
    iput v4, p0, Lcom/huawei/hwid/update/d/k;->l:I

    .line 176
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->d:Lcom/huawei/hwid/update/d/b;

    check-cast v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {v0, v4}, Lcom/huawei/hwid/update/d/e;->b(I)V

    .line 177
    goto :goto_0

    .line 180
    :sswitch_3
    const-class v0, Lcom/huawei/hwid/update/d/h$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 181
    goto :goto_0

    .line 184
    :sswitch_4
    const-class v0, Lcom/huawei/hwid/update/d/h$d;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 185
    goto :goto_0

    .line 187
    :sswitch_5
    const-class v0, Lcom/huawei/hwid/update/d/d$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 188
    .line 193
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7d0 -> :sswitch_0
        0x834 -> :sswitch_2
        0x835 -> :sswitch_1
        0x899 -> :sswitch_3
        0x89a -> :sswitch_5
        0x89b -> :sswitch_4
        0x89c -> :sswitch_4
    .end sparse-switch
.end method

.method public a(ILandroid/view/KeyEvent;)V
    .locals 3

    .line 490
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/k;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 491
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/activity/a;->a(ILandroid/view/KeyEvent;)V

    .line 492
    return-void

    .line 495
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 496
    const-string v0, "UpdateWizard"

    const-string v1, "In onKeyUp, Call finish."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->d()Landroid/app/Activity;

    move-result-object v2

    .line 499
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 500
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 501
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 504
    :cond_1
    return-void
.end method

.method public a(ILcom/huawei/hwid/update/a/a/c;)V
    .locals 2

    .line 129
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 131
    :sswitch_0
    iput-object p2, p0, Lcom/huawei/hwid/update/d/k;->k:Lcom/huawei/hwid/update/a/a/c;

    .line 132
    const-class v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 133
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->h()V

    .line 134
    goto :goto_1

    .line 138
    :sswitch_1
    const-class v0, Lcom/huawei/hwid/update/d/h$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 139
    goto :goto_1

    .line 141
    :sswitch_2
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->e()V

    .line 142
    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwid/update/d/k;->a(II)V

    .line 143
    goto :goto_1

    .line 145
    :goto_0
    const-class v0, Lcom/huawei/hwid/update/d/h$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 148
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x4b1 -> :sswitch_1
        0x4b2 -> :sswitch_2
        0x4b3 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    .line 67
    invoke-super {p0, p1}, Lcom/huawei/hwid/update/d/a;->a(Landroid/app/Activity;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->c:Lcom/huawei/hwid/update/d/j;

    if-nez v0, :cond_0

    .line 70
    return-void

    .line 73
    :cond_0
    const/4 v0, 0x6

    iput v0, p0, Lcom/huawei/hwid/update/d/k;->f:I

    .line 76
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 77
    const-class v0, Lcom/huawei/hwid/update/d/g;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 79
    :cond_1
    const-class v0, Lcom/huawei/hwid/update/d/c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 80
    invoke-direct {p0, p0}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;)V

    .line 82
    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/hwid/update/d/b;)V
    .locals 2

    .line 269
    const-string v0, "UpdateWizard"

    const-string v1, "Enter onCancel."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    instance-of v0, p1, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 272
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->c()V

    goto :goto_0

    .line 273
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwid/update/d/c;

    if-eqz v0, :cond_1

    .line 274
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->i()V

    .line 275
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->c()V

    goto :goto_0

    .line 276
    :cond_1
    instance-of v0, p1, Lcom/huawei/hwid/update/d/e;

    if-eqz v0, :cond_2

    .line 277
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->i()V

    .line 278
    const-class v0, Lcom/huawei/hwid/update/d/d$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 279
    :cond_2
    instance-of v0, p1, Lcom/huawei/hwid/update/d/d$c;

    if-eqz v0, :cond_3

    .line 280
    const-class v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 281
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->h()V

    goto :goto_0

    .line 282
    :cond_3
    instance-of v0, p1, Lcom/huawei/hwid/update/d/d$b;

    if-eqz v0, :cond_4

    .line 283
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->c()V

    goto :goto_0

    .line 285
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    .line 287
    :goto_0
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwid/update/d/b;>;)V"
        }
    .end annotation

    .line 332
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->e()V

    .line 334
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/update/d/b;

    .line 337
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v2, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 338
    move-object v0, v2

    check-cast v0, Lcom/huawei/hwid/update/d/g;

    iget-object v1, p0, Lcom/huawei/hwid/update/d/k;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/update/d/g;->a(Ljava/lang/String;)V

    .line 342
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/update/d/k;->l:I

    if-lez v0, :cond_1

    instance-of v0, v2, Lcom/huawei/hwid/update/d/e;

    if-eqz v0, :cond_1

    .line 343
    move-object v0, v2

    check-cast v0, Lcom/huawei/hwid/update/d/e;

    iget v1, p0, Lcom/huawei/hwid/update/d/k;->l:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/update/d/e;->a(I)V

    .line 345
    :cond_1
    invoke-virtual {v2, p0}, Lcom/huawei/hwid/update/d/b;->a(Lcom/huawei/hwid/update/d/a;)V

    .line 346
    iput-object v2, p0, Lcom/huawei/hwid/update/d/k;->d:Lcom/huawei/hwid/update/d/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    .line 353
    goto :goto_0

    .line 347
    :catch_0
    move-exception v2

    .line 348
    const-string v0, "UpdateWizard"

    const-string v1, "InstantiationException In showDialog, Failed to show the dialog."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    goto :goto_0

    .line 349
    :catch_1
    move-exception v2

    .line 350
    const-string v0, "UpdateWizard"

    const-string v1, "IllegalAccessException In showDialog, Failed to show the dialog."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    goto :goto_0

    .line 351
    :catch_2
    move-exception v2

    .line 352
    const-string v0, "UpdateWizard"

    const-string v1, "IllegalStateException In showDialog, Failed to show the dialog."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    :goto_0
    return-void
.end method

.method public a(IILandroid/content/Intent;)Z
    .locals 2

    .line 107
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/k;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwid/activity/a;->a(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 111
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/update/d/k;->f:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->f()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 112
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k;->g:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/hwid/update/d/k;->i:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    iget v0, p0, Lcom/huawei/hwid/update/d/k;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/k;->a(II)V

    goto :goto_0

    .line 115
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    .line 117
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lcom/huawei/hwid/update/d/b;)V
    .locals 2

    .line 294
    const-string v0, "UpdateWizard"

    const-string v1, "Enter onDoWork."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    instance-of v0, p1, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 297
    invoke-virtual {p1}, Lcom/huawei/hwid/update/d/b;->c()V

    .line 299
    const-class v0, Lcom/huawei/hwid/update/d/c;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 300
    invoke-direct {p0, p0}, Lcom/huawei/hwid/update/d/k;->a(Lcom/huawei/hwid/update/a/a/b;)V

    goto :goto_0

    .line 301
    :cond_0
    instance-of v0, p1, Lcom/huawei/hwid/update/d/d$c;

    if-eqz v0, :cond_1

    .line 302
    invoke-virtual {p1}, Lcom/huawei/hwid/update/d/b;->c()V

    .line 303
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/k;->c()V

    goto :goto_0

    .line 304
    :cond_1
    instance-of v0, p1, Lcom/huawei/hwid/update/d/d$b;

    if-eqz v0, :cond_2

    .line 305
    const-class v0, Lcom/huawei/hwid/update/d/e;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/k;->a(Ljava/lang/Class;)V

    .line 306
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->h()V

    goto :goto_0

    .line 308
    :cond_2
    instance-of v0, p1, Lcom/huawei/hwid/update/d/h$b;

    if-eqz v0, :cond_3

    .line 309
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    goto :goto_0

    .line 310
    :cond_3
    instance-of v0, p1, Lcom/huawei/hwid/update/d/h$c;

    if-eqz v0, :cond_4

    .line 311
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    goto :goto_0

    .line 312
    :cond_4
    instance-of v0, p1, Lcom/huawei/hwid/update/d/h$d;

    if-eqz v0, :cond_5

    .line 313
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/k;->g()V

    .line 315
    :cond_5
    :goto_0
    return-void
.end method

.method c()V
    .locals 2

    .line 358
    iget v0, p0, Lcom/huawei/hwid/update/d/k;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/k;->a(II)V

    .line 359
    return-void
.end method

.method public f()I
    .locals 1

    .line 98
    const/16 v0, 0x7d6

    return v0
.end method
