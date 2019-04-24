.class public Lo/amz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)J
    .locals 4

    .line 93
    invoke-static {p0, p1}, Lo/amz;->c(J)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static b(J)J
    .locals 2

    .line 28
    const-wide/32 v0, 0xea60

    div-long v0, p0, v0

    return-wide v0
.end method

.method public static c(J)J
    .locals 6

    .line 56
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 58
    :try_start_0
    invoke-virtual {v4, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 59
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 60
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 61
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 62
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 63
    :catch_0
    move-exception v5

    .line 64
    const-string v0, "Step_TimeUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(JJ)Z
    .locals 9

    .line 113
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    .line 114
    :cond_0
    const-string v0, "Step_TimeUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSameDay return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_1
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 118
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, p2, p3}, Ljava/util/Date;-><init>(J)V

    .line 119
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v6, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 121
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 123
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 124
    const/4 v0, 0x1

    return v0

    .line 126
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(J)J
    .locals 6

    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 77
    :try_start_0
    invoke-virtual {v4, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 78
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 79
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 80
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 81
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_0

    .line 82
    :catch_0
    move-exception v5

    .line 83
    const-string v0, "Step_TimeUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e(J)J
    .locals 2

    .line 32
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    return-wide v0
.end method

.method public static k(J)Ljava/lang/String;
    .locals 5

    .line 135
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 136
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 137
    invoke-virtual {v3, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 138
    return-object v4
.end method
