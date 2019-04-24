.class public Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# instance fields
.field private a:Landroid/support/v7/widget/RecyclerView;

.field b:Ljava/lang/String;

.field private c:Lo/enr;

.field d:Ljava/lang/String;

.field private e:I

.field private f:Lo/cxk;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/bluetooth/BluetoothDevice;>;"
        }
    .end annotation
.end field

.field private h:Lo/egd;

.field private i:Lo/env;

.field private k:Lo/egd;

.field private l:Landroid/widget/CheckBox;

.field private m:I

.field private n:Lo/fcb;

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/bluetooth/BluetoothDevice;>;"
        }
    .end annotation
.end field

.field private p:Landroid/widget/LinearLayout;

.field private t:Lo/egy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e:I

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->b:Ljava/lang/String;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->o:Ljava/util/ArrayList;

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->m:I

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;Lo/egy;)Lo/egy;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/fcb;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->n:Lo/fcb;

    return-object v0
.end method

.method private a(Ljava/lang/Boolean;)V
    .locals 8

    .line 274
    const-string v0, "123"

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

    .line 275
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    .line 276
    const-string v0, "content://com.huawei.health.HwNotificationContentProvider/MidwareAuthority"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 277
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 278
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    const-string v0, "value"

    const-string v1, "true"

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 281
    :cond_0
    const-string v0, "value"

    const-string v1, "false"

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v6, v7, v0, v1}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 284
    const-string v0, "123"

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

    .line 285
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 325
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 326
    const-string v0, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    const-string v0, "device_id"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->startActivity(Landroid/content/Intent;)V

    .line 329
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->finish()V

    .line 330
    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 6

    .line 291
    const-string v0, "123"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123==enterDevicePairGuide deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deviceName"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 293
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iE:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 295
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 296
    const-string v0, "pairGuideProductType"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 297
    const-string v0, "pairGuideProductName"

    invoke-virtual {v5, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 298
    const-string v0, "pairGuideFromScanList"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 299
    const-string v0, "pairGuideSelectName"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    const-string v0, "pairGuideSelectAddress"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->b:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 302
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 219
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 220
    :cond_0
    return-void

    .line 222
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->b:Ljava/lang/String;

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 227
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->finish()V

    .line 228
    return-void

    .line 231
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/env;->d(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/dda;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/dbf;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 232
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 233
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_midware_authority_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$5;-><init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V

    .line 234
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$2;-><init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V

    .line 247
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 261
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 264
    goto :goto_0

    .line 265
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/env;->d(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d:Ljava/lang/String;

    .line 266
    invoke-static {v2}, Lo/env;->d(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 265
    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->b(ILjava/lang/String;)V

    .line 268
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;ILjava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->b(ILjava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;Ljava/lang/Boolean;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;I)I
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->m:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/env;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    return-object v0
.end method

.method private d()V
    .locals 10

    .line 116
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 117
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 118
    const-string v0, "style"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e:I

    .line 119
    const-string v0, "DEVICE_SCAN_LIST"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    .line 120
    const-string v0, "bluetooth_list"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    .line 122
    const-string v0, "01"

    const-string v1, "123"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "style:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";content:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "style"

    const/4 v5, 0x0

    invoke-virtual {v6, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 126
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e()V

    .line 127
    .line 131
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->setFinishOnTouchOutside(Z)V

    .line 134
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v7

    .line 135
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 136
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v9

    .line 137
    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v9, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 138
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 139
    goto :goto_1

    .line 140
    :cond_0
    const-string v0, "01"

    const-string v1, "123"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "intent is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)Lo/egy;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->t:Lo/egy;

    return-object v0
.end method

.method private e()V
    .locals 6

    .line 147
    const-string v0, "123"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===mBTDeviceList="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    sget v0, Lcom/huawei/ui/device/R$layout;->dialog_auto_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->setContentView(I)V

    .line 149
    sget v0, Lcom/huawei/ui/device/R$id;->device_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a:Landroid/support/v7/widget/RecyclerView;

    .line 150
    sget v0, Lcom/huawei/ui/device/R$id;->agree_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->l:Landroid/widget/CheckBox;

    .line 151
    sget v0, Lcom/huawei/ui/device/R$id;->auto_scan_show_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->p:Landroid/widget/LinearLayout;

    .line 152
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v4, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 153
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->n:Lo/fcb;

    invoke-virtual {v0}, Lo/fcb;->b()Z

    move-result v5

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->l:Landroid/widget/CheckBox;

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 158
    new-instance v0, Lo/enr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->g:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/enr;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c:Lo/enr;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c:Lo/enr;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c:Lo/enr;

    new-instance v1, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$4;-><init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V

    invoke-virtual {v0, v1}, Lo/enr;->e(Lo/enr$b;)V

    .line 167
    sget v0, Lcom/huawei/ui/device/R$id;->scan_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->k:Lo/egd;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    sget v0, Lcom/huawei/ui/device/R$id;->scan_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->h:Lo/egd;

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->h:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->l:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity$1;-><init>(Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 184
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 307
    const-string v0, "123"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult requesetCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    const-string v0, "123"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult resultCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 310
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 311
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->setResult(I)V

    .line 312
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 313
    const-string v0, "device_id"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 314
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->a(Ljava/lang/String;)V

    .line 319
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 320
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->finish()V

    .line 346
    sget v0, Lcom/huawei/ui/device/R$anim;->push_activity_out:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->overridePendingTransition(II)V

    .line 347
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 348
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 188
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 190
    sget v0, Lcom/huawei/ui/device/R$id;->scan_start:I

    if-ne v0, v4, :cond_0

    .line 192
    const-string v0, "123"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===\u5f00\u59cb\u914d\u5bf9 selectPosition "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->m:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->c(I)V

    goto :goto_0

    .line 195
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->scan_cancel:I

    if-ne v0, v4, :cond_1

    .line 197
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->finish()V

    .line 198
    sget v0, Lcom/huawei/ui/device/R$anim;->push_activity_out:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->overridePendingTransition(II)V

    .line 200
    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 101
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 102
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 103
    const/16 v0, 0x50

    invoke-virtual {v2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 104
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    .line 105
    const/4 v0, -0x1

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 106
    const/4 v0, -0x2

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 107
    invoke-virtual {p0, v3}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 108
    invoke-static {p0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->i:Lo/env;

    .line 109
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->f:Lo/cxk;

    .line 110
    new-instance v0, Lo/fcb;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fcb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->n:Lo/fcb;

    .line 111
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->d()V

    .line 112
    sget v0, Lcom/huawei/ui/device/R$anim;->push_activity_in:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->overridePendingTransition(II)V

    .line 113
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 335
    iget v0, p0, Lcom/huawei/ui/device/activity/autoscandevice/BTAutoScanActivity;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 336
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->a()V

    .line 338
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 340
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 341
    return-void
.end method
