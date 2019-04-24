.class public Lo/diu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 174
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 175
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 176
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v2}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v3

    .line 177
    invoke-virtual {v3}, Lo/dba;->a()Ljava/util/List;

    move-result-object v4

    .line 178
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 179
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0

    .line 182
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public static b([B)I
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 147
    const/4 v4, 0x1

    .line 148
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 149
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 150
    new-instance v7, Lo/daz;

    invoke-direct {v7}, Lo/daz;-><init>()V

    .line 151
    invoke-virtual {v7, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 152
    invoke-virtual {v8}, Lo/dba;->a()Ljava/util/List;

    move-result-object v9

    .line 153
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    .line 154
    new-array v11, v10, [I

    .line 155
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_1

    .line 156
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v13

    .line 157
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 159
    :sswitch_0
    array-length v0, v11

    if-lez v0, :cond_0

    .line 160
    const/16 v0, 0x10

    invoke-static {v13, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v11, v1

    .line 155
    :cond_0
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 167
    :cond_1
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v11, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    aget v4, v11, v0

    .line 170
    return v4

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static c([B)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 187
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 188
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 189
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v2}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v3

    .line 190
    invoke-virtual {v3}, Lo/dba;->a()Ljava/util/List;

    move-result-object v4

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 192
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    return v0

    .line 195
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private static c(Lo/dba;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 18

    .line 66
    new-instance v4, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 67
    move-object/from16 v0, p0

    iget-object v5, v0, Lo/dba;->b:Ljava/util/List;

    .line 69
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_5

    .line 70
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    invoke-virtual {v0}, Lo/dba;->a()Ljava/util/List;

    move-result-object v7

    .line 71
    const/4 v8, 0x0

    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 72
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v9

    .line 73
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 74
    packed-switch v10, :pswitch_data_0

    goto :goto_2

    .line 76
    :pswitch_0
    const/16 v0, 0x10

    invoke-static {v9, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setDeviceType(I)V

    .line 77
    goto :goto_3

    .line 79
    :pswitch_1
    invoke-static {v9}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setDeviceIMEI(Ljava/lang/String;)V

    .line 80
    goto :goto_3

    .line 82
    :pswitch_2
    invoke-static {v9}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setDeviceSerialNumber(Ljava/lang/String;)V

    .line 83
    goto :goto_3

    .line 85
    :pswitch_3
    invoke-static {v9}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setProductName(Ljava/lang/String;)V

    .line 86
    goto :goto_3

    .line 88
    :pswitch_4
    invoke-static {v9}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setEID(Ljava/lang/String;)V

    .line 89
    goto :goto_3

    .line 91
    :goto_2
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_1

    .line 96
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    invoke-virtual {v0}, Lo/dba;->d()Ljava/util/List;

    move-result-object v9

    .line 98
    const/4 v10, 0x0

    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 99
    .line 100
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    invoke-virtual {v0}, Lo/dba;->d()Ljava/util/List;

    move-result-object v11

    .line 101
    const/4 v12, 0x0

    :goto_5
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_3

    .line 102
    .line 103
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    invoke-virtual {v0}, Lo/dba;->a()Ljava/util/List;

    move-result-object v13

    .line 104
    new-instance v14, Lcom/huawei/multisimservice/model/SimInfo;

    invoke-direct {v14}, Lcom/huawei/multisimservice/model/SimInfo;-><init>()V

    .line 105
    const/4 v15, 0x0

    :goto_6
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_2

    .line 106
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v16

    .line 107
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v17

    .line 108
    packed-switch v17, :pswitch_data_1

    goto :goto_8

    .line 110
    :pswitch_5
    invoke-static/range {v16 .. v16}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/multisimservice/model/SimInfo;->setIMSI(Ljava/lang/String;)V

    .line 111
    goto :goto_9

    .line 113
    :pswitch_6
    invoke-static/range {v16 .. v16}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/multisimservice/model/SimInfo;->setICCID(Ljava/lang/String;)V

    .line 114
    goto :goto_9

    .line 117
    :pswitch_7
    move-object/from16 v0, v16

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    goto :goto_7

    :cond_1
    const/4 v0, 0x1

    :goto_7
    invoke-virtual {v14, v0}, Lcom/huawei/multisimservice/model/SimInfo;->setActive(Z)V

    .line 118
    goto :goto_9

    .line 120
    :goto_8
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " unkown type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_9
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_6

    .line 124
    :cond_2
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " profileInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_5

    .line 98
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    .line 128
    :cond_4
    invoke-virtual {v4, v8}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setSimInfoList(Ljava/util/List;)V

    .line 69
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 131
    :cond_5
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static d([B)I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 50
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 51
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 52
    new-instance v7, Lo/daz;

    invoke-direct {v7}, Lo/daz;-><init>()V

    .line 53
    invoke-virtual {v7, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 54
    invoke-static {v8}, Lo/diu;->e(Lo/dba;)[I

    move-result-object v9

    .line 55
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error Code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, v9, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    aget v0, v9, v0

    const v1, 0x186a0

    if-ne v0, v1, :cond_0

    .line 58
    const/4 v4, 0x0

    goto :goto_0

    .line 60
    :cond_0
    const/4 v0, 0x0

    aget v4, v9, v0

    .line 62
    :goto_0
    return v4
.end method

.method public static e([B)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 135
    const v2, 0x186a1

    .line 136
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    .line 137
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 138
    new-instance v5, Lo/daz;

    invoke-direct {v5}, Lo/daz;-><init>()V

    .line 139
    invoke-virtual {v5, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 141
    invoke-static {v6}, Lo/diu;->c(Lo/dba;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v7

    .line 143
    return-object v7
.end method

.method public static e(Lo/dba;)[I
    .locals 7

    .line 30
    invoke-virtual {p0}, Lo/dba;->a()Ljava/util/List;

    move-result-object v2

    .line 31
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 32
    new-array v4, v3, [I

    .line 33
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 34
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 35
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

    .line 37
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 38
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 33
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 45
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static g([B)Lo/dap;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 199
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error Code:111111111111111111111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-static/range {p0 .. p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 201
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 202
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 203
    invoke-virtual {v6}, Lo/dba;->d()Ljava/util/List;

    move-result-object v7

    .line 204
    invoke-virtual {v6}, Lo/dba;->a()Ljava/util/List;

    move-result-object v8

    .line 205
    new-instance v9, Lo/dap;

    invoke-direct {v9}, Lo/dap;-><init>()V

    .line 207
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 208
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 209
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error Code:3333333333333333333333333"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 212
    :sswitch_0
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "authenticationResult "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/dap;->b(I)V

    .line 214
    goto :goto_2

    .line 216
    :sswitch_1
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SPN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/dap;->a(I)V

    .line 218
    goto :goto_2

    .line 220
    :goto_1
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    :goto_2
    goto/16 :goto_0

    .line 225
    :cond_0
    new-instance v10, Lo/dal;

    invoke-direct {v10}, Lo/dal;-><init>()V

    .line 226
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_2

    .line 227
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error Code:22222222222222222222222"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 229
    invoke-virtual {v11}, Lo/dba;->a()Ljava/util/List;

    move-result-object v12

    .line 230
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 231
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error Code:3333333333333333333333333"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_4

    .line 234
    :pswitch_0
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ICCID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->d(Ljava/lang/String;)V

    .line 236
    goto/16 :goto_5

    .line 238
    :pswitch_1
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SPN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->c(Ljava/lang/String;)V

    .line 240
    goto/16 :goto_5

    .line 242
    :pswitch_2
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "profile name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->b(Ljava/lang/String;)V

    .line 244
    goto/16 :goto_5

    .line 246
    :pswitch_3
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "profile class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->e(Ljava/lang/String;)V

    .line 248
    goto/16 :goto_5

    .line 251
    :pswitch_4
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ICON TYPE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lo/dal;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    goto/16 :goto_5

    .line 253
    :catch_0
    move-exception v15

    .line 254
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v15}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    goto/16 :goto_5

    .line 258
    :pswitch_5
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ICON "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->e([B)V

    .line 260
    goto/16 :goto_5

    .line 263
    :pswitch_6
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CONFINFO "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->a(Ljava/lang/String;)V

    .line 265
    goto :goto_5

    .line 268
    :pswitch_7
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PO "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->f(Ljava/lang/String;)V

    .line 270
    goto :goto_5

    .line 272
    :pswitch_8
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PPR "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/dal;->a([B)V

    .line 274
    goto :goto_5

    .line 276
    :goto_4
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    :goto_5
    goto/16 :goto_3

    .line 280
    :cond_1
    invoke-virtual {v9, v10}, Lo/dap;->d(Lo/dal;)V

    .line 282
    :cond_2
    return-object v9

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
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
