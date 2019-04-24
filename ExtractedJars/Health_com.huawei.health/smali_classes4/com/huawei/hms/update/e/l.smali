.class public Lcom/huawei/hms/update/e/l;
.super Lcom/huawei/hms/update/e/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/hms/update/e/a;-><init>()V

    return-void
.end method

.method private e()Z
    .locals 4

    .line 130
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->a()Landroid/app/Activity;

    move-result-object v2

    .line 131
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    const/4 v0, 0x0

    return v0

    .line 141
    :cond_2
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 142
    const-string v0, "com.huawei.appmarket.intent.action.AppDetail"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    const-string v0, "APP_PACKAGENAME"

    iget-object v1, p0, Lcom/huawei/hms/update/e/l;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->c()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    goto :goto_0

    .line 148
    :catch_0
    move-exception v3

    .line 149
    const-string v0, "HiappWizard"

    const-string v1, "can not open hiapp"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x0

    return v0

    .line 153
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 100
    const-string v0, "HiappWizard"

    const-string v1, "Enter onCancel."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->d()V

    .line 105
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

    .line 162
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->b()V

    .line 164
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/update/e/b;

    .line 166
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v3, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_0

    .line 167
    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/update/e/m;

    iget-object v1, p0, Lcom/huawei/hms/update/e/l;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hms/update/e/m;->a(Ljava/lang/String;)V

    .line 170
    :cond_0
    invoke-virtual {v3, p0}, Lcom/huawei/hms/update/e/b;->a(Lcom/huawei/hms/update/e/a;)V

    .line 171
    iput-object v3, p0, Lcom/huawei/hms/update/e/l;->d:Lcom/huawei/hms/update/e/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_0

    .line 172
    :catch_0
    move-exception v3

    .line 173
    const-string v0, "HiappWizard"

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

    .line 175
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hms/update/e/b;)V
    .locals 2

    .line 112
    const-string v0, "HiappWizard"

    const-string v1, "Enter onDoWork."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    instance-of v0, p1, Lcom/huawei/hms/update/e/m;

    if-eqz v0, :cond_1

    .line 115
    invoke-virtual {p1}, Lcom/huawei/hms/update/e/b;->c()V

    .line 116
    invoke-direct {p0}, Lcom/huawei/hms/update/e/l;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/l;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->b(II)V

    goto :goto_0

    .line 120
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->a(II)V

    .line 124
    :cond_1
    :goto_0
    return-void
.end method

.method public c()I
    .locals 1

    .line 62
    const/16 v0, 0x7d5

    return v0
.end method

.method d()V
    .locals 2

    .line 179
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->b(II)V

    .line 180
    return-void
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 2

    .line 27
    invoke-super {p0, p1}, Lcom/huawei/hms/update/e/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 29
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_0

    .line 30
    return-void

    .line 33
    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    .line 35
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 36
    const-class v0, Lcom/huawei/hms/update/e/m;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/l;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 38
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hms/update/e/l;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 40
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/update/e/l;->a(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 41
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->b(II)V

    goto :goto_0

    .line 43
    :cond_2
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->a(II)V

    .line 47
    :cond_3
    :goto_0
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 0

    .line 54
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeActivityDestroy()V

    .line 55
    return-void
.end method

.method public onBridgeActivityResult(IILandroid/content/Intent;)Z
    .locals 2

    .line 71
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/l;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hms/activity/a;->onBridgeActivityResult(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 75
    :cond_0
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->c()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 76
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->g:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/hms/update/e/l;->i:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/update/e/l;->a(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->b(II)V

    goto :goto_0

    .line 81
    :cond_1
    iget v0, p0, Lcom/huawei/hms/update/e/l;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/update/e/l;->b(II)V

    .line 83
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 86
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public onBridgeConfigurationChanged()V
    .locals 0

    .line 92
    invoke-super {p0}, Lcom/huawei/hms/update/e/a;->onBridgeConfigurationChanged()V

    .line 93
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 3

    .line 184
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/l;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/hms/update/e/l;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/activity/a;->onKeyUp(ILandroid/view/KeyEvent;)V

    .line 186
    return-void

    .line 189
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 190
    const-string v0, "HiappWizard"

    const-string v1, "In onKeyUp, Call finish."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/l;->a()Landroid/app/Activity;

    move-result-object v2

    .line 193
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 195
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 198
    :cond_1
    return-void
.end method
