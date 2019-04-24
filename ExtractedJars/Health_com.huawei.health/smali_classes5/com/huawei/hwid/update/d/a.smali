.class public abstract Lcom/huawei/hwid/update/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/activity/a;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field public b:Lcom/huawei/hwid/activity/a;

.field protected c:Lcom/huawei/hwid/update/d/j;

.field protected d:Lcom/huawei/hwid/update/d/b;

.field protected e:Z

.field protected f:I

.field protected g:Ljava/lang/String;

.field protected h:Ljava/lang/String;

.field protected i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    .line 87
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    .line 92
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/update/d/a;->f:I

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->g:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->h:Ljava/lang/String;

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/d/a;->i:I

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 365
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 367
    :sswitch_0
    const-class v0, Lcom/huawei/hwid/update/d/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 369
    :sswitch_1
    const-class v0, Lcom/huawei/hwid/update/d/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 371
    :sswitch_2
    const-class v0, Lcom/huawei/hwid/update/d/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 377
    :goto_0
    const-string v0, ""

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_2
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 281
    const/4 v2, 0x0

    .line 283
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 284
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hwid/update/d/a;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 286
    :cond_0
    if-nez v2, :cond_1

    .line 287
    return-void

    .line 291
    :cond_1
    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 292
    const-class v0, Lcom/huawei/hwid/activity/a;

    invoke-virtual {v3, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 294
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/activity/a;

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    .line 304
    goto :goto_0

    .line 296
    :catch_0
    move-exception v3

    .line 297
    const-string v0, "AbsUpdateWizard"

    const-string v1, "getBridgeActivityDelegate ClassCastException error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_0

    .line 298
    :catch_1
    move-exception v3

    .line 299
    const-string v0, "AbsUpdateWizard"

    const-string v1, "getBridgeActivityDelegate InstantiationException error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_0

    .line 300
    :catch_2
    move-exception v3

    .line 301
    const-string v0, "AbsUpdateWizard"

    const-string v1, "getBridgeActivityDelegate IllegalAccessException error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    goto :goto_0

    .line 302
    :catch_3
    move-exception v3

    .line 303
    const-string v0, "AbsUpdateWizard"

    const-string v1, "getBridgeActivityDelegate ClassNotFoundException error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 170
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->a:Ljava/lang/ref/WeakReference;

    .line 171
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/a;->e()V

    .line 172
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0}, Lcom/huawei/hwid/activity/a;->a()V

    .line 175
    :cond_0
    return-void
.end method

.method protected a(II)V
    .locals 4

    .line 319
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/a;->d()Landroid/app/Activity;

    move-result-object v2

    .line 320
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    :cond_0
    return-void

    .line 326
    :cond_1
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 327
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    const-string v0, "intent.extra.RESULT"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 329
    const/4 v0, -0x1

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 331
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 332
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)V
    .locals 1

    .line 336
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/activity/a;->a(ILandroid/view/KeyEvent;)V

    .line 339
    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 2

    .line 144
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->a:Ljava/lang/ref/WeakReference;

    .line 146
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    if-nez v0, :cond_1

    .line 147
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 148
    if-nez v1, :cond_0

    .line 149
    return-void

    .line 151
    :cond_0
    const-string v0, "intent.extra.update.info"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/update/d/j;

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    .line 152
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    if-nez v0, :cond_1

    .line 153
    return-void

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->g:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->h:Ljava/lang/String;

    .line 159
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->b()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwid/update/d/a;->i:I

    .line 163
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    .line 165
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/update/d/a;->f:I

    .line 166
    return-void
.end method

.method public a(Lcom/huawei/hwid/update/d/b;)V
    .locals 0

    .line 116
    return-void
.end method

.method abstract a(Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hwid/update/d/b;>;)V"
        }
    .end annotation
.end method

.method protected a(Ljava/lang/String;I)Z
    .locals 4

    .line 351
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    const/4 v0, 0x0

    return v0

    .line 354
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/a;->d()Landroid/app/Activity;

    move-result-object v1

    .line 355
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 356
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 359
    :cond_2
    new-instance v2, Lcom/huawei/hwid/d/d;

    invoke-direct {v2, v1}, Lcom/huawei/hwid/d/d;-><init>(Landroid/content/Context;)V

    .line 360
    invoke-virtual {v2, p1}, Lcom/huawei/hwid/d/d;->b(Ljava/lang/String;)I

    move-result v3

    .line 361
    if-lt v3, p2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected a(Z)Z
    .locals 4

    .line 245
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/a;->d()Landroid/app/Activity;

    move-result-object v2

    .line 246
    if-nez v2, :cond_0

    .line 247
    const/4 v0, 0x0

    return v0

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/j;->d()Ljava/util/ArrayList;

    move-result-object v3

    .line 251
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 252
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 255
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    if-nez v0, :cond_2

    .line 256
    invoke-direct {p0, v3}, Lcom/huawei/hwid/update/d/a;->a(Ljava/util/ArrayList;)V

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_3

    .line 262
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    .line 263
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0, v3}, Lcom/huawei/hwid/update/d/j;->a(Ljava/util/ArrayList;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->c:Lcom/huawei/hwid/update/d/j;

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/update/d/j;->a(Z)V

    .line 266
    const-string v0, "AbsUpdateWizard"

    const-string v1, "startNextWizard mBridgeActivityDelegate.onBridgeActivityCreate(activity)"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0, v2}, Lcom/huawei/hwid/activity/a;->a(Landroid/app/Activity;)V

    .line 268
    const/4 v0, 0x1

    return v0

    .line 271
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    .line 179
    iget-boolean v0, p0, Lcom/huawei/hwid/update/d/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->b:Lcom/huawei/hwid/activity/a;

    invoke-interface {v0}, Lcom/huawei/hwid/activity/a;->b()V

    .line 181
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    if-nez v0, :cond_1

    .line 185
    return-void

    .line 187
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 188
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/b;->c()V

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    .line 190
    invoke-virtual {p0, v1}, Lcom/huawei/hwid/update/d/a;->a(Ljava/lang/Class;)V

    .line 191
    return-void
.end method

.method public b(Lcom/huawei/hwid/update/d/b;)V
    .locals 0

    .line 118
    return-void
.end method

.method abstract c()V
.end method

.method protected d()Landroid/app/Activity;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 136
    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method protected e()V
    .locals 3

    .line 197
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    if-nez v0, :cond_0

    .line 198
    return-void

    .line 201
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/d/b;->c()V

    .line 202
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/update/d/a;->d:Lcom/huawei/hwid/update/d/b;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    goto :goto_0

    .line 203
    :catch_0
    move-exception v2

    .line 204
    const-string v0, "AbsUpdateWizard"

    const-string v1, "In dismissDialog, Failed to dismiss the dialog."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    :goto_0
    return-void
.end method
