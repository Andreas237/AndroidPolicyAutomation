.class public Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$e;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;,
        Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/widget/LinearLayout;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/LinearLayout;

.field private K:Lo/egd;

.field private L:Landroid/widget/TextView;

.field private M:Lo/egd;

.field private N:Landroid/widget/LinearLayout;

.field private O:Landroid/widget/TextView;

.field private P:Landroid/widget/TextView;

.field private Q:Landroid/widget/TextView;

.field private R:Landroid/widget/RelativeLayout;

.field private S:Landroid/widget/ImageView;

.field private T:Landroid/graphics/drawable/AnimationDrawable;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/widget/FrameLayout;

.field private W:Landroid/widget/RelativeLayout;

.field private X:Landroid/widget/ImageView;

.field private final Y:[I

.field private Z:Ljava/lang/String;

.field private a:I

.field private aA:Lo/enz;

.field private aB:Z

.field private aa:Landroid/widget/ImageView;

.field private ab:Z

.field private final ac:[I

.field private final ad:[I

.field private final ae:[I

.field private final af:[I

.field private final ag:[I

.field private ah:Landroid/os/Handler;

.field private ai:Ljava/lang/String;

.field private aj:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;

.field private ak:Ljava/lang/String;

.field private al:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

.field private am:Lo/enw;

.field private an:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private ao:Z

.field private ap:Landroid/widget/LinearLayout;

.field private aq:Lo/eav;

.field private ar:Landroid/widget/CheckBox;

.field private as:Lo/eoa;

.field private at:Z

.field private au:Lo/enz;

.field private av:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private aw:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private ax:Lo/djp$b;

.field private final ay:Landroid/content/BroadcastReceiver;

.field private az:Landroid/content/DialogInterface$OnKeyListener;

.field private b:Landroid/content/Context;

.field private c:Lo/env;

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private f:Lo/emr;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Landroid/widget/TextView;

.field private k:Ljava/lang/String;

.field private l:Landroid/graphics/drawable/AnimationDrawable;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/graphics/drawable/AnimationDrawable;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/graphics/drawable/AnimationDrawable;

.field private u:Landroid/widget/RelativeLayout;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/RelativeLayout;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 163
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    .line 167
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 169
    const/4 v0, 0x3

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_pair_guide_b3_tip1_ex:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_pair_guide_b3_tip2_ex:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_pair_guide_b3_tip3:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Y:[I

    .line 174
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_paring_type_le_des_info_21:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    .line 178
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_paring_type_r1_des_info_step1:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_paring_type_r1_des_info_guide_2:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ad:[I

    .line 184
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_paring_tip_des_info_21:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    .line 189
    const/4 v0, 0x3

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_select_device_connect_grus_change_tip_1:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_select_device_connect_grus_change_tip_2:I

    const/4 v2, 0x1

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_pair_guide_b3_tip3:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->af:[I

    .line 195
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_aw_binding_tips:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ag:[I

    .line 217
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$d;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->al:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 249
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ao:Z

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->an:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 257
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$5;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->av:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 289
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->at:Z

    .line 291
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aw:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 292
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aB:Z

    .line 820
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->az:Landroid/content/DialogInterface$OnKeyListener;

    .line 1524
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$a;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    .line 1589
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$4;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ay:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 4

    .line 612
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkCompatibility"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aj:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;

    iget v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    new-instance v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enw;->e(Lo/dbb;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 615
    sget v0, Lcom/huawei/ui/device/R$id;->done_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$3;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 638
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 1540
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1543
    :pswitch_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iAddDeviceStateAIDLCallback(): \u7528\u6237\u53d6\u6d88\u4e86\u84dd\u7259\u5f00\u542f!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1544
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1545
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_1

    .line 1547
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    goto :goto_0

    .line 1553
    :pswitch_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iAddDeviceStateAIDLCallback():\u84dd\u7259\u5f00\u542f\u5931\u8d25!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1554
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1555
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1556
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1557
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1559
    goto :goto_0

    .line 1562
    :pswitch_2
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iAddDeviceStateAIDLCallback(): \u7528\u6237\u53d6\u6d88\u4e86\u84dd\u7259\u641c\u7d22"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1563
    .line 1568
    :cond_1
    :goto_0
    const/4 v0, 0x4

    if-ne v0, p1, :cond_2

    .line 1569
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AddDeviceState.DEVICE_BT_ENABLE_SCAN MSG_ENABLE_RIGHT_BTN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1570
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1572
    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u()V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 835
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h:Z

    if-eqz v0, :cond_1

    .line 836
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 837
    if-eqz p1, :cond_0

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/16 v1, 0xa

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 840
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d()V

    goto :goto_0

    .line 843
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 845
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)Z
    .locals 5

    .line 1479
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter openOemAppstore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1480
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->r(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1482
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.intent.action.AppDetail"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1483
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1484
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1485
    const-string v0, "APP_PACKAGENAME"

    const-string v1, "com.google.android.wearable.app.cn"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1486
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1487
    const/4 v0, 0x1

    return v0

    .line 1488
    :catch_0
    move-exception v4

    .line 1489
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception localActivityNotFoundException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1492
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)Z
    .locals 0

    .line 122
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ao:Z

    return p1
.end method

.method private b(Ljava/lang/String;)Landroid/content/Intent;
    .locals 5

    .line 1450
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter createViewIntent():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1452
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1453
    const v0, 0x10808000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1454
    return-object v4
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->al:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object p1
.end method

.method private b()V
    .locals 6

    .line 428
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    new-instance v0, Lo/enw;

    invoke-direct {v0}, Lo/enw;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    .line 430
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_custom_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 433
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    .line 434
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_b3_anim_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 437
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_left_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->m:Landroid/widget/ImageView;

    .line 438
    sget v0, Lcom/huawei/ui/device/R$id;->device_janus_pair_b5_describe:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->C:Landroid/widget/TextView;

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_janus_pair_guide_01:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/device/R$string;->IDS_device_start_paring_title:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 440
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_right_image:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->n:Landroid/widget/ImageView;

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRTLLanguage!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_arrow_next:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 445
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRTLLanguage!!!!!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->R:Landroid/widget/RelativeLayout;

    .line 449
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_b5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    .line 450
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    .line 451
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    .line 452
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    .line 453
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y:Landroid/widget/RelativeLayout;

    .line 454
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_text_tips_single:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    .line 456
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_txt_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    .line 457
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_txt_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    .line 458
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_txt_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->D:Landroid/widget/TextView;

    .line 459
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_txt_4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->A:Landroid/widget/TextView;

    .line 460
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_single:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    .line 462
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_num_text_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->B:Landroid/widget/TextView;

    .line 463
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_num_text_2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->E:Landroid/widget/TextView;

    .line 464
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_num_text_3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->I:Landroid/widget/TextView;

    .line 465
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_num_text_4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->H:Landroid/widget/TextView;

    .line 466
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g()V

    .line 468
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_left_cancel_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->G:Landroid/widget/LinearLayout;

    .line 469
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_right_btn_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    .line 470
    sget v0, Lcom/huawei/ui/device/R$id;->cancel_button_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->J:Landroid/widget/LinearLayout;

    .line 471
    sget v0, Lcom/huawei/ui/device/R$id;->pair_result_device_progress_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->V:Landroid/widget/FrameLayout;

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->V:Landroid/widget/FrameLayout;

    const-string v1, "#FFD8EBF8"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 473
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_guide_bottom_arrow_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->F:Landroid/widget/LinearLayout;

    .line 474
    sget v0, Lcom/huawei/ui/device/R$id;->right_arrow_txt:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    .line 475
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_start_paring_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_guide_progress_anim:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->T:Landroid/graphics/drawable/AnimationDrawable;

    .line 480
    sget v0, Lcom/huawei/ui/device/R$id;->pair_result_device_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    .line 482
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c()V

    .line 483
    sget v0, Lcom/huawei/ui/device/R$id;->pair_result_device_show_txt:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    .line 484
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_progress_guide_single_note:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    .line 485
    sget v0, Lcom/huawei/ui/device/R$id;->device_pairing_progress_leo_failure:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->U:Landroid/widget/TextView;

    .line 486
    sget v0, Lcom/huawei/ui/device/R$id;->cancel_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->K:Lo/egd;

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->K:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 490
    sget v0, Lcom/huawei/ui/device/R$id;->pair_result_device_privacy_txt:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    .line 493
    sget v0, Lcom/huawei/ui/device/R$id;->device_pair_result_img_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->W:Landroid/widget/RelativeLayout;

    .line 494
    sget v0, Lcom/huawei/ui/device/R$id;->pair_result_device_show_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 498
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====fromScanList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e()V

    .line 501
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a()V

    .line 503
    sget v0, Lcom/huawei/ui/device/R$id;->done_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$1;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 536
    sget v0, Lcom/huawei/ui/device/R$id;->wlan_auto_download_checkbox:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ar:Landroid/widget/CheckBox;

    .line 537
    sget v0, Lcom/huawei/ui/device/R$id;->wlan_auto_download_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ap:Landroid/widget/LinearLayout;

    .line 539
    return-void
.end method

.method private b(II)V
    .locals 5

    .line 1192
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1193
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1194
    const-string v0, "device_name"

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i:Z

    invoke-static {v1, v2, v3}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1195
    const-string v0, "device_type"

    const-string v1, "HDK_WEAR"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    const-string v0, "error_type"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1197
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iH:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1199
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V
    .locals 0

    .line 122
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Z)V

    return-void
.end method

.method private b(Landroid/content/Context;)Z
    .locals 4

    .line 554
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 555
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRTLLanguage() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    const/4 v0, 0x0

    return v0

    .line 559
    :cond_0
    const-string v0, "ar"

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 560
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 559
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "iw"

    .line 561
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 562
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 561
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fa"

    .line 563
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 564
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 563
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ur"

    .line 565
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 566
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 568
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 570
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private c()V
    .locals 6

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 545
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v3

    .line 546
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v4

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 548
    div-int/lit8 v0, v4, 0x2

    iput v0, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 549
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 551
    return-void
.end method

.method private c(II)V
    .locals 6

    .line 1872
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showPairFailureResult():errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1874
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(II)V

    .line 1875
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->T:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 1876
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1877
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u505c\u6b62\u52a8\u753b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1879
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 1881
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 1883
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1884
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1885
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->R:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1886
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->F:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1887
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->G:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1888
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 1889
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1890
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->V:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1891
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->W:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1892
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1893
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1894
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1895
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_pairing_result_failure:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1896
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_fail:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1897
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1898
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ap:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1900
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1902
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1904
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1905
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1906
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_band_is_unavailable_tip_string_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 1907
    :cond_0
    const/4 v0, 0x6

    if-ne v0, p2, :cond_1

    .line 1908
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPairFailureResult() DeviceConnectState.DEVICE_WORK_MODE_CONFLICT == errorType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1909
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s()V

    .line 1917
    :cond_1
    :goto_0
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 1919
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1920
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1921
    goto/16 :goto_2

    .line 1923
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1924
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1925
    goto/16 :goto_2

    .line 1927
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1928
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1929
    goto/16 :goto_2

    .line 1932
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1934
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q()V

    .line 1936
    goto/16 :goto_2

    .line 1938
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1940
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q()V

    .line 1942
    goto/16 :goto_2

    .line 1944
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1945
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1946
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PairFailureResult B3 errorType \uff1a1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1947
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1948
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 1950
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1952
    goto/16 :goto_2

    .line 1954
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1955
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 1956
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PairFailureResult GRUS errorType \uff1a1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1957
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1958
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_band_is_unavailable_tip_string_newphone:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 1960
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1962
    goto/16 :goto_2

    .line 1964
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1965
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 1966
    goto/16 :goto_2

    .line 1968
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1970
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_fragment_w1_pairing_guide_2:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1971
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1972
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63d0\u793a\u7528\u6237\u6253\u5f00Android Wear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1973
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1974
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_fragment_pairing_btn_open_android_wear:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1975
    goto/16 :goto_2

    .line 1977
    :pswitch_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1979
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 1980
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_note_reasons:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1981
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1982
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_note_not_connected_with_android_wear:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1983
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1984
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_note_low_watch_version:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1985
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1986
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_Android_Wear_low_watch_version:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1987
    const-string v0, "\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1988
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_fail:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1989
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1990
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->U:Landroid/widget/TextView;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1991
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->U:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1992
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1993
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63d0\u793a\u7528\u6237\u6253\u5f00Android Wear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1994
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1995
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_fragment_pairing_btn_open_android_wear:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1996
    goto :goto_2

    .line 1998
    :pswitch_a
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_headsetpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1999
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 2000
    goto :goto_2

    .line 2002
    :pswitch_b
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2003
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 2004
    goto :goto_2

    .line 2006
    :pswitch_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2007
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 2008
    goto :goto_2

    .line 2010
    :goto_1
    :pswitch_d
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t()V

    .line 2014
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_0
        :pswitch_d
        :pswitch_5
        :pswitch_1
        :pswitch_d
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_4
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V
    .locals 0

    .line 122
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 2345
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter enableScanBtn():enable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2346
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 2347
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->J:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 641
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AddDevice, device.Type ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-static {v3}, Lo/env;->d(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Lo/env;->c(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    .line 642
    invoke-static {v3}, Lo/env;->d(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "deviceAddress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 641
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    invoke-virtual {v0}, Lo/env;->a()Ljava/util/List;

    move-result-object v5

    .line 644
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/eny;->a(I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v5, v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Ljava/util/List;Ljava/util/List;Z)V

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->q()V

    .line 649
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;I)V
    .locals 0

    .line 122
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->k:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 1

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->as:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->at:Z

    .line 610
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->n()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;II)V
    .locals 0

    .line 122
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(II)V

    return-void
.end method

.method private e(Ljava/util/List;Ljava/util/List;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;Ljava/util/List<Ljava/lang/String;>;Z)V"
        }
    .end annotation

    .line 1294
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceForConnectedAndDisconnected connected device disconnect ,new device connect and isFromAutoFind = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1295
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ao:Z

    .line 1296
    const/4 v7, 0x0

    .line 1297
    if-eqz p3, :cond_0

    .line 1298
    iget-object v7, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    .line 1299
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceForConnectedAndDisconnected macAddress "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v2

    invoke-virtual {v2, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1301
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1302
    :cond_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice null == connectedDeviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1303
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 1305
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_8

    .line 1306
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1307
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v9

    .line 1308
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v10

    .line 1309
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v11

    .line 1311
    if-nez v10, :cond_4

    .line 1312
    if-eqz v9, :cond_3

    .line 1313
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected other device and want another aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1319
    :cond_3
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected other device and want another other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1320
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    move-object v6, v11

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1324
    :cond_4
    if-eqz v10, :cond_5

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_5

    .line 1325
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected aw70 device in run mode and want another other device/aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1329
    :cond_5
    if-eqz v10, :cond_7

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 1330
    if-nez v9, :cond_6

    .line 1332
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected aw70 device in band mode and want another other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1333
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    move-object v6, v11

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1338
    :cond_6
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected aw70 device and want another aw70 device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    .line 1343
    :cond_7
    :goto_0
    goto/16 :goto_4

    :cond_8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v1, v0, :cond_e

    .line 1344
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v8

    .line 1345
    if-eqz v8, :cond_c

    .line 1346
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1347
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1348
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected device is aw70"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1349
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_9

    .line 1351
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected aw70 device in band mode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1353
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1358
    :cond_9
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected aw70 device in run mode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1360
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    .line 1363
    goto :goto_2

    .line 1365
    :cond_a
    goto/16 :goto_1

    :cond_b
    :goto_2
    goto :goto_4

    .line 1367
    :cond_c
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1368
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v1

    invoke-static {v0, v1}, Lo/dbh;->d(II)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1369
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAddDevice has one connected device is other device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1370
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v1}, Lo/env;->c(I)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    move-object v3, p2

    iget-object v4, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ax:Lo/djp$b;

    move-object v5, v7

    .line 1371
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 1370
    invoke-virtual/range {v0 .. v6}, Lo/env;->b(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V

    .line 1372
    goto :goto_4

    .line 1374
    :cond_d
    goto :goto_3

    .line 1377
    :cond_e
    :goto_4
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    return-object v0
.end method

.method private f()V
    .locals 11

    .line 863
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showPairGuide(): deviceProductType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 866
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 867
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 870
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 872
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v3}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 873
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 874
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->janus_pair_guide_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 875
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v0}, Lo/eav;->d()Lo/ean;

    move-result-object v0

    invoke-virtual {v0}, Lo/ean;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 879
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v0, v1, v7}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    const/16 v1, 0x64

    invoke-virtual {v0, v5, v1}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 881
    goto :goto_0

    .line 882
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    goto :goto_1

    .line 885
    :cond_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mB3PairGuideAnim is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 889
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 890
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 891
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_janus_pair_guide_tip1:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 892
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_janus_pair_guide_tip3:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 893
    goto/16 :goto_6

    .line 900
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    invoke-virtual {v3}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 904
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 905
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 908
    goto/16 :goto_6

    .line 909
    :goto_2
    :pswitch_2
    goto/16 :goto_6

    .line 913
    :cond_2
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_6

    .line 915
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_pic_a1_empty_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 916
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 919
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 922
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 923
    goto/16 :goto_6

    .line 925
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_pairing_metis_guide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 926
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 927
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 928
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 929
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 931
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 932
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 933
    goto/16 :goto_6

    .line 936
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_pairing_nyx_guide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 937
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 938
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 939
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 940
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 941
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 944
    goto/16 :goto_6

    .line 946
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_pairing_eris_guide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 947
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 948
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 949
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 951
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 952
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ac:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 954
    goto/16 :goto_6

    .line 956
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_pic_b3_empty_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 957
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 958
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->b3_pair_guide_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 959
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    .line 960
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 961
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    goto :goto_3

    .line 963
    :cond_3
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mB3PairGuideAnim is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    :goto_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->k()V

    .line 966
    goto/16 :goto_6

    .line 968
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_pic_grus_empty_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 969
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 970
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->grus_pair_guide_animation:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 971
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    .line 972
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 973
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    goto :goto_4

    .line 975
    :cond_4
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGRUSPairGuideAnim is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 979
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 980
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 981
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 982
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->af:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 983
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->af:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->af:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 985
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 986
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 987
    goto/16 :goto_6

    .line 991
    :pswitch_9
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g:Z

    if-eqz v0, :cond_5

    .line 992
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_6

    .line 994
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 998
    goto/16 :goto_6

    .line 1000
    :pswitch_a
    const-string v0, "HUAWEI CM-R1P"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    .line 1001
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_r1_pro_name_title:I

    .line 1002
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1003
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->r1_pro_pairing:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_5

    .line 1005
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_pairing_guide_r1_01:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1007
    :goto_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1011
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1012
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1013
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ad:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1014
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ad:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1015
    goto :goto_6

    .line 1017
    :pswitch_b
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1018
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1019
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1020
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1021
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1022
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ag:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1023
    goto :goto_6

    .line 1025
    :pswitch_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1026
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1027
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1028
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->y:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ag:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1031
    .line 1037
    :cond_8
    :goto_6
    :pswitch_d
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_9

    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xa

    if-eq v1, v0, :cond_9

    .line 1039
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1041
    :cond_9
    return-void

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_9
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_7
        :pswitch_4
        :pswitch_d
        :pswitch_9
        :pswitch_a
        :pswitch_3
        :pswitch_5
        :pswitch_8
        :pswitch_6
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method private g()V
    .locals 5

    .line 852
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_pair_guide_step:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 853
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->B:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->E:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->I:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 856
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->H:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 857
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a()V

    return-void
.end method

.method private h()V
    .locals 2

    .line 708
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enw;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 709
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 711
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enw;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 712
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i()V

    goto :goto_0

    .line 714
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Z)V

    .line 717
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ap:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 680
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showLowVersionDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$2;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 702
    return-void
.end method

.method private k()V
    .locals 10

    .line 1044
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1045
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->u:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1046
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1048
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1049
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Y:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1052
    new-instance v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$8;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$8;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    .line 1061
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Y:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1062
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Y:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1063
    const-string v0, "%1$s"

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 1064
    const-string v0, "%1$s"

    invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 1066
    const/4 v0, 0x0

    if-ge v0, v6, :cond_0

    .line 1067
    const/4 v0, 0x0

    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1068
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<img src=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->img_pairing_more_new:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'/>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v3, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 1070
    add-int/lit8 v0, v6, 0x4

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 1071
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 1073
    :cond_0
    const/4 v0, 0x0

    if-ge v0, v7, :cond_1

    .line 1074
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1075
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1076
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<img src=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$mipmap;->img_bluetooth_new:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'/>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v3, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;Landroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 1077
    add-int/lit8 v0, v7, 0x4

    invoke-virtual {v5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 1080
    :cond_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    return-object v0
.end method

.method private l()V
    .locals 6

    .line 1267
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter startAddDevice():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    invoke-virtual {v0}, Lo/env;->a()Ljava/util/List;

    move-result-object v4

    .line 1273
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xb

    if-ne v1, v0, :cond_2

    .line 1274
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1275
    const-string v0, "HUAWEI CM-R1P"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    .line 1276
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_r1_pro_name_title:I

    .line 1277
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1278
    :cond_0
    const-string v0, "HUAWEI CM-R1P"

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1280
    :cond_1
    const-string v0, "HUAWEI AM-R1"

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1282
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v4, v5, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Ljava/util/List;Ljava/util/List;Z)V

    .line 1286
    goto :goto_1

    .line 1289
    :cond_2
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/eny;->a(I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Ljava/util/List;Ljava/util/List;Z)V

    .line 1291
    :goto_1
    return-void
.end method

.method private m()V
    .locals 15

    .line 1386
    const-string v4, "com.google.android.wearable.app"

    .line 1388
    const-string v5, "com.google.android.wearable.app.cn"

    .line 1389
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 1391
    const/4 v7, 0x0

    .line 1394
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v6, v5, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1417
    goto/16 :goto_0

    .line 1395
    :catch_0
    move-exception v8

    .line 1396
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() androidWearNameCn, error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1399
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v6, v4, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v7, v0

    .line 1416
    goto :goto_0

    .line 1400
    :catch_1
    move-exception v9

    .line 1401
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() androidWearName, error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1405
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1406
    const/16 v0, 0x37

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1407
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter gotoChinese "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1408
    invoke-virtual {p0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e(Landroid/content/Context;)V

    goto :goto_0

    .line 1411
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_hauwei_watch_download_android_wear_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 1414
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->CS_network_connect_error:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 1418
    :goto_0
    if-nez v7, :cond_2

    .line 1419
    return-void

    .line 1423
    :cond_2
    new-instance v8, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1424
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1425
    iget-object v0, v7, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1428
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1429
    const/4 v1, 0x0

    invoke-virtual {v0, v8, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v9

    .line 1431
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/content/pm/ResolveInfo;

    .line 1432
    if-eqz v10, :cond_3

    .line 1434
    iget-object v0, v10, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v11, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 1436
    iget-object v0, v10, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v12, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 1438
    new-instance v13, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v13, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1439
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v13, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1442
    new-instance v0, Landroid/content/ComponentName;

    move-object v1, v11

    move-object v2, v12

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v14, v0

    .line 1444
    invoke-virtual {v13, v14}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1445
    invoke-virtual {p0, v13}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->startActivity(Landroid/content/Intent;)V

    .line 1447
    :cond_3
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h()V

    return-void
.end method

.method private n()V
    .locals 11

    .line 1731
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showPairProcess()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1733
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 1734
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 1735
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1736
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1737
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->R:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1738
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->F:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1739
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->V:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1740
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->W:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1741
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1742
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1743
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1744
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ap:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1745
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1746
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_opt_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1747
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->U:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1778
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1780
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1781
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1782
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ag:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1783
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1785
    goto/16 :goto_0

    .line 1787
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1788
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1789
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ag:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1790
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1792
    goto/16 :goto_0

    .line 1795
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1796
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1797
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1798
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1800
    goto/16 :goto_0

    .line 1803
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1804
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1805
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1806
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1808
    goto/16 :goto_0

    .line 1810
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1811
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1812
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1813
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1814
    goto/16 :goto_0

    .line 1816
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1817
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1818
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1819
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1820
    goto/16 :goto_0

    .line 1823
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1824
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1825
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1827
    goto/16 :goto_0

    .line 1829
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1830
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1831
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ae:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 1832
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1833
    goto :goto_0

    .line 1835
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1836
    goto :goto_0

    .line 1838
    :pswitch_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1839
    goto :goto_0

    .line 1841
    :pswitch_a
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1842
    goto :goto_0

    .line 1844
    :pswitch_b
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1846
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1847
    goto :goto_0

    .line 1849
    :pswitch_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1851
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1852
    goto :goto_0

    .line 1854
    :pswitch_d
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_headsetpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1855
    .line 1861
    :goto_0
    :pswitch_e
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->T:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 1862
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f00\u542f\u52a8\u753b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1863
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_e
        :pswitch_b
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_8
        :pswitch_4
        :pswitch_e
        :pswitch_c
        :pswitch_d
        :pswitch_5
        :pswitch_6
        :pswitch_9
        :pswitch_7
        :pswitch_e
        :pswitch_e
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_e
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aB:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/Context;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 1580
    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1581
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1582
    const-string v0, "com.huawei.bone.action.REQUEST_BIND_DEVICE"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1583
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ay:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1584
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/widget/CheckBox;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ar:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private p()V
    .locals 6

    .line 1203
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1204
    const-string v0, "devicename"

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i:Z

    invoke-static {v1, v2, v3}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1205
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enw;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1206
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_success"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1207
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessageCenterFromWear begin "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1208
    const-string v0, "true"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1209
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$9;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-static {v0}, Lo/dbw;->e(Ljava/lang/Runnable;)I

    .line 1224
    :cond_0
    goto :goto_0

    .line 1225
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_success"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1226
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMessageCenterFromWear enter else:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    :goto_0
    new-instance v0, Lo/eoi;

    invoke-direct {v0}, Lo/eoi;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;

    invoke-direct {v3, p0, v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$7;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Ljava/util/Map;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eoi;->c(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1261
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->al:Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    return-object v0
.end method

.method private q()V
    .locals 5

    .line 2073
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter showPairFailureOnlyPhoneNote():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2074
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2075
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_fail_help_no_band_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 2076
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2077
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/DialogInterface$OnKeyListener;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->az:Landroid/content/DialogInterface$OnKeyListener;

    return-object v0
.end method

.method private r()V
    .locals 5

    .line 2261
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ay:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2266
    goto :goto_0

    .line 2262
    :catch_0
    move-exception v4

    .line 2263
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2266
    goto :goto_0

    .line 2264
    :catch_1
    move-exception v4

    .line 2265
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2267
    :goto_0
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    return-object v0
.end method

.method private s()V
    .locals 8

    .line 2017
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showModeConflictDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    invoke-virtual {v0}, Lo/env;->a()Ljava/util/List;

    move-result-object v4

    .line 2020
    const/4 v5, 0x0

    .line 2021
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2022
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == currentDeviceList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    return-void

    .line 2025
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2026
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 2027
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showConflictDialog find connected device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2028
    move-object v5, v7

    .line 2029
    goto :goto_1

    .line 2031
    :cond_1
    goto :goto_0

    .line 2032
    :cond_2
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 2033
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showConflictDialog null == connectedDevice "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2034
    return-void

    .line 2036
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_work_mode_conflict_dialog_content:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    .line 2037
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v3

    invoke-virtual {v2, v3}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    .line 2038
    invoke-virtual {v2, v3}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 2036
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 2040
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 2041
    const-string v0, "content"

    invoke-virtual {v7, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2042
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/userProfile/activity/WorkModeConflictDialogActivity;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2043
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2045
    return-void
.end method

.method private t()V
    .locals 6

    .line 2051
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter showPairFailureNote():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2052
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2053
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v0, v1}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 2054
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2056
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xb

    if-ne v1, v0, :cond_1

    const-string v0, "HUAWEI CM-R1P"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    .line 2057
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    .line 2058
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_r1_pro_name_title:I

    .line 2059
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2060
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_r1_pro_content:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 2063
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_fail_help_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 2064
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2065
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/Context;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private u()V
    .locals 15

    .line 2083
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showPairSuccessResult():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2085
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2087
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2088
    iget-object v5, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    goto :goto_0

    .line 2089
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2090
    iget-object v5, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    goto :goto_0

    .line 2092
    :cond_1
    const-string v5, "default"

    .line 2094
    :goto_0
    const-string v0, "productId"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2095
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v6

    .line 2096
    invoke-virtual {v6}, Lo/ddc;->a()I

    move-result v7

    .line 2097
    const-string v0, "deviceId"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2098
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginAchieve setEvent productID:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2099
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    const/16 v2, 0x5dc

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 2101
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->T:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 2102
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2103
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u505c\u6b62\u52a8\u753b"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2105
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 2106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 2108
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2110
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->R:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2111
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->V:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->W:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2113
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->P:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2114
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->X:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2115
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2116
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aa:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_pairing_completed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2117
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->O:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_blite_guide_paire_completed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2118
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2119
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v8

    .line 2120
    const/4 v9, 0x0

    .line 2121
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->au:Lo/enz;

    .line 2122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->au:Lo/enz;

    invoke-virtual {v0, v5}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->an:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 2123
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->an:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 2124
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mDeviceCapability"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2126
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->an:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isOta_update()Z

    move-result v9

    .line 2127
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2129
    :goto_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isOtaUpdate= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isAw70 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " deviceProductType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2130
    if-eqz v9, :cond_4

    if-nez v8, :cond_4

    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xc

    if-eq v1, v0, :cond_4

    .line 2131
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ap:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2132
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ar:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->av:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2133
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ar:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_2

    .line 2138
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ar:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 2142
    :cond_4
    :goto_2
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0x18

    if-eq v0, v1, :cond_5

    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_6

    .line 2143
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_aw_binding_remind:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 2146
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_paring_success_descommon_info_union_new:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2149
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->F:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->G:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2151
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->N:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2153
    new-instance v11, Lo/fcb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v11, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 2155
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter MSG_SHOW_PAIR_SUCCESS_RESULT():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2156
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/fcb;->b(Z)V

    .line 2157
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->t(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v12

    .line 2159
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_apphelp_pwindows_continue_button:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 2160
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_sns_compelete:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 2161
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aA:Lo/enz;

    .line 2162
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aA:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enz;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aw:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 2163
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aw:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aw:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2165
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aB:Z

    .line 2166
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is support notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2167
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->at:Z

    if-eqz v0, :cond_7

    .line 2168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    invoke-virtual {v14}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 2170
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    invoke-virtual {v13}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 2173
    :cond_8
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device is not support notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2174
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    invoke-virtual {v14}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 2177
    :goto_4
    const/4 v0, 0x0

    if-eq v0, v12, :cond_b

    .line 2178
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showPairSuccessResult CommonUtil.HIHEALTH_VERSION_CODE = 20100000 packageInfo.versionCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v12, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2179
    iget v0, v12, Landroid/content/pm/PackageInfo;->versionCode:I

    const v1, 0x132b3a0

    if-le v1, v0, :cond_9

    invoke-virtual {v11}, Lo/fcb;->e()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2180
    :cond_9
    sget v0, Lcom/huawei/ui/device/R$id;->pair_text_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_5

    .line 2184
    :cond_a
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_startup_next:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    .line 2185
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 2188
    :cond_b
    invoke-virtual {v11}, Lo/fcb;->e()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2189
    sget v0, Lcom/huawei/ui/device/R$id;->pair_text_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2191
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->M:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_5

    .line 2193
    :cond_c
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_startup_next:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    .line 2194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2203
    :goto_5
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    .line 2205
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2206
    goto/16 :goto_6

    .line 2208
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2209
    goto/16 :goto_6

    .line 2211
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2212
    goto/16 :goto_6

    .line 2215
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2216
    goto :goto_6

    .line 2218
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2219
    goto :goto_6

    .line 2221
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2222
    goto :goto_6

    .line 2224
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2225
    goto :goto_6

    .line 2227
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_handpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2228
    goto :goto_6

    .line 2230
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2231
    goto :goto_6

    .line 2233
    :pswitch_9
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2234
    goto :goto_6

    .line 2236
    :pswitch_a
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_headsetpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2237
    goto :goto_6

    .line 2239
    :pswitch_b
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2240
    goto :goto_6

    .line 2242
    :pswitch_c
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->S:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->img_watchpair:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2243
    .line 2248
    :goto_6
    :pswitch_d
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fjb;->b(Landroid/content/Context;)V

    .line 2250
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->l()V

    .line 2254
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_0
        :pswitch_d
        :pswitch_5
        :pswitch_1
        :pswitch_d
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_4
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method static synthetic v(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    return-object v0
.end method

.method private v()V
    .locals 4

    .line 2351
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter stopPairGuideAnim():!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2352
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2353
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 2354
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t:Landroid/graphics/drawable/AnimationDrawable;

    goto :goto_0

    .line 2356
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "b1PairGuideAnimation is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2358
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2359
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 2360
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t:Landroid/graphics/drawable/AnimationDrawable;

    goto :goto_1

    .line 2362
    :cond_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "b2PairGuideAnimation is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2364
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2365
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 2366
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->t:Landroid/graphics/drawable/AnimationDrawable;

    goto :goto_2

    .line 2368
    :cond_2
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "b1PairGuideAnimation is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2370
    :goto_2
    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ao:Z

    return v0
.end method

.method static synthetic x(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h:Z

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)I
    .locals 1

    .line 122
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    return v0
.end method

.method static synthetic z(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/env;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    return-object v0
.end method


# virtual methods
.method public d(Landroid/content/Context;)V
    .locals 4

    .line 743
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showunBindDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 815
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 1458
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enterHuaweiAppStore():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1459
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 1461
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1462
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1463
    sget v0, Lcom/huawei/ui/device/R$string;->CS_network_connect_error:I

    invoke-static {p1, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 1464
    return-void

    .line 1466
    :cond_0
    const-string v0, "http://a.vmall.com/exmarket?id=C10362096"

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.huawei.appmarket"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a(Landroid/content/Intent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 1467
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isInstallFlag ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1469
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1470
    return-void

    .line 1472
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_hauwei_watch_download_android_wear_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 1474
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1498
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onActivityResult()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1499
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1500
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 2333
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onBackPressed():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2334
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v()V

    .line 2335
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 2336
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 1127
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onClick():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    .line 1129
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_left_cancel_layout:I

    if-ne v5, v0, :cond_1

    .line 1130
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick():cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1135
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v()V

    .line 1136
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    goto/16 :goto_0

    .line 1138
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 1142
    :cond_1
    sget v0, Lcom/huawei/ui/device/R$id;->pair_guide_right_btn_layout:I

    if-ne v5, v0, :cond_8

    .line 1143
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick():btn right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1144
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1145
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    .line 1146
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_fragment_pairing_btn_open_android_wear:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1147
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick():btn_right, W1\u5411\u5bfc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->m()V

    goto/16 :goto_0

    .line 1150
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_sns_compelete:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->L:Landroid/widget/TextView;

    .line 1151
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_startup_next:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1153
    :cond_4
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mConnectStateChangedReceiver(): setResult = 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->p()V

    .line 1155
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 1156
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1157
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v6}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->setResult(ILandroid/content/Intent;)V

    .line 1158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    .line 1159
    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_pair_success_status"

    .line 1158
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1160
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    const-string v0, "true"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "first_pair_success_status"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1165
    :cond_5
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 1166
    const-string v0, "com.huawei.ui.homewear21.home.WearHomeActivity"

    invoke-virtual {v8, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 1167
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1168
    invoke-virtual {p0, v8}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->startActivity(Landroid/content/Intent;)V

    .line 1169
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    .line 1170
    goto :goto_0

    .line 1171
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aj:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;

    iget v2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    new-instance v3, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$e;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$e;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enw;->e(Lo/dbb;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 1174
    :cond_7
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1176
    :cond_8
    sget v0, Lcom/huawei/ui/device/R$id;->cancel_button:I

    if-ne v5, v0, :cond_9

    .line 1178
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/env;->e(Ljava/lang/String;)V

    .line 1180
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    goto :goto_0

    .line 1183
    :cond_9
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick():i ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1185
    :cond_a
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 388
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 390
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    .line 391
    iput-object p0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b:Landroid/content/Context;

    .line 392
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;-><init>(Landroid/os/Looper;Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aj:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$i;

    .line 393
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c:Lo/env;

    .line 395
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->o()V

    .line 398
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 400
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideProductType"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    .line 401
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideProductName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    .line 402
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideW1Success"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g:Z

    .line 403
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideFromScanList"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->h:Z

    .line 404
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "IS_PROC"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->i:Z

    .line 405
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideSelectName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    .line 406
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pairGuideSelectAddress"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    goto :goto_0

    .line 408
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initListView() intent = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    :goto_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate():deviceProductType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceProductName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",pairSuccessFlag="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ai:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceAddress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ak:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_pairing_guide_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->setContentView(I)V

    .line 414
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->as:Lo/eoa;

    .line 415
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b()V

    .line 417
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 418
    iget v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->a:I

    invoke-static {v0}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 419
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->aq:Lo/eav;

    .line 422
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 2302
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2303
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 2304
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->v()V

    .line 2305
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    .line 2307
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r()V

    .line 2308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    const-string v1, "getDeviceList"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 2309
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    const-string v1, "unbindDevicesByTypes"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 2310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->am:Lo/enw;

    const-string v1, "getWearData"

    invoke-virtual {v0, v1}, Lo/enw;->c(Ljava/lang/String;)V

    .line 2312
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2313
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2315
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->g:Z

    .line 2316
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 2320
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 2323
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->ab:Z

    if-eqz v0, :cond_0

    .line 2324
    const/4 v0, 0x1

    return v0

    .line 2327
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPause()V
    .locals 4

    .line 2290
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onPause():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2291
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 2292
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 2277
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onRestart():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2278
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Z)V

    .line 2279
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 2280
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 2284
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2285
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 2286
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 2271
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onStart():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2272
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 2273
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 2296
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onStop():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2297
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 2298
    return-void
.end method
