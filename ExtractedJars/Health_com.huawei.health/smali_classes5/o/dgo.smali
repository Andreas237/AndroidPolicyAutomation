.class public Lo/dgo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)V
    .locals 8

    .line 83
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-static {p0}, Lo/daz;->c([B)Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_0

    .line 87
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 89
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v5

    .line 90
    iget-object v6, v5, Lo/dba;->b:Ljava/util/List;

    .line 91
    iget-object v7, v5, Lo/dba;->e:Ljava/util/List;

    .line 92
    const/4 v0, 0x1

    aget-byte v0, p0, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    invoke-static {v7, v6}, Lo/dgo;->b(Ljava/util/List;Ljava/util/List;)V

    .line 95
    goto :goto_0

    .line 98
    :pswitch_1
    invoke-static {v7}, Lo/dgo;->b(Ljava/util/List;)V

    .line 99
    goto :goto_0

    .line 102
    :pswitch_2
    invoke-static {v7}, Lo/dgo;->e(Ljava/util/List;)V

    .line 103
    goto :goto_0

    .line 106
    :pswitch_3
    invoke-static {v7}, Lo/dgo;->c(Ljava/util/List;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 116
    :goto_0
    goto :goto_1

    .line 114
    :catch_0
    move-exception v5

    .line 115
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    goto :goto_1

    .line 119
    :cond_0
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/daw;>;)V"
        }
    .end annotation

    .line 173
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 174
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    .line 175
    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    .line 174
    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_0

    .line 176
    return-void

    .line 179
    :cond_0
    const/4 v3, 0x0

    .line 180
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_2

    .line 181
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/daw;

    .line 182
    invoke-virtual {v5}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 184
    :sswitch_0
    invoke-virtual {v5}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 185
    const/4 v3, 0x1

    .line 193
    :cond_1
    :goto_1
    goto :goto_0

    .line 195
    :cond_2
    invoke-static {}, Lo/dgq;->b()Ljava/util/List;

    move-result-object v4

    monitor-enter v4

    .line 196
    :try_start_0
    invoke-static {}, Lo/dgq;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 197
    invoke-static {}, Lo/dgq;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :cond_3
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 200
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static b(Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/daw;>;Ljava/util/List<Lo/dba;>;)V"
        }
    .end annotation

    .line 125
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 126
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1

    .line 127
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v4

    monitor-enter v4

    .line 128
    :try_start_0
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 129
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 130
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 133
    :goto_0
    return-void

    .line 136
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 137
    :cond_2
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processGetGPSLocationParameter tlvFatherList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void

    .line 140
    :cond_3
    new-instance v4, Lcom/huawei/datatype/GpsParameter;

    invoke-direct {v4}, Lcom/huawei/datatype/GpsParameter;-><init>()V

    .line 141
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/daw;

    .line 142
    invoke-virtual {v6}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 144
    :pswitch_0
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/GpsParameter;->setGps_info_bitmap(I)V

    .line 145
    goto :goto_2

    .line 148
    :pswitch_1
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/GpsParameter;->setGps_para_format(I)V

    .line 149
    goto :goto_2

    .line 152
    :pswitch_2
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/GpsParameter;->setGps_para_element_num(I)V

    .line 153
    goto :goto_2

    .line 156
    :pswitch_3
    invoke-virtual {v6}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/datatype/GpsParameter;->setGps_threshold(I)V

    .line 157
    .line 163
    :goto_2
    goto :goto_1

    .line 164
    :cond_4
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v5

    monitor-enter v5

    .line 165
    :try_start_1
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 166
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 167
    invoke-static {}, Lo/dgq;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    :cond_5
    monitor-exit v5

    goto :goto_3

    :catchall_1
    move-exception v7

    monitor-exit v5

    throw v7

    .line 170
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/daw;>;)V"
        }
    .end annotation

    .line 224
    const/4 v2, 0x0

    .line 225
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/daw;

    .line 226
    invoke-virtual {v4}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 228
    :sswitch_0
    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 229
    .line 235
    :goto_1
    goto :goto_0

    .line 236
    :cond_0
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 237
    :try_start_0
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 238
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 239
    invoke-static {}, Lo/dgq;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    :cond_1
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 242
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 7

    .line 36
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/location/LocationManager;

    .line 38
    const-string v0, "gps"

    invoke-virtual {v6, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v4

    .line 39
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isGPSLocationEnable\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    const-string v0, "network"

    invoke-virtual {v6, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    .line 41
    const-string v0, "HWGPSUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNetWorkLocationEnable\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    if-nez v4, :cond_0

    if-eqz v5, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(IJLandroid/location/Location;FLcom/huawei/datatype/GPSStruct;)V
    .locals 3

    .line 47
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 49
    :pswitch_0
    invoke-virtual {p3}, Landroid/location/Location;->getSpeed()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p5, v0}, Lcom/huawei/datatype/GPSStruct;->setGps_speed(I)V

    .line 50
    goto :goto_0

    .line 52
    :pswitch_1
    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr v0, p4

    float-to-int v0, v0

    int-to-long v0, v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_distance(J)V

    .line 53
    goto :goto_0

    .line 55
    :pswitch_2
    invoke-virtual {p3}, Landroid/location/Location;->getAltitude()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p5, v0}, Lcom/huawei/datatype/GPSStruct;->setGps_altitude(I)V

    .line 56
    goto :goto_0

    .line 58
    :pswitch_3
    invoke-virtual {p5, p1, p2}, Lcom/huawei/datatype/GPSStruct;->setGps_total_distance(J)V

    .line 59
    goto :goto_0

    .line 61
    :pswitch_4
    invoke-virtual {p3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_longitude(D)V

    .line 62
    invoke-virtual {p3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_latitude(D)V

    .line 63
    goto :goto_0

    .line 66
    :pswitch_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p3}, Lo/dhr;->e(Landroid/content/Context;Landroid/location/Location;)Landroid/location/Location;

    move-result-object v2

    .line 68
    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_h_longitude(D)V

    .line 69
    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_h_latitude(D)V

    .line 70
    goto :goto_0

    .line 72
    :pswitch_6
    invoke-virtual {p3}, Landroid/location/Location;->getBearing()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_direction(D)V

    .line 73
    goto :goto_0

    .line 75
    :pswitch_7
    invoke-virtual {p3}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p5, v0, v1}, Lcom/huawei/datatype/GPSStruct;->setGps_precision(D)V

    .line 76
    .line 80
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static e(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/daw;>;)V"
        }
    .end annotation

    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/daw;

    .line 205
    invoke-virtual {v4}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 207
    :sswitch_0
    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 208
    .line 214
    :goto_1
    goto :goto_0

    .line 215
    :cond_0
    invoke-static {}, Lo/dgq;->c()Ljava/util/List;

    move-result-object v3

    monitor-enter v3

    .line 216
    :try_start_0
    invoke-static {}, Lo/dgq;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 217
    invoke-static {}, Lo/dgq;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 218
    invoke-static {}, Lo/dgq;->c()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    :cond_1
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5

    .line 221
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch
.end method
