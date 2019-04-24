.class public Lcom/huawei/sim/multisim/MultiSimConfigActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;
    }
.end annotation


# static fields
.field private static K:[Ljava/lang/String;


# instance fields
.field private A:Lo/ecx;

.field B:Ljava/lang/String;

.field C:Landroid/view/View$OnClickListener;

.field D:Ljava/lang/String;

.field private E:I

.field private F:I

.field private G:Landroid/view/View;

.field private H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private L:Landroid/view/View;

.field private M:Ljava/lang/String;

.field private N:I

.field private O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field private Q:Lo/egn;

.field private final R:Landroid/content/BroadcastReceiver;

.field private S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

.field private T:Lo/egw;

.field private U:Lo/egv;

.field private V:Landroid/view/animation/Animation;

.field private W:Z

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/graphics/drawable/AnimationDrawable;

.field a:Landroid/widget/LinearLayout;

.field private aa:Ljava/lang/String;

.field private final ac:I

.field b:Landroid/widget/LinearLayout;

.field c:Landroid/widget/LinearLayout;

.field d:Lo/dsa;

.field public e:Landroid/content/Context;

.field f:Landroid/widget/LinearLayout;

.field g:Landroid/widget/LinearLayout;

.field h:Landroid/widget/LinearLayout;

.field i:Landroid/widget/LinearLayout;

.field j:Z

.field k:Landroid/widget/LinearLayout;

.field l:Landroid/widget/LinearLayout;

.field m:Landroid/widget/TextView;

.field n:Landroid/widget/LinearLayout;

.field o:Landroid/widget/LinearLayout;

.field p:Landroid/widget/LinearLayout;

.field q:Landroid/widget/Button;

.field r:Landroid/widget/Button;

.field s:Landroid/widget/Button;

.field t:Landroid/widget/Button;

.field u:Landroid/widget/Button;

.field v:Landroid/view/View$OnClickListener;

.field w:Lo/egd;

.field x:Landroid/widget/Button;

.field y:Lo/egd;

.field z:Lo/egd;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 218
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.CALL_PHONE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CALL_LOG"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.PROCESS_OUTGOING_CALLS"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->K:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 121
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    .line 129
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    .line 215
    const-string v0, "http://health.vmall.com/help/huawei-watch2/app8.0/zh-CN/zh-cn_bookmap_0047655720.html?pos=3"

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->M:Ljava/lang/String;

    .line 216
    const-string v0, "IS_ESIM_START_FIRST"

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->J:Ljava/lang/String;

    .line 230
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 232
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    .line 234
    new-instance v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 322
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->R:Landroid/content/BroadcastReceiver;

    .line 421
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$7;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->v:Landroid/view/View$OnClickListener;

    .line 434
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->C:Landroid/view/View$OnClickListener;

    .line 447
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->O:Ljava/lang/String;

    .line 453
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->P:Ljava/lang/String;

    .line 912
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    .line 949
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j:Z

    .line 1411
    const-string v0, "https://health.vmall.com/help/huawei-watch2/errorcode/index.html"

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->B:Ljava/lang/String;

    .line 1412
    const-string v0, "https://health.vmall.com/help/huawei-watch2/app8.0/zh-CN/content/doub.html?pos=3"

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->D:Ljava/lang/String;

    .line 1710
    const v0, 0x1d4c0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->ac:I

    .line 1711
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    return-void
.end method

.method private A()V
    .locals 9

    .line 1587
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMultiSim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1589
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a()Ljava/lang/String;

    move-result-object v4

    .line 1590
    invoke-static {v4}, Lo/edr;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1591
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "main sim not cmcc"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1593
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_main_discovery_tab_service_help:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1594
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_sim_only_support_china_mobile:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1595
    const/4 v0, 0x1

    new-array v7, v0, [I

    .line 1596
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v7, v1

    .line 1597
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1598
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    const/4 v1, 0x0

    aget v1, v7, v1

    const/4 v2, 0x0

    aget v2, v7, v2

    .line 1617
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1598
    const/16 v3, 0x21

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1618
    invoke-direct {p0, v8}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Landroid/text/SpannableString;)V

    .line 1619
    return-void

    .line 1621
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1622
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EID of watch is not correct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1623
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_sim_eid_not_correct:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Ljava/lang/String;)V

    .line 1624
    return-void

    .line 1626
    :cond_1
    new-instance v5, Lo/edq;

    invoke-direct {v5}, Lo/edq;-><init>()V

    .line 1627
    invoke-virtual {v5, v4}, Lo/edq;->a(Ljava/lang/String;)V

    .line 1629
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H()I

    move-result v1

    int-to-long v1, v1

    const/16 v3, 0x9

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessageDelayed(IJ)Z

    .line 1630
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f()V

    .line 1632
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openMultiSim "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " secd"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(I)Lo/edt;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1633
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1634
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    .line 1635
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(I)Lo/edt;

    move-result-object v1

    .line 1634
    invoke-virtual {v0, v5, v1, v6}, Lo/dsa;->b(Lo/dqv;Lo/dqt;Landroid/os/Message;)V

    .line 1637
    return-void
.end method

.method private B()V
    .locals 5

    .line 1415
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMultiSimErrerDetailActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1416
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1417
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1419
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1420
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openAppHelpActivity url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1421
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->D:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 1423
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openAppHelpActivity url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->B:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1424
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->B:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1426
    :goto_0
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1427
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1429
    :cond_1
    return-void
.end method

.method private C()V
    .locals 2

    .line 1564
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1565
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->removeMessages(I)V

    .line 1567
    :cond_0
    return-void
.end method

.method private D()V
    .locals 9

    .line 1529
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimConfigFailView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1531
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1532
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1533
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutConfigFail VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1534
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_fail_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1536
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail_general_blue_link:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1537
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_sim_eid_config_fail:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1538
    const/4 v0, 0x1

    new-array v7, v0, [I

    .line 1539
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v7, v1

    .line 1540
    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1541
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$4;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    const/4 v1, 0x0

    aget v1, v7, v1

    const/4 v2, 0x0

    aget v2, v7, v2

    .line 1553
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1541
    const/16 v3, 0x21

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1555
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1556
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1557
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1560
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1561
    return-void
.end method

.method private E()V
    .locals 6

    .line 1658
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMultiSimStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1660
    new-instance v4, Lo/edq;

    invoke-direct {v4}, Lo/edq;-><init>()V

    .line 1662
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edq;->a(Ljava/lang/String;)V

    .line 1663
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H()I

    move-result v1

    int-to-long v1, v1

    const/16 v3, 0x9

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessageDelayed(IJ)Z

    .line 1664
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 1665
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    .line 1666
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(I)Lo/edt;

    move-result-object v1

    .line 1665
    invoke-virtual {v0, v4, v1, v5}, Lo/dsa;->d(Lo/dqv;Lo/dqt;Landroid/os/Message;)V

    .line 1668
    return-void
.end method

.method private F()V
    .locals 6

    .line 1649
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMultiSimAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1650
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j:Z

    .line 1651
    new-instance v4, Lo/eds;

    const/4 v0, 0x3

    invoke-direct {v4, v0}, Lo/eds;-><init>(I)V

    .line 1652
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/eds;->a(Ljava/lang/String;)V

    .line 1653
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 1654
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v1, v4, v5}, Lo/dsa;->e(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z

    .line 1655
    return-void
.end method

.method private H()I
    .locals 5

    .line 1687
    const/16 v4, 0x7530

    .line 1688
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationTimeout "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1690
    return v4
.end method

.method private a(Ljava/util/ArrayList;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/drb;>;)I"
        }
    .end annotation

    .line 656
    const/4 v4, 0x0

    .line 658
    if-nez p1, :cond_0

    .line 659
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurBindStatus  pairedDeviceList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    return v4

    .line 663
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurBindStatus devInfo.getEID="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getEID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/drb;

    .line 666
    invoke-virtual {v6}, Lo/drb;->a()Ljava/lang/String;

    move-result-object v7

    .line 667
    invoke-virtual {v6}, Lo/drb;->b()Ljava/lang/String;

    move-result-object v8

    .line 668
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurBindStatus eid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, " iccid="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getEID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 670
    const/4 v4, 0x4

    .line 671
    invoke-virtual {v6}, Lo/drb;->e()Ljava/lang/String;

    move-result-object v9

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LPA:1$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    .line 673
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 674
    const-string v0, "LPA:1$esim.yhdzd.chinamobile.com:8015$"

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    .line 676
    :cond_1
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CMCC_AC_CODE=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=dp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getSimInfoList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/multisimservice/model/SimInfo;

    .line 678
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurBindStatus sim iccid="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lcom/huawei/multisimservice/model/SimInfo;->getICCID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    invoke-virtual {v11}, Lcom/huawei/multisimservice/model/SimInfo;->getICCID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 680
    const/4 v4, 0x1

    .line 682
    goto :goto_2

    .line 684
    :cond_2
    goto :goto_1

    .line 686
    :cond_3
    :goto_2
    goto/16 :goto_0

    .line 690
    :cond_4
    return v4
.end method

.method static synthetic a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 0

    .line 106
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    return-object p1
.end method

.method private a(I)Lo/edt;
    .locals 2

    .line 1575
    new-instance v1, Lo/edt;

    invoke-direct {v1}, Lo/edt;-><init>()V

    .line 1578
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lo/edt;->e(I)V

    .line 1579
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getEID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/edt;->c(Ljava/lang/String;)V

    .line 1580
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getProductName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/edt;->b(Ljava/lang/String;)V

    .line 1581
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getDeviceSerialNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/edt;->e(Ljava/lang/String;)V

    .line 1582
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getDeviceIMEI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/edt;->d(Ljava/lang/String;)V

    .line 1583
    return-object v1
.end method

.method private a(Landroid/text/SpannableString;)V
    .locals 5

    .line 562
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$layout;->layout_esim_dialog_text:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 563
    sget v0, Lcom/huawei/sim/R$id;->esim_tips_content:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->X:Landroid/widget/TextView;

    .line 564
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->X:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 565
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->X:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->X:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 567
    new-instance v4, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 568
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_note:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 569
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_known:I

    .line 570
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 579
    invoke-virtual {v4}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->T:Lo/egw;

    .line 580
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->T:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 581
    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(I)V

    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 11

    .line 1432
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimOperationFailView errCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1435
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1436
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1437
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1438
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpenError VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1439
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1440
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 1442
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1443
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1444
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1447
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail_general_blue_link:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1448
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail_general_info:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1449
    const/4 v0, 0x1

    new-array v9, v0, [I

    .line 1450
    invoke-virtual {v8, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v9, v1

    .line 1451
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1452
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$2;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    const/4 v1, 0x0

    aget v1, v9, v1

    const/4 v2, 0x0

    aget v2, v9, v2

    .line 1464
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1452
    const/16 v3, 0x21

    invoke-virtual {v10, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1466
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1467
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1468
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1469
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1357
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimOperationFailView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1360
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1361
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1362
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1363
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpenError VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1364
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1365
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1367
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1368
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1369
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1402
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1403
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1404
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1406
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1409
    :goto_0
    return-void
.end method

.method private a(Lo/dra;)V
    .locals 6

    .line 722
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j()V

    .line 725
    if-nez p1, :cond_0

    .line 726
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_result_query_fail:I

    .line 728
    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 727
    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    return-void

    .line 731
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  action = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  reason = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v0

    if-eqz v0, :cond_1

    .line 736
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x5dc

    if-eq v0, v1, :cond_1

    .line 737
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x5dd

    if-eq v0, v1, :cond_1

    .line 738
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x5de

    if-ne v0, v1, :cond_4

    .line 739
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(Lo/dra;)I

    move-result v4

    .line 741
    invoke-virtual {p1}, Lo/dra;->c()Lo/drw;

    move-result-object v5

    .line 742
    invoke-virtual {v5}, Lo/drw;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->O:Ljava/lang/String;

    .line 743
    invoke-virtual {v5}, Lo/drw;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->P:Ljava/lang/String;

    .line 746
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet status="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mgrURL="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->O:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mgrPostData="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->P:Ljava/lang/String;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 749
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y()V

    goto :goto_0

    .line 750
    :cond_2
    const/4 v0, 0x4

    if-ne v4, v0, :cond_3

    .line 751
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e()V

    goto :goto_0

    .line 757
    :cond_3
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->v()V

    .line 760
    :goto_0
    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 761
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operation is processing and do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 766
    :cond_5
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_server_error:I

    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Z
    .locals 2

    .line 1186
    if-eqz p1, :cond_0

    .line 1187
    invoke-virtual {p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getEID()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1188
    invoke-virtual {p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getEID()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1189
    const/4 v0, 0x1

    return v0

    .line 1192
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 339
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 340
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 341
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 342
    const-string v0, "android.intent.action.SIM_STATE_CHANGED"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->R:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 344
    return-void
.end method

.method private b(I)V
    .locals 1

    .line 834
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    .line 835
    invoke-virtual {v0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 836
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    invoke-virtual {v0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->removeMessages(I)V

    .line 838
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lo/dra;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lo/dra;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 584
    new-instance v2, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_note:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 586
    invoke-virtual {v2, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 587
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_known:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimConfigActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$15;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 596
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->U:Lo/egv;

    .line 597
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->U:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 598
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->U:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 599
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->U:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 601
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1504
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimWaitingView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1506
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1507
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1508
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1509
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1510
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutWaiting VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1511
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_waiting_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1512
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_waiting_info_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1513
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1514
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1515
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1516
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1519
    :cond_0
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_waiting_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 1520
    invoke-virtual {v6}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    .line 1521
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 1523
    return-void
.end method

.method private b(Lo/dra;)V
    .locals 5

    .line 605
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshOpenMultiSimRet "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j()V

    .line 608
    if-nez p1, :cond_0

    .line 609
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshOpenMultiSimRet  ret is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_result_query_fail_notic:I

    .line 611
    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 610
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    return-void

    .line 616
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshOpenMultiSimRet ret  action = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshOpenMultiSimRet ret  result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshOpenMultiSimRet ret  reason = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v0

    if-nez v0, :cond_1

    .line 623
    invoke-virtual {p1}, Lo/dra;->c()Lo/drw;

    move-result-object v4

    .line 625
    invoke-virtual {v4}, Lo/drw;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/drw;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WS"

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    goto/16 :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/dra;->d()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 628
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operation is processing and do nothing "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 630
    :cond_2
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x3ec

    if-ne v0, v1, :cond_3

    .line 633
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_server_error:I

    .line 634
    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 633
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 635
    :cond_3
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    if-nez v0, :cond_4

    .line 636
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_result_query_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_result_query_fail_notic:I

    .line 637
    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 636
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 638
    :cond_4
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x7d7

    if-ne v0, v1, :cond_5

    .line 639
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_unsupport_sim_card:I

    .line 640
    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 639
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 641
    :cond_5
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 642
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_server_error:I

    .line 643
    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 642
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 645
    :cond_6
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 646
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v1

    .line 645
    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;I)V

    .line 649
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)Ljava/lang/String;
    .locals 1

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lo/egv;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->U:Lo/egv;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 772
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshMultiSimAuthRet ret"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_1

    .line 775
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    if-nez v0, :cond_0

    .line 776
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A()V

    goto :goto_0

    .line 778
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E()V

    goto :goto_0

    .line 780
    :cond_1
    const/16 v0, 0x62

    if-ne p1, v0, :cond_2

    .line 781
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_network_disconnect2:I

    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 782
    :cond_2
    const/16 v0, 0x193

    if-ne p1, v0, :cond_3

    .line 783
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x193

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(Ljava/lang/String;I)V

    goto :goto_0

    .line 785
    :cond_3
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x63

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(Ljava/lang/String;I)V

    .line 787
    :goto_0
    return-void
.end method

.method private c(Landroid/widget/Button;)V
    .locals 2

    .line 1220
    if-eqz p1, :cond_0

    .line 1221
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 1222
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 1223
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setFocusable(Z)V

    .line 1225
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_main_btn_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 1227
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1475
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimOpenQeuryFailView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1477
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1478
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1479
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1480
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1481
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutQueryError VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1482
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_query_error_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1483
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_query_error_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1485
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1486
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1487
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1490
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1491
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1492
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1495
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1496
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1696
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMultiSimWebView type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const-string v2, " url="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string v2, " postData="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1698
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1699
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMultiSimWebView url null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1700
    return-void

    .line 1702
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o()V

    .line 1703
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/multisim/MultiSimWebView;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1704
    const-string v0, "url"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1705
    const-string v0, "post_data"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1706
    const-string v0, "req_type"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1707
    const/4 v0, 0x0

    invoke-virtual {p0, v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1708
    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)I
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    return p1
.end method

.method private d(Landroid/widget/Button;)V
    .locals 2

    .line 1210
    if-eqz p1, :cond_0

    .line 1211
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 1212
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setClickable(Z)V

    .line 1213
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setFocusable(Z)V

    .line 1215
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_main_btn_disable_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    .line 1217
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lo/dra;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lo/dra;)V

    return-void
.end method

.method private d(I)Z
    .locals 1

    .line 1673
    const/16 v0, 0x63

    if-ne p1, v0, :cond_0

    .line 1674
    const/4 v0, 0x1

    return v0

    .line 1676
    :cond_0
    const/16 v0, 0x12c

    if-lt p1, v0, :cond_1

    const/16 v0, 0x257

    if-gt p1, v0, :cond_1

    .line 1678
    const/4 v0, 0x1

    return v0

    .line 1680
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Z
    .locals 1

    .line 106
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Z

    move-result v0

    return v0
.end method

.method private e(Lo/dra;)I
    .locals 8

    .line 694
    const/4 v4, 0x2

    .line 695
    invoke-virtual {p1}, Lo/dra;->a()Lo/dqy;

    move-result-object v5

    .line 697
    if-nez v5, :cond_0

    .line 698
    const/4 v4, 0x2

    goto :goto_1

    .line 699
    :cond_0
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x5de

    if-ne v0, v1, :cond_1

    .line 700
    const/4 v4, 0x0

    goto :goto_1

    .line 701
    :cond_1
    invoke-virtual {p1}, Lo/dra;->b()I

    move-result v0

    const/16 v1, 0x7d8

    if-ne v0, v1, :cond_2

    .line 702
    const/4 v4, 0x4

    goto :goto_1

    .line 706
    :cond_2
    invoke-virtual {v5}, Lo/dqy;->b()Ljava/util/ArrayList;

    move-result-object v6

    .line 708
    invoke-virtual {v5}, Lo/dqy;->e()Lo/drg;

    move-result-object v7

    .line 709
    if-eqz v7, :cond_3

    .line 710
    invoke-virtual {v7}, Lo/drg;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    .line 711
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  serviceInfo phoneNum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 713
    :cond_3
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshQeuryMultiSimRet ret  PrimaryDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 715
    :goto_0
    invoke-direct {p0, v6}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/util/ArrayList;)I

    move-result v4

    .line 718
    :goto_1
    return v4
.end method

.method private e(I)Ljava/lang/String;
    .locals 2

    .line 790
    const-string v1, ""

    .line 791
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 792
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_unbind_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 793
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 794
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_query_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 795
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 796
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_verify_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 798
    :cond_2
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 800
    :goto_0
    return-object v1
.end method

.method static synthetic e(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lo/egw;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->T:Lo/egw;

    return-object v0
.end method

.method private e(Ljava/lang/String;I)V
    .locals 10

    .line 1310
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimOperationFailView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1312
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1313
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1314
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1315
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1316
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpenError VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1317
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1318
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_error_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1320
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1321
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1322
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1324
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail_general_blue_link:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1326
    const/16 v0, 0x193

    if-ne v0, p2, :cond_1

    .line 1327
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_network_no_volte:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 1329
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_fail_auth:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1331
    :goto_0
    const/4 v0, 0x1

    new-array v8, v0, [I

    .line 1332
    invoke-virtual {v7, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 1333
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1334
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$14;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$14;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    const/4 v1, 0x0

    aget v1, v8, v1

    const/4 v2, 0x0

    aget v2, v8, v2

    .line 1346
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1334
    const/16 v3, 0x21

    invoke-virtual {v9, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1348
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1349
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1350
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1352
    return-void
.end method

.method static synthetic f(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    return v0
.end method

.method private f()V
    .locals 4

    .line 530
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 531
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "21 no dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    .line 533
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_handling:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    goto :goto_0

    .line 536
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog have dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    :goto_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 348
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter unregisterNonLocalBroadcast()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->R:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 354
    goto :goto_0

    .line 350
    :catch_0
    move-exception v4

    .line 351
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    goto :goto_0

    .line 352
    :catch_1
    move-exception v4

    .line 353
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F()V

    return-void
.end method

.method private h()V
    .locals 4

    .line 361
    sget v0, Lcom/huawei/sim/R$layout;->activity_multi_sim_config:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->setContentView(I)V

    .line 362
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_open:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b:Landroid/widget/LinearLayout;

    .line 363
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpen findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_open_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    .line 365
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpenError findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_query_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    .line 367
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutQueryError findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_unbind:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    .line 369
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutUnbind findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    .line 371
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutConfigFail findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    .line 373
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutWaiting findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k:Landroid/widget/LinearLayout;

    .line 375
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutConfirm findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    .line 377
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutStart findViewById ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_open_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->w:Lo/egd;

    .line 382
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->w:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_unbind_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->z:Lo/egd;

    .line 384
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->z:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 386
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_open:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u:Landroid/widget/Button;

    .line 387
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 388
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q:Landroid/widget/Button;

    .line 389
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 392
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_btn_requery:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->s:Landroid/widget/Button;

    .line 393
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->s:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_btn_unbind:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r:Landroid/widget/Button;

    .line 395
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_btn_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->t:Landroid/widget/Button;

    .line 397
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->t:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_config_btn_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y:Lo/egd;

    .line 399
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 401
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_download:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->x:Landroid/widget/Button;

    .line 402
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->x:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 405
    sget v0, Lcom/huawei/sim/R$id;->network_error_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p:Landroid/widget/LinearLayout;

    .line 406
    sget v0, Lcom/huawei/sim/R$id;->no_sim_err_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n:Landroid/widget/LinearLayout;

    .line 407
    sget v0, Lcom/huawei/sim/R$id;->bt_disconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o:Landroid/widget/LinearLayout;

    .line 408
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l:Landroid/widget/LinearLayout;

    .line 410
    sget v0, Lcom/huawei/sim/R$id;->network_err_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m:Landroid/widget/TextView;

    .line 411
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 413
    sget v0, Lcom/huawei/sim/R$id;->set_bt_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->G:Landroid/view/View;

    .line 414
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->G:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->v:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 415
    sget v0, Lcom/huawei/sim/R$id;->set_network_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->L:Landroid/view/View;

    .line 416
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->L:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->C:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 419
    return-void
.end method

.method static synthetic h(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->S:Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    return-object v0
.end method

.method private i()Ljava/lang/String;
    .locals 1

    .line 450
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->O:Ljava/lang/String;

    return-object v0
.end method

.method private j()V
    .locals 4

    .line 1570
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rmNotifyMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1571
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->C()V

    .line 1572
    return-void
.end method

.method private k()Ljava/lang/String;
    .locals 1

    .line 456
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->P:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->D()V

    return-void
.end method

.method private l()V
    .locals 5

    .line 968
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceStateInteractors.getInstance().getSystemBluetoothSwitchState()  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->z()V

    .line 971
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurConnectStatus=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 972
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 974
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m()Z

    move-result v0

    if-nez v0, :cond_4

    .line 976
    :cond_0
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m()Z

    move-result v0

    if-nez v0, :cond_2

    .line 977
    :cond_1
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_query_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_bt_disconnect:I

    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 979
    :cond_2
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 980
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_query_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_network_disconnect:I

    invoke-virtual {p0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 983
    :cond_3
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q()V

    .line 984
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u()V

    .line 985
    return-void

    .line 989
    :cond_4
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCurConnectStatus=StartCurrentView="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 990
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a()Ljava/lang/String;

    move-result-object v4

    .line 991
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    if-nez v0, :cond_5

    .line 992
    invoke-static {v4}, Lo/edr;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 993
    :cond_5
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->v()V

    goto :goto_0

    .line 995
    :cond_6
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_querying:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 996
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    invoke-interface {v0, v1}, Lo/ecx;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1022
    :goto_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->z()V

    .line 1024
    return-void
.end method

.method static synthetic m(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E()V

    return-void
.end method

.method private m()Z
    .locals 6

    .line 952
    const/4 v4, 0x0

    .line 955
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->p()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 959
    goto :goto_0

    .line 956
    :catch_0
    move-exception v5

    .line 957
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemBluetoothSwitchState RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 958
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 960
    :goto_0
    return v4
.end method

.method private n()V
    .locals 4

    .line 917
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 918
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpen GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 919
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 920
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutOpenError GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 922
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutQueryError GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 924
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutUnbind GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 925
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 926
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutConfigFail GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 928
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 929
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 932
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutWaiting GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 933
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 934
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutConfirm GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 939
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutStart GONE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 941
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o()V

    .line 942
    return-void
.end method

.method private o()V
    .locals 4

    .line 541
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 543
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissdialog!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 545
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 546
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Q:Lo/egn;

    .line 549
    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->B()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->M:Ljava/lang/String;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 1030
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1031
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1032
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1033
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1034
    return-void
.end method

.method private q()V
    .locals 5

    .line 1038
    const-string v0, "setViewStatusBar status:"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1041
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1042
    goto :goto_1

    .line 1044
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1045
    goto :goto_1

    .line 1047
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1048
    goto :goto_1

    .line 1050
    :pswitch_3
    sget v0, Lcom/huawei/sim/R$id;->no_sim_err_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 1051
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_error_dev_no_sim:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1052
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1053
    goto :goto_1

    .line 1055
    :goto_0
    const-string v0, "setViewStatusBar ok"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1058
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private r()V
    .locals 4

    .line 1114
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshViewStatus  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1115
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p()V

    .line 1117
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 1122
    :cond_0
    return-void

    .line 1125
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->z()V

    .line 1127
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q()V

    .line 1130
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u()V

    .line 1131
    return-void
.end method

.method private s()Z
    .locals 5

    .line 1138
    const/4 v4, 0x3

    .line 1140
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1141
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    const/4 v4, 0x3

    goto :goto_0

    .line 1145
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v4

    .line 1147
    :goto_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "btStatus=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 1149
    const/4 v0, 0x1

    return v0

    .line 1151
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private t()Z
    .locals 5

    .line 1156
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 1157
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 1159
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 1160
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 1163
    :cond_0
    const-string v0, "getSimStatus simStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private u()V
    .locals 1

    .line 1066
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    if-nez v0, :cond_0

    .line 1067
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1069
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Landroid/widget/Button;)V

    .line 1070
    goto/16 :goto_1

    .line 1072
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->s:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Landroid/widget/Button;)V

    .line 1073
    goto/16 :goto_1

    .line 1075
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Landroid/widget/Button;)V

    .line 1076
    goto/16 :goto_1

    .line 1078
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Landroid/widget/Button;)V

    .line 1079
    goto/16 :goto_1

    .line 1081
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->t:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Landroid/widget/Button;)V

    .line 1082
    goto :goto_1

    .line 1084
    :goto_0
    :pswitch_5
    goto :goto_1

    .line 1087
    :cond_0
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    packed-switch v0, :pswitch_data_1

    goto :goto_1

    .line 1089
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->u:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Landroid/widget/Button;)V

    .line 1090
    goto :goto_1

    .line 1092
    :pswitch_7
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->s:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Landroid/widget/Button;)V

    .line 1093
    goto :goto_1

    .line 1095
    :pswitch_8
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Landroid/widget/Button;)V

    .line 1096
    goto :goto_1

    .line 1098
    :pswitch_9
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Landroid/widget/Button;)V

    .line 1099
    goto :goto_1

    .line 1101
    :pswitch_a
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->t:Landroid/widget/Button;

    invoke-direct {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Landroid/widget/Button;)V

    .line 1102
    .line 1107
    :goto_1
    :pswitch_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_8
        :pswitch_b
        :pswitch_b
        :pswitch_7
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private v()V
    .locals 15

    .line 1260
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimStartView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1262
    const/16 v0, 0x9

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1263
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1264
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1265
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutStart VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1266
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1267
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_start_tip_tip1:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 1268
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_start_tip_tip2:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 1269
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_start_tip_tip3:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 1270
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_start_tip_tip4:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 1272
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_note_no1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 1273
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1272
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1275
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_note_no3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 1276
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1275
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1279
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_touch_query:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 1280
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_note_no2:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 1281
    const-wide/high16 v3, 0x4008000000000000L    # 3.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v11, v2, v3

    .line 1280
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 1282
    const/4 v0, 0x1

    new-array v13, v0, [I

    .line 1283
    invoke-virtual {v12, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 1284
    new-instance v0, Landroid/text/SpannableString;

    move-object v1, v12

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v14, v0

    .line 1285
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    const/4 v1, 0x0

    aget v1, v13, v1

    const/4 v2, 0x0

    aget v2, v13, v2

    .line 1297
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1285
    const/16 v3, 0x21

    invoke-virtual {v14, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1299
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1300
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1302
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_note_no4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 1303
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1302
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1304
    return-void
.end method

.method private w()Ljava/lang/String;
    .locals 1

    .line 1234
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1235
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    .line 1237
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->I:Ljava/lang/String;

    return-object v0
.end method

.method private x()Z
    .locals 8

    .line 1169
    const/4 v4, 0x0

    .line 1171
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 1172
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v6

    .line 1173
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v7

    .line 1175
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1176
    const/4 v4, 0x0

    goto :goto_0

    .line 1178
    :cond_0
    const/4 v4, 0x1

    .line 1180
    :goto_0
    const-string v0, "getNetWorkStatus networkStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    return v4
.end method

.method private y()V
    .locals 6

    .line 1244
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMultiSimUnbindView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1246
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->N:I

    .line 1247
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->n()V

    .line 1248
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1249
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mLayoutUnbind VISIBLE ID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1251
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 1253
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->w()Ljava/lang/String;

    move-result-object v4

    .line 1255
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_unbind_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1256
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_unbind_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1257
    return-void
.end method

.method private z()V
    .locals 1

    .line 1196
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->t()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1197
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    goto :goto_0

    .line 1198
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->x()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1199
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    goto :goto_0

    .line 1202
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1203
    :cond_2
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    goto :goto_0

    .line 1205
    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E:I

    .line 1207
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 5

    .line 1641
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/telephony/SubscriptionManager;->from(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultDataSubscriptionId()I

    move-result v2

    .line 1642
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    const-string v1, "phone"

    .line 1643
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    .line 1644
    invoke-virtual {v3, v2}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v4

    .line 1645
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 4

    .line 237
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSDK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    new-instance v0, Lo/dsa;

    invoke-direct {v0}, Lo/dsa;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    .line 240
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dsa;->b(Landroid/content/Context;)V

    .line 241
    return-void
.end method

.method public d()V
    .locals 4

    .line 244
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unInitSDK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d:Lo/dsa;

    invoke-virtual {v0}, Lo/dsa;->c()V

    .line 248
    :cond_0
    return-void
.end method

.method e()V
    .locals 4

    .line 1713
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downLoadEsimProfile  isDownload ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1716
    iget-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    if-eqz v0, :cond_0

    .line 1718
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y()V

    .line 1719
    return-void

    .line 1721
    :cond_0
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_device_esim_download:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1722
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    .line 1723
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CMCC_AC_CODE ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1724
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/16 v1, 0x10

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessageDelayed(IJ)Z

    .line 1725
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->aa:Ljava/lang/String;

    new-instance v2, Lcom/huawei/sim/multisim/MultiSimConfigActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$3;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    new-instance v3, Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;

    invoke-direct {v3, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    invoke-interface {v0, v1, v2, v3}, Lo/ecx;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1741
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1746
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onActivityResult(): requestCode= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " resultCode="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1748
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 1749
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    .line 1750
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onActivityResult(): download profile=isDownload="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->W:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1752
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l()V

    .line 1753
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1754
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 461
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_open:I

    if-ne v0, v1, :cond_0

    .line 465
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 466
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick multi_sim_cinfig_btn_open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iN:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 470
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    .line 471
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ES"

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_download:I

    if-ne v0, v1, :cond_1

    .line 473
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick multi_sim_cinfig_btn_download download profile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    const-string v1, "LPA:1$esim.yhdzd.chinamobile.com:8015$"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/ecx;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_0

    .line 475
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_cinfig_btn_start:I

    if-ne v0, v1, :cond_2

    .line 477
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick multi_sim_cinfig_btn_start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "MultiSimConfigActivity"

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->J:Ljava/lang/String;

    const-string v3, "hasclicked"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 482
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 483
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iL:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 486
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A()V

    .line 488
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    .line 490
    goto/16 :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_config_btn_requery:I

    if-ne v0, v1, :cond_3

    .line 491
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->E()V

    goto/16 :goto_0

    .line 492
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_config_btn_unbind:I

    if-ne v0, v1, :cond_4

    .line 494
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 495
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iM:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 496
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ES"

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_config_btn_fail:I

    if-ne v0, v1, :cond_5

    .line 500
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y()V

    goto :goto_0

    .line 501
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_config_btn_confirm:I

    if-ne v0, v1, :cond_7

    .line 502
    iget v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->F:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 503
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->y()V

    goto :goto_0

    .line 505
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->finish()V

    goto :goto_0

    .line 507
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->network_err_text:I

    if-ne v0, v1, :cond_8

    .line 508
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessageDelayed(IJ)Z

    .line 509
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p()V

    .line 510
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 511
    sget v0, Lcom/huawei/sim/R$anim;->bt_connecting:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->V:Landroid/view/animation/Animation;

    .line 513
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 514
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->V:Landroid/view/animation/Animation;

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 524
    :cond_8
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 252
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 254
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iput-object p0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    .line 257
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    .line 258
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 259
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    return-void

    .line 262
    :cond_0
    new-instance v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    .line 263
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h()V

    .line 264
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c()V

    .line 267
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l()V

    .line 271
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b()V

    .line 275
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget-object v1, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->K:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 276
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no permission need to request"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    sget-object v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->K:[Ljava/lang/String;

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimConfigActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$5;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    invoke-static {p0, v0, v1}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 289
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 308
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 309
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d()V

    .line 311
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j()V

    .line 312
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->H:Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 316
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->Y:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 319
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g()V

    .line 320
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 293
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 294
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 295
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    return-void

    .line 298
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "MultiSimConfigActivity"

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->J:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 299
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sharedPreference=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 301
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->q:Landroid/widget/Button;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_continue:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 303
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->r()V

    .line 304
    return-void
.end method
