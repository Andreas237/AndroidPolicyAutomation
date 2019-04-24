.class public Lcom/huawei/hms/update/e/v;
.super Lcom/huawei/hms/update/e/a;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/update/a/a/b;


# instance fields
.field private k:Lcom/huawei/hms/update/a/a/a;

.field private l:Lcom/huawei/hms/update/a/a/c;

.field private m:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/hms/update/e/a;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/e/v;->m:I

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 6

    .line 245
    new-instance v2, Lcom/huawei/hms/c/g;

    invoke-direct {v2, p0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 246
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hms.update.provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 249
    const/4 v5, 0x0

    .line 251
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_1

    .line 252
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 253
    const/4 v5, 0x1

    goto :goto_0

    .line 254
    :cond_0
    invoke-virtual {v2, v3, v4}, Lcom/huawei/hms/c/g;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    const/4 v5, 0x1

    .line 259
    :cond_1
    :goto_0
    if-eqz v5, :cond_2

    .line 260
    invoke-static {p0, v4, p1}, Lcom/huawei/hms/update/provider/UpdateProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 262
    :cond_2
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/hms/update/a/a/b;)V
    .locals 3

    .line 364
    if-nez p1, :cond_0

    .line 365
    return-void

    .line 368
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->a()Landroid/app/Activity;

    move-result-object v2

    .line 369
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    :cond_1
    const/16 v0, 0x4b1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/huawei/hms/update/e/v;->b(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    .line 371
    return-void

    .line 374
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/update/e/w;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hms/update/e/w;-><init>(Lcom/huawei/hms/update/e/v;Lcom/huawei/hms/update/a/a/b;)V

    invoke-static {v2, v0, v1}, Lcom/huawei/updatesdk/UpdateSdkAPI;->checkTargetAppUpdate(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V

    .line 446
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V
    .locals 0

    .line 36
    invoke-static {p0, p1, p2}, Lcom/huawei/hms/update/e/v;->b(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 7

    .line 204
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->a()Landroid/app/Activity;

    move-result-object v3

    .line 205
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    :cond_0
    return-void

    .line 217
    :cond_1
    invoke-static {v3, p1}, Lcom/huawei/hms/update/e/v;->a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    .line 218
    if-nez v4, :cond_2

    .line 219
    const-string v0, "UpdateWizard"

    const-string v1, "In startInstaller, Failed to creates a Uri from a file."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    .line 221
    return-void

    .line 224
    :cond_2
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 225
    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 226
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 229
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->c()I

    move-result v0

    invoke-virtual {v3, v5, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    goto :goto_0

    .line 230
    :catch_0
    move-exception v6

    .line 231
    const-string v0, "UpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In startInstaller, Failed to start package installer."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    .line 235
    :goto_0
    return-void
.end method

.method private static b(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V
    .locals 2

    .line 449
    if-eqz p0, :cond_0

    .line 450
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hms/update/e/x;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/update/e/x;-><init>(Lcom/huawei/hms/update/a/a/b;ILcom/huawei/hms/update/a/a/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 459
    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 323
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 324
    iget v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/v;->b(II)V

    goto :goto_0

    .line 326
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/v;->a(II)V

    .line 328
    :goto_0
    return-void
.end method

.method private f()V
    .locals 3

    .line 465
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->a()Landroid/app/Activity;

    move-result-object v2

    .line 466
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    :cond_0
    const-class v0, Lcom/huawei/hms/update/e/p$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 468
    return-void

    .line 472
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->g()V

    .line 473
    new-instance v0, Lcom/huawei/hms/update/a/c;

    new-instance v1, Lcom/huawei/hms/update/a/h;

    invoke-direct {v1, v2}, Lcom/huawei/hms/update/a/h;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/huawei/hms/update/a/c;-><init>(Lcom/huawei/hms/update/a/a/a;)V

    iput-object v0, p0, Lcom/huawei/hms/update/e/v;->k:Lcom/huawei/hms/update/a/a/a;

    .line 474
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->k:Lcom/huawei/hms/update/a/a/a;

    iget-object v1, p0, Lcom/huawei/hms/update/e/v;->l:Lcom/huawei/hms/update/a/a/c;

    invoke-interface {v0, p0, v1}, Lcom/huawei/hms/update/a/a/a;->a(Lcom/huawei/hms/update/a/a/b;Lcom/huawei/hms/update/a/a/c;)V

    .line 475
    return-void
.end method

.method private g()V
    .locals 1

    .line 481
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->k:Lcom/huawei/hms/update/a/a/a;

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->k:Lcom/huawei/hms/update/a/a/a;

    invoke-interface {v0}, Lcom/huawei/hms/update/a/a/a;->a()V

    .line 483
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/v;->k:Lcom/huawei/hms/update/a/a/a;

    .line 485
    :cond_0
    return-void
.end method


# virtual methods
.method public a(IIILjava/io/File;)V
    .locals 5

    .line 155
    invoke-static {}, Lcom/huawei/hms/support/log/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    const-string v0, "UpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter onDownloadPackage, status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/huawei/hms/update/a/a/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", reveived: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", total: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 162
    :sswitch_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->b()V

    .line 163
    if-nez p4, :cond_1

    .line 164
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    goto :goto_0

    .line 166
    :cond_1
    invoke-direct {p0, p4}, Lcom/huawei/hms/update/e/v;->a(Ljava/io/File;)V

    .line 168
    goto :goto_0

    .line 171
    :sswitch_1
    goto :goto_0

    .line 173
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->d:Lcom/huawei/hms/update/e/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->d:Lcom/huawei/hms/update/e/b;

    instance-of v0, v0, Lcom/huawei/hms/update/e/i;

    if-eqz v0, :cond_3

    .line 174
    const/4 v4, 0x0

    .line 175
    if-ltz p2, :cond_2

    if-lez p3, :cond_2

    .line 176
    int-to-long v0, p2

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    int-to-long v2, p3

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 179
    :cond_2
    iput v4, p0, Lcom/huawei/hms/update/e/v;->m:I

    .line 180
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->d:Lcom/huawei/hms/update/e/b;

    check-cast v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {v0, v4}, Lcom/huawei/hms/update/e/i;->b(I)V

    .line 181
    goto :goto_0

    .line 184
    :sswitch_3
    const-class v0, Lcom/huawei/hms/update/e/p$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 185
    goto :goto_0

    .line 188
    :sswitch_4
    const-class v0, Lcom/huawei/hms/update/e/p$d;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 189
    goto :goto_0

    .line 191
    :sswitch_5
    const-class v0, Lcom/huawei/hms/update/e/e$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 192
    .line 197
    :cond_3
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

.method public a(ILcom/huawei/hms/update/a/a/c;)V
    .locals 3

    .line 127
    invoke-static {}, Lcom/huawei/hms/support/log/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    const-string v0, "UpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter onCheckUpdate, status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/huawei/hms/update/a/a/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 133
    :sswitch_0
    iput-object p2, p0, Lcom/huawei/hms/update/e/v;->l:Lcom/huawei/hms/update/a/a/c;

    .line 134
    const-class v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 135
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->f()V

    .line 136
    goto :goto_1

    .line 141
    :sswitch_1
    const-class v0, Lcom/huawei/hms/update/e/p$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 142
    goto :goto_1

    .line 145
    :goto_0
    const-class v0, Lcom/huawei/hms/update/e/p$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 148
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x4b1 -> :sswitch_1
        0x4b2 -> :sswitch_1
        0x4b3 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 273
    const-string v0, "UpdateWizard"

    const-string v1, "Enter onCancel."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->d()V

    goto :goto_0

    .line 277
    :cond_0
    instance-of v0, p1, Lcom/huawei/hms/update/e/d;

    if-eqz v0, :cond_1

    .line 278
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->g()V

    .line 279
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->d()V

    goto :goto_0

    .line 280
    :cond_1
    instance-of v0, p1, Lcom/huawei/hms/update/e/i;

    if-eqz v0, :cond_2

    .line 281
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->g()V

    .line 282
    const-class v0, Lcom/huawei/hms/update/e/e$c;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 283
    :cond_2
    instance-of v0, p1, Lcom/huawei/hms/update/e/e$c;

    if-eqz v0, :cond_3

    .line 284
    const-class v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 285
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->f()V

    goto :goto_0

    .line 286
    :cond_3
    instance-of v0, p1, Lcom/huawei/hms/update/e/e$b;

    if-eqz v0, :cond_4

    .line 287
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->d()V

    goto :goto_0

    .line 289
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    .line 291
    :goto_0
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hms/update/e/b;>;)V"
        }
    .end annotation

    .line 335
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->b()V

    .line 337
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/update/e/b;

    .line 340
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v3, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 341
    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/update/e/m;

    iget-object v1, p0, Lcom/huawei/hms/update/e/v;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/m;->a(Ljava/lang/String;)V

    .line 345
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/v;->m:I

    if-lez v0, :cond_1

    instance-of v0, v3, Lcom/huawei/hms/update/e/i;

    if-eqz v0, :cond_1

    .line 346
    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/update/e/i;

    iget v1, p0, Lcom/huawei/hms/update/e/v;->m:I

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/i;->a(I)V

    .line 348
    :cond_1
    invoke-virtual {v3, p0}, Lcom/huawei/hms/update/e/b;->a(Lcom/huawei/hms/update/e/a;)V

    .line 349
    iput-object v3, p0, Lcom/huawei/hms/update/e/v;->d:Lcom/huawei/hms/update/e/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 352
    goto :goto_0

    .line 350
    :catch_0
    move-exception v3

    .line 351
    const-string v0, "UpdateWizard"

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

    .line 353
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 298
    const-string v0, "UpdateWizard"

    const-string v1, "Enter onDoWork."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 301
    invoke-virtual {p1}, Lcom/huawei/hms/update/e/b;->c()V

    .line 303
    const-class v0, Lcom/huawei/hms/update/e/d;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 304
    invoke-direct {p0, p0}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;)V

    goto :goto_0

    .line 305
    :cond_0
    instance-of v0, p1, Lcom/huawei/hms/update/e/e$c;

    if-eqz v0, :cond_1

    .line 306
    invoke-virtual {p1}, Lcom/huawei/hms/update/e/b;->c()V

    .line 307
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->d()V

    goto :goto_0

    .line 308
    :cond_1
    instance-of v0, p1, Lcom/huawei/hms/update/e/e$b;

    if-eqz v0, :cond_2

    .line 309
    const-class v0, Lcom/huawei/hms/update/e/i;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 310
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->f()V

    goto :goto_0

    .line 312
    :cond_2
    instance-of v0, p1, Lcom/huawei/hms/update/e/p$b;

    if-eqz v0, :cond_3

    .line 313
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    goto :goto_0

    .line 314
    :cond_3
    instance-of v0, p1, Lcom/huawei/hms/update/e/p$c;

    if-eqz v0, :cond_4

    .line 315
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    goto :goto_0

    .line 316
    :cond_4
    instance-of v0, p1, Lcom/huawei/hms/update/e/p$d;

    if-eqz v0, :cond_5

    .line 317
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    .line 319
    :cond_5
    :goto_0
    return-void
.end method

.method public c()I
    .locals 1

    .line 97
    const/16 v0, 0x7d6

    return v0
.end method

.method d()V
    .locals 2

    .line 357
    iget v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/v;->b(II)V

    .line 358
    return-void
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 1

    .line 66
    invoke-super {p0, p1}, Lcom/huawei/hms/update/e/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_0

    .line 69
    return-void

    .line 72
    :cond_0
    const/4 v0, 0x6

    iput v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    .line 75
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 76
    const-class v0, Lcom/huawei/hms/update/e/m;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 78
    :cond_1
    const-class v0, Lcom/huawei/hms/update/e/d;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/Class;)V

    .line 79
    invoke-direct {p0, p0}, Lcom/huawei/hms/update/e/v;->a(Lcom/huawei/hms/update/a/a/b;)V

    .line 81
    :goto_0
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->g()V

    .line 89
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeActivityDestroy()V

    .line 90
    return-void
.end method

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 2

    .line 106
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/v;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hms/activity/a;->onBridgeActivityResult(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 110
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->c()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->g:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/hms/update/e/v;->i:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/update/e/v;->a(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    iget v0, p0, Lcom/huawei/hms/update/e/v;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/v;->b(II)V

    goto :goto_0

    .line 114
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/update/e/v;->e()V

    .line 116
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 119
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 3

    .line 489
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/v;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 490
    iget-object v0, p0, Lcom/huawei/hms/update/e/v;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/activity/a;->onKeyUp(ILandroid/view/KeyEvent;)V

    .line 491
    return-void

    .line 494
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 495
    const-string v0, "UpdateWizard"

    const-string v1, "In onKeyUp, Call finish."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/v;->a()Landroid/app/Activity;

    move-result-object v2

    .line 498
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 499
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 500
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 503
    :cond_1
    return-void
.end method
