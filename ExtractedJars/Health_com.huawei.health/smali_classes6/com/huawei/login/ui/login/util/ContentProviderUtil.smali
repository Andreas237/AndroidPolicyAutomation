.class public Lcom/huawei/login/ui/login/util/ContentProviderUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final COUNTRY_CODE:Ljava/lang/String; = "country_code"

.field private static DEVICE_ID:Ljava/lang/String; = null

.field private static DEVICE_TYPE:Ljava/lang/String; = null

.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field private static final SERVICE_COUNTRY_CODE:Ljava/lang/String; = "service_country_code"

.field private static final TAG:Ljava/lang/String; = "ContentProviderUtil"

.field private static mContext:Landroid/content/Context; = null

.field private static mcontentProviderUtil:Lcom/huawei/login/ui/login/util/ContentProviderUtil; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mcontentProviderUtil:Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    .line 19
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->LOCK_OBJECT:Ljava/lang/Object;

    .line 26
    const-string v0, "device_id"

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_ID:Ljava/lang/String;

    .line 28
    const-string v0, "device_type"

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_TYPE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;
    .locals 4

    .line 31
    sget-object v2, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v2

    .line 32
    :try_start_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 33
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    .line 35
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mcontentProviderUtil:Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 36
    new-instance v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    invoke-direct {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mcontentProviderUtil:Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    .line 38
    :cond_1
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mcontentProviderUtil:Lcom/huawei/login/ui/login/util/ContentProviderUtil;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 39
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public getCountryCode()Ljava/lang/String;
    .locals 5

    .line 63
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 64
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const/4 v0, 0x0

    return-object v0

    .line 67
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "country_code"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lo/dcn;->a(Ljava/lang/String;Lo/dcy;)Ljava/lang/String;

    move-result-object v4

    .line 68
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCountryCode completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-object v4
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 5

    .line 150
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 151
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    sget-object v1, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_ID:Ljava/lang/String;

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lo/dcn;->a(Ljava/lang/String;Lo/dcy;)Ljava/lang/String;

    move-result-object v4

    .line 155
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceId completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-object v4
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 5

    .line 120
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 121
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    sget-object v1, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 125
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-object v4
.end method

.method public getServiceCountryCode()Ljava/lang/String;
    .locals 5

    .line 89
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 90
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "service_country_code"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lo/dcn;->a(Ljava/lang/String;Lo/dcy;)Ljava/lang/String;

    move-result-object v4

    .line 94
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getServiceCountryCode completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-object v4
.end method

.method public setCountryCode(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 49
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 50
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 53
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "country_code"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, p1, v2, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 54
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCountryCode completed, country is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 136
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 137
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_0
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/LoginCache;->configDeviceId(Ljava/lang/String;)V

    .line 141
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    sget-object v1, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_ID:Ljava/lang/String;

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, p1, v2, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 142
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDeviceId completed, deviceId is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 105
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 106
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    return-void

    .line 109
    :cond_0
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/LoginCache;->configDeviceType(Ljava/lang/String;)V

    .line 110
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    sget-object v1, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->DEVICE_TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 111
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCountryCode completed, deviceType is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    return-void
.end method

.method public setServiceCountryCode(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 80
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 81
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void

    .line 84
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "service_country_code"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-virtual {v0, v1, p1, v2, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 85
    const-string v0, "ContentProviderUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setServiceCountryCode completed, serviceCountryCode is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void
.end method
