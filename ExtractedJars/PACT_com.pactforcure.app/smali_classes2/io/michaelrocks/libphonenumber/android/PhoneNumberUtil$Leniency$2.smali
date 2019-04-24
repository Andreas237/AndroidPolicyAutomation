.class final enum Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$2;
.super Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;
.source "PhoneNumberUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 472
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency;-><init>(Ljava/lang/String;ILio/michaelrocks/libphonenumber/android/PhoneNumberUtil$1;)V

    return-void
.end method


# virtual methods
.method verify(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;)Z
    .locals 1
    .param p1, "number"    # Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
    .param p2, "candidate"    # Ljava/lang/String;
    .param p3, "util"    # Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;

    .prologue
    .line 475
    invoke-virtual {p3, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isValidNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    invoke-static {p1, p2, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberMatcher;->containsOnlyValidXChars(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 477
    :cond_0
    const/4 v0, 0x0

    .line 479
    :goto_0
    return v0

    :cond_1
    invoke-static {p1, p3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberMatcher;->isNationalPrefixPresentIfRequired(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;)Z

    move-result v0

    goto :goto_0
.end method
