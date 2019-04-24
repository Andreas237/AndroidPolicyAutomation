.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AUTHORIZE_TIME_OUT:I = 0x4e20

.field private static final sLock:Ljava/lang/Object;


# instance fields
.field LNT_CITY_CODE_TIME_STAMP:Ljava/lang/String;

.field private LNT_CITY_CODE_VALID_TIME:J

.field private aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

.field aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

.field private hasGrantedPermission:Z

.field private final locker:Ljava/lang/Object;

.field private final mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private mLatitude:Ljava/lang/String;

.field private mLongitude:Ljava/lang/String;

.field private runnable:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->sLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const-string v0, "lnt_cityCode_timeStamp"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->LNT_CITY_CODE_TIME_STAMP:Ljava/lang/String;

    .line 57
    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->LNT_CITY_CODE_VALID_TIME:J

    .line 67
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->locker:Ljava/lang/Object;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z

    .line 71
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLongitude:Ljava/lang/String;

    .line 73
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLatitude:Ljava/lang/String;

    .line 327
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mHandler:Landroid/os/Handler;

    .line 354
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$3;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->runnable:Ljava/lang/Runnable;

    .line 362
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    .line 83
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    .line 84
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Z)Z
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/Object;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->locker:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/Runnable;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->runnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Landroid/os/Handler;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Lcom/amap/api/location/LocationManagerProxy;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->stopLocation()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLongitude:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$602(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLongitude:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;D)Ljava/lang/String;
    .locals 1

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->buildLoactionString(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLatitude:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$802(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLatitude:Ljava/lang/String;

    return-object p1
.end method

.method private buildLoactionString(D)Ljava/lang/String;
    .locals 3

    .line 413
    invoke-static {p1, p2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->formatMoneyBySixPoint(D)Ljava/lang/String;

    move-result-object v2

    .line 414
    const-string v0, "-"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 416
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 418
    :cond_0
    return-object v2
.end method

.method private checkLocationPermission()V
    .locals 8

    .line 282
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 283
    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 285
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dsx;->d(Landroid/content/Context;)V

    .line 286
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lo/dsx;->c(Lo/dsx$a;[Ljava/lang/String;)V

    .line 304
    iget-object v5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->locker:Ljava/lang/Object;

    monitor-enter v5

    .line 306
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 310
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->locker:Ljava/lang/Object;

    const-wide/16 v1, 0x4e20

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 311
    goto :goto_1

    .line 313
    :catch_0
    move-exception v6

    .line 315
    const-string v0, "Ger locate permission InterruptedException"

    :try_start_2
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 316
    goto :goto_0

    .line 318
    :cond_0
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    :goto_2
    goto :goto_3

    .line 322
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z

    .line 324
    :goto_3
    return-void
.end method

.method private doLoacating()V
    .locals 0

    .line 331
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->getPositionByMobileNet()V

    .line 332
    return-void
.end method

.method private findCityCode(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 166
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 170
    :cond_1
    const/4 v2, 0x0

    .line 171
    const/4 v3, 0x0

    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    .line 175
    if-nez v6, :cond_2

    .line 177
    goto :goto_0

    .line 179
    :cond_2
    const-string v0, "9000"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 181
    move-object v2, v6

    goto :goto_1

    .line 183
    :cond_3
    const-string v0, "0020"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 185
    move-object v3, v6

    goto :goto_1

    .line 189
    :cond_4
    move-object v4, v6

    .line 191
    :goto_1
    goto :goto_0

    .line 193
    :cond_5
    if-eqz v2, :cond_6

    .line 195
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 198
    :cond_6
    if-eqz v3, :cond_7

    .line 200
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 203
    :cond_7
    if-eqz v4, :cond_8

    .line 205
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 207
    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method

.method private getCityCodeFromSP()Ljava/lang/String;
    .locals 9

    .line 219
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->LNT_CITY_CODE_TIME_STAMP:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getLong(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 220
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 222
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->isLNTCodeValid(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "lnt_city_code"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 228
    :cond_0
    const/4 v8, 0x0

    .line 231
    :goto_0
    return-object v8
.end method

.method private getPositionByMobileNet()V
    .locals 2

    .line 336
    const-string v0, "Enter getPositionByMobileNet"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/amap/api/location/LocationManagerProxy;->getInstance(Landroid/content/Context;)Lcom/amap/api/location/LocationManagerProxy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 339
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$2;-><init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 348
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 352
    :cond_0
    return-void
.end method

.method private isLNTCodeValid(JJ)Z
    .locals 4

    .line 242
    sub-long v0, p3, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    .line 243
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->LNT_CITY_CODE_VALID_TIME:J

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private queryCityAndCardListFromTA(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 254
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v1

    .line 255
    const/4 v2, 0x0

    .line 256
    if-eqz v1, :cond_1

    .line 258
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getBusCityCd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanFour()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 264
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getBusCityCd()Ljava/lang/String;

    move-result-object v2

    .line 267
    :cond_1
    :goto_0
    return-object v2
.end method

.method private savaCityCodeToSP(Ljava/lang/String;)V
    .locals 4

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->LNT_CITY_CODE_TIME_STAMP:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putLong(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 213
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "lnt_city_code"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 214
    return-void
.end method

.method private stopLocation()V
    .locals 2

    .line 401
    const-string v0, "Enter stopLocation"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 403
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    invoke-virtual {v0, v1}, Lcom/amap/api/location/LocationManagerProxy;->removeUpdates(Lcom/amap/api/location/AMapLocationListener;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    invoke-virtual {v0}, Lcom/amap/api/location/LocationManagerProxy;->destroy()V

    .line 407
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 408
    return-void
.end method

.method private updateCityCodeToTA(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 273
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v1

    .line 274
    if-eqz v1, :cond_0

    .line 276
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setDpanFour(Ljava/lang/String;)V

    .line 278
    :cond_0
    return-void
.end method


# virtual methods
.method public queryAppCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    .line 95
    sget-object v6, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->sLock:Ljava/lang/Object;

    monitor-enter v6

    .line 97
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :try_start_0
    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->queryCityAndCardListFromTA(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 98
    const/4 v8, 0x0

    .line 99
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    invoke-static {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->transferServerCityCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 103
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->updateCityCodeToTA(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_0
    monitor-exit v6

    return-object v8

    .line 109
    :cond_1
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->getCityCodeFromSP()Ljava/lang/String;

    move-result-object v7

    .line 110
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 113
    invoke-static {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->transferServerCityCode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 114
    invoke-virtual {v8, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 116
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->savaCityCodeToSP(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    :cond_2
    monitor-exit v6

    return-object v8

    .line 121
    :cond_3
    :try_start_2
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->checkLocationPermission()V

    .line 122
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->hasGrantedPermission:Z

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LocationUtil;->isEnableNetLocation(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    .line 123
    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->doLoacating()V

    .line 128
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v9

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v10

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v11

    .line 132
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLongitude:Ljava/lang/String;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mLatitude:Ljava/lang/String;

    move-object v3, v9

    move-object v4, v10

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryAppCode(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;

    move-result-object v13

    .line 135
    if-eqz v13, :cond_5

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_7

    .line 137
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAppCodeSAOperator queryAppCode failed. resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-nez v13, :cond_6

    const-string v1, "null"

    goto :goto_0

    .line 138
    :cond_6
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->getResultCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 139
    const/4 v7, 0x0

    goto :goto_1

    .line 143
    :cond_7
    const-string v0, "QueryAppCodeSAOperator queryAppCode success."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->getRecommendedCity()Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    move-result-object v14

    .line 145
    if-eqz v14, :cond_8

    .line 147
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 151
    :cond_8
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->getAvailableCity()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->findCityCode(Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    .line 155
    :goto_1
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 157
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->savaCityCodeToSP(Ljava/lang/String;)V

    .line 159
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAppCodeSAOperator queryAppCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 160
    const-string v0, "0020"

    monitor-exit v6

    return-object v0

    .line 161
    :catchall_0
    move-exception v15

    monitor-exit v6

    throw v15
.end method
