.class public Lo/cdl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 328
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_normal:I

    .line 329
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 331
    :pswitch_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_lower:I

    .line 332
    goto :goto_0

    .line 334
    :pswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_normal:I

    .line 335
    goto :goto_0

    .line 337
    :pswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_higher:I

    .line 338
    .line 342
    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static final a(Ljava/util/ArrayList;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cev;>;)I"
        }
    .end annotation

    .line 181
    const/4 v1, 0x0

    .line 182
    if-eqz p0, :cond_1

    .line 183
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cev;

    .line 184
    invoke-virtual {v3}, Lo/cev;->c()I

    move-result v0

    if-le v0, v1, :cond_0

    .line 185
    invoke-virtual {v3}, Lo/cev;->c()I

    move-result v1

    .line 187
    :cond_0
    goto :goto_0

    .line 189
    :cond_1
    return v1
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 209
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDebugInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.autotrack.debug"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 212
    const-string v0, "debug_info"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    if-eqz p0, :cond_0

    .line 215
    const-string v0, "com.huawei.health.INTERNAL_PERMISSION"

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 217
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .line 348
    if-nez p0, :cond_0

    .line 349
    const/4 v0, 0x0

    return v0

    .line 351
    .line 352
    :cond_0
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ihealthlabs"

    .line 351
    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 353
    if-eqz v2, :cond_1

    const-string v0, "true"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    const/4 v0, 0x1

    return v0

    .line 356
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)Ljava/lang/String;
    .locals 5

    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, p0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 221
    if-nez p0, :cond_0

    .line 222
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeTempFile context is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 226
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 228
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 231
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " delete motion path file fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 233
    :cond_1
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove file: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :cond_2
    :goto_0
    return-void
.end method

.method public static final c(Landroid/content/Context;F)I
    .locals 3

    .line 196
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 197
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static final c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 268
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 269
    invoke-virtual {v1, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Ljava/util/Map;)[Ljava/lang/Float;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)[Ljava/lang/Float;"
        }
    .end annotation

    .line 133
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Float;

    .line 134
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 135
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 136
    const/4 v5, 0x0

    .line 138
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 139
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Float;

    .line 140
    if-nez v5, :cond_0

    .line 141
    move-object v3, v8

    .line 142
    move-object v4, v8

    .line 143
    const/4 v5, 0x1

    .line 145
    :cond_0
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 146
    move-object v4, v8

    .line 148
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 149
    move-object v3, v8

    .line 152
    :cond_2
    goto :goto_0

    .line 153
    :cond_3
    const/4 v0, 0x0

    aput-object v3, v2, v0

    .line 154
    const/4 v0, 0x1

    aput-object v4, v2, v0

    .line 155
    return-object v2
.end method

.method public static d(I)I
    .locals 2

    .line 284
    const/4 v1, 0x0

    .line 285
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 287
    :pswitch_0
    const/4 v1, 0x1

    .line 288
    goto :goto_0

    .line 290
    :pswitch_1
    const/4 v1, 0x3

    .line 291
    goto :goto_0

    .line 293
    :pswitch_2
    const/4 v1, 0x2

    .line 294
    goto :goto_0

    .line 296
    :pswitch_3
    const/4 v1, 0x6

    .line 297
    .line 301
    :goto_0
    :pswitch_4
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method

.method public static final d(Ljava/util/ArrayList;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cev;>;)I"
        }
    .end annotation

    .line 165
    const/4 v1, 0x0

    .line 166
    const/4 v2, 0x0

    .line 167
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 168
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cev;

    .line 169
    invoke-virtual {v4}, Lo/cev;->c()I

    move-result v0

    add-int/2addr v1, v0

    .line 170
    goto :goto_0

    .line 171
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int v2, v1, v0

    .line 173
    :cond_1
    return v2
.end method

.method public static final d(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken<TT;>;)TT;"
        }
    .end annotation

    .line 273
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 274
    const/4 v5, 0x0

    .line 276
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 279
    goto :goto_0

    .line 277
    :catch_0
    move-exception v6

    .line 278
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Gson to List error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    :goto_0
    return-object v5
.end method

.method public static final e(Landroid/content/Context;F)I
    .locals 3

    .line 204
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 205
    div-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static final e(F)Ljava/lang/String;
    .locals 11

    .line 54
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 55
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v8

    .line 56
    div-int/lit8 v9, v7, 0x3c

    .line 57
    rem-int/lit8 v10, v7, 0x3c

    .line 58
    if-nez v8, :cond_0

    .line 59
    const-string v0, ""

    return-object v0

    .line 61
    :cond_0
    const v0, 0x3a83126f    # 0.001f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_1

    .line 62
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_health_show_healthdata_nodata_symbol:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 64
    :cond_1
    invoke-static {v8}, Lo/cxa;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    invoke-static {v7}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 67
    :cond_2
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_show_pace:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v9

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/util/Map;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 81
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 82
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 83
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 85
    if-nez p0, :cond_0

    .line 86
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "paceMap is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/4 v0, 0x0

    return-object v0

    .line 90
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    .line 92
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 95
    const v0, 0x186a0

    if-ge v9, v0, :cond_2

    .line 96
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_2
    const v0, 0x186a0

    div-int v10, v9, v0

    .line 102
    rem-int/lit8 v0, v10, 0x64

    if-eqz v0, :cond_3

    .line 103
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 104
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 107
    :cond_3
    div-int/lit8 v0, v10, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 108
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 110
    :cond_4
    div-int/lit8 v0, v10, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 115
    :cond_6
    const/4 v7, 0x0

    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_8

    .line 116
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 117
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 121
    :cond_8
    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v0

    if-eqz v0, :cond_9

    .line 122
    const-string v0, "Track_CommonUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The validate pacemap"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :cond_9
    return-object v6
.end method

.method public static final e(Ljava/util/ArrayList;)[I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfd;>;)[I"
        }
    .end annotation

    .line 246
    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 247
    const/4 v2, 0x0

    .line 248
    const/4 v3, 0x0

    .line 249
    const/4 v4, 0x0

    .line 250
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 251
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cfd;

    .line 252
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v0

    add-int/2addr v2, v0

    .line 253
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v0

    if-le v0, v3, :cond_0

    .line 254
    invoke-virtual {v6}, Lo/cfd;->c()I

    move-result v3

    .line 256
    :cond_0
    goto :goto_0

    .line 257
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int v4, v2, v0

    .line 259
    :cond_2
    const/4 v0, 0x0

    aput v4, v1, v0

    .line 260
    const/4 v0, 0x1

    aput v3, v1, v0

    .line 261
    const/4 v0, 0x2

    aput v2, v1, v0

    .line 262
    return-object v1
.end method
