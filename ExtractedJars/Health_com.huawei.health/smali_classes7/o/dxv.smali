.class public Lo/dxv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLcom/huawei/pluginachievement/report/bean/AnnualReportStep;Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;)I
    .locals 4

    .line 463
    if-nez p2, :cond_2

    .line 464
    if-nez p3, :cond_0

    .line 465
    sget-object v0, Lo/dxn;->s:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    return v0

    .line 467
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->acquireFirstUseDate()J

    move-result-wide v0

    cmp-long v0, v0, p0

    if-gez v0, :cond_1

    invoke-virtual {p3}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->acquireFirstUseDate()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 468
    sget-object v0, Lo/dxn;->r:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    return v0

    .line 470
    :cond_1
    sget-object v0, Lo/dxn;->s:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    return v0

    .line 474
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->acquireTotalStep()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 475
    sget-object v0, Lo/dxn;->r:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    return v0

    .line 477
    :cond_3
    sget-object v0, Lo/dxn;->u:Lo/dxn;

    invoke-virtual {v0}, Lo/dxn;->a()I

    move-result v0

    return v0
.end method

.method public static a(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;
    .locals 8

    .line 230
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;-><init>()V

    .line 231
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 232
    return-object v2

    .line 234
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 235
    const-string v0, "type"

    sget-object v1, Lo/dxp;->h:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 238
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 239
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 242
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 243
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 244
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 245
    goto :goto_1

    .line 247
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 249
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveMaxDuration(I)V

    .line 250
    goto :goto_1

    .line 252
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveMaxDurationDay(J)V

    .line 253
    goto :goto_1

    .line 255
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveTotalDuration(I)V

    .line 256
    goto :goto_1

    .line 258
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveNumberOfTimes(I)V

    .line 259
    goto :goto_1

    .line 261
    :pswitch_4
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitness;->saveDescription(I)V

    .line 242
    .line 262
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 267
    :cond_4
    return-object v2

    :pswitch_data_0
    .packed-switch 0xfa1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method public static b(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;
    .locals 8

    .line 182
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;-><init>()V

    .line 183
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 184
    return-object v2

    .line 186
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 187
    const-string v0, "type"

    sget-object v1, Lo/dxp;->b:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 190
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 191
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 193
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 194
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 195
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 196
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 197
    goto :goto_1

    .line 199
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 201
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->saveMaxStep(I)V

    .line 202
    goto :goto_1

    .line 204
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->saveMaxStepDay(Ljava/lang/String;)V

    .line 205
    goto :goto_1

    .line 207
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->saveMaxWalkMonth(I)V

    .line 208
    goto :goto_1

    .line 210
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->saveTotalStep(I)V

    .line 211
    goto :goto_1

    .line 213
    :pswitch_4
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportStep;->saveTotalStepDistance(I)V

    .line 194
    .line 214
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 219
    :cond_4
    return-object v2

    :pswitch_data_0
    .packed-switch 0xbb9
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static c(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;
    .locals 8

    .line 136
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;-><init>()V

    .line 137
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 138
    return-object v2

    .line 140
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 141
    const-string v0, "type"

    sget-object v1, Lo/dxp;->e:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 144
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 145
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 148
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 149
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 150
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 151
    goto :goto_1

    .line 153
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 155
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->saveMaxDistance(I)V

    .line 156
    goto :goto_1

    .line 158
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->saveMaxDistanceDay(J)V

    .line 159
    goto :goto_1

    .line 161
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->saveTotalDistance(I)V

    .line 162
    goto :goto_1

    .line 164
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportCycle;->saveNumberOfTimes(I)V

    .line 148
    .line 165
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 170
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static c(ILjava/lang/String;I)Lo/dvf;
    .locals 2

    .line 497
    new-instance v1, Lo/dvf;

    const/16 v0, 0x13

    invoke-direct {v1, v0}, Lo/dvf;-><init>(I)V

    .line 498
    invoke-virtual {v1, p0}, Lo/dvf;->setYear(I)V

    .line 499
    invoke-virtual {v1, p1}, Lo/dvf;->setType(Ljava/lang/String;)V

    .line 500
    invoke-virtual {v1, p2}, Lo/dvf;->setKey(I)V

    .line 501
    return-object v1
.end method

.method public static c(Lo/dvf;Lo/dwr;)Z
    .locals 2

    .line 489
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 490
    :cond_0
    const-string v0, "PLGACHIEVE_AnnualDBManager"

    const-string v1, "insertData null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    const/4 v0, 0x0

    return v0

    .line 493
    :cond_1
    invoke-virtual {p1, p0}, Lo/dwr;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method public static d(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;
    .locals 8

    .line 43
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;-><init>()V

    .line 44
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 45
    return-object v2

    .line 47
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 48
    const-string v0, "type"

    sget-object v1, Lo/dxp;->c:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 51
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 52
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 55
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 56
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 57
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 58
    goto :goto_1

    .line 60
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 62
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->saveTotalSportDistance(I)V

    .line 63
    goto :goto_1

    .line 65
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->saveFirstUseDate(J)V

    .line 66
    goto :goto_1

    .line 68
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportInital;->saveTotalDays(I)V

    .line 55
    .line 69
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 74
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x2329
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;
    .locals 8

    .line 85
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;-><init>()V

    .line 86
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 87
    return-object v2

    .line 89
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 90
    const-string v0, "type"

    sget-object v1, Lo/dxp;->d:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 93
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 94
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 96
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 97
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 98
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 99
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 100
    goto/16 :goto_1

    .line 102
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 104
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveMaxDistance(I)V

    .line 105
    goto :goto_1

    .line 107
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveMaxDistanceDay(J)V

    .line 108
    goto :goto_1

    .line 110
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveTotalDistance(I)V

    .line 111
    goto :goto_1

    .line 113
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveNumberOfTimes(I)V

    .line 114
    goto :goto_1

    .line 116
    :pswitch_4
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveTimeOfDay(I)V

    .line 117
    goto :goto_1

    .line 119
    :pswitch_5
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportRun;->saveDescription(I)V

    .line 97
    .line 120
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 125
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static g(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;
    .locals 8

    .line 329
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;-><init>()V

    .line 330
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 331
    return-object v2

    .line 333
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 334
    const-string v0, "type"

    sget-object v1, Lo/dxp;->f:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 337
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 338
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 340
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 341
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 342
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 343
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 344
    goto :goto_1

    .line 346
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 348
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->a(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->setWeightChange(D)V

    .line 349
    goto :goto_1

    .line 351
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->a(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->setMax(D)V

    .line 352
    goto :goto_1

    .line 354
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->a(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportWeight;->setMin(D)V

    .line 341
    .line 355
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 361
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1b59
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static h(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;
    .locals 8

    .line 278
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;-><init>()V

    .line 279
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 280
    return-object v2

    .line 282
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 283
    const-string v0, "type"

    sget-object v1, Lo/dxp;->a:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 286
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 287
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 289
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 290
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 291
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 292
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 293
    goto/16 :goto_1

    .line 295
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 297
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->a(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->saveSleepScore(D)V

    .line 298
    goto :goto_1

    .line 300
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->saveSleepDuration(I)V

    .line 301
    goto :goto_1

    .line 303
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->saveFallAsleepTime(Ljava/lang/String;)V

    .line 304
    goto :goto_1

    .line 306
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->saveWakeupTime(Ljava/lang/String;)V

    .line 307
    goto :goto_1

    .line 309
    :pswitch_4
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->setBreLevel(D)V

    .line 310
    goto :goto_1

    .line 312
    :pswitch_5
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSleep;->saveAnimalImage(I)V

    .line 290
    .line 313
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 318
    :cond_4
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1f41
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_5
    .end packed-switch
.end method

.method public static i(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;
    .locals 8

    .line 373
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;-><init>()V

    .line 374
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 375
    return-object v2

    .line 377
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 378
    const-string v0, "type"

    sget-object v1, Lo/dxp;->k:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 381
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 382
    :cond_1
    return-object v2

    .line 384
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 385
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 386
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 387
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 388
    goto :goto_1

    .line 390
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 392
    :pswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->saveTotalDistance(I)V

    .line 393
    goto :goto_1

    .line 395
    :pswitch_1
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->saveCurrentLevel(I)V

    .line 396
    goto :goto_1

    .line 398
    :pswitch_2
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->saveMedalSum(I)V

    .line 399
    goto :goto_1

    .line 401
    :pswitch_3
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->saveStepOverGoal(I)V

    .line 402
    goto :goto_1

    .line 404
    :pswitch_4
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxk;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportSumary;->saveTotalCalorie(J)V

    .line 385
    .line 405
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 410
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1771
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static k(Lo/dwr;I)Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;
    .locals 8

    .line 421
    new-instance v2, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;

    invoke-direct {v2}, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;-><init>()V

    .line 422
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 423
    return-object v2

    .line 425
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 426
    const-string v0, "type"

    sget-object v1, Lo/dxp;->i:Lo/dxp;

    invoke-virtual {v1}, Lo/dxp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    const-string v0, "year"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    const/16 v0, 0x13

    invoke-virtual {p0, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 429
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 430
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 432
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 433
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 434
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 435
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 436
    goto :goto_1

    .line 438
    :cond_3
    invoke-virtual {v7}, Lo/dvf;->getKey()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 440
    :sswitch_0
    invoke-virtual {v7}, Lo/dvf;->getValues()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportReward;->saveMedalIdList(Ljava/lang/String;)V

    .line 433
    .line 441
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 446
    :cond_4
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1389 -> :sswitch_0
    .end sparse-switch
.end method
