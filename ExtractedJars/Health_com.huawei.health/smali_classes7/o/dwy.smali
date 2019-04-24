.class public Lo/dwy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static d:Lo/dwr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Ljava/lang/String;)V
    .locals 2

    .line 156
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 157
    const-string v0, "_uploadMedal"

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    sget-object v0, Lo/dwy;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/util/Map;)V

    .line 159
    return-void
.end method

.method public static b(Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/dvu;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 113
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 114
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    .line 116
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvu;

    .line 117
    invoke-virtual {v7}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v8

    .line 118
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    invoke-virtual {v7}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvu;->C()I

    move-result v2

    invoke-virtual {v0, v8, v1, v2}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 121
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    sget-object v1, Lo/dwy;->d:Lo/dwr;

    invoke-virtual {v7}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lo/dvu;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/dwr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    goto :goto_1

    .line 123
    :cond_0
    invoke-static {v8}, Lo/dwy;->d(Ljava/lang/String;)V

    .line 124
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    sget-object v1, Lo/dwy;->d:Lo/dwr;

    invoke-virtual {v7}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lo/dvu;->C()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lo/dwr;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 115
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 128
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dwy;->b(Ljava/lang/String;)V

    .line 131
    :cond_2
    return-void
.end method

.method public static d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V
    .locals 22

    .line 48
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 49
    return-void

    .line 51
    :cond_0
    sput-object p2, Lo/dwy;->a:Landroid/content/Context;

    .line 52
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 53
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 54
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object p1

    .line 56
    :cond_1
    sput-object p1, Lo/dwy;->d:Lo/dwr;

    .line 57
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 58
    return-void

    .line 60
    :cond_2
    sget-object v0, Lo/dwy;->a:Landroid/content/Context;

    const-string v1, "personal"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 62
    const-string v0, "PLGACHIEVE_AchieveSingleTrackMedalService"

    const-string v1, "flag is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-void

    .line 65
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-static {v0, v1}, Lo/dzr;->e(J)D

    move-result-wide v6

    .line 67
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 68
    const-wide/16 v9, 0x0

    .line 69
    const-string v11, ""

    .line 70
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v4}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v12

    .line 71
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->t()Ljava/util/ArrayList;

    move-result-object v13

    .line 72
    const/4 v0, 0x0

    if-eq v0, v12, :cond_8

    .line 73
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v14

    .line 74
    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_7

    .line 75
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/dvf;

    .line 76
    move-object/from16 v0, v16

    instance-of v0, v0, Lo/dvu;

    if-eqz v0, :cond_6

    .line 77
    move-object/from16 v17, v16

    check-cast v17, Lo/dvu;

    .line 78
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v18

    .line 79
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v0

    invoke-static {v0}, Lo/dzs;->c(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 80
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v19

    .line 82
    const-string v0, "3"

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 83
    const-wide v20, 0x403518f5c28f5c29L    # 21.0975

    goto :goto_1

    .line 84
    :cond_4
    const-string v0, "4"

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 85
    const-wide v20, 0x404518f5c28f5c29L    # 42.195

    goto :goto_1

    .line 87
    :cond_5
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->C()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double v20, v0, v2

    .line 89
    :goto_1
    cmpl-double v0, v6, v20

    if-ltz v0, :cond_6

    move-object/from16 v0, v19

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 90
    move-object/from16 v0, v17

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    cmpl-double v0, v20, v9

    if-lez v0, :cond_6

    .line 92
    move-wide/from16 v9, v20

    .line 93
    invoke-virtual/range {v17 .. v17}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v11

    .line 74
    :cond_6
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 101
    :cond_7
    invoke-static {v8, v11}, Lo/dwy;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 103
    :cond_8
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 4

    .line 140
    new-instance v1, Lo/dvy;

    invoke-direct {v1}, Lo/dvy;-><init>()V

    .line 141
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dvy;->a(I)V

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 143
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 144
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    invoke-virtual {v1, p0}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 146
    sget-object v0, Lo/dwy;->d:Lo/dwr;

    invoke-virtual {v0, v1}, Lo/dwr;->d(Lo/dvf;)Z

    .line 148
    :cond_0
    return-void
.end method
