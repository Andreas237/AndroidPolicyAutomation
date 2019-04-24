.class public Lo/dlk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z
    .locals 2

    .line 27
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 28
    const/4 v0, 0x1

    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;I)Z
    .locals 4

    .line 109
    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 110
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getShowCount()I

    move-result v0

    if-lt v0, p1, :cond_1

    .line 113
    const/4 v0, 0x1

    return v0

    .line 115
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/eae;->c(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 117
    const/4 v0, 0x1

    return v0

    .line 119
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z
    .locals 4

    .line 39
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/eae;->c(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 40
    const/4 v0, 0x1

    return v0

    .line 42
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c()I
    .locals 4

    .line 90
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "HHmm"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 91
    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 92
    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static d(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z
    .locals 2

    .line 101
    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    const/16 v1, 0x2710

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    const/16 v1, 0x2712

    if-eq v1, v0, :cond_0

    .line 102
    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgType()I

    move-result v0

    const/16 v1, 0x4e26

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgSrc()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_1

    .line 103
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 105
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 10

    .line 51
    invoke-static {}, Lo/dlk;->c()I

    move-result v4

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 56
    const/4 v0, 0x0

    const/4 v1, 0x4

    :try_start_0
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v5, v0

    .line 57
    const/4 v0, 0x4

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 60
    goto :goto_0

    .line 58
    :catch_0
    move-exception v8

    .line 59
    const-string v0, "SMART_SmartDataInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 63
    :sswitch_0
    if-lt v4, v5, :cond_3

    if-gt v4, v6, :cond_3

    .line 64
    const/4 v7, 0x1

    goto :goto_1

    .line 69
    :sswitch_1
    const/16 v0, 0x8

    const/16 v1, 0xc

    :try_start_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 70
    const/16 v0, 0xc

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v9

    .line 71
    if-lt v4, v5, :cond_0

    if-le v4, v6, :cond_1

    :cond_0
    if-lt v4, v8, :cond_2

    if-gt v4, v9, :cond_2

    .line 73
    :cond_1
    const/4 v7, 0x1

    .line 77
    :cond_2
    goto :goto_1

    .line 75
    :catch_1
    move-exception v8

    .line 76
    const-string v0, "SMART_SmartDataInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 82
    :cond_3
    :goto_1
    return v7

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_0
        0x10 -> :sswitch_1
    .end sparse-switch
.end method
