.class public Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;,
        Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;,
        Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;
    }
.end annotation


# static fields
.field private static final p:[Ljava/lang/String;

.field private static final s:[Ljava/lang/String;

.field private static final u:[Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/widget/Switch;

.field d:Ljava/util/concurrent/ExecutorService;

.field private e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

.field private f:Landroid/app/Dialog;

.field private g:Lo/egd;

.field private h:Lo/emp;

.field private i:Lo/egd;

.field private k:Lo/emr;

.field private l:Landroid/widget/TextView;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/din;>;"
        }
    .end annotation
.end field

.field private n:Lo/eoa;

.field private o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

.field private q:Landroid/support/v4/content/LocalBroadcastManager;

.field private r:Lhuawei/widget/HwProgressBar;

.field private t:Z

.field private v:Z

.field private w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private x:Landroid/content/BroadcastReceiver;

.field private y:Z

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 107
    const/16 v0, 0x16

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.tencent.mm"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.android.mms"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "com.huawei.intelligent"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "com.tencent.mobileqq"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "com.tencent.mqq"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "com.sina.weibo"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "com.bbk.calendar"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "com.android.calendar"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "com.google.android.calendar"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "com.android.smspush"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "com.android.providers.telephony"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "com.htc.sense.mms"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "com.google.android.apps.messaging"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "com.whatsapp"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "com.facebook.katana"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "com.twitter.android"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "com.facebook.orca"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "com.google.android.gm"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "com.netflix.mediaclient"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "jp.naver.line.android"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "com.instagram.android"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "com.snapchat.android"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->p:[Ljava/lang/String;

    .line 115
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.samsung.android.contacts"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.android.phone"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "com.android.contacts"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "com.android.dialer"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "com.google.android.dialer"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "cn.nubia.contacts"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "com.qiku.android.contacts"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->u:[Ljava/lang/String;

    .line 120
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.android.contacts"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.htc.contacts"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->s:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m:Ljava/util/List;

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->t:Z

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->v:Z

    .line 135
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->z:Ljava/lang/String;

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->y:Z

    .line 256
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 644
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$8;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->x:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    return-object v0
.end method

.method private a(Lo/din;)Lo/din;
    .locals 8

    .line 858
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 859
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 860
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.huawei.intelligent   name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 862
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.huawei.intelligent   icon = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    const-string v0, "com.huawei.intelligent"

    invoke-virtual {p1, v0}, Lo/din;->c(Ljava/lang/String;)V

    .line 864
    invoke-virtual {p1, v5}, Lo/din;->e(Ljava/lang/String;)V

    .line 865
    invoke-virtual {p1, v6}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v7

    .line 867
    invoke-virtual {p1, v7}, Lo/din;->c(I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 870
    goto :goto_0

    .line 868
    :catch_0
    move-exception v4

    .line 869
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.huawei.intelligent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    :goto_0
    return-object p1
.end method

.method private a()V
    .locals 4

    .line 209
    sget v0, Lcom/huawei/ui/device/R$id;->setting_device_applications:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h:Lo/emp;

    .line 211
    new-instance v2, Lo/ens;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lo/ens;-><init>(Landroid/content/Context;I)V

    .line 213
    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h:Lo/emp;

    invoke-virtual {v0, v3}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h:Lo/emp;

    invoke-virtual {v0, v2}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 218
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    .line 398
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->s:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 399
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 400
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 401
    const/4 v0, 0x1

    return v0

    .line 399
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 404
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(ZLjava/lang/String;Ljava/lang/String;ILo/din;)I
    .locals 6

    .line 566
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    const/16 v2, 0x2711

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p1, :cond_2

    .line 568
    const-string v0, "com.tencent.mm"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 569
    invoke-static {p2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.tencent.mobileqq"

    .line 570
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.tencent.mqq"

    .line 571
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 573
    :cond_0
    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    .line 574
    const/4 v0, 0x1

    invoke-virtual {p5, v0}, Lo/din;->c(I)V

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const/4 v1, 0x1

    invoke-virtual {v0, p3, v1}, Lo/eoa;->e(Ljava/lang/String;I)V

    .line 576
    const/4 p4, 0x1

    .line 577
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set authorizeFlag auto!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    const-string v0, "03"

    const-string v1, "NotificationOpenActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "set authorizeFlag auto!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 579
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 580
    const-string v0, "package_name"

    invoke-virtual {v5, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 581
    const-string v0, "authorized_flag"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 583
    goto :goto_0

    .line 584
    :cond_1
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already auto set authorizeFlag!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    :cond_2
    :goto_0
    return p4
.end method

.method private b()V
    .locals 4

    .line 222
    new-instance v2, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_nottification_close_remind:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 225
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 237
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$4;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 246
    invoke-virtual {v2}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 247
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 248
    invoke-virtual {v3}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 251
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->v:Z

    return p1
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 445
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 446
    const/4 v0, 0x0

    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 447
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v4}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 448
    :catch_0
    move-exception v4

    .line 449
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAppName Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const-string v0, ""

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    return-object v0
.end method

.method private c(Ljava/lang/String;Landroid/content/Context;)V
    .locals 5

    .line 957
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDialogCheckTime,time-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 961
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sp_dialog_check_time"

    invoke-static {p2, v0, v1, p1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 963
    return-void
.end method

.method private c(Ljava/lang/String;)Z
    .locals 1

    .line 436
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->p:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 4

    .line 421
    const/4 v1, 0x0

    .line 422
    const/4 v2, 0x0

    .line 424
    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_1

    .line 425
    aget-object v3, p2, v2

    .line 426
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    const/4 v1, 0x1

    .line 428
    goto :goto_1

    .line 424
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 431
    :cond_1
    :goto_1
    return v1
.end method

.method private d(Ljava/lang/String;ILo/din;)I
    .locals 6

    .line 595
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    const/16 v2, 0x2711

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 596
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    .line 597
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lo/din;->c(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/eoa;->e(Ljava/lang/String;I)V

    .line 599
    const/4 p2, 0x1

    .line 600
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set authorizeFlag auto!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    const-string v0, "03"

    const-string v1, "NotificationOpenActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "set authorizeFlag auto!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 602
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 603
    const-string v0, "package_name"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 604
    const-string v0, "authorized_flag"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 606
    goto :goto_0

    .line 607
    :cond_0
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already auto set authorizeFlag!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    :cond_1
    :goto_0
    return p2
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/Switch;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    return-object v0
.end method

.method private d(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/din;>;)Ljava/util/List<Lo/din;>;"
        }
    .end annotation

    .line 617
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 618
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 620
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 621
    const/4 v5, 0x0

    .line 622
    const/4 v6, 0x0

    :goto_1
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->p:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_1

    .line 623
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->p:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/din;

    invoke-virtual {v1}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 624
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 625
    const/4 v5, 0x1

    .line 626
    goto :goto_2

    .line 622
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 629
    :cond_1
    :goto_2
    if-nez v5, :cond_2

    .line 630
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 620
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 634
    :cond_3
    const/4 v4, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 635
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 634
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 637
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 638
    return-object v2
.end method

.method private d()V
    .locals 3

    .line 176
    sget v0, Lcom/huawei/ui/device/R$id;->switch_button_notification:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v1}, Lo/eoa;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->w:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 181
    sget v0, Lcom/huawei/ui/device/R$id;->notification_app_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b:Landroid/widget/ListView;

    .line 182
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 185
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a()V

    .line 188
    sget v0, Lcom/huawei/ui/device/R$id;->notify_load_app_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r:Lhuawei/widget/HwProgressBar;

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 193
    sget v0, Lcom/huawei/ui/device/R$id;->skip_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i:Lo/egd;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    sget v0, Lcom/huawei/ui/device/R$id;->complete_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g:Lo/egd;

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    sget v0, Lcom/huawei/ui/device/R$id;->notification_open_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k:Lo/emr;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 203
    sget v0, Lcom/huawei/ui/device/R$id;->notification_push_open_description:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->l:Landroid/widget/TextView;

    .line 205
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->t:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->r:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 380
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->e()V

    goto :goto_0

    .line 385
    :cond_0
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d()V

    .line 390
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 7

    .line 969
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 970
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dialog_show_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 972
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDialogshowTime,number-----------"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 975
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "numberIsNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 976
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dialog_show_time"

    const-string v2, "0"

    invoke-static {p1, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 979
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 981
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "numberPlusOne"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 982
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dialog_show_time"

    .line 983
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 982
    invoke-static {p1, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 985
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 1

    .line 440
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->u:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/ListView;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i:Lo/egd;

    return-object v0
.end method

.method private g()Z
    .locals 7

    .line 837
    const/4 v4, 0x1

    .line 839
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 840
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v5, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    .line 841
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Intelligent_name_is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 844
    goto :goto_0

    .line 842
    :catch_0
    move-exception v5

    .line 843
    const/4 v4, 0x0

    .line 845
    :goto_0
    if-eqz v4, :cond_0

    .line 846
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->e()Z

    move-result v4

    .line 848
    :cond_0
    return v4
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    return-object v0
.end method

.method private h()V
    .locals 8

    .line 927
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 928
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->notification_alert_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 929
    sget v0, Lcom/huawei/ui/device/R$id;->set_notification_alert_dialog_image:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 930
    sget v0, Lcom/huawei/ui/device/R$id;->set_nitification_alert_dialog_text:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 931
    sget v0, Lcom/huawei/ui/device/R$drawable;->ic_pairing_notification_alert:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 932
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_alert_dialog:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 933
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_user_permission_know:I

    new-instance v2, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$9;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 934
    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v7

    .line 946
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f:Landroid/app/Dialog;

    .line 947
    invoke-virtual {v7, v4}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 948
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 949
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 952
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g:Lo/egd;

    return-object v0
.end method

.method private i()V
    .locals 6

    .line 994
    const/4 v4, 0x1

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v5

    .line 996
    if-nez v5, :cond_0

    .line 997
    const/4 v4, 0x0

    .line 999
    :cond_0
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAuthorizeEnabled:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v3}, Lo/eoa;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",is prompt = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->z:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->z:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1001
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v1}, Lo/eoa;->c()Z

    move-result v1

    invoke-virtual {v0, v1, v4}, Lo/dip;->c(ZZ)V

    .line 1003
    :cond_1
    return-void
.end method

.method private k()V
    .locals 5

    .line 898
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_open_later:I

    new-instance v2, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$7;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 899
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$10;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 911
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 919
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_nottification_settings_remind_twice:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 920
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 921
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 922
    invoke-virtual {v4}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 923
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 925
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->t:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->v:Z

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/TextView;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Ljava/util/List;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->z:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->y:Z

    return v0
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/app/Dialog;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q:Landroid/support/v4/content/LocalBroadcastManager;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 22

    .line 458
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$1;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$1;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 464
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 465
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 466
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 468
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v9

    .line 469
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loadAllAppsByBatch----isChecked:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    new-instance v10, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 472
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v10, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 475
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "sms_default_application"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 476
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ActivityInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstalledApplications--------- defaultSms: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    const/4 v12, 0x0

    .line 480
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    .line 481
    const/4 v0, 0x0

    invoke-virtual {v13, v10, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v14

    .line 482
    new-instance v0, Landroid/content/pm/ResolveInfo$DisplayNameComparator;

    invoke-direct {v0, v13}, Landroid/content/pm/ResolveInfo$DisplayNameComparator;-><init>(Landroid/content/pm/PackageManager;)V

    invoke-static {v14, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 485
    const/4 v15, 0x0

    :goto_0
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_7

    .line 486
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    move-object/from16 v16, v1

    .line 487
    move-object/from16 v0, v16

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    move-object/from16 v17, v0

    .line 488
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 489
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 490
    goto/16 :goto_2

    .line 493
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v19

    .line 494
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ActivityInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstalledApplications--------- packageName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " Label: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isAuthorized:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    new-instance v20, Lo/din;

    invoke-direct/range {v20 .. v20}, Lo/din;-><init>()V

    .line 497
    move-object/from16 v0, v17

    invoke-static {v11, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 498
    if-eqz v12, :cond_1

    .line 499
    goto/16 :goto_2

    .line 501
    :cond_1
    const/4 v12, 0x1

    .line 502
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/din;->c(Ljava/lang/String;)V

    .line 503
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_short_message:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->e(Ljava/lang/String;)V

    .line 505
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->notification_icon_sms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 506
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 507
    goto/16 :goto_2

    .line 509
    :cond_3
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/din;->c(Ljava/lang/String;)V

    .line 510
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/din;->e(Ljava/lang/String;)V

    .line 511
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Landroid/content/pm/ActivityInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    .line 513
    :goto_1
    move-object/from16 v0, p0

    move v1, v9

    move-object v2, v11

    move-object/from16 v3, v17

    move/from16 v4, v19

    move-object/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b(ZLjava/lang/String;Ljava/lang/String;ILo/din;)I

    move-result v19

    .line 515
    const/4 v0, 0x1

    move/from16 v1, v19

    if-ne v0, v1, :cond_4

    .line 516
    move-object/from16 v0, v20

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/din;->c(I)V

    .line 517
    move-object/from16 v0, v20

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 519
    :cond_4
    move-object/from16 v0, v20

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/din;->c(I)V

    .line 520
    const/16 v21, 0x0

    .line 521
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 522
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "package need filter: pkgName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    goto :goto_2

    .line 524
    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 525
    move-object/from16 v0, v20

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 527
    :cond_6
    move-object/from16 v0, v20

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 533
    :cond_7
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 534
    new-instance v15, Lo/din;

    invoke-direct {v15}, Lo/din;-><init>()V

    .line 535
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    .line 536
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "com.huawei.intelligent"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const-string v2, "com.huawei.intelligent"

    invoke-virtual {v1, v2}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1, v15}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d(Ljava/lang/String;ILo/din;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 537
    :cond_9
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Lo/din;)Lo/din;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 538
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 539
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Lo/din;)Lo/din;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    :cond_b
    :goto_3
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 544
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 545
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    goto :goto_4

    .line 546
    :catch_0
    move-exception v16

    .line 547
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ArrayIndexOutOfBoundsException e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    :goto_4
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 552
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 553
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 555
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$3;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 562
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1008
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 880
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i:Lo/egd;

    invoke-virtual {v1}, Lo/egd;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 882
    invoke-static {}, Lo/dpk;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Ljava/lang/String;Landroid/content/Context;)V

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Landroid/content/Context;)V

    .line 885
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k()V

    .line 887
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g:Lo/egd;

    invoke-virtual {v1}, Lo/egd;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 888
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h()V

    .line 890
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 146
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 147
    sget v0, Lcom/huawei/ui/device/R$layout;->notification_open_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->setContentView(I)V

    .line 148
    iput-object p0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    .line 149
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 150
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 151
    const-string v0, "device_id"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->z:Ljava/lang/String;

    .line 152
    const-string v0, "isFromWear"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->y:Z

    .line 154
    :cond_0
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->q:Landroid/support/v4/content/LocalBroadcastManager;

    .line 158
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    .line 159
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d()V

    .line 161
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d:Ljava/util/concurrent/ExecutorService;

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$c;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 164
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 165
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 166
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 167
    const-string v0, "package"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 169
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 668
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 670
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 672
    return-void

    .line 674
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 676
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->removeMessages(I)V

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 679
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 312
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume() mNotificationSwitch : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    invoke-virtual {v3}, Landroid/widget/Switch;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    const-string v0, "03"

    const-string v1, "NotificationOpenActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onResume() mNotificationSwitch : isChecked = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    invoke-virtual {v4}, Landroid/widget/Switch;->isChecked()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNotificationAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 319
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->n:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 322
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->t:Z

    if-nez v0, :cond_2

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->e()V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 328
    :cond_1
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->o:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d()V

    .line 332
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->b()V

    .line 334
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i()V

    .line 336
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 661
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStop()  mNotificationSwitch : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c:Landroid/widget/Switch;

    invoke-virtual {v3}, Landroid/widget/Switch;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 663
    return-void
.end method
