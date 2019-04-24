.class public Lcom/huawei/openalliance/ad/e/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/e;


# static fields
.field private static b:Lcom/huawei/openalliance/ad/e/a/e;

.field private static final c:[B


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final d:[B

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

.field private final h:Ljava/lang/String;

.field private final i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/f;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    const-string v0, "HiAdSharedPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sp.config"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    monitor-enter v2

    :try_start_0
    new-instance v0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    new-instance v0, Lcom/huawei/openalliance/ad/e/f$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/f$1;-><init>(Lcom/huawei/openalliance/ad/e/f;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method private H()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "global_switch"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/e/f;Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;)Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    return-object p1
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/e/f;->b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/e/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->h:Ljava/lang/String;

    return-object v0
.end method

.method private a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_0
    return-void
.end method

.method private static b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/f;->c:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/f;->b:Lcom/huawei/openalliance/ad/e/a/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/f;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/f;->b:Lcom/huawei/openalliance/ad/e/a/e;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/f;->b:Lcom/huawei/openalliance/ad/e/a/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/e/f;)[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/e/f;)Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    return-object v0
.end method


# virtual methods
.method public A()I
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "validity_splash_event"

    const/16 v2, 0xb40

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    const v0, 0xea60

    mul-int/2addr v0, v4

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public B()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "validity_click_skip"

    const/16 v2, 0x1e

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public C()I
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "validity_native_event"

    const/16 v2, 0xb40

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    const v0, 0xea60

    mul-int/2addr v0, v4

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public E()Z
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/e/f;->H()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public F()Z
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/e/f;->H()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G()Z
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/e/f;->H()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ae;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_cache_num"

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public a(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "cache_slogan_show_time_def"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public a(J)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "last_clean_disk_time"

    invoke-interface {v2, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v0, "splash_cache_num"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashCacheNum()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "splash_show_time"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashshow()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "splash_show_mode"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashmode()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "splash_skip_area"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashSkipArea()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "slogan_show_time"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSloganShowTime()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "splash_show_time_interval"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashShowTimeInterval()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v0, "slogan_real_min_show_time"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSloganShowMinTimeRealMode()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v0, "splash_app_day_impfc"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getSplashUserAppDayImpFc()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "reduce_disturb_rule"

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getReduceDisturbRule(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v0, "gif_time_upper_limit"

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->n()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getGifTimeUpperLimit(I)I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "gif_time_lower_limit_frame"

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->o()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getGifTimeLowerLimitFrame(I)I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "gif_size_upper_limit"

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->p()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getGifSizeUpperLimit(I)I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "img_size_upper_limit"

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->q()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getImgSizeUpperLimit(I)I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v0, "show_landing_page_menu"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getLandingMenu()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "landpage_app_prompt"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getLandpageAppPrompt()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "config_refresh_interval"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getConfigRefreshInterval()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "config_refresh_last_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v0, "validity_splash_event"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getValidityOfSplashEvent()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "validity_click_skip"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getValidityOfClickSkip()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "validity_lock_event"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getValidityOfLockEvent()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "validity_native_event"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getValidityOfNativeEvent()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "global_switch"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getGlobalSwitch()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    :goto_0
    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    monitor-enter v3

    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getLandpageAppWhiteList()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->updateConfig(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v3

    goto :goto_1

    :catchall_1
    move-exception v6

    monitor-exit v3

    throw v6

    :goto_1
    new-instance v0, Lcom/huawei/openalliance/ad/e/f$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/f$2;-><init>(Lcom/huawei/openalliance/ad/e/f;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "today_date"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->setOpen(Ljava/lang/String;Z)V

    new-instance v0, Lcom/huawei/openalliance/ad/e/f$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/f$3;-><init>(Lcom/huawei/openalliance/ad/e/f;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "enable_user_info"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public b()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_show_time"

    const/16 v2, 0xbb8

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public b(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "today_show_times"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public b(J)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "no_show_ad_time"

    invoke-interface {v2, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/e/f;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "server_store"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "enable_share_pd"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public c(I)J
    .locals 4

    const-wide/32 v2, 0x3200000

    const/4 v0, 0x4

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->p()I

    move-result v0

    int-to-long v2, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->q()I

    move-result v0

    int-to-long v2, v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public c()Lcom/huawei/openalliance/ad/constant/AdLoadMode;
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_show_mode"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v0, 0x1

    if-ne v0, v4, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->REAL:Lcom/huawei/openalliance/ad/constant/AdLoadMode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/e/f;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v0, "pps_store"

    invoke-interface {v2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    :goto_0
    return-void
.end method

.method public d()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_skip_area"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public d(Ljava/lang/String;)Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->checkWhiteList(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public e()J
    .locals 6

    iget-object v4, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "last_clean_disk_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v4

    return-wide v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f;->i:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->g:Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->isOpen(Ljava/lang/String;)Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public f()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "cache_slogan_show_time_def"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public g()I
    .locals 5

    iget-object v2, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v2

    const/16 v3, 0x7d0

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->c()Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/e/f;->f()I

    move-result v3

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "slogan_show_time"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method public h()J
    .locals 6

    iget-object v4, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_show_time_interval"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v4

    return-wide v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public i()J
    .locals 6

    iget-object v4, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "slogan_real_min_show_time"

    const-wide/16 v2, 0x12c

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v4

    return-wide v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public j()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "splash_app_day_impfc"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public k()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "today_show_times"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public l()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "today_date"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public m()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "reduce_disturb_rule"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public n()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "gif_time_upper_limit"

    const/16 v2, 0x1f40

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public o()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "gif_time_lower_limit_frame"

    const/16 v2, 0x64

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public p()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "gif_size_upper_limit"

    const/high16 v2, 0x6400000

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public q()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "img_size_upper_limit"

    const/high16 v2, 0x3200000

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public r()Z
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "enable_user_info"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public s()Z
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "enable_share_pd"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public t()J
    .locals 6

    iget-object v4, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "no_show_ad_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v4

    return-wide v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public u()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "server_store"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->e:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public v()Ljava/lang/String;
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "pps_store"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->f:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public w()Z
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "show_landing_page_menu"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v3

    return v0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public x()Z
    .locals 6

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "landpage_app_prompt"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v3

    return v0

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method

.method public y()I
    .locals 5

    iget-object v3, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "config_refresh_interval"

    const/16 v2, 0x168

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v3

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public z()J
    .locals 6

    iget-object v4, p0, Lcom/huawei/openalliance/ad/e/f;->d:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f;->a:Landroid/content/SharedPreferences;

    const-string v1, "config_refresh_last_time"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v4

    return-wide v0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method
