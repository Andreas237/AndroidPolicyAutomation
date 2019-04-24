.class public Lo/adc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a([B)J
    .locals 10

    .line 53
    const-wide/16 v7, 0x0

    .line 54
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 55
    move-object v0, v9

    const/16 v1, 0x32

    aget-byte v1, p1, v1

    invoke-direct {p0, v1}, Lo/adc;->d(B)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    const/16 v2, 0x33

    aget-byte v2, p1, v2

    invoke-direct {p0, v2}, Lo/adc;->d(B)I

    move-result v2

    add-int/2addr v1, v2

    const/16 v2, 0x34

    aget-byte v2, p1, v2

    .line 56
    invoke-direct {p0, v2}, Lo/adc;->d(B)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/16 v3, 0x35

    aget-byte v3, p1, v3

    invoke-direct {p0, v3}, Lo/adc;->d(B)I

    move-result v3

    const/16 v4, 0x36

    aget-byte v4, p1, v4

    .line 57
    invoke-direct {p0, v4}, Lo/adc;->d(B)I

    move-result v4

    const/16 v5, 0x37

    aget-byte v5, p1, v5

    invoke-direct {p0, v5}, Lo/adc;->d(B)I

    move-result v5

    const/16 v6, 0x38

    aget-byte v6, p1, v6

    invoke-direct {p0, v6}, Lo/adc;->d(B)I

    move-result v6

    .line 55
    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 58
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    .line 59
    const-wide v0, 0x86988603638L

    sub-long v0, v7, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const-wide v0, 0x86988603638L

    sub-long v0, v7, v0

    const-wide/16 v2, -0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 63
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureDataParser getTime() time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-wide v7
.end method

.method private d(B)I
    .locals 7

    .line 69
    const/4 v4, 0x0

    .line 70
    and-int/lit16 v0, p1, 0xff

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    .line 73
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 78
    goto :goto_0

    .line 75
    :catch_0
    move-exception v6

    .line 77
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HdpBloodPresureDataParser  hexadecimalToDecimal e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_0
    return v4
.end method

.method private d([B)Lo/agb;
    .locals 12

    .line 26
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureDataParser getBloodPressureData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const/16 v0, 0x2d

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v6, v0

    .line 28
    const/16 v0, 0x2f

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v7, v0

    .line 29
    const/16 v0, 0x3f

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    int-to-short v8, v0

    .line 30
    invoke-direct {p0, p1}, Lo/adc;->a([B)J

    move-result-wide v9

    .line 31
    const/16 v0, 0x7fff

    if-ge v6, v0, :cond_0

    if-gtz v6, :cond_1

    .line 33
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureDataParser getBloodPressureData() systolic invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x0

    return-object v0

    .line 36
    :cond_1
    const/16 v0, 0x7fff

    if-ge v7, v0, :cond_2

    if-gtz v7, :cond_3

    .line 38
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureDataParser getBloodPressureData() diastolic invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_3
    const/16 v0, 0x7fff

    if-ge v8, v0, :cond_4

    if-gtz v8, :cond_5

    .line 43
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HdpBloodPresureDataParser getBloodPressureData() heartRate invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_5
    new-instance v11, Lo/agb;

    invoke-direct {v11}, Lo/agb;-><init>()V

    .line 47
    move-object v0, v11

    move v1, v6

    move v2, v7

    move v3, v8

    move-wide v4, v9

    invoke-virtual/range {v0 .. v5}, Lo/agb;->e(SSSJ)V

    .line 48
    return-object v11
.end method


# virtual methods
.method public e([B)Lo/afz;
    .locals 1

    .line 21
    invoke-direct {p0, p1}, Lo/adc;->d([B)Lo/agb;

    move-result-object v0

    return-object v0
.end method
