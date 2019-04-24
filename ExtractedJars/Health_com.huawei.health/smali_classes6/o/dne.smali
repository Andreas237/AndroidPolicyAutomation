.class public Lo/dne;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lo/dna;
    .locals 19

    .line 118
    invoke-static/range {p0 .. p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 119
    new-instance v5, Lo/dna;

    invoke-direct {v5}, Lo/dna;-><init>()V

    .line 120
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 121
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_4

    .line 122
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 124
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 125
    iget-object v8, v7, Lo/dba;->b:Ljava/util/List;

    .line 126
    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 127
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 128
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 129
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 130
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 132
    :sswitch_0
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dna;->a(I)V

    .line 133
    .line 137
    :goto_2
    goto :goto_1

    .line 138
    :cond_0
    iget-object v12, v10, Lo/dba;->b:Ljava/util/List;

    .line 139
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dba;

    .line 140
    iget-object v15, v14, Lo/dba;->e:Ljava/util/List;

    .line 141
    new-instance v16, Lo/dmz;

    invoke-direct/range {v16 .. v16}, Lo/dmz;-><init>()V

    .line 142
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 143
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 145
    :pswitch_0
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/dmz;->a(I)V

    .line 146
    goto :goto_5

    .line 149
    :pswitch_1
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lo/dmz;->e(J)V

    .line 150
    goto :goto_5

    .line 153
    :pswitch_2
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/dmz;->b(I)V

    .line 154
    .line 160
    :goto_5
    goto :goto_4

    .line 161
    :cond_1
    move-object/from16 v0, v16

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    goto/16 :goto_3

    .line 163
    :cond_2
    goto/16 :goto_0

    .line 165
    :cond_3
    invoke-virtual {v5, v6}, Lo/dna;->e(Ljava/util/List;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    goto :goto_6

    .line 166
    :catch_0
    move-exception v7

    .line 167
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :cond_4
    :goto_6
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b([B)Lo/dmw;
    .locals 1

    .line 221
    invoke-static {p0}, Lo/dnb;->d([B)Lo/dmw;

    move-result-object v0

    .line 222
    return-object v0
.end method

.method public static c([B)Lo/dmy;
    .locals 14

    .line 78
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 79
    new-instance v5, Lo/dmy;

    invoke-direct {v5}, Lo/dmy;-><init>()V

    .line 80
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_2

    .line 81
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 82
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 84
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 85
    iget-object v8, v7, Lo/dba;->b:Ljava/util/List;

    .line 86
    if-eqz v8, :cond_1

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 87
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 88
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 89
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 90
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 92
    :sswitch_0
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dmy;->c(I)V

    .line 93
    goto :goto_2

    .line 95
    :sswitch_1
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 100
    :goto_2
    goto :goto_1

    .line 101
    :cond_0
    goto/16 :goto_0

    .line 103
    :cond_1
    invoke-virtual {v5, v6}, Lo/dmy;->e(Ljava/util/List;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    goto :goto_3

    .line 104
    :catch_0
    move-exception v7

    .line 105
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_2
    :goto_3
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method private static c(Lo/dba;)[I
    .locals 7

    .line 32
    iget-object v2, p0, Lo/dba;->e:Ljava/util/List;

    .line 33
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 34
    new-array v4, v3, [I

    .line 35
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 36
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v6

    .line 37
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

    .line 39
    :sswitch_0
    array-length v0, v4

    if-lez v0, :cond_0

    .line 40
    const/16 v0, 0x10

    invoke-static {v6, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 35
    :cond_0
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 47
    :cond_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch
.end method

.method public static d([B)Lo/dmx;
    .locals 14

    .line 181
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 182
    new-instance v5, Lo/dmx;

    invoke-direct {v5}, Lo/dmx;-><init>()V

    .line 183
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_2

    .line 184
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v4, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 185
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 187
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v4}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v7

    .line 188
    iget-object v8, v7, Lo/dba;->b:Ljava/util/List;

    .line 189
    if-eqz v8, :cond_1

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 190
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 191
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 192
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 193
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 195
    :sswitch_0
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/dmx;->a(I)V

    .line 196
    goto :goto_2

    .line 198
    :sswitch_1
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    .line 203
    :goto_2
    goto :goto_1

    .line 204
    :cond_0
    goto/16 :goto_0

    .line 206
    :cond_1
    invoke-virtual {v5, v6}, Lo/dmx;->b(Ljava/util/List;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    goto :goto_3

    .line 207
    :catch_0
    move-exception v7

    .line 208
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    :cond_2
    :goto_3
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e([B)I
    .locals 10

    .line 51
    const/4 v4, 0x0

    .line 53
    :try_start_0
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 55
    new-instance v7, Lo/daz;

    invoke-direct {v7}, Lo/daz;-><init>()V

    .line 56
    invoke-virtual {v7, v6}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v8

    .line 57
    invoke-static {v8}, Lo/dne;->c(Lo/dba;)[I

    move-result-object v9

    .line 58
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

    .line 60
    const/4 v0, 0x0

    aget v0, v9, v0

    const v1, 0x186a0

    if-ne v0, v1, :cond_0

    .line 61
    const/4 v4, 0x0

    goto :goto_0

    .line 63
    :cond_0
    const/4 v0, 0x0

    aget v0, v9, v0
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    .line 67
    :goto_0
    goto :goto_1

    .line 65
    :catch_0
    move-exception v5

    .line 66
    const-string v0, "MultiSimUnPackage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getErrorCode TLVException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    :goto_1
    return v4
.end method
