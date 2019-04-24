.class public Lo/dfg;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dfu;Ljava/lang/String;)Lo/dfu;
    .locals 9

    .line 61
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    .line 62
    const-string v0, "FitnessUnTLVStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseStatusDuration invalid duration"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-object p0

    .line 65
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 66
    const/16 v0, 0x8

    const/16 v1, 0xc

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 68
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v6, v0

    .line 69
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 70
    invoke-virtual {p0, v6, v7}, Lo/dfu;->c(J)V

    .line 71
    mul-int/lit8 v0, v8, 0x3c

    invoke-virtual {p0, v0}, Lo/dfu;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    goto :goto_0

    .line 72
    :catch_0
    move-exception v6

    .line 73
    const-string v0, "FitnessUnTLVStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseStatusDuration parse time error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_0
    return-object p0
.end method

.method public static c(Lo/dba;)I
    .locals 8

    .line 42
    const/4 v2, 0x0

    .line 43
    iget-object v3, p0, Lo/dba;->b:Ljava/util/List;

    .line 44
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 45
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v5, v0, Lo/dba;->e:Ljava/util/List;

    .line 46
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 47
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v7

    .line 48
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 50
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 46
    .line 51
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 57
    :cond_1
    return v2

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static d(Lo/dba;)Lo/dfx;
    .locals 18

    .line 84
    new-instance v4, Lo/dfx;

    invoke-direct {v4}, Lo/dfx;-><init>()V

    .line 85
    const/4 v5, 0x0

    .line 86
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 88
    move-object/from16 v0, p0

    iget-object v7, v0, Lo/dba;->b:Ljava/util/List;

    .line 89
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 90
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v9, v0, Lo/dba;->e:Ljava/util/List;

    .line 91
    const/4 v10, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_0

    .line 92
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 93
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 95
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v11, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 96
    int-to-long v0, v5

    invoke-virtual {v4, v0, v1}, Lo/dfx;->e(J)V

    .line 91
    .line 97
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 103
    :cond_0
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v10, v0, Lo/dba;->b:Ljava/util/List;

    .line 104
    const/4 v11, 0x0

    :goto_3
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_2

    .line 105
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v12, v0, Lo/dba;->e:Ljava/util/List;

    .line 106
    new-instance v13, Lo/dfu;

    invoke-direct {v13}, Lo/dfu;-><init>()V

    .line 107
    const/4 v14, 0x0

    :goto_4
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_1

    .line 108
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v15

    .line 109
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 111
    :pswitch_0
    const/16 v0, 0x10

    invoke-static {v15, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v16

    .line 112
    move/from16 v0, v16

    invoke-virtual {v13, v0}, Lo/dfu;->d(I)V

    .line 113
    goto :goto_5

    .line 115
    :pswitch_1
    invoke-static {v13, v15}, Lo/dfg;->a(Lo/dfu;Ljava/lang/String;)Lo/dfu;

    move-result-object v13

    .line 116
    goto :goto_5

    .line 118
    :pswitch_2
    const/16 v0, 0x10

    invoke-static {v15, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v17

    .line 119
    move/from16 v0, v17

    invoke-virtual {v13, v0}, Lo/dfu;->e(I)V

    .line 107
    .line 120
    :goto_5
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_4

    .line 125
    :cond_1
    const-string v0, "FitnessUnTLVStatus"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_3

    .line 89
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 130
    :cond_3
    invoke-virtual {v4, v6}, Lo/dfx;->d(Ljava/util/List;)V

    .line 132
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
