.class public Lcom/sina/weibo/sdk/WeiboAppManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SDK_INT_FILE_NAME:Ljava/lang/String; = "weibo_for_sdk.json"

.field private static final TAG:Ljava/lang/String;

.field private static final WEIBO_4G_PACKAGENAME:Ljava/lang/String; = "com.sina.weibog3"

.field public static final WEIBO_IDENTITY_ACTION:Ljava/lang/String; = "com.sina.weibo.action.sdkidentity"

.field private static final WEIBO_PACKAGENAME:Ljava/lang/String; = "com.sina.weibo"

.field private static sInstance:Lcom/sina/weibo/sdk/WeiboAppManager; = null


# instance fields
.field private mContext:Landroid/content/Context;

.field private wbAppInfo:Lcom/sina/weibo/sdk/auth/WbAppInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    const-class v0, Lcom/sina/weibo/sdk/WeiboAppManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/WeiboAppManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/WeiboAppManager;->mContext:Landroid/content/Context;

    .line 32
    return-void
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/sina/weibo/sdk/WeiboAppManager;
    .locals 2

    const-class v1, Lcom/sina/weibo/sdk/WeiboAppManager;

    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/WeiboAppManager;->sInstance:Lcom/sina/weibo/sdk/WeiboAppManager;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/sina/weibo/sdk/WeiboAppManager;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/WeiboAppManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/sina/weibo/sdk/WeiboAppManager;->sInstance:Lcom/sina/weibo/sdk/WeiboAppManager;

    .line 38
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/WeiboAppManager;->sInstance:Lcom/sina/weibo/sdk/WeiboAppManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private static parseWbInfoByAsset(Landroid/content/Context;Ljava/lang/String;)Lcom/sina/weibo/sdk/auth/WbAppInfo;
    .locals 16

    .line 115
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const/4 v0, 0x0

    return-object v0

    .line 118
    :cond_0
    const/4 v3, 0x0

    .line 120
    .line 121
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x2

    :try_start_0
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v4

    .line 122
    const/16 v5, 0x1000

    .line 123
    const/16 v0, 0x1000

    new-array v6, v0, [B

    .line 125
    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "weibo_for_sdk.json"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    .line 126
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x1000

    invoke-virtual {v3, v6, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 128
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1, v7}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/ApiUtils;->validateWeiboSign(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 134
    :cond_2
    new-instance v9, Lorg/json/JSONObject;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 135
    const-string v0, "support_api"

    const/4 v1, -0x1

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    .line 136
    new-instance v11, Lcom/sina/weibo/sdk/auth/WbAppInfo;

    invoke-direct {v11}, Lcom/sina/weibo/sdk/auth/WbAppInfo;-><init>()V

    .line 137
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v11, v10}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->setSupportVersion(I)V

    .line 139
    const-string v0, "authActivityName"

    const-string v1, "com.sina.weibo.SSOActivity"

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->setAuthActivityName(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    move-object v12, v11

    .line 145
    if-eqz v3, :cond_3

    .line 147
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    goto :goto_1

    :catch_0
    move-exception v13

    :cond_3
    :goto_1
    return-object v12

    .line 142
    :catch_1
    move-exception v4

    .line 143
    :try_start_2
    sget-object v0, Lcom/sina/weibo/sdk/WeiboAppManager;->TAG:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    if-eqz v3, :cond_5

    .line 147
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 148
    goto :goto_3

    :catch_2
    move-exception v4

    goto :goto_3

    .line 145
    :catchall_0
    move-exception v14

    if-eqz v3, :cond_4

    .line 147
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 148
    goto :goto_2

    :catch_3
    move-exception v15

    :cond_4
    :goto_2
    throw v14

    .line 151
    :cond_5
    :goto_3
    const/4 v0, 0x0

    return-object v0
.end method

.method private static queryWbInfoByAsset(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;
    .locals 9

    .line 85
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.sina.weibo.action.sdkidentity"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 86
    const-string v0, "android.intent.category.DEFAULT"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 88
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_1
    const/4 v4, 0x0

    .line 92
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 93
    iget-object v0, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v0, :cond_2

    iget-object v0, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v0, :cond_2

    iget-object v0, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 94
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 95
    goto :goto_0

    .line 97
    :cond_3
    iget-object v0, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v7, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 98
    invoke-static {p0, v7}, Lcom/sina/weibo/sdk/WeiboAppManager;->parseWbInfoByAsset(Landroid/content/Context;Ljava/lang/String;)Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v8

    .line 99
    if-eqz v8, :cond_4

    .line 100
    move-object v4, v8

    .line 102
    :cond_4
    const-string v0, "com.sina.weibo"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.sina.weibog3"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 103
    goto :goto_1

    .line 105
    :cond_5
    goto :goto_0

    .line 106
    :cond_6
    :goto_1
    return-object v4
.end method

.method public static queryWbInfoInternal(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;
    .locals 3

    .line 53
    invoke-static {p0}, Lcom/sina/weibo/sdk/WeiboAppManager;->queryWbInfoByAsset(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v1

    .line 54
    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-eqz v2, :cond_1

    .line 56
    return-object v1

    .line 58
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized getWbAppInfo()Lcom/sina/weibo/sdk/auth/WbAppInfo;
    .locals 2

    monitor-enter p0

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/sina/weibo/sdk/WeiboAppManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/sina/weibo/sdk/WeiboAppManager;->queryWbInfoInternal(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/WeiboAppManager;->wbAppInfo:Lcom/sina/weibo/sdk/auth/WbAppInfo;

    .line 49
    iget-object v0, p0, Lcom/sina/weibo/sdk/WeiboAppManager;->wbAppInfo:Lcom/sina/weibo/sdk/auth/WbAppInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public hasWbInstall()Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 68
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.sina.weibo.action.sdkidentity"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 69
    const-string v0, "android.intent.category.DEFAULT"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    iget-object v0, p0, Lcom/sina/weibo/sdk/WeiboAppManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 71
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
