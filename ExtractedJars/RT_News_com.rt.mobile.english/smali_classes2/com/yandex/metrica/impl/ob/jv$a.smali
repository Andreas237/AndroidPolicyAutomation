.class public final Lcom/yandex/metrica/impl/ob/jv$a;
.super Lcom/yandex/metrica/impl/ob/jq$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final e:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final f:Landroid/location/Location;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final g:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final h:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final i:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final j:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final k:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final l:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final m:Lcom/yandex/metrica/CounterConfiguration$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Landroid/location/Location;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/metrica/CounterConfiguration$a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Lcom/yandex/metrica/CounterConfiguration$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 319
    invoke-direct {p0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/jq$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    .line 321
    iput-object p5, p0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    .line 322
    iput-object p6, p0, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    .line 323
    iput-object p7, p0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    .line 324
    iput-object p8, p0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    .line 325
    iput-object p9, p0, Lcom/yandex/metrica/impl/ob/jv$a;->m:Lcom/yandex/metrica/CounterConfiguration$a;

    .line 326
    iput-object p10, p0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    .line 327
    iput-object p11, p0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    .line 328
    iput-object p12, p0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    .line 329
    iput-object p13, p0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_26

    .line 386
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_a

    .line 387
    :cond_1
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/jq$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 389
    :cond_2
    check-cast p1, Lcom/yandex/metrica/impl/ob/jv$a;

    .line 391
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    if-eqz v2, :cond_4

    :goto_0
    return v1

    .line 392
    :cond_4
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    .line 393
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    if-eqz v2, :cond_6

    :goto_1
    return v1

    .line 396
    :cond_6
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    .line 397
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_7
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    if-eqz v2, :cond_8

    :goto_2
    return v1

    .line 400
    :cond_8
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    .line 401
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_9
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    if-eqz v2, :cond_a

    :goto_3
    return v1

    .line 404
    :cond_a
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->m:Lcom/yandex/metrica/CounterConfiguration$a;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->m:Lcom/yandex/metrica/CounterConfiguration$a;

    if-eq v2, v3, :cond_b

    return v1

    .line 406
    :cond_b
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_4

    :cond_c
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    if-eqz v2, :cond_d

    :goto_4
    return v1

    .line 408
    :cond_d
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    if-eqz v2, :cond_e

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_5

    :cond_e
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    if-eqz v2, :cond_f

    :goto_5
    return v1

    .line 410
    :cond_f
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_6

    :cond_10
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    if-eqz v2, :cond_11

    :goto_6
    return v1

    .line 412
    :cond_11
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    if-eqz v2, :cond_12

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_7

    :cond_12
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    if-eqz v2, :cond_13

    :goto_7
    return v1

    .line 414
    :cond_13
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    if-ne v2, p1, :cond_14

    return v0

    :cond_14
    if-eqz v2, :cond_25

    if-nez p1, :cond_15

    goto/16 :goto_9

    .line 1253
    :cond_15
    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_16

    return v1

    :cond_16
    const/16 v3, 0x11

    .line 1254
    invoke-static {v3}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 1255
    invoke-virtual {v2}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v3

    invoke-virtual {p1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-eqz v7, :cond_17

    return v1

    .line 1257
    :cond_17
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_18

    return v1

    .line 1258
    :cond_18
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_19

    return v1

    .line 1259
    :cond_19
    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v3

    invoke-virtual {v2}, Landroid/location/Location;->getAltitude()D

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v3

    if-eqz v3, :cond_1a

    return v1

    .line 1260
    :cond_1a
    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v3

    invoke-virtual {v2}, Landroid/location/Location;->getSpeed()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_1b

    return v1

    .line 1261
    :cond_1b
    invoke-virtual {p1}, Landroid/location/Location;->getBearing()F

    move-result v3

    invoke-virtual {v2}, Landroid/location/Location;->getBearing()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_1c

    return v1

    .line 1262
    :cond_1c
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_1d

    return v1

    :cond_1d
    const/16 v3, 0x1a

    .line 1263
    invoke-static {v3}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 1264
    invoke-virtual {p1}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v3

    .line 1265
    invoke-virtual {v2}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v4

    .line 1264
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_1e

    return v1

    .line 1268
    :cond_1e
    invoke-virtual {p1}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v3

    .line 1269
    invoke-virtual {v2}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v4

    .line 1268
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_1f

    return v1

    .line 1272
    :cond_1f
    invoke-virtual {p1}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    move-result v3

    .line 1273
    invoke-virtual {v2}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    move-result v4

    .line 1272
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_20

    return v1

    .line 1277
    :cond_20
    invoke-virtual {v2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_21

    .line 1278
    invoke-virtual {v2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_8

    .line 1279
    :cond_21
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_22

    :goto_8
    return v1

    .line 1280
    :cond_22
    invoke-virtual {v2}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_23

    .line 1281
    invoke-virtual {v2}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1282
    :cond_23
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_24

    return v0

    :cond_24
    return v1

    :cond_25
    :goto_9
    return v1

    :cond_26
    :goto_a
    return v1
.end method

.method public hashCode()I
    .locals 11

    .line 419
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/jq$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 420
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 421
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->e:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 422
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->f:Landroid/location/Location;

    .line 2211
    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    mul-int/lit8 v3, v3, 0x1f

    .line 2212
    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v6

    const/16 v8, 0x20

    ushr-long/2addr v6, v8

    xor-long v9, v4, v6

    long-to-int v4, v9

    add-int/2addr v3, v4

    const/16 v4, 0x11

    .line 2214
    invoke-static {v4}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v4

    if-eqz v4, :cond_3

    mul-int/lit8 v3, v3, 0x1f

    .line 2216
    invoke-virtual {v1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v4

    invoke-virtual {v1}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    move-result-wide v6

    ushr-long/2addr v6, v8

    xor-long v9, v4, v6

    long-to-int v4, v9

    add-int/2addr v3, v4

    .line 2218
    :cond_3
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    mul-int/lit8 v3, v3, 0x1f

    ushr-long v6, v4, v8

    xor-long v9, v4, v6

    long-to-int v4, v9

    add-int/2addr v3, v4

    .line 2220
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    mul-int/lit8 v3, v3, 0x1f

    ushr-long v6, v4, v8

    xor-long v9, v4, v6

    long-to-int v4, v9

    add-int/2addr v3, v4

    .line 2222
    invoke-virtual {v1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    mul-int/lit8 v3, v3, 0x1f

    ushr-long v6, v4, v8

    xor-long v8, v4, v6

    long-to-int v4, v8

    add-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x1f

    .line 2225
    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_4

    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_3

    :cond_4
    move v4, v2

    :goto_3
    add-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x1f

    .line 2227
    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    move-result v4

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_5

    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_4

    :cond_5
    move v4, v2

    :goto_4
    add-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x1f

    .line 2229
    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_6

    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_5

    :cond_6
    move v4, v2

    :goto_5
    add-int/2addr v3, v4

    const/16 v4, 0x1a

    .line 2230
    invoke-static {v4}, Lcom/yandex/metrica/impl/br;->a(I)Z

    move-result v4

    if-eqz v4, :cond_a

    mul-int/lit8 v3, v3, 0x1f

    .line 2231
    invoke-virtual {v1}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v4

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_7

    .line 2232
    invoke-virtual {v1}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_6

    :cond_7
    move v4, v2

    :goto_6
    add-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x1f

    .line 2234
    invoke-virtual {v1}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v4

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_8

    .line 2235
    invoke-virtual {v1}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_7

    :cond_8
    move v4, v2

    :goto_7
    add-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x1f

    .line 2237
    invoke-virtual {v1}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    move-result v4

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_9

    .line 2238
    invoke-virtual {v1}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto :goto_8

    :cond_9
    move v4, v2

    :goto_8
    add-int/2addr v3, v4

    :cond_a
    mul-int/lit8 v3, v3, 0x1f

    .line 2241
    invoke-virtual {v1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_9

    :cond_b
    move v1, v2

    :goto_9
    add-int/2addr v1, v3

    goto :goto_a

    :cond_c
    move v1, v2

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 423
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->g:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    goto :goto_b

    :cond_d
    move v1, v2

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 424
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    if-eqz v1, :cond_e

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->h:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    goto :goto_c

    :cond_e
    move v1, v2

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 425
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->m:Lcom/yandex/metrica/CounterConfiguration$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/CounterConfiguration$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 426
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    if-eqz v1, :cond_f

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    goto :goto_d

    :cond_f
    move v1, v2

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 427
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    if-eqz v1, :cond_10

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->j:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    goto :goto_e

    :cond_10
    move v1, v2

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 428
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->k:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    goto :goto_f

    :cond_11
    move v1, v2

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 429
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jv$a;->l:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :cond_12
    add-int/2addr v0, v2

    return v0
.end method
