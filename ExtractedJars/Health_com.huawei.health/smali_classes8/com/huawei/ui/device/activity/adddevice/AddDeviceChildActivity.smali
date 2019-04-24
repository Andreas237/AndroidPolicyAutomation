.class public Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;,
        Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;,
        Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;,
        Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Lo/egv;

.field private C:Lo/egn;

.field private D:Ljava/lang/String;

.field private E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

.field private F:Lo/eoa;

.field private G:Z

.field private H:Z

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eok;>;"
        }
    .end annotation
.end field

.field private J:Z

.field private K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eok;>;"
        }
    .end annotation
.end field

.field private L:I

.field private M:Lo/egv;

.field private N:Z

.field private S:Lo/egv;

.field private a:Landroid/widget/ListView;

.field b:Lo/ahi$e;

.field private c:Lo/env;

.field private d:Landroid/content/Context;

.field public e:Ljava/lang/String;

.field private f:Lo/eon;

.field private g:Landroid/widget/RelativeLayout;

.field private h:I

.field private i:Lo/emr;

.field private j:Lo/ego$a;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/eok;>;"
        }
    .end annotation
.end field

.field private l:Ljava/lang/String;

.field private m:I

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/TextView;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Z

.field private v:Lo/ego;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    .line 143
    const-string v0, "https://play.google.com/store/apps/details?id=com.huawei.health"

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l:Ljava/lang/String;

    .line 149
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->n:Z

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m:I

    .line 153
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t:I

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u:Z

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    .line 166
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w:Ljava/util/List;

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    .line 170
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x:I

    .line 171
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    .line 177
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D:Ljava/lang/String;

    .line 182
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A:Z

    .line 240
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->G:Z

    .line 241
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->H:Z

    .line 450
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    .line 451
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    .line 948
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->L:I

    .line 1827
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$17;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$17;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b:Lo/ahi$e;

    return-void
.end method

.method private A()V
    .locals 4

    .line 1639
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSelectDeviceListAndroidWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1640
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1641
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSelectDeviceListAndroidWear() mList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1642
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1645
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_porc:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_porsche_design_content:I

    .line 1646
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->device_icon_leo2:I

    .line 1645
    const/16 v3, 0xa

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(ILjava/lang/String;Ljava/lang/String;I)V

    .line 1647
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_leo:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_huaweiwatch2_content:I

    .line 1648
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->device_icon_leo:I

    .line 1647
    const/16 v3, 0xa

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(ILjava/lang/String;Ljava/lang/String;I)V

    .line 1650
    new-instance v0, Lo/eon;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/eon;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    .line 1651
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1652
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A:Z

    return v0
.end method

.method static synthetic B(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lo/egv;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    return-object v0
.end method

.method private B()V
    .locals 5

    .line 1879
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 1880
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_ota_later_note:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$19;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$19;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1881
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 1887
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 1888
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 1889
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 1890
    return-void
.end method

.method static synthetic C(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j()V

    return-void
.end method

.method private D()V
    .locals 5

    .line 1539
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1540
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    const-string v1, "personalbasicinfosetting"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1541
    const-string v0, "personalbasicinfosettingflag"

    const-string v1, "personalbasicinfosetting"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1544
    :cond_0
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v4

    .line 1546
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->h:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_1

    .line 1547
    const-string v0, "pairGuideProductType"

    const/16 v1, 0xa

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1548
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start is_proc:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->J:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1549
    const-string v0, "pairGuideProductName"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_leo:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1550
    const-string v0, "IS_PROC"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->J:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 1552
    :cond_1
    const-string v0, "pairGuideProductType"

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1553
    const-string v0, "pairGuideProductName"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_w1:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1555
    :goto_0
    const-string v0, "pairGuideFromScanList"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1556
    const/4 v0, 0x1

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1557
    return-void
.end method

.method static synthetic D(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    return-object p1
.end method

.method private a()V
    .locals 6

    .line 330
    const-string v0, "market://details?id=com.huawei.health"

    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 331
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 332
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 337
    :cond_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not installed Market"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_app_store_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    return-void

    .line 343
    :goto_0
    goto :goto_1

    .line 341
    :catch_0
    move-exception v4

    .line 342
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    :goto_1
    return-void
.end method

.method private a(I)V
    .locals 1

    .line 1449
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(ILjava/lang/String;)V

    .line 1450
    return-void
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1517
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1518
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    const-string v1, "personalbasicinfosetting"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1519
    const-string v0, "personalbasicinfosettingflag"

    const-string v1, "personalbasicinfosetting"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1521
    :cond_0
    const-string v0, "pairGuideProductType"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1522
    const-string v0, "pairGuideProductName"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1523
    const-string v0, "pairGuideSelectName"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1524
    const-string v0, "pairGuideFromScanList"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1525
    const/4 v0, 0x1

    invoke-virtual {p0, v2, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1526
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 786
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m()V

    .line 787
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 788
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 789
    invoke-virtual {v5}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-virtual {v5}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 790
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "has band plugin info, uuid :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "publish mode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 793
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 795
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 796
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 797
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lo/ear;)V

    goto :goto_1

    .line 801
    :cond_1
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 802
    invoke-virtual {v5}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 803
    :cond_2
    invoke-direct {p0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Lo/ear;)V

    .line 807
    :cond_3
    :goto_1
    goto/16 :goto_0

    .line 808
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 809
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no band plugin info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    const/16 v1, 0x46

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->removeMessages(I)V

    goto :goto_2

    .line 814
    :cond_5
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t()Ljava/util/List;

    move-result-object v4

    .line 815
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Ljava/util/List;)V

    .line 816
    goto :goto_2

    .line 818
    :cond_6
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no index info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    :goto_2
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 828
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter checkIsNeedUpdate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 831
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 833
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$10;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->c(Ljava/lang/String;Lo/eaz;)V

    .line 847
    :cond_0
    goto :goto_0

    .line 848
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 850
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Ljava/util/List;)V

    goto :goto_1

    .line 852
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    .line 853
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    const/16 v1, 0x46

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->removeMessages(I)V

    .line 855
    :goto_1
    return-void
.end method

.method private a(Lo/ear;)V
    .locals 7

    .line 1182
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {p1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    invoke-virtual {v0}, Lo/eav;->b()Ljava/lang/String;

    move-result-object v4

    .line 1183
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8d44\u6e90\u6587\u4ef6\u4e0b\u8f7d\u6210\u529f  \u540d\u5b57\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {p1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v5

    .line 1185
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 1186
    const/16 v0, 0xa

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1187
    iput-object v5, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1189
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->G:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    return p1
.end method

.method private b()V
    .locals 5

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    .line 224
    invoke-static {}, Lo/dhd;->a()Lo/dhd;

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ddd;->c(Landroid/content/Context;)Lo/ddd;

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 229
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c:Lo/env;

    .line 231
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 232
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 233
    const-string v0, "personalbasicinfosettingflag"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    .line 234
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initListView() personalBasicInfoSettingflag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    const-string v0, "KEY_OUTSIDE_OPEN_ACTIVITY_FLAG"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->n:Z

    .line 236
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOutsideOpenApp: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :cond_1
    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 5

    .line 1459
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter hasSelectDevice():\u9700\u8981\u8fde\u63a5\u7684\u8bbe\u5907\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isClicked:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1460
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u:Z

    if-eqz v0, :cond_0

    .line 1461
    return-void

    .line 1463
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u:Z

    .line 1464
    iput p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->h:I

    .line 1465
    invoke-static {p1}, Lo/ent;->c(I)Lo/ddc;

    move-result-object v4

    .line 1466
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 1470
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D()V

    .line 1471
    goto :goto_1

    .line 1474
    :sswitch_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k(Ljava/lang/String;)V

    .line 1475
    goto :goto_1

    .line 1477
    :goto_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start enterDevicePairGuide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1478
    invoke-virtual {v4}, Lo/ddc;->k()I

    move-result v0

    invoke-virtual {v4}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1481
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3 -> :sswitch_1
        0x3 -> :sswitch_0
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method private b(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 1654
    invoke-static {p1, p2, p3, p4}, Lo/ent;->e(ILjava/lang/String;Ljava/lang/String;I)Lo/eok;

    move-result-object v1

    .line 1655
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$b;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eok;)V

    invoke-virtual {v1, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 1656
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1657
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Lo/ear;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 1493
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1494
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.notification.NotificationOpenActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1495
    const-string v0, "isFromWear"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1496
    const-string v0, "device_id"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1497
    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->startActivity(Landroid/content/Intent;)V

    .line 1498
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 1499
    return-void
.end method

.method private b(Lo/eav;)V
    .locals 9

    .line 1230
    invoke-virtual {p1}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v6

    .line 1232
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1234
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupportHeartRate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/dat;->b(I)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1235
    invoke-static {v6}, Lo/dat;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1236
    return-void

    .line 1239
    :cond_0
    const/4 v0, -0x1

    if-ne v0, v6, :cond_5

    .line 1240
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ezPluginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eav;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1241
    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1242
    return-void

    .line 1244
    :cond_1
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lo/eaw;->b(Lo/eav;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 1245
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 1246
    :cond_2
    return-void

    .line 1249
    :cond_3
    new-instance v0, Lo/eok;

    move v1, v6

    .line 1250
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v2

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lo/eaw;->b(Lo/eav;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1251
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v3

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v4

    invoke-virtual {v4}, Lo/ean;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lo/eaw;->b(Lo/eav;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1253
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v4

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v5

    invoke-virtual {v5}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lo/eok;-><init>(ILjava/lang/String;Ljava/lang/String;ZLandroid/graphics/Bitmap;)V

    move-object v8, v0

    .line 1254
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/eok;->e(I)V

    .line 1256
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;

    invoke-direct {v0, p0, v8}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eok;)V

    invoke-virtual {v8, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 1257
    const-string v0, "1"

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 1260
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1262
    :goto_0
    goto :goto_1

    .line 1264
    :cond_5
    new-instance v0, Lo/eok;

    move v1, v6

    .line 1265
    invoke-static {v6}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v2

    invoke-virtual {v2}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    .line 1266
    invoke-static {v6}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v3

    invoke-virtual {v3}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    .line 1268
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v4

    invoke-virtual {p1}, Lo/eav;->d()Lo/ean;

    move-result-object v5

    invoke-virtual {v5}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    const/4 v4, 0x1

    invoke-direct/range {v0 .. v5}, Lo/eok;-><init>(ILjava/lang/String;Ljava/lang/String;ZLandroid/graphics/Bitmap;)V

    move-object v7, v0

    .line 1269
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/eok;->e(I)V

    .line 1271
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;

    invoke-direct {v0, p0, v7}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eok;)V

    invoke-virtual {v7, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 1272
    invoke-static {v6}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 1273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 1275
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1278
    :goto_1
    return-void
.end method

.method private b(I)Z
    .locals 1

    .line 1577
    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/16 v0, 0xa

    if-ne p1, v0, :cond_1

    .line 1579
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1581
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->h:I

    return p1
.end method

.method private c(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 5

    .line 1560
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->h:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1561
    const-string v0, "pairGuideW1Success"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1562
    return-object p1

    .line 1564
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c:Lo/env;

    invoke-virtual {v0}, Lo/env;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 1565
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 1566
    return-object p1

    .line 1568
    :cond_1
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enterW1PairGuide deviceInfo========="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1569
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1570
    const-string v0, "pairGuideW1Success"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1573
    :cond_2
    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    return-object p1
.end method

.method private c()V
    .locals 2

    .line 244
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_add_device_child:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->setContentView(I)V

    .line 245
    sget v0, Lcom/huawei/ui/device/R$id;->select_device_detail_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setVisibility(I)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$2;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    sget v0, Lcom/huawei/ui/device/R$id;->list_setup_device:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a:Landroid/widget/ListView;

    .line 260
    sget v0, Lcom/huawei/ui/device/R$id;->addDevice_error_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g:Landroid/widget/RelativeLayout;

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$13;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$13;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    sget v0, Lcom/huawei/ui/device/R$id;->adddevice_error_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p:Landroid/widget/TextView;

    .line 285
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->h()V

    .line 286
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->n:Z

    if-eqz v0, :cond_0

    .line 287
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A()V

    goto :goto_0

    .line 290
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k()V

    .line 292
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Lo/ear;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 706
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 707
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_download_resoure_tip_content_message_new:I

    .line 708
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$8;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$8;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V

    .line 709
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$6;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 724
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 740
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 743
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 863
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateDescripForWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 864
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    .line 865
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    const/16 v1, 0x46

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->removeMessages(I)V

    .line 867
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 868
    const/16 v0, 0x14

    iput v0, v4, Landroid/os/Message;->what:I

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 871
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    .line 872
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x:I

    .line 874
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ear;

    .line 875
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v6}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$15;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$15;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/ear;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->b(Ljava/lang/String;Lo/eaz;)V

    .line 898
    goto :goto_0

    .line 899
    :cond_0
    return-void
.end method

.method private c(Lo/ear;)V
    .locals 1

    .line 904
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 905
    return-void
.end method

.method private c(Z)V
    .locals 8

    .line 453
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForBand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_add_device_smart_band:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForBand() mHWList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 460
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForBand() mRYList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 463
    :cond_1
    invoke-static {p1}, Lo/ent;->c(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ddc;

    .line 464
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewForBand() type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/ddc;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    move-object v0, p0

    invoke-virtual {v7}, Lo/ddc;->k()I

    move-result v1

    invoke-virtual {v7}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lo/ddc;->i()I

    move-result v4

    invoke-virtual {v7}, Lo/ddc;->c()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(ILjava/lang/String;Ljava/lang/String;II)V

    .line 466
    goto :goto_0

    .line 467
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l()V

    .line 470
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 472
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 474
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewForBand() userAgreed \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    const-string v0, "true"

    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 478
    const-string v0, "SMART_BAND"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 479
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 482
    :cond_3
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Ljava/lang/String;)V

    .line 483
    const-string v0, "SMART_BAND"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 485
    :goto_1
    goto :goto_2

    .line 487
    :cond_4
    const-string v0, "SMART_BAND"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 488
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    .line 490
    :goto_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->H:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    return-object p1
.end method

.method private d()V
    .locals 11

    .line 302
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 303
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips1:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 304
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips2:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 305
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips3:I

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lo/ene;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 306
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b1_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v4, v6

    .line 307
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b2_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    aput-object v5, v4, v6

    .line 308
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_w1:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    aput-object v5, v4, v6

    .line 305
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 303
    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_go_into_app_market:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$23;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$23;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 309
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$16;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$16;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 315
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v9

    .line 320
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v10

    .line 321
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/egy;->setCancelable(Z)V

    .line 322
    invoke-virtual {v10}, Lo/egy;->show()V

    .line 323
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 1089
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 1090
    :cond_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOnePlugin index out of bounder."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1092
    const/16 v0, 0x32

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1093
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1094
    return-void

    .line 1096
    :cond_1
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter downloadOnePlugin uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ear;

    invoke-virtual {v3}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1097
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ear;

    invoke-virtual {v1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$12;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->d(Ljava/lang/String;Lo/eaz;)V

    .line 1133
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->n()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;ILjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 106
    invoke-direct/range {p0 .. p5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(ILjava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eav;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Lo/eav;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 1484
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1485
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "com.huawei.ui.device.activity.notification.NotificationOVPhoneActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1486
    const-string v0, "isFromWear"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1487
    const-string v0, "device_id"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1488
    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->startActivity(Landroid/content/Intent;)V

    .line 1489
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 1490
    return-void
.end method

.method private d(Lo/eav;)V
    .locals 6

    .line 1199
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eok;

    .line 1200
    invoke-virtual {v5}, Lo/eok;->o()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1201
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUIForWear already have this device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1203
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1204
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(Lo/eav;)V

    .line 1205
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    .line 1206
    return-void

    .line 1208
    :cond_0
    goto :goto_0

    .line 1209
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eok;

    .line 1210
    invoke-virtual {v5}, Lo/eok;->o()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lo/eav;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 1211
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUIForWear already have this device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1214
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(Lo/eav;)V

    .line 1215
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    .line 1216
    return-void

    .line 1218
    :cond_2
    goto :goto_1

    .line 1220
    :cond_3
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updateUIForWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1221
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(Lo/eav;)V

    .line 1222
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    .line 1226
    return-void
.end method

.method private d(Z)V
    .locals 8

    .line 412
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForWatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_add_device_smart_watch:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForWatch() mHWList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 419
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForWatch() mRYList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 422
    :cond_1
    invoke-static {p1}, Lo/ent;->e(Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ddc;

    .line 423
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewForWatch() type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/ddc;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    move-object v0, p0

    invoke-virtual {v7}, Lo/ddc;->k()I

    move-result v1

    invoke-virtual {v7}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lo/ddc;->i()I

    move-result v4

    invoke-virtual {v7}, Lo/ddc;->c()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(ILjava/lang/String;Ljava/lang/String;II)V

    .line 425
    goto :goto_0

    .line 426
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l()V

    .line 428
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 430
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 432
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewForBand() userAgreed \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    const-string v0, "true"

    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 436
    const-string v0, "SMART_WATCH"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 437
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 440
    :cond_3
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Ljava/lang/String;)V

    .line 441
    const-string v0, "SMART_WATCH"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 443
    :goto_1
    goto :goto_2

    .line 445
    :cond_4
    const-string v0, "SMART_WATCH"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 446
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    .line 448
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->N:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Landroid/content/Context;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 294
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 295
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 299
    :cond_0
    return-void
.end method

.method private e(I)V
    .locals 6

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 955
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    add-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x64

    iget v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    div-int v4, v0, v1

    .line 956
    const/16 v0, 0x63

    if-le v4, v0, :cond_0

    .line 957
    const/16 v4, 0x63

    .line 959
    :cond_0
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->L:I

    if-eq v0, v4, :cond_1

    .line 960
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadProgress downloaded \uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    add-int/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " total : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "   showDownloadProgress progress:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    iput v4, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->L:I

    .line 963
    :cond_1
    int-to-double v0, v4

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 964
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 965
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    invoke-virtual {v0, v5}, Lo/ego$a;->e(Ljava/lang/String;)Lo/ego$a;

    .line 967
    :cond_2
    return-void
.end method

.method private e(ILjava/lang/String;Ljava/lang/String;II)V
    .locals 2

    .line 1323
    invoke-static {p1, p2, p3, p4}, Lo/ent;->e(ILjava/lang/String;Ljava/lang/String;I)Lo/eok;

    move-result-object v1

    .line 1324
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/eok;->e(I)V

    .line 1325
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$c;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Lo/eok;)V

    invoke-virtual {v1, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 1326
    const/4 v0, 0x1

    if-ne v0, p5, :cond_0

    .line 1327
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1329
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1331
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 654
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D:Ljava/lang/String;

    .line 655
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$1;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v0, v1}, Lo/eaw;->a(Lo/eaz;)V

    .line 683
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 10

    .line 1141
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v4

    .line 1142
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1143
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "indexInfosCache.size > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1144
    const/4 v5, 0x0

    .line 1145
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ear;

    .line 1146
    invoke-virtual {v7}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {v7}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1147
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "has band plugin info from cache, uuid :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1150
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v8

    .line 1151
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v9

    .line 1152
    const/16 v0, 0xa

    iput v0, v9, Landroid/os/Message;->what:I

    .line 1153
    iput-object v8, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1154
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v9}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1155
    const/4 v5, 0x1

    .line 1156
    goto :goto_1

    .line 1157
    :cond_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8be5uuid\u4e0b\u6ca1\u6709\u8d44\u6e90\u6587\u4ef6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 1161
    :cond_2
    if-nez v5, :cond_3

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1163
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no done file "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1164
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 1165
    const/16 v0, 0x3c

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1168
    :cond_3
    goto :goto_2

    .line 1169
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1170
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "indexInfosCache.size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 1172
    const/16 v0, 0x3c

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1173
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 1176
    :cond_5
    :goto_2
    return-void
.end method

.method private e(Lo/ear;)V
    .locals 1

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 910
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Z)Z
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->J:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    return-object v0
.end method

.method private f()V
    .locals 7

    .line 350
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "com.android.vending"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 351
    if-eqz v4, :cond_0

    .line 352
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GooglePlay\u662f\u5426\u5b89\u88c5"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const-string v0, "market://details?id=com.huawei.health"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 354
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 355
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 356
    const-string v0, "com.android.vending"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 358
    goto :goto_0

    .line 359
    :cond_0
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not installed GooglePlay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 361
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    :goto_0
    goto :goto_1

    .line 365
    :catch_0
    move-exception v4

    .line 366
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    :goto_1
    return-void
.end method

.method private g()V
    .locals 11

    .line 371
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 372
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips1:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 373
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips2:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 374
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips3:I

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lo/ene;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 375
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b1_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v4, v6

    .line 376
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b2_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    aput-object v5, v4, v6

    .line 377
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_w1:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    aput-object v5, v4, v6

    .line 374
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 372
    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$22;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$22;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 378
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v9

    .line 384
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v10

    .line 385
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/egy;->setCancelable(Z)V

    .line 386
    invoke-virtual {v10}, Lo/egy;->show()V

    .line 387
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(I)V

    return-void
.end method

.method private h()V
    .locals 4

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 495
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_add_device_button:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 496
    sget v0, Lcom/huawei/ui/device/R$id;->not_found_device_tip:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$25;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$25;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 504
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f()V

    return-void
.end method

.method private i()V
    .locals 6

    .line 507
    invoke-static {}, Lo/dbf;->d()Z

    move-result v4

    .line 508
    invoke-static {}, Lo/czu;->e()Z

    move-result v5

    .line 509
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isEmui = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==isOverSea ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    if-eqz v4, :cond_0

    if-nez v5, :cond_0

    .line 511
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d()V

    goto :goto_0

    .line 512
    :cond_0
    if-eqz v5, :cond_1

    .line 514
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o()V

    goto :goto_0

    .line 517
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g()V

    .line 519
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    return-void
.end method

.method private i(Ljava/lang/String;)V
    .locals 4

    .line 1835
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1836
    return-void

    .line 1838
    :cond_0
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1839
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_download_resoure_tip_content_message_new:I

    .line 1840
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$20;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;Ljava/lang/String;)V

    .line 1841
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$18;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1858
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1870
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    .line 1871
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1872
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1873
    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lo/egv;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->S:Lo/egv;

    return-object v0
.end method

.method private j()V
    .locals 4

    .line 1808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1809
    return-void

    .line 1811
    :cond_0
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1812
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_device_list_update_failed:I

    .line 1813
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$14;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 1814
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1821
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    .line 1822
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1823
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->M:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1825
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D:Ljava/lang/String;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 390
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 391
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 392
    const-string v0, "style"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m:I

    .line 393
    const-string v0, "isHeartRateDevice"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t:I

    .line 394
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initListView() style : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m:I

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 397
    :pswitch_0
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Z)V

    .line 398
    goto :goto_2

    .line 400
    :pswitch_1
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c(Z)V

    .line 401
    goto :goto_2

    .line 403
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y()V

    .line 404
    .line 409
    :cond_2
    :goto_2
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private k(Ljava/lang/String;)V
    .locals 3

    .line 1503
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1504
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    const-string v1, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1505
    const-string v0, "isFromWear"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1506
    const-string v0, "device_id"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1507
    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->startActivity(Landroid/content/Intent;)V

    .line 1508
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 1509
    return-void
.end method

.method private l()V
    .locals 5

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 603
    new-instance v4, Lo/eok;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_huawei_band:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eok;->b(Ljava/lang/String;)V

    .line 605
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/eok;->c(Z)V

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 610
    new-instance v4, Lo/eok;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 611
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$5;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v4, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    goto :goto_0

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 623
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 624
    new-instance v4, Lo/eok;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_honor_band:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eok;->b(Ljava/lang/String;)V

    .line 626
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/eok;->c(Z)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_3

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 631
    new-instance v4, Lo/eok;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 632
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$4;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v4, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    goto :goto_1

    .line 642
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 644
    :goto_1
    new-instance v0, Lo/eon;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/eon;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 646
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Lo/egv;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    return-object v0
.end method

.method private m()V
    .locals 1

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 902
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x:I

    return v0
.end method

.method private n()V
    .locals 4

    .line 748
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 749
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_download_resoure_tip_content_message_new:I

    .line 750
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$7;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 751
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$9;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 766
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 778
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    .line 779
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 780
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 781
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z:I

    return v0
.end method

.method private o()V
    .locals 11

    .line 522
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 523
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips1:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 524
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips2:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 525
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_mgr_not_found_device_tips3:I

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lo/ene;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    .line 526
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b1_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v4, v6

    .line 527
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_select_device_b2_name:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    aput-object v5, v4, v6

    .line 528
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/huawei/ui/device/R$string;->IDS_app_display_name_w1:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    aput-object v5, v4, v6

    .line 525
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 523
    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_go_into_app_market:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$24;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$24;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 529
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->nps_user_survey_grade_cancel:I

    new-instance v2, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$21;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$21;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 535
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v9

    .line 540
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v10

    .line 541
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lo/egy;->setCancelable(Z)V

    .line 542
    invoke-virtual {v10}, Lo/egy;->show()V

    .line 543
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    return-object v0
.end method

.method private p()V
    .locals 5

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 549
    new-instance v4, Lo/eok;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_huawei_band:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eok;->b(Ljava/lang/String;)V

    .line 551
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/eok;->c(Z)V

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->G:Z

    if-eqz v0, :cond_1

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 557
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_2

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 559
    new-instance v4, Lo/eok;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 560
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$27;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$27;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v4, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 569
    goto :goto_0

    .line 570
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 573
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 574
    new-instance v4, Lo/eok;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_honor_band:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eok;->b(Ljava/lang/String;)V

    .line 576
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/eok;->c(Z)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->H:Z

    if-eqz v0, :cond_4

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 582
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 584
    new-instance v4, Lo/eok;

    const/4 v0, 0x2

    invoke-direct {v4, v0}, Lo/eok;-><init>(I)V

    .line 585
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$3;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v4, v0}, Lo/eok;->e(Landroid/view/View$OnClickListener;)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    goto :goto_1

    .line 595
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 598
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->f:Lo/eon;

    invoke-virtual {v0}, Lo/eon;->notifyDataSetChanged()V

    .line 600
    return-void
.end method

.method private q()V
    .locals 5

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 923
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5ea6\u6761\u5df2\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 924
    return-void

    .line 926
    :cond_0
    new-instance v0, Lo/ego;

    invoke-direct {v0, p0}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    .line 927
    new-instance v0, Lo/ego$a;

    invoke-direct {v0, p0}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    .line 928
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_updating:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$11;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    .line 929
    invoke-virtual {v0, v1}, Lo/ego$a;->e(Landroid/view/View$OnClickListener;)Lo/ego$a;

    .line 936
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    .line 937
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 938
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 939
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 940
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 941
    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->e(Ljava/lang/String;)Lo/ego$a;

    .line 944
    :cond_1
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomProgressDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 945
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->B()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    return v0
.end method

.method private r()V
    .locals 4

    .line 972
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 974
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 975
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    :cond_0
    return-void
.end method

.method private s()V
    .locals 4

    .line 1016
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter retryDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1018
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1019
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->z()V

    .line 1020
    iget v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->m:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1022
    :pswitch_0
    const-string v0, "SMART_WATCH"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    .line 1023
    goto :goto_0

    .line 1025
    :pswitch_1
    const-string v0, "SMART_BAND"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(Ljava/lang/String;)V

    .line 1026
    nop

    .line 1028
    .line 1032
    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w()V

    return-void
.end method

.method private t()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/ear;>;"
        }
    .end annotation

    .line 912
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ear;

    .line 914
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 915
    goto :goto_0

    .line 916
    :cond_0
    return-object v1
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/List;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w:Ljava/util/List;

    return-object v0
.end method

.method private u()V
    .locals 7

    .line 983
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->y:I

    .line 985
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r()V

    .line 986
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_plugin_download_error:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 989
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    const/16 v1, 0x46

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->removeMessages(I)V

    .line 993
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ear;

    .line 994
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 995
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8d44\u6e90\u672a\u4e0b\u8f7d\u5b8c\uff0c\u9700\u8981\u5220\u9664\u63cf\u8ff0\u6587\u4ef6 uuid\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->k(Ljava/lang/String;)V

    .line 998
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 999
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eok;

    invoke-virtual {v0}, Lo/eok;->i()I

    move-result v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1000
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUIForWear already have this device\uff0cneed remove"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1001
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1002
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    .line 998
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1005
    :cond_1
    const/4 v6, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 1006
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eok;

    invoke-virtual {v0}, Lo/eok;->i()I

    move-result v0

    invoke-virtual {v5}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dda;->c(Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 1007
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUIForWear already have this device\uff0cneed remove"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1009
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->p()V

    .line 1005
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1013
    :cond_3
    goto/16 :goto_0

    .line 1014
    :cond_4
    return-void
.end method

.method private v()V
    .locals 6

    .line 1064
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleCancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebb;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eay;

    .line 1067
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eaw;->d(Lo/eay;)V

    .line 1068
    goto :goto_0

    .line 1070
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u()V

    .line 1071
    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r()V

    return-void
.end method

.method private w()V
    .locals 4

    .line 1076
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter updatePluginForWear size\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1079
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(I)V

    .line 1081
    :cond_0
    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->q()V

    return-void
.end method

.method private x()V
    .locals 2

    .line 1055
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1056
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 1057
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    .line 1059
    :cond_0
    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u()V

    return-void
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private y()V
    .locals 10

    .line 1280
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->b()V

    .line 1281
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->a()V

    .line 1282
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$d;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 1283
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "register callback success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    .line 1285
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 1287
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForEar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1288
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->i:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_add_device_smart_headphones:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 1289
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1290
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForEar() mHWList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1293
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1294
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewForEar() mRYList.clear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1295
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1297
    :cond_1
    invoke-static {}, Lo/ent;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ddc;

    .line 1298
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initViewForEar() type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/ddc;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1299
    move-object v0, p0

    invoke-virtual {v8}, Lo/ddc;->k()I

    move-result v1

    invoke-virtual {v8}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/ddc;->i()I

    move-result v4

    invoke-virtual {v8}, Lo/ddc;->c()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(ILjava/lang/String;Ljava/lang/String;II)V

    .line 1300
    goto :goto_0

    .line 1303
    :cond_2
    if-eqz v6, :cond_3

    .line 1304
    invoke-virtual {v6}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v7

    .line 1305
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    invoke-virtual {v6}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v3

    invoke-virtual {v3, v7}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1306
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v6}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aey;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1307
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1308
    invoke-static {}, Lo/dda;->b()Lo/ddc;

    move-result-object v9

    .line 1309
    move-object v0, p0

    invoke-virtual {v9}, Lo/ddc;->k()I

    move-result v1

    invoke-virtual {v9}, Lo/ddc;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9}, Lo/ddc;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lo/ddc;->i()I

    move-result v4

    invoke-virtual {v9}, Lo/ddc;->c()I

    move-result v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e(ILjava/lang/String;Ljava/lang/String;II)V

    .line 1312
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->l()V

    .line 1315
    return-void
.end method

.method private z()V
    .locals 4

    .line 1039
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->v:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1040
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0b\u8f7d\u8fdb\u5ea6\u6761\u5df2\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    return-void

    .line 1043
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1044
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/ui/device/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    .line 1046
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_plugin_download_loading:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->C:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1049
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    const/16 v1, 0x46

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1050
    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->D()V

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 1586
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onActivityResult():personalBasicInfoSettingflag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " requestCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 1588
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->setResult(I)V

    .line 1589
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    goto/16 :goto_2

    .line 1590
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_6

    .line 1591
    const/4 v0, 0x2

    if-ne p2, v0, :cond_9

    .line 1592
    const-string v4, ""

    .line 1593
    const/4 v5, 0x0

    .line 1594
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 1595
    const-string v0, "device_id"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1596
    const-string v0, "is_support_notification"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    .line 1598
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->setResult(I)V

    .line 1599
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->F:Lo/eoa;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 1601
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->F:Lo/eoa;

    .line 1603
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->F:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v6

    .line 1604
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNotifiEnable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1606
    if-eqz v5, :cond_5

    if-nez v6, :cond_5

    .line 1607
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1608
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "phoneBrand:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "OPPO"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "vivo"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1610
    :cond_3
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the phone is oppo or vivo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1611
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 1613
    :cond_4
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the phone is  not oppo or vivo :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1614
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b(Ljava/lang/String;)V

    .line 1616
    :goto_0
    goto :goto_1

    .line 1618
    :cond_5
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->k(Ljava/lang/String;)V

    .line 1621
    :goto_1
    goto :goto_2

    .line 1622
    :cond_6
    const/16 v0, 0x63

    if-ne v0, p1, :cond_8

    .line 1623
    const/16 v0, 0x65

    if-ne p2, v0, :cond_9

    .line 1624
    const-string v0, "device_type"

    const/16 v1, -0xa

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 1625
    const/16 v0, -0xa

    if-eq v4, v0, :cond_7

    .line 1626
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(I)V

    .line 1628
    :cond_7
    goto :goto_2

    .line 1629
    :cond_8
    const/4 v0, -0x1

    if-ne v0, p2, :cond_9

    const/16 v0, 0x66

    if-ne p1, v0, :cond_9

    .line 1630
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->setResult(I)V

    .line 1631
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->finish()V

    .line 1633
    :cond_9
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->u:Z

    .line 1634
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1635
    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .line 1353
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 1354
    if-eqz v4, :cond_0

    const-string v0, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity"

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1355
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->e()V

    goto :goto_0

    .line 1357
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 1358
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onBackPressed() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1360
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 190
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 191
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    .line 192
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "device_download_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "single_device_download_dialog"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    .line 198
    new-instance v0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;-><init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->E:Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity$a;

    .line 199
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b()V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 201
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 202
    const-string v0, "isFromWear"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    .line 203
    const-string v0, "isFromWearR1"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    .line 204
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFromWear = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isFromWearR1:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r:Z

    if-nez v0, :cond_1

    .line 206
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->s:Z

    if-eqz v0, :cond_1

    .line 207
    const-string v0, "device_type"

    const/16 v1, -0xa

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 208
    const/16 v0, -0xa

    if-eq v5, v0, :cond_0

    .line 209
    invoke-direct {p0, v5}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->a(I)V

    .line 211
    :cond_0
    return-void

    .line 217
    :cond_1
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->F:Lo/eoa;

    .line 218
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->c()V

    .line 219
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 1335
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1336
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1337
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->A:Z

    .line 1338
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1339
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->j:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->e(Landroid/view/View$OnClickListener;)Lo/ego$a;

    .line 1341
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->x()V

    .line 1342
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->r()V

    .line 1344
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebb;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eay;

    .line 1345
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eaw;->d(Lo/eay;)V

    .line 1346
    goto :goto_0

    .line 1347
    :cond_1
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 1348
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceChildActivity;->b:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "device_download_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "single_device_download_dialog"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 1349
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1370
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 1371
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1364
    const-string v0, "PluginDevice_AddDeviceChildActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1365
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 1366
    return-void
.end method
