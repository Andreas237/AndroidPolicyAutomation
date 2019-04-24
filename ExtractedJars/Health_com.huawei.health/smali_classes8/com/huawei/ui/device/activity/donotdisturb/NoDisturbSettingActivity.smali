.class public Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$b;
    }
.end annotation


# instance fields
.field private A:Lo/emp;

.field private B:Landroid/widget/Switch;

.field private C:Landroid/app/Dialog;

.field private D:I

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;>;"
        }
    .end annotation
.end field

.field private F:Ljava/lang/String;

.field private G:Landroid/os/Handler;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Landroid/widget/TextView;

.field private K:I

.field private L:I

.field private M:Landroid/widget/Switch;

.field private N:Landroid/widget/RelativeLayout;

.field private O:Lo/eoa;

.field private Q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private a:Lo/dqi;

.field private b:Landroid/content/Context;

.field private c:Lo/enz;

.field private d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

.field private e:Lo/env;

.field private f:Z

.field private g:Landroid/widget/Switch;

.field private h:Landroid/widget/Switch;

.field private i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private j:I

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/LinearLayout;

.field private o:Lo/emr;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/ImageView;

.field private w:Lo/eno;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Lo/eno;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f:Z

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->y:Lo/eno;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->w:Lo/eno;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->C:Landroid/app/Dialog;

    .line 126
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    .line 127
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    .line 128
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->I:Ljava/lang/String;

    .line 129
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->H:Ljava/lang/String;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->E:Ljava/util/List;

    .line 132
    new-instance v0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$b;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$b;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->G:Landroid/os/Handler;

    .line 134
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    .line 279
    new-instance v0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$1;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->Q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method private a()V
    .locals 4

    .line 247
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSetNoDisturbFail()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_synchroFailed_dialog:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 249
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->finish()V

    .line 250
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->E:Ljava/util/List;

    return-object p1
.end method

.method private b()V
    .locals 4

    .line 237
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSetNoDisturbSuccess()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->finish()V

    .line 240
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 634
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 635
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_type()I

    move-result v0

    and-int/lit8 v0, v0, 0x14

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    .line 636
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_setting_disturb_desc_turn_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->B:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    goto :goto_0

    .line 639
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_setting_disturb_desc:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->B:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    goto :goto_0

    .line 643
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_setting_disturb_desc:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->B:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 647
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    return p1
.end method

.method private c()V
    .locals 4

    .line 226
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetNoDisturbFail()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->finish()V

    .line 230
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b()V

    return-void
.end method

.method private c(Ljava/lang/Object;)V
    .locals 5

    .line 202
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenGetNoDisturbSuccess()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    move-object v4, p1

    check-cast v4, Ljava/util/List;

    .line 205
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 206
    :cond_0
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR list!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void

    .line 211
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 212
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDataDeviceAvoidDisturbInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f()V

    .line 218
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h()V

    .line 219
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->K:I

    return p1
.end method

.method private d()V
    .locals 5

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e:Lo/env;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/env;->a(Ljava/lang/String;)I

    move-result v4

    .line 381
    and-int/lit8 v0, v4, 0x14

    const/16 v1, 0x14

    if-ne v1, v0, :cond_0

    .line 382
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f:Z

    .line 385
    :cond_0
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestDeviceAllowDisturbItem allowDisturbValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mIsHaveAllowDisturbInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->a()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->L:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    return-object p1
.end method

.method private e()V
    .locals 6

    .line 322
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e:Lo/env;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->a:Lo/dqi;

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e:Lo/env;

    if-nez v0, :cond_1

    .line 330
    :cond_0
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceSettingsInteractors == null || mDeviceInteractors ==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void

    .line 333
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 334
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 335
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->a:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 371
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 372
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 373
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->L:I

    .line 374
    const/16 v0, 0xc

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->K:I

    .line 375
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Ljava/lang/Object;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 398
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_disturb_des:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l:Landroid/widget/TextView;

    .line 400
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g:Landroid/widget/Switch;

    .line 401
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_scheduled_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    .line 402
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k:Landroid/widget/RelativeLayout;

    .line 403
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_scheduled_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    .line 404
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_time_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p:Landroid/widget/RelativeLayout;

    .line 405
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_end_time_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n:Landroid/widget/LinearLayout;

    .line 406
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o:Lo/emr;

    .line 407
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_scheduled_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->q:Landroid/widget/TextView;

    .line 408
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_time_title_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->u:Landroid/widget/TextView;

    .line 409
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_end_time_title_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->r:Landroid/widget/TextView;

    .line 410
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_time_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    .line 411
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_end_time_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_time_iv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->v:Landroid/widget/ImageView;

    .line 415
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_end_time_iv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->z:Landroid/widget/ImageView;

    .line 416
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->v:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->z:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 423
    :goto_0
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_disturb_up_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    .line 424
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_can_disturb_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->A:Lo/emp;

    .line 425
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_disturb_up_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->B:Landroid/widget/Switch;

    .line 428
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g()V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 431
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 435
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f:Z

    if-nez v0, :cond_1

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->A:Lo/emp;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 441
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/util/List;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->E:Ljava/util/List;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 456
    new-instance v2, Lo/enq;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lo/enq;-><init>(Landroid/content/Context;I)V

    .line 458
    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->A:Lo/emp;

    invoke-virtual {v0, v3}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->A:Lo/emp;

    invoke-virtual {v0, v2}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 463
    return-void
.end method

.method private h()V
    .locals 4

    .line 516
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updataViewByDisturbData mDataDeviceAvoidDisturbInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->N:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 526
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 527
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 535
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    goto/16 :goto_0

    .line 545
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    goto/16 :goto_0

    .line 550
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->N:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 585
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 603
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f:Z

    if-eqz v0, :cond_3

    .line 604
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k()V

    .line 606
    :cond_3
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lo/eoa;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->O:Lo/eoa;

    return-object v0
.end method

.method private i()V
    .locals 7

    .line 466
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    invoke-static {v0}, Lo/dbu;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 467
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    invoke-static {v0}, Lo/dbu;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    invoke-virtual {v0, v4}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->I:Ljava/lang/String;

    .line 469
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    iget v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    if-le v0, v1, :cond_0

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    invoke-virtual {v0, v5}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_no_disturb_setting_next_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->H:Ljava/lang/String;

    .line 472
    goto :goto_0

    .line 473
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    invoke-virtual {v0, v5}, Lo/enz;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->H:Ljava/lang/String;

    .line 475
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->a:Lo/dqi;

    const-string v1, "auto_light_screen"

    new-instance v2, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$5;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 628
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->A:Lo/emp;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 631
    :cond_0
    return-void
.end method

.method private l()V
    .locals 4

    .line 819
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoDeviceConnectedToast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_connect_device_fail:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 821
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->G:Landroid/os/Handler;

    return-object v0
.end method

.method private m()V
    .locals 2

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->B:Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_type(I)V

    goto :goto_0

    .line 694
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_type(I)V

    .line 696
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h()V

    .line 697
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lo/env;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e:Lo/env;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    return-object v0
.end method

.method private o()Z
    .locals 2

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 809
    const/4 v0, 0x1

    return v0

    .line 811
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private p()V
    .locals 5

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    if-nez v0, :cond_0

    .line 829
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SendCommdToDevice cause null pointer!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    return-void

    .line 834
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 835
    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    if-nez v0, :cond_2

    .line 836
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    iget v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    if-ne v0, v1, :cond_1

    .line 837
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_no_disturb_time_cannot_be_same:I

    invoke-static {p0, v0}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 839
    return-void

    .line 841
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    iget v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_start_time(I)V

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    iget v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_end_time(I)V

    .line 845
    :cond_2
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendCommdToDevice() mDataDeviceAvoidDisturbInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    new-instance v4, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$3;

    invoke-direct {v4, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$3;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/enz;->c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 857
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->i()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->I:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->H:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->L:I

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public e(I)V
    .locals 10

    .line 700
    const-string v5, ""

    .line 701
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 702
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 703
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 704
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_seat_long_starttime:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 705
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    div-int/lit8 v0, v0, 0x64

    const/16 v1, 0xa

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 706
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    rem-int/lit8 v0, v0, 0x64

    const/16 v1, 0xc

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 707
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->D:I

    div-int/lit8 v0, v0, 0x64

    const/16 v1, 0xb

    invoke-virtual {v7, v1, v0}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 709
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_seat_long_endtime:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 710
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    div-int/lit8 v0, v0, 0x64

    const/16 v1, 0xa

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 711
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    rem-int/lit8 v0, v0, 0x64

    const/16 v1, 0xc

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 712
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->j:I

    div-int/lit8 v0, v0, 0x64

    const/16 v1, 0xb

    invoke-virtual {v7, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 716
    :goto_0
    new-instance v0, Lo/fey$c;

    invoke-direct {v0, p0}, Lo/fey$c;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)V

    .line 717
    invoke-virtual {v0, v1}, Lo/fey$c;->c(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$8;-><init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    .line 736
    invoke-virtual {v0, v1}, Lo/fey$c;->d(Lo/fey$b;)Lo/fey$c;

    move-result-object v0

    .line 743
    const/16 v1, 0xa

    invoke-virtual {v6, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v2, 0xc

    invoke-virtual {v6, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    .line 744
    invoke-static {v3}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v3

    const/16 v4, 0x9

    invoke-virtual {v7, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 743
    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fey$c;->d(IIZI)Lo/fey$c;

    move-result-object v0

    .line 745
    invoke-virtual {v0, v5}, Lo/fey$c;->a(Ljava/lang/String;)Lo/fey$c;

    move-result-object v8

    .line 746
    invoke-virtual {v8}, Lo/fey$c;->b()Lo/fey;

    move-result-object v9

    .line 747
    invoke-virtual {v9}, Lo/fey;->show()V

    .line 748
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 653
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 657
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 658
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_scheduled_layout:I

    if-ne v4, v0, :cond_1

    .line 659
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device_settings_nodisturb_scheduled_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h:Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_time_switch(I)V

    goto :goto_0

    .line 663
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_time_switch(I)V

    .line 665
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h()V

    goto/16 :goto_2

    .line 666
    :cond_1
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_layout:I

    if-ne v4, v0, :cond_3

    .line 667
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device_settings_nodisturb_start_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g:Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_switch(I)V

    goto :goto_1

    .line 671
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d:Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->setDevice_avoid_disturb_switch(I)V

    .line 673
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h()V

    goto :goto_2

    .line 674
    :cond_3
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_start_time_layout:I

    if-ne v4, v0, :cond_4

    .line 675
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(I)V

    goto :goto_2

    .line 676
    :cond_4
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_nodisturb_end_time_layout:I

    if-ne v4, v0, :cond_5

    .line 677
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(I)V

    goto :goto_2

    .line 678
    :cond_5
    sget v0, Lcom/huawei/ui/device/R$id;->device_settings_disturb_up_layout:I

    if-ne v4, v0, :cond_6

    .line 679
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m()V

    goto :goto_2

    .line 681
    :cond_6
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 685
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 687
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 261
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 262
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_nodisturb:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->setContentView(I)V

    .line 264
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->O:Lo/eoa;

    .line 267
    sget v0, Lcom/huawei/ui/device/R$id;->setting_device_notification_only_wearable:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->N:Landroid/widget/RelativeLayout;

    .line 268
    sget v0, Lcom/huawei/ui/device/R$id;->content_only_wearable:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->J:Landroid/widget/TextView;

    .line 269
    sget v0, Lcom/huawei/ui/device/R$id;->switch_button_notification_only_wearable:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->O:Lo/eoa;

    invoke-virtual {v1}, Lo/eoa;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->Q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 273
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e()V

    .line 274
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 189
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 192
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 194
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->setResult(ILandroid/content/Intent;)V

    .line 195
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 300
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->O:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isWearPushEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    goto :goto_0

    .line 306
    :cond_0
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isWearPushEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->M:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 310
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->F:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->N:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->N:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 315
    :goto_1
    return-void
.end method
