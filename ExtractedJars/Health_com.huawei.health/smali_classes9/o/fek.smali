.class public Lo/fek;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DBILandroid/widget/TextView;)V
    .locals 3

    .line 324
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 325
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_0

    .line 326
    const v1, 0x41a9999a    # 21.2f

    .line 327
    const v2, 0x41d4cccd    # 26.6f

    goto :goto_0

    .line 328
    :cond_0
    const/16 v0, 0xaa

    if-ge p3, v0, :cond_1

    .line 329
    const v1, 0x41c66666    # 24.8f

    .line 330
    const v2, 0x420a6666    # 34.6f

    goto :goto_0

    .line 332
    :cond_1
    const v1, 0x41eccccd    # 29.6f

    .line 333
    const v2, 0x422ccccd    # 43.2f

    goto :goto_0

    .line 336
    :cond_2
    const/16 v0, 0x96

    if-ge p3, v0, :cond_3

    .line 337
    const/high16 v1, 0x41800000    # 16.0f

    .line 338
    const v2, 0x41a4cccd    # 20.6f

    goto :goto_0

    .line 339
    :cond_3
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_4

    .line 340
    const v1, 0x41973333    # 18.9f

    .line 341
    const v2, 0x41bd999a    # 23.7f

    goto :goto_0

    .line 343
    :cond_4
    const v1, 0x41b0cccd    # 22.1f

    .line 344
    const v2, 0x41f26666    # 30.3f

    .line 347
    :goto_0
    invoke-static {p0, p1, v2, v1, p4}, Lo/fek;->d(DFFLandroid/widget/TextView;)V

    .line 349
    return-void
.end method

.method public static a(DLandroid/widget/TextView;)V
    .locals 2

    .line 162
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 163
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 164
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto/16 :goto_0

    .line 165
    :cond_0
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 166
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 167
    :cond_1
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_2

    .line 168
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_weight:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 170
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_super_weight:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 173
    :cond_3
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_4

    .line 174
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 175
    :cond_4
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    .line 176
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 177
    :cond_5
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_6

    .line 178
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_weight:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 180
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_super_weight:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 183
    :goto_0
    return-void
.end method

.method public static b(DBFLandroid/widget/TextView;)V
    .locals 5

    .line 381
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 382
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_0

    .line 383
    const/high16 v4, 0x40200000    # 2.5f

    goto :goto_0

    .line 384
    :cond_0
    const/high16 v0, 0x42960000    # 75.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_1

    .line 385
    const v4, 0x4039999a    # 2.9f

    goto :goto_0

    .line 387
    :cond_1
    const v4, 0x404ccccd    # 3.2f

    goto :goto_0

    .line 390
    :cond_2
    const/high16 v0, 0x42340000    # 45.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_3

    .line 391
    const v4, 0x3fe66666    # 1.8f

    goto :goto_0

    .line 392
    :cond_3
    const/high16 v0, 0x42700000    # 60.0f

    cmpg-float v0, p3, v0

    if-gez v0, :cond_4

    .line 393
    const v4, 0x400ccccd    # 2.2f

    goto :goto_0

    .line 395
    :cond_4
    const/high16 v4, 0x40200000    # 2.5f

    .line 398
    :goto_0
    const v0, 0x3f933333    # 1.15f

    mul-float v2, v4, v0

    .line 399
    const v0, 0x3f59999a    # 0.85f

    mul-float v3, v4, v0

    .line 401
    float-to-double v0, v3

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    .line 402
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_1

    .line 403
    :cond_5
    float-to-double v0, v3

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_6

    float-to-double v0, v2

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_6

    .line 404
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_1

    .line 405
    :cond_6
    float-to-double v0, v2

    cmpl-double v0, p0, v0

    if-lez v0, :cond_7

    .line 406
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 408
    :cond_7
    :goto_1
    return-void
.end method

.method public static b(DBILandroid/widget/TextView;)V
    .locals 1

    .line 21
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 22
    invoke-static {p3, p0, p1, p4}, Lo/fek;->d(IDLandroid/widget/TextView;)V

    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p3, p0, p1, p4}, Lo/fek;->e(IDLandroid/widget/TextView;)V

    .line 26
    :goto_0
    return-void
.end method

.method public static b(DLandroid/widget/TextView;)V
    .locals 2

    .line 134
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 135
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 136
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto/16 :goto_0

    .line 137
    :cond_0
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    .line 138
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 139
    :cond_1
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_2

    .line 140
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 142
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 145
    :cond_3
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_4

    .line 146
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 147
    :cond_4
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    .line 148
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 149
    :cond_5
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_6

    .line 150
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 152
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 155
    :goto_0
    return-void
.end method

.method private static b(Landroid/widget/TextView;II)V
    .locals 1

    .line 430
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 431
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(I)V

    .line 432
    return-void
.end method

.method public static c(DLandroid/widget/TextView;)V
    .locals 2

    .line 360
    const-wide/high16 v0, 0x402d000000000000L    # 14.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 361
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_dangerous:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 362
    :cond_0
    const-wide/high16 v0, 0x4023000000000000L    # 9.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    .line 363
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 364
    :cond_1
    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 365
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_4:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_warn:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 367
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 369
    :goto_0
    return-void
.end method

.method public static d(DBILandroid/widget/TextView;)V
    .locals 3

    .line 287
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 288
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_0

    .line 289
    const/high16 v1, 0x421a0000    # 38.5f

    .line 290
    const/high16 v2, 0x423a0000    # 46.5f

    goto :goto_0

    .line 291
    :cond_0
    const/16 v0, 0xaa

    if-ge p3, v0, :cond_1

    .line 292
    const/high16 v1, 0x42300000    # 44.0f

    .line 293
    const v2, 0x4251999a    # 52.4f

    goto :goto_0

    .line 295
    :cond_1
    const v1, 0x4245999a    # 49.4f

    .line 296
    const v2, 0x426d999a    # 59.4f

    goto :goto_0

    .line 299
    :cond_2
    const/16 v0, 0x96

    if-ge p3, v0, :cond_3

    .line 300
    const v1, 0x41af3333    # 21.9f

    .line 301
    const v2, 0x420acccd    # 34.7f

    goto :goto_0

    .line 302
    :cond_3
    const/16 v0, 0xa0

    if-ge p3, v0, :cond_4

    .line 303
    const v1, 0x4203999a    # 32.9f

    .line 304
    const/high16 v2, 0x42160000    # 37.5f

    goto :goto_0

    .line 306
    :cond_4
    const/high16 v1, 0x42120000    # 36.5f

    .line 307
    const/high16 v2, 0x422a0000    # 42.5f

    .line 311
    :goto_0
    invoke-static {p0, p1, v2, v1, p4}, Lo/fek;->d(DFFLandroid/widget/TextView;)V

    .line 312
    return-void
.end method

.method private static d(DFFLandroid/widget/TextView;)V
    .locals 2

    .line 255
    float-to-double v0, p3

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 256
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 257
    :cond_0
    float-to-double v0, p3

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    float-to-double v0, p2

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_1

    .line 258
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 259
    :cond_1
    float-to-double v0, p2

    cmpl-double v0, p0, v0

    if-lez v0, :cond_2

    .line 260
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p4, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 262
    :cond_2
    :goto_0
    return-void
.end method

.method public static d(DLandroid/widget/TextView;)V
    .locals 2

    .line 266
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    .line 267
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 268
    :cond_0
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 269
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 271
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 273
    :goto_0
    return-void
.end method

.method private static d(IDLandroid/widget/TextView;)V
    .locals 1

    .line 32
    const/16 v0, 0x27

    if-gt p0, v0, :cond_0

    .line 33
    invoke-static {p1, p2, p3}, Lo/fek;->h(DLandroid/widget/TextView;)V

    goto :goto_0

    .line 34
    :cond_0
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_1

    .line 35
    invoke-static {p1, p2, p3}, Lo/fek;->i(DLandroid/widget/TextView;)V

    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p1, p2, p3}, Lo/fek;->f(DLandroid/widget/TextView;)V

    .line 39
    :goto_0
    return-void
.end method

.method public static e(DBLandroid/widget/TextView;)V
    .locals 2

    .line 193
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 194
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 195
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_4:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_hydropenia:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 196
    :cond_0
    const-wide v0, 0x4050400000000000L    # 65.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_1

    .line 197
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 199
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_2:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fine:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 202
    :cond_2
    const-wide v0, 0x4046800000000000L    # 45.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_3

    .line 203
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_4:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_hydropenia:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 204
    :cond_3
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_4

    .line 205
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 207
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_2:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fine:I

    invoke-static {p3, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 210
    :goto_0
    return-void
.end method

.method public static e(DIBLandroid/widget/TextView;)V
    .locals 4

    .line 220
    const/16 v0, 0x12

    if-ge p2, v0, :cond_0

    .line 221
    const/16 p2, 0x12

    goto :goto_0

    .line 222
    :cond_0
    const/16 v0, 0x50

    if-le p2, v0, :cond_1

    .line 223
    const/16 p2, 0x50

    .line 226
    :cond_1
    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 227
    const/4 v0, 0x1

    if-ne p3, v0, :cond_5

    .line 228
    const/16 v0, 0x1d

    if-gt p2, v0, :cond_2

    .line 229
    const v3, 0x44c1c000    # 1550.0f

    goto :goto_1

    .line 230
    :cond_2
    const/16 v0, 0x31

    if-gt p2, v0, :cond_3

    .line 231
    const v3, 0x44bb8000    # 1500.0f

    goto :goto_1

    .line 232
    :cond_3
    const/16 v0, 0x45

    if-gt p2, v0, :cond_4

    .line 233
    const v3, 0x44a8c000    # 1350.0f

    goto :goto_1

    .line 235
    :cond_4
    const v3, 0x44988000    # 1220.0f

    goto :goto_1

    .line 238
    :cond_5
    const/16 v0, 0x1d

    if-gt p2, v0, :cond_6

    .line 239
    const v3, 0x44974000    # 1210.0f

    goto :goto_1

    .line 240
    :cond_6
    const/16 v0, 0x31

    if-gt p2, v0, :cond_7

    .line 241
    const v3, 0x44924000    # 1170.0f

    goto :goto_1

    .line 242
    :cond_7
    const/16 v0, 0x45

    if-gt p2, v0, :cond_8

    .line 243
    const v3, 0x448ac000    # 1110.0f

    goto :goto_1

    .line 245
    :cond_8
    const v3, 0x447c8000    # 1010.0f

    .line 248
    :goto_1
    const v0, 0x3f8ccccd    # 1.1f

    mul-float v1, v3, v0

    .line 249
    const v0, 0x3f666666    # 0.9f

    mul-float v2, v3, v0

    .line 251
    invoke-static {p0, p1, v1, v2, p4}, Lo/fek;->d(DFFLandroid/widget/TextView;)V

    .line 252
    return-void
.end method

.method public static e(DLandroid/widget/TextView;)V
    .locals 2

    .line 417
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 419
    sget v0, Lcom/huawei/ui/main/R$color;->fitness_detail_calorie_total_data_run_color_2:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 420
    :cond_0
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 421
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_9:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_card_pressure_measure_calibrate_grade_item_3:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 422
    :cond_1
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 423
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_8:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_normal:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 424
    :cond_2
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_3

    .line 425
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_7:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_relaxed:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 427
    :cond_3
    :goto_0
    return-void
.end method

.method private static e(IDLandroid/widget/TextView;)V
    .locals 1

    .line 82
    const/16 v0, 0x27

    if-gt p0, v0, :cond_0

    .line 83
    invoke-static {p1, p2, p3}, Lo/fek;->o(DLandroid/widget/TextView;)V

    goto :goto_0

    .line 84
    :cond_0
    const/16 v0, 0x3b

    if-gt p0, v0, :cond_1

    .line 85
    invoke-static {p1, p2, p3}, Lo/fek;->k(DLandroid/widget/TextView;)V

    goto :goto_0

    .line 87
    :cond_1
    invoke-static {p1, p2, p3}, Lo/fek;->g(DLandroid/widget/TextView;)V

    .line 89
    :goto_0
    return-void
.end method

.method private static f(DLandroid/widget/TextView;)V
    .locals 2

    .line 42
    const-wide/high16 v0, 0x403d000000000000L    # 29.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 43
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 44
    :cond_0
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 45
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 46
    :cond_1
    const-wide/high16 v0, 0x402a000000000000L    # 13.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 47
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 49
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 51
    :goto_0
    return-void
.end method

.method private static g(DLandroid/widget/TextView;)V
    .locals 2

    .line 92
    const-wide v0, 0x4044800000000000L    # 41.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 93
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 94
    :cond_0
    const-wide/high16 v0, 0x4042000000000000L    # 36.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 95
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 96
    :cond_1
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 97
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 99
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 101
    :goto_0
    return-void
.end method

.method private static h(DLandroid/widget/TextView;)V
    .locals 2

    .line 66
    const-wide/high16 v0, 0x403a000000000000L    # 26.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 67
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 68
    :cond_0
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 69
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 70
    :cond_1
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 71
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 73
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 74
    return-void

    .line 76
    :goto_0
    return-void
.end method

.method private static i(DLandroid/widget/TextView;)V
    .locals 2

    .line 54
    const-wide/high16 v0, 0x403b000000000000L    # 27.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 55
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 56
    :cond_0
    const-wide/high16 v0, 0x4036000000000000L    # 22.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 57
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 58
    :cond_1
    const-wide/high16 v0, 0x4026000000000000L    # 11.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 59
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 61
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 63
    :goto_0
    return-void
.end method

.method private static k(DLandroid/widget/TextView;)V
    .locals 2

    .line 104
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 105
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 106
    :cond_0
    const-wide v0, 0x4041800000000000L    # 35.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 107
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 108
    :cond_1
    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 109
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 111
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 113
    :goto_0
    return-void
.end method

.method private static o(DLandroid/widget/TextView;)V
    .locals 2

    .line 116
    const-wide v0, 0x4043800000000000L    # 39.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_0

    .line 117
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_6:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 118
    :cond_0
    const-wide/high16 v0, 0x4041000000000000L    # 34.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 119
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_5:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 120
    :cond_1
    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_2

    .line 121
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_3:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    goto :goto_0

    .line 123
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$color;->weight_tips_color_1:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-static {p2, v0, v1}, Lo/fek;->b(Landroid/widget/TextView;II)V

    .line 125
    :goto_0
    return-void
.end method
