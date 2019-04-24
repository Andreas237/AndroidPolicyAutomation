.class public Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;,
        Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;
    }
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field a:Lcom/huawei/datatype/DataDeviceInfo;

.field private b:Lo/egd;

.field c:Lo/eoe;

.field private e:Landroid/content/Context;

.field private f:I

.field private g:Landroid/widget/TextView;

.field private h:Lo/egn;

.field private i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

.field private k:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

.field private p:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const-string v0, "VIPMemberActivationActivity"

    sput-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 59
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->k:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a:Lcom/huawei/datatype/DataDeviceInfo;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->f:I

    return v0
.end method

.method private a()V
    .locals 4

    .line 110
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter activation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c:Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    new-instance v2, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$5;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/eoe;->c(Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V

    .line 146
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Lo/egn;)Lo/egn;
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    return-object p1
.end method

.method private b()V
    .locals 2

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 273
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    .line 275
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->k:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->k:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 278
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egn;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->k:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$e;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 159
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_vip_member_rights_activation:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->setContentView(I)V

    .line 161
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    .line 162
    sget v0, Lcom/huawei/ui/device/R$id;->vip_activation_Ok:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b:Lo/egd;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 164
    sget v0, Lcom/huawei/ui/device/R$id;->Member_Free_machine_protection:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g:Landroid/widget/TextView;

    .line 165
    sget v0, Lcom/huawei/ui/device/R$id;->Member_Free_Extended_warranty:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->p:Landroid/widget/TextView;

    .line 167
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 168
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_0

    .line 169
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is LEO !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 176
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Landroid/content/Context;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 42
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;)Lo/egd;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->b:Lo/egd;

    return-object v0
.end method


# virtual methods
.method protected e(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 154
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 155
    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->startActivity(Landroid/content/Intent;)V

    .line 156
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 92
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 95
    sget v0, Lcom/huawei/ui/device/R$id;->vip_activation_Ok:I

    if-ne v4, v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_confirm_network_whether_connected:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 99
    return-void

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->sendEmptyMessage(I)Z

    .line 102
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a()V

    .line 104
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 70
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 73
    iput-object p0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    .line 74
    new-instance v0, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/datatype/DataDeviceInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->a:Lcom/huawei/datatype/DataDeviceInfo;

    .line 75
    new-instance v0, Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoe;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->c:Lo/eoe;

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->f:I

    .line 79
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d()V

    .line 81
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;-><init>(Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    .line 82
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 180
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeMessages(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeMessages(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeMessages(I)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeMessages(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->i:Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity$d;->removeMessages(I)V

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 191
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->h:Lo/egn;

    .line 193
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->finish()V

    .line 194
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 86
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 88
    return-void
.end method
