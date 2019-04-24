.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;,
        Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;
    }
.end annotation


# static fields
.field private static final MSG_INIT_ADAPTER:I = 0x1

.field private static final MSG_ONRESUME_ADAPTER:I = 0x2

.field private static final TAG:Ljava/lang/String; = "WiFiBodyFatScaleDataManagerFragment"


# instance fields
.field private mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;

.field private mContext:Landroid/content/Context;

.field private mDeviceId:Ljava/lang/String;

.field private mListView:Landroid/widget/ListView;

.field private m_UserinfoClearBtn:Lo/egd;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;

.field private userList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ahp;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->getUserClearBean()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Z
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->initAdapter()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Landroid/app/Activity;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method private getUserClearBean()Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/ahp;>;"
        }
    .end annotation

    .line 121
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 122
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v5

    .line 123
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v6

    .line 124
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/acu;

    .line 125
    new-instance v9, Lo/ahp;

    invoke-direct {v9}, Lo/ahp;-><init>()V

    .line 126
    const-string v10, ""

    .line 127
    const-string v11, ""

    .line 128
    invoke-virtual {v8}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 129
    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mDeviceId:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v8}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 134
    :goto_1
    invoke-static {v10}, Lo/ahu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 135
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devUserInfo is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|userWeight:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :cond_1
    invoke-virtual {v9, v8}, Lo/ahp;->e(Lo/acu;)V

    .line 138
    if-eqz v11, :cond_2

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "0"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 140
    :try_start_0
    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    .line 141
    invoke-virtual {v9, v12}, Lo/ahp;->e(Ljava/lang/Double;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 144
    goto :goto_2

    .line 142
    :catch_0
    move-exception v12

    .line 143
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserWeight error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 146
    :cond_2
    :goto_2
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    goto/16 :goto_0

    .line 148
    :cond_3
    return-object v4
.end method

.method private gotoClearUserFragment()V
    .locals 6

    .line 370
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 371
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_not_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 372
    return-void

    .line 374
    :cond_0
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoClearUserFragment"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 375
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 376
    const-string v0, "deviceId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;-><init>()V

    .line 378
    invoke-virtual {v5, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->setArguments(Landroid/os/Bundle;)V

    .line 379
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 380
    return-void
.end method

.method private initAdapter()V
    .locals 2

    .line 116
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mAdapter:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$ScaleManagerAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 118
    return-void
.end method

.method private initData()V
    .locals 1

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    .line 101
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->initWeightUser()V

    .line 102
    return-void
.end method

.method private initView()V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_scale_manager:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->setTitle(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->scale_manager_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mListView:Landroid/widget/ListView;

    .line 156
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_clear_user_info:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->m_UserinfoClearBtn:Lo/egd;

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->m_UserinfoClearBtn:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    return-void
.end method

.method private initWeightUser()V
    .locals 2

    .line 105
    sget-object v0, Lo/act;->a:Lo/act;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V

    invoke-virtual {v0, v1}, Lo/act;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 113
    return-void
.end method

.method private isDestroy()Z
    .locals 5

    .line 306
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 307
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    :cond_0
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v0, 0x1

    return v0

    .line 311
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static setUserNameAndPhoto(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 2

    .line 325
    if-eqz p2, :cond_0

    .line 326
    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 330
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 332
    invoke-virtual {p1}, Lo/acu;->i()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 333
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_personal_head:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 335
    :cond_1
    invoke-virtual {p1}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 336
    invoke-virtual {p1}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->setUserPhoto(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 338
    :cond_2
    invoke-virtual {p1}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_3

    .line 339
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_personal_head:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 341
    :cond_3
    invoke-virtual {p1}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 345
    :goto_0
    return-void
.end method

.method private static setUserPhoto(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .line 354
    const-string v0, "default"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 355
    invoke-static {p0, p1}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 356
    if-eqz v1, :cond_0

    .line 357
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 359
    :cond_0
    goto :goto_0

    .line 360
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_personal_head:I

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 362
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 287
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->id_btn_clear_user_info:I

    if-ne v0, v1, :cond_0

    .line 289
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->gotoClearUserFragment()V

    .line 291
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 74
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 75
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;

    .line 77
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mContext:Landroid/content/Context;

    .line 78
    invoke-static {}, Lo/ahu;->c()V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->mDeviceId:Ljava/lang/String;

    .line 82
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 86
    const-string v0, "WiFiBodyFatScaleDataManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 87
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 88
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_device_scale_manager_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->child:Landroid/view/View;

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->initView()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->initData()V

    .line 91
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    :cond_0
    return-object v4
.end method

.method public onDestroy()V
    .locals 1

    .line 296
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 300
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->userList:Ljava/util/List;

    .line 302
    :cond_0
    return-void
.end method
