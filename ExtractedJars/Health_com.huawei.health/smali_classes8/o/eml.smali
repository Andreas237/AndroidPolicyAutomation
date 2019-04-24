.class public Lo/eml;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(Ljava/util/List;Ljava/util/List;II)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;II)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 143
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    .line 149
    const-string v0, "NormalDecresPolicy"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u3010decresPoint\u3011 \uff1afor(i=0;i<size/samplingInterval;i++): size/samplingInterval:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "/"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v5, 0x0

    :goto_0
    div-int v0, v6, p3

    if-ge v5, v0, :cond_6

    .line 157
    const/4 v8, 0x1

    .line 166
    mul-int v0, v5, p3

    add-int/lit8 v9, v0, -0x1

    .line 167
    mul-int v10, v5, p3

    :goto_1
    add-int/lit8 v0, v5, 0x1

    mul-int v0, v0, p3

    if-ge v10, v0, :cond_4

    .line 171
    add-int/lit8 v11, v10, -0x1

    .line 172
    move v12, v10

    .line 174
    if-ltz v11, :cond_3

    if-lt v12, v6, :cond_0

    .line 176
    goto :goto_2

    .line 178
    :cond_0
    add-int/lit8 v0, v10, -0x1

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 179
    move-object/from16 v0, p1

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 180
    if-eqz v13, :cond_3

    if-nez v14, :cond_1

    .line 183
    goto :goto_2

    .line 185
    :cond_1
    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v13}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    float-to-int v1, v1

    sub-int v7, v0, v1

    .line 186
    add-int/lit8 v0, v10, -0x1

    if-ne v0, v9, :cond_2

    .line 192
    mul-int v0, p3, p4

    if-lt v7, v0, :cond_2

    .line 193
    goto :goto_2

    .line 200
    :cond_2
    move/from16 v0, p4

    if-eq v7, v0, :cond_3

    .line 204
    const/4 v8, 0x0

    .line 205
    goto :goto_3

    .line 167
    :cond_3
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 208
    :cond_4
    :goto_3
    const/4 v0, 0x1

    if-ne v8, v0, :cond_5

    .line 209
    mul-int v0, v5, p3

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 210
    new-instance v11, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v10}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    invoke-virtual {v10}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v1

    invoke-direct {v11, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 211
    invoke-virtual {v10}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->setData(Ljava/lang/Object;)V

    .line 212
    move-object/from16 v0, p2

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    goto :goto_4

    .line 215
    :cond_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 217
    :cond_6
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    rem-int v0, v0, p3

    if-eqz v0, :cond_7

    .line 218
    mul-int v0, v5, p3

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 219
    new-instance v8, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v1

    invoke-direct {v8, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 220
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->setData(Ljava/lang/Object;)V

    .line 221
    move-object/from16 v0, p2

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    :cond_7
    return-object v4
.end method

.method private e(Ljava/util/ArrayList;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 78
    const/4 v4, 0x0

    .line 79
    const/4 v5, 0x1

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x1

    .line 82
    invoke-interface/range {p8 .. p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 83
    if-ge v9, p3, :cond_0

    .line 84
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    .line 85
    :cond_0
    if-ne v9, p3, :cond_1

    .line 86
    const/4 v5, 0x0

    .line 89
    :cond_1
    :goto_1
    move/from16 v0, p6

    if-ge v9, v0, :cond_2

    .line 90
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 91
    :cond_2
    move/from16 v0, p6

    if-ne v9, v0, :cond_3

    .line 92
    const/4 v7, 0x0

    .line 94
    :cond_3
    :goto_2
    goto :goto_0

    .line 95
    :cond_4
    move/from16 v0, p6

    if-ne p3, v0, :cond_b

    .line 96
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 97
    const/4 v0, 0x1

    if-gt v8, v0, :cond_5

    .line 99
    const-string v0, "NormalDecresPolicy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "focusMaxMinData maxResultIndex == minResultIndex,valuesResult size <= 1,logic error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_5
    if-nez p3, :cond_7

    .line 103
    if-lt p2, p5, :cond_6

    .line 104
    const/4 p3, 0x1

    goto :goto_3

    .line 106
    :cond_6
    const/16 p6, 0x1

    goto :goto_3

    .line 108
    :cond_7
    add-int/lit8 v0, v8, -0x1

    if-ne p3, v0, :cond_9

    .line 109
    if-lt p2, p5, :cond_8

    .line 110
    add-int/lit8 p6, p6, -0x1

    goto :goto_3

    .line 112
    :cond_8
    add-int/lit8 p3, p3, -0x1

    goto :goto_3

    .line 116
    :cond_9
    if-lt p2, p5, :cond_a

    .line 117
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    .line 119
    :cond_a
    add-int/lit8 p3, p3, -0x1

    .line 123
    :cond_b
    :goto_3
    add-int/2addr p3, v4

    .line 124
    add-int p6, p6, v6

    .line 126
    if-eqz v7, :cond_c

    if-ltz p6, :cond_c

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p6

    if-gt v1, v0, :cond_c

    .line 127
    move/from16 v0, p6

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    move-object/from16 v1, p7

    invoke-virtual {v1, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->setX(F)V

    .line 128
    move/from16 v0, p6

    move-object/from16 v1, p7

    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 131
    :cond_c
    if-eqz v5, :cond_d

    if-ltz p3, :cond_d

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p3, v0, :cond_d

    .line 132
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    invoke-virtual {p4, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->setX(F)V

    .line 133
    invoke-virtual {p1, p3, p4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 135
    :cond_d
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)I
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;I)I"
        }
    .end annotation

    .line 25
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, p2

    if-ge v0, v1, :cond_1

    .line 27
    :cond_0
    const/4 v0, 0x5

    return v0

    .line 30
    :cond_1
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 31
    const v12, -0x800001

    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 32
    new-instance v14, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v14, v1, v2, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    .line 33
    new-instance v15, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v15, v1, v2, v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    .line 34
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 35
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpl-float v0, v0, v12

    if-lez v0, :cond_2

    .line 36
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v12

    .line 37
    move v9, v11

    .line 38
    move-object/from16 v14, v17

    .line 40
    :cond_2
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    cmpg-float v0, v0, v13

    if-gez v0, :cond_3

    .line 41
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v13

    .line 42
    move v10, v11

    .line 43
    move-object/from16 v15, v17

    .line 45
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 46
    goto :goto_0

    .line 48
    :cond_4
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v2

    invoke-virtual {v14}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    move-object v14, v0

    .line 49
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v15}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-virtual {v15}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v2

    invoke-virtual {v15}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    move-object v15, v0

    .line 51
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    div-int v16, v0, p2

    .line 54
    const-string v0, "NormalDecresPolicy"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u3010decresPoint\u3011 \uff1ainterval("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") = values.size():"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " /showCounts:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ";"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    div-int v17, v9, v16

    div-int v18, v10, v16

    .line 59
    const-string v0, "NormalDecresPolicy"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u3010decresPoint\u3011 \uff1amaxResultIndex("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ") = maxIndex("

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ") / interval("

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ")"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 63
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    move/from16 v3, v16

    const/4 v4, 0x5

    invoke-direct {v0, v1, v2, v3, v4}, Lo/eml;->d(Ljava/util/List;Ljava/util/List;II)Ljava/util/List;

    move-result-object v20

    .line 65
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move v2, v9

    move/from16 v3, v17

    move-object v4, v14

    move v5, v10

    move/from16 v6, v18

    move-object v7, v15

    move-object/from16 v8, v20

    invoke-direct/range {v0 .. v8}, Lo/eml;->e(Ljava/util/ArrayList;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;IILcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Ljava/util/List;)V

    .line 67
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    .line 68
    move-object/from16 v0, p1

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 69
    mul-int/lit8 v0, v16, 0x5

    return v0
.end method
