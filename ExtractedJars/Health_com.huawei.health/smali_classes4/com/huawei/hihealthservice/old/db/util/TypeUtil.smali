.class public Lcom/huawei/hihealthservice/old/db/util/TypeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDataClass(I)Ljava/lang/Class;
    .locals 2

    .line 52
    const/4 v1, 0x0

    .line 53
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 56
    :sswitch_0
    const-class v1, Lcom/huawei/hihealthservice/old/model/BloodPresure;

    .line 57
    goto :goto_0

    .line 59
    :sswitch_1
    const-class v1, Lcom/huawei/hihealthservice/old/model/BloodSugar;

    .line 60
    goto :goto_0

    .line 62
    :sswitch_2
    const-class v1, Lcom/huawei/hihealthservice/old/model/MotionPath;

    .line 63
    goto :goto_0

    .line 65
    :sswitch_3
    const-class v1, Lcom/huawei/hihealthservice/old/model/SleepData;

    .line 66
    goto :goto_0

    .line 68
    :sswitch_4
    const-class v1, Lcom/huawei/hihealthservice/old/model/SportData;

    .line 69
    goto :goto_0

    .line 71
    :sswitch_5
    const-class v1, Lcom/huawei/hihealthservice/old/model/Weight;

    .line 72
    goto :goto_0

    .line 74
    :sswitch_6
    const-class v1, Lcom/huawei/hihealthservice/old/model/TimeLine;

    .line 75
    goto :goto_0

    .line 77
    :sswitch_7
    const-class v1, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;

    .line 78
    .line 82
    :goto_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_4
        0x200 -> :sswitch_3
        0x300 -> :sswitch_6
        0x303 -> :sswitch_7
        0x400 -> :sswitch_2
        0x500 -> :sswitch_1
        0x600 -> :sswitch_0
        0x700 -> :sswitch_5
    .end sparse-switch
.end method

.method public static getDataStatType(Ljava/lang/String;)I
    .locals 2

    .line 41
    const/4 v1, 0x0

    .line 42
    const-string v0, "sleep"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const/16 v1, 0x200

    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "sport"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    const/16 v1, 0x100

    .line 47
    :cond_1
    :goto_0
    return v1
.end method

.method public static getDetailDataType(Ljava/lang/String;)I
    .locals 2

    .line 23
    const/4 v1, 0x0

    .line 24
    const-string v0, "bloodpresure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const/16 v1, 0x600

    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "bloodsugar"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    const/16 v1, 0x500

    goto :goto_0

    .line 28
    :cond_1
    const-string v0, "motion"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    const/16 v1, 0x400

    goto :goto_0

    .line 30
    :cond_2
    const-string v0, "sleep"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    const/16 v1, 0x200

    goto :goto_0

    .line 32
    :cond_3
    const-string v0, "sport"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    const/16 v1, 0x100

    goto :goto_0

    .line 34
    :cond_4
    const-string v0, "weight"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 35
    const/16 v1, 0x700

    .line 37
    :cond_5
    :goto_0
    return v1
.end method

.method public static getObject(ILjava/lang/String;)[Lcom/huawei/hihealthservice/old/model/HealthData;
    .locals 2

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 89
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/hihealthservice/old/model/HealthData;

    return-object v0

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 92
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 95
    :sswitch_0
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$1;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$1;-><init>()V

    .line 97
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 98
    goto :goto_0

    .line 100
    :sswitch_1
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$2;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$2;-><init>()V

    .line 102
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 103
    goto :goto_0

    .line 105
    :sswitch_2
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$3;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$3;-><init>()V

    .line 107
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$3;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 108
    goto :goto_0

    .line 110
    :sswitch_3
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$4;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$4;-><init>()V

    .line 112
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$4;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 113
    goto :goto_0

    .line 115
    :sswitch_4
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$5;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$5;-><init>()V

    .line 117
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$5;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 118
    goto :goto_0

    .line 120
    :sswitch_5
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$6;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$6;-><init>()V

    .line 122
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$6;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 123
    goto :goto_0

    .line 125
    :sswitch_6
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$7;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$7;-><init>()V

    .line 127
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$7;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 128
    goto :goto_0

    .line 130
    :sswitch_7
    new-instance v0, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$8;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$8;-><init>()V

    .line 132
    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil$8;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 133
    .line 138
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 140
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/huawei/hihealthservice/old/model/HealthData;

    return-object v0

    .line 143
    :cond_1
    invoke-static {p1, v1}, Lo/cnj;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hihealthservice/old/model/HealthData;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_4
        0x200 -> :sswitch_3
        0x300 -> :sswitch_6
        0x303 -> :sswitch_7
        0x400 -> :sswitch_2
        0x500 -> :sswitch_1
        0x600 -> :sswitch_0
        0x700 -> :sswitch_5
    .end sparse-switch
.end method

.method public static getStartDay(I)I
    .locals 1

    .line 148
    const v0, 0x5f5e100

    rem-int v0, p0, v0

    return v0
.end method

.method public static getStartMonth(I)I
    .locals 2

    .line 154
    const v0, 0x5f5e100

    rem-int v0, p0, v0

    div-int/lit8 v0, v0, 0x64

    return v0
.end method

.method public static getStartTime(I)I
    .locals 3

    .line 169
    const/4 v1, -0x1

    .line 170
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getTimeSpanType(I)I

    move-result v2

    .line 171
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 174
    :pswitch_0
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getStartYear(I)I

    move-result v1

    .line 175
    goto :goto_0

    .line 177
    :pswitch_1
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getStartMonth(I)I

    move-result v1

    .line 178
    goto :goto_0

    .line 182
    :pswitch_2
    invoke-static {p0}, Lcom/huawei/hihealthservice/old/db/util/TypeUtil;->getStartDay(I)I

    move-result v1

    .line 183
    .line 187
    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static getStartYear(I)I
    .locals 2

    .line 159
    const v0, 0x5f5e100

    rem-int v0, p0, v0

    div-int/lit16 v0, v0, 0x2710

    return v0
.end method

.method public static getTimeSpanType(I)I
    .locals 1

    .line 164
    const v0, 0x5f5e100

    div-int v0, p0, v0

    return v0
.end method

.method public static getTimeZone()Ljava/lang/String;
    .locals 6

    .line 193
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v3

    .line 194
    invoke-virtual {v3}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v4

    .line 195
    const v0, 0x36ee80

    div-int v0, v4, v0

    mul-int/lit8 v0, v0, 0x64

    const v1, 0xea60

    div-int v1, v4, v1

    rem-int/lit8 v1, v1, 0x3c

    add-int v5, v0, v1

    .line 196
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isJsonData(Ljava/lang/String;)Z
    .locals 1

    .line 201
    const-string v0, "{"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "["

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

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
