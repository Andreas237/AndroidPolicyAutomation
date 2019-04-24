.class public Lcom/ibotta/android/util/ValidationImpl;
.super Ljava/lang/Object;
.source "ValidationImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/Validation;


# static fields
.field public static final CVC_LENGTH_MAX:I = 0x4

.field public static final CVC_LENGTH_MIN:I = 0x3

.field public static final PASSWORD_MIN_LENGTH:I = 0x6

.field public static final REGEX_1_OR_MORE_LC_ALPHA:Ljava/lang/String; = "^.*[a-z]+.*$"

.field public static final REGEX_1_OR_MORE_UC_ALPHA:Ljava/lang/String; = "^.*[A-Z]+.*$"

.field public static final REGEX_EMAIL:Ljava/lang/String; = "[A-Z0-9a-z.1_%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}"

.field public static final REGEX_IS_NUMERIC:Ljava/lang/String; = "\\d+(?:\\.\\d+)?"

.field public static final REGEX_ZIP:Ljava/lang/String; = "^[0-9]{5}"


# instance fields
.field protected final formatting:Lcom/ibotta/android/util/Formatting;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/util/ValidationImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method


# virtual methods
.method protected getCalendar()Ljava/util/Calendar;
    .locals 1

    .line 122
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    return-object v0
.end method

.method public isCvcValid(Ljava/lang/String;)Z
    .locals 1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isEntered(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, ""

    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isNumeric(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "\\d+(?:\\.\\d+)?"

    .line 136
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public isValidBirthDate(Ljava/lang/String;)Z
    .locals 11

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/ValidationImpl;->isEntered(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/util/ValidationImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->parseBirthDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/util/ValidationImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v0

    const/16 v2, -0xd

    const/4 v3, 0x1

    .line 79
    invoke-virtual {v0, v3, v2}, Ljava/util/Calendar;->roll(II)V

    const/16 v2, 0xa

    .line 80
    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v4, 0xc

    .line 81
    invoke-virtual {v0, v4, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v5, 0xd

    .line 82
    invoke-virtual {v0, v5, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v6, 0xe

    .line 83
    invoke-virtual {v0, v6, v1}, Ljava/util/Calendar;->set(II)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/util/ValidationImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v7

    const/16 v8, -0x64

    .line 86
    invoke-virtual {v7, v3, v8}, Ljava/util/Calendar;->roll(II)V

    .line 87
    invoke-virtual {v7, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 88
    invoke-virtual {v7, v4, v1}, Ljava/util/Calendar;->set(II)V

    .line 89
    invoke-virtual {v7, v5, v1}, Ljava/util/Calendar;->set(II)V

    .line 90
    invoke-virtual {v7, v6, v1}, Ljava/util/Calendar;->set(II)V

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/util/ValidationImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object v8

    .line 93
    invoke-virtual {v8, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/util/ValidationImpl;->getCalendar()Ljava/util/Calendar;

    move-result-object p1

    .line 96
    invoke-virtual {v8, v3}, Ljava/util/Calendar;->get(I)I

    move-result v9

    invoke-virtual {p1, v3, v9}, Ljava/util/Calendar;->set(II)V

    const/4 v9, 0x2

    .line 97
    invoke-virtual {v8, v9}, Ljava/util/Calendar;->get(I)I

    move-result v10

    invoke-virtual {p1, v9, v10}, Ljava/util/Calendar;->set(II)V

    const/4 v9, 0x5

    .line 98
    invoke-virtual {v8, v9}, Ljava/util/Calendar;->get(I)I

    move-result v8

    invoke-virtual {p1, v9, v8}, Ljava/util/Calendar;->set(II)V

    .line 99
    invoke-virtual {p1, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 100
    invoke-virtual {p1, v4, v1}, Ljava/util/Calendar;->set(II)V

    .line 101
    invoke-virtual {p1, v5, v1}, Ljava/util/Calendar;->set(II)V

    .line 102
    invoke-virtual {p1, v6, v1}, Ljava/util/Calendar;->set(II)V

    .line 104
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    .line 105
    invoke-virtual {p1, v7}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result p1

    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    xor-int/lit8 p1, v1, 0x1

    return p1
.end method

.method public isValidEmail(Ljava/lang/String;)Z
    .locals 1

    .line 35
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/ValidationImpl;->isEntered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "[A-Z0-9a-z.1_%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}"

    .line 39
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 40
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isValidPassword(Ljava/lang/String;)Z
    .locals 2

    .line 55
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/ValidationImpl;->isEntered(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 58
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x6

    if-lt p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public isValidPhoneNumber(Ljava/lang/String;)Z
    .locals 1

    .line 127
    sget-object v0, Landroid/util/Patterns;->PHONE:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isValidReferralCode(Ljava/lang/String;)Z
    .locals 1

    .line 113
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/ValidationImpl;->isEntered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "^([a-zA-Z0-9]){1,20}$"

    .line 117
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 118
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method public isValidZip(Ljava/lang/String;)Z
    .locals 1

    .line 45
    invoke-virtual {p0, p1}, Lcom/ibotta/android/util/ValidationImpl;->isEntered(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "^[0-9]{5}"

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method
