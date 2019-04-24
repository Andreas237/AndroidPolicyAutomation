.class public Lo/cdt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhi;


# instance fields
.field private a:Landroid/location/Location;

.field private b:[I

.field private c:[I

.field private d:J

.field private e:J

.field private f:I

.field private g:J

.field private h:J

.field private i:J

.field private final k:Ljava/lang/Object;

.field private l:J

.field private m:J

.field private n:J

.field private o:I

.field private p:J

.field private t:J

.field private u:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cdt;->k:Ljava/lang/Object;

    .line 36
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->h:J

    .line 37
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->i:J

    .line 38
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->l:J

    .line 39
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->m:J

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->n:J

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->p:J

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/cdt;->o:I

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->t:J

    .line 44
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->u:J

    .line 47
    const/16 v0, 0x15

    new-array v0, v0, [I

    iput-object v0, p0, Lo/cdt;->c:[I

    .line 48
    const/16 v0, 0xb

    new-array v0, v0, [I

    iput-object v0, p0, Lo/cdt;->b:[I

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cdt;->t:J

    .line 50
    return-void
.end method

.method private b(II)V
    .locals 8

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 82
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 84
    :pswitch_0
    iget-wide v0, p0, Lo/cdt;->p:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->p:J

    .line 85
    goto :goto_0

    .line 87
    :pswitch_1
    iget-wide v0, p0, Lo/cdt;->h:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->h:J

    .line 88
    goto :goto_0

    .line 90
    :pswitch_2
    iget-wide v0, p0, Lo/cdt;->i:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->i:J

    .line 91
    goto :goto_0

    .line 93
    :pswitch_3
    iget-wide v0, p0, Lo/cdt;->l:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->l:J

    .line 94
    goto :goto_0

    .line 96
    :pswitch_4
    iget-wide v0, p0, Lo/cdt;->m:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->m:J

    .line 97
    goto :goto_0

    .line 99
    :pswitch_5
    iget-wide v0, p0, Lo/cdt;->n:J

    iget-wide v2, p0, Lo/cdt;->t:J

    sub-long v2, v6, v2

    iget-wide v4, p0, Lo/cdt;->u:J

    sub-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/cdt;->n:J

    .line 100
    .line 104
    :goto_0
    :pswitch_6
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->u:J

    .line 105
    iput-wide v6, p0, Lo/cdt;->t:J

    .line 106
    iput p2, p0, Lo/cdt;->o:I

    .line 107
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private c(Landroid/location/GpsStatus;)I
    .locals 10

    .line 111
    invoke-virtual {p1}, Landroid/location/GpsStatus;->getMaxSatellites()I

    move-result v4

    .line 112
    const/4 v0, 0x4

    if-ge v4, v0, :cond_0

    .line 113
    const/4 v0, 0x3

    return v0

    .line 116
    :cond_0
    const/4 v5, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 121
    :try_start_0
    invoke-virtual {p1}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 122
    invoke-virtual {p1}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 124
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 125
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/location/GpsSatellite;

    .line 126
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Landroid/location/GpsSatellite;->usedInFix()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 127
    invoke-virtual {v9}, Landroid/location/GpsSatellite;->getSnr()F
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/high16 v1, 0x420c0000    # 35.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 128
    add-int/lit8 v6, v6, 0x1

    .line 129
    const/4 v0, 0x4

    if-lt v6, v0, :cond_1

    .line 130
    const/4 v0, 0x6

    return v0

    .line 132
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 133
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 134
    :cond_2
    :try_start_1
    invoke-virtual {v9}, Landroid/location/GpsSatellite;->getSnr()F

    move-result v0

    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    .line 135
    add-int/lit8 v5, v5, 0x1

    .line 136
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 137
    :cond_3
    invoke-virtual {v9}, Landroid/location/GpsSatellite;->getSnr()F
    :try_end_1
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_4

    .line 138
    add-int/lit8 v7, v7, 0x1

    .line 141
    :cond_4
    :goto_1
    goto :goto_0

    .line 145
    :cond_5
    goto :goto_2

    .line 143
    :catch_0
    move-exception v9

    .line 144
    const-string v0, "Track_GPSPointBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/util/NoSuchElementException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_2
    const/4 v0, 0x4

    if-lt v5, v0, :cond_6

    .line 148
    const/4 v0, 0x5

    return v0

    .line 149
    :cond_6
    if-lez v7, :cond_7

    .line 150
    const/4 v0, 0x4

    return v0

    .line 152
    :cond_7
    const/4 v0, 0x3

    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 6

    .line 206
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 207
    const-string v0, "gpsAccArray"

    iget-object v1, p0, Lo/cdt;->c:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const-string v0, "gpsTimeArray"

    iget-object v1, p0, Lo/cdt;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const-string v0, "gpsLostCount"

    iget v1, p0, Lo/cdt;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const-string v0, "gpsLostTotalTime"

    iget-wide v1, p0, Lo/cdt;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    invoke-virtual {p0}, Lo/cdt;->a()[J

    move-result-object v5

    .line 212
    const-string v0, "gpsStateStat"

    invoke-static {v5}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->hB:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 214
    const-string v0, "Track_GPSPointBIUtil"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/cdt;->c:[I

    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cdt;->b:[I

    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p0, Lo/cdt;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cdt;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    return-void
.end method

.method public a()[J
    .locals 5

    .line 53
    const/4 v0, 0x6

    new-array v4, v0, [J

    iget-wide v0, p0, Lo/cdt;->p:J

    const/4 v2, 0x0

    aput-wide v0, v4, v2

    iget-wide v0, p0, Lo/cdt;->h:J

    const/4 v2, 0x1

    aput-wide v0, v4, v2

    iget-wide v0, p0, Lo/cdt;->i:J

    const/4 v2, 0x2

    aput-wide v0, v4, v2

    iget-wide v0, p0, Lo/cdt;->l:J

    const/4 v2, 0x3

    aput-wide v0, v4, v2

    iget-wide v0, p0, Lo/cdt;->m:J

    const/4 v2, 0x4

    aput-wide v0, v4, v2

    iget-wide v0, p0, Lo/cdt;->n:J

    const/4 v2, 0x5

    aput-wide v0, v4, v2

    .line 54
    const-string v0, "Track_GPSPointBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-object v4
.end method

.method public b()V
    .locals 8

    .line 163
    iget-object v4, p0, Lo/cdt;->k:Ljava/lang/Object;

    monitor-enter v4

    .line 164
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lo/cdt;->d:J

    sub-long v5, v0, v2

    .line 165
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gez v0, :cond_0

    .line 166
    const-wide/16 v5, 0x0

    .line 168
    :cond_0
    iget-wide v0, p0, Lo/cdt;->e:J

    add-long/2addr v0, v5

    iput-wide v0, p0, Lo/cdt;->e:J

    .line 169
    iget-wide v0, p0, Lo/cdt;->u:J

    add-long/2addr v0, v5

    iput-wide v0, p0, Lo/cdt;->u:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 171
    :goto_0
    return-void
.end method

.method public b(Landroid/location/GpsStatus;)V
    .locals 3

    .line 60
    if-nez p1, :cond_0

    .line 62
    iget v0, p0, Lo/cdt;->o:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 63
    iget v0, p0, Lo/cdt;->o:I

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/cdt;->b(II)V

    goto :goto_0

    .line 66
    :cond_0
    invoke-direct {p0, p1}, Lo/cdt;->c(Landroid/location/GpsStatus;)I

    move-result v2

    .line 67
    iget v0, p0, Lo/cdt;->o:I

    if-eq v2, v0, :cond_1

    .line 68
    iget v0, p0, Lo/cdt;->o:I

    invoke-direct {p0, v0, v2}, Lo/cdt;->b(II)V

    .line 71
    :cond_1
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 75
    iget v0, p0, Lo/cdt;->o:I

    if-eq v0, p1, :cond_0

    .line 76
    iget v0, p0, Lo/cdt;->o:I

    invoke-direct {p0, v0, p1}, Lo/cdt;->b(II)V

    .line 78
    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 157
    iget-object v2, p0, Lo/cdt;->k:Ljava/lang/Object;

    monitor-enter v2

    .line 158
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cdt;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 160
    :goto_0
    return-void
.end method

.method public e(Landroid/location/Location;)V
    .locals 11

    .line 174
    iget-object v4, p0, Lo/cdt;->k:Ljava/lang/Object;

    monitor-enter v4

    .line 175
    if-eqz p1, :cond_0

    const-string v0, "network"

    :try_start_0
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 176
    :cond_0
    monitor-exit v4

    return-void

    .line 178
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v5

    .line 179
    const/high16 v0, 0x40a00000    # 5.0f

    div-float v0, v5, v0

    float-to-int v6, v0

    .line 180
    const/16 v0, 0x14

    if-le v6, v0, :cond_2

    .line 181
    const/16 v6, 0x14

    goto :goto_0

    .line 182
    :cond_2
    if-gez v6, :cond_3

    .line 183
    const/4 v6, 0x0

    .line 185
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/cdt;->c:[I

    aget v1, v0, v6

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, v6

    .line 186
    iget-object v0, p0, Lo/cdt;->a:Landroid/location/Location;

    if-eqz v0, :cond_7

    .line 187
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v0

    iget-object v2, p0, Lo/cdt;->a:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lo/cdt;->e:J

    sub-long v7, v0, v2

    .line 188
    const-wide/16 v0, 0x4e20

    cmp-long v0, v7, v0

    if-ltz v0, :cond_4

    .line 189
    iget v0, p0, Lo/cdt;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdt;->f:I

    .line 190
    iget-wide v0, p0, Lo/cdt;->g:J

    add-long/2addr v0, v7

    iput-wide v0, p0, Lo/cdt;->g:J

    .line 192
    :cond_4
    const-wide/16 v0, 0x3e8

    div-long v0, v7, v0

    long-to-int v9, v0

    .line 193
    const/16 v0, 0xa

    if-le v9, v0, :cond_5

    .line 194
    const/16 v9, 0xa

    goto :goto_1

    .line 195
    :cond_5
    if-gez v9, :cond_6

    .line 196
    const/4 v9, 0x0

    .line 198
    :cond_6
    :goto_1
    iget-object v0, p0, Lo/cdt;->b:[I

    aget v1, v0, v9

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, v9

    .line 199
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cdt;->e:J

    .line 201
    :cond_7
    iput-object p1, p0, Lo/cdt;->a:Landroid/location/Location;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 203
    :goto_2
    return-void
.end method
