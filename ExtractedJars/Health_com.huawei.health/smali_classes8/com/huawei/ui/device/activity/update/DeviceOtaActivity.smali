.class public Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;
    }
.end annotation


# static fields
.field private static s:I


# instance fields
.field private B:Lo/djw$d;

.field private final C:Landroid/content/BroadcastReceiver;

.field private a:Landroid/content/Context;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Lo/egd;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Lo/eom;

.field private r:Landroid/content/BroadcastReceiver;

.field private t:Lo/eob;

.field private u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

.field private v:I

.field private w:Z

.field private x:Z

.field private y:Lo/enu;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    const/16 v0, 0x32

    sput v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->r:Landroid/content/BroadcastReceiver;

    .line 76
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->z:I

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->x:Z

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    .line 83
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    .line 402
    new-instance v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$1;-><init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    .line 555
    new-instance v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$4;-><init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->C:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(I)I
    .locals 0

    .line 50
    sput p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    return p0
.end method

.method private a()V
    .locals 8

    .line 309
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_4

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTransferOtaFile other device is transferring ota file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_device_ota_error_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 315
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 316
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTransferOtaFile deviceInfo = :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    invoke-virtual {v0, v1}, Lo/enu;->a(Lo/djw$d;)V

    .line 322
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    goto/16 :goto_0

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->i()Ljava/lang/String;

    move-result-object v5

    .line 325
    const/4 v6, 0x0

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->g()Ljava/lang/String;

    move-result-object v7

    .line 327
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

    .line 328
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

    .line 329
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

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    invoke-virtual {v0, v5, v6, v7, v1}, Lo/enu;->c(Ljava/lang/String;ILjava/lang/String;Lo/djw$d;)V

    .line 331
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    .line 332
    goto :goto_0

    .line 334
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    .line 337
    :cond_3
    :goto_0
    goto/16 :goto_1

    .line 339
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 340
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTransferOtaFile aw70 device is transferring ota file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_device_ota_error_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 343
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->l()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 344
    const/4 v0, 0x0

    if-eq v0, v4, :cond_8

    .line 345
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceInfo = :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_7

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    invoke-virtual {v0, v1}, Lo/eob;->a(Lo/djw$d;)V

    .line 350
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    goto/16 :goto_1

    .line 354
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->f()Ljava/lang/String;

    move-result-object v5

    .line 355
    const/4 v6, 0x0

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->g()Ljava/lang/String;

    move-result-object v7

    .line 357
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

    .line 358
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

    .line 359
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

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    invoke-virtual {v0, v5, v6, v7, v1}, Lo/eob;->d(Ljava/lang/String;ILjava/lang/String;Lo/djw$d;)V

    .line 361
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    .line 362
    goto :goto_1

    .line 364
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_music_management_disconnection:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    .line 370
    :cond_8
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 186
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_1

    .line 187
    invoke-static {}, Lo/enu;->c()Lo/enu;

    move-result-object v0

    invoke-virtual {v0}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 188
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 189
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getDeviceInfo() mIsAw70 == true DeviceInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 191
    return-object v5

    .line 193
    :cond_0
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfo() mIsAw70 == true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-object v4

    .line 197
    :cond_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfo() mIsAw70 == false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_upgrading_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->m:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 178
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_upgrading:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 183
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 7

    .line 114
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    sget v0, Lcom/huawei/ui/device/R$id;->center_ota_circle:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eom;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->q:Lo/eom;

    .line 116
    sget v0, Lcom/huawei/ui/device/R$id;->rele_percent_ota:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b:Landroid/widget/RelativeLayout;

    .line 117
    sget v0, Lcom/huawei/ui/device/R$id;->text_percent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d:Landroid/widget/TextView;

    .line 118
    sget v0, Lcom/huawei/ui/device/R$id;->text_per_sign:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c:Landroid/widget/TextView;

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c:Landroid/widget/TextView;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 121
    sget v0, Lcom/huawei/ui/device/R$id;->text_circle_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/ui/device/R$id;->rela_ota_failed:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k:Landroid/widget/LinearLayout;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 124
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_num:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->n:Landroid/widget/TextView;

    .line 125
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->p:Landroid/widget/TextView;

    .line 127
    sget v0, Lcom/huawei/ui/device/R$id;->lin_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->f:Landroid/widget/LinearLayout;

    .line 128
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->g:Landroid/widget/TextView;

    .line 129
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    .line 130
    sget v0, Lcom/huawei/ui/device/R$id;->imageview_line:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->m:Landroid/widget/ImageView;

    .line 131
    sget v0, Lcom/huawei/ui/device/R$id;->lin_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->l:Landroid/widget/LinearLayout;

    .line 132
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->o:Landroid/widget/TextView;

    .line 133
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    sget v0, Lcom/huawei/ui/device/R$id;->update_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/emr;

    .line 136
    new-instance v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$5;-><init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V

    invoke-virtual {v5, v0}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 145
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 146
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView AW70 deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_transfer_details:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v1, v1, Lo/enu;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v1, v1, Lo/enu;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v1, v1, Lo/enu;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    goto/16 :goto_2

    .line 154
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_transfer_details:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v3, v3, Lo/eob;->g:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v1, v1, Lo/eob;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v1, v1, Lo/eob;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v1, v1, Lo/eob;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    const/16 v0, 0x32

    sput v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    goto :goto_1

    .line 161
    :cond_2
    const/16 v0, 0x1e

    sput v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    .line 163
    :goto_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "battertPercent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    :goto_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->c()V

    .line 166
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 288
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

    .line 289
    return-void

    .line 291
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    .line 292
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(I)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 303
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->x:Z

    return p1
.end method

.method static synthetic e()I
    .locals 1

    .line 50
    sget v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->s:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    return v0
.end method

.method private e(I)V
    .locals 6

    .line 276
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

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_upgrading_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 278
    int-to-double v0, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    const-string v2, "[\\d]"

    sget v3, Lcom/huawei/ui/device/R$style;->percent_number_style_num:I

    sget v4, Lcom/huawei/ui/device/R$style;->percent_number_style_sign:I

    invoke-static {v1, v2, v5, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->q:Lo/eom;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/eom;->e(F)V

    .line 281
    return-void
.end method

.method private f()V
    .locals 5

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->r:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 613
    return-void

    .line 616
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->C:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 617
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->r:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 622
    goto :goto_0

    .line 618
    :catch_0
    move-exception v4

    .line 619
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    goto :goto_0

    .line 620
    :catch_1
    move-exception v4

    .line 621
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    :goto_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 377
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 379
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_social_clearup_storage_button_finish:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_band_transfer_finish:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    const/high16 v1, -0x4e000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 386
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_finish:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    iget-object v3, v3, Lo/enu;->g:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 389
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_finish:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    iget-object v3, v3, Lo/eob;->g:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 393
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    .line 395
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->f()V

    .line 396
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/enu;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 548
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback mDataDeviceInfo updateMode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 550
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->C:Landroid/content/BroadcastReceiver;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->r:Landroid/content/BroadcastReceiver;

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->C:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 553
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)Lo/eob;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 473
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 474
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 506
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 508
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    if-ne v4, v0, :cond_5

    .line 509
    iget v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 511
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isConnected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->x:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->x:Z

    if-nez v0, :cond_0

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_switch_device_connect_fail:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d(Ljava/lang/String;)V

    .line 514
    return-void

    .line 516
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_2

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->g()Ljava/lang/String;

    move-result-object v5

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0, v5}, Lo/enu;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "re startTransferOtaFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d()V

    .line 521
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a()V

    goto :goto_0

    .line 523
    :cond_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u4e0d\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->finish()V

    .line 526
    :goto_0
    goto :goto_2

    .line 527
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->g()Ljava/lang/String;

    move-result-object v5

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0, v5}, Lo/eob;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 529
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "re startTransferOtaFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d()V

    .line 531
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a()V

    goto :goto_1

    .line 533
    :cond_3
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5347\u7ea7\u6587\u4ef6\u4e0d\u5b58\u5728"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->finish()V

    .line 536
    :goto_1
    goto :goto_2

    .line 538
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->finish()V

    .line 541
    :cond_5
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 91
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 92
    iput-object p0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    .line 93
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    .line 97
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 98
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "UpdateMode"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->z:I

    .line 99
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isAw70"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    .line 100
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate null != it and mIsAw70 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-static {}, Lo/enu;->c()Lo/enu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    .line 103
    :cond_0
    new-instance v0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;-><init>(Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    .line 104
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_ota:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->setContentView(I)V

    .line 105
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->d()V

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->i()V

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a()V

    .line 108
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 477
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 478
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    .line 480
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 482
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->u:Lcom/huawei/ui/device/activity/update/DeviceOtaActivity$d;

    .line 484
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 487
    goto :goto_0

    .line 485
    :catch_0
    move-exception v4

    .line 486
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

    .line 488
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    .line 489
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 491
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->w:Z

    if-eqz v0, :cond_1

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->y:Lo/enu;

    invoke-virtual {v0}, Lo/enu;->n()V

    goto :goto_1

    .line 496
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 497
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->t:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->x()V

    .line 500
    :cond_2
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/DeviceOtaActivity;->B:Lo/djw$d;

    .line 501
    return-void
.end method
