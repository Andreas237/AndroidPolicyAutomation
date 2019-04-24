.class public Lo/fej;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)Lo/fcv;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/acn;>;)Lo/fcv;"
        }
    .end annotation

    .line 123
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v4

    .line 124
    invoke-static/range {p1 .. p1}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    new-instance v0, Lo/fcv;

    invoke-direct {v0}, Lo/fcv;-><init>()V

    return-object v0

    .line 127
    :cond_0
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/acn;

    .line 128
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 129
    new-instance v0, Lo/fcv;

    invoke-direct {v0}, Lo/fcv;-><init>()V

    return-object v0

    .line 131
    :cond_1
    new-instance v6, Lo/fcv;

    invoke-direct {v6}, Lo/fcv;-><init>()V

    .line 132
    invoke-virtual {v5}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/fcv;->c(J)V

    .line 133
    invoke-virtual {v5}, Lo/acn;->d()D

    move-result-wide v7

    .line 134
    invoke-virtual {v5}, Lo/acn;->b()D

    move-result-wide v9

    .line 135
    invoke-static {v7, v8}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 136
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v7, v8, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 138
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    invoke-virtual {v6, v11}, Lo/fcv;->a(Ljava/lang/String;)V

    .line 140
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fcv;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 142
    :cond_2
    invoke-virtual {v6, v12}, Lo/fcv;->a(Ljava/lang/String;)V

    .line 143
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_kg:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fcv;->c(Ljava/lang/String;)V

    .line 145
    :goto_0
    invoke-virtual {v6, v9, v10}, Lo/fcv;->b(D)V

    .line 146
    invoke-static {v5}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    invoke-static {v5, v0}, Lo/fej;->a(Lo/acn;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 147
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/fcv;->a(Z)V

    goto :goto_1

    .line 149
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/fcv;->a(Z)V

    .line 151
    :goto_1
    const-wide/16 v0, 0x0

    cmpg-double v0, v9, v0

    if-lez v0, :cond_5

    invoke-static {v5}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 152
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/fcv;->b(Z)V

    goto :goto_2

    .line 154
    :cond_6
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/fcv;->b(Z)V

    .line 156
    :goto_2
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->h()F

    move-result v13

    .line 157
    invoke-static {v6, v7, v8, v13}, Lo/fej;->b(Lo/fcv;DF)V

    .line 158
    invoke-virtual {v4}, Lo/acu;->d()I

    move-result v0

    move-object/from16 v1, p0

    invoke-static {v1, v7, v8, v0, v5}, Lo/fej;->b(Landroid/content/Context;DILo/acn;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fcv;->b(Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 161
    float-to-double v0, v13

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v14, v0

    .line 162
    invoke-static {v7, v8}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-float v15, v0

    .line 163
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "formatImperial "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "formatImperial value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    invoke-static {v6, v14, v15}, Lo/fej;->d(Lo/fcv;IF)V

    .line 166
    int-to-float v0, v14

    sub-float v0, v15, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fcv;->d(Ljava/lang/String;)V

    .line 168
    goto :goto_3

    .line 169
    :cond_7
    float-to-int v14, v13

    .line 170
    double-to-float v15, v7

    .line 171
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "format "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "format value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    invoke-static {v6, v14, v15}, Lo/fej;->d(Lo/fcv;IF)V

    .line 174
    int-to-float v0, v14

    sub-float v0, v15, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fcv;->d(Ljava/lang/String;)V

    .line 177
    :goto_3
    return-object v6
.end method

.method public static a(DILandroid/widget/TextView;Lo/emg;Landroid/content/Context;)V
    .locals 7

    .line 473
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, p5, :cond_2

    .line 474
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult weight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    mul-int v0, p2, p2

    int-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    mul-double/2addr v0, v2

    div-double v4, p0, v0

    .line 477
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult bmi = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    invoke-static {v4, v5, p5}, Lo/fej;->b(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 480
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 481
    invoke-static {v4, v5}, Lo/feb;->e(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v6, v0

    goto :goto_0

    .line 483
    :cond_0
    invoke-static {v4, v5}, Lo/feb;->d(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    double-to-int v6, v0

    .line 485
    :goto_0
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult progress = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-static {p5}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 487
    rsub-int/lit8 v6, v6, 0x64

    .line 489
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p4, :cond_2

    .line 490
    invoke-virtual {p4, v6}, Lo/emg;->setProgress(I)V

    .line 493
    :cond_2
    return-void
.end method

.method public static a(ILjava/lang/Object;Landroid/os/Handler;)V
    .locals 6

    .line 365
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWeightGoal "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    if-nez p0, :cond_0

    .line 367
    move-object v0, p1

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    .line 368
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    double-to-float v1, v4

    invoke-virtual {v0, v1}, Lo/acu;->b(F)V

    .line 369
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 370
    goto :goto_0

    .line 371
    :cond_0
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    const/high16 v1, 0x42700000    # 60.0f

    invoke-virtual {v0, v1}, Lo/acu;->b(F)V

    .line 372
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 376
    :goto_0
    goto :goto_1

    .line 374
    :catch_0
    move-exception v4

    .line 375
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    :goto_1
    return-void
.end method

.method public static a(Landroid/content/Context;Lo/ego;Ljava/lang/Boolean;)V
    .locals 2

    .line 337
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 338
    new-instance v1, Lo/ego$a;

    invoke-direct {v1, p0}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    .line 339
    invoke-virtual {v1}, Lo/ego$a;->d()Lo/ego;

    move-result-object p1

    .line 341
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 342
    new-instance v0, Lo/fej$3;

    invoke-direct {v0}, Lo/fej$3;-><init>()V

    invoke-virtual {p1, v0}, Lo/ego;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 352
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/ego;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 353
    invoke-virtual {p1}, Lo/ego;->show()V

    .line 355
    :cond_1
    return-void
.end method

.method public static a(Lo/acn;Landroid/content/Context;)Z
    .locals 9

    .line 536
    invoke-virtual {p0}, Lo/acn;->s()I

    move-result v4

    .line 537
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataType is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    const/16 v0, 0x39

    if-eq v4, v0, :cond_0

    const/16 v0, 0x30

    if-eq v4, v0, :cond_0

    const/16 v0, 0x52

    if-eq v4, v0, :cond_0

    const/16 v0, 0x54

    if-ne v4, v0, :cond_2

    .line 541
    :cond_0
    invoke-static {p1}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 542
    invoke-static {}, Lo/czu;->e()Z

    move-result v6

    .line 543
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChineseSimplified is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "; isOversea is :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    if-eqz v5, :cond_2

    if-nez v6, :cond_2

    .line 545
    invoke-virtual {p0}, Lo/acn;->b()D

    move-result-wide v7

    .line 546
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastbodyfat is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 547
    const-wide/16 v0, 0x0

    cmpg-double v0, v7, v0

    if-gtz v0, :cond_1

    .line 548
    const/4 v0, 0x1

    return v0

    .line 550
    :cond_1
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastbodyfat is no values "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(DLandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 499
    const/4 v0, 0x0

    if-eq v0, p2, :cond_7

    .line 500
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 501
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    .line 502
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 503
    :cond_0
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    const-wide v0, 0x4032800000000000L    # 18.5

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_1

    .line 504
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 505
    :cond_1
    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_2

    .line 506
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 508
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 511
    :cond_3
    const-wide v0, 0x4032800000000000L    # 18.5

    cmpg-double v0, p0, v0

    if-gez v0, :cond_4

    .line 512
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 513
    :cond_4
    const-wide/high16 v0, 0x4039000000000000L    # 25.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_5

    const-wide v0, 0x4032800000000000L    # 18.5

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_5

    .line 514
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 515
    :cond_5
    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_6

    .line 516
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_high:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 518
    :cond_6
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 522
    :cond_7
    const-string v0, ""

    return-object v0
.end method

.method public static b(Landroid/content/Context;DILo/acn;)Ljava/lang/String;
    .locals 8

    .line 64
    const-wide/high16 v4, 0x4036000000000000L    # 22.0

    .line 65
    const-string v6, ""

    .line 66
    const/4 v0, -0x1

    if-eq p3, v0, :cond_4

    .line 67
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    .line 68
    invoke-virtual {p4}, Lo/acn;->f()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 69
    invoke-virtual {p4}, Lo/acn;->f()D

    move-result-wide v4

    .line 70
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult bmiValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 72
    :cond_0
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult weight = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    mul-int v0, p3, p3

    int-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    mul-double/2addr v0, v2

    div-double v4, p1, v0

    .line 74
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeightResult bmi = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    :cond_1
    const-wide/high16 v4, 0x4036000000000000L    # 22.0

    .line 78
    :cond_2
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v4

    .line 79
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get BMI by weight and hight, bmiValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 82
    :cond_3
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightBean is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_0
    invoke-static {v4, v5, p0}, Lo/fej;->b(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 86
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_BMI:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 87
    const/4 v0, 0x0

    if-eq v0, p4, :cond_5

    invoke-static {p4}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 88
    return-object v6

    .line 90
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  |  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/app/Activity;F)V
    .locals 3

    .line 254
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 255
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.me.activity.MyTargetActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    invoke-virtual {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 260
    return-void
.end method

.method public static b(Landroid/content/Context;DD)V
    .locals 5

    .line 243
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 244
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->cD:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 246
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 247
    const-string v0, "isShowInput"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 248
    const-string v0, "weight"

    invoke-virtual {v4, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 249
    const-string v0, "bodyfat"

    invoke-virtual {v4, v0, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 250
    invoke-virtual {p0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 251
    return-void
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 267
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 268
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p0, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 270
    return-void
.end method

.method private static b(Lo/fcv;DF)V
    .locals 8

    .line 112
    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fcv;->d(I)V

    goto :goto_1

    .line 115
    :cond_0
    float-to-double v0, p3

    cmpl-double v0, p1, v0

    if-lez v0, :cond_1

    move-wide v4, p1

    goto :goto_0

    :cond_1
    float-to-double v4, p3

    .line 116
    :goto_0
    float-to-double v0, p3

    sub-double v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    div-double/2addr v0, v4

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    sub-double v6, v2, v0

    .line 117
    double-to-int v0, v6

    invoke-virtual {p0, v0}, Lo/fcv;->d(I)V

    .line 119
    :goto_1
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 307
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 308
    const/4 v0, 0x0

    return v0

    .line 310
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 311
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 312
    const-string v0, "it"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "de"

    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "es"

    .line 314
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fr"

    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "en"

    .line 316
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 317
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 319
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Ljava/lang/String;J)Ljava/util/ArrayList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;J)Ljava/util/ArrayList<Lo/acn;>;"
        }
    .end annotation

    .line 443
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 444
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    sget-object v0, Lo/acs;->c:Lo/acs;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    goto :goto_0

    .line 447
    :cond_0
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserWeightTwoWeekData  uid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x0

    return-object v0

    .line 450
    :goto_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v6

    .line 451
    const-wide/16 v0, 0x3e8

    mul-long/2addr v6, v0

    .line 452
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/fee;->e(Ljava/lang/Long;)I

    move-result v8

    .line 453
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 454
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 455
    add-int/lit8 v0, v8, -0x1

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v0, v6, v0

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/acn;

    invoke-virtual {v2}, Lo/acn;->p()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-gtz v0, :cond_1

    .line 456
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-static {v0}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 461
    :cond_2
    return-object v5
.end method

.method public static c(Lo/acn;)Z
    .locals 4

    .line 96
    invoke-virtual {p0}, Lo/acn;->f()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 97
    invoke-virtual {p0}, Lo/acn;->h()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 98
    invoke-virtual {p0}, Lo/acn;->k()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 99
    invoke-virtual {p0}, Lo/acn;->i()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 101
    invoke-virtual {p0}, Lo/acn;->n()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 102
    invoke-virtual {p0}, Lo/acn;->c()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 103
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 105
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(ILandroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 399
    const-string v4, ""

    .line 400
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 401
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 403
    :pswitch_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_thin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 404
    goto/16 :goto_1

    .line 406
    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_thin_muscle:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 407
    goto :goto_1

    .line 409
    :pswitch_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_multi_muscle:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 410
    goto :goto_1

    .line 412
    :pswitch_3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_lack_sport:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 413
    goto :goto_1

    .line 415
    :pswitch_4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_stand:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 416
    goto :goto_1

    .line 418
    :pswitch_5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_muscle:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 419
    goto :goto_1

    .line 421
    :pswitch_6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_edema:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 422
    goto :goto_1

    .line 424
    :pswitch_7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_obese:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 425
    goto :goto_1

    .line 427
    :pswitch_8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_body_type_fat_and_strong:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 428
    goto :goto_1

    .line 430
    :goto_0
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "body type get is wrong..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    :cond_0
    :goto_1
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
    .end packed-switch
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 529
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 530
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 532
    return-void
.end method

.method public static d(Landroid/content/Context;Lo/acn;Lo/acu;)V
    .locals 9

    .line 193
    invoke-virtual {p1}, Lo/acn;->b()D

    move-result-wide v4

    .line 194
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 195
    const-string v0, "weightBean"

    invoke-virtual {v6, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 196
    const-string v0, "weight"

    invoke-virtual {p1}, Lo/acn;->d()D

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 197
    const-string v0, "bodyfat"

    invoke-virtual {v6, v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 198
    const-string v0, "weighttime"

    invoke-virtual {p1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 199
    const-string v0, "deletetime"

    invoke-virtual {p1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 200
    invoke-virtual {p1}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lo/acn;->e()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    .line 201
    const-string v0, "water"

    invoke-virtual {p1}, Lo/acn;->e()D

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    goto :goto_0

    .line 203
    :cond_0
    const-string v0, "water"

    invoke-virtual {p1}, Lo/acn;->c()D

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 205
    :goto_0
    const-string v0, "delete_end_time"

    invoke-virtual {p1}, Lo/acn;->o()J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 206
    const-string v0, "BI_Tag"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 207
    const-string v0, "resistance"

    invoke-virtual {p1}, Lo/acn;->a()D

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 208
    invoke-virtual {p1}, Lo/acn;->q()I

    move-result v0

    if-lez v0, :cond_1

    .line 209
    const-string v0, "userHight"

    invoke-virtual {p1}, Lo/acn;->q()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1

    .line 211
    :cond_1
    const-string v0, "userHight"

    invoke-virtual {p2}, Lo/acu;->d()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 213
    :goto_1
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v4, v0

    if-ltz v0, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    .line 214
    :goto_2
    const-string v0, "isshowbodyfat"

    invoke-virtual {v6, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 215
    const-string v0, "isShowInput"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 216
    const-string v0, "dataType"

    invoke-virtual {p1}, Lo/acn;->s()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 217
    invoke-virtual {p1}, Lo/acn;->s()I

    move-result v8

    .line 218
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataType is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    const/16 v0, 0x39

    if-eq v8, v0, :cond_3

    const/16 v0, 0x30

    if-eq v8, v0, :cond_3

    const/16 v0, 0x52

    if-eq v8, v0, :cond_3

    const/16 v0, 0x54

    if-ne v8, v0, :cond_4

    .line 222
    :cond_3
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWeightDataValidation : true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    sget-object v0, Lo/dae;->du:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/fej;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 224
    const-string v0, "currentUser"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 225
    const-string v0, "mainUser"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 226
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    invoke-virtual {v6, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_3

    .line 229
    :cond_4
    invoke-static {p1}, Lo/fej;->c(Lo/acn;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_5

    .line 230
    const-string v0, "AddOrEditWeightUserActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkWeightDataValidation : true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const-string v0, "currentUser"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 232
    const-string v0, "mainUser"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->d()Lo/acu;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 233
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    invoke-virtual {v6, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_3

    .line 235
    :cond_5
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v6, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 238
    :goto_3
    invoke-virtual {p0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 240
    return-void
.end method

.method public static d(Lo/ego;Ljava/lang/Boolean;)V
    .locals 1

    .line 358
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    invoke-virtual {p0}, Lo/ego;->dismiss()V

    .line 361
    :cond_0
    return-void
.end method

.method private static d(Lo/fcv;IF)V
    .locals 2

    .line 182
    int-to-float v0, p1

    sub-float v1, p2, v0

    .line 183
    const/4 v0, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 184
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fcv;->e(I)V

    goto :goto_0

    .line 185
    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 186
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fcv;->e(I)V

    goto :goto_0

    .line 188
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lo/fcv;->e(I)V

    .line 190
    :goto_0
    return-void
.end method

.method public static e(Lo/acn;Landroid/widget/ImageView;)V
    .locals 2

    .line 299
    invoke-virtual {p0}, Lo/acn;->s()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 300
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_nav_measure_grey:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 302
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->health_healthdata_toobar_edit_gray_ic:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 304
    :goto_0
    return-void
.end method
