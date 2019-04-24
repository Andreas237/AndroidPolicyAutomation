.class public Lcom/huawei/hwid/update/d/f;
.super Lcom/huawei/hwid/update/d/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/a;-><init>()V

    return-void
.end method

.method private g()Z
    .locals 4

    .line 135
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->d()Landroid/app/Activity;

    move-result-object v2

    .line 136
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 141
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    const/4 v0, 0x0

    return v0

    .line 146
    :cond_2
    const-string v0, "com.huawei.appmarket.intent.action.AppDetail"

    const-string v1, "com.huawei.appmarket"

    :try_start_0
    invoke-static {v2, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 147
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 148
    const-string v0, "com.huawei.appmarket.intent.action.AppDetail"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 150
    const-string v0, "APP_PACKAGENAME"

    iget-object v1, p0, Lcom/huawei/hwid/update/d/f;->g:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->f()I

    move-result v0

    invoke-virtual {v2, v3, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 154
    goto :goto_0

    .line 155
    :cond_3
    const-string v0, "HiappWizard"

    const-string v1, "action is not exist"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 156
    const/4 v0, 0x0

    return v0

    .line 164
    :goto_0
    goto :goto_1

    .line 158
    :catch_0
    move-exception v3

    .line 159
    const-string v0, "HiappWizard"

    const-string v1, "can not open hiapp"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const/4 v0, 0x0

    return v0

    .line 161
    :catch_1
    move-exception v3

    .line 162
    const-string v0, "HiappWizard"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 166
    :goto_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 58
    invoke-super {p0}, Lcom/huawei/hwid/update/d/a;->a()V

    .line 59
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)V
    .locals 3

    .line 201
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/f;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/activity/a;->a(ILandroid/view/KeyEvent;)V

    .line 203
    return-void

    .line 206
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 207
    const-string v0, "HiappWizard"

    const-string v1, "In onKeyUp, Call finish."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->d()Landroid/app/Activity;

    move-result-object v2

    .line 210
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 212
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 215
    :cond_1
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/hwid/update/d/a;->a(Landroid/app/Activity;)V

    .line 32
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->c:Lcom/huawei/hwid/update/d/j;

    if-nez v0, :cond_0

    .line 33
    return-void

    .line 36
    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    .line 38
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 39
    const-class v0, Lcom/huawei/hwid/update/d/g;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/f;->a(Ljava/lang/Class;)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/f;->g()Z

    move-result v0

    if-nez v0, :cond_2

    .line 43
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/f;->a(Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 44
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/f;->a(II)V

    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/hwid/update/d/b;)V
    .locals 2

    .line 104
    const-string v0, "HiappWizard"

    const-string v1, "Enter onCancel."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    instance-of v0, p1, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->c()V

    .line 109
    :cond_0
    return-void
.end method

.method a(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwid/update/d/b;>;)V"
        }
    .end annotation

    .line 175
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->e()V

    .line 177
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/update/d/b;

    .line 179
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v2, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 180
    move-object v0, v2

    check-cast v0, Lcom/huawei/hwid/update/d/g;

    iget-object v1, p0, Lcom/huawei/hwid/update/d/f;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/update/d/g;->a(Ljava/lang/String;)V

    .line 183
    :cond_0
    invoke-virtual {v2, p0}, Lcom/huawei/hwid/update/d/b;->a(Lcom/huawei/hwid/update/d/a;)V

    .line 184
    iput-object v2, p0, Lcom/huawei/hwid/update/d/f;->d:Lcom/huawei/hwid/update/d/b;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    .line 191
    goto :goto_0

    .line 185
    :catch_0
    move-exception v2

    .line 186
    const-string v0, "HiappWizard"

    const-string v1, "In showDialog, InstantiationException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    goto :goto_0

    .line 187
    :catch_1
    move-exception v2

    .line 188
    const-string v0, "HiappWizard"

    const-string v1, "In showDialog, IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    goto :goto_0

    .line 189
    :catch_2
    move-exception v2

    .line 190
    const-string v0, "HiappWizard"

    const-string v1, "In showDialog, IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    :goto_0
    return-void
.end method

.method public a(IILandroid/content/Intent;)Z
    .locals 2

    .line 75
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/f;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwid/activity/a;->a(IILandroid/content/Intent;)Z

    move-result v0

    return v0

    .line 79
    :cond_0
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/f;->f()I

    move-result v0

    if-ne p1, v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/huawei/hwid/update/d/f;->g:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/hwid/update/d/f;->i:I

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwid/update/d/f;->a(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/f;->a(II)V

    goto :goto_0

    .line 85
    :cond_1
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/f;->a(II)V

    .line 87
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 90
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 0

    .line 96
    invoke-super {p0}, Lcom/huawei/hwid/update/d/a;->b()V

    .line 97
    return-void
.end method

.method public b(Lcom/huawei/hwid/update/d/b;)V
    .locals 2

    .line 116
    const-string v0, "HiappWizard"

    const-string v1, "Enter onDoWork."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    instance-of v0, p1, Lcom/huawei/hwid/update/d/g;

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {p1}, Lcom/huawei/hwid/update/d/b;->c()V

    .line 120
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/f;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/f;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/f;->a(II)V

    .line 129
    :cond_0
    return-void
.end method

.method c()V
    .locals 2

    .line 196
    iget v0, p0, Lcom/huawei/hwid/update/d/f;->f:I

    const/16 v1, 0xd

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/update/d/f;->a(II)V

    .line 197
    return-void
.end method

.method public f()I
    .locals 1

    .line 66
    const/16 v0, 0x7d5

    return v0
.end method
