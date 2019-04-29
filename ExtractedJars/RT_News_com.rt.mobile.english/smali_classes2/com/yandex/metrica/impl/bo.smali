.class public Lcom/yandex/metrica/impl/bo;
.super Lcom/yandex/metrica/impl/aq;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/kt;

.field private b:Lcom/yandex/metrica/impl/ob/jw;

.field private c:Z

.field private l:Lcom/yandex/metrica/impl/ob/km;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;)V
    .locals 1

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/bm;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/bm;-><init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;)V

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/aq;-><init>(Lcom/yandex/metrica/impl/am;)V

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/bo;->c:Z

    .line 34
    iput-object p1, p0, Lcom/yandex/metrica/impl/bo;->a:Lcom/yandex/metrica/impl/ob/kt;

    .line 35
    iput-object p2, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    .line 36
    iget-object p1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jw;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/bo;->a(Ljava/util/List;)V

    return-void
.end method

.method private static a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 116
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 117
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    return-void
.end method


# virtual methods
.method declared-synchronized C()Z
    .locals 1

    monitor-enter p0

    .line 166
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/bo;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a()Ljava/lang/String;
    .locals 2

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Startup task for component: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->a:Lcom/yandex/metrica/impl/ob/kt;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/kt;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/net/Uri$Builder;)V
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "analytics/startup"

    .line 48
    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "deviceid"

    .line 51
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_platform"

    .line 53
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "protocol_version"

    .line 54
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "analytics_sdk_version_name"

    .line 55
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    .line 56
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->h()Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "model"

    .line 57
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "manufacturer"

    .line 58
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "os_version"

    .line 59
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_width"

    .line 60
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_height"

    .line 61
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->v()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "screen_dpi"

    .line 62
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "scalefactor"

    .line 63
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "locale"

    .line 64
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "device_type"

    .line 65
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->A()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "query_hosts"

    const-string v1, "2"

    .line 66
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "features"

    const/16 v1, 0x11

    .line 67
    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "easy_collecting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "package_info"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "socket"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "permissions_collecting"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "features_collecting"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "foreground_location_collection"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "background_location_collection"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, "telephony_restricted_to_location_tracking"

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, "android_id"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, "google_aid"

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, "wifi_around"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    const-string v2, "wifi_connected"

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "own_macs"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    const-string v2, "cells_around"

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, "sim_info"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    const-string v2, "sim_imei"

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, "access_point"

    const/16 v3, 0x10

    aput-object v2, v1, v3

    .line 68
    invoke-static {v1}, Lcom/yandex/metrica/impl/bp;->b([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 67
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "browsers"

    const-string v1, "1"

    .line 88
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "socket"

    const-string v1, "1"

    .line 89
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_id"

    .line 90
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "foreground_location_collection"

    const-string v1, "1"

    .line 91
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "app_debuggable"

    .line 92
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jw;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "background_location_collection"

    const-string v1, "1"

    .line 94
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jw;->D()Ljava/util/Map;

    move-result-object v0

    .line 98
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->E()Ljava/lang/String;

    move-result-object v1

    .line 99
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 100
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->E()Ljava/lang/String;

    move-result-object v1

    .line 102
    :cond_1
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "distribution_customization"

    const-string v3, "1"

    .line 103
    invoke-virtual {p1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v2, "clids_set"

    .line 104
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/yandex/metrica/impl/bo;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "install_referrer"

    .line 106
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_2
    const-string v0, "uuid"

    .line 110
    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->b:Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/jw;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/yandex/metrica/impl/bo;->a(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "time"

    const-string v1, "1"

    .line 111
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    const-string v0, "requests"

    const-string v1, "1"

    .line 112
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-void
.end method

.method public declared-synchronized b(Z)V
    .locals 0

    monitor-enter p0

    .line 162
    :try_start_0
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/bo;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 161
    monitor-exit p0

    throw p1
.end method

.method public b()Z
    .locals 4

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/bo;->b(Z)V

    const-string v1, "Accept-Encoding"

    const/4 v2, 0x1

    .line 42
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "encrypted"

    aput-object v3, v2, v0

    invoke-virtual {p0, v1, v2}, Lcom/yandex/metrica/impl/bo;->a(Ljava/lang/String;[Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/yandex/metrica/impl/bo;->a:Lcom/yandex/metrica/impl/ob/kt;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kt;->d()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 2

    .line 125
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bo;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0xc8

    .line 127
    iget v1, p0, Lcom/yandex/metrica/impl/bo;->h:I

    if-ne v0, v1, :cond_1

    .line 130
    invoke-super {p0}, Lcom/yandex/metrica/impl/aq;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 132
    sget-object v1, Lcom/yandex/metrica/impl/ob/km;->c:Lcom/yandex/metrica/impl/ob/km;

    iput-object v1, p0, Lcom/yandex/metrica/impl/bo;->l:Lcom/yandex/metrica/impl/ob/km;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public g()V
    .locals 2

    .line 150
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bo;->y()Z

    move-result v0

    if-nez v0, :cond_1

    .line 151
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bo;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    iget-object v0, p0, Lcom/yandex/metrica/impl/bo;->l:Lcom/yandex/metrica/impl/ob/km;

    if-nez v0, :cond_0

    .line 153
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->a:Lcom/yandex/metrica/impl/ob/km;

    iput-object v0, p0, Lcom/yandex/metrica/impl/bo;->l:Lcom/yandex/metrica/impl/ob/km;

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bo;->a:Lcom/yandex/metrica/impl/ob/kt;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bo;->l:Lcom/yandex/metrica/impl/ob/km;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/km;)V

    :cond_1
    return-void
.end method

.method public h()V
    .locals 1

    .line 143
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->b:Lcom/yandex/metrica/impl/ob/km;

    iput-object v0, p0, Lcom/yandex/metrica/impl/bo;->l:Lcom/yandex/metrica/impl/ob/km;

    return-void
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
