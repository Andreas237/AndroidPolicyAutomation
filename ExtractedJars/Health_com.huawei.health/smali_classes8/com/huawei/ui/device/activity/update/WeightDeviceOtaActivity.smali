.class public Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;
    }
.end annotation


# static fields
.field private static z:I


# instance fields
.field private A:Z

.field private B:Ljava/lang/String;

.field private C:Z

.field private D:Ljava/io/File;

.field private F:Z

.field private H:Lo/ahi$e;

.field a:Lo/abx;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Lo/egd;

.field private j:Z

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/ImageView;

.field private u:Lo/eof;

.field private v:Lo/eom;

.field private w:Landroid/os/PowerManager$WakeLock;

.field private x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

.field private y:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 113
    const/16 v0, 0x32

    sput v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->y:Landroid/content/BroadcastReceiver;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    .line 119
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->j:Z

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->A:Z

    .line 231
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$3;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->H:Lo/ahi$e;

    .line 278
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a:Lo/abx;

    return-void
.end method

.method private a()V
    .locals 3

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_upgrading_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->t:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->r:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 466
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(I)V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 473
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    if-eqz v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/Boolean;)V

    .line 615
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState percentage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 619
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 620
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 621
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileTransferState percentage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 623
    goto :goto_0

    .line 625
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOtaInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->g()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/lang/String;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z
    .locals 0

    .line 70
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->A:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Landroid/content/Context;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/io/File;)Ljava/io/File;
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->D:Ljava/io/File;

    return-object p1
.end method

.method private b()V
    .locals 8

    .line 340
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 341
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 342
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v5

    .line 344
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acq;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v6

    .line 345
    if-nez v6, :cond_0

    .line 346
    return-void

    .line 349
    :cond_0
    invoke-virtual {v6}, Lo/afx;->e()Lo/afv;

    move-result-object v7

    .line 350
    if-eqz v7, :cond_1

    if-eqz v5, :cond_1

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a:Lo/abx;

    invoke-virtual {v7, v5, v0, v4}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    goto :goto_0

    .line 353
    :cond_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConnectedStatus() control or device is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 6

    .line 479
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showBandProgress progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_upgrading_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 481
    int-to-double v0, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    const-string v2, "[\\d]"

    sget v3, Lcom/huawei/ui/device/R$style;->percent_number_style_num:I

    sget v4, Lcom/huawei/ui/device/R$style;->percent_number_style_sign:I

    invoke-static {v1, v2, v5, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->v:Lo/eom;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/eom;->e(F)V

    .line 484
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Ljava/io/File;Landroid/content/Intent;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Ljava/io/File;Landroid/content/Intent;)V

    return-void
.end method

.method private b(Ljava/io/File;Landroid/content/Intent;)V
    .locals 7

    .line 567
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    .line 568
    new-instance v5, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 569
    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    .line 571
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 572
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SCALE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    const-string v0, "scalePath"

    invoke-virtual {p2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 575
    :cond_0
    const-string v0, "blePath"

    invoke-virtual {p2, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 580
    :cond_1
    :goto_0
    goto :goto_1

    .line 578
    :catch_0
    move-exception v4

    .line 579
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "canonicalPath "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    :goto_1
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 10

    .line 361
    const/4 v4, 0x0

    .line 362
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 363
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 364
    return v4

    .line 366
    :cond_0
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    .line 367
    return v4

    .line 369
    :cond_1
    invoke-virtual {v5}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v6

    .line 370
    if-nez v6, :cond_2

    .line 371
    return v4

    .line 373
    :cond_2
    const/4 v7, 0x0

    .line 375
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_6

    .line 376
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 377
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 379
    :cond_3
    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 381
    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 382
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v9

    .line 383
    if-nez v9, :cond_4

    .line 384
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "temp.delete() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 387
    :cond_4
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 388
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Ljava/lang/String;)Z

    .line 389
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Ljava/lang/String;)V

    .line 390
    const/4 v4, 0x1

    .line 375
    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 393
    :cond_6
    return v4
.end method

.method private c()V
    .locals 3

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/16 v1, 0xc

    iput v1, v0, Lo/eof;->f:I

    .line 265
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(I)V

    .line 266
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->j:Z

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 268
    const/4 v0, 0x5

    iput v0, v2, Landroid/os/Message;->what:I

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->D:Ljava/io/File;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->m()V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->D:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Ljava/lang/String;)Z

    .line 275
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 652
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onFileRespond: checkResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 655
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v3}, Lo/eof;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 658
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOtaInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 661
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceUpgradeCallback, i != 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 663
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 664
    const/16 v0, 0x3ea

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 669
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d(I)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 7

    .line 397
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(Ljava/lang/String;)Z

    .line 398
    move-object v4, p1

    .line 399
    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    .line 400
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 401
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v6

    .line 403
    if-nez v6, :cond_0

    .line 404
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myFilePath.delete() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Z
    .locals 1

    .line 70
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->j:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z
    .locals 0

    .line 70
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->F:Z

    return p1
.end method

.method private d()V
    .locals 6

    .line 413
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    sget v0, Lcom/huawei/ui/device/R$id;->center_ota_circle:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eom;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->v:Lo/eom;

    .line 415
    sget v0, Lcom/huawei/ui/device/R$id;->rele_percent_ota:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d:Landroid/widget/RelativeLayout;

    .line 416
    sget v0, Lcom/huawei/ui/device/R$id;->text_percent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e:Landroid/widget/TextView;

    .line 417
    sget v0, Lcom/huawei/ui/device/R$id;->text_per_sign:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c:Landroid/widget/TextView;

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c:Landroid/widget/TextView;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 420
    sget v0, Lcom/huawei/ui/device/R$id;->text_circle_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->g:Landroid/widget/TextView;

    .line 421
    sget v0, Lcom/huawei/ui/device/R$id;->rela_ota_failed:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f:Landroid/widget/LinearLayout;

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 423
    sget v0, Lcom/huawei/ui/device/R$id;->text_ota_failed:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->h:Landroid/widget/TextView;

    .line 424
    sget v0, Lcom/huawei/ui/device/R$id;->rela_device_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->l:Landroid/widget/RelativeLayout;

    .line 425
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_num:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->p:Landroid/widget/TextView;

    .line 426
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->m:Landroid/widget/TextView;

    .line 428
    sget v0, Lcom/huawei/ui/device/R$id;->lin_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k:Landroid/widget/LinearLayout;

    .line 429
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->o:Landroid/widget/TextView;

    .line 430
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    .line 431
    sget v0, Lcom/huawei/ui/device/R$id;->imageview_line:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->t:Landroid/widget/ImageView;

    .line 432
    sget v0, Lcom/huawei/ui/device/R$id;->lin_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->r:Landroid/widget/LinearLayout;

    .line 433
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->q:Landroid/widget/TextView;

    .line 434
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->s:Landroid/widget/TextView;

    .line 435
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 437
    sget v0, Lcom/huawei/ui/device/R$id;->update_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/emr;

    .line 438
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$2;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    invoke-virtual {v5, v0}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_transfer_details:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v3, v3, Lo/eof;->i:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, v1, Lo/eof;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, v1, Lo/eof;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, v1, Lo/eof;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    const/16 v0, 0x1e

    sput v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    .line 451
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "battertPercent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a()V

    .line 453
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 630
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onUpgradeFailed: onUpgradeFailed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorMessage = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 633
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is transfering :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v3}, Lo/eof;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 636
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOtaInteractors is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 641
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 642
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 643
    const/4 v0, 0x4

    if-ne v0, p1, :cond_1

    .line 644
    const/16 v0, 0x14

    sput v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    .line 645
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5355\u677f\u5347\u7ea7\u7535\u91cf\u95e8\u9650\u503c\u4e3a\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 649
    :cond_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c()V

    return-void
.end method

.method static synthetic e()I
    .locals 1

    .line 70
    sget v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->z:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(I)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 491
    const-string v0, "LoginActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showOtaErrorMsg() error, contentText = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 492
    return-void

    .line 494
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->j:Z

    .line 495
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 500
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 507
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->h()V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->a(Ljava/lang/Boolean;)V

    .line 509
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Ljava/io/File;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->D:Ljava/io/File;

    return-object v0
.end method

.method private f()V
    .locals 8

    .line 516
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->A:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->F:Z

    if-eqz v0, :cond_0

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 520
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceInfo = :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->k()Ljava/lang/String;

    move-result-object v5

    .line 522
    const/4 v6, 0x0

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->h()Ljava/lang/String;

    move-result-object v7

    .line 524
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() updateMode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile() filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->j:Z

    .line 530
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$4;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v7, v1, v2, v3}, Lo/afn;->d(Ljava/lang/String;Ljava/lang/String;Lo/aff;Z)V

    .line 559
    goto :goto_0

    .line 560
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scale device not wake up"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    const v0, 0x19648

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d(I)V

    .line 563
    :goto_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->t:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 591
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b(I)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_social_clearup_storage_button_finish:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_band_transfer_finish:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    const/high16 v1, -0x4e000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_finish:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v3, v3, Lo/eof;->i:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/16 v1, 0xe

    iput v1, v0, Lo/eof;->f:I

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_finish:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v3, v3, Lo/eof;->i:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 606
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->h()V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->n()V

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->a(Ljava/lang/Boolean;)V

    .line 610
    return-void
.end method

.method private h()V
    .locals 4

    .line 793
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 794
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upgradeDone, release wacklock."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 795
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 796
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    .line 798
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->f()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    return-object v0
.end method

.method private i()V
    .locals 7

    .line 696
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 697
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_transfer_details:I

    .line 698
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v3, v3, Lo/eof;->i:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$1;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    .line 699
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 705
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 706
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 707
    return-void
.end method

.method private k()V
    .locals 8

    .line 771
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->C:Z

    if-eqz v0, :cond_1

    .line 772
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v3

    .line 773
    if-eqz v3, :cond_0

    .line 774
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v4

    .line 775
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v5

    .line 776
    invoke-virtual {v5}, Lo/afx;->e()Lo/afv;

    move-result-object v6

    .line 777
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 778
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 779
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 781
    const/4 v0, 0x0

    invoke-virtual {v6, v3, v0, v7}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 784
    :cond_0
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 785
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 787
    :cond_1
    return-void
.end method

.method private n()V
    .locals 4

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 806
    return-void

    .line 808
    :cond_0
    const-string v0, "power"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/PowerManager;

    .line 809
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    .line 810
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->w:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 811
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 5

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget v4, v0, Lo/eof;->f:I

    .line 674
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 677
    :sswitch_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed() \u5931\u8d25\u9000\u51fa "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k()V

    .line 679
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 680
    goto :goto_1

    .line 682
    :sswitch_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed() \u5347\u7ea7\u6210\u529f\u9000\u51fa"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->l()V

    .line 684
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k()V

    .line 685
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 686
    goto :goto_1

    .line 688
    :goto_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed \u5347\u7ea7\u8fc7\u7a0bback\u952e\u5931\u6548 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 689
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i()V

    .line 693
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xe -> :sswitch_1
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 735
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 737
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    if-ne v4, v0, :cond_2

    .line 738
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_1

    .line 740
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATUS_INITIAL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d()V

    .line 742
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n()V

    .line 743
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b()V

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->h()Ljava/lang/String;

    move-result-object v5

    .line 746
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0, v5}, Lo/eof;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 747
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 749
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u4e0d\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k()V

    .line 751
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->finish()V

    .line 754
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/16 v1, 0xe

    if-ne v0, v1, :cond_3

    .line 756
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATUS_OTA_SUCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->l()V

    .line 758
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->k()V

    .line 759
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->finish()V

    goto :goto_1

    .line 764
    :cond_2
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    :cond_3
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 204
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 205
    iput-object p0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    .line 206
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 210
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 211
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->finish()V

    .line 214
    return-void

    .line 216
    :cond_0
    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eof;->a(Ljava/lang/String;)V

    .line 218
    const-string v0, "isUpdateDialog"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->C:Z

    .line 219
    goto :goto_0

    .line 220
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->finish()V

    .line 221
    return-void

    .line 223
    :goto_0
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;-><init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    .line 224
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_ota:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->setContentView(I)V

    .line 225
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->d()V

    .line 226
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b()V

    .line 227
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->n()V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->H:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "upgrade_update_status"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "upgrade_update_progress"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 229
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 711
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 712
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 714
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 715
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 716
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->x:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 720
    :cond_0
    goto :goto_0

    .line 718
    :catch_0
    move-exception v4

    .line 719
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 722
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestroy updateInteractor release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/Boolean;)V

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->u:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->s()V

    .line 726
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    .line 727
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->H:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "upgrade_update_status"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "upgrade_update_progress"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 729
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 730
    return-void
.end method
