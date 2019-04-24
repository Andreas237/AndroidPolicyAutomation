.class public Lo/fdd;
.super Lo/fdf;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lo/fdf;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;IF)Ljava/lang/String;
    .locals 6

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 51
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_value_error:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 52
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42040000    # 33.0f

    cmpl-float v0, p2, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p2, v0

    .line 53
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 54
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_value_error:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_1

    .line 57
    :cond_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 61
    :pswitch_0
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_2

    .line 62
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_low:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_1

    .line 64
    :cond_2
    const/high16 v0, 0x40e00000    # 7.0f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_3

    .line 65
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_normal:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 67
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_height:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 69
    goto :goto_1

    .line 74
    :pswitch_1
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_4

    .line 75
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_low:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 77
    :cond_4
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_5

    .line 78
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_normal:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 80
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_height:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 82
    goto :goto_1

    .line 84
    :goto_0
    const v0, 0x4079999a    # 3.9f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_6

    .line 85
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_low:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 87
    :cond_6
    const/high16 v0, 0x40e00000    # 7.0f

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_7

    .line 88
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_normal:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 90
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_level_height:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 95
    :goto_1
    const-string v0, "UIHLH_BloodSugar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLevelOfBloodsugar, levelStr="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-object v5

    :pswitch_data_0
    .packed-switch 0x7d8
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static a(F)Z
    .locals 4

    .line 148
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42040000    # 33.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p0, v0

    .line 149
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 148
    :goto_0
    return v0
.end method

.method private static c(F)I
    .locals 5

    .line 153
    const-string v0, "UIHLH_BloodSugar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----getProgress----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    .line 156
    const v0, 0x408ccccd    # 4.4f

    div-float v0, p0, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v4, v0

    goto :goto_0

    .line 157
    :cond_0
    const/high16 v0, 0x41000000    # 8.0f

    cmpg-float v0, p0, v0

    if-gez v0, :cond_1

    .line 158
    const v0, 0x408ccccd    # 4.4f

    sub-float v0, p0, v0

    const v1, 0x40666666    # 3.6f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x19

    goto :goto_0

    .line 161
    :cond_1
    const/high16 v0, 0x42040000    # 33.0f

    div-float v0, p0, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x4b

    .line 163
    :goto_0
    const-string v0, "UIHLH_BloodSugar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getProgressOfBloodsugar, progress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return v4
.end method

.method public static c(IF)I
    .locals 5

    .line 107
    const/16 v4, 0x32

    .line 108
    invoke-static {p1}, Lo/fdd;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    const/16 v4, 0x32

    goto/16 :goto_1

    .line 111
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 115
    :pswitch_0
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 116
    const v0, 0x408ccccd    # 4.4f

    div-float v0, p1, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v4, v0

    goto :goto_1

    .line 117
    :cond_1
    const/high16 v0, 0x40e00000    # 7.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    .line 118
    const v0, 0x408ccccd    # 4.4f

    sub-float v0, p1, v0

    const v1, 0x40266666    # 2.6f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x19

    goto :goto_1

    .line 121
    :cond_2
    const/high16 v0, 0x42040000    # 33.0f

    div-float v0, p1, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x4b

    .line 123
    goto :goto_1

    .line 127
    :pswitch_1
    const v0, 0x408ccccd    # 4.4f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    .line 128
    const v0, 0x408ccccd    # 4.4f

    div-float v0, p1, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v4, v0

    goto :goto_1

    .line 129
    :cond_3
    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_4

    .line 130
    const v0, 0x408ccccd    # 4.4f

    sub-float v0, p1, v0

    const v1, 0x40b33333    # 5.6f

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x19

    goto :goto_1

    .line 133
    :cond_4
    const/high16 v0, 0x42040000    # 33.0f

    div-float v0, p1, v0

    const/high16 v1, 0x41c80000    # 25.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    add-int/lit8 v4, v0, 0x4b

    .line 135
    goto :goto_1

    .line 139
    :goto_0
    :pswitch_2
    invoke-static {p1}, Lo/fdd;->c(F)I

    move-result v4

    .line 143
    :goto_1
    const-string v0, "UIHLH_BloodSugar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getProgressOfBloodsugar, progress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return v4

    :pswitch_data_0
    .packed-switch 0x7d8
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 3

    .line 240
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 241
    const/16 v2, 0x7df

    .line 242
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_breakfast:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    const/16 v2, 0x7d8

    goto/16 :goto_0

    .line 244
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_breakfast:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    const/16 v2, 0x7d9

    goto :goto_0

    .line 246
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_lunch:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    const/16 v2, 0x7da

    goto :goto_0

    .line 248
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_lunch:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 249
    const/16 v2, 0x7db

    goto :goto_0

    .line 250
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_dinner:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 251
    const/16 v2, 0x7dc

    goto :goto_0

    .line 252
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_dinner:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 253
    const/16 v2, 0x7dd

    goto :goto_0

    .line 254
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_early_morning:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 255
    const/16 v2, 0x7df

    goto :goto_0

    .line 256
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_sleep:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 257
    const/16 v2, 0x7de

    .line 259
    :cond_7
    :goto_0
    return v2
.end method

.method public static d(I)D
    .locals 4

    .line 213
    const-wide/16 v2, 0x0

    .line 214
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 220
    :pswitch_0
    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    .line 221
    goto :goto_1

    .line 225
    :pswitch_1
    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    .line 226
    goto :goto_1

    .line 228
    :goto_0
    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    .line 231
    :goto_1
    return-wide v2

    nop

    :pswitch_data_0
    .packed-switch 0x7d8
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Landroid/content/Context;I)Ljava/lang/String;
    .locals 6

    .line 173
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 174
    const-string v5, ""

    .line 175
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 177
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_breakfast:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 178
    goto :goto_1

    .line 180
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_breakfast:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 181
    goto :goto_1

    .line 183
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_lunch:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 184
    goto :goto_1

    .line 186
    :pswitch_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_lunch:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 187
    goto :goto_1

    .line 189
    :pswitch_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_dinner:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 190
    goto :goto_1

    .line 192
    :pswitch_5
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_dinner:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 193
    goto :goto_1

    .line 195
    :pswitch_6
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_early_morning:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 196
    goto :goto_1

    .line 198
    :pswitch_7
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_sleep:I

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 199
    goto :goto_1

    .line 201
    :goto_0
    const-string v0, "UIHLH_BloodSugar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unsupport timePeriod="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_1
    return-object v5

    :pswitch_data_0
    .packed-switch 0x7d8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
