.class public interface abstract Lcom/ibotta/android/util/Formatting;
.super Ljava/lang/Object;
.source "Formatting.java"

# interfaces
.implements Lcom/ibotta/api/ApiFormatting;


# virtual methods
.method public abstract abbreviate(J)Ljava/lang/String;
.end method

.method public abstract apiBirthDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract birthDate(III)Ljava/lang/String;
.end method

.method public abstract centsToDollars(I)D
.end method

.method public abstract currency(D)Ljava/lang/String;
.end method

.method public abstract currencyFromString(Ljava/lang/String;)D
.end method

.method public abstract currencyLeadZero(D)Ljava/lang/String;
.end method

.method public abstract currencyLeadZeroNoDollarSign(D)Ljava/lang/String;
.end method

.method public abstract currencyNoDecimal(D)Ljava/lang/String;
.end method

.method public abstract currencyNoDollarSign(D)Ljava/lang/String;
.end method

.method public abstract currencyPositiveOrZero(Ljava/text/Format;D)Ljava/lang/String;
.end method

.method public abstract currencyPositiveOrZeroLeadingZero(D)Ljava/lang/String;
.end method

.method public abstract currencyPositiveOrZeroLeadingZeroNoDollarSign(D)Ljava/lang/String;
.end method

.method public abstract currencyPositiveOrZeroNoLeadingZero(D)Ljava/lang/String;
.end method

.method public abstract date(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract date4(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract dateFromCardExpiration(II)Ljava/util/Date;
.end method

.method public abstract dateStringFromCardExpiration(II)Ljava/lang/String;
.end method

.method public abstract dateTime(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract firstAndLastName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public varargs abstract format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public abstract formatDateAsISO8601(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract fromCalendar(Ljava/util/Calendar;)Ljava/lang/String;
.end method

.method public abstract fromServerDateString(Ljava/lang/String;)Ljava/util/Date;
.end method

.method public abstract getAorAn(Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public abstract getAppConfigExpiration(Ljava/util/Date;)Ljava/lang/String;
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getAvailableAt(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;
.end method

.method public abstract getAvailableAtStringId(Lcom/ibotta/api/model/common/VerificationType;)I
.end method

.method public abstract getAvailableWhere(Ljava/util/List;Ljava/util/Set;)Ljava/lang/String;
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
.end method

.method public abstract getCurrencyFormat()Ljava/text/Format;
.end method

.method public abstract getCurrencyLeadZeroFormat()Ljava/text/Format;
.end method

.method public abstract getCurrencyLeadZeroNoDollarSignFormat()Ljava/text/Format;
.end method

.method public abstract getEarningsMonth(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract getEncodedQueryParams(Landroid/net/Uri;)Ljava/lang/String;
.end method

.method public abstract getExpiration(Ljava/util/Date;)Ljava/lang/String;
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getExpirationAtTime(Ljava/util/Date;)Ljava/lang/String;
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerWaitTimeStr(Lcom/ibotta/api/model/common/VerificationType;)Ljava/lang/String;
.end method

.method public abstract joinDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract normalizeAndParseColor(Ljava/lang/String;)I
.end method

.method public abstract normalizeColor(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract normalizePhoneNumber(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract normalizeToDigits(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract normalizeToDigits(Ljava/lang/String;I)Ljava/lang/String;
.end method

.method public abstract now()Ljava/lang/String;
.end method

.method public abstract parseBirthDate(Ljava/lang/String;)Ljava/util/Date;
.end method

.method public abstract percentage(F)Ljava/lang/String;
.end method

.method public abstract prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public abstract prettifyFloatToStringPercentage(F)Ljava/lang/String;
.end method

.method public abstract rewardAmount(DD)Ljava/lang/String;
.end method

.method public abstract rewardAmountLeadingZero(DD)Ljava/lang/String;
.end method

.method public abstract rewardAmountNoDollarSign(DD)Ljava/lang/String;
.end method

.method public abstract scrubNonAlphaNumeric(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract throwable(Ljava/lang/Throwable;)Ljava/lang/String;
.end method

.method public abstract time(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract uiBirthDate(Ljava/util/Date;)Ljava/lang/String;
.end method

.method public abstract urlEncode(Ljava/lang/String;)Ljava/lang/String;
.end method
