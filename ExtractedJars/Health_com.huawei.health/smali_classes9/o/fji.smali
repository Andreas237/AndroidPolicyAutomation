.class public Lo/fji;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:J

.field private static d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lo/fji;->b:J

    .line 25
    const-wide/32 v0, 0xea60

    sput-wide v0, Lo/fji;->d:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(JLandroid/content/Context;)Ljava/lang/String;
    .locals 17

    .line 31
    const-string v0, "SocialUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRelativeTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    const-string v8, ""

    .line 34
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    .line 35
    const-string v0, "SocialUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simpleDateFormat.parse is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    return-object v8

    .line 39
    :cond_0
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 40
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 41
    invoke-virtual {v10, v9}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 43
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 44
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 45
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v12, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 47
    const-wide/16 v13, -0x1

    .line 48
    new-instance v0, Ljava/util/Date;

    move-wide/from16 v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object v15, v0

    .line 49
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long v13, v0, v2

    .line 51
    invoke-static {v15}, Lo/fji;->d(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    sget-wide v0, Lo/fji;->d:J

    cmp-long v0, v0, v13

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v13

    if-gtz v0, :cond_1

    .line 55
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_information_just_now:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 56
    :cond_1
    sget-wide v0, Lo/fji;->b:J

    cmp-long v0, v0, v13

    if-ltz v0, :cond_2

    sget-wide v0, Lo/fji;->d:J

    cmp-long v0, v0, v13

    if-gez v0, :cond_2

    .line 58
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

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

    .line 61
    :cond_2
    invoke-virtual {v12, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 64
    :cond_3
    invoke-static {v15}, Lo/fji;->e(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_calendar_current_date_yesterday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 69
    :cond_4
    const v16, 0x10010

    .line 70
    move/from16 v0, v16

    invoke-static {v15, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v8

    .line 72
    :goto_0
    const-string v0, "SocialUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "relativeTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-object v8
.end method

.method public static d(Ljava/util/Date;)Z
    .locals 5

    .line 83
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 84
    const/4 v0, 0x0

    return v0

    .line 87
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 88
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 89
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 91
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 92
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 93
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 94
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 95
    const/4 v0, 0x1

    return v0

    .line 97
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Ljava/util/Date;)Z
    .locals 5

    .line 111
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 112
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 116
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 117
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 119
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 120
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 122
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, -0x1

    if-ne v1, v0, :cond_1

    .line 123
    const/4 v0, 0x1

    return v0

    .line 125
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 128
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
