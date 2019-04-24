.class public Lo/cdp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lo/cex;
    .locals 28

    .line 59
    const/4 v5, 0x0

    .line 60
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 62
    new-instance v7, Ljava/util/TreeMap;

    invoke-direct {v7}, Ljava/util/TreeMap;-><init>()V

    .line 63
    new-instance v8, Ljava/util/TreeMap;

    invoke-direct {v8}, Ljava/util/TreeMap;-><init>()V

    .line 65
    new-instance v9, Ljava/util/TreeMap;

    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    .line 66
    new-instance v10, Ljava/util/TreeMap;

    invoke-direct {v10}, Ljava/util/TreeMap;-><init>()V

    .line 67
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 68
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 72
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 75
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 77
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 79
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 80
    const-string v0, "\n"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v19

    .line 82
    const/16 v20, 0x0

    :goto_0
    move-object/from16 v0, v19

    array-length v0, v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_e

    .line 83
    aget-object v21, v19, v20

    .line 84
    const-string v0, ";"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v22

    .line 85
    move-object/from16 v0, v22

    array-length v0, v0

    move/from16 v23, v0

    .line 86
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    move-object/from16 v1, v21

    invoke-static {v1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v21

    .line 89
    const-string v0, "tp=lbs"

    move-object/from16 v1, v21

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    add-int/lit8 v0, v23, -0x2

    new-array v1, v0, [D

    move-object/from16 v24, v1

    .line 91
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v25

    .line 92
    const/16 v27, 0x2

    :goto_1
    move/from16 v0, v27

    move/from16 v1, v23

    if-ge v0, v1, :cond_0

    .line 93
    add-int/lit8 v0, v27, -0x2

    aget-object v1, v22, v27

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    aput-wide v1, v24, v0

    .line 92
    add-int/lit8 v27, v27, 0x1

    goto :goto_1

    .line 96
    :cond_0
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    goto/16 :goto_2

    :cond_1
    const-string v0, "tp=p-m"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 98
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 99
    :cond_2
    const-string v0, "tp=b-p-m"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 101
    :cond_3
    const-string v0, "tp=h-r"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 102
    new-instance v24, Lo/cev;

    invoke-direct/range {v24 .. v24}, Lo/cev;-><init>()V

    .line 103
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lo/cev;->b(J)V

    .line 104
    const/4 v0, 0x2

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cev;->e(I)V

    .line 105
    move-object/from16 v0, v24

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    goto/16 :goto_2

    :cond_4
    const-string v0, "tp=s-r"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 107
    new-instance v24, Lo/cfd;

    invoke-direct/range {v24 .. v24}, Lo/cfd;-><init>()V

    .line 108
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lo/cfd;->a(J)V

    .line 109
    const/4 v0, 0x2

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cfd;->e(I)V

    .line 110
    move-object/from16 v0, v24

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    goto/16 :goto_2

    :cond_5
    const-string v0, "tp=pm-n"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 112
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 113
    :cond_6
    const-string v0, "tp=pm-b"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 114
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 115
    :cond_7
    const-string v0, "tp=alt"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 116
    new-instance v0, Lo/cfb;

    const/4 v1, 0x1

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x2

    aget-object v3, v22, v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cfb;-><init>(JD)V

    move-object/from16 v24, v0

    .line 117
    move-object/from16 v0, v24

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    goto/16 :goto_2

    :cond_8
    const-string v0, "tp=i-h-r"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 119
    new-instance v24, Lo/cev;

    invoke-direct/range {v24 .. v24}, Lo/cev;-><init>()V

    .line 120
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lo/cev;->b(J)V

    .line 121
    const/4 v0, 0x2

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cev;->e(I)V

    .line 122
    move-object/from16 v0, v24

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    goto/16 :goto_2

    :cond_9
    const-string v0, "tp=swf"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 124
    new-instance v0, Lo/cfl;

    const/4 v1, 0x1

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x2

    aget-object v3, v22, v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfl;-><init>(JI)V

    move-object/from16 v24, v0

    .line 125
    move-object/from16 v0, v24

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    goto/16 :goto_2

    :cond_a
    const-string v0, "tp=p-f"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 127
    new-instance v0, Lo/cfj;

    const/4 v1, 0x1

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x2

    aget-object v3, v22, v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfj;-><init>(JI)V

    move-object/from16 v24, v0

    .line 128
    move-object/from16 v0, v16

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    goto/16 :goto_2

    :cond_b
    const-string v0, "tp=rs"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 130
    new-instance v0, Lo/cfn;

    const/4 v1, 0x1

    aget-object v1, v22, v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x2

    aget-object v3, v22, v3

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/cfn;-><init>(JF)V

    move-object/from16 v24, v0

    .line 131
    move-object/from16 v0, v17

    move-object/from16 v1, v24

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    goto/16 :goto_2

    :cond_c
    const-string v0, "tp=rp"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 133
    new-instance v24, Lo/cvv;

    invoke-direct/range {v24 .. v24}, Lo/cvv;-><init>()V

    .line 134
    const/4 v0, 0x1

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lo/cvv;->c(J)V

    .line 135
    const/4 v0, 0x2

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->a(I)V

    .line 136
    const/4 v0, 0x3

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->b(I)V

    .line 137
    const/4 v0, 0x4

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->e(I)V

    .line 138
    const/4 v0, 0x5

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->c(I)V

    .line 139
    const/4 v0, 0x6

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->d(I)V

    .line 140
    const/4 v0, 0x7

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->k(I)V

    .line 141
    const/16 v0, 0x8

    aget-object v0, v22, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lo/cvv;->i(I)V

    .line 142
    move-object/from16 v0, v18

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :cond_d
    :goto_2
    goto :goto_3

    .line 144
    :catch_0
    move-exception v24

    .line 145
    const-string v0, "Track_ConvertDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const-string v0, "Track_ConvertDataUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v21, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 147
    :goto_3
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_0

    .line 151
    :cond_e
    new-instance v5, Lo/cex;

    invoke-direct {v5}, Lo/cex;-><init>()V

    .line 152
    invoke-virtual {v5, v6}, Lo/cex;->d(Ljava/util/Map;)V

    .line 153
    invoke-virtual {v5, v7}, Lo/cex;->a(Ljava/util/Map;)V

    .line 154
    invoke-virtual {v5, v8}, Lo/cex;->b(Ljava/util/Map;)V

    .line 155
    invoke-virtual {v5, v9}, Lo/cex;->e(Ljava/util/Map;)V

    .line 156
    invoke-virtual {v5, v10}, Lo/cex;->c(Ljava/util/Map;)V

    .line 157
    invoke-virtual {v5, v11}, Lo/cex;->e(Ljava/util/ArrayList;)V

    .line 158
    invoke-virtual {v5, v12}, Lo/cex;->a(Ljava/util/ArrayList;)V

    .line 159
    invoke-virtual {v5, v13}, Lo/cex;->d(Ljava/util/ArrayList;)V

    .line 160
    invoke-virtual {v5, v14}, Lo/cex;->c(Ljava/util/ArrayList;)V

    .line 161
    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Lo/cex;->e(Ljava/util/List;)V

    .line 162
    invoke-virtual {v5, v15}, Lo/cex;->a(Ljava/util/List;)V

    .line 163
    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Lo/cex;->b(Ljava/util/List;)V

    .line 164
    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Lo/cex;->b(Ljava/util/ArrayList;)V

    .line 165
    return-object v5
.end method

.method public static b(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/cfg;>;"
        }
    .end annotation

    .line 170
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 171
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 172
    :cond_0
    return-object v4

    .line 174
    :cond_1
    const-string v0, "\n"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 176
    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_3

    .line 177
    aget-object v7, v5, v6

    .line 178
    const-string v0, "#"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 180
    :try_start_0
    array-length v0, v8

    if-lez v0, :cond_2

    .line 181
    new-instance v9, Lo/cfg;

    invoke-direct {v9}, Lo/cfg;-><init>()V

    .line 182
    const/4 v0, 0x0

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/cfg;->e(J)V

    .line 183
    const/4 v0, 0x1

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/cfg;->a(J)V

    .line 184
    const/4 v0, 0x2

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v9, v0}, Lo/cfg;->a(F)V

    .line 185
    const/4 v0, 0x3

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v9, v0}, Lo/cfg;->e(F)V

    .line 186
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    :cond_2
    goto :goto_1

    .line 188
    :catch_0
    move-exception v9

    .line 189
    const-string v0, "Track_ConvertUils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 193
    :cond_3
    return-object v4
.end method

.method public static b(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lo/cew;
    .locals 3

    .line 35
    new-instance v2, Lo/cew;

    invoke-direct {v2}, Lo/cew;-><init>()V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/cew;->a(J)V

    .line 39
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cew;->b(I)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cew;->c(I)V

    .line 41
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/cew;->d(I)V

    .line 42
    invoke-virtual {p0}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->b(Ljava/util/ArrayList;)V

    .line 43
    invoke-virtual {p0}, Lo/cex;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->c(Ljava/util/Map;)V

    .line 44
    invoke-virtual {p0}, Lo/cex;->d()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->a(Ljava/util/Map;)V

    .line 45
    invoke-virtual {p0}, Lo/cex;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->b(Ljava/util/Map;)V

    .line 46
    invoke-virtual {p0}, Lo/cex;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->e(Ljava/util/ArrayList;)V

    .line 47
    invoke-virtual {p0}, Lo/cex;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->c(Ljava/util/ArrayList;)V

    .line 48
    invoke-virtual {p0}, Lo/cex;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->a(Ljava/util/ArrayList;)V

    .line 49
    invoke-virtual {p0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/cew;->d(Ljava/util/ArrayList;)V

    .line 50
    return-object v2
.end method
