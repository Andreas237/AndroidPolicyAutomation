.class public abstract Lcom/huawei/hms/update/e/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/activity/a;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field

.field public b:Lcom/huawei/hms/activity/a;

.field protected c:Lcom/huawei/hms/update/e/u;

.field protected d:Lcom/huawei/hms/update/e/b;

.field protected e:Z

.field protected f:I

.field protected g:Ljava/lang/String;

.field protected h:Ljava/lang/String;

.field protected i:I

.field protected j:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    .line 99
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/update/e/a;->f:I

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->g:Ljava/lang/String;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->h:Ljava/lang/String;

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/e/a;->i:I

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->j:Ljava/lang/String;

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 427
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 429
    :pswitch_0
    const-class v0, Lcom/huawei/hms/update/e/s;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 431
    :pswitch_1
    const-class v0, Lcom/huawei/hms/update/e/v;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 433
    :pswitch_2
    const-class v0, Lcom/huawei/hms/update/e/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 435
    :pswitch_3
    const-class v0, Lcom/huawei/hms/update/e/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 439
    :goto_0
    :pswitch_4
    const-string v0, ""

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 6

    .line 349
    const/4 v3, 0x0

    .line 351
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 352
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/update/e/a;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 354
    :cond_0
    if-nez v3, :cond_1

    .line 355
    return-void

    .line 359
    :cond_1
    :try_start_0
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 360
    const-class v0, Lcom/huawei/hms/activity/a;

    invoke-virtual {v4, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v5

    .line 362
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/activity/a;

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    goto :goto_0

    .line 364
    :catch_0
    move-exception v4

    .line 365
    const-string v0, "AbsUpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getBridgeActivityDelegate error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :goto_0
    return-void
.end method

.method private c(II)Ljava/lang/String;
    .locals 3

    .line 289
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 291
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 293
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 295
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "4000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 297
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "5000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 299
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "6000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 303
    :goto_0
    :pswitch_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method protected a()Landroid/app/Activity;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 143
    const/4 v0, 0x0

    return-object v0

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method protected a(II)V
    .locals 6

    .line 234
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/b/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    return-void

    .line 239
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/a;->a()Landroid/app/Activity;

    move-result-object v2

    .line 240
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 241
    :cond_1
    return-void

    .line 244
    :cond_2
    new-instance v3, Lcom/huawei/hms/c/g;

    invoke-direct {v3, v2}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v4

    .line 247
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 250
    const-string v0, "package"

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    const-string v0, "target_package"

    iget-object v1, p0, Lcom/huawei/hms/update/e/a;->g:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    const-string v0, "target_ver"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    const-string v0, "sdk_ver"

    const v1, 0x13a59d4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    const-string v0, "app_id"

    invoke-static {v2}, Lcom/huawei/hms/c/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    const-string v0, "trigger_api"

    const-string v1, "core.connnect"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    const-string v0, "update_type"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    const-string v0, "net_type"

    invoke-static {v2}, Lcom/huawei/hms/c/f;->a(Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    const-string v0, "result"

    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/update/e/a;->c(II)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    const-string v1, "HMS_SDK_UPDATE"

    invoke-virtual {v0, v2, v1, v5}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 277
    return-void
.end method

.method public a(Lcom/huawei/hms/update/e/b;)V
    .locals 0

    .line 123
    return-void
.end method

.method abstract a(Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hms/update/e/b;>;)V"
        }
    .end annotation
.end method

.method protected a(Ljava/lang/String;I)Z
    .locals 4

    .line 413
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    const/4 v0, 0x0

    return v0

    .line 416
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/a;->a()Landroid/app/Activity;

    move-result-object v1

    .line 417
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 418
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 421
    :cond_2
    new-instance v2, Lcom/huawei/hms/c/g;

    invoke-direct {v2, v1}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 422
    invoke-virtual {v2, p1}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v3

    .line 423
    if-lt v3, p2, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected a(Z)Z
    .locals 3

    .line 316
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/a;->a()Landroid/app/Activity;

    move-result-object v1

    .line 317
    if-nez v1, :cond_0

    .line 318
    const/4 v0, 0x0

    return v0

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->f()Ljava/util/ArrayList;

    move-result-object v2

    .line 322
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 324
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    if-nez v0, :cond_1

    .line 325
    invoke-direct {p0, v2}, Lcom/huawei/hms/update/e/a;->a(Ljava/util/ArrayList;)V

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_2

    .line 331
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    .line 332
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0, v2}, Lcom/huawei/hms/update/e/u;->a(Ljava/util/ArrayList;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0, p1}, Lcom/huawei/hms/update/e/u;->b(Z)V

    .line 335
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, v1}, Lcom/huawei/hms/activity/a;->onBridgeActivityCreate(Landroid/app/Activity;)V

    .line 336
    const/4 v0, 0x1

    return v0

    .line 339
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method protected b()V
    .locals 4

    .line 204
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    if-nez v0, :cond_0

    .line 205
    return-void

    .line 208
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/b;->c()V

    .line 209
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    goto :goto_0

    .line 210
    :catch_0
    move-exception v3

    .line 211
    const-string v0, "AbsUpdateWizard"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In dismissDialog, Failed to dismiss the dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :goto_0
    return-void
.end method

.method protected b(II)V
    .locals 4

    .line 381
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/a;->a()Landroid/app/Activity;

    move-result-object v2

    .line 382
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    :cond_0
    return-void

    .line 386
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/update/e/a;->a(II)V

    .line 388
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 389
    const-string v0, "intent.extra.DELEGATE_CLASS_OBJECT"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 390
    const-string v0, "intent.extra.RESULT"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 391
    const/4 v0, -0x1

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 393
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 394
    return-void
.end method

.method public b(Lcom/huawei/hms/update/e/b;)V
    .locals 0

    .line 125
    return-void
.end method

.method public onBridgeActivityCreate(Landroid/app/Activity;)V
    .locals 2

    .line 151
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->a:Ljava/lang/ref/WeakReference;

    .line 153
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_1

    .line 154
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 155
    if-nez v1, :cond_0

    .line 156
    return-void

    .line 158
    :cond_0
    const-string v0, "intent.extra.update.info"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/update/e/u;

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    .line 159
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    if-nez v0, :cond_1

    .line 160
    return-void

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->g:Ljava/lang/String;

    .line 165
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->h:Ljava/lang/String;

    .line 166
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->c()I

    move-result v0

    iput v0, p0, Lcom/huawei/hms/update/e/a;->i:I

    .line 167
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->c:Lcom/huawei/hms/update/e/u;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/u;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->j:Ljava/lang/String;

    .line 170
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    .line 171
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    .line 172
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hms/update/e/a;->f:I

    .line 173
    return-void
.end method

.method public onBridgeActivityDestroy()V
    .locals 1

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->a:Ljava/lang/ref/WeakReference;

    .line 178
    invoke-virtual {p0}, Lcom/huawei/hms/update/e/a;->b()V

    .line 179
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0}, Lcom/huawei/hms/activity/a;->onBridgeActivityDestroy()V

    .line 182
    :cond_0
    return-void
.end method

.method public onBridgeConfigurationChanged()V
    .locals 2

    .line 186
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0}, Lcom/huawei/hms/activity/a;->onBridgeConfigurationChanged()V

    .line 188
    return-void

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    if-nez v0, :cond_1

    .line 192
    return-void

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 195
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/b;->c()V

    .line 196
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/update/e/a;->d:Lcom/huawei/hms/update/e/b;

    .line 197
    invoke-virtual {p0, v1}, Lcom/huawei/hms/update/e/a;->a(Ljava/lang/Class;)V

    .line 198
    return-void
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)V
    .locals 1

    .line 398
    iget-boolean v0, p0, Lcom/huawei/hms/update/e/a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    if-eqz v0, :cond_0

    .line 399
    iget-object v0, p0, Lcom/huawei/hms/update/e/a;->b:Lcom/huawei/hms/activity/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hms/activity/a;->onKeyUp(ILandroid/view/KeyEvent;)V

    .line 401
    :cond_0
    return-void
.end method
