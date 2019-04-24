.class public Lo/dzo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "1000"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "1100"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "1200"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "1210"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "1300"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "1400"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "1500"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "1600"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "1700"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "1900"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/dzo;->d:[Ljava/lang/String;

    .line 24
    const/16 v0, 0x17

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "1100"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "1200"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "1900"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "130010"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "210020"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "2160030"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "430140"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "540550"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "651060"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "760070"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "800110"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "910010"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "1005020"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "1110030"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "1260040"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "1350050"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "1400110"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "1510010"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "1605020"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "1710030"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "1860040"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "1950050"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "2010050"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sput-object v0, Lo/dzo;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)Z
    .locals 8

    .line 142
    const-wide/16 v0, 0x0

    cmp-long v0, v0, p0

    if-nez v0, :cond_0

    .line 143
    const/4 v0, 0x0

    return v0

    .line 145
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 146
    const/4 v0, 0x1

    invoke-static {v0, v2, v3}, Lo/dzo;->b(ZJ)J

    move-result-wide v4

    .line 147
    const/4 v0, 0x0

    invoke-static {v0, v2, v3}, Lo/dzo;->b(ZJ)J

    move-result-wide v6

    .line 148
    cmp-long v0, p0, v4

    if-ltz v0, :cond_1

    cmp-long v0, p0, v6

    if-gtz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a(JJ)Z
    .locals 4

    .line 130
    sub-long v0, p2, p0

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 131
    const/4 v0, 0x1

    return v0

    .line 133
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 186
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    const/4 v0, 0x0

    return v0

    .line 189
    :cond_0
    const v0, 0xc356e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0xde2ba

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    const v0, 0xf55dc

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_2

    const v0, 0x155d2e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_2

    .line 190
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 192
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(ZJ)J
    .locals 3

    .line 399
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 400
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 401
    if-eqz p0, :cond_0

    .line 402
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 403
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 404
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 405
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 407
    :cond_0
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 408
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 409
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 410
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 412
    :goto_0
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static b()Ljava/lang/String;
    .locals 9

    .line 75
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 77
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "Z"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 79
    const-string v0, "GMT"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_4

    .line 81
    const-string v0, "PLGACHIEVE_KakaUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getTimeZone gmt_str ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v7, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v7, v0, :cond_3

    .line 83
    add-int/lit8 v0, v7, 0x1

    invoke-virtual {v6, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 84
    const-string v0, "-"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    const-string v0, "2D%"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 86
    :cond_0
    const-string v0, "+"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    const-string v0, "2B%"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 88
    :cond_1
    const/4 v0, 0x1

    if-ne v7, v0, :cond_2

    const-string v0, "0"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    goto :goto_2

    .line 95
    :cond_4
    const-string v0, "2B%8"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    :goto_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(JJ)Z
    .locals 4

    .line 43
    cmp-long v0, p2, p0

    if-gez v0, :cond_0

    .line 44
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "afterTimeStamps is invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 48
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 49
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 50
    invoke-virtual {v3, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 51
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 52
    const/4 v0, 0x1

    return v0

    .line 53
    :cond_1
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 54
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 56
    const/4 v0, 0x1

    return v0

    .line 58
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 101
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 102
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "isRTLLanguage() context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_0
    const-string v0, "ar"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 107
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "iw"

    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 109
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fa"

    .line 110
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 111
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ur"

    .line 112
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 113
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 117
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 157
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    const/4 v0, 0x0

    return v0

    .line 160
    :cond_0
    const/16 v0, 0x44c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x4b0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 161
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 163
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 204
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    const/4 v0, 0x0

    return v0

    .line 207
    :cond_0
    const v0, 0x33464

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x20f59e

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x6903c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 208
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 210
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 169
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    const v0, 0x1dc162

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x44c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x4b0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lo/dzo;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 175
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/lang/String;I)Z
    .locals 2

    .line 343
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaStatusIsValid "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    const/4 v0, 0x1

    return v0

    .line 347
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    .line 221
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    const/4 v0, 0x0

    return v0

    .line 224
    :cond_0
    const v0, 0x170a7a

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_1

    const v0, 0x1c61c8

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 225
    const/4 v0, 0x1

    return v0

    .line 227
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 3

    .line 239
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeTaskIDByVersionTwo key is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    const/4 v0, 0x0

    return v0

    .line 243
    :cond_0
    const v0, 0x187d9c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x1a17ce

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 244
    :cond_1
    const-string v0, "PLGACHIEVE_KakaUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "judgeTaskIDByVersionTwo true taskId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const/4 v0, 0x1

    return v0

    .line 247
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 311
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    const/4 v0, 0x0

    return v0

    .line 314
    :cond_0
    invoke-static {p0}, Lo/dzo;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lo/dzo;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 315
    :cond_1
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaTaskType task is onetime type"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const/4 v0, 0x0

    return v0

    .line 318
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 2

    .line 275
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    const/4 v0, 0x0

    return v0

    .line 278
    :cond_0
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x1dc162

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    :cond_1
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaTaskOtherType true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const/4 v0, 0x1

    return v0

    .line 282
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 2

    .line 257
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    const/4 v0, 0x0

    return v0

    .line 260
    :cond_0
    const v0, 0x83f86

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_1

    const v0, 0xb9906

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 261
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaTaskRecordType true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    const/4 v0, 0x1

    return v0

    .line 264
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 2

    .line 294
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    const/4 v0, 0x0

    return v0

    .line 297
    :cond_0
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaTaskOtherType true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const/4 v0, 0x1

    return v0

    .line 301
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 3

    .line 382
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeTaskIDByVersionTwo key is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    const/4 v0, 0x0

    return v0

    .line 386
    :cond_0
    sget-object v0, Lo/dzo;->a:[Ljava/lang/String;

    invoke-static {v0, p0}, Lo/dzr;->b([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 387
    const-string v0, "PLGACHIEVE_KakaUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "judgeTaskIDByVersionTwo true taskId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    const/4 v0, 0x1

    return v0

    .line 390
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static n(Ljava/lang/String;)Z
    .locals 2

    .line 370
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeTaskIDByVersion key is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const/4 v0, 0x0

    return v0

    .line 374
    :cond_0
    sget-object v0, Lo/dzo;->d:[Ljava/lang/String;

    invoke-static {v0, p0}, Lo/dzr;->b([Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeTaskIDByVersion true"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    const/4 v0, 0x1

    return v0

    .line 378
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static o(Ljava/lang/String;)Z
    .locals 2

    .line 357
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 358
    :cond_0
    const-string v0, "PLGACHIEVE_KakaUtil"

    const-string v1, "judgeKakaStatusIsValid status is not show"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    const/4 v0, 0x0

    return v0

    .line 361
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static p(Ljava/lang/String;)Z
    .locals 1

    .line 328
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    const/4 v0, 0x0

    return v0

    .line 331
    :cond_0
    const/16 v0, 0x76c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x1eabc2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 334
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
