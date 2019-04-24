.class public Lo/dff;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/dba;)I
    .locals 8

    .line 44
    const/4 v2, 0x0

    .line 45
    iget-object v3, p0, Lo/dba;->b:Ljava/util/List;

    .line 46
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 47
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v5, v0, Lo/dba;->e:Ljava/util/List;

    .line 48
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 49
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v7

    .line 50
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

    .line 52
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 48
    .line 53
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 59
    :cond_1
    return v2

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method private static c(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/dfw;>;"
        }
    .end annotation

    .line 73
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 75
    const/4 v4, 0x0

    .line 77
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 79
    const/4 v0, 0x2

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 80
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    add-int/lit8 v4, v4, 0x2

    .line 83
    :goto_0
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x2

    if-lt v0, v1, :cond_0

    .line 84
    add-int/lit8 v0, v4, 0x2

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 85
    add-int/lit8 v4, v4, 0x2

    .line 86
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 87
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_7

    .line 91
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x4

    if-lt v0, v1, :cond_1

    .line 92
    add-int/lit8 v0, v4, 0x4

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 93
    add-int/lit8 v4, v4, 0x4

    .line 94
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 95
    new-instance v0, Lo/dfw;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x4

    if-lt v0, v1, :cond_2

    .line 98
    add-int/lit8 v0, v4, 0x4

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 99
    add-int/lit8 v4, v4, 0x4

    .line 100
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 101
    new-instance v0, Lo/dfw;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x4

    if-lt v0, v1, :cond_3

    .line 104
    add-int/lit8 v0, v4, 0x4

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 105
    add-int/lit8 v4, v4, 0x4

    .line 106
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 107
    new-instance v0, Lo/dfw;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    :cond_3
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x4

    if-lt v0, v1, :cond_4

    .line 110
    add-int/lit8 v0, v4, 0x4

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 111
    add-int/lit8 v4, v4, 0x4

    .line 112
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 113
    new-instance v0, Lo/dfw;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    :cond_4
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x4

    if-lt v0, v1, :cond_5

    .line 116
    add-int/lit8 v0, v4, 0x4

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 117
    add-int/lit8 v4, v4, 0x4

    .line 118
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 119
    new-instance v0, Lo/dfw;

    const/4 v1, 0x5

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_5
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x2

    if-lt v0, v1, :cond_6

    .line 122
    add-int/lit8 v0, v4, 0x2

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 123
    add-int/lit8 v4, v4, 0x2

    .line 124
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 125
    new-instance v0, Lo/dfw;

    const/4 v1, 0x6

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    :cond_6
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v4, 0x2

    if-lt v0, v1, :cond_7

    .line 128
    add-int/lit8 v0, v4, 0x2

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 129
    const/16 v0, 0x10

    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 130
    new-instance v0, Lo/dfw;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v5}, Lo/dfw;-><init>(II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    :cond_7
    return-object v6
.end method

.method public static c(Lo/dba;)Lo/dfq;
    .locals 24

    .line 154
    new-instance v6, Lo/dfq;

    invoke-direct {v6}, Lo/dfq;-><init>()V

    .line 155
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 156
    move-object/from16 v0, p0

    iget-object v8, v0, Lo/dba;->b:Ljava/util/List;

    .line 157
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_3

    .line 160
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v11, v0, Lo/dba;->e:Ljava/util/List;

    .line 161
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_0

    .line 162
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v13

    .line 163
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 165
    :sswitch_0
    const/16 v0, 0x10

    invoke-static {v13, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 166
    int-to-long v0, v9

    invoke-virtual {v6, v0, v1}, Lo/dfq;->b(J)V

    .line 161
    .line 167
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 172
    :cond_0
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v12, v0, Lo/dba;->b:Ljava/util/List;

    .line 173
    const/4 v13, 0x0

    :goto_3
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_2

    .line 174
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dba;

    iget-object v14, v0, Lo/dba;->e:Ljava/util/List;

    .line 175
    const/4 v15, 0x0

    .line 176
    const/16 v16, 0x0

    .line 177
    const/16 v17, 0x0

    .line 178
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 179
    const/16 v19, 0x0

    :goto_4
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_1

    .line 180
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v20

    .line 181
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v21

    .line 182
    packed-switch v21, :pswitch_data_0

    goto :goto_5

    .line 184
    :pswitch_0
    move-object/from16 v0, v20

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 185
    goto :goto_6

    .line 187
    :pswitch_1
    invoke-static/range {v20 .. v20}, Lo/dff;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    .line 188
    move-object/from16 v0, v18

    move-object/from16 v1, v22

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 189
    goto :goto_6

    .line 191
    :pswitch_2
    move-object/from16 v0, v20

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v17

    .line 192
    goto :goto_6

    .line 194
    :pswitch_3
    move-object/from16 v0, v20

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v16

    .line 195
    goto :goto_6

    .line 197
    :goto_5
    :pswitch_4
    new-instance v0, Lo/dfw;

    move/from16 v1, v21

    move-object/from16 v2, v20

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/dfw;-><init>(II)V

    move-object/from16 v23, v0

    .line 198
    move-object/from16 v0, v18

    move-object/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    :goto_6
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_4

    .line 202
    :cond_1
    move-object/from16 v0, v18

    int-to-long v1, v9

    move v3, v15

    move/from16 v4, v17

    move/from16 v5, v16

    invoke-static/range {v0 .. v5}, Lo/dff;->e(Ljava/util/List;JIII)Ljava/util/List;

    .line 203
    move-object/from16 v0, v18

    invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 173
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_3

    .line 159
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 206
    :cond_3
    invoke-virtual {v6, v7}, Lo/dfq;->e(Ljava/util/List;)V

    .line 207
    return-object v6

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static d(Lo/dba;)Lo/dft;
    .locals 16

    .line 236
    new-instance v4, Lo/dft;

    invoke-direct {v4}, Lo/dft;-><init>()V

    .line 237
    move-object/from16 v0, p0

    iget-object v5, v0, Lo/dba;->e:Ljava/util/List;

    .line 238
    move-object/from16 v0, p0

    iget-object v6, v0, Lo/dba;->b:Ljava/util/List;

    .line 239
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/daw;

    .line 240
    invoke-virtual {v8}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 242
    :sswitch_0
    invoke-virtual {v8}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dft;->b(I)V

    .line 243
    .line 247
    :goto_1
    goto :goto_0

    .line 248
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dba;

    .line 249
    iget-object v9, v8, Lo/dba;->b:Ljava/util/List;

    .line 250
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 251
    iget-object v12, v11, Lo/dba;->e:Ljava/util/List;

    .line 252
    new-instance v13, Lo/dft$e;

    invoke-direct {v13}, Lo/dft$e;-><init>()V

    .line 253
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/daw;

    .line 254
    invoke-virtual {v15}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 256
    :pswitch_0
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lo/dft$e;->e(I)V

    .line 257
    goto :goto_5

    .line 259
    :pswitch_1
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lo/dft$e;->a(I)V

    .line 260
    goto :goto_5

    .line 262
    :pswitch_2
    invoke-virtual {v15}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lo/dft$e;->d(I)V

    .line 263
    .line 267
    :goto_5
    goto :goto_4

    .line 268
    :cond_1
    invoke-virtual {v4}, Lo/dft;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    goto/16 :goto_3

    .line 270
    :cond_2
    const-string v0, "FitnessUnTLVSample"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "desFrame.getDatas().add(frame);"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/dft;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    goto/16 :goto_2

    .line 272
    :cond_3
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static e(Lo/dba;)I
    .locals 6

    .line 216
    const/4 v2, 0x0

    .line 217
    iget-object v3, p0, Lo/dba;->e:Ljava/util/List;

    .line 218
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/daw;

    .line 219
    invoke-virtual {v5}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 221
    :sswitch_0
    invoke-virtual {v5}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 222
    .line 226
    :goto_1
    goto :goto_0

    .line 227
    :cond_0
    return v2

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static e(Ljava/util/List;JIII)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dfw;>;JIII)Ljava/util/List<Lo/dfw;>;"
        }
    .end annotation

    .line 138
    mul-int/lit8 v0, p3, 0x3c

    int-to-long v0, v0

    add-long v2, p1, v0

    .line 140
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dfw;

    .line 141
    invoke-virtual {v5, v2, v3}, Lo/dfw;->c(J)V

    .line 142
    invoke-virtual {v5, p4}, Lo/dfw;->b(I)V

    .line 143
    invoke-virtual {v5, p5}, Lo/dfw;->d(I)V

    .line 144
    goto :goto_0

    .line 145
    :cond_0
    return-object p0
.end method
