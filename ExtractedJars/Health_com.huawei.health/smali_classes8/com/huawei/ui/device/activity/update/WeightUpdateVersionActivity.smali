.class public Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;
    }
.end annotation


# instance fields
.field private A:Lo/eom;

.field private B:Landroid/widget/TextView;

.field private C:Z

.field private D:Z

.field private E:Lo/egv;

.field private F:Landroid/content/BroadcastReceiver;

.field private G:Ljava/lang/String;

.field private H:Lo/egv;

.field private I:Lo/egv;

.field private J:Z

.field private K:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

.field private N:Z

.field a:Lo/abx;

.field private b:Lo/emr;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Lo/egd;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:I

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/LinearLayout;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/content/BroadcastReceiver;

.field private w:Lo/eof;

.field private x:Lo/egv;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->v:Landroid/content/BroadcastReceiver;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->x:Lo/egv;

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->j:I

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    .line 108
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$5;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;

    .line 808
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$6;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a:Lo/abx;

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 3

    .line 247
    const-string v2, ""

    .line 248
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 250
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 251
    goto :goto_1

    .line 253
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 254
    goto :goto_1

    .line 256
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 257
    goto :goto_1

    .line 259
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 262
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

.method static synthetic a(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 313
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initUpdate()  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eof;->c(Z)V

    .line 317
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i()V

    .line 318
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 946
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 947
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 948
    const-string v0, "deviceName"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 949
    const-string v0, "isForced"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 950
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 951
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 952
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    return-object p1
.end method

.method private b()V
    .locals 2

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 389
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 393
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    .line 395
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 397
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    .line 399
    :cond_2
    return-void
.end method

.method private b(I)V
    .locals 8

    .line 640
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_downloading:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 642
    int-to-double v0, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 643
    const-string v0, "WeightUpdateVersionActivity"

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

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

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

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const-string v2, "[\\d]"

    sget v3, Lcom/huawei/ui/device/R$style;->percent_number_style_num:I

    sget v4, Lcom/huawei/ui/device/R$style;->percent_number_style_sign:I

    invoke-static {v1, v2, v7, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/eom;->e(F)V

    .line 646
    return-void
.end method

.method private b(IILjava/lang/String;Landroid/content/Intent;)V
    .locals 5

    .line 134
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 136
    :pswitch_0
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_START: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    goto/16 :goto_0

    .line 139
    :pswitch_1
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_FAILED: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 141
    const-string v4, ""

    .line 142
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 143
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No New Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f()V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->n()V

    .line 146
    goto/16 :goto_0

    .line 148
    :cond_0
    invoke-direct {p0, v4, p2}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(Ljava/lang/String;I)V

    .line 150
    goto/16 :goto_0

    .line 153
    :pswitch_2
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u624b\u52a8\u6d88\u606f\u4e2d\u5fc3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->b(Ljava/lang/Boolean;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iput p2, v0, Lo/eof;->d:I

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    int-to-long v2, p2

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eof;->a:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iput-object p3, v0, Lo/eof;->b:Ljava/lang/String;

    .line 159
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v3, v3, Lo/eof;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    .line 161
    const-string v0, "minAppCode"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->j:I

    .line 162
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check success! isForced:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " minCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 167
    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;I)V
    .locals 2

    .line 229
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 232
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 234
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 237
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p2, :cond_2

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 240
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_unknown_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 243
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    return-object p1
.end method

.method private c()V
    .locals 4

    .line 402
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    sget v0, Lcom/huawei/ui/device/R$id;->center_ota_download:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eom;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eom;->setVisibility(I)V

    .line 405
    sget v0, Lcom/huawei/ui/device/R$id;->update_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b:Lo/emr;

    .line 406
    sget v0, Lcom/huawei/ui/device/R$id;->image_check_logo:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    .line 407
    sget v0, Lcom/huawei/ui/device/R$id;->rele_circle_download:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d:Landroid/widget/RelativeLayout;

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 409
    sget v0, Lcom/huawei/ui/device/R$id;->text_percent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h:Landroid/widget/TextView;

    .line 410
    sget v0, Lcom/huawei/ui/device/R$id;->text_per_sign:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->k:Landroid/widget/TextView;

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->k:Landroid/widget/TextView;

    const-string v1, "%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 413
    sget v0, Lcom/huawei/ui/device/R$id;->text_circle_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i:Landroid/widget/TextView;

    .line 414
    sget v0, Lcom/huawei/ui/device/R$id;->rela_failed:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f:Landroid/widget/LinearLayout;

    .line 415
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 418
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_version_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    .line 419
    sget v0, Lcom/huawei/ui/device/R$id;->lin_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 421
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->o:Landroid/widget/TextView;

    .line 422
    sget v0, Lcom/huawei/ui/device/R$id;->text_tip_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->l:Landroid/widget/TextView;

    .line 423
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->z:Landroid/widget/TextView;

    .line 424
    sget v0, Lcom/huawei/ui/device/R$id;->text_new_feature_content:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->y:Landroid/widget/TextView;

    .line 425
    sget v0, Lcom/huawei/ui/device/R$id;->lin_new_feature:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->r:Landroid/widget/LinearLayout;

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 427
    sget v0, Lcom/huawei/ui/device/R$id;->imageview_line:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 429
    sget v0, Lcom/huawei/ui/device/R$id;->failed_message:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->B:Landroid/widget/TextView;

    .line 430
    sget v0, Lcom/huawei/ui/device/R$id;->rela_device_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s:Landroid/widget/RelativeLayout;

    .line 431
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->u:Landroid/widget/TextView;

    .line 432
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_num:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t:Landroid/widget/TextView;

    .line 433
    sget v0, Lcom/huawei/ui/device/R$id;->text_device_version_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->q:Landroid/widget/TextView;

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$2;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v0, v0, Lo/eof;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, v1, Lo/eof;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g()V

    .line 450
    :cond_1
    return-void
.end method

.method private c(II)V
    .locals 5

    .line 202
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 204
    :pswitch_0
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_PROGRESS: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x3

    iput v1, v0, Lo/eof;->f:I

    .line 206
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(I)V

    .line 207
    goto/16 :goto_0

    .line 209
    :pswitch_1
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_FAILED: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const-string v4, ""

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 212
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 213
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 215
    :cond_0
    invoke-direct {p0, v4}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Ljava/lang/String;)V

    .line 216
    goto :goto_0

    .line 218
    :pswitch_2
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_SUCCESS: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eof;->c(Z)V

    .line 220
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p()V

    .line 221
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e()V

    .line 222
    .line 226
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private c(Landroid/content/Intent;)V
    .locals 7

    .line 123
    const-string v0, "state"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 124
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 125
    const-string v0, "content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 126
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 127
    invoke-direct {p0, v4, v5, v6, p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(IILjava/lang/String;Landroid/content/Intent;)V

    .line 128
    invoke-direct {p0, v4, v6}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d(ILjava/lang/String;)V

    .line 129
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c(II)V

    .line 131
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 583
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForNoNetwork! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 586
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 594
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Landroid/widget/TextView;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    return-object p1
.end method

.method private d(ILjava/lang/String;)V
    .locals 4

    .line 170
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 172
    :sswitch_0
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_START: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x2

    iput v1, v0, Lo/eof;->f:I

    goto/16 :goto_0

    .line 178
    :sswitch_1
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_FAILED: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 184
    :sswitch_2
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_FETCH_CHANGELOG_SUCCESS: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v1, p2}, Lo/eof;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eof;->e:Ljava/lang/String;

    .line 187
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mBandNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v3, v3, Lo/eof;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->k()V

    goto :goto_0

    .line 192
    :sswitch_3
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_START: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x3

    iput v1, v0, Lo/eof;->f:I

    .line 194
    .line 199
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x14 -> :sswitch_3
        0x33 -> :sswitch_0
        0x34 -> :sswitch_1
        0x35 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Landroid/content/Intent;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->J:Z

    return p1
.end method

.method private e()V
    .locals 5

    .line 267
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 268
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterDeviceOtaActivity():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 270
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    const-string v0, "isUpdateDialog"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 274
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->finish()V

    .line 275
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 664
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    .line 665
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 666
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 667
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 668
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(I)V

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 670
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 672
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 675
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 676
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 680
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 681
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->B:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_check_version_failed_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 682
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->B:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 685
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->B:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 687
    :goto_0
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg() mUpdateStatus :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 689
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 565
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForNoVersion! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 570
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_button_check_version:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_no_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 575
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->f()V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    iput v1, v0, Lo/eof;->f:I

    .line 577
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/eof;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 456
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showDeviceType() deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eof;->c(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 458
    if-eqz v4, :cond_1

    .line 459
    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->b:Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 462
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v3

    iget-object v3, v3, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 465
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->K:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 538
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForCheck! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 540
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 542
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v0, v0, Lo/eof;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, v1, Lo/eof;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 545
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g()V

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->getIsRunning()Z

    move-result v0

    if-nez v0, :cond_1

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->e()V

    .line 551
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_checking:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 559
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Lo/egv;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 526
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->h()V

    .line 527
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n()V

    .line 529
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 530
    const-string v0, "state"

    const-string v1, "device"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->is:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 532
    return-void
.end method

.method private k()V
    .locals 4

    .line 601
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, -0x49ade

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_manager_update_health:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->r:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_new_version:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 611
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, v1, Lo/eof;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, v1, Lo/eof;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->q:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, v1, Lo/eof;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->A:Lo/eom;

    invoke-virtual {v0}, Lo/eom;->a()V

    .line 617
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    return v0
.end method

.method private l()V
    .locals 4

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    if-nez v0, :cond_0

    .line 743
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 744
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_is_roaming:I

    .line 745
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->sns_update_app_action:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$3;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 746
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$1;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 756
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 765
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    .line 766
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->E:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 769
    :cond_0
    return-void
.end method

.method private m()V
    .locals 6

    .line 708
    iget v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->j:I

    if-lez v0, :cond_0

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->e(Landroid/content/Context;)I

    move-result v4

    .line 710
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 711
    iget v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->j:I

    if-le v0, v4, :cond_0

    .line 712
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d()V

    .line 713
    return-void

    .line 718
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v1, v1, Lo/eof;->d:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/eof;->a(J)Z

    move-result v4

    .line 719
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 720
    if-nez v4, :cond_1

    .line 721
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_low_memory:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 723
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->i()Z

    move-result v5

    .line 724
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 725
    if-nez v5, :cond_3

    .line 726
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 727
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->l()V

    goto :goto_0

    .line 730
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s()V

    goto :goto_0

    .line 733
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->s()V

    .line 736
    :goto_0
    return-void
.end method

.method private n()V
    .locals 4

    .line 695
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doCheckAppNewVersion: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isConnected:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_0

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x1

    iput v1, v0, Lo/eof;->f:I

    .line 700
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->q()V

    .line 701
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->u()V

    return-void
.end method

.method private o()V
    .locals 4

    .line 623
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initViewForDownload!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 628
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(I)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 634
    return-void
.end method

.method private p()V
    .locals 2

    .line 652
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_talk_band_succeed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 653
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 654
    const/16 v0, 0x64

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b(I)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x96

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 657
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->g:Lo/egd;

    const v1, 0x33fb6522

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 658
    return-void
.end method

.method private q()V
    .locals 7

    .line 854
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 855
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 856
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v4

    .line 858
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v4}, Lo/acp;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eof;->b(Ljava/lang/String;)V

    .line 861
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acq;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v5

    .line 862
    if-nez v5, :cond_0

    .line 863
    return-void

    .line 866
    :cond_0
    invoke-virtual {v5}, Lo/afx;->e()Lo/afv;

    move-result-object v6

    .line 867
    if-eqz v6, :cond_1

    .line 868
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a:Lo/abx;

    invoke-virtual {v6, v4, v0, v3}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 872
    :cond_1
    return-void
.end method

.method private r()V
    .locals 4

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    if-nez v0, :cond_0

    .line 776
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 777
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_firmware_upgrade_ensure_exit:I

    .line 778
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$7;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 779
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$4;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 794
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 802
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->I:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 806
    :cond_0
    return-void
.end method

.method private s()V
    .locals 4

    .line 880
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadAppFile: mWeightUpdateInteractors.mUpdateStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 881
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->o()V

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->g()V

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->d()V

    .line 885
    return-void
.end method

.method private t()V
    .locals 5

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 889
    return-void

    .line 892
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 893
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 896
    goto :goto_0

    .line 894
    :catch_0
    move-exception v4

    .line 895
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    :goto_0
    return-void
.end method

.method private u()V
    .locals 4

    .line 936
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterUpdateActivity():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    return-void
.end method


# virtual methods
.method public d()V
    .locals 6

    .line 903
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppVersionISLow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    if-nez v0, :cond_0

    .line 907
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_update_band_new_version_title2:I

    .line 908
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v3, v3, Lo/eof;->i:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_band_message_string:I

    .line 909
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_update_new_version_to_upgrade_app:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$8;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 910
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$10;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    .line 920
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 929
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 931
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->H:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 933
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 9

    .line 328
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed()  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v4, v0, Lo/eof;->f:I

    .line 331
    const-string v0, "WeightUpdateVersionActivity"

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

    .line 332
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    if-nez v4, :cond_0

    .line 334
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 335
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v0, v0, Lo/eof;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a(Ljava/lang/String;)V

    .line 337
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 338
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 339
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->r()V

    goto :goto_0

    .line 341
    :cond_2
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 345
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->N:Z

    if-eqz v0, :cond_5

    .line 346
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 347
    if-eqz v4, :cond_4

    .line 348
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v5

    .line 349
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v6

    .line 350
    invoke-virtual {v6}, Lo/afx;->e()Lo/afv;

    move-result-object v7

    .line 351
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 352
    const-string v0, "type"

    const/4 v1, -0x1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 353
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 355
    const/4 v0, 0x0

    invoke-virtual {v7, v4, v0, v8}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 359
    :cond_4
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 360
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 364
    :cond_5
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 469
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 470
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v3, v3, Lo/eof;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    sget v0, Lcom/huawei/ui/device/R$id;->button:I

    if-ne v4, v0, :cond_1

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    if-ne v0, v1, :cond_0

    .line 473
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightUpdateInteractors.STATUS_INITIAL "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 476
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 478
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->i()V

    .line 480
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 481
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightUpdateInteractors.STATUS_PULL_CHANGE_LOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->m()V

    .line 487
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 279
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 280
    iput-object p0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    .line 281
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 285
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 286
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate null == it"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->finish()V

    .line 288
    return-void

    .line 290
    :cond_0
    const-string v0, "isUpdateDialog"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->N:Z

    .line 291
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->finish()V

    .line 294
    return-void

    .line 296
    :cond_1
    new-instance v0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;-><init>(Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->K:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    .line 297
    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eof;->a(Ljava/lang/String;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->K:Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity$c;

    invoke-virtual {v0, v1}, Lo/eof;->a(Landroid/os/Handler;)V

    .line 300
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_update_version:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->setContentView(I)V

    .line 301
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->c()V

    .line 302
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a()V

    .line 303
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 304
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->F:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 306
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 370
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 371
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->t()V

    .line 372
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->b()V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 374
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestroy updateInteractor release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    invoke-virtual {v0}, Lo/eof;->s()V

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->w:Lo/eof;

    .line 378
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->e:Landroid/content/Context;

    .line 379
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;->a:Lo/abx;

    invoke-virtual {v0, v1}, Lo/adn;->b(Lo/abx;)V

    .line 381
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 322
    const-string v0, "WeightUpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 324
    return-void
.end method
