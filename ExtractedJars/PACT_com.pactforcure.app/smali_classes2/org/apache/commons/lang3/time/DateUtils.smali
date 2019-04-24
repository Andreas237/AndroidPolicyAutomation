.class public Lorg/apache/commons/lang3/time/DateUtils;
.super Ljava/lang/Object;
.source "DateUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/time/DateUtils$DateIterator;
    }
.end annotation


# static fields
.field public static final MILLIS_PER_DAY:J = 0x5265c00L

.field public static final MILLIS_PER_HOUR:J = 0x36ee80L

.field public static final MILLIS_PER_MINUTE:J = 0xea60L

.field public static final MILLIS_PER_SECOND:J = 0x3e8L

.field private static final MODIFY_CEILING:I = 0x2

.field private static final MODIFY_ROUND:I = 0x1

.field private static final MODIFY_TRUNCATE:I = 0x0

.field public static final RANGE_MONTH_MONDAY:I = 0x6

.field public static final RANGE_MONTH_SUNDAY:I = 0x5

.field public static final RANGE_WEEK_CENTER:I = 0x4

.field public static final RANGE_WEEK_MONDAY:I = 0x2

.field public static final RANGE_WEEK_RELATIVE:I = 0x3

.field public static final RANGE_WEEK_SUNDAY:I = 0x1

.field public static final SEMI_MONTH:I = 0x3e9

.field private static final fields:[[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 74
    const/16 v0, 0x8

    new-array v0, v0, [[I

    new-array v1, v4, [I

    const/16 v2, 0xe

    aput v2, v1, v3

    aput-object v1, v0, v3

    new-array v1, v4, [I

    const/16 v2, 0xd

    aput v2, v1, v3

    aput-object v1, v0, v4

    new-array v1, v4, [I

    const/16 v2, 0xc

    aput v2, v1, v3

    aput-object v1, v0, v5

    new-array v1, v5, [I

    fill-array-data v1, :array_0

    aput-object v1, v0, v6

    const/4 v1, 0x4

    new-array v2, v6, [I

    fill-array-data v2, :array_1

    aput-object v2, v0, v1

    const/4 v1, 0x5

    new-array v2, v5, [I

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    new-array v2, v4, [I

    aput v4, v2, v3

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-array v2, v4, [I

    aput v3, v2, v3

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/commons/lang3/time/DateUtils;->fields:[[I

    return-void

    :array_0
    .array-data 4
        0xb
        0xa
    .end array-data

    :array_1
    .array-data 4
        0x5
        0x5
        0x9
    .end array-data

    :array_2
    .array-data 4
        0x2
        0x3e9
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    return-void
.end method

.method private static add(Ljava/util/Date;II)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "calendarField"    # I
    .param p2, "amount"    # I

    .prologue
    .line 463
    if-nez p0, :cond_0

    .line 464
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 466
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 467
    .local v0, "c":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 468
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->add(II)V

    .line 469
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method public static addDays(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 392
    const/4 v0, 0x5

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addHours(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 406
    const/16 v0, 0xb

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addMilliseconds(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 448
    const/16 v0, 0xe

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addMinutes(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 420
    const/16 v0, 0xc

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addMonths(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 364
    const/4 v0, 0x2

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addSeconds(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 434
    const/16 v0, 0xd

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addWeeks(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 378
    const/4 v0, 0x3

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static addYears(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 350
    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->add(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static ceiling(Ljava/util/Calendar;I)Ljava/util/Calendar;
    .locals 3
    .param p0, "date"    # Ljava/util/Calendar;
    .param p1, "field"    # I

    .prologue
    .line 855
    if-nez p0, :cond_0

    .line 856
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 858
    :cond_0
    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    .line 859
    .local v0, "ceiled":Ljava/util/Calendar;
    const/4 v1, 0x2

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 860
    return-object v0
.end method

.method public static ceiling(Ljava/lang/Object;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/lang/Object;
    .param p1, "field"    # I

    .prologue
    .line 881
    if-nez p0, :cond_0

    .line 882
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 884
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 885
    check-cast p0, Ljava/util/Date;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->ceiling(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    .line 887
    :goto_0
    return-object v0

    .line 886
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_1
    instance-of v0, p0, Ljava/util/Calendar;

    if-eqz v0, :cond_2

    .line 887
    check-cast p0, Ljava/util/Calendar;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->ceiling(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    .line 889
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find ceiling of for type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ceiling(Ljava/util/Date;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "field"    # I

    .prologue
    .line 829
    if-nez p0, :cond_0

    .line 830
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 832
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 833
    .local v0, "gval":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 834
    const/4 v1, 0x2

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 835
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method private static getFragment(Ljava/util/Calendar;II)J
    .locals 8
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I
    .param p2, "unit"    # I

    .prologue
    const-wide/32 v6, 0x5265c00

    .line 1629
    if-nez p0, :cond_0

    .line 1630
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "The date must not be null"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1632
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/time/DateUtils;->getMillisPerUnit(I)J

    move-result-wide v0

    .line 1633
    .local v0, "millisPerUnit":J
    const-wide/16 v2, 0x0

    .line 1636
    .local v2, "result":J
    packed-switch p1, :pswitch_data_0

    .line 1645
    :goto_0
    packed-switch p1, :pswitch_data_1

    .line 1665
    :pswitch_0
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "The fragment "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " is not supported"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1638
    :pswitch_1
    const/4 v4, 0x6

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v4, v6

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    .line 1639
    goto :goto_0

    .line 1641
    :pswitch_2
    const/4 v4, 0x5

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v4, v6

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    goto :goto_0

    .line 1653
    :pswitch_3
    const/16 v4, 0xb

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0x36ee80

    mul-long/2addr v4, v6

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    .line 1656
    :pswitch_4
    const/16 v4, 0xc

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0xea60

    mul-long/2addr v4, v6

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    .line 1659
    :pswitch_5
    const/16 v4, 0xd

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    .line 1662
    :pswitch_6
    const/16 v4, 0xe

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x1

    int-to-long v4, v4

    div-long/2addr v4, v0

    add-long/2addr v2, v4

    .line 1667
    :pswitch_7
    return-wide v2

    .line 1636
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 1645
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static getFragment(Ljava/util/Date;II)J
    .locals 4
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I
    .param p2, "unit"    # I

    .prologue
    .line 1609
    if-nez p0, :cond_0

    .line 1610
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1612
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 1613
    .local v0, "calendar":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1614
    invoke-static {v0, p1, p2}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v2

    return-wide v2
.end method

.method public static getFragmentInDays(Ljava/util/Calendar;I)J
    .locals 2
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I

    .prologue
    .line 1594
    const/4 v0, 0x6

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInDays(Ljava/util/Date;I)J
    .locals 2
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I

    .prologue
    .line 1393
    const/4 v0, 0x6

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Date;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInHours(Ljava/util/Calendar;I)J
    .locals 2
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I

    .prologue
    .line 1552
    const/16 v0, 0xb

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInHours(Ljava/util/Date;I)J
    .locals 2
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I

    .prologue
    .line 1353
    const/16 v0, 0xb

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Date;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInMilliseconds(Ljava/util/Calendar;I)J
    .locals 2
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I

    .prologue
    .line 1433
    const/16 v0, 0xe

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInMilliseconds(Ljava/util/Date;I)J
    .locals 2
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I

    .prologue
    .line 1233
    const/16 v0, 0xe

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Date;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInMinutes(Ljava/util/Calendar;I)J
    .locals 2
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I

    .prologue
    .line 1512
    const/16 v0, 0xc

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInMinutes(Ljava/util/Date;I)J
    .locals 2
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I

    .prologue
    .line 1313
    const/16 v0, 0xc

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Date;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInSeconds(Ljava/util/Calendar;I)J
    .locals 2
    .param p0, "calendar"    # Ljava/util/Calendar;
    .param p1, "fragment"    # I

    .prologue
    .line 1472
    const/16 v0, 0xd

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Calendar;II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFragmentInSeconds(Ljava/util/Date;I)J
    .locals 2
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "fragment"    # I

    .prologue
    .line 1273
    const/16 v0, 0xd

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->getFragment(Ljava/util/Date;II)J

    move-result-wide v0

    return-wide v0
.end method

.method private static getMillisPerUnit(I)J
    .locals 5
    .param p0, "unit"    # I

    .prologue
    .line 1754
    const-wide v0, 0x7fffffffffffffffL

    .line 1755
    .local v0, "result":J
    packed-switch p0, :pswitch_data_0

    .line 1772
    :pswitch_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The unit "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " cannot be represented is milleseconds"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1758
    :pswitch_1
    const-wide/32 v0, 0x5265c00

    .line 1774
    :goto_0
    return-wide v0

    .line 1761
    :pswitch_2
    const-wide/32 v0, 0x36ee80

    .line 1762
    goto :goto_0

    .line 1764
    :pswitch_3
    const-wide/32 v0, 0xea60

    .line 1765
    goto :goto_0

    .line 1767
    :pswitch_4
    const-wide/16 v0, 0x3e8

    .line 1768
    goto :goto_0

    .line 1770
    :pswitch_5
    const-wide/16 v0, 0x1

    .line 1771
    goto :goto_0

    .line 1755
    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z
    .locals 5
    .param p0, "cal1"    # Ljava/util/Calendar;
    .param p1, "cal2"    # Ljava/util/Calendar;

    .prologue
    const/4 v4, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 178
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 179
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 181
    :cond_1
    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    :goto_0
    return v0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static isSameDay(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 4
    .param p0, "date1"    # Ljava/util/Date;
    .param p1, "date2"    # Ljava/util/Date;

    .prologue
    .line 154
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 155
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "The date must not be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 157
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 158
    .local v0, "cal1":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 159
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 160
    .local v1, "cal2":Ljava/util/Calendar;
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 161
    invoke-static {v0, v1}, Lorg/apache/commons/lang3/time/DateUtils;->isSameDay(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    move-result v2

    return v2
.end method

.method public static isSameInstant(Ljava/util/Calendar;Ljava/util/Calendar;)Z
    .locals 4
    .param p0, "cal1"    # Ljava/util/Calendar;
    .param p1, "cal2"    # Ljava/util/Calendar;

    .prologue
    .line 217
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 218
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_1
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isSameInstant(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 4
    .param p0, "date1"    # Ljava/util/Date;
    .param p1, "date2"    # Ljava/util/Date;

    .prologue
    .line 199
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 200
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 202
    :cond_1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isSameLocalTime(Ljava/util/Calendar;Ljava/util/Calendar;)Z
    .locals 7
    .param p0, "cal1"    # Ljava/util/Calendar;
    .param p1, "cal2"    # Ljava/util/Calendar;

    .prologue
    const/16 v6, 0xc

    const/16 v5, 0xb

    const/4 v4, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 237
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 238
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 240
    :cond_1
    const/16 v2, 0xe

    invoke-virtual {p0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v3, 0xe

    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    const/16 v2, 0xd

    invoke-virtual {p0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v3, 0xd

    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    if-ne v2, v3, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_2

    :goto_0
    return v0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static iterator(Ljava/lang/Object;I)Ljava/util/Iterator;
    .locals 3
    .param p0, "focus"    # Ljava/lang/Object;
    .param p1, "rangeStyle"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Ljava/util/Iterator",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 1187
    if-nez p0, :cond_0

    .line 1188
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1190
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 1191
    check-cast p0, Ljava/util/Date;

    .end local p0    # "focus":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->iterator(Ljava/util/Date;I)Ljava/util/Iterator;

    move-result-object v0

    .line 1193
    :goto_0
    return-object v0

    .line 1192
    .restart local p0    # "focus":Ljava/lang/Object;
    :cond_1
    instance-of v0, p0, Ljava/util/Calendar;

    if-eqz v0, :cond_2

    .line 1193
    check-cast p0, Ljava/util/Calendar;

    .end local p0    # "focus":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->iterator(Ljava/util/Calendar;I)Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 1195
    .restart local p0    # "focus":Ljava/lang/Object;
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not iterate based on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static iterator(Ljava/util/Calendar;I)Ljava/util/Iterator;
    .locals 9
    .param p0, "focus"    # Ljava/util/Calendar;
    .param p1, "rangeStyle"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I)",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Calendar;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x2

    const/4 v8, -0x1

    const/4 v7, 0x1

    const/4 v6, 0x5

    const/4 v5, 0x7

    .line 1099
    if-nez p0, :cond_0

    .line 1100
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "The date must not be null"

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1102
    :cond_0
    const/4 v2, 0x0

    .line 1103
    .local v2, "start":Ljava/util/Calendar;
    const/4 v0, 0x0

    .line 1104
    .local v0, "end":Ljava/util/Calendar;
    const/4 v3, 0x1

    .line 1105
    .local v3, "startCutoff":I
    const/4 v1, 0x7

    .line 1106
    .local v1, "endCutoff":I
    packed-switch p1, :pswitch_data_0

    .line 1147
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "The range style "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " is not valid."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 1110
    :pswitch_0
    invoke-static {p0, v4}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v2

    .line 1112
    invoke-virtual {v2}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "end":Ljava/util/Calendar;
    check-cast v0, Ljava/util/Calendar;

    .line 1113
    .restart local v0    # "end":Ljava/util/Calendar;
    invoke-virtual {v0, v4, v7}, Ljava/util/Calendar;->add(II)V

    .line 1114
    invoke-virtual {v0, v6, v8}, Ljava/util/Calendar;->add(II)V

    .line 1116
    const/4 v4, 0x6

    if-ne p1, v4, :cond_1

    .line 1117
    const/4 v3, 0x2

    .line 1118
    const/4 v1, 0x1

    .line 1149
    :cond_1
    :goto_0
    :pswitch_1
    if-ge v3, v7, :cond_2

    .line 1150
    add-int/lit8 v3, v3, 0x7

    .line 1152
    :cond_2
    if-le v3, v5, :cond_3

    .line 1153
    add-int/lit8 v3, v3, -0x7

    .line 1155
    :cond_3
    if-ge v1, v7, :cond_4

    .line 1156
    add-int/lit8 v1, v1, 0x7

    .line 1158
    :cond_4
    if-le v1, v5, :cond_5

    .line 1159
    add-int/lit8 v1, v1, -0x7

    .line 1161
    :cond_5
    :goto_1
    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-eq v4, v3, :cond_6

    .line 1162
    invoke-virtual {v2, v6, v8}, Ljava/util/Calendar;->add(II)V

    goto :goto_1

    .line 1126
    :pswitch_2
    invoke-static {p0, v6}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v2

    .line 1127
    invoke-static {p0, v6}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v0

    .line 1128
    packed-switch p1, :pswitch_data_1

    goto :goto_0

    .line 1133
    :pswitch_3
    const/4 v3, 0x2

    .line 1134
    const/4 v1, 0x1

    .line 1135
    goto :goto_0

    .line 1137
    :pswitch_4
    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 1138
    add-int/lit8 v1, v3, -0x1

    .line 1139
    goto :goto_0

    .line 1141
    :pswitch_5
    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/lit8 v3, v4, -0x3

    .line 1142
    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/lit8 v1, v4, 0x3

    goto :goto_0

    .line 1164
    :cond_6
    :goto_2
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-eq v4, v1, :cond_7

    .line 1165
    invoke-virtual {v0, v6, v7}, Ljava/util/Calendar;->add(II)V

    goto :goto_2

    .line 1167
    :cond_7
    new-instance v4, Lorg/apache/commons/lang3/time/DateUtils$DateIterator;

    invoke-direct {v4, v2, v0}, Lorg/apache/commons/lang3/time/DateUtils$DateIterator;-><init>(Ljava/util/Calendar;Ljava/util/Calendar;)V

    return-object v4

    .line 1106
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 1128
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static iterator(Ljava/util/Date;I)Ljava/util/Iterator;
    .locals 3
    .param p0, "focus"    # Ljava/util/Date;
    .param p1, "rangeStyle"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I)",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Calendar;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1066
    if-nez p0, :cond_0

    .line 1067
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1069
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 1070
    .local v0, "gval":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1071
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->iterator(Ljava/util/Calendar;I)Ljava/util/Iterator;

    move-result-object v1

    return-object v1
.end method

.method private static modify(Ljava/util/Calendar;II)V
    .locals 28
    .param p0, "val"    # Ljava/util/Calendar;
    .param p1, "field"    # I
    .param p2, "modType"    # I

    .prologue
    .line 903
    const/16 v24, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v24

    const v25, 0x10b07600

    move/from16 v0, v24

    move/from16 v1, v25

    if-le v0, v1, :cond_0

    .line 904
    new-instance v24, Ljava/lang/ArithmeticException;

    const-string v25, "Calendar value too large for accurate calculations"

    invoke-direct/range {v24 .. v25}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v24

    .line 907
    :cond_0
    const/16 v24, 0xe

    move/from16 v0, p1

    move/from16 v1, v24

    if-ne v0, v1, :cond_2

    .line 986
    :cond_1
    :goto_0
    return-void

    .line 917
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    .line 918
    .local v7, "date":Ljava/util/Date;
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v22

    .line 919
    .local v22, "time":J
    const/4 v8, 0x0

    .line 922
    .local v8, "done":Z
    const/16 v24, 0xe

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v15

    .line 923
    .local v15, "millisecs":I
    if-eqz p2, :cond_3

    const/16 v24, 0x1f4

    move/from16 v0, v24

    if-ge v15, v0, :cond_4

    .line 924
    :cond_3
    int-to-long v0, v15

    move-wide/from16 v24, v0

    sub-long v22, v22, v24

    .line 926
    :cond_4
    const/16 v24, 0xd

    move/from16 v0, p1

    move/from16 v1, v24

    if-ne v0, v1, :cond_5

    .line 927
    const/4 v8, 0x1

    .line 931
    :cond_5
    const/16 v24, 0xd

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v21

    .line 932
    .local v21, "seconds":I
    if-nez v8, :cond_7

    if-eqz p2, :cond_6

    const/16 v24, 0x1e

    move/from16 v0, v21

    move/from16 v1, v24

    if-ge v0, v1, :cond_7

    .line 933
    :cond_6
    move/from16 v0, v21

    int-to-long v0, v0

    move-wide/from16 v24, v0

    const-wide/16 v26, 0x3e8

    mul-long v24, v24, v26

    sub-long v22, v22, v24

    .line 935
    :cond_7
    const/16 v24, 0xc

    move/from16 v0, p1

    move/from16 v1, v24

    if-ne v0, v1, :cond_8

    .line 936
    const/4 v8, 0x1

    .line 940
    :cond_8
    const/16 v24, 0xc

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v17

    .line 941
    .local v17, "minutes":I
    if-nez v8, :cond_a

    if-eqz p2, :cond_9

    const/16 v24, 0x1e

    move/from16 v0, v17

    move/from16 v1, v24

    if-ge v0, v1, :cond_a

    .line 942
    :cond_9
    move/from16 v0, v17

    int-to-long v0, v0

    move-wide/from16 v24, v0

    const-wide/32 v26, 0xea60

    mul-long v24, v24, v26

    sub-long v22, v22, v24

    .line 946
    :cond_a
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v24

    cmp-long v24, v24, v22

    if-eqz v24, :cond_b

    .line 947
    move-wide/from16 v0, v22

    invoke-virtual {v7, v0, v1}, Ljava/util/Date;->setTime(J)V

    .line 948
    move-object/from16 v0, p0

    invoke-virtual {v0, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 952
    :cond_b
    const/16 v20, 0x0

    .line 953
    .local v20, "roundUp":Z
    sget-object v5, Lorg/apache/commons/lang3/time/DateUtils;->fields:[[I

    .local v5, "arr$":[[I
    array-length v12, v5

    .local v12, "len$":I
    const/4 v10, 0x0

    .local v10, "i$":I
    move v11, v10

    .end local v5    # "arr$":[[I
    .end local v10    # "i$":I
    .end local v12    # "len$":I
    .local v11, "i$":I
    :goto_1
    if-ge v11, v12, :cond_1b

    aget-object v4, v5, v11

    .line 954
    .local v4, "aField":[I
    move-object v6, v4

    .local v6, "arr$":[I
    array-length v13, v6

    .local v13, "len$":I
    const/4 v10, 0x0

    .end local v11    # "i$":I
    .restart local v10    # "i$":I
    :goto_2
    if-ge v10, v13, :cond_12

    aget v9, v6, v10

    .line 955
    .local v9, "element":I
    move/from16 v0, p1

    if-ne v9, v0, :cond_11

    .line 957
    const/16 v24, 0x2

    move/from16 v0, p2

    move/from16 v1, v24

    if-eq v0, v1, :cond_c

    const/16 v24, 0x1

    move/from16 v0, p2

    move/from16 v1, v24

    if-ne v0, v1, :cond_1

    if-eqz v20, :cond_1

    .line 958
    :cond_c
    const/16 v24, 0x3e9

    move/from16 v0, p1

    move/from16 v1, v24

    if-ne v0, v1, :cond_e

    .line 962
    const/16 v24, 0x5

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v24

    const/16 v25, 0x1

    move/from16 v0, v24

    move/from16 v1, v25

    if-ne v0, v1, :cond_d

    .line 963
    const/16 v24, 0x5

    const/16 v25, 0xf

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    goto/16 :goto_0

    .line 965
    :cond_d
    const/16 v24, 0x5

    const/16 v25, -0xf

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 966
    const/16 v24, 0x2

    const/16 v25, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    goto/16 :goto_0

    .line 969
    :cond_e
    const/16 v24, 0x9

    move/from16 v0, p1

    move/from16 v1, v24

    if-ne v0, v1, :cond_10

    .line 973
    const/16 v24, 0xb

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v24

    if-nez v24, :cond_f

    .line 974
    const/16 v24, 0xb

    const/16 v25, 0xc

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    goto/16 :goto_0

    .line 976
    :cond_f
    const/16 v24, 0xb

    const/16 v25, -0xc

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 977
    const/16 v24, 0x5

    const/16 v25, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    goto/16 :goto_0

    .line 983
    :cond_10
    const/16 v24, 0x0

    aget v24, v4, v24

    const/16 v25, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    goto/16 :goto_0

    .line 954
    :cond_11
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_2

    .line 990
    .end local v9    # "element":I
    :cond_12
    const/16 v18, 0x0

    .line 991
    .local v18, "offset":I
    const/16 v19, 0x0

    .line 993
    .local v19, "offsetSet":Z
    sparse-switch p1, :sswitch_data_0

    .line 1023
    :cond_13
    :goto_3
    if-nez v19, :cond_14

    .line 1024
    const/16 v24, 0x0

    aget v24, v4, v24

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getActualMinimum(I)I

    move-result v16

    .line 1025
    .local v16, "min":I
    const/16 v24, 0x0

    aget v24, v4, v24

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v14

    .line 1027
    .local v14, "max":I
    const/16 v24, 0x0

    aget v24, v4, v24

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v24

    sub-int v18, v24, v16

    .line 1029
    sub-int v24, v14, v16

    div-int/lit8 v24, v24, 0x2

    move/from16 v0, v18

    move/from16 v1, v24

    if-le v0, v1, :cond_1a

    const/16 v20, 0x1

    .line 1032
    .end local v14    # "max":I
    .end local v16    # "min":I
    :cond_14
    :goto_4
    if-eqz v18, :cond_15

    .line 1033
    const/16 v24, 0x0

    aget v24, v4, v24

    const/16 v25, 0x0

    aget v25, v4, v25

    move-object/from16 v0, p0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v25

    sub-int v25, v25, v18

    move-object/from16 v0, p0

    move/from16 v1, v24

    move/from16 v2, v25

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 953
    :cond_15
    add-int/lit8 v10, v11, 0x1

    move v11, v10

    .end local v10    # "i$":I
    .restart local v11    # "i$":I
    goto/16 :goto_1

    .line 995
    .end local v11    # "i$":I
    .restart local v10    # "i$":I
    :sswitch_0
    const/16 v24, 0x0

    aget v24, v4, v24

    const/16 v25, 0x5

    move/from16 v0, v24

    move/from16 v1, v25

    if-ne v0, v1, :cond_13

    .line 999
    const/16 v24, 0x5

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v24

    add-int/lit8 v18, v24, -0x1

    .line 1002
    const/16 v24, 0xf

    move/from16 v0, v18

    move/from16 v1, v24

    if-lt v0, v1, :cond_16

    .line 1003
    add-int/lit8 v18, v18, -0xf

    .line 1006
    :cond_16
    const/16 v24, 0x7

    move/from16 v0, v18

    move/from16 v1, v24

    if-le v0, v1, :cond_17

    const/16 v20, 0x1

    .line 1007
    :goto_5
    const/16 v19, 0x1

    goto/16 :goto_3

    .line 1006
    :cond_17
    const/16 v20, 0x0

    goto :goto_5

    .line 1011
    :sswitch_1
    const/16 v24, 0x0

    aget v24, v4, v24

    const/16 v25, 0xb

    move/from16 v0, v24

    move/from16 v1, v25

    if-ne v0, v1, :cond_13

    .line 1014
    const/16 v24, 0xb

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v18

    .line 1015
    const/16 v24, 0xc

    move/from16 v0, v18

    move/from16 v1, v24

    if-lt v0, v1, :cond_18

    .line 1016
    add-int/lit8 v18, v18, -0xc

    .line 1018
    :cond_18
    const/16 v24, 0x6

    move/from16 v0, v18

    move/from16 v1, v24

    if-lt v0, v1, :cond_19

    const/16 v20, 0x1

    .line 1019
    :goto_6
    const/16 v19, 0x1

    goto/16 :goto_3

    .line 1018
    :cond_19
    const/16 v20, 0x0

    goto :goto_6

    .line 1029
    .restart local v14    # "max":I
    .restart local v16    # "min":I
    :cond_1a
    const/16 v20, 0x0

    goto/16 :goto_4

    .line 1036
    .end local v4    # "aField":[I
    .end local v6    # "arr$":[I
    .end local v10    # "i$":I
    .end local v13    # "len$":I
    .end local v14    # "max":I
    .end local v16    # "min":I
    .end local v18    # "offset":I
    .end local v19    # "offsetSet":Z
    .restart local v11    # "i$":I
    :cond_1b
    new-instance v24, Ljava/lang/IllegalArgumentException;

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "The field "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    move-object/from16 v0, v25

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, " is not supported"

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v24

    .line 993
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0x3e9 -> :sswitch_0
    .end sparse-switch
.end method

.method public static varargs parseDate(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "parsePatterns"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .prologue
    .line 266
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->parseDateWithLeniency(Ljava/lang/String;[Ljava/lang/String;Z)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static varargs parseDateStrictly(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "parsePatterns"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .prologue
    .line 286
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DateUtils;->parseDateWithLeniency(Ljava/lang/String;[Ljava/lang/String;Z)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private static parseDateWithLeniency(Ljava/lang/String;[Ljava/lang/String;Z)Ljava/util/Date;
    .locals 12
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "parsePatterns"    # [Ljava/lang/String;
    .param p2, "lenient"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .prologue
    const/4 v11, 0x0

    .line 306
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 307
    :cond_0
    new-instance v9, Ljava/lang/IllegalArgumentException;

    const-string v10, "Date and Patterns must not be null"

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 310
    :cond_1
    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-direct {v5}, Ljava/text/SimpleDateFormat;-><init>()V

    .line 311
    .local v5, "parser":Ljava/text/SimpleDateFormat;
    invoke-virtual {v5, p2}, Ljava/text/SimpleDateFormat;->setLenient(Z)V

    .line 312
    new-instance v7, Ljava/text/ParsePosition;

    invoke-direct {v7, v11}, Ljava/text/ParsePosition;-><init>(I)V

    .line 313
    .local v7, "pos":Ljava/text/ParsePosition;
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_5

    aget-object v4, v0, v2

    .line 315
    .local v4, "parsePattern":Ljava/lang/String;
    move-object v6, v4

    .line 318
    .local v6, "pattern":Ljava/lang/String;
    const-string v9, "ZZ"

    invoke-virtual {v4, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 319
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-virtual {v6, v11, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 322
    :cond_2
    invoke-virtual {v5, v6}, Ljava/text/SimpleDateFormat;->applyPattern(Ljava/lang/String;)V

    .line 323
    invoke-virtual {v7, v11}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 325
    move-object v8, p0

    .line 327
    .local v8, "str2":Ljava/lang/String;
    const-string v9, "ZZ"

    invoke-virtual {v4, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 328
    const-string v9, "([-+][0-9][0-9]):([0-9][0-9])$"

    const-string v10, "$1$2"

    invoke-virtual {p0, v9, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 331
    :cond_3
    invoke-virtual {v5, v8, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v1

    .line 332
    .local v1, "date":Ljava/util/Date;
    if-eqz v1, :cond_4

    invoke-virtual {v7}, Ljava/text/ParsePosition;->getIndex()I

    move-result v9

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v9, v10, :cond_4

    .line 333
    return-object v1

    .line 313
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 336
    .end local v1    # "date":Ljava/util/Date;
    .end local v4    # "parsePattern":Ljava/lang/String;
    .end local v6    # "pattern":Ljava/lang/String;
    .end local v8    # "str2":Ljava/lang/String;
    :cond_5
    new-instance v9, Ljava/text/ParseException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Unable to parse the date: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, -0x1

    invoke-direct {v9, v10, v11}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v9
.end method

.method public static round(Ljava/util/Calendar;I)Ljava/util/Calendar;
    .locals 3
    .param p0, "date"    # Ljava/util/Calendar;
    .param p1, "field"    # I

    .prologue
    .line 683
    if-nez p0, :cond_0

    .line 684
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 686
    :cond_0
    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    .line 687
    .local v0, "rounded":Ljava/util/Calendar;
    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 688
    return-object v0
.end method

.method public static round(Ljava/lang/Object;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/lang/Object;
    .param p1, "field"    # I

    .prologue
    .line 720
    if-nez p0, :cond_0

    .line 721
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 723
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 724
    check-cast p0, Ljava/util/Date;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->round(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    .line 726
    :goto_0
    return-object v0

    .line 725
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_1
    instance-of v0, p0, Ljava/util/Calendar;

    if-eqz v0, :cond_2

    .line 726
    check-cast p0, Ljava/util/Calendar;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->round(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    .line 728
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not round "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static round(Ljava/util/Date;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "field"    # I

    .prologue
    .line 646
    if-nez p0, :cond_0

    .line 647
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 649
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 650
    .local v0, "gval":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 651
    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 652
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method private static set(Ljava/util/Date;II)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "calendarField"    # I
    .param p2, "amount"    # I

    .prologue
    .line 592
    if-nez p0, :cond_0

    .line 593
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 596
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 597
    .local v0, "c":Ljava/util/Calendar;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setLenient(Z)V

    .line 598
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 599
    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 600
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method public static setDays(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 514
    const/4 v0, 0x5

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setHours(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 530
    const/16 v0, 0xb

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setMilliseconds(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 575
    const/16 v0, 0xe

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setMinutes(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 545
    const/16 v0, 0xc

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setMonths(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 499
    const/4 v0, 0x2

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setSeconds(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 560
    const/16 v0, 0xd

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static setYears(Ljava/util/Date;I)Ljava/util/Date;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "amount"    # I

    .prologue
    .line 484
    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->set(Ljava/util/Date;II)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static toCalendar(Ljava/util/Date;)Ljava/util/Calendar;
    .locals 1
    .param p0, "date"    # Ljava/util/Date;

    .prologue
    .line 613
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 614
    .local v0, "c":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 615
    return-object v0
.end method

.method public static truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;
    .locals 3
    .param p0, "date"    # Ljava/util/Calendar;
    .param p1, "field"    # I

    .prologue
    .line 774
    if-nez p0, :cond_0

    .line 775
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 777
    :cond_0
    invoke-virtual {p0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    .line 778
    .local v0, "truncated":Ljava/util/Calendar;
    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 779
    return-object v0
.end method

.method public static truncate(Ljava/lang/Object;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/lang/Object;
    .param p1, "field"    # I

    .prologue
    .line 799
    if-nez p0, :cond_0

    .line 800
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The date must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 802
    :cond_0
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_1

    .line 803
    check-cast p0, Ljava/util/Date;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    .line 805
    :goto_0
    return-object v0

    .line 804
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_1
    instance-of v0, p0, Ljava/util/Calendar;

    if-eqz v0, :cond_2

    .line 805
    check-cast p0, Ljava/util/Calendar;

    .end local p0    # "date":Ljava/lang/Object;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    .line 807
    .restart local p0    # "date":Ljava/lang/Object;
    :cond_2
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not truncate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static truncate(Ljava/util/Date;I)Ljava/util/Date;
    .locals 3
    .param p0, "date"    # Ljava/util/Date;
    .param p1, "field"    # I

    .prologue
    .line 749
    if-nez p0, :cond_0

    .line 750
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The date must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 752
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 753
    .local v0, "gval":Ljava/util/Calendar;
    invoke-virtual {v0, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 754
    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/time/DateUtils;->modify(Ljava/util/Calendar;II)V

    .line 755
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    return-object v1
.end method

.method public static truncatedCompareTo(Ljava/util/Calendar;Ljava/util/Calendar;I)I
    .locals 3
    .param p0, "cal1"    # Ljava/util/Calendar;
    .param p1, "cal2"    # Ljava/util/Calendar;
    .param p2, "field"    # I

    .prologue
    .line 1719
    invoke-static {p0, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v0

    .line 1720
    .local v0, "truncatedCal1":Ljava/util/Calendar;
    invoke-static {p1, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Calendar;I)Ljava/util/Calendar;

    move-result-object v1

    .line 1721
    .local v1, "truncatedCal2":Ljava/util/Calendar;
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v2

    return v2
.end method

.method public static truncatedCompareTo(Ljava/util/Date;Ljava/util/Date;I)I
    .locals 3
    .param p0, "date1"    # Ljava/util/Date;
    .param p1, "date2"    # Ljava/util/Date;
    .param p2, "field"    # I

    .prologue
    .line 1739
    invoke-static {p0, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    .line 1740
    .local v0, "truncatedDate1":Ljava/util/Date;
    invoke-static {p1, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncate(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v1

    .line 1741
    .local v1, "truncatedDate2":Ljava/util/Date;
    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v2

    return v2
.end method

.method public static truncatedEquals(Ljava/util/Calendar;Ljava/util/Calendar;I)Z
    .locals 1
    .param p0, "cal1"    # Ljava/util/Calendar;
    .param p1, "cal2"    # Ljava/util/Calendar;
    .param p2, "field"    # I

    .prologue
    .line 1684
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncatedCompareTo(Ljava/util/Calendar;Ljava/util/Calendar;I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static truncatedEquals(Ljava/util/Date;Ljava/util/Date;I)Z
    .locals 1
    .param p0, "date1"    # Ljava/util/Date;
    .param p1, "date2"    # Ljava/util/Date;
    .param p2, "field"    # I

    .prologue
    .line 1701
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/time/DateUtils;->truncatedCompareTo(Ljava/util/Date;Ljava/util/Date;I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
