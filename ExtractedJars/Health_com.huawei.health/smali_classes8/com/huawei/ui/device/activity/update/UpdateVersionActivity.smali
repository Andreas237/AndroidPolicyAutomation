.class public Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;
    }
.end annotation


# instance fields
.field private A:Lo/eom;

.field private B:I

.field private C:Z

.field private D:Landroid/widget/TextView;

.field private E:Lo/egv;

.field private F:Lo/egv;

.field private G:Lo/egv;

.field private H:Z

.field private I:Ljava/lang/String;

.field private J:Landroid/content/BroadcastReceiver;

.field private final K:Landroid/content/BroadcastReceiver;

.field private a:Landroid/widget/RelativeLayout;

.field private b:Lo/emr;

.field private c:Landroid/content/Context;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/TextView;

.field private j:Z

.field private k:Lo/egd;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Lo/eob;

.field private w:Landroid/content/BroadcastReceiver;

.field private x:Lo/egv;

.field private y:Landroid/widget/TextView;

.field private z:Lo/enu;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->w:Landroid/content/BroadcastReceiver;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->x:Lo/egv;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    .line 105
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->j:Z

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    .line 113
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    .line 120
    new-instance v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$4;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    .line 1110
    new-instance v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$11;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->K:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/BroadcastReceiver;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 413
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initUpdate()  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x0

    iput v1, v0, Lo/enu;->c:I

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/enu;->b(Z)V

    goto :goto_0

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/eob;->o:I

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eob;->e(Z)V

    .line 422
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g()V

    .line 423
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->r()V

    .line 424
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 807
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForNoNetwork! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 810
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 812
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 813
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 817
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Z)Z
    .locals 0

    .line 77
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->j:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    return-object p1
.end method

.method private b()V
    .locals 5

    .line 351
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterDeviceOtaActivity():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 354
    const-string v0, "isAw70"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 356
    return-void
.end method

.method private b(IILjava/lang/String;Landroid/content/Intent;)V
    .locals 5

    .line 143
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_2

    .line 144
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 146
    :pswitch_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_START: mAw70UpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    goto/16 :goto_1

    .line 149
    :pswitch_1
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_FAILED: mAw70UpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 151
    const-string v4, ""

    .line 152
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 153
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No New Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l()V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->k()V

    .line 156
    goto/16 :goto_1

    .line 158
    :cond_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Ljava/lang/String;I)V

    .line 160
    goto/16 :goto_1

    .line 163
    :pswitch_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAw70UpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u52a8\u6d88\u606f\u4e2d\u5fc3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->b(Ljava/lang/Boolean;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iput p2, v0, Lo/enu;->e:I

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    int-to-long v2, p2

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->k:Ljava/lang/String;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iput-object p3, v0, Lo/enu;->i:Ljava/lang/String;

    .line 169
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v3, v3, Lo/enu;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    .line 171
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->e(Ljava/lang/Boolean;)V

    .line 172
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    if-eqz v0, :cond_1

    .line 173
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, p3}, Lo/dpa;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    :cond_1
    const-string v0, "minAppCode"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    .line 176
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check success! isForced:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " minCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    goto/16 :goto_1

    .line 179
    :goto_0
    goto/16 :goto_1

    .line 182
    :cond_2
    packed-switch p1, :pswitch_data_1

    goto/16 :goto_1

    .line 184
    :pswitch_3
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_START: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    goto/16 :goto_1

    .line 187
    :pswitch_4
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_FAILED: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 189
    const-string v4, ""

    .line 190
    const/4 v0, 0x0

    if-ne v0, p2, :cond_3

    .line 191
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No New Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l()V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->u()V

    .line 194
    goto/16 :goto_1

    .line 196
    :cond_3
    invoke-direct {p0, v4, p2}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Ljava/lang/String;I)V

    .line 198
    goto/16 :goto_1

    .line 201
    :pswitch_5
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u52a8\u6d88\u606f\u4e2d\u5fc3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eob;->b(Ljava/lang/Boolean;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iput p2, v0, Lo/eob;->e:I

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    int-to-long v2, p2

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->a:Ljava/lang/String;

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iput-object p3, v0, Lo/eob;->d:Ljava/lang/String;

    .line 207
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v3, v3, Lo/eob;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    .line 209
    const-string v0, "minAppCode"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    .line 210
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check success! isForced:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " minCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/Boolean;)V

    .line 212
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    if-eqz v0, :cond_4

    .line 213
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, p3}, Lo/dpb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    :cond_4
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Landroid/content/Intent;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Landroid/content/Intent;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 894
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg(): tipText = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 896
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 897
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(I)V

    .line 898
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 899
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 900
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 904
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 905
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 909
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_3

    .line 910
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 912
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_check_version_failed_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 913
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 914
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 916
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 918
    :goto_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg() mUpdateStatus :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/enu;->c:I

    goto/16 :goto_2

    .line 921
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 923
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_check_version_failed_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 924
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 925
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 927
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 929
    :goto_1
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg() mUpdateStatus :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/eob;->o:I

    .line 933
    :goto_2
    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 3

    .line 331
    const-string v2, ""

    .line 332
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 334
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 335
    goto :goto_1

    .line 337
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 338
    goto :goto_1

    .line 340
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 341
    goto :goto_1

    .line 343
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 346
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 499
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    sget v0, Lcom/huawei/ui/device/R$id;->center_ota_download:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eom;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eom;->setVisibility(I)V

    .line 502
    sget v0, Lcom/huawei/ui/device/R$id;->update_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b:Lo/emr;

    .line 503
    sget v0, Lcom/huawei/ui/device/R$id;->image_check_logo:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    .line 504
    sget v0, Lcom/huawei/ui/device/R$id;->rele_circle_download:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a:Landroid/widget/RelativeLayout;

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 506
    sget v0, Lcom/huawei/ui/device/R$id;->text_percent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d:Landroid/widget/TextView;

    .line 507
    sget v0, Lcom/huawei/ui/device/R$id;->text_per_sign:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->i:Landroid/widget/TextView;

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->i:Landroid/widget/TextView;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 510
    sget v0, Lcom/huawei/ui/device/R$id;->text_circle_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g:Landroid/widget/TextView;

    .line 511
    sget v0, Lcom/huawei/ui/device/R$id;->rela_failed:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h:Landroid/widget/LinearLayout;

    .line 512
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 515
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_version_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    .line 516
    sget v0, Lcom/huawei/ui/device/R$id;->lin_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 518
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o:Landroid/widget/TextView;

    .line 519
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->p:Landroid/widget/TextView;

    .line 520
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->u:Landroid/widget/TextView;

    .line 521
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->y:Landroid/widget/TextView;

    .line 522
    sget v0, Lcom/huawei/ui/device/R$id;->lin_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->q:Landroid/widget/LinearLayout;

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 524
    sget v0, Lcom/huawei/ui/device/R$id;->imageview_line:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 526
    sget v0, Lcom/huawei/ui/device/R$id;->failed_message:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->D:Landroid/widget/TextView;

    .line 527
    sget v0, Lcom/huawei/ui/device/R$id;->rela_device_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l:Landroid/widget/RelativeLayout;

    .line 528
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->r:Landroid/widget/TextView;

    .line 529
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_num:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    .line 530
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s:Landroid/widget/TextView;

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$2;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 540
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->i()Ljava/lang/String;

    move-result-object v4

    .line 541
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current device soft version :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-nez v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 544
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v0, v0, Lo/enu;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k()V

    .line 550
    return-void
.end method

.method private d(I)V
    .locals 8

    .line 870
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showAppDownloadProgress progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_downloading:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 872
    int-to-double v0, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 873
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showAppDownloadProgress percentNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "text:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const-string v4, "[\\d]"

    sget v5, Lcom/huawei/ui/device/R$style;->percent_number_style_num:I

    sget v6, Lcom/huawei/ui/device/R$style;->percent_number_style_sign:I

    invoke-static {v3, v4, v7, v5, v6}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const-string v2, "[\\d]"

    sget v3, Lcom/huawei/ui/device/R$style;->percent_number_style_num:I

    sget v4, Lcom/huawei/ui/device/R$style;->percent_number_style_sign:I

    invoke-static {v1, v2, v7, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 875
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/eom;->e(F)V

    .line 876
    return-void
.end method

.method private d(II)V
    .locals 5

    .line 283
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 285
    :pswitch_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_PROGRESS: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_0

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x3

    iput v1, v0, Lo/eob;->o:I

    .line 289
    :cond_0
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(I)V

    .line 290
    goto/16 :goto_0

    .line 292
    :pswitch_1
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_FAILED: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const-string v4, ""

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 295
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_FAILED: result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c(I)Ljava/lang/String;

    move-result-object v4

    .line 298
    :cond_1
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    .line 299
    goto :goto_0

    .line 301
    :pswitch_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_SUCCESS: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eob;->e(Z)V

    .line 303
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n()V

    .line 304
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b()V

    .line 305
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 306
    .line 310
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Landroid/content/Intent;)V
    .locals 7

    .line 132
    const-string v0, "state"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 133
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 134
    const-string v0, "content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 135
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateAppState: state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-direct {p0, v4, v5, v6, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(IILjava/lang/String;Landroid/content/Intent;)V

    .line 137
    invoke-direct {p0, v4, v6}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e(ILjava/lang/String;)V

    .line 138
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(II)V

    .line 140
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V
    .locals 0

    .line 77
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;I)V
    .locals 2

    .line 313
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 316
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 318
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 321
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p2, :cond_2

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 324
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_unknown_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 327
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    .line 328
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 486
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    .line 488
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 490
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    .line 492
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 494
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    .line 496
    :cond_2
    return-void
.end method

.method private e(ILjava/lang/String;)V
    .locals 4

    .line 223
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 224
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 226
    :pswitch_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_START: mAw70UpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x2

    iput v1, v0, Lo/enu;->c:I

    goto/16 :goto_1

    .line 233
    :pswitch_1
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_FAILED: mAw70UpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 239
    :pswitch_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_SUCCESS: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    invoke-virtual {v1, p2}, Lo/enu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->h:Ljava/lang/String;

    .line 242
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v3, v3, Lo/enu;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o()V

    goto/16 :goto_1

    .line 247
    :goto_0
    goto/16 :goto_1

    .line 250
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 252
    :sswitch_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_START: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    iput v1, v0, Lo/eob;->o:I

    goto/16 :goto_1

    .line 258
    :sswitch_1
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_FAILED: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 264
    :sswitch_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_SUCCESS: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v1, p2}, Lo/eob;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->c:Ljava/lang/String;

    .line 267
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v3, v3, Lo/eob;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o()V

    goto :goto_1

    .line 272
    :sswitch_3
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_START: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x3

    iput v1, v0, Lo/eob;->o:I

    .line 274
    .line 280
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1e
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_3
        0x1e -> :sswitch_0
        0x1f -> :sswitch_1
        0x20 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 5

    .line 1248
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showForcedUpdateDialog deviceName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1250
    const-string v0, "deviceName"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1251
    const-string v0, "isForced"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1252
    const-string v0, "isAW70"

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1253
    const-string v0, "mac"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1255
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1256
    return-void
.end method

.method private f()V
    .locals 1

    .line 684
    new-instance v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$5;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 701
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 744
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->i()V

    .line 745
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->p()V

    .line 747
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 748
    const-string v0, "state"

    const-string v1, "device"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->is:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 750
    return-void
.end method

.method private h()V
    .locals 1

    .line 705
    new-instance v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 737
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t()V

    return-void
.end method

.method private i()V
    .locals 5

    .line 756
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForCheck! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 760
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 761
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v0, v0, Lo/enu;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 762
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 765
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->i()Ljava/lang/String;

    move-result-object v4

    .line 766
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current device soft version :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k()V

    .line 770
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 772
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->e()V

    .line 773
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 776
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 777
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 778
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 779
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_checking:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 780
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, -0xe5e5e6

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 781
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    return-object v0
.end method

.method private k()V
    .locals 9

    .line 557
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 558
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter mAw70UpdateInteractors showDeviceType() deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    invoke-virtual {v1}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v0, v0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    iput v1, v0, Lo/enu;->b:I

    .line 563
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v4, v0, Lo/enu;->b:I

    .line 564
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter mAw70UpdateInteractors productType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 565
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 566
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showDeviceType() deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v1}, Lo/eob;->l()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v0, v0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, v1, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    iput v1, v0, Lo/eob;->k:I

    .line 571
    :cond_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showDeviceType() getProductType() productType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v4, v0, Lo/eob;->k:I

    goto :goto_0

    .line 574
    :cond_3
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showDeviceType() mAw70UpdateInteractors=null or mUpdateInteractors=null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    const/4 v4, -0x1

    .line 578
    :goto_0
    invoke-static {v4}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v5

    .line 579
    invoke-static {v4}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 581
    invoke-static {v4}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 582
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v7

    .line 584
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 586
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v8

    .line 587
    if-eqz v8, :cond_4

    .line 588
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    invoke-virtual {v8}, Lo/eav;->d()Lo/ean;

    move-result-object v2

    invoke-virtual {v2}, Lo/ean;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 591
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->k:I

    invoke-static {v0}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 596
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 600
    :cond_6
    :goto_1
    goto :goto_2

    .line 601
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_grus:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 603
    :goto_2
    goto :goto_3

    .line 604
    :cond_8
    invoke-virtual {v5}, Lo/ddc;->b()I

    move-result v0

    if-eqz v0, :cond_9

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v5}, Lo/ddc;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 608
    :cond_9
    :goto_3
    return-void
.end method

.method private l()V
    .locals 4

    .line 787
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForNoVersion! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, -0xe5e5e6

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_button_check_version:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_no_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 794
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 796
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/enu;->c:I

    goto :goto_0

    .line 799
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/eob;->o:I

    .line 801
    :goto_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->x()V

    return-void
.end method

.method private m()V
    .locals 4

    .line 853
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForDownload!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 856
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 858
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(I)V

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 860
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 861
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 862
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 863
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 864
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_succeed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 884
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(I)V

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 887
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 888
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 824
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 827
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_manager_update_health:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 830
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 832
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 834
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 835
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 836
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 837
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, v1, Lo/enu;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 840
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, v1, Lo/eob;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 841
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, v1, Lo/eob;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 843
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, v1, Lo/eob;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 846
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 847
    return-void
.end method

.method private p()V
    .locals 4

    .line 939
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 940
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCheckAppNewVersion: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_1

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x1

    iput v1, v0, Lo/enu;->c:I

    goto :goto_0

    .line 945
    :cond_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCheckAppNewVersion: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 946
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_1

    .line 947
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x1

    iput v1, v0, Lo/eob;->o:I

    .line 951
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->j:Z

    if-eqz v0, :cond_3

    .line 952
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_2

    .line 953
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->f()V

    goto :goto_1

    .line 955
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->e()V

    goto :goto_1

    .line 958
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    .line 960
    :goto_1
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    return v0
.end method

.method private q()V
    .locals 4

    .line 1005
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    if-nez v0, :cond_0

    .line 1006
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 1007
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_is_roaming:I

    .line 1008
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->sns_update_app_action:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$9;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1009
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$8;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1019
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1028
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    .line 1029
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1030
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->G:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1032
    :cond_0
    return-void
.end method

.method private r()V
    .locals 5

    .line 1104
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1105
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1106
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->K:Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->w:Landroid/content/BroadcastReceiver;

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->K:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 1108
    return-void
.end method

.method private s()V
    .locals 6

    .line 967
    iget v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    if-lez v0, :cond_0

    .line 968
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v4

    .line 969
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "curversioncode :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    iget v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->B:I

    if-le v0, v4, :cond_0

    .line 971
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c()V

    .line 972
    return-void

    .line 977
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_1

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v1, v1, Lo/enu;->e:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/eob;->c(J)Z

    move-result v4

    goto :goto_0

    .line 980
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v1, v1, Lo/eob;->e:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/eob;->c(J)Z

    move-result v4

    .line 982
    :goto_0
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: checkMemory = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 983
    if-nez v4, :cond_2

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_low_memory:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 986
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->k()Z

    move-result v5

    .line 987
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: wifiConnected = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 988
    if-nez v5, :cond_4

    .line 989
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 990
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->q()V

    goto :goto_1

    .line 993
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t()V

    goto :goto_1

    .line 996
    :cond_4
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->t()V

    .line 999
    :goto_1
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->y()V

    return-void
.end method

.method private t()V
    .locals 4

    .line 1090
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadAppFile: mUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m()V

    .line 1093
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_0

    .line 1094
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->g()V

    goto :goto_0

    .line 1096
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->i()V

    .line 1097
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->h()V

    .line 1099
    :goto_0
    return-void
.end method

.method private u()V
    .locals 4

    .line 1038
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    if-nez v0, :cond_0

    .line 1039
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 1040
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_ensure_exit:I

    .line 1041
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1042
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$7;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1073
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1081
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->E:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1085
    :cond_0
    return-void
.end method

.method private w()V
    .locals 5

    .line 1156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->w:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1157
    return-void

    .line 1160
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->K:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1161
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->w:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1166
    goto :goto_0

    .line 1162
    :catch_0
    move-exception v4

    .line 1163
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    goto :goto_0

    .line 1164
    :catch_1
    move-exception v4

    .line 1165
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1167
    :goto_0
    return-void
.end method

.method private x()V
    .locals 5

    .line 1169
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1170
    return-void

    .line 1173
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1177
    goto :goto_0

    .line 1175
    :catch_0
    move-exception v4

    .line 1176
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    :goto_0
    return-void
.end method

.method private y()V
    .locals 4

    .line 1237
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterUpdateActivity():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1241
    return-void
.end method


# virtual methods
.method public c()V
    .locals 6

    .line 1183
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppVersionISLow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    if-nez v0, :cond_0

    .line 1209
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_update_band_new_version_title2:I

    .line 1210
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget-object v3, v3, Lo/eob;->g:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_band_message_string:I

    .line 1211
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_new_version_to_upgrade_app:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$3;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1212
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 1222
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 1231
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    .line 1232
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1233
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->F:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1235
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .line 434
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed()  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_2

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v4, v0, Lo/enu;->c:I

    .line 438
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    const/4 v0, 0x0

    if-ne v4, v0, :cond_0

    .line 441
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 442
    :cond_0
    const/4 v0, 0x3

    if-ne v4, v0, :cond_1

    .line 443
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->u()V

    goto :goto_0

    .line 445
    :cond_1
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 447
    :goto_0
    goto :goto_1

    .line 449
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v4, v0, Lo/eob;->o:I

    .line 451
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    if-nez v4, :cond_3

    .line 454
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    goto :goto_1

    .line 455
    :cond_3
    const/4 v0, 0x3

    if-ne v4, v0, :cond_4

    .line 456
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->u()V

    goto :goto_1

    .line 458
    :cond_4
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 462
    :cond_5
    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 612
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 613
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_2

    .line 614
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    iget v3, v3, Lo/enu;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    if-ne v4, v0, :cond_4

    .line 616
    invoke-static {}, Lo/fju;->b()Ljava/lang/String;

    move-result-object v5

    .line 617
    const/4 v6, 0x0

    .line 618
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getInstance()Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/hwservicesmgr/remote/utils/LastSyncDetailTimeStampDB;->getLastTimeStamp(Ljava/lang/String;)J

    move-result-wide v7

    .line 620
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick lastSyncTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v7

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 622
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick isNeedSync "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    const/4 v6, 0x1

    .line 627
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 628
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isNeedSyncBeforeOta()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v6, :cond_1

    .line 630
    invoke-static {}, Lo/dji;->b()Lo/djg;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$c;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/djg;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 632
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->f()V

    .line 634
    :goto_0
    goto/16 :goto_1

    .line 636
    :cond_2
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v3, v3, Lo/eob;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    if-ne v4, v0, :cond_4

    .line 638
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_3

    .line 639
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdateInteractors.STATUS_INITIAL "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 641
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 642
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 644
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->g()V

    .line 646
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 647
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUpdateInteractors.STATUS_PULL_CHANGE_LOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->s()V

    .line 654
    :cond_4
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 359
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 360
    iput-object p0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    .line 361
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 365
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 366
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate null == it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 368
    return-void

    .line 370
    :cond_0
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 372
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate macAddress isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 374
    return-void

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 378
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 379
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate null == deviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 381
    return-void

    .line 384
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 385
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    .line 386
    invoke-static {}, Lo/enu;->c()Lo/enu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    goto :goto_0

    .line 388
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    .line 391
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    .line 392
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_update_version:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->setContentView(I)V

    .line 393
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d()V

    .line 394
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->z:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->a()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->H:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 396
    :cond_5
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate, device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b()V

    .line 398
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    goto :goto_1

    .line 401
    :cond_6
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->a()V

    .line 402
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 403
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->J:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v6, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 406
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 468
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 469
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->w()V

    .line 470
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->x()V

    .line 471
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e()V

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 473
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestroy updateInteractor release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->v:Lo/eob;

    .line 476
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c:Landroid/content/Context;

    .line 477
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 428
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 430
    return-void
.end method
