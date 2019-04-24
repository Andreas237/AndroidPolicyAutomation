.class public Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/enz;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Lo/emr;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Lo/egd;

.field private q:I

.field private s:I

.field private final u:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    .line 67
    const/16 v0, 0xf

    iput v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->q:I

    .line 68
    const/16 v0, 0x9

    iput v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->s:I

    .line 397
    new-instance v0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$4;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->u:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 1

    .line 85
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->l()V

    .line 86
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e()V

    .line 87
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->b()V

    .line 88
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a:Lo/enz;

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->o()V

    .line 90
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p()V

    return-void
.end method

.method private b()V
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 128
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h()V

    return-void
.end method

.method private c()V
    .locals 7

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->i:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hw_health_double_phone_button_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 140
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 141
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 142
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hw_health_double_phone_page_content3:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    goto :goto_0

    .line 145
    :cond_0
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pairOtherPhone null==deviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->setResult(I)V

    .line 148
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->i:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hw_health_double_phone_menu_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 117
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 93
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkBluetooth "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d()V

    goto :goto_0

    .line 97
    :cond_0
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u84dd\u7259\u6b63\u5e38\uff0c\u7ee7\u7eed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->b()V

    .line 99
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a:Lo/enz;

    .line 100
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->o()V

    .line 102
    :goto_0
    return-void
.end method

.method private f()V
    .locals 5

    .line 234
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/WindowManager;

    .line 235
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 236
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v3

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 238
    iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 239
    div-int/lit8 v0, v3, 0x2

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 241
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a()V

    return-void
.end method

.method private g()V
    .locals 7

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 211
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 212
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v6

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_hw_health_double_phone_page_content1:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a:Lo/enz;

    new-instance v1, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$3;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/enz;->e(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 287
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d()V

    return-void
.end method

.method private i()V
    .locals 4

    .line 222
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/WindowManager;

    .line 223
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v2

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 225
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 226
    iput v2, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 228
    return-void
.end method

.method private k()V
    .locals 4

    .line 151
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_double_phone:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->setContentView(I)V

    .line 152
    sget v0, Lcom/huawei/ui/device/R$id;->setting_device_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->i:Lo/emr;

    .line 153
    sget v0, Lcom/huawei/ui/device/R$id;->layout_normal:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->c:Landroid/widget/RelativeLayout;

    .line 154
    sget v0, Lcom/huawei/ui/device/R$id;->addDevice_error_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->b:Landroid/widget/RelativeLayout;

    .line 155
    sget v0, Lcom/huawei/ui/device/R$id;->layout_device_connected:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    .line 156
    sget v0, Lcom/huawei/ui/device/R$id;->layout_normal_pair_other:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k:Landroid/widget/LinearLayout;

    .line 157
    sget v0, Lcom/huawei/ui/device/R$id;->rl_bottom:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e:Landroid/widget/RelativeLayout;

    .line 158
    sget v0, Lcom/huawei/ui/device/R$id;->double_phone_parent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->g:Landroid/widget/LinearLayout;

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->g:Landroid/widget/LinearLayout;

    const-string v1, "#FFD8EBF8"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 160
    sget v0, Lcom/huawei/ui/device/R$id;->pic_double_phone:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f:Landroid/widget/ImageView;

    .line 161
    sget v0, Lcom/huawei/ui/device/R$id;->textview_pair_content1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    .line 162
    sget v0, Lcom/huawei/ui/device/R$id;->text_view_content3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->m:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/ui/device/R$id;->text_view_phone1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->o:Landroid/widget/TextView;

    .line 164
    sget v0, Lcom/huawei/ui/device/R$id;->text_view_phone2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->l:Landroid/widget/TextView;

    .line 166
    sget v0, Lcom/huawei/ui/device/R$id;->button_start_notify_device:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    .line 168
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->g()V

    .line 170
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->f()V

    goto :goto_0

    .line 173
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->i()V

    .line 175
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    new-instance v1, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$5;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    const/4 v0, 0x1

    new-array v2, v0, [I

    .line 185
    iget v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->q:I

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 186
    const/4 v3, 0x0

    :goto_1
    iget v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->q:I

    iget v1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->s:I

    sub-int/2addr v0, v1

    if-ge v3, v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->p:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$2;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;[I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 186
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 207
    :cond_1
    return-void
.end method

.method private l()V
    .locals 4

    .line 391
    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 392
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 393
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->u:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v3, v1, v2}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 395
    return-void
.end method

.method private o()V
    .locals 2

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a:Lo/enz;

    new-instance v1, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V

    invoke-virtual {v0, v1}, Lo/enz;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 364
    return-void
.end method

.method private p()V
    .locals 5

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 372
    return-void

    .line 374
    :cond_0
    const/4 v4, 0x2

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 381
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 383
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectedPhoneNames == NULL || connectedPhoneNames.size() != 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    :goto_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 72
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->k()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->a()V

    .line 75
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 79
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->u:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 82
    return-void
.end method
