.class public Lo/dfk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dba;)[I
    .locals 7

    .line 49
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 50
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 51
    new-array v4, v3, [I

    .line 52
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 53
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 54
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 56
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 57
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 52
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 64
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static c(Lo/dba;)Lcom/huawei/datatype/FitnessUserInfo;
    .locals 9

    .line 197
    new-instance v2, Lcom/huawei/datatype/FitnessUserInfo;

    invoke-direct {v2}, Lcom/huawei/datatype/FitnessUserInfo;-><init>()V

    .line 198
    iget-object v3, p0, Lo/dba;->b:Ljava/util/List;

    .line 199
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dba;

    .line 200
    iget-object v6, v5, Lo/dba;->e:Ljava/util/List;

    .line 201
    const/4 v7, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 202
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v8

    .line 203
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 205
    :pswitch_0
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/FitnessUserInfo;->setTime(J)V

    .line 206
    goto :goto_2

    .line 208
    :pswitch_1
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/datatype/FitnessUserInfo;->setHeight(I)V

    .line 209
    goto :goto_2

    .line 211
    :pswitch_2
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/datatype/FitnessUserInfo;->setWeight(I)V

    .line 201
    .line 212
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 217
    :cond_0
    goto/16 :goto_0

    .line 218
    :cond_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static d(Lo/dba;)I
    .locals 7

    .line 180
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 181
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 184
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 185
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 187
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    .line 183
    .line 188
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 193
    :cond_0
    return v4

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static e(Lo/dba;)Lo/dfp;
    .locals 14

    .line 75
    new-instance v4, Lo/dfp;

    invoke-direct {v4}, Lo/dfp;-><init>()V

    .line 76
    iget-object v5, p0, Lo/dba;->b:Ljava/util/List;

    .line 77
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 78
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dba;

    .line 79
    iget-object v8, v7, Lo/dba;->e:Ljava/util/List;

    .line 80
    const/4 v9, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 81
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 83
    :sswitch_0
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dfp;->c(I)V

    .line 84
    goto :goto_2

    .line 86
    :sswitch_1
    new-instance v10, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    invoke-direct {v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;-><init>()V

    .line 87
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 88
    const-string v0, "FitnessUnTLVUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unTlv HeartRateDetectRet value:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 91
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->setTimeStamp(J)V

    .line 93
    const/16 v0, 0x8

    const/16 v1, 0xa

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;->setHeartRate(I)V

    .line 95
    :cond_0
    invoke-virtual {v4, v10}, Lo/dfp;->d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;)V

    .line 80
    .line 96
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 102
    :cond_1
    iget-object v9, v7, Lo/dba;->b:Ljava/util/List;

    .line 103
    const/4 v10, 0x0

    :goto_3
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 104
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v11, v0, Lo/dba;->e:Ljava/util/List;

    .line 105
    new-instance v12, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;

    invoke-direct {v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;-><init>()V

    .line 106
    const/4 v13, 0x0

    :goto_4
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    .line 107
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 109
    :pswitch_0
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setMotion_type(I)V

    .line 110
    goto/16 :goto_5

    .line 112
    :pswitch_1
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setStep(I)V

    .line 113
    goto :goto_5

    .line 115
    :pswitch_2
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setCalorie(I)V

    .line 116
    goto :goto_5

    .line 118
    :pswitch_3
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setDistance(I)V

    .line 119
    goto :goto_5

    .line 121
    :pswitch_4
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setSleep_time(I)V

    .line 122
    goto :goto_5

    .line 124
    :pswitch_5
    invoke-interface {v11, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;->setHeight(I)V

    .line 106
    .line 125
    :goto_5
    :pswitch_6
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    .line 130
    :cond_2
    invoke-virtual {v4}, Lo/dfp;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_3

    .line 77
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 133
    :cond_4
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x9 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
