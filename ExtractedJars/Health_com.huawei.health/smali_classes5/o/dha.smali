.class public Lo/dha;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DI)I
    .locals 11

    .line 70
    const/4 v4, 0x0

    .line 71
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, p0

    if-eqz v0, :cond_1

    .line 72
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "HH"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 73
    new-instance v0, Ljava/util/Date;

    double-to-long v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 74
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "mm"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 75
    new-instance v0, Ljava/util/Date;

    double-to-long v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 80
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v8, v0

    .line 81
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v9, v0

    .line 84
    goto :goto_0

    .line 82
    :catch_0
    move-exception v10

    .line 83
    const-string v0, "HWHealthDataMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calTime NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_0
    const-string v0, "HWHealthDataMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",hour = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",min = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    const/16 v0, 0xc

    if-ge v8, v0, :cond_0

    .line 87
    add-int/lit8 v8, v8, 0x18

    .line 90
    :cond_0
    mul-int/lit8 v0, v8, 0x3c

    add-int v4, v0, v9

    .line 92
    const-string v0, "HWHealthDataMgrUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :cond_1
    return v4
.end method

.method public static a(I)I
    .locals 2

    .line 185
    const/4 v1, 0x0

    .line 187
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 189
    :pswitch_0
    const/4 v1, 0x2

    .line 190
    goto :goto_0

    .line 192
    :pswitch_1
    const/4 v1, 0x1

    .line 193
    goto :goto_0

    .line 195
    :pswitch_2
    const/4 v1, 0x3

    .line 196
    goto :goto_0

    .line 198
    :pswitch_3
    const/4 v1, 0x4

    .line 199
    .line 205
    :goto_0
    :pswitch_4
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static b(I)[Ljava/lang/String;
    .locals 3

    .line 98
    const/4 v2, 0x0

    .line 99
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 102
    :sswitch_0
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "WALK_STEP_SUM"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "WALK_CALORIE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "WALK_DISTANCE_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "WALK_DURATION_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 104
    goto :goto_0

    .line 108
    :sswitch_1
    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "RUN_STEP_SUM"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "RUN_CALORIE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "RUN_DISTANCE_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "RUN_DURATION_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    .line 110
    goto :goto_0

    .line 114
    :sswitch_2
    const/4 v0, 0x5

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "STAIRS_STEP_SUM"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "STAIRS_CALORIE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "STAIRS_DISTANCE_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "STAIRS_STORY_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "STAIRS_DURATION_SUM"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 116
    goto :goto_0

    .line 120
    :sswitch_3
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "CYCLE_CALORIE_SUM"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "CYCLE_DISTANCE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "CYCLE_DURATION_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    .line 122
    goto :goto_0

    .line 126
    :sswitch_4
    goto :goto_0

    .line 130
    :sswitch_5
    const/4 v0, 0x5

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "STEP_SUM"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "CALORIES_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "DISTANCES_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "STOREYS_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "DURATION_SUM"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 132
    .line 136
    :goto_0
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0xdd -> :sswitch_5
    .end sparse-switch
.end method

.method public static c(I)Ljava/lang/String;
    .locals 1

    .line 28
    const-string v0, "step_sum"

    .line 29
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 31
    :sswitch_0
    const-string v0, "step"

    .line 32
    goto :goto_0

    .line 34
    :sswitch_1
    const-string v0, "calorie"

    .line 35
    goto :goto_0

    .line 37
    :sswitch_2
    const-string v0, "distance"

    .line 38
    goto :goto_0

    .line 40
    :sswitch_3
    const-string v0, "all_distance_sum"

    .line 41
    goto :goto_0

    .line 43
    :sswitch_4
    const-string v0, "all_track_count"

    .line 44
    goto :goto_0

    .line 46
    :sswitch_5
    const-string v0, "all_track_pace"

    .line 47
    goto :goto_0

    .line 49
    :sswitch_6
    const-string v0, "step_sum"

    .line 50
    goto :goto_0

    .line 52
    :sswitch_7
    const-string v0, "calorie_sum"

    .line 53
    goto :goto_0

    .line 55
    :sswitch_8
    const-string v0, "distance_sum"

    .line 56
    goto :goto_0

    .line 58
    :sswitch_9
    const-string v0, "storey_sum"

    .line 59
    goto :goto_0

    .line 61
    :sswitch_a
    const-string v0, "altitude_offset"

    .line 62
    .line 66
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_2
        0x4 -> :sswitch_1
        0x5 -> :sswitch_a
        0x9c42 -> :sswitch_6
        0x9c43 -> :sswitch_7
        0x9c44 -> :sswitch_8
        0x9c45 -> :sswitch_9
        0xa413 -> :sswitch_3
        0xa414 -> :sswitch_5
        0xa415 -> :sswitch_4
    .end sparse-switch
.end method

.method public static d(I)[I
    .locals 2

    .line 140
    const/4 v1, 0x0

    .line 141
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 144
    :sswitch_0
    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    .line 146
    goto :goto_0

    .line 150
    :sswitch_1
    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    .line 152
    goto :goto_0

    .line 156
    :sswitch_2
    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    .line 159
    goto :goto_0

    .line 163
    :sswitch_3
    const/4 v1, 0x3

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    .line 165
    goto :goto_0

    .line 169
    :sswitch_4
    goto :goto_0

    .line 173
    :sswitch_5
    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_4

    .line 176
    .line 181
    :goto_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0xdd -> :sswitch_5
    .end sparse-switch

    :array_0
    .array-data 4
        0x9c4b
        0x9c55
        0x9c5f
        0x9c69
    .end array-data

    :array_1
    .array-data 4
        0x9c4c
        0x9c56
        0x9c60
        0x9c6a
    .end array-data

    :array_2
    .array-data 4
        0x9c4d
        0x9c58
        0x9c62
        0x9c45
        0x9c6c
    .end array-data

    :array_3
    .array-data 4
        0x9c57
        0x9c61
        0x9c6b
    .end array-data

    :array_4
    .array-data 4
        0x9c42
        0x9c43
        0x9c44
        0x9c45
        0x9c46
    .end array-data
.end method

.method public static e(I)I
    .locals 2

    .line 209
    const/4 v1, 0x3

    .line 211
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 213
    :sswitch_0
    const/4 v1, 0x3

    .line 214
    goto :goto_0

    .line 216
    :sswitch_1
    const/4 v1, 0x4

    .line 217
    .line 223
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static f(I)[Ljava/lang/String;
    .locals 3

    .line 254
    const/4 v2, 0x0

    .line 255
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 257
    :pswitch_0
    const/4 v0, 0x5

    new-array v2, v0, [Ljava/lang/String;

    const v0, 0x9c42

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "WALK_STEP_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "RUN_STEP_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "STAIRS_STEP_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "OUT_STEP_SUM"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 259
    goto :goto_0

    .line 261
    :pswitch_1
    const/4 v0, 0x6

    new-array v2, v0, [Ljava/lang/String;

    const v0, 0x9c43

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "WALK_CALORIE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "RUN_CALORIE_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "CYCLE_CALORIE_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "STAIRS_CALORIE_SUM"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    const-string v0, "OUT_CALORIE_SUM"

    const/4 v1, 0x5

    aput-object v0, v2, v1

    .line 264
    goto :goto_0

    .line 266
    :pswitch_2
    const/4 v0, 0x6

    new-array v2, v0, [Ljava/lang/String;

    const v0, 0x9c44

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "WALK_DISTANCE_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "RUN_DISTANCE_SUM"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "CYCLE_DISTANCE_SUM"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "STAIRS_DISTANCE_SUM"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    const-string v0, "OUT_DISTANCE_SUM"

    const/4 v1, 0x5

    aput-object v0, v2, v1

    .line 269
    goto :goto_0

    .line 271
    :pswitch_3
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const v0, 0x9c45

    invoke-static {v0}, Lo/dha;->c(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "ALTITUDE_OFFSET_SUM"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 272
    .line 276
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public static g(I)[I
    .locals 2

    .line 227
    const/4 v1, 0x0

    .line 228
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 230
    :pswitch_0
    const/4 v1, 0x5

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    .line 233
    goto :goto_0

    .line 235
    :pswitch_1
    const/4 v1, 0x6

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    .line 238
    goto :goto_0

    .line 240
    :pswitch_2
    const/4 v1, 0x6

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    .line 243
    goto :goto_0

    .line 245
    :pswitch_3
    const/4 v1, 0x2

    new-array v1, v1, [I

    fill-array-data v1, :array_3

    .line 246
    .line 250
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0x9c42
        0x9c4b
        0x9c4c
        0x9c4d
        0x9c73
    .end array-data

    :array_1
    .array-data 4
        0x9c43
        0x9c55
        0x9c56
        0x9c57
        0x9c58
        0x9c75
    .end array-data

    :array_2
    .array-data 4
        0x9c44
        0x9c5f
        0x9c60
        0x9c61
        0x9c62
        0x9c74
    .end array-data

    :array_3
    .array-data 4
        0x9c45
        0x9c45
    .end array-data
.end method
