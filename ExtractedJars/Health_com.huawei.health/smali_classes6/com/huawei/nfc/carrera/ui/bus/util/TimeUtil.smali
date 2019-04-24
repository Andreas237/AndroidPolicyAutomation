.class public Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static lastClickTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 70
    if-nez p0, :cond_0

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 75
    invoke-virtual {v1, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getCalendar(Ljava/lang/String;)Ljava/util/Calendar;
    .locals 7

    .line 25
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 27
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    return-object v2

    .line 34
    :cond_0
    const/4 v4, -0x1

    .line 35
    const/4 v5, 0x0

    .line 38
    :try_start_0
    invoke-virtual {v3, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v5, v0

    .line 39
    invoke-virtual {v5}, Ljava/util/Date;->getMonth()I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 44
    goto :goto_0

    .line 41
    :catch_0
    move-exception v6

    .line 43
    const-string v0, "date parse error."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 46
    :goto_0
    const/4 v0, -0x1

    if-ge v0, v4, :cond_1

    const/16 v0, 0xd

    if-ge v4, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 48
    invoke-virtual {v2, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 51
    :cond_1
    return-object v2
.end method

.method public static isFastDoubleClick()Z
    .locals 6

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 83
    sget-wide v0, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->lastClickTime:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 84
    sput-wide v4, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->lastClickTime:J

    .line 85
    const/4 v0, 0x1

    return v0

    .line 87
    :cond_0
    sput-wide v4, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->lastClickTime:J

    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public static parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 4

    .line 56
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 59
    :try_start_0
    invoke-virtual {v2, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 61
    :catch_0
    move-exception v3

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parseDateStr ParseException dateStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 64
    const/4 v0, 0x0

    return-object v0
.end method
