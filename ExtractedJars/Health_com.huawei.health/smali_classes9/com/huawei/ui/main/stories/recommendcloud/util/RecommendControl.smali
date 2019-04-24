.class public Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field public static final RECOMMEND_SERVICE_MUSIC:Ljava/lang/String; = "1"

.field public static final RECOMMEND_SERVICE_TRAIN:Ljava/lang/String; = "2"

.field private static final TAG:Ljava/lang/String; = "RecommendControl"

.field private static mContext:Landroid/content/Context; = null

.field private static mRecommendControl:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl; = null


# instance fields
.field private mCoreSleepTagConfig:Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

.field private mNotificationDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepNoticationData;>;"
        }
    .end annotation
.end field

.field private smartCardCoreSleepTime:Ljava/lang/String;

.field private smartCardRecommendSleepTime:Ljava/lang/String;

.field private smartCardRecommendSleepTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->LOCK_OBJECT:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mCoreSleepTagConfig:Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    .line 56
    return-void
.end method

.method private getAssetString()Ljava/lang/String;
    .locals 12

    .line 213
    const-string v4, "sleep/CoreSleepTagConfigNew.txt"

    .line 214
    const-string v5, ""

    .line 215
    const/4 v6, 0x0

    .line 217
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 218
    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    move-result v7

    .line 219
    new-array v8, v7, [B

    .line 220
    invoke-virtual {v6, v8}, Ljava/io/InputStream;->read([B)I

    move-result v9

    .line 221
    if-lez v9, :cond_0

    .line 222
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v8, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v0

    .line 227
    :cond_0
    if-eqz v6, :cond_2

    .line 229
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 232
    goto :goto_1

    .line 230
    :catch_0
    move-exception v7

    .line 231
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    goto :goto_1

    .line 224
    :catch_1
    move-exception v7

    .line 225
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    if-eqz v6, :cond_2

    .line 229
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 232
    goto :goto_1

    .line 230
    :catch_2
    move-exception v7

    .line 231
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    goto :goto_1

    .line 227
    :catchall_0
    move-exception v10

    if-eqz v6, :cond_1

    .line 229
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 232
    goto :goto_0

    .line 230
    :catch_3
    move-exception v11

    .line 231
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :cond_1
    :goto_0
    throw v10

    .line 235
    :cond_2
    :goto_1
    return-object v5
.end method

.method private getRecommendServiceString()Ljava/lang/String;
    .locals 4

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sleepServiceConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "CoreSleepTagConfigNew.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 102
    return-object v3
.end method

.method public static newInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;
    .locals 4

    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mContext:Landroid/content/Context;

    .line 43
    sget-object v2, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v2

    .line 44
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 45
    sput-object p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mContext:Landroid/content/Context;

    .line 47
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mRecommendControl:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 48
    new-instance v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mRecommendControl:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;

    .line 50
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mRecommendControl:Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 51
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private setData(Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;)V
    .locals 4

    .line 272
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setData SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardCoreSleepTime:Ljava/lang/String;

    .line 274
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getRecommondSleepTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardRecommendSleepTime:Ljava/lang/String;

    .line 275
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getRecommondSleepTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardRecommendSleepTitle:Ljava/lang/String;

    .line 276
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getNoticationDataList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mNotificationDataList:Ljava/util/List;

    .line 277
    return-void
.end method


# virtual methods
.method public getCoreSleepServiceData(Ljava/lang/String;Z)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Z)Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;>;"
        }
    .end annotation

    .line 107
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sleepRecommendData: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isMode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-string v4, ""

    .line 109
    if-eqz p2, :cond_0

    .line 110
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    rem-int/lit8 v0, v0, 0x7

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 112
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getSleepRecommendData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    move-result-object v5

    .line 117
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getRecommendServiceString()Ljava/lang/String;

    move-result-object v6

    .line 118
    const-class v0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;

    invoke-static {v6, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;

    .line 119
    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;->getSleepZoneConfig()Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->getServiceList()Ljava/util/List;

    move-result-object v8

    .line 120
    const-string v9, ""

    .line 121
    const-string v10, ""

    .line 122
    if-eqz v5, :cond_1

    .line 123
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    .line 125
    :cond_1
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "defaultSleepRecommendData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :goto_0
    if-nez p2, :cond_4

    .line 128
    const/4 v11, 0x0

    .line 129
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    .line 130
    const/4 v13, 0x0

    :goto_1
    if-ge v13, v12, :cond_3

    .line 131
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;

    .line 132
    invoke-virtual {v14}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {v14}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getStyle()Ljava/lang/String;

    move-result-object v9

    .line 134
    const/4 v11, 0x1

    .line 130
    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 137
    :cond_3
    if-nez v11, :cond_4

    .line 138
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getStyle()Ljava/lang/String;

    move-result-object v9

    .line 142
    :cond_4
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 143
    const/4 v12, 0x0

    .line 144
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    .line 145
    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_a

    .line 146
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;

    .line 147
    if-eqz p2, :cond_6

    .line 148
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 149
    new-instance v16, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;-><init>()V

    .line 150
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setUrl(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setTitle(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getImg()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setImageUrl(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getDescription()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setDescription(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 155
    const-string v0, "2"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setCategory(Ljava/lang/String;)V

    goto :goto_3

    .line 157
    :cond_5
    const-string v0, "1"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setCategory(Ljava/lang/String;)V

    .line 159
    :goto_3
    move-object/from16 v0, v16

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    goto/16 :goto_5

    .line 162
    :cond_6
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getStyle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 164
    new-instance v16, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;-><init>()V

    .line 165
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setUrl(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setTitle(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getImg()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setImageUrl(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getDescription()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setDescription(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sport"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 170
    const-string v0, "2"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setCategory(Ljava/lang/String;)V

    goto :goto_4

    .line 172
    :cond_7
    const-string v0, "1"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->setCategory(Ljava/lang/String;)V

    .line 174
    :goto_4
    invoke-virtual {v15}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$ServiceListBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 175
    move-object/from16 v12, v16

    goto :goto_5

    .line 177
    :cond_8
    move-object/from16 v0, v16

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_9
    :goto_5
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_2

    .line 182
    :cond_a
    if-nez p2, :cond_c

    .line 183
    const/4 v0, 0x0

    invoke-interface {v11, v0, v12}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 184
    if-eqz v12, :cond_b

    .line 185
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "positonData: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_6

    .line 187
    :cond_b
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positionData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    :goto_6
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "style :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " sleepRecommendDataList:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :cond_c
    return-object v11

    .line 192
    :catch_0
    move-exception v6

    .line 193
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " error message :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x0

    return-object v0
.end method

.method public getInfoList()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean$InfoListBean;>;"
        }
    .end annotation

    .line 200
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->getAssetString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;

    .line 201
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 202
    if-eqz v2, :cond_0

    .line 203
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData;->getSleepZoneConfig()Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepServiceData$SleepZoneConfigBean;->getInfoList()Ljava/util/List;

    move-result-object v4

    .line 204
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    const/4 v0, 0x2

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    const/4 v0, 0x3

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    :cond_0
    return-object v3
.end method

.method public getNotificationDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepNoticationData;>;"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mNotificationDataList:Ljava/util/List;

    return-object v0
.end method

.method public getSleepRecommendData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;
    .locals 7

    .line 63
    const/4 v4, 0x0

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mCoreSleepTagConfig:Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    if-nez v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->initCoreSleepTagConfig()Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    move-result-object v4

    goto :goto_0

    .line 67
    :cond_0
    iget-object v4, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mCoreSleepTagConfig:Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    .line 70
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 71
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != coreSleepTagConfig "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTagList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTagList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 74
    const-string v0, "RecommendControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " size \uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTagList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, "RecommendControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coreSleepTagConfig.getModule_name \uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getModule_name()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTagList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    .line 80
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getSuggestion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "perfect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-object v6

    .line 84
    :cond_1
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;->getCoreSleepTagList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;

    .line 87
    const-string v0, "RecommendControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepData.suggestion :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/recommendcloud/data/SleepRecommendData;->getSuggestion()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no used sleepData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-object v5

    .line 92
    :cond_3
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coreSleepTagConfig is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x0

    return-object v0

    .line 96
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSmartCardCoreSleepTime()Ljava/lang/String;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardCoreSleepTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSmartCardRecommendSleepTime()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardRecommendSleepTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSmartCardRecommendSleepTitle()Ljava/lang/String;
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->smartCardRecommendSleepTitle:Ljava/lang/String;

    return-object v0
.end method

.method public initCoreSleepTagConfig()Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;
    .locals 8

    .line 245
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sleepServiceConfig"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 247
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCoreSleepTagConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "CoreSleepTagConfig.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 250
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    const-string v0, "RecommendControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCoreSleepTagConfig str is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    const/4 v0, 0x0

    return-object v0

    .line 254
    :cond_0
    const/4 v6, 0x0

    .line 257
    :try_start_0
    const-class v0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;

    move-object v6, v0

    .line 258
    iput-object v6, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->mCoreSleepTagConfig:Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 263
    goto :goto_0

    .line 259
    :catch_0
    move-exception v7

    .line 260
    const-string v0, "RecommendControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCoreSleepTagConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    goto :goto_0

    .line 261
    :catch_1
    move-exception v7

    .line 262
    const-string v0, "RecommendControl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCoreSleepTagConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    :goto_0
    if-eqz v6, :cond_1

    .line 265
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/RecommendControl;->setData(Lcom/huawei/ui/main/stories/recommendcloud/config/CoreSleepTagConfig;)V

    .line 267
    :cond_1
    return-object v6
.end method
