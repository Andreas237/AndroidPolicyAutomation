.class public Lo/exj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:J

.field private static e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lo/exj;->d:J

    .line 28
    const-wide/32 v0, 0xea60

    sput-wide v0, Lo/exj;->e:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;J)Ljava/lang/String;
    .locals 17

    .line 76
    const-string v8, ""

    .line 78
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    .line 79
    const-string v0, "getRelativeTime"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simpleDateFormat.parse is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    return-object v8

    .line 83
    :cond_0
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 84
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 85
    invoke-virtual {v10, v9}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 87
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 88
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 89
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v12, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 91
    const-wide/16 v13, -0x1

    .line 92
    new-instance v0, Ljava/util/Date;

    move-wide/from16 v1, p1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 93
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v13, v0, v2

    .line 95
    invoke-static {v15}, Lo/exj;->d(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    sget-wide v0, Lo/exj;->e:J

    cmp-long v0, v0, v13

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v13

    if-gtz v0, :cond_1

    .line 99
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_information_just_now:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 100
    :cond_1
    sget-wide v0, Lo/exj;->d:J

    cmp-long v0, v0, v13

    if-ltz v0, :cond_2

    sget-wide v0, Lo/exj;->e:J

    cmp-long v0, v0, v13

    if-gez v0, :cond_2

    .line 102
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_social_information_minute_ago:I

    long-to-int v2, v13

    div-int/lit16 v2, v2, 0x3e8

    div-int/lit8 v2, v2, 0x3c

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-wide/16 v4, 0x3e8

    div-long v4, v13, v4

    const-wide/16 v6, 0x3c

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {v12, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 108
    :cond_3
    invoke-static {v15}, Lo/exj;->c(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 110
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_calendar_current_date_yesterday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 113
    :cond_4
    const v16, 0x10010

    .line 114
    move/from16 v0, v16

    invoke-static {v15, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 116
    :goto_0
    return-object v8
.end method

.method public static c(Ljava/util/Date;)Z
    .locals 5

    .line 154
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 155
    const/4 v0, 0x0

    return v0

    .line 158
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 159
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 160
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 162
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 163
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 164
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 165
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 166
    const/4 v0, 0x1

    return v0

    .line 168
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 171
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Ljava/util/Date;)Z
    .locals 5

    .line 126
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 127
    const/4 v0, 0x0

    return v0

    .line 130
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 131
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 132
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 134
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 135
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 137
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 138
    const/4 v0, 0x1

    return v0

    .line 140
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(D)D
    .locals 10

    .line 35
    const-string v0, "test"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==referenceLineDataProcess==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    move-wide v4, p0

    .line 38
    double-to-int v0, p0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    .line 40
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 41
    const/16 v7, 0x3e8

    .line 42
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 43
    const-string v0, "1"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    if-ge v9, v0, :cond_0

    .line 45
    const-string v0, "0"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 50
    int-to-double v0, v7

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    int-to-double v0, v7

    rem-double v0, p0, v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    .line 51
    int-to-double v0, v7

    div-double v0, p0, v0

    double-to-int v0, v0

    add-int/lit8 v9, v0, 0x1

    .line 52
    mul-int v0, v9, v7

    int-to-double v4, v0

    .line 54
    :cond_1
    goto :goto_1

    .line 55
    :cond_2
    const-wide/16 v0, 0x0

    cmpl-double v0, p0, v0

    if-eqz v0, :cond_4

    .line 56
    double-to-int v0, p0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 57
    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lo/dbf;->b(DI)D

    move-result-wide v4

    goto :goto_1

    .line 59
    :cond_3
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lo/dbf;->b(DI)D

    move-result-wide v4

    .line 64
    :cond_4
    :goto_1
    return-wide v4
.end method
