.class public Lo/fee;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)I
    .locals 2

    .line 133
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 134
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 135
    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static b(J)I
    .locals 5

    .line 88
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    .line 89
    const/4 v0, 0x0

    return v0

    .line 91
    :cond_0
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 92
    invoke-virtual {v2}, Ljava/util/Date;->getMinutes()I

    move-result v3

    .line 93
    invoke-virtual {v2}, Ljava/util/Date;->getHours()I

    move-result v4

    .line 94
    mul-int/lit8 v0, v4, 0x3c

    add-int/2addr v0, v3

    return v0
.end method

.method public static c(J)Ljava/lang/String;
    .locals 5

    .line 34
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 35
    invoke-virtual {v2, p0, p1}, Ljava/util/Date;->setTime(J)V

    .line 36
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyy/M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 38
    return-object v4
.end method

.method public static d(J)Ljava/lang/String;
    .locals 5

    .line 47
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 48
    invoke-virtual {v2, p0, p1}, Ljava/util/Date;->setTime(J)V

    .line 50
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 51
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 53
    return-object v4
.end method

.method public static d(JJ)Z
    .locals 5

    .line 158
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 159
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 160
    new-instance v0, Ljava/util/Date;

    const-wide/32 v1, 0x5265c00

    sub-long v1, p0, v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 161
    new-instance v0, Ljava/util/Date;

    const-wide/32 v1, 0x5265c00

    sub-long v1, p2, v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 164
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 165
    const/4 v0, 0x1

    return v0

    .line 167
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/Long;)I
    .locals 3

    .line 142
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/fee;->a(J)I

    move-result v2

    .line 143
    add-int/lit8 v0, v2, -0x1

    if-nez v0, :cond_0

    .line 144
    const/16 v0, 0xe

    return v0

    .line 146
    :cond_0
    add-int/lit8 v0, v2, 0x7

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static e(J)Ljava/lang/String;
    .locals 5

    .line 74
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 75
    invoke-virtual {v2, p0, p1}, Ljava/util/Date;->setTime(J)V

    .line 76
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 78
    return-object v4
.end method
