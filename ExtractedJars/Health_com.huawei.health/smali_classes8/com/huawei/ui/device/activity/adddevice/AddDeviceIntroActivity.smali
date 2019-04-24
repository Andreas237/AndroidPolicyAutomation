.class public Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Lo/emr;

.field private d:Landroid/support/v4/view/ViewPager;

.field private e:Landroid/content/Context;

.field private f:Lo/egd;

.field private g:Landroid/widget/LinearLayout;

.field private h:Lo/egd;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private k:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

.field private l:Ljava/lang/String;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:Lo/eav;

.field private t:Z

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private v:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private w:I

.field private x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private y:Lo/egv;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->n:Ljava/util/ArrayList;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->m:Ljava/util/ArrayList;

    .line 100
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    .line 101
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    .line 102
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->r:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->t:Z

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->x:Ljava/util/ArrayList;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    .line 119
    const/16 v0, 0xf

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->z:I

    .line 120
    const/16 v0, 0x9

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->w:I

    .line 296
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->v:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Landroid/content/Context;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 389
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->a()Ljava/util/List;

    move-result-object v4

    .line 390
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 391
    :cond_0
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick null == connectedDeviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto :goto_0

    .line 393
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 394
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e(Ljava/util/List;)V

    goto :goto_0

    .line 395
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    .line 396
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b(Ljava/util/List;)V

    .line 398
    :cond_3
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Lo/egd;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->h:Lo/egd;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 458
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResult isFromWear "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->r:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->r:Z

    if-eqz v0, :cond_0

    .line 460
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 461
    const-string v0, "device_type"

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 462
    const-string v0, "isFromWear"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->r:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 463
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick  device_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 466
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->finish()V

    .line 467
    goto :goto_0

    .line 468
    :cond_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 469
    const-string v0, "device_type"

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 470
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick  device_type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    const/16 v0, 0x65

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->setResult(ILandroid/content/Intent;)V

    .line 472
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->finish()V

    .line 474
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Ljava/lang/Boolean;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 401
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect aw70 device, and also wants to connect aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto :goto_1

    .line 405
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 406
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v1

    invoke-static {v0, v1}, Lo/dbh;->d(II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 407
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect other device, and also wants to connect other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e(ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 409
    goto :goto_1

    .line 411
    :cond_1
    goto :goto_0

    .line 413
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    return-object p1
.end method

.method private c()V
    .locals 8

    .line 276
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initNavigation() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const/4 v4, 0x0

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 279
    :goto_0
    if-ge v4, v5, :cond_1

    .line 280
    new-instance v6, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 281
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v0, 0x10

    const/16 v1, 0x10

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 284
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 285
    sget v0, Lcom/huawei/ui/device/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 286
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 288
    :cond_0
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    sget v0, Lcom/huawei/ui/device/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 291
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 294
    :cond_1
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 336
    if-ltz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 337
    :cond_0
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "index<0||index>=textList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    return-void

    .line 340
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 343
    goto :goto_0

    .line 341
    :catch_0
    move-exception v4

    .line 342
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IndexOutOfBoundsException arg0 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",textList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(I)V

    return-void
.end method

.method private c(Ljava/lang/Boolean;)V
    .locals 8

    .line 672
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " enter setMidWareValue :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    .line 674
    const-string v0, "content://com.huawei.health.HwNotificationContentProvider/MidwareAuthority"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 675
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 676
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 677
    const-string v0, "value"

    const-string v1, "true"

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 679
    :cond_0
    const-string v0, "value"

    const-string v1, "false"

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 681
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v6, v7, v0, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 682
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setMidWareValue result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v5, v6, v7, v3, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Lo/egv;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 123
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_introduction_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->setContentView(I)V

    .line 124
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_detail_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c:Lo/emr;

    .line 126
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_device_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d:Landroid/support/v4/view/ViewPager;

    .line 127
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_prompt:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b:Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_spot:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->g:Landroid/widget/LinearLayout;

    .line 129
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_buy_device:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->h:Lo/egd;

    .line 130
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_guide_next:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f:Lo/egd;

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f:Lo/egd;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_start_paring_title:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 132
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 133
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->z:I

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 134
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->z:I

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->w:I

    sub-int/2addr v0, v1

    if-ge v4, v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$5;

    invoke-direct {v1, p0, v3}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$5;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;[I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 134
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 155
    :cond_0
    const/4 v0, 0x1

    new-array v4, v0, [I

    .line 156
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->z:I

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 157
    const/4 v5, 0x0

    :goto_1
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->z:I

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->w:I

    sub-int/2addr v0, v1

    if-ge v5, v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->h:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$3;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$3;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;[I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 157
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 178
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->h:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Lo/egd;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f:Lo/egd;

    return-object v0
.end method

.method private e()V
    .locals 7

    .line 184
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 186
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 187
    const-string v0, "isFromWear"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->r:Z

    .line 188
    const-string v0, "isPorc"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() device is porc!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    invoke-static {}, Lo/dda;->a()Lo/ddc;

    move-result-object v5

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c:Lo/emr;

    invoke-virtual {v5}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 193
    invoke-virtual {v5}, Lo/ddc;->p()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    .line 194
    invoke-virtual {v5}, Lo/ddc;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    .line 195
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    .line 196
    invoke-virtual {v5}, Lo/ddc;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    .line 197
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->t:Z

    .line 198
    goto/16 :goto_0

    :cond_0
    const-string v0, "isR1pro"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    invoke-static {}, Lo/dda;->c()Lo/ddc;

    move-result-object v5

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c:Lo/emr;

    invoke-virtual {v5}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 201
    invoke-virtual {v5}, Lo/ddc;->p()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    .line 202
    invoke-virtual {v5}, Lo/ddc;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    .line 203
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    .line 204
    invoke-virtual {v5}, Lo/ddc;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    .line 205
    invoke-virtual {v5}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    .line 206
    goto/16 :goto_0

    .line 207
    :cond_1
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    .line 208
    const-string v0, "dname"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    .line 209
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() type :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() dname :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v5

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c:Lo/emr;

    invoke-virtual {v0, v5}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 215
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->p()Ljava/util/ArrayList;

    move-result-object v6

    .line 216
    iput-object v6, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    .line 218
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->f()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    .line 219
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    :cond_2
    :goto_0
    goto :goto_1

    .line 222
    :catch_0
    move-exception v5

    .line 223
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AddDeviceIntroActivity encounteredClassNotFoundException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :goto_1
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() buyUrl :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 227
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() device is plugin downloaded!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v1}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    if-eqz v0, :cond_4

    .line 231
    const/4 v5, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    invoke-virtual {v0}, Lo/ean;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    invoke-virtual {v3}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->a()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 234
    :cond_3
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() device is plugin downloaded! image size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->s:Lo/eav;

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    invoke-virtual {v0}, Lo/ean;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    .line 236
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() device is plugin downloaded! buyUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :cond_4
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    :goto_3
    if-ltz v5, :cond_5

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_5
    goto :goto_4

    .line 243
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 245
    :goto_4
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->x:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;-><init>(Ljava/util/List;Ljava/lang/Boolean;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

    goto :goto_7

    .line 248
    :cond_7
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    :goto_5
    if-ltz v5, :cond_8

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    add-int/lit8 v5, v5, -0x1

    goto :goto_5

    :cond_8
    goto :goto_6

    .line 253
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 255
    :goto_6
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->n:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

    .line 257
    :goto_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$e;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->v:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 259
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() textList :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 264
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    :cond_b
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c()V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 271
    :cond_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->h:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 273
    :cond_d
    return-void
.end method

.method private e(ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 12

    .line 560
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v4

    .line 561
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 562
    invoke-virtual {p3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 563
    invoke-virtual {v4, v5}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 565
    const/16 v0, 0xb

    if-ne v0, p1, :cond_0

    .line 566
    const-string v0, "HUAWEI CM-R1P"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 571
    :cond_0
    invoke-virtual {v4, p1}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 572
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65b0\u8bbe\u5907="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", \u65e7\u8bbe\u5907="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    const/16 v0, 0xb

    if-ne v0, p1, :cond_2

    .line 574
    const-string v0, "HUAWEI CM-R1P"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    .line 575
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_r1_pro_name_title:I

    .line 576
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 577
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 582
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_replace_device_dialog_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 583
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 584
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 585
    invoke-virtual {v0, v9}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$6;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 586
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$7;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 592
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v10

    .line 603
    invoke-virtual {v10}, Lo/egv$b;->b()Lo/egv;

    move-result-object v11

    .line 604
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/egv;->setCancelable(Z)V

    .line 605
    invoke-virtual {v11}, Lo/egv;->show()V

    .line 606
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 416
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick has one connected device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 418
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 419
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick null == connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    return-void

    .line 422
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v5

    .line 423
    if-eqz v5, :cond_3

    .line 424
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 425
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect aw70 band mode, and also wants to connect device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 427
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect aw70 band mode, and also wants to connect aw70 devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto/16 :goto_0

    .line 430
    :cond_1
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect aw70 band mode, and also wants to connect old devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e(ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_0

    .line 433
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_9

    .line 434
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect aw70, and also wants to connect other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto :goto_0

    .line 438
    :cond_3
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 439
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect other device, and also wants to connect aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto :goto_0

    .line 442
    :cond_4
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick user has connect other device, and also wants to connect other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_5

    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_6

    .line 445
    :cond_5
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidWear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_7

    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    const/16 v1, 0x9

    if-eq v1, v0, :cond_7

    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    const/4 v1, -0x3

    if-ne v1, v0, :cond_8

    .line 449
    :cond_7
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    goto :goto_0

    .line 451
    :cond_8
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e(ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 455
    :cond_9
    :goto_0
    return-void
.end method

.method private f()V
    .locals 6

    .line 516
    new-instance v3, Lo/enw;

    invoke-direct {v3}, Lo/enw;-><init>()V

    .line 517
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/enw;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 518
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b()V

    goto :goto_1

    .line 520
    :cond_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->c()Ljava/util/List;

    move-result-object v4

    .line 521
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 522
    invoke-virtual {v3, v4}, Lo/enw;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 523
    invoke-virtual {v3, v4}, Lo/enw;->d(Ljava/util/List;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 524
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;

    invoke-direct {v1, p0, v3}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$10;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;Lo/enw;)V

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v2, v1}, Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 541
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b()V

    .line 543
    :goto_0
    goto :goto_1

    .line 544
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b()V

    goto :goto_1

    .line 547
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b()V

    .line 551
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f()V

    return-void
.end method

.method private i()V
    .locals 4

    .line 478
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    invoke-static {v0}, Lo/dda;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/dbf;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 479
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    .line 480
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_midware_authority_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    .line 481
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_midware_authority_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$1;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 482
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$2;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 494
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 507
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->y:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 510
    goto :goto_0

    .line 511
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->f()V

    .line 513
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->b()V

    return-void
.end method

.method private k()V
    .locals 5

    .line 688
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    .line 689
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_device_ota_error_message:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$8;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V

    .line 690
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 696
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 697
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 698
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 699
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->i()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 349
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_guide_next:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 350
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 351
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 352
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k()V

    goto/16 :goto_0

    .line 355
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 356
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 357
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aw70 is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->k()V

    goto/16 :goto_0

    .line 361
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a()V

    goto/16 :goto_0

    .line 364
    :cond_2
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 366
    :cond_3
    sget v0, Lcom/huawei/ui/device/R$id;->device_introduction_buy_device:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 369
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 370
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    const-string v0, "device_name"

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->p:I

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->l:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->t:Z

    invoke-static {v1, v2, v3}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    const-string v0, "device_type"

    const-string v1, "HDK_WEAR"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    sget-object v0, Lo/dae;->fD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 374
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 376
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 377
    const-string v0, "com.huawei.health"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.operation.activity.WebViewActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 379
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->q:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 380
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 381
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 382
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "Device"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 383
    invoke-virtual {p0, v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->startActivity(Landroid/content/Intent;)V

    .line 386
    :cond_4
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 112
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 113
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a:Landroid/content/Context;

    .line 114
    iput-object p0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e:Landroid/content/Context;

    .line 115
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->d()V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->e()V

    .line 118
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 611
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 612
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    return-void
.end method
