.class public final Lo/pn;
.super Lo/pw;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    invoke-virtual {p1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 202
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 203
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 204
    const/16 v0, 0x28

    if-ne v4, v0, :cond_0

    .line 207
    invoke-static {v3, v2}, Lo/pn;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 208
    const/16 v0, 0x28

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 213
    :cond_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 216
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 176
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 178
    const/16 v0, 0x28

    if-eq v1, v0, :cond_0

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_0
    add-int/lit8 v0, p0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 184
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 186
    invoke-interface {v2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 187
    const/16 v0, 0x29

    if-ne v5, v0, :cond_1

    .line 188
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 189
    :cond_1
    const/16 v0, 0x30

    if-lt v5, v0, :cond_2

    const/16 v0, 0x39

    if-gt v5, v0, :cond_2

    .line 190
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 192
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 185
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 195
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/or;)Lo/pj;
    .locals 37

    .line 45
    invoke-virtual/range {p1 .. p1}, Lo/or;->d()Lo/od;

    move-result-object v16

    .line 46
    sget-object v0, Lo/od;->l:Lo/od;

    move-object/from16 v1, v16

    if-eq v1, v0, :cond_0

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_0
    invoke-static/range {p1 .. p1}, Lo/pn;->i(Lo/or;)Ljava/lang/String;

    move-result-object v17

    .line 52
    const/16 v18, 0x0

    .line 53
    const/16 v19, 0x0

    .line 54
    const/16 v20, 0x0

    .line 55
    const/16 v21, 0x0

    .line 56
    const/16 v22, 0x0

    .line 57
    const/16 v23, 0x0

    .line 58
    const/16 v24, 0x0

    .line 59
    const/16 v25, 0x0

    .line 60
    const/16 v26, 0x0

    .line 61
    const/16 v27, 0x0

    .line 62
    const/16 v28, 0x0

    .line 63
    const/16 v29, 0x0

    .line 64
    const/16 v30, 0x0

    .line 65
    new-instance v31, Ljava/util/HashMap;

    invoke-direct/range {v31 .. v31}, Ljava/util/HashMap;-><init>()V

    .line 67
    const/16 v32, 0x0

    .line 69
    :goto_0
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v32

    if-ge v1, v0, :cond_4

    .line 70
    move/from16 v0, v32

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lo/pn;->d(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v33

    .line 71
    if-nez v33, :cond_1

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_1
    invoke-virtual/range {v33 .. v33}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    add-int v32, v32, v0

    .line 77
    move/from16 v0, v32

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lo/pn;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v34

    .line 78
    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v0

    add-int v32, v32, v0

    .line 80
    move-object/from16 v35, v33

    const/16 v36, -0x1

    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "00"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x0

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "01"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "10"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x2

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "11"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x3

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "13"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x4

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "15"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x5

    goto/16 :goto_1

    :sswitch_6
    const-string v0, "17"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x6

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "3100"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x7

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "3101"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x8

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "3102"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x9

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "3103"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xa

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "3104"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xb

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "3105"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xc

    goto/16 :goto_1

    :sswitch_d
    const-string v0, "3106"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xd

    goto/16 :goto_1

    :sswitch_e
    const-string v0, "3107"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xe

    goto/16 :goto_1

    :sswitch_f
    const-string v0, "3108"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0xf

    goto/16 :goto_1

    :sswitch_10
    const-string v0, "3109"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x10

    goto/16 :goto_1

    :sswitch_11
    const-string v0, "3200"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x11

    goto/16 :goto_1

    :sswitch_12
    const-string v0, "3201"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x12

    goto/16 :goto_1

    :sswitch_13
    const-string v0, "3202"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x13

    goto/16 :goto_1

    :sswitch_14
    const-string v0, "3203"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x14

    goto/16 :goto_1

    :sswitch_15
    const-string v0, "3204"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x15

    goto/16 :goto_1

    :sswitch_16
    const-string v0, "3205"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x16

    goto/16 :goto_1

    :sswitch_17
    const-string v0, "3206"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x17

    goto/16 :goto_1

    :sswitch_18
    const-string v0, "3207"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x18

    goto/16 :goto_1

    :sswitch_19
    const-string v0, "3208"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x19

    goto/16 :goto_1

    :sswitch_1a
    const-string v0, "3209"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1a

    goto/16 :goto_1

    :sswitch_1b
    const-string v0, "3920"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1b

    goto :goto_1

    :sswitch_1c
    const-string v0, "3921"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1c

    goto :goto_1

    :sswitch_1d
    const-string v0, "3922"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1d

    goto :goto_1

    :sswitch_1e
    const-string v0, "3923"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1e

    goto :goto_1

    :sswitch_1f
    const-string v0, "3930"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x1f

    goto :goto_1

    :sswitch_20
    const-string v0, "3931"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x20

    goto :goto_1

    :sswitch_21
    const-string v0, "3932"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x21

    goto :goto_1

    :sswitch_22
    const-string v0, "3933"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v36, 0x22

    :cond_2
    :goto_1
    packed-switch v36, :pswitch_data_0

    goto/16 :goto_2

    .line 82
    :pswitch_0
    move-object/from16 v19, v34

    .line 83
    goto/16 :goto_3

    .line 85
    :pswitch_1
    move-object/from16 v18, v34

    .line 86
    goto/16 :goto_3

    .line 88
    :pswitch_2
    move-object/from16 v20, v34

    .line 89
    goto/16 :goto_3

    .line 91
    :pswitch_3
    move-object/from16 v21, v34

    .line 92
    goto/16 :goto_3

    .line 94
    :pswitch_4
    move-object/from16 v22, v34

    .line 95
    goto :goto_3

    .line 97
    :pswitch_5
    move-object/from16 v23, v34

    .line 98
    goto :goto_3

    .line 100
    :pswitch_6
    move-object/from16 v24, v34

    .line 101
    goto :goto_3

    .line 112
    :pswitch_7
    move-object/from16 v25, v34

    .line 113
    const-string v26, "KG"

    .line 114
    move-object/from16 v0, v33

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v27

    .line 115
    goto :goto_3

    .line 126
    :pswitch_8
    move-object/from16 v25, v34

    .line 127
    const-string v26, "LB"

    .line 128
    move-object/from16 v0, v33

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v27

    .line 129
    goto :goto_3

    .line 134
    :pswitch_9
    move-object/from16 v28, v34

    .line 135
    move-object/from16 v0, v33

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v29

    .line 136
    goto :goto_3

    .line 141
    :pswitch_a
    invoke-virtual/range {v34 .. v34}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_3

    .line 145
    const/4 v0, 0x0

    return-object v0

    .line 147
    :cond_3
    move-object/from16 v0, v34

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v28

    .line 148
    move-object/from16 v0, v34

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v30

    .line 149
    move-object/from16 v0, v33

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v29

    .line 150
    goto :goto_3

    .line 153
    :goto_2
    move-object/from16 v0, v31

    move-object/from16 v1, v33

    move-object/from16 v2, v34

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    :goto_3
    goto/16 :goto_0

    .line 158
    :cond_4
    new-instance v0, Lo/pj;

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v6, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, v26

    move-object/from16 v11, v27

    move-object/from16 v12, v28

    move-object/from16 v13, v29

    move-object/from16 v14, v30

    move-object/from16 v15, v31

    invoke-direct/range {v0 .. v15}, Lo/pj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x600 -> :sswitch_0
        0x601 -> :sswitch_1
        0x61f -> :sswitch_2
        0x620 -> :sswitch_3
        0x622 -> :sswitch_4
        0x624 -> :sswitch_5
        0x626 -> :sswitch_6
        0x17ecde -> :sswitch_7
        0x17ecdf -> :sswitch_8
        0x17ece0 -> :sswitch_9
        0x17ece1 -> :sswitch_a
        0x17ece2 -> :sswitch_b
        0x17ece3 -> :sswitch_c
        0x17ece4 -> :sswitch_d
        0x17ece5 -> :sswitch_e
        0x17ece6 -> :sswitch_f
        0x17ece7 -> :sswitch_10
        0x17f09f -> :sswitch_11
        0x17f0a0 -> :sswitch_12
        0x17f0a1 -> :sswitch_13
        0x17f0a2 -> :sswitch_14
        0x17f0a3 -> :sswitch_15
        0x17f0a4 -> :sswitch_16
        0x17f0a5 -> :sswitch_17
        0x17f0a6 -> :sswitch_18
        0x17f0a7 -> :sswitch_19
        0x17f0a8 -> :sswitch_1a
        0x180b24 -> :sswitch_1b
        0x180b25 -> :sswitch_1c
        0x180b26 -> :sswitch_1d
        0x180b27 -> :sswitch_1e
        0x180b43 -> :sswitch_1f
        0x180b44 -> :sswitch_20
        0x180b45 -> :sswitch_21
        0x180b46 -> :sswitch_22
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Lo/pn;->a(Lo/or;)Lo/pj;

    move-result-object v0

    return-object v0
.end method
