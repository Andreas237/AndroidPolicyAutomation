.class public Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;,
        Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;,
        Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;
    }
.end annotation


# static fields
.field private static final l:[Ljava/lang/String;

.field private static final m:[Ljava/lang/String;

.field private static final o:[Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/Switch;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/content/Context;

.field private d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

.field e:Ljava/util/concurrent/ExecutorService;

.field private f:Lo/emp;

.field private g:Landroid/widget/LinearLayout;

.field private h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

.field private i:Lo/eoa;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/din;>;"
        }
    .end annotation
.end field

.field private n:Lhuawei/widget/HwProgressBar;

.field private p:Landroid/support/v4/content/LocalBroadcastManager;

.field private q:Ljava/lang/String;

.field private r:Landroid/widget/TextView;

.field private s:Z

.field private t:Z

.field private u:Z

.field private y:Landroid/content/BroadcastReceiver;

.field private z:Landroid/widget/CompoundButton$OnCheckedChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 101
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

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->m:[Ljava/lang/String;

    .line 109
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

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->o:[Ljava/lang/String;

    .line 114
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.android.contacts"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.htc.contacts"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->l:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k:Ljava/util/List;

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->u:Z

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->t:Z

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->s:Z

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->q:Ljava/lang/String;

    .line 252
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->z:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 658
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$8;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->y:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/din;>;)Ljava/util/List<Lo/din;>;"
        }
    .end annotation

    .line 631
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 632
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 634
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 635
    const/4 v5, 0x0

    .line 636
    const/4 v6, 0x0

    :goto_1
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->m:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_1

    .line 637
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->m:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/din;

    invoke-virtual {v1}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 638
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    const/4 v5, 0x1

    .line 640
    goto :goto_2

    .line 636
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 643
    :cond_1
    :goto_2
    if-nez v5, :cond_2

    .line 644
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 634
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 648
    :cond_3
    const/4 v4, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 649
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 648
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 651
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 652
    return-object v2
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 193
    sget v0, Lcom/huawei/ui/device/R$id;->setting_device_applications:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f:Lo/emp;

    .line 195
    new-instance v2, Lo/ens;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lo/ens;-><init>(Landroid/content/Context;I)V

    .line 197
    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f:Lo/emp;

    invoke-virtual {v0, v3}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f:Lo/emp;

    invoke-virtual {v0, v2}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 202
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    .line 412
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->l:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 413
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 414
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    const/4 v0, 0x1

    return v0

    .line 413
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 418
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/lang/String;ILo/din;)I
    .locals 6

    .line 609
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    const/16 v2, 0x2711

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 610
    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    .line 611
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lo/din;->c(I)V

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/eoa;->e(Ljava/lang/String;I)V

    .line 613
    const/4 p2, 0x1

    .line 614
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set authorizeFlag auto!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    const-string v0, "03"

    const-string v1, "NotificationSettingActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "set authorizeFlag auto!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 616
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 617
    const-string v0, "package_name"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 618
    const-string v0, "authorized_flag"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->p:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 620
    goto :goto_0

    .line 621
    :cond_0
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already auto set authorizeFlag!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :cond_1
    :goto_0
    return p2
.end method

.method private b(ZLjava/lang/String;Ljava/lang/String;ILo/din;)I
    .locals 6

    .line 580
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

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

    .line 582
    const-string v0, "com.tencent.mm"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 583
    invoke-static {p2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.tencent.mobileqq"

    .line 584
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.tencent.mqq"

    .line 585
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 587
    :cond_0
    const/4 v0, 0x1

    if-eq p4, v0, :cond_1

    .line 588
    const/4 v0, 0x1

    invoke-virtual {p5, v0}, Lo/din;->c(I)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const/4 v1, 0x1

    invoke-virtual {v0, p3, v1}, Lo/eoa;->e(Ljava/lang/String;I)V

    .line 590
    const/4 p4, 0x1

    .line 591
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set authorizeFlag auto!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    const-string v0, "03"

    const-string v1, "NotificationSettingActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "set authorizeFlag auto!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 593
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 594
    const-string v0, "package_name"

    invoke-virtual {v5, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 595
    const-string v0, "authorized_flag"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->p:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 597
    goto :goto_0

    .line 598
    :cond_1
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already auto set authorizeFlag!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    :cond_2
    :goto_0
    return p4
.end method

.method private b()V
    .locals 4

    .line 218
    new-instance v2, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_nottification_close_remind:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 221
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 233
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$1;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 242
    invoke-virtual {v2}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 243
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 244
    invoke-virtual {v3}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 245
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 247
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k()V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .line 454
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->o:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 4

    .line 435
    const/4 v1, 0x0

    .line 436
    const/4 v2, 0x0

    .line 438
    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_1

    .line 439
    aget-object v3, p2, v2

    .line 440
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 441
    const/4 v1, 0x1

    .line 442
    goto :goto_1

    .line 438
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 445
    :cond_1
    :goto_1
    return v1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    return-object v0
.end method

.method private c(Lo/din;)Lo/din;
    .locals 8

    .line 871
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 872
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 873
    const-string v0, "NotificationSettingActivity"

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

    .line 874
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 875
    const-string v0, "NotificationSettingActivity"

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

    .line 876
    const-string v0, "com.huawei.intelligent"

    invoke-virtual {p1, v0}, Lo/din;->c(Ljava/lang/String;)V

    .line 877
    invoke-virtual {p1, v5}, Lo/din;->e(Ljava/lang/String;)V

    .line 878
    invoke-virtual {p1, v6}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    .line 879
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v7

    .line 880
    invoke-virtual {p1, v7}, Lo/din;->c(I)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 883
    goto :goto_0

    .line 881
    :catch_0
    move-exception v4

    .line 882
    const-string v0, "NotificationSettingActivity"

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

    .line 884
    :goto_0
    return-object p1
.end method

.method private c()V
    .locals 3

    .line 206
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 207
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 208
    const-string v0, "isFromDialog"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->s:Z

    .line 209
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->s:Z

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 214
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 459
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 460
    const/4 v0, 0x0

    invoke-virtual {v4, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 461
    iget-object v0, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v0, v4}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 462
    :catch_0
    move-exception v4

    .line 463
    const-string v0, "NotificationSettingActivity"

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

    .line 465
    const-string v0, ""

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Z)Z
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->t:Z

    return p1
.end method

.method private d(Ljava/lang/String;)Z
    .locals 1

    .line 450
    sget-object v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->m:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/Switch;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 164
    sget v0, Lcom/huawei/ui/device/R$id;->switch_button_notification:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v1}, Lo/eoa;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->z:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 169
    sget v0, Lcom/huawei/ui/device/R$id;->notification_error_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    sget v0, Lcom/huawei/ui/device/R$id;->notification_app_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b:Landroid/widget/ListView;

    .line 174
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 177
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a()V

    .line 180
    sget v0, Lcom/huawei/ui/device/R$id;->notify_load_app_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->n:Lhuawei/widget/HwProgressBar;

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->n:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->n:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 188
    sget v0, Lcom/huawei/ui/device/R$id;->notification_push_open_description:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->r:Landroid/widget/TextView;

    .line 189
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Z)Z
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->u:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->n:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 396
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->e()V

    goto :goto_0

    .line 400
    :cond_0
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->c()V

    .line 404
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->r:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/ListView;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method private i()Z
    .locals 7

    .line 850
    const/4 v4, 0x1

    .line 852
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 853
    const-string v0, "com.huawei.intelligent"

    const/16 v1, 0x80

    invoke-virtual {v5, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    .line 854
    const-string v0, "NotificationSettingActivity"

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

    .line 857
    goto :goto_0

    .line 855
    :catch_0
    move-exception v5

    .line 856
    const/4 v4, 0x0

    .line 858
    :goto_0
    if-eqz v4, :cond_0

    .line 859
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->e()Z

    move-result v4

    .line 861
    :cond_0
    return v4
.end method

.method private k()V
    .locals 6

    .line 914
    const/4 v4, 0x1

    .line 915
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v5

    .line 916
    if-nez v5, :cond_0

    .line 917
    const/4 v4, 0x0

    .line 919
    :cond_0
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reportStatusToMidware,is auth ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v3}, Lo/eoa;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->q:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->q:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 921
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v1}, Lo/eoa;->c()Z

    move-result v1

    invoke-virtual {v0, v1, v4}, Lo/dip;->c(ZZ)V

    .line 924
    :cond_1
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->u:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Ljava/util/List;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->t:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->p:Landroid/support/v4/content/LocalBroadcastManager;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->q:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 22

    .line 472
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$3;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$3;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 478
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 479
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 480
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v9

    .line 483
    const-string v0, "NotificationSettingActivity"

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

    .line 485
    new-instance v10, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 486
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v10, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 489
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "sms_default_application"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 490
    const-string v0, "NotificationSettingActivity"

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

    .line 492
    const/4 v12, 0x0

    .line 494
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    .line 495
    const/4 v0, 0x0

    invoke-virtual {v13, v10, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v14

    .line 496
    new-instance v0, Landroid/content/pm/ResolveInfo$DisplayNameComparator;

    invoke-direct {v0, v13}, Landroid/content/pm/ResolveInfo$DisplayNameComparator;-><init>(Landroid/content/pm/PackageManager;)V

    invoke-static {v14, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 499
    const/4 v15, 0x0

    :goto_0
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_7

    .line 500
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v1, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    move-object/from16 v16, v1

    .line 501
    move-object/from16 v0, v16

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    move-object/from16 v17, v0

    .line 502
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 503
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    goto/16 :goto_2

    .line 507
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v19

    .line 508
    const-string v0, "NotificationSettingActivity"

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

    .line 509
    new-instance v20, Lo/din;

    invoke-direct/range {v20 .. v20}, Lo/din;-><init>()V

    .line 511
    move-object/from16 v0, v17

    invoke-static {v11, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 512
    if-eqz v12, :cond_1

    .line 513
    goto/16 :goto_2

    .line 515
    :cond_1
    const/4 v12, 0x1

    .line 516
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/din;->c(Ljava/lang/String;)V

    .line 517
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_short_message:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->e(Ljava/lang/String;)V

    .line 519
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->notification_icon_sms:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 520
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 521
    goto/16 :goto_2

    .line 523
    :cond_3
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/din;->c(Ljava/lang/String;)V

    .line 524
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lo/din;->e(Ljava/lang/String;)V

    .line 525
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Landroid/content/pm/ActivityInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lo/din;->d(Landroid/graphics/drawable/Drawable;)V

    .line 527
    :goto_1
    move-object/from16 v0, p0

    move v1, v9

    move-object v2, v11

    move-object/from16 v3, v17

    move/from16 v4, v19

    move-object/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(ZLjava/lang/String;Ljava/lang/String;ILo/din;)I

    move-result v19

    .line 529
    const/4 v0, 0x1

    move/from16 v1, v19

    if-ne v0, v1, :cond_4

    .line 530
    move-object/from16 v0, v20

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/din;->c(I)V

    .line 531
    move-object/from16 v0, v20

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 533
    :cond_4
    move-object/from16 v0, v20

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/din;->c(I)V

    .line 534
    const/16 v21, 0x0

    .line 535
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 536
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "package need filter: pkgName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v17, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    goto :goto_2

    .line 538
    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 539
    move-object/from16 v0, v20

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 541
    :cond_6
    move-object/from16 v0, v20

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    :goto_2
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 547
    :cond_7
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 548
    new-instance v15, Lo/din;

    invoke-direct {v15}, Lo/din;-><init>()V

    .line 549
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    .line 550
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "com.huawei.intelligent"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const-string v2, "com.huawei.intelligent"

    invoke-virtual {v1, v2}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1, v15}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Ljava/lang/String;ILo/din;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    .line 551
    :cond_9
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c(Lo/din;)Lo/din;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 552
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 553
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c(Lo/din;)Lo/din;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    :cond_b
    :goto_3
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 558
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 559
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 562
    goto :goto_4

    .line 560
    :catch_0
    move-exception v16

    .line 561
    const-string v0, "NotificationSettingActivity"

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

    .line 565
    :goto_4
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 566
    invoke-interface {v7}, Ljava/util/List;->clear()V

    .line 567
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 569
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 576
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 888
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/device/R$id;->notification_error_layout:I

    if-ne v0, v1, :cond_1

    .line 890
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 891
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    sget-object v0, Lo/dae;->iV:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 893
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 895
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 896
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 897
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    const-string v1, "https://resourcephs1.vmall.com/Android_Note_zh/EMUI8.0/C001B001/zh-CN/index.html"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 899
    :cond_0
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    const-string v1, "https://resourcephs2.vmall.com/handbook/Android_Note_en/EMUI8.0/C001B001/en-US/index.html"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 901
    :goto_0
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 902
    invoke-virtual {p0, v5}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 904
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 135
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 136
    sget v0, Lcom/huawei/ui/device/R$layout;->notification_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->setContentView(I)V

    .line 137
    iput-object p0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    .line 138
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 139
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 140
    const-string v0, "device_id"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->q:Ljava/lang/String;

    .line 142
    :cond_0
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->p:Landroid/support/v4/content/LocalBroadcastManager;

    .line 146
    new-instance v0, Lo/eoa;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoa;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    .line 147
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e()V

    .line 149
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e:Ljava/util/concurrent/ExecutorService;

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 152
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 153
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 154
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 155
    const-string v0, "package"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 157
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 681
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 682
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 684
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 685
    return-void

    .line 687
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->removeMessages(I)V

    .line 691
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 692
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 303
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume() mNotificationSwitch : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    invoke-virtual {v3}, Landroid/widget/Switch;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const-string v0, "03"

    const-string v1, "NotificationSettingActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onResume() mNotificationSwitch : isChecked = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

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

    .line 305
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 309
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c()V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i:Lo/eoa;

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->r:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 315
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->u:Z

    if-nez v0, :cond_2

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->e()V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 321
    :cond_1
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->r:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->c()V

    .line 328
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    invoke-virtual {v0}, Lo/dip;->b()V

    .line 331
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k()V

    .line 332
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 675
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStop()  mNotificationSwitch : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a:Landroid/widget/Switch;

    invoke-virtual {v3}, Landroid/widget/Switch;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 677
    return-void
.end method
