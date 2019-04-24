.class public Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lo/ajl;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;
    }
.end annotation


# static fields
.field private static final CLEAR_USER_DATA_CHANGE_UI_SETVIEW:I = 0x1

.field private static final TAG:Ljava/lang/String; = "WiFiUserClearFragment"

.field private static final USERINFO_ONE:Ljava/lang/String; = "userInfo1"


# instance fields
.field private chooseCount:I

.field private isShowDeleteFail:Z

.field private ivDelete:Landroid/widget/ImageView;

.field private mAdapter:Lo/ahq;

.field private mContext:Landroid/content/Context;

.field private mDeviceId:Ljava/lang/String;

.field private mRecyclerView:Landroid/support/v7/widget/RecyclerView;

.field private myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;

.field private noSelect:I

.field private rlAllCheck:Landroid/widget/RelativeLayout;

.field private rlDelete:Landroid/widget/RelativeLayout;

.field private tvAllCheck:Landroid/widget/TextView;

.field private tvDelete:Landroid/widget/TextView;

.field private userList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ahp;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->isShowDeleteFail:Z

    .line 94
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->noSelect:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Z
    .locals 1

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->isDestroy()Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/content/Context;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->updataDataByWifiDeviceStatus(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->isShowDeleteFail:Z

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->showDeleteFail()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Landroid/app/Activity;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->deleteChooseUserInfo()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)Ljava/util/List;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    return-object v0
.end method

.method private clearSingleUserInfo(Lo/acu;)V
    .locals 12

    .line 324
    const-string v4, ""

    .line 325
    const-string v5, ""

    .line 326
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v6

    .line 327
    invoke-virtual {p1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 329
    const-string v5, "userInfo1"

    goto :goto_0

    .line 331
    :cond_0
    invoke-virtual {p1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 332
    invoke-virtual {p1}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v5

    .line 334
    :goto_0
    move-object v7, v4

    .line 335
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearSingleUserInfo user:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lo/acu;->c(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 336
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 337
    const-string v0, "id"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    const-string v0, "uid"

    invoke-interface {v8, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    const-string v0, "isClear"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    new-instance v9, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;

    invoke-direct {v9}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;-><init>()V

    .line 342
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 343
    new-instance v11, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;

    invoke-direct {v11}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;-><init>()V

    .line 344
    invoke-virtual {v11, v8}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setData(Ljava/util/Map;)V

    .line 345
    invoke-virtual {v11, v5}, Lcom/huawei/hwcloudmodel/model/unite/DeviceServiceInfo;->setSid(Ljava/lang/String;)V

    .line 346
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    invoke-virtual {v9, v10}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDeviceServiceInfo(Ljava/util/List;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 351
    return-void

    .line 353
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v9, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;->setDevId(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;

    invoke-direct {v1, p0, v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v9, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceControlDataModelReq;Lo/cyx;)V

    .line 378
    return-void
.end method

.method private deleteChooseUserInfo()V
    .locals 5

    .line 306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ajw;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_not_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 308
    return-void

    .line 310
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->isShowDeleteFail:Z

    .line 311
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0}, Lo/ahq;->e()Ljava/util/ArrayList;

    move-result-object v2

    .line 312
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ahp;

    .line 313
    invoke-virtual {v4}, Lo/ahp;->d()Lo/acu;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->clearSingleUserInfo(Lo/acu;)V

    .line 314
    goto :goto_0

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0}, Lo/ahq;->d()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    .line 316
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0}, Lo/ahq;->notifyDataSetChanged()V

    .line 317
    return-void
.end method

.method private getUserClearBean()Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/ahp;>;"
        }
    .end annotation

    .line 143
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 144
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v5

    .line 145
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v6

    .line 146
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

    .line 147
    new-instance v9, Lo/ahp;

    invoke-direct {v9}, Lo/ahp;-><init>()V

    .line 148
    const-string v10, ""

    .line 149
    const-string v11, ""

    .line 150
    invoke-virtual {v8}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 151
    invoke-virtual {v6}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v8}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 156
    :goto_1
    invoke-static {v10}, Lo/ahu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 158
    :cond_1
    invoke-virtual {v9, v8}, Lo/ahp;->e(Lo/acu;)V

    .line 160
    if-eqz v11, :cond_2

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "0"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 161
    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    .line 162
    invoke-virtual {v9, v12}, Lo/ahp;->e(Ljava/lang/Double;)V

    .line 163
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    :cond_2
    goto/16 :goto_0

    .line 166
    :cond_3
    return-object v4
.end method

.method private initAdpater()V
    .locals 3

    .line 135
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Lo/ahq;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, v2, p0}, Lo/ahq;-><init>(Ljava/util/List;Landroid/content/Context;Lo/ajl;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 139
    return-void
.end method

.method private initData()V
    .locals 1

    .line 126
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getUserClearBean()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    .line 127
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->initAdpater()V

    .line 128
    return-void
.end method

.method private initView()V
    .locals 3

    .line 171
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_clear_user:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->setTitle(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mCustomTitleBar:Lo/emr;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$drawable;->ic_public_select_cancel:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->rl_clear_user_data_delete:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlDelete:Landroid/widget/RelativeLayout;

    .line 175
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_clear_user_data_delete:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvDelete:Landroid/widget/TextView;

    .line 176
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->iv_clear_user_data_delete:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->ivDelete:Landroid/widget/ImageView;

    .line 177
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->rl_clear_user_data_all_check:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlAllCheck:Landroid/widget/RelativeLayout;

    .line 178
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_clear_user_data_all_check:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvAllCheck:Landroid/widget/TextView;

    .line 179
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->_clear_user_data_recycler_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 181
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlDelete:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlAllCheck:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    return-void
.end method

.method private isDestroy()Z
    .locals 5

    .line 293
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    .line 294
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 295
    :cond_0
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, 0x1

    return v0

    .line 298
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private showDeleteConfirmDialog()V
    .locals 6

    .line 419
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteConfirmDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 421
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 422
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_userinfo_delete_confirm:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->nps_user_survey_grade_cancel:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V

    .line 423
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->nps_user_survey_grade_sure:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V

    .line 429
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 441
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 442
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 444
    return-void
.end method

.method private showDeleteFail()V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_delete_fail:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 414
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->isShowDeleteFail:Z

    .line 415
    return-void
.end method

.method private updataDataByWifiDeviceStatus(Ljava/lang/String;)V
    .locals 3

    .line 384
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;-><init>()V

    .line 385
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;->setDevId(Ljava/lang/String;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/unite/WifiDeviceGetDeviceStatusReq;Lo/cyx;)V

    .line 407
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 5

    .line 448
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->popupFragment(Ljava/lang/Class;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_is_wificlear"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 451
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 265
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->rl_clear_user_data_delete:I

    if-ne v0, v1, :cond_0

    .line 266
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->showDeleteConfirmDialog()V

    goto :goto_0

    .line 267
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->rl_clear_user_data_all_check:I

    if-ne v0, v1, :cond_2

    .line 268
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 269
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0}, Lo/ahq;->b()V

    goto :goto_0

    .line 271
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    invoke-virtual {v0}, Lo/ahq;->c()V

    .line 275
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 102
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 103
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;

    .line 105
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mContext:Landroid/content/Context;

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "deviceId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mDeviceId:Ljava/lang/String;

    .line 109
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 113
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 114
    sget v0, Lcom/huawei/plugindevice/R$layout;->wifi_device_user_clear_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->initView()V

    .line 116
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->initData()V

    .line 120
    return-object v2
.end method

.method public onDestroy()V
    .locals 1

    .line 280
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 284
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    if-eqz v0, :cond_1

    .line 287
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mAdapter:Lo/ahq;

    .line 289
    :cond_1
    return-void
.end method

.method public selectItem(II)V
    .locals 2

    .line 230
    iput p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    .line 231
    iput p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->noSelect:I

    .line 233
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->myHandler:Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 235
    return-void
.end method

.method public setView()V
    .locals 7

    .line 192
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 194
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    if-nez v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_selectNone:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->setTitle(Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvDelete:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->hw_claim_weight_data_data_operation_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->ivDelete:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->measure_weight_data_no_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlDelete:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 200
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlAllCheck:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlAllCheck:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    goto :goto_0

    .line 207
    :cond_1
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->setTitle(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvDelete:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->hw_claim_weight_data_data_operation:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->ivDelete:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->measure_weight_data_delete:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->rlDelete:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 214
    :goto_0
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->chooseCount:I

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->userList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 215
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvAllCheck:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_contact_delete_uncheck_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 217
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->tvAllCheck:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_contact_delete_select_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    :goto_1
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiUserClearFragment;->noSelect:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 221
    const-string v0, "WiFiUserClearFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "list is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 224
    :cond_3
    return-void
.end method
