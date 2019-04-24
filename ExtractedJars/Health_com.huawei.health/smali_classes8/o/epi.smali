.class public Lo/epi;
.super Lo/erc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/epi$d;
    }
.end annotation


# static fields
.field private static s:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public a:Landroid/widget/ProgressBar;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/RelativeLayout;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/RelativeLayout;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/RelativeLayout;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/ImageView;

.field public k:Landroid/widget/LinearLayout;

.field public l:Lhuawei/widget/HwProgressBar;

.field public m:Landroid/widget/LinearLayout;

.field public n:Lo/egb;

.field public o:Landroid/widget/ImageView;

.field public p:Landroid/widget/ImageView;

.field private q:Lo/enz;

.field public r:Lo/egb;

.field private t:Ljava/lang/Boolean;

.field private y:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/epi;->s:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 3

    .line 79
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 56
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epi;->t:Ljava/lang/Boolean;

    .line 252
    new-instance v0, Lo/epi$3;

    invoke-direct {v0, p0}, Lo/epi$3;-><init>(Lo/epi;)V

    iput-object v0, p0, Lo/epi;->y:Landroid/os/Handler;

    .line 80
    invoke-static {p2}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lo/epi;->q:Lo/enz;

    .line 82
    sget v0, Lcom/huawei/ui/homehealth/R$id;->user_profile_user_head_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->d:Landroid/widget/ImageView;

    .line 83
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_levelimg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->f:Landroid/widget/ImageView;

    .line 84
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_number_pb:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/epi;->a:Landroid/widget/ProgressBar;

    .line 85
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_level:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epi;->b:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_kaka:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/epi;->c:Landroid/widget/RelativeLayout;

    .line 87
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/epi;->e:Landroid/widget/RelativeLayout;

    .line 88
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_cumulative_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/epi;->k:Landroid/widget/LinearLayout;

    .line 89
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/epi;->g:Landroid/widget/RelativeLayout;

    .line 90
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_icon_default:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->o:Landroid/widget/ImageView;

    .line 91
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_img:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->h:Landroid/widget/ImageView;

    .line 92
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_more:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->i:Landroid/widget/ImageView;

    .line 93
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_connecting:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lo/epi;->l:Lhuawei/widget/HwProgressBar;

    .line 94
    iget-object v0, p0, Lo/epi;->l:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 95
    sget v0, Lcom/huawei/ui/homehealth/R$id;->achieve_user_device_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epi;->p:Landroid/widget/ImageView;

    .line 96
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/epi;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lo/epi;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lo/epi;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lo/epi;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 102
    iget-object v0, p0, Lo/epi;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 105
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$id;->update_top_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/epi;->m:Landroid/widget/LinearLayout;

    .line 106
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_update_top_open:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/epi;->n:Lo/egb;

    .line 107
    sget v0, Lcom/huawei/ui/homehealth/R$id;->btn_update_top_cancle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lo/epi;->r:Lo/egb;

    .line 108
    iget-object v0, p0, Lo/epi;->n:Lo/egb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_open_immediately_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lo/epi;->r:Lo/egb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_btn_state_ignore:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 110
    return-void
.end method

.method static synthetic a(Lo/epi;)Landroid/content/Context;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 298
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter checkIsNLEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epi;->t:Ljava/lang/Boolean;

    .line 300
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->D(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NL service is running!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    return-void

    .line 304
    :cond_0
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NL service is disabled ,send broadcast!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 307
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 308
    const-string v0, "com.huawei.health.action.NPL_SERVICE_NOT_AVALIABLE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 309
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 310
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 314
    :cond_1
    return-void
.end method

.method static synthetic b(Lo/epi;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lo/epi;->c()V

    return-void
.end method

.method static synthetic c(Lo/epi;)Landroid/content/Context;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 7

    .line 318
    iget-object v0, p0, Lo/epi;->t:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 319
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 320
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 321
    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    .line 322
    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v5

    .line 323
    new-instance v6, Lo/eoa;

    iget-object v0, p0, Lo/epi;->u:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/eoa;-><init>(Landroid/content/Context;)V

    .line 326
    if-eqz v5, :cond_0

    .line 327
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isMessage_alert()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    invoke-virtual {v6}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    sget-object v0, Lo/epi;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/epi$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/epi$d;-><init>(Lo/epi;Lo/epi$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 330
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/epi;->t:Ljava/lang/Boolean;

    .line 332
    :cond_0
    goto :goto_0

    .line 333
    :cond_1
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume is checking notification not connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    :goto_0
    goto :goto_1

    .line 336
    :cond_2
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume is checking notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/epi;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lo/epi;->b()V

    return-void
.end method

.method static synthetic e(Lo/epi;)Landroid/os/Handler;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/epi;->y:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public b(Lo/afa;I)V
    .locals 22

    .line 113
    if-eqz p1, :cond_10

    .line 114
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 117
    invoke-virtual/range {p1 .. p1}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    .line 118
    invoke-virtual/range {p1 .. p1}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ahh;

    .line 119
    invoke-virtual {v7}, Lo/ahh;->b()I

    move-result v8

    .line 120
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView wear device deviceType is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-static {v8}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 122
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is plugin download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-static {v8}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 125
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    .line 127
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v11

    .line 130
    if-eqz v11, :cond_0

    .line 131
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v11}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 134
    const/16 v13, 0x16

    .line 135
    const/16 v14, 0x16

    .line 137
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    .line 138
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v16

    .line 140
    int-to-float v0, v15

    const/high16 v1, 0x41b00000    # 22.0f

    div-float v17, v1, v0

    .line 141
    move/from16 v0, v16

    int-to-float v0, v0

    const/high16 v1, 0x41b00000    # 22.0f

    div-float v18, v1, v0

    .line 143
    new-instance v19, Landroid/graphics/Matrix;

    invoke-direct/range {v19 .. v19}, Landroid/graphics/Matrix;-><init>()V

    .line 144
    move-object/from16 v0, v19

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 146
    move-object v0, v12

    move v3, v15

    move/from16 v4, v16

    move-object/from16 v5, v19

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v20

    .line 148
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v21, v0

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 150
    goto :goto_0

    .line 151
    :cond_0
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "devicePluginInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-static {v8}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 156
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 159
    :goto_0
    goto :goto_1

    .line 160
    :cond_2
    invoke-static {v8}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 164
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 167
    :goto_1
    goto :goto_2

    .line 168
    :cond_4
    invoke-virtual {v7}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v7}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HUAWEI CM-R1P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->id_devicemanager_r1_pro:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 171
    :cond_5
    const-string v0, "-1"

    invoke-virtual {v7}, Lo/ahh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "0"

    invoke-virtual {v7}, Lo/ahh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 172
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 174
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lo/ahh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 178
    :goto_2
    invoke-virtual {v7}, Lo/ahh;->b()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v9

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->q:Lo/enz;

    invoke-virtual {v0, v9}, Lo/enz;->b(Z)Z

    move-result v10

    .line 180
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAW70Device isAw70 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "haveNewVersionTip isNew "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-virtual {v7}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 183
    if-eqz v10, :cond_8

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 186
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 188
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_4

    .line 190
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 194
    :cond_a
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_e

    .line 195
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 196
    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/epi;->b(ZZ)V

    .line 198
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 199
    invoke-virtual/range {p1 .. p1}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afj;

    .line 200
    invoke-virtual {v7}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 201
    invoke-static {}, Lo/dpc;->d()Lo/dpc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpc;->b()Z

    move-result v8

    .line 202
    if-eqz v8, :cond_b

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_5

    .line 205
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 208
    :cond_c
    :goto_5
    invoke-virtual {v7}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_d

    .line 209
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "item.getDescriptions().size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->b:Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_6

    .line 212
    :cond_d
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "item.getDescriptions().size() > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->h:Landroid/widget/ImageView;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v2

    iget-object v3, v7, Lo/afj;->b:Ljava/lang/String;

    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v4

    iget-object v4, v4, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 218
    :cond_e
    :goto_6
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceCount is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    move/from16 v0, p2

    const/4 v1, 0x1

    if-le v0, v1, :cond_f

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_7

    .line 223
    :cond_f
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_7

    .line 227
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epi;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 231
    :goto_7
    return-void
.end method

.method public b(ZZ)V
    .locals 2

    .line 234
    if-eqz p1, :cond_0

    .line 235
    iget-object v0, p0, Lo/epi;->l:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Lo/epi;->h:Landroid/widget/ImageView;

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 238
    :cond_0
    iget-object v0, p0, Lo/epi;->l:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 240
    if-eqz p2, :cond_1

    .line 241
    iget-object v0, p0, Lo/epi;->h:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto :goto_0

    .line 243
    :cond_1
    iget-object v0, p0, Lo/epi;->h:Landroid/widget/ImageView;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 247
    :goto_0
    return-void
.end method

.method public d()V
    .locals 5

    .line 289
    const-string v0, "AchievementCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "restartNLService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iget-object v0, p0, Lo/epi;->y:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/epi;->y:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 292
    const/4 v0, 0x5

    iput v0, v4, Landroid/os/Message;->what:I

    .line 293
    iget-object v0, p0, Lo/epi;->y:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 295
    :cond_0
    return-void
.end method
