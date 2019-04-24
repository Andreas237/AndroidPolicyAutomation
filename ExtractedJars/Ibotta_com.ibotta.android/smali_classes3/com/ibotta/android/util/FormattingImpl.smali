.class public Lcom/ibotta/android/util/FormattingImpl;
.super Ljava/lang/Object;
.source "FormattingImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/Formatting;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field public static final CURRENCY:Ljava/lang/String; = "$#,###,###.00"

.field public static final CURRENCY_NO_DECIMAL:Ljava/lang/String; = "$#,###,###"

.field public static final CURRENCY_NO_DOLLAR_SIGN:Ljava/lang/String; = "#,###,###.00"

.field public static final CURRENCY_NO_DOLLAR_SIGN_LEAD_ZERO:Ljava/lang/String; = "#,###,##0.00"

.field public static final DATE:Ljava/lang/String; = "MM/dd/yy"

.field public static final DATE_4:Ljava/lang/String; = "MM/dd/yyyy"

.field public static final DATE_8601:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

.field public static final DATE_API_BIRTHDAY:Ljava/lang/String; = "yyyy-MM-dd"

.field public static final DATE_CARD_EXPIRATION:Ljava/lang/String; = "MM/yy"

.field public static final DATE_EARNINGS:Ljava/lang/String; = "yyyy-MM"

.field public static final DATE_EARNINGS_MONTH:Ljava/lang/String; = "MMM"

.field public static final DATE_EARNINGS_MONTH_AND_YEAR:Ljava/lang/String; = "MMM\nyyyy"

.field public static final DATE_EXPIRATION:Ljava/lang/String; = "MM/dd/yy"

.field public static final DATE_EXPIRATION_AT_TIME:Ljava/lang/String; = "MM/dd/yy \'at\' h:mm a"

.field public static final DATE_JOIN_DATE:Ljava/lang/String; = "MMMM dd, yyyy"

.field public static final DATE_TIME:Ljava/lang/String; = "MM/dd/yy h:mm a"

.field public static final DATE_UI_BIRTHDAY:Ljava/lang/String; = "MM/dd/yyyy"

.field public static final FLOAT_TO_PERCENTAGE:Ljava/lang/String; = "#.#\'%\'"

.field public static final FORMAT_PHONE_NUMBER_10:Ljava/lang/String; = "($1) $2-$3"

.field public static final FORMAT_PHONE_NUMBER_7:Ljava/lang/String; = "$1-$2"

.field public static final MAX_BIRTHDATE:I = -0x64

.field public static final MIN_BIRTHDATE:I = -0xd

.field private static final NUMBER_ABBREVIATION_SUFFIXES:Ljava/lang/String; = " KMBT"

.field public static final REGEX_NON_ALPHA_NUMERIC:Ljava/lang/String; = "[^a-zA-Z\\d\\s]"

.field public static final REGEX_NON_DIGITS:Ljava/lang/String; = "[^\\d]"

.field public static final REGEX_NON_DIGITS_OR_DECIMAL:Ljava/lang/String; = "[^\\d.]+"

.field public static final REGEX_PHONE_NUMBER_FORMATTED_10_DIGIT:Ljava/lang/String; = "(\\d{1,3})(\\d{1,3})(\\d+)"

.field public static final REGEX_PHONE_NUMBER_FORMATTED_7_DIGIT:Ljava/lang/String; = "(\\d{1,3})(\\d+)"

.field public static final REGEX_REFERRAL_CODE:Ljava/lang/String; = "^([a-zA-Z0-9]){1,20}$"

.field public static final TIME:Ljava/lang/String; = "h:mm a"

.field public static final VOWELS:Ljava/lang/String; = "AEIOU"


# instance fields
.field private final context:Landroid/content/Context;

.field private final enUsFormat:Ljava/text/DateFormat;

.field private final expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

.field private final iso8601Format:Ljava/text/DateFormat;

.field private final localFormat:Ljava/text/DateFormat;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private timeZone:Ljava/lang/String;

.field private final ymdFormat:Ljava/text/DateFormat;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    .line 89
    iput-object p2, p0, Lcom/ibotta/android/util/FormattingImpl;->expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

    .line 90
    iput-object p3, p0, Lcom/ibotta/android/util/FormattingImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 92
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 p2, 0x2

    invoke-static {p2, p2, p1}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->enUsFormat:Ljava/text/DateFormat;

    .line 93
    invoke-static {p2, p2}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->localFormat:Ljava/text/DateFormat;

    .line 94
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->iso8601Format:Ljava/text/DateFormat;

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->iso8601Format:Ljava/text/DateFormat;

    const-string p2, "UTC"

    invoke-static {p2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 96
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyy-MM-dd"

    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->ymdFormat:Ljava/text/DateFormat;

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->ymdFormat:Ljava/text/DateFormat;

    const-string p2, "UTC"

    invoke-static {p2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/api/helper/retailer/RetailerHelper;Ljava/lang/String;)V
    .locals 0

    .line 105
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/util/FormattingImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/ExpirationRulesSupplier;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    .line 106
    iput-object p4, p0, Lcom/ibotta/android/util/FormattingImpl;->timeZone:Ljava/lang/String;

    return-void
.end method

.method private static getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;
    .locals 1

    .line 188
    new-instance v0, Ljava/text/DecimalFormat;

    invoke-direct {v0, p0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abbreviate(J)Ljava/lang/String;
    .locals 7

    long-to-double v0, p1

    const/4 v2, 0x0

    move-wide v3, v0

    const/4 v0, 0x0

    :goto_0
    const-wide/16 v5, 0x3e8

    .line 497
    div-long/2addr p1, v5

    const-wide/16 v5, 0x0

    cmp-long v1, p1, v5

    if-lez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v3, v5

    goto :goto_0

    :cond_0
    const-string p1, ""

    const/4 p2, 0x5

    if-ge v0, p2, :cond_1

    const-string p1, " KMBT"

    .line 504
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    .line 506
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string p2, "###.#"

    .line 508
    invoke-static {p2}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object p2

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 510
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_2

    const-string v0, "\\..*$"

    const-string v1, ""

    .line 511
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const-string v0, "%1$s%2$s"

    const/4 v1, 0x2

    .line 514
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public apiBirthDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "yyyy-MM-dd"

    .line 326
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 327
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public birthDate(III)Ljava/lang/String;
    .locals 1

    .line 250
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 251
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    const-string p1, "MM/dd/yyyy"

    .line 252
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object p1

    .line 253
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public centsToDollars(I)D
    .locals 4

    int-to-double v0, p1

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public currency(D)Ljava/lang/String;
    .locals 1

    const-string v0, "$#,###,###.00"

    .line 117
    invoke-static {v0}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyFromString(Ljava/lang/String;)D
    .locals 5

    .line 164
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    :try_start_0
    const-string v0, "[^\\d.]+"

    const-string v3, ""

    .line 169
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 170
    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    .line 171
    new-instance p1, Ljava/text/DecimalFormat;

    const-string v0, "#,###,###.00"

    invoke-direct {p1, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 172
    sget-object v0, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {p1, v0}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 173
    invoke-virtual {p1, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p1

    const-string v0, "Error formatting currency from string: %s"

    const/4 v3, 0x1

    .line 175
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v4

    invoke-static {v0, v3}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-wide v1
.end method

.method public currencyLeadZero(D)Ljava/lang/String;
    .locals 1

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCurrencyLeadZeroFormat()Ljava/text/Format;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyLeadZeroNoDollarSign(D)Ljava/lang/String;
    .locals 1

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCurrencyLeadZeroNoDollarSignFormat()Ljava/text/Format;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyNoDecimal(D)Ljava/lang/String;
    .locals 1

    const-string v0, "$#,###,###"

    .line 122
    invoke-static {v0}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyNoDollarSign(D)Ljava/lang/String;
    .locals 1

    const-string v0, "#,###,###.00"

    .line 127
    invoke-static {v0}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyPositiveOrZero(Ljava/text/Format;D)Ljava/lang/String;
    .locals 2

    const-wide/16 v0, 0x0

    .line 142
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyPositiveOrZeroLeadingZero(D)Ljava/lang/String;
    .locals 1

    .line 152
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCurrencyLeadZeroFormat()Ljava/text/Format;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currencyPositiveOrZero(Ljava/text/Format;D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyPositiveOrZeroLeadingZeroNoDollarSign(D)Ljava/lang/String;
    .locals 1

    .line 157
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCurrencyLeadZeroNoDollarSignFormat()Ljava/text/Format;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currencyPositiveOrZero(Ljava/text/Format;D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public currencyPositiveOrZeroNoLeadingZero(D)Ljava/lang/String;
    .locals 1

    .line 147
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCurrencyFormat()Ljava/text/Format;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currencyPositiveOrZero(Ljava/text/Format;D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public date(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yy"

    .line 344
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 345
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public date4(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yyyy"

    .line 353
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 354
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public dateFromCardExpiration(II)Ljava/util/Date;
    .locals 2

    .line 750
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x1

    sub-int/2addr p2, v1

    .line 751
    invoke-virtual {v0, p1, p2, v1}, Ljava/util/Calendar;->set(III)V

    .line 752
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public dateStringFromCardExpiration(II)Ljava/lang/String;
    .locals 0

    .line 757
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->dateFromCardExpiration(II)Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string p2, "MM/yy"

    .line 763
    invoke-virtual {p0, p2}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object p2

    .line 764
    invoke-virtual {p2, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public dateTime(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yy h:mm a"

    .line 335
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 336
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "AM"

    const-string v1, "am"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PM"

    const-string v1, "pm"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    if-nez p2, :cond_1

    const-string p2, ""

    .line 526
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v1, Lcom/ibotta/android/util/R$string;->common_first_last_name:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 527
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public varargs format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 659
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatDateAsISO8601(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 382
    new-instance v0, Lcom/fasterxml/jackson/databind/util/ISO8601Utils;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/util/ISO8601Utils;-><init>()V

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/fasterxml/jackson/databind/util/ISO8601Utils;->format(Ljava/util/Date;ZLjava/util/TimeZone;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 450
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-gt v0, v1, :cond_1

    const-string v0, "(\\d{1,3})(\\d+)"

    const-string v1, "$1-$2"

    .line 451
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string v0, "(\\d{1,3})(\\d{1,3})(\\d+)"

    const-string v1, "($1) $2-$3"

    .line 453
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public fromCalendar(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 3

    .line 369
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    .line 370
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public fromServerDateString(Ljava/lang/String;)Ljava/util/Date;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 705
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_2

    .line 711
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/util/FormattingImpl;->localFormat:Ljava/text/DateFormat;

    monitor-enter v1

    .line 713
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/util/FormattingImpl;->localFormat:Ljava/text/DateFormat;

    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :goto_0
    if-nez v0, :cond_1

    .line 719
    :try_start_1
    iget-object v2, p0, Lcom/ibotta/android/util/FormattingImpl;->enUsFormat:Ljava/text/DateFormat;

    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_1
    :cond_1
    if-nez v0, :cond_2

    .line 726
    :try_start_2
    iget-object v2, p0, Lcom/ibotta/android/util/FormattingImpl;->iso8601Format:Ljava/text/DateFormat;

    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_2
    :cond_2
    if-nez v0, :cond_3

    .line 733
    :try_start_3
    iget-object v2, p0, Lcom/ibotta/android/util/FormattingImpl;->ymdFormat:Ljava/text/DateFormat;

    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_3
    :cond_3
    if-nez v0, :cond_4

    :try_start_4
    const-string v2, "Failed to parse String into Date: %1$s"

    const/4 v3, 0x1

    .line 741
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    :cond_4
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_5
    :goto_2
    return-object v0
.end method

.method public getAorAn(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 532
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 536
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    const-string v2, "AEIOU"

    .line 539
    invoke-virtual {v2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 540
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v2, Lcom/ibotta/android/util/R$string;->common_an:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 542
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v2, Lcom/ibotta/android/util/R$string;->common_a:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-eqz p2, :cond_3

    .line 546
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, v1, :cond_2

    .line 547
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 549
    :cond_2
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    .line 550
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 551
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 227
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/util/FormattingImpl;->expirationRulesSupplier:Lcom/ibotta/android/util/ExpirationRulesSupplier;

    invoke-interface {v1}, Lcom/ibotta/android/util/ExpirationRulesSupplier;->getExpirationDateFormat()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    .line 228
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to format expiration date using app config."

    const/4 v3, 0x0

    .line 230
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-nez v0, :cond_1

    .line 235
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/FormattingImpl;->getExpiration(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getAvailableAt(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/FormattingImpl;->getAvailableAtStringId(Lcom/ibotta/api/model/common/VerificationType;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAvailableAtStringId(Lcom/ibotta/api/model/common/VerificationType;)I
    .locals 0

    .line 576
    invoke-virtual {p1}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 577
    sget p1, Lcom/ibotta/android/util/R$string;->common_online:I

    goto :goto_0

    .line 579
    :cond_0
    sget p1, Lcom/ibotta/android/util/R$string;->common_in_store:I

    :goto_0
    return p1
.end method

.method public getAvailableWhere(Ljava/util/List;Ljava/util/Set;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 592
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v1

    if-le v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 596
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget p2, Lcom/ibotta/android/util/R$string;->common_multiple_stores:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 599
    :cond_2
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    .line 600
    iget-object v0, p0, Lcom/ibotta/android/util/FormattingImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 603
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 606
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget p2, Lcom/ibotta/android/util/R$string;->common_multiple_stores:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method protected getCalendar()Ljava/util/Calendar;
    .locals 1

    .line 768
    iget-object v0, p0, Lcom/ibotta/android/util/FormattingImpl;->timeZone:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getCurrencyFormat()Ljava/text/Format;
    .locals 1

    const-string v0, "$#,###,###.00"

    .line 184
    invoke-static {v0}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object v0

    return-object v0
.end method

.method public getCurrencyLeadZeroFormat()Ljava/text/Format;
    .locals 1

    .line 193
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getCurrencyInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    return-object v0
.end method

.method public getCurrencyLeadZeroNoDollarSignFormat()Ljava/text/Format;
    .locals 1

    const-string v0, "#,###,##0.00"

    .line 198
    invoke-static {v0}, Lcom/ibotta/android/util/FormattingImpl;->getDecimalFormat(Ljava/lang/String;)Ljava/text/Format;

    move-result-object v0

    return-object v0
.end method

.method public getEarningsMonth(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "yyyy-MM"

    .line 287
    invoke-virtual {p0, v1}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    .line 290
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    .line 297
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    .line 298
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x2

    .line 299
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MMM\nyyyy"

    .line 300
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, "MMM"

    .line 302
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 305
    :goto_1
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public getEncodedQueryParams(Landroid/net/Uri;)Ljava/lang/String;
    .locals 5

    .line 674
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    .line 676
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 677
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 678
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 679
    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 680
    invoke-virtual {v1, v2, v3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 684
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 687
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 690
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 692
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 695
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 696
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method public getExpiration(Ljava/util/Date;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yy"

    .line 206
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 207
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getExpirationAtTime(Ljava/util/Date;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yy \'at\' h:mm a"

    .line 215
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 216
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getGregorianGregorian()Ljava/util/Calendar;
    .locals 1

    .line 772
    iget-object v0, p0, Lcom/ibotta/android/util/FormattingImpl;->timeZone:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 773
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/GregorianCalendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getRetailerWaitTimeStr(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    .line 629
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v0, Lcom/ibotta/android/util/R$string;->common_24:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 633
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 634
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v0, Lcom/ibotta/android/util/R$string;->common_48:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 636
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->context:Landroid/content/Context;

    sget v0, Lcom/ibotta/android/util/R$string;->common_24:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;
    .locals 2

    .line 663
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 665
    iget-object p1, p0, Lcom/ibotta/android/util/FormattingImpl;->timeZone:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 666
    invoke-static {p1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    return-object v0
.end method

.method public joinDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MMMM dd, yyyy"

    .line 261
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 262
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public normalizeAndParseColor(Ljava/lang/String;)I
    .locals 4

    .line 408
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/FormattingImpl;->normalizeColor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 412
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to parse color string: %1$s"

    const/4 v3, 0x1

    .line 414
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v0

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return v0
.end method

.method public normalizeColor(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "#000000"

    .line 392
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x7

    if-le v0, v1, :cond_1

    .line 394
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 395
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, -0x2

    .line 396
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 397
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 400
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public normalizePhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xa

    .line 440
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/FormattingImpl;->normalizeToDigits(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public normalizeToDigits(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, -0x1

    .line 421
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/FormattingImpl;->normalizeToDigits(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public normalizeToDigits(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "[^\\d]"

    const-string v1, ""

    .line 430
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-ltz p2, :cond_1

    .line 431
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p2, :cond_1

    const/4 v0, 0x0

    .line 432
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public now()Ljava/lang/String;
    .locals 1

    .line 377
    invoke-virtual {p0}, Lcom/ibotta/android/util/FormattingImpl;->getGregorianGregorian()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->fromCalendar(Ljava/util/Calendar;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public parseBirthDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "MM/dd/yyyy"

    .line 271
    invoke-virtual {p0, v1}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    .line 274
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public percentage(F)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 474
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/util/FormattingImpl;->percentage(FI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public percentage(FI)Ljava/lang/String;
    .locals 1

    .line 485
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v0

    .line 486
    invoke-virtual {v0, p2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    float-to-double p1, p1

    .line 487
    invoke-virtual {v0, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    const-string v0, "%1$s %2$s"

    const/4 v1, 0x2

    .line 560
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->getAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public prettifyFloatToStringPercentage(F)Ljava/lang/String;
    .locals 3

    .line 479
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#.#\'%\'"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    float-to-double v1, p1

    .line 480
    invoke-virtual {v0, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public rewardAmount(DD)Ljava/lang/String;
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p3, v0

    mul-double p1, p1, p3

    .line 644
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currency(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public rewardAmountLeadingZero(DD)Ljava/lang/String;
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p3, v0

    mul-double p1, p1, p3

    .line 649
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public rewardAmountNoDollarSign(DD)Ljava/lang/String;
    .locals 2

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p3, v0

    mul-double p1, p1, p3

    .line 654
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/util/FormattingImpl;->currencyNoDollarSign(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public scrubNonAlphaNumeric(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 565
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const-string v0, "[^a-zA-Z\\d\\s]"

    const-string v1, ""

    .line 569
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public throwable(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 465
    :cond_0
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 466
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 467
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 469
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public time(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "h:mm a"

    .line 362
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    .line 363
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "AM"

    const-string v1, "am"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "PM"

    const-string v1, "pm"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public uiBirthDate(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MM/dd/yyyy"

    .line 316
    invoke-virtual {p0, v0}, Lcom/ibotta/android/util/FormattingImpl;->getSimpleDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    const-string v1, "UTC"

    .line 317
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 318
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public urlEncode(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "UTF-8"

    .line 617
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "UTF-8 should always be supported"

    const/4 v2, 0x0

    .line 619
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
