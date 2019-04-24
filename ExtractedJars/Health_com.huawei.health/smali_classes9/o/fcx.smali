.class public Lo/fcx;
.super Lo/fcu;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation
.end field

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/view/View;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:Lo/fdj;

.field private k:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field private l:Ljava/lang/String;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;)V
    .locals 1

    .line 76
    invoke-direct {p0, p1, p2}, Lo/fcu;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcx;->a:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/fcx;->h:I

    .line 101
    new-instance v0, Lo/fcx$1;

    invoke-direct {v0, p0}, Lo/fcx$1;-><init>(Lo/fcx;)V

    iput-object v0, p0, Lo/fcx;->p:Landroid/os/Handler;

    .line 78
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lo/fcx;->i:Lo/fdj;

    .line 79
    iget-object v0, p0, Lo/fcx;->i:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 80
    return-void
.end method

.method static synthetic a(Lo/fcx;)I
    .locals 1

    .line 58
    iget v0, p0, Lo/fcx;->h:I

    return v0
.end method

.method private a(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 3

    .line 417
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 418
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    const-string v0, "title"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 420
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 421
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 422
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 423
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 424
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 425
    sget-object v0, Lo/dae;->cX:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcx;->c(Ljava/lang/String;)V

    .line 426
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 275
    const/16 v0, 0x7dc

    iput v0, p0, Lo/fcx;->h:I

    .line 276
    new-instance v0, Lo/egz$d;

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egz$d;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    .line 277
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$array;->IDS_hw_show_healthdata_bloodsugar_timeperiod_array:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egz$d;->d(Ljava/util/List;)Lo/egz$d;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_timeperiod:I

    .line 278
    invoke-virtual {v0, v1}, Lo/egz$d;->d(I)Lo/egz$d;

    move-result-object v0

    new-instance v1, Lo/fcx$2;

    invoke-direct {v1, p0, p1}, Lo/fcx$2;-><init>(Lo/fcx;I)V

    .line 279
    invoke-virtual {v0, v1}, Lo/egz$d;->b(Lo/egz$c;)Lo/egz$d;

    move-result-object v0

    new-instance v1, Lo/fcx$4;

    invoke-direct {v1, p0}, Lo/fcx$4;-><init>(Lo/fcx;)V

    .line 294
    invoke-virtual {v0, v1}, Lo/egz$d;->e(Lo/egz$c;)Lo/egz$d;

    move-result-object v3

    .line 300
    invoke-virtual {v3}, Lo/egz$d;->e()Lo/egz;

    move-result-object v4

    .line 301
    invoke-virtual {v4}, Lo/egz;->show()V

    .line 302
    return-void
.end method

.method static synthetic b(Lo/fcx;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/fcx;->i()V

    return-void
.end method

.method static synthetic c(Lo/fcx;)Landroid/os/Handler;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/fcx;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 394
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 395
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 397
    return-void
.end method

.method static synthetic d(Lo/fcx;I)I
    .locals 0

    .line 58
    iput p1, p0, Lo/fcx;->h:I

    return p1
.end method

.method static synthetic d(Lo/fcx;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 58
    iput-object p1, p0, Lo/fcx;->a:Ljava/util/List;

    return-object p1
.end method

.method private d(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 4

    .line 407
    iget-object v0, p0, Lo/fcx;->k:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/fcx;->l:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v3

    .line 408
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 409
    invoke-direct {p0, p1}, Lo/fcx;->a(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    goto :goto_0

    .line 411
    :cond_0
    invoke-virtual {p0, p1}, Lo/fcx;->b(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 414
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/fcx;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/fcx;->g()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 349
    sget-object v0, Lo/dae;->db:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcx;->c(Ljava/lang/String;)V

    .line 350
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 351
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 352
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 354
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_SUGAR"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 356
    const-string v0, "view"

    const-string v1, "MeasureDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 358
    const-string v0, "bloodsugar_timeperiod_key"

    iget v1, p0, Lo/fcx;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 359
    const-string v0, "bloodsugar_timeperiod_key_string"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 360
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 361
    return-void
.end method

.method static synthetic e(Lo/fcx;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/fcx;->l()V

    return-void
.end method

.method static synthetic e(Lo/fcx;Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/fcx;->e(Ljava/lang/String;)V

    return-void
.end method

.method private g()V
    .locals 10

    .line 236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 237
    iget-object v0, p0, Lo/fcx;->i:Lo/fdj;

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    move-wide v4, v8

    new-instance v7, Lo/fcx$3;

    invoke-direct {v7, p0}, Lo/fcx$3;-><init>(Lo/fcx;)V

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/fdj;->e(Landroid/content/Context;JJILo/egg;)V

    .line 246
    return-void
.end method

.method private i()V
    .locals 4

    .line 250
    iget-object v0, p0, Lo/fcx;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 251
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshBottomListView  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fcx;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-direct {p0}, Lo/fcx;->o()V

    .line 254
    invoke-virtual {p0}, Lo/fcx;->e()V

    goto :goto_0

    .line 256
    :cond_0
    invoke-virtual {p0}, Lo/fcx;->d()V

    .line 258
    :goto_0
    return-void
.end method

.method static synthetic k(Lo/fcx;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/fcx;->p()V

    return-void
.end method

.method private l()V
    .locals 5

    .line 326
    sget-object v0, Lo/dae;->cU:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcx;->c(Ljava/lang/String;)V

    .line 327
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 328
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timePeriod="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/fcx;->h:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-string v0, "bloodsugar_timeperiod_key"

    iget v1, p0, Lo/fcx;->h:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 330
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 331
    return-void
.end method

.method private m()V
    .locals 5

    .line 306
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 307
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_plugin_device_selection_click_bind_my_device_select:I

    .line 308
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 309
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fcx$10;

    invoke-direct {v2, p0}, Lo/fcx$10;-><init>(Lo/fcx;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/fcx;->e:Landroid/app/Activity;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_cancle_button:I

    .line 315
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fcx$5;

    invoke-direct {v2, p0}, Lo/fcx$5;-><init>(Lo/fcx;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 320
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 321
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 322
    return-void
.end method

.method private n()I
    .locals 16

    .line 364
    const/4 v9, 0x0

    .line 365
    const/4 v10, 0x0

    .line 366
    const/4 v11, 0x0

    .line 367
    const/4 v0, 0x1

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, "HDK_BLOOD_SUGAR"

    const/4 v1, 0x0

    aput-object v0, v12, v1

    .line 368
    const-string v13, "kind =?"

    .line 370
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/fcx;->e:Landroid/app/Activity;

    const-string v1, "device.db"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/Activity;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v10, v0

    .line 371
    move-object v0, v10

    const-string v1, "device"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object v3, v13

    move-object v4, v12

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v11, v0

    .line 372
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 373
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 382
    :cond_0
    if-eqz v11, :cond_1

    .line 383
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 385
    :cond_1
    if-eqz v10, :cond_6

    .line 386
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_1

    .line 376
    :catch_0
    move-exception v14

    .line 377
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SQLException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 382
    if-eqz v11, :cond_2

    .line 383
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 385
    :cond_2
    if-eqz v10, :cond_6

    .line 386
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 378
    :catch_1
    move-exception v14

    .line 379
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 382
    if-eqz v11, :cond_3

    .line 383
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 385
    :cond_3
    if-eqz v10, :cond_6

    .line 386
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 382
    :catchall_0
    move-exception v15

    if-eqz v11, :cond_4

    .line 383
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 385
    :cond_4
    if-eqz v10, :cond_5

    .line 386
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 388
    :cond_5
    throw v15

    .line 389
    :cond_6
    :goto_1
    return v9
.end method

.method private o()V
    .locals 5

    .line 262
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 263
    iget-object v0, p0, Lo/fcx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 264
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 265
    iget-object v0, p0, Lo/fcx;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 266
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 268
    return-void

    .line 264
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 271
    :cond_1
    return-void
.end method

.method private p()V
    .locals 3

    .line 335
    sget-object v0, Lo/dae;->cY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/fcx;->c(Ljava/lang/String;)V

    .line 336
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 337
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 338
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 340
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_SUGAR"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 342
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 344
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 345
    return-void
.end method

.method private t()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation

    .line 401
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lo/fcx;->k:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 402
    iget-object v0, p0, Lo/fcx;->k:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    const-string v1, "BLOOD_SUGAR"

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByLocation(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 6

    .line 127
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/ui/main/R$layout;->base_health_before_one_blood_sugar:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/fcx;->d:Landroid/view/View;

    .line 128
    iget-object v0, p0, Lo/fcx;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->blood_sugar_server_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fcx;->c:Landroid/widget/LinearLayout;

    .line 129
    iget-object v0, p0, Lo/fcx;->d:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->blood_sugar_server_imageview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fcx;->b:Landroid/widget/ImageView;

    .line 130
    iget-object v0, p0, Lo/fcx;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fcx;->l:Ljava/lang/String;

    .line 132
    invoke-direct {p0}, Lo/fcx;->t()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fcx;->f:Ljava/util/List;

    .line 133
    iget-object v0, p0, Lo/fcx;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcx;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    :cond_0
    iget-object v0, p0, Lo/fcx;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p0, Lo/fcx;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lo/fcx;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 138
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 139
    if-eqz v5, :cond_2

    .line 140
    iget-object v0, p0, Lo/fcx;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 143
    :cond_2
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "icon is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :goto_0
    iget-object v0, p0, Lo/fcx;->d:Landroid/view/View;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 99
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 207
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onItemClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation

    .line 164
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 165
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 166
    return-object v1
.end method

.method public b(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 2

    .line 429
    new-instance v1, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 430
    iget-object v0, p0, Lo/fcx;->l:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 431
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 432
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 433
    iget-object v0, p0, Lo/fcx;->k:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 434
    invoke-direct {p0, p1}, Lo/fcx;->a(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 435
    return-void
.end method

.method public c()V
    .locals 4

    .line 159
    const-string v0, "BloodSugarBeforeInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 193
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 194
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/fcx;->b(I)V

    goto :goto_0

    .line 195
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 196
    invoke-direct {p0}, Lo/fcx;->n()I

    move-result v0

    if-lez v0, :cond_1

    .line 197
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/fcx;->b(I)V

    goto :goto_0

    .line 200
    :cond_1
    invoke-direct {p0}, Lo/fcx;->m()V

    .line 203
    :cond_2
    :goto_0
    return-void
.end method

.method public c(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    .line 123
    return-void
.end method

.method public c(Ljava/util/Date;)V
    .locals 0

    .line 95
    return-void
.end method

.method public d()V
    .locals 0

    .line 89
    invoke-super {p0}, Lo/fcu;->d()V

    .line 90
    return-void
.end method

.method public e()V
    .locals 0

    .line 84
    invoke-super {p0}, Lo/fcu;->e()V

    .line 85
    return-void
.end method

.method public e(Ljava/util/Date;)V
    .locals 2

    .line 151
    iget-object v0, p0, Lo/fcx;->p:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 152
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 153
    iget-object v0, p0, Lo/fcx;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 154
    return-void
.end method

.method public f()Z
    .locals 1

    .line 222
    const/4 v0, 0x0

    return v0
.end method

.method public h()Lo/fcv;
    .locals 11

    .line 171
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    invoke-static {v0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    new-instance v0, Lo/fcv;

    invoke-direct {v0}, Lo/fcv;-><init>()V

    return-object v0

    .line 174
    :cond_0
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v4, v0, Lo/fdf;->a:J

    .line 175
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    double-to-int v6, v0

    .line 176
    iget-object v0, p0, Lo/fcx;->g:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v7, v0, Lo/fdf;->d:D

    .line 177
    new-instance v9, Lo/fcv;

    invoke-direct {v9}, Lo/fcv;-><init>()V

    .line 179
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v10

    .line 180
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_lasttime_format:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 181
    invoke-static {v4, v5}, Lo/fee;->e(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 182
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fcx;->e:Landroid/app/Activity;

    .line 183
    invoke-static {v2, v6}, Lo/fdd;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 180
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fcv;->e(Ljava/lang/String;)V

    .line 184
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v7, v8, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fcv;->a(Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bloodsugar_mmol:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fcv;->c(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lo/fcx;->e:Landroid/app/Activity;

    double-to-float v1, v7

    invoke-static {v0, v6, v1}, Lo/fdd;->a(Landroid/content/Context;IF)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/fcv;->b(Ljava/lang/String;)V

    .line 187
    double-to-float v0, v7

    invoke-static {v6, v0}, Lo/fdd;->c(IF)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/fcv;->d(I)V

    .line 188
    return-object v9
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/acn;>;"
        }
    .end annotation

    .line 212
    const/4 v0, 0x0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 227
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 228
    sget v0, Lcom/huawei/ui/main/R$id;->blood_sugar_server_imageview:I

    if-ne v2, v0, :cond_0

    .line 229
    iget-object v0, p0, Lo/fcx;->f:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/ChildService;

    invoke-direct {p0, v0}, Lo/fcx;->d(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 232
    :cond_0
    return-void
.end method
