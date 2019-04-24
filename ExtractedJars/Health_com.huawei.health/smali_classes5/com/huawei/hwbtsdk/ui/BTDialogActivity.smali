.class public Lcom/huawei/hwbtsdk/ui/BTDialogActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;
    }
.end annotation


# instance fields
.field private a:Lhuawei/widget/HwProgressBar;

.field b:Lo/egw$c;

.field private c:I

.field private d:Landroid/widget/ListView;

.field private e:Lo/cxw;

.field private f:I

.field private g:Landroid/content/Context;

.field private h:Landroid/widget/TextView;

.field private i:Lo/egy;

.field private k:Landroid/os/Handler;

.field private o:Lo/egw;

.field private p:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 107
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c:I

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    .line 118
    new-instance v0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$b;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g:Landroid/content/Context;

    .line 417
    new-instance v0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->p:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a()V
    .locals 0

    .line 60
    invoke-static {}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c()V

    return-void
.end method

.method private a(I)V
    .locals 5

    .line 322
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 323
    sget v0, Lcom/huawei/hwbtsdk/R$layout;->dialog_listview:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 324
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    .line 325
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 326
    sget v0, Lcom/huawei/hwbtsdk/R$id;->device_list:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->d:Landroid/widget/ListView;

    .line 327
    sget v0, Lcom/huawei/hwbtsdk/R$id;->title_listview_tv:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->h:Landroid/widget/TextView;

    .line 328
    new-instance v0, Lo/cxw;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/cxw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->e:Lo/cxw;

    .line 329
    sget v0, Lcom/huawei/hwbtsdk/R$id;->dialog_listview_loading:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a:Lhuawei/widget/HwProgressBar;

    .line 330
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 332
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->d:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->e:Lo/cxw;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 333
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->e:Lo/cxw;

    invoke-virtual {v0, v1}, Lo/cys;->b(Lo/cxw;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->d:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$5;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 344
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$3;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 362
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    .line 363
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Z)Lo/egw$c;

    .line 366
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 367
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    .line 368
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 369
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 370
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 373
    :cond_1
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->b()V

    .line 374
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/cys;->c(Landroid/os/Handler;)V

    .line 376
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b()V

    return-void
.end method

.method private b()V
    .locals 6

    .line 189
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS confirmBtnFun mDialogContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 192
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/cys;->a(ZLandroid/os/Handler;)V

    .line 193
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto/16 :goto_0

    .line 194
    :cond_0
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 197
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 198
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 199
    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 200
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 201
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 202
    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 204
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->i()V

    .line 205
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto :goto_0

    .line 206
    :cond_3
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 208
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cys;->b(Z)V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto :goto_0

    .line 210
    :cond_4
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_5

    .line 212
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "go to application set"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 213
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.settings.SETTINGS"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 214
    const/4 v0, 0x2

    invoke-virtual {p0, v5, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 216
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->d()V

    return-void
.end method

.method private b(I)Z
    .locals 4

    .line 527
    const/4 v0, 0x2

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    .line 528
    const/4 v0, 0x0

    return v0

    .line 531
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 532
    const/4 v0, 0x1

    return v0

    .line 537
    :cond_1
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    if-ne v0, p1, :cond_6

    .line 541
    :cond_2
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_4

    .line 542
    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 543
    const/4 v0, 0x0

    return v0

    .line 546
    :cond_4
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 548
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "permission allowed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 551
    :cond_5
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 552
    const/4 v0, 0x0

    return v0

    .line 556
    :cond_6
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private static c()V
    .locals 6

    .line 222
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v4

    .line 223
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 225
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS mAdapter == NULL onBTSwitchStateCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 227
    :cond_0
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 228
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS BT is close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v5

    .line 231
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS BT isEnable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 238
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 239
    :cond_0
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cys;->a(ZLandroid/os/Handler;)V

    .line 240
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto :goto_0

    .line 241
    :cond_1
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 242
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g()V

    goto :goto_0

    .line 243
    :cond_2
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 245
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cys;->b(Z)V

    .line 246
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto :goto_0

    .line 247
    :cond_3
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 249
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g()V

    goto :goto_0

    .line 250
    :cond_4
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_5

    .line 254
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g()V

    .line 256
    :cond_5
    :goto_0
    return-void
.end method

.method private e()V
    .locals 10

    .line 145
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 146
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 147
    const-string v0, "style"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c:I

    .line 148
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "style:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";content:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "content"

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

    .line 150
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 152
    :sswitch_0
    const-string v0, "content"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    .line 153
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k()V

    .line 154
    goto :goto_1

    .line 156
    :sswitch_1
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v7

    .line 157
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 159
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====initView mAdapter == NULL onBTSwitchStateCallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 161
    :cond_0
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====initView mAdapter != NULL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-virtual {v7}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 163
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====initView mAdapter closed===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    new-instance v8, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v8, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v8}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 168
    :cond_1
    :goto_0
    const-string v0, "device_type"

    const/4 v1, -0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v8

    .line 169
    invoke-direct {p0, v8}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a(I)V

    .line 170
    .line 174
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->setFinishOnTouchOutside(Z)V

    .line 177
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v7

    .line 178
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 179
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v9

    .line 180
    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, v9, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 181
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 182
    goto :goto_2

    .line 183
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "intent is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g()V

    return-void
.end method

.method private f()Z
    .locals 7

    .line 619
    const/4 v4, 0x0

    .line 620
    const-string v0, "appops"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/AppOpsManager;

    .line 621
    const-string v0, "android:coarse_location"

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v0, v1, v2}, Landroid/app/AppOpsManager;->checkOp(Ljava/lang/String;ILjava/lang/String;)I

    move-result v6

    .line 622
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLocationEnable :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    if-eqz v6, :cond_0

    .line 625
    const/4 v4, 0x0

    goto :goto_0

    .line 629
    :cond_0
    const/4 v4, 0x1

    .line 631
    :goto_0
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLocationEnable res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  0\uff1aallowed  other\uff1anopermission"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    return v4
.end method

.method static synthetic g(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/content/BroadcastReceiver;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->p:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method private g()V
    .locals 1

    .line 609
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->g()V

    .line 611
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 613
    return-void
.end method

.method private h()Z
    .locals 8

    .line 640
    const/4 v5, 0x1

    .line 641
    const/4 v6, 0x1

    .line 642
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 643
    const-string v0, "location"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/location/LocationManager;

    .line 645
    const-string v0, "gps"

    invoke-virtual {v7, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    .line 646
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btdailog isGPSLocationEnable\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 647
    invoke-static {}, Lo/cxj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/cxj;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 648
    :cond_0
    return v5

    .line 650
    :cond_1
    const-string v0, "network"

    invoke-virtual {v7, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v6

    .line 651
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btdialog isNetWorkLocationEnable\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 654
    :cond_2
    if-nez v5, :cond_3

    if-eqz v6, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic i(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Lhuawei/widget/HwProgressBar;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->a:Lhuawei/widget/HwProgressBar;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 661
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===222==cancelScanDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->a()V

    .line 663
    return-void
.end method

.method static synthetic k(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/widget/TextView;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method private k()V
    .locals 8

    .line 261
    const v0, 0x104000a

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 262
    const/high16 v0, 0x1040000

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 263
    const-string v6, ""

    .line 265
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    .line 267
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_repair:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 268
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 269
    :cond_0
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_1

    .line 270
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 271
    :cond_1
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_2

    .line 272
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_settings_button_ok:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 273
    :cond_2
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 274
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_common_enable_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 275
    :cond_3
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 276
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_common_enable_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 279
    :cond_4
    :goto_0
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 280
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_turn_on_BT:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    .line 281
    :cond_5
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 282
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_turn_on_location_BT:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_1

    .line 283
    :cond_6
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_7

    .line 284
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_turn_on_location:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 285
    :cond_7
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_8

    .line 287
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->f()Ljava/lang/String;

    move-result-object v7

    .line 288
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_connected_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 289
    goto :goto_1

    :cond_8
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_9

    .line 291
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->h()Ljava/lang/String;

    move-result-object v7

    .line 292
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_reconnect_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 293
    goto :goto_1

    :cond_9
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_a

    .line 294
    sget v0, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_get_loacation_permiassion_health:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 296
    :cond_a
    :goto_1
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o()V

    .line 297
    new-instance v7, Lo/egy$b;

    invoke-direct {v7, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 298
    .line 299
    invoke-virtual {v7, v6}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$2;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    .line 300
    invoke-virtual {v0, v4, v1}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$4;-><init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V

    .line 306
    invoke-virtual {v0, v5, v1}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 311
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    .line 312
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCanceledOnTouchOutside(Z)V

    .line 313
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 314
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 315
    return-void
.end method

.method private o()V
    .locals 2

    .line 666
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 667
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->i:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 669
    :cond_0
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 380
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onActivityResult requestCode:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "   resultCode:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS onActivityResult requestCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   resultCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    .line 383
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 384
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 385
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showDeviceList 3"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 386
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS showDeviceList 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/cys;->a(ZLandroid/os/Handler;)V

    goto :goto_0

    .line 393
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 394
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cys;->a(ZLandroid/os/Handler;)V

    goto :goto_0

    .line 396
    :cond_2
    const/4 v0, 0x2

    if-ne v0, p1, :cond_5

    .line 398
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_3

    .line 399
    return-void

    .line 401
    :cond_3
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_4

    .line 402
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 403
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showDeviceList 4"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====BT_GPS showDeviceList 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cys;->b(Z)V

    goto :goto_0

    .line 407
    :cond_4
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no permission."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 411
    :cond_5
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 412
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 474
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 475
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cys;->a(ZLandroid/os/Handler;)V

    .line 476
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    goto :goto_0

    .line 478
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g()V

    .line 481
    :goto_0
    iget v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->c:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    .line 482
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===222======back cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->a()V

    .line 486
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 130
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 131
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onCreate"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g:Landroid/content/Context;

    .line 133
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 134
    const/16 v0, 0x50

    invoke-virtual {v5, v0}, Landroid/view/Window;->setGravity(I)V

    .line 135
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v6

    .line 136
    const/4 v0, -0x1

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 137
    const/4 v0, -0x2

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 138
    invoke-virtual {v5, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 139
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->e()V

    .line 140
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 463
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===222==onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->k:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 467
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 468
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 469
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6

    .line 561
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 563
    :sswitch_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_6

    array-length v0, p3

    if-lez v0, :cond_6

    .line 564
    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 565
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "grant result:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 566
    if-eqz v5, :cond_5

    .line 567
    invoke-direct {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 569
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    if-nez v0, :cond_1

    .line 570
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomViewDialog == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 572
    :cond_1
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCustomViewDialog.isShowing() + "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    invoke-virtual {v3}, Lo/egw;->isShowing()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    :goto_1
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 575
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->b:Lo/egw$c;

    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    .line 577
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 578
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 579
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->o:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 581
    :cond_3
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->b()V

    goto :goto_2

    .line 583
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 584
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->c()V

    goto :goto_2

    .line 587
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->finish()V

    .line 588
    invoke-static {p0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->c()V

    .line 590
    :goto_2
    goto :goto_3

    .line 591
    :cond_6
    const-string v0, "01"

    const-string v1, "BTDialogActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "grantResults is null or length is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 593
    .line 597
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
