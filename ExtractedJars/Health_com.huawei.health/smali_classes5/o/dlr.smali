.class public Lo/dlr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlr$a;
    }
.end annotation


# static fields
.field private static d:Lo/dlr;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:I


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lo/dlr;->b:I

    .line 39
    const/4 v0, 0x3

    iput v0, p0, Lo/dlr;->c:I

    .line 49
    iput-object p1, p0, Lo/dlr;->a:Landroid/content/Context;

    .line 50
    return-void
.end method

.method private b()V
    .locals 7

    .line 53
    const-string v0, "ai-common-001"

    const-string v1, "message_show_to_smartcard_time"

    const/16 v2, 0x7535

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 55
    const-string v0, "ai-common-002"

    const-string v1, "click_info_time_on_smartcard_oneday"

    const/16 v2, 0x7535

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 57
    const-string v0, "SmartDataInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg_show_time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " click_time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dlr;->c:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_0

    .line 61
    :catch_0
    move-exception v6

    .line 62
    const-string v0, "SmartDataInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    :cond_0
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    :try_start_1
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/dlr;->b:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 71
    goto :goto_1

    .line 69
    :catch_1
    move-exception v6

    .line 70
    const-string v0, "SmartDataInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :cond_1
    :goto_1
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/dlr;
    .locals 2

    .line 42
    sget-object v0, Lo/dlr;->d:Lo/dlr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 43
    new-instance v0, Lo/dlr;

    invoke-direct {v0, p0}, Lo/dlr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dlr;->d:Lo/dlr;

    .line 45
    :cond_0
    sget-object v0, Lo/dlr;->d:Lo/dlr;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/util/List;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;>;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;"
        }
    .end annotation

    .line 129
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 130
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_1
    invoke-direct {p0}, Lo/dlr;->b()V

    .line 133
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 134
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 135
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 136
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 138
    iget v0, p0, Lo/dlr;->c:I

    invoke-static {v10, v0}, Lo/dlk;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    goto :goto_0

    .line 141
    :cond_2
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dlk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 142
    goto :goto_0

    .line 144
    :cond_3
    invoke-static {v10}, Lo/dlk;->d(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_4

    .line 145
    goto :goto_0

    .line 147
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    .line 148
    const/4 v11, 0x0

    .line 149
    const-wide/16 v12, 0x0

    .line 151
    :try_start_0
    iget-object v0, p0, Lo/dlr;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_count"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v11, v0

    .line 153
    iget-object v0, p0, Lo/dlr;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v12, v0

    .line 157
    goto :goto_1

    .line 155
    :catch_0
    move-exception v14

    .line 156
    const-string v0, "SmartDataInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v14}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    :goto_1
    iget v0, p0, Lo/dlr;->b:I

    if-lt v11, v0, :cond_6

    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v12, v13}, Lo/cnk;->a(J)I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 160
    goto/16 :goto_0

    .line 162
    :cond_5
    iget-object v0, p0, Lo/dlr;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_information_click_count"

    .line 163
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 162
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 168
    :cond_6
    const-string v0, "SmartDataInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg create time is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getCreateTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_7

    .line 170
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    const v1, 0xc351

    if-eq v0, v1, :cond_8

    .line 171
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 174
    :cond_7
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    :cond_8
    :goto_2
    goto/16 :goto_0

    .line 178
    :cond_9
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_a

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_a

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_a
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 183
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 187
    :cond_b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 188
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 189
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v9

    .line 190
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 191
    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    if-ne v9, v0, :cond_c

    .line 192
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    :cond_c
    goto :goto_3

    .line 198
    :cond_d
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_f

    .line 199
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 200
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v9

    .line 201
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 202
    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v0

    if-ne v9, v0, :cond_e

    .line 203
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    :cond_e
    goto :goto_4

    .line 209
    :cond_f
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_10

    .line 210
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v8, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 214
    :cond_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_11

    .line 215
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    return-object v0

    .line 219
    :cond_11
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_12

    .line 220
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    return-object v0

    .line 222
    :cond_12
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_13

    .line 223
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    goto :goto_5

    :cond_13
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 222
    :goto_5
    return-object v0
.end method

.method public e()Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;
    .locals 10

    .line 80
    iget-object v0, p0, Lo/dlr;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const v1, 0xc351

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v2

    .line 81
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-static {v2}, Lo/dlk;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Lo/dlk;->b(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    return-object v2

    .line 85
    :cond_0
    iget-object v0, p0, Lo/dlr;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0}, Lo/dln;->a()Ljava/util/List;

    move-result-object v3

    .line 86
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 87
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 88
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 89
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 90
    iget v0, p0, Lo/dlr;->c:I

    invoke-static {v8, v0}, Lo/dlk;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    goto :goto_0

    .line 93
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dlk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 94
    goto :goto_0

    .line 96
    :cond_2
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    goto :goto_0

    .line 99
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 100
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v7

    .line 102
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 103
    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    if-ne v7, v0, :cond_4

    .line 104
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    :cond_4
    goto :goto_1

    .line 110
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 111
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 112
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v7

    .line 113
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    .line 114
    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getPriority()I

    move-result v0

    if-ne v7, v0, :cond_6

    .line 115
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_6
    goto :goto_2

    .line 121
    :cond_7
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 122
    new-instance v0, Lo/dlr$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dlr$a;-><init>(I)V

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 123
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    return-object v0

    .line 125
    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method
