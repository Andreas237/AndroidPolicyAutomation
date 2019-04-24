.class public Lcom/huawei/hms/update/e/k;
.super Lcom/huawei/hms/update/e/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/hms/update/e/a;-><init>()V

    return-void
.end method

.method private e()Z
    .locals 5

    .line 105
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/k;->a()Landroid/app/Activity;

    move-result-object v3

    .line 106
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_2

    .line 111
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    const/4 v0, 0x0

    return v0

    .line 119
    :cond_3
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http://a.vmall.com/app/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/update/e/k;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 120
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 121
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/k;->c()I

    move-result v0

    invoke-virtual {v3, v4, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 122
    iget v0, p0, Lcom/huawei/hms/update/e/k;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/k;->a(II)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    goto :goto_0

    .line 123
    :catch_0
    move-exception v4

    .line 124
    const-string v0, "HiappWebWizard"

    const-string v1, "can not find web to hold update hms apk"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v0, 0x0

    return v0

    .line 128
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 81
    const-string v0, "HiappWebWizard"

    const-string v1, "Enter onCancel."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/k;->d()V

    .line 86
    :cond_0
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hms/update/e/b;>;)V"
        }
    .end annotation

    .line 136
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/k;->b()V

    .line 138
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/update/e/b;

    .line 140
    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v3, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 141
    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/update/e/m;

    iget-object v1, p0, Lcom/huawei/hms/update/e/k;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/m;->a(Ljava/lang/String;)V

    .line 144
    :cond_0
    invoke-virtual {v3, p0}, Lcom/huawei/hms/update/e/b;->a(Lcom/huawei/hms/update/e/a;)V

    .line 145
    iput-object v3, p0, Lcom/huawei/hms/update/e/k;->d:Lcom/huawei/hms/update/e/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    goto :goto_0

    .line 146
    :catch_0
    move-exception v3

    .line 147
    const-string v0, "HiappWebWizard"

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

    .line 149
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 90
    const-string v0, "HiappWebWizard"

    const-string v1, "Enter onDoWork."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {p1}, Lcom/huawei/hms/update/e/b;->c()V

    .line 94
    invoke-direct {p0}, Lcom/huawei/hms/update/e/k;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget v0, p0, Lcom/huawei/hms/update/e/k;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/k;->b(II)V

    .line 98
    :cond_0
    return-void
.end method

.method public c()I
    .locals 1

    .line 63
    const/16 v0, 0x7d4

    return v0
.end method

.method d()V
    .locals 2

    .line 153
    iget v0, p0, Lcom/huawei/hms/update/e/k;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/k;->b(II)V

    .line 154
    return-void
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 2

    .line 33
    invoke-super {p0, p1}, Lcom/huawei/hms/update/e/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 35
    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_0

    .line 36
    return-void

    .line 39
    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/hms/update/e/k;->f:I

    .line 41
    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/update/e/k;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    const-class v0, Lcom/huawei/hms/update/e/m;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/k;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 44
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/update/e/k;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 45
    iget v0, p0, Lcom/huawei/hms/update/e/k;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/k;->b(II)V

    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 0

    .line 55
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeActivityDestroy()V

    .line 56
    return-void
.end method

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public onBridgeConfigurationChanged()V
    .locals 0

    .line 76
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeConfigurationChanged()V

    .line 77
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 3

    .line 159
    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    .line 160
    const-string v0, "HiappWebWizard"

    const-string v1, "In onKeyUp, Call finish."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/k;->a()Landroid/app/Activity;

    move-result-object v2

    .line 163
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 165
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 168
    :cond_0
    return-void
.end method
