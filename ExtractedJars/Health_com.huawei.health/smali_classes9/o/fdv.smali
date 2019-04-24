.class public Lo/fdv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/acn;Z)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acn;Z)Ljava/util/List<Lo/fda;>;"
        }
    .end annotation

    .line 33
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 34
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 35
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BodyIndexConstructUtils bodyIndexRecycleItemFactroy weightBean is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    invoke-virtual {p0}, Lo/acn;->f()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 37
    invoke-virtual {p0}, Lo/acn;->b()D

    move-result-wide v0

    const/4 v2, 0x1

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 38
    invoke-virtual {p0}, Lo/acn;->g()D

    move-result-wide v0

    const/4 v2, 0x6

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 39
    invoke-virtual {p0}, Lo/acn;->h()D

    move-result-wide v0

    const/4 v2, 0x4

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 41
    invoke-virtual {p0}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 42
    invoke-virtual {p0}, Lo/acn;->e()D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lo/acn;->c()D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 46
    :goto_0
    invoke-virtual {p0}, Lo/acn;->i()D

    move-result-wide v0

    const/4 v2, 0x5

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 47
    invoke-virtual {p0}, Lo/acn;->k()D

    move-result-wide v0

    const/4 v2, 0x7

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 48
    invoke-virtual {p0}, Lo/acn;->n()D

    move-result-wide v0

    const/16 v2, 0x8

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 49
    invoke-virtual {p0}, Lo/acn;->m()D

    move-result-wide v0

    const/16 v2, 0x9

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 50
    invoke-virtual {p0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lo/acn;->u()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_1

    .line 51
    invoke-virtual {p0}, Lo/acn;->t()B

    move-result v0

    invoke-virtual {p0}, Lo/acn;->b()D

    move-result-wide v1

    invoke-virtual {p0}, Lo/acn;->g()D

    move-result-wide v3

    invoke-virtual {p0}, Lo/acn;->u()I

    move-result v5

    invoke-virtual {p0}, Lo/acn;->q()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lo/acm;->d(BDDII)I

    move-result v0

    int-to-double v0, v0

    const/16 v2, 0xd

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 54
    :cond_1
    invoke-virtual {p0}, Lo/acn;->r()D

    move-result-wide v0

    const/16 v2, 0xa

    invoke-static {v7, v0, v1, p0, v2}, Lo/fdv;->e(Ljava/util/ArrayList;DLo/acn;I)V

    .line 62
    :cond_2
    return-object v7
.end method

.method public static b(DLo/acn;I)Lo/fda;
    .locals 5

    .line 67
    const-string v0, "WeightBodyIndexRecycleAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BodyIndexConstructUtils createRecycleItem type =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; data =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    new-instance v4, Lo/fda;

    invoke-direct {v4}, Lo/fda;-><init>()V

    .line 69
    invoke-virtual {v4, p0, p1}, Lo/fda;->e(D)V

    .line 70
    invoke-virtual {v4, p2}, Lo/fda;->b(Lo/acn;)V

    .line 71
    invoke-virtual {v4, p3}, Lo/fda;->e(I)V

    .line 72
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_9

    .line 74
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 75
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    const-string v0, "--"

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 76
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 77
    goto/16 :goto_9

    .line 79
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_BMI:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 80
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    const-string v0, "--"

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 81
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 82
    goto/16 :goto_9

    .line 84
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_water:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 85
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_2

    const-string v0, "--"

    goto :goto_2

    :cond_2
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 86
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 87
    goto/16 :goto_9

    .line 89
    :pswitch_3
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_metabolism:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 90
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_3

    const-string v0, "--"

    goto :goto_3

    :cond_3
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 91
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_sport_cal_unit_new:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 92
    goto/16 :goto_9

    .line 94
    :pswitch_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 95
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_4

    const-string v0, "--"

    goto :goto_4

    :cond_4
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 96
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 97
    goto/16 :goto_9

    .line 99
    :pswitch_5
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_muscle:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 100
    invoke-static {p0, p1, v4}, Lo/fdv;->b(DLo/fda;)V

    .line 101
    goto/16 :goto_9

    .line 103
    :pswitch_6
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bone:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 104
    invoke-static {p0, p1, v4}, Lo/fdv;->b(DLo/fda;)V

    .line 105
    goto/16 :goto_9

    .line 107
    :pswitch_7
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_protein:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 108
    double-to-float v0, p0

    invoke-virtual {p2}, Lo/acn;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lo/acm;->b(FF)F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v4, v0, v1}, Lo/fda;->e(D)V

    .line 109
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    const-string v0, "--"

    goto :goto_5

    :cond_5
    double-to-float v0, p0

    invoke-virtual {p2}, Lo/acn;->d()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lo/acm;->b(FF)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 110
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 111
    goto/16 :goto_9

    .line 113
    :pswitch_8
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bodyage:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 114
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_6

    const-string v0, "--"

    goto :goto_6

    :cond_6
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 115
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 116
    goto/16 :goto_9

    .line 118
    :pswitch_9
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_skeletal_muscle_mass:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 119
    invoke-static {p0, p1, v4}, Lo/fdv;->b(DLo/fda;)V

    .line 120
    goto :goto_9

    .line 122
    :pswitch_a
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 123
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_7

    const-string v0, "--"

    goto :goto_7

    :cond_7
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 124
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_device_measure_pressure_result_heart_rate_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 125
    goto :goto_9

    .line 127
    :pswitch_b
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_pressure_index:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 128
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_8

    const-string v0, "--"

    goto :goto_8

    :cond_8
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_8
    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 129
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 130
    goto :goto_9

    .line 132
    :pswitch_c
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type:I

    invoke-virtual {v4, v0}, Lo/fda;->b(I)V

    .line 133
    double-to-int v0, p0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fej;->d(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 134
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_empty_unit:I

    invoke-virtual {v4, v0}, Lo/fda;->a(I)V

    .line 135
    .line 139
    :goto_9
    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
    .end packed-switch
.end method

.method private static b(DLo/fda;)V
    .locals 4

    .line 149
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    const-string v0, "--"

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 151
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {p2, v0}, Lo/fda;->a(I)V

    goto :goto_2

    .line 153
    :cond_1
    const-wide/16 v0, 0x0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_2

    const-string v0, "--"

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Lo/fda;->d(Ljava/lang/String;)V

    .line 154
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    invoke-virtual {p2, v0}, Lo/fda;->a(I)V

    .line 156
    :goto_2
    return-void
.end method

.method private static e(Ljava/util/ArrayList;DLo/acn;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fda;>;DLo/acn;I)V"
        }
    .end annotation

    .line 245
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xd

    if-eq p4, v0, :cond_0

    const/16 v0, 0xa

    if-ne p4, v0, :cond_1

    .line 246
    :cond_0
    return-void

    .line 248
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-lez v0, :cond_2

    .line 249
    invoke-static {p1, p2, p3, p4}, Lo/fdv;->b(DLo/acn;I)Lo/fda;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    :cond_2
    return-void
.end method
