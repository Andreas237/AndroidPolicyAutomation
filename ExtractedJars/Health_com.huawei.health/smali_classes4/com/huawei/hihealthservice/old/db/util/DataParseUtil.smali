.class public Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 32
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static parseDouble(Ljava/lang/Object;)D
    .locals 2

    .line 184
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseDouble(Ljava/lang/Object;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static parseDouble(Ljava/lang/Object;D)D
    .locals 2

    .line 159
    if-nez p0, :cond_0

    .line 161
    return-wide p1

    .line 164
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_1

    .line 166
    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 169
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 171
    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 173
    :cond_2
    return-wide p1
.end method

.method public static parseInt(Ljava/lang/Object;)I
    .locals 1

    .line 109
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/hihealthservice/old/db/util/DataParseUtil;->parseInt(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public static parseInt(Ljava/lang/Object;I)I
    .locals 1

    .line 84
    if-nez p0, :cond_0

    .line 86
    return p1

    .line 89
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_1

    .line 91
    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0

    .line 94
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 96
    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 98
    :cond_2
    return p1
.end method
