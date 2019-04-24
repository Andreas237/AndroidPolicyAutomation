.class public Lcom/huawei/hms/api/BindingFailedResolution;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Lcom/huawei/hms/activity/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/api/BindingFailedResolution$a;
    }
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Z

.field private c:Lcom/huawei/hms/api/BindingFailedResolution$a;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->b:Z

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/BindingFailedResolution;Lcom/huawei/hms/api/BindingFailedResolution$a;)Lcom/huawei/hms/api/BindingFailedResolution$a;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    return-object p1
.end method

.method private a()V
    .locals 2

    .line 95
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->c()V

    goto :goto_0

    .line 98
    :cond_0
    const-string v0, "BindingFailedResolution"

    const-string v1, "In connect, bind core try fail"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/BindingFailedResolution;->a(Z)V

    .line 101
    :goto_0
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 237
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getActivity()Landroid/app/Activity;

    move-result-object v3

    .line 238
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 239
    :cond_0
    return-void

    .line 242
    :cond_1
    const-string v0, "BindingFailedResolution"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finishBridgeActivity\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 244
    const-string v0, "intent.extra.RESULT"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 245
    const/4 v0, -0x1

    invoke-virtual {v3, v0, v4}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 246
    invoke-virtual {v3}, Landroid/app/Activity;->finish()V

    .line 247
    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 5

    .line 59
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 60
    const-string v0, "com.huawei.hwid"

    const-string v1, "com.huawei.hms.core.activity.JumpActivity"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 63
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getRequestCode()I

    move-result v0

    invoke-virtual {p1, v3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 64
    :catch_0
    move-exception v4

    .line 65
    const-string v0, "BindingFailedResolution"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ActivityNotFoundException\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->a()V

    .line 68
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/BindingFailedResolution;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/BindingFailedResolution;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/api/BindingFailedResolution;Z)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/BindingFailedResolution;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 1

    .line 151
    iget-boolean v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->b:Z

    if-eqz v0, :cond_0

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->b:Z

    .line 153
    invoke-virtual {p0, p1}, Lcom/huawei/hms/api/BindingFailedResolution;->onStartResult(Z)V

    .line 155
    :cond_0
    return-void
.end method

.method private b()Z
    .locals 3

    .line 197
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getActivity()Landroid/app/Activity;

    move-result-object v1

    .line 198
    if-nez v1, :cond_0

    .line 199
    const/4 v0, 0x0

    return v0

    .line 202
    :cond_0
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hms.core.aidlservice"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 203
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    const/4 v0, 0x1

    invoke-virtual {v1, v2, p0, v0}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    return v0
.end method

.method private c()V
    .locals 4

    .line 253
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 256
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/huawei/hms/api/a;

    invoke-direct {v2, p0}, Lcom/huawei/hms/api/a;-><init>(Lcom/huawei/hms/api/BindingFailedResolution;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    .line 271
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 272
    return-void
.end method

.method private d()V
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 280
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->d:Landroid/os/Handler;

    .line 282
    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 286
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getActivity()Landroid/app/Activity;

    move-result-object v2

    .line 287
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    :cond_0
    return-void

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    if-nez v0, :cond_2

    .line 292
    new-instance v0, Lcom/huawei/hms/api/BindingFailedResolution$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/BindingFailedResolution$a;-><init>(Lcom/huawei/hms/api/a;)V

    iput-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    goto :goto_0

    .line 294
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    invoke-virtual {v0}, Lcom/huawei/hms/api/BindingFailedResolution$a;->b()V

    .line 297
    :goto_0
    const-string v0, "BindingFailedResolution"

    const-string v1, "showPromptdlg to resolve conn error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    new-instance v1, Lcom/huawei/hms/api/b;

    invoke-direct {v1, p0}, Lcom/huawei/hms/api/b;-><init>(Lcom/huawei/hms/api/BindingFailedResolution;)V

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hms/api/BindingFailedResolution$a;->a(Landroid/app/Activity;Lcom/huawei/hms/b/a$a;)V

    .line 313
    return-void
.end method


# virtual methods
.method protected getActivity()Landroid/app/Activity;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public getRequestCode()I
    .locals 1

    .line 122
    const/16 v0, 0x7d3

    return v0
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 2

    .line 48
    iput-object p1, p0, Lcom/huawei/hms/api/BindingFailedResolution;->a:Landroid/app/Activity;

    .line 49
    sget-object v0, Lcom/huawei/hms/api/c;->a:Lcom/huawei/hms/api/c;

    iget-object v1, p0, Lcom/huawei/hms/api/BindingFailedResolution;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/c;->a(Landroid/app/Activity;)V

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/hms/api/BindingFailedResolution;->a(Landroid/app/Activity;)V

    .line 51
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 2

    .line 75
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->d()V

    .line 76
    sget-object v0, Lcom/huawei/hms/api/c;->a:Lcom/huawei/hms/api/c;

    iget-object v1, p0, Lcom/huawei/hms/api/BindingFailedResolution;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/c;->b(Landroid/app/Activity;)V

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->a:Landroid/app/Activity;

    .line 78
    return-void
.end method

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 85
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getRequestCode()I

    move-result v0

    if-eq p1, v0, :cond_0

    .line 86
    const/4 v0, 0x0

    return v0

    .line 89
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->a()V

    .line 91
    const/4 v0, 0x1

    return v0
.end method

.method public onBridgeConfigurationChanged()V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/huawei/hms/api/BindingFailedResolution;->c:Lcom/huawei/hms/api/BindingFailedResolution$a;

    if-nez v0, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    const-string v0, "BindingFailedResolution"

    const-string v1, "re show prompt dialog"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->e()V

    .line 115
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 2

    .line 134
    const-string v0, "BindingFailedResolution"

    const-string v1, "On key up when resolve conn error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 214
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->d()V

    .line 216
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/BindingFailedResolution;->a(Z)V

    .line 218
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getActivity()Landroid/app/Activity;

    move-result-object v1

    .line 219
    if-nez v1, :cond_0

    .line 220
    return-void

    .line 223
    :cond_0
    invoke-static {v1, p0}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 224
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    .line 231
    return-void
.end method

.method protected onStartResult(Z)V
    .locals 2

    .line 162
    invoke-virtual {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->getActivity()Landroid/app/Activity;

    move-result-object v1

    .line 163
    if-nez v1, :cond_0

    .line 164
    return-void

    .line 167
    :cond_0
    if-eqz p1, :cond_1

    .line 168
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hms/api/BindingFailedResolution;->a(I)V

    .line 169
    return-void

    .line 172
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/api/BindingFailedResolution;->e()V

    .line 173
    return-void
.end method
