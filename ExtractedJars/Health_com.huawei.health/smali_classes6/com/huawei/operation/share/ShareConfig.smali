.class public Lcom/huawei/operation/share/ShareConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;
    }
.end annotation


# static fields
.field public static final HEAD_X_HUID:Ljava/lang/String; = "x-huid"

.field public static final HEAD_X_VRESION:Ljava/lang/String; = "x-version"

.field public static final MSG_SHARE_FAIL_TOAST:I = 0x833

.field private static final PARAM_ACTIVITYID:Ljava/lang/String; = "activityId"

.field public static final PARAM_APPID:Ljava/lang/String; = "appId"

.field public static final PARAM_APP_TYPE:Ljava/lang/String; = "appType"

.field public static final PARAM_BINDDEVICETYPE:Ljava/lang/String; = "bindDeviceType"

.field public static final PARAM_DEVICEID:Ljava/lang/String; = "deviceId"

.field public static final PARAM_DEVICE_TYPE:Ljava/lang/String; = "deviceType"

.field public static final PARAM_ENVIRONMENT:Ljava/lang/String; = "environment"

.field public static final PARAM_IVERSION:Ljava/lang/String; = "iVersion"

.field public static final PARAM_LANGUAGE:Ljava/lang/String; = "language"

.field public static final PARAM_SERVICE_TOKEN:Ljava/lang/String; = "token"

.field private static final PARAM_SHARETYPE:Ljava/lang/String; = "shareType"

.field public static final PARAM_SYSVERSION:Ljava/lang/String; = "sysVersion"

.field public static final PARAM_TOKENTYPE:Ljava/lang/String; = "tokenType"

.field private static final PARAM_TS:Ljava/lang/String; = "ts"

.field private static final SHARE_CONTENT:Ljava/lang/String; = "shareContent"

.field private static final SHARE_IMG_URL:Ljava/lang/String; = "shareImg"

.field private static final SHARE_TITLE:Ljava/lang/String; = "shareTitle"

.field private static final SHARE_URL:Ljava/lang/String; = "url"

.field private static final TAG:Ljava/lang/String; = "Opera_[Operation Version 1.2]ShareConfig"

.field private static toastTime:J = 0x0L


# instance fields
.field private mBitmap:Landroid/graphics/Bitmap;

.field private mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private mLoadDataDialog:Lo/egn;

.field private mObserver:Lcom/huawei/operation/share/ShareConfigCallback;

.field private mShareContent:Ljava/lang/String;

.field private mShareImgUrl:Ljava/lang/String;

.field private mShareTitle:Ljava/lang/String;

.field private mShareUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 123
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/huawei/operation/share/ShareConfig;->toastTime:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    .line 115
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mShareImgUrl:Ljava/lang/String;

    .line 116
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mShareUrl:Ljava/lang/String;

    .line 117
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mShareTitle:Ljava/lang/String;

    .line 118
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mShareContent:Ljava/lang/String;

    .line 126
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    .line 127
    iput-object p2, p0, Lcom/huawei/operation/share/ShareConfig;->mHandler:Landroid/os/Handler;

    .line 128
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/share/ShareConfig;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mShareImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareImgUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$102(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareTitle:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$202(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareContent:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$302(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareUrl:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lcom/huawei/operation/share/ShareConfig;)Landroid/os/Handler;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/operation/share/ShareConfig;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/operation/share/ShareConfig;->dismissWaitingDialog()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/operation/share/ShareConfig;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/operation/share/ShareConfig;)Landroid/graphics/Bitmap;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$702(Lcom/huawei/operation/share/ShareConfig;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mBitmap:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic access$800(Lcom/huawei/operation/share/ShareConfig;)Landroid/graphics/Bitmap;
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/operation/share/ShareConfig;->getAppIcon()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/operation/share/ShareConfig;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/operation/share/ShareConfig;->callBackResult()V

    return-void
.end method

.method private callBackResult()V
    .locals 5

    .line 300
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callBackResult enter !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mObserver:Lcom/huawei/operation/share/ShareConfigCallback;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mObserver:Lcom/huawei/operation/share/ShareConfigCallback;

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/operation/share/ShareConfig;->mShareContent:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/operation/share/ShareConfig;->mBitmap:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/huawei/operation/share/ShareConfig;->mShareUrl:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/operation/share/ShareConfigCallback;->onShareConfig(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 304
    :cond_0
    return-void
.end method

.method private dismissWaitingDialog()V
    .locals 4

    .line 267
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "closeLoadDataDialog: mLoadDataDialog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 270
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    .line 272
    :cond_0
    return-void
.end method

.method private getAppIcon()Landroid/graphics/Bitmap;
    .locals 5

    .line 311
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 312
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 313
    invoke-virtual {v2, v1}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 314
    const/4 v4, 0x0

    .line 315
    if-eqz v3, :cond_0

    .line 316
    invoke-virtual {v3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 318
    :cond_0
    return-object v4
.end method

.method public static getToastTime()J
    .locals 2

    .line 322
    sget-wide v0, Lcom/huawei/operation/share/ShareConfig;->toastTime:J

    return-wide v0
.end method

.method public static setToastTime(J)V
    .locals 0

    .line 326
    sput-wide p0, Lcom/huawei/operation/share/ShareConfig;->toastTime:J

    .line 327
    return-void
.end method

.method private showWaitingDialog()V
    .locals 4

    .line 278
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showWaitingDialog: mLoadDataDialog = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 280
    return-void

    .line 288
    :cond_0
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$style;->common_dialog21:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    .line 289
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/operation/R$string;->IDS_getting_file:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 291
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 293
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig;->mLoadDataDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 294
    return-void
.end method


# virtual methods
.method public doObtionShareConfig(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/share/ShareConfigCallback;)V
    .locals 25

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    .line 135
    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 137
    if-nez v5, :cond_0

    .line 138
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doObtionShareConfig adapter is null ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 141
    :cond_0
    move-object/from16 v0, p3

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/operation/share/ShareConfig;->mObserver:Lcom/huawei/operation/share/ShareConfigCallback;

    .line 143
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "getAppInfo"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "getDeviceInfo"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "getLoginInfo"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "getUserInfo"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "getPhoneInfo"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-interface {v5, v0}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->getInfo([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 147
    const-string v0, "huid"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 148
    const-string v0, "grayVersion"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 149
    const-string v0, "severToken"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 150
    const-string v0, "deviceModel"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    .line 153
    const-string v0, "appType"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    .line 155
    invoke-static {}, Lcom/huawei/operation/utils/OperationUtils;->getTokenType()Ljava/lang/String;

    move-result-object v13

    .line 156
    const-string v0, "deviceId"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 157
    const-string v0, "appId"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 158
    const-string v0, "sysVersion"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    .line 159
    const-string v0, "productType"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 160
    const-string v0, "iversion"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/String;

    .line 161
    const-string v0, "languageCode"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    .line 162
    const-string v0, "environment"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    .line 163
    new-instance v21, Ljava/util/HashMap;

    invoke-direct/range {v21 .. v21}, Ljava/util/HashMap;-><init>()V

    .line 164
    const-string v0, "token"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    const-string v0, "deviceType"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "appType"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "ts"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    const-string v0, "tokenType"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    const-string v0, "appId"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    const-string v14, "clientnull"

    .line 173
    :cond_1
    const-string v0, "deviceId"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const-string v0, "sysVersion"

    move-object/from16 v1, v21

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "bindDeviceType"

    move-object/from16 v1, v21

    move-object/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-string v0, "iVersion"

    move-object/from16 v1, v21

    move-object/from16 v2, v18

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "language"

    move-object/from16 v1, v21

    move-object/from16 v2, v19

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v0, "environment"

    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const-string v0, "activityId"

    move-object/from16 v1, v21

    move-object/from16 v2, p1

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    const-string v0, "shareType"

    move-object/from16 v1, v21

    move-object/from16 v2, p2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    invoke-direct/range {p0 .. p0}, Lcom/huawei/operation/share/ShareConfig;->showWaitingDialog()V

    .line 183
    new-instance v22, Ljava/util/HashMap;

    invoke-direct/range {v22 .. v22}, Ljava/util/HashMap;-><init>()V

    .line 184
    const-string v0, "x-huid"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    const-string v0, "x-version"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/utils/WebViewUtils;->getActivityKeyUrlSP(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v23

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/activity/getShareConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    .line 189
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/operation/share/ShareConfig;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/huawei/operation/share/ShareConfig$1;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/operation/share/ShareConfig$1;-><init>(Lcom/huawei/operation/share/ShareConfig;)V

    move-object/from16 v2, v24

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    invoke-static {v0, v2, v3, v4, v1}, Lcom/huawei/operation/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/operation/https/HttpResCallBack;)I

    .line 219
    return-void
.end method

.method public doObtionShareConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/share/ShareConfigCallback;)V
    .locals 4

    .line 222
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doObtionShareConfig enter !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iput-object p5, p0, Lcom/huawei/operation/share/ShareConfig;->mObserver:Lcom/huawei/operation/share/ShareConfigCallback;

    .line 224
    invoke-direct {p0}, Lcom/huawei/operation/share/ShareConfig;->showWaitingDialog()V

    .line 226
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig;->mShareImgUrl:Ljava/lang/String;

    .line 227
    iput-object p2, p0, Lcom/huawei/operation/share/ShareConfig;->mShareTitle:Ljava/lang/String;

    .line 228
    iput-object p3, p0, Lcom/huawei/operation/share/ShareConfig;->mShareContent:Ljava/lang/String;

    .line 229
    iput-object p4, p0, Lcom/huawei/operation/share/ShareConfig;->mShareUrl:Ljava/lang/String;

    .line 232
    new-instance v0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;

    invoke-direct {v0, p0}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;-><init>(Lcom/huawei/operation/share/ShareConfig;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 233
    return-void
.end method
