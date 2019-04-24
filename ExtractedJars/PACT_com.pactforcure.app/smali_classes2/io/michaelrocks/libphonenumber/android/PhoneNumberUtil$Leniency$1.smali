.class final enum Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$Leniency$1;
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
    .line 460
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
    .line 463
    invoke-virtual {p3, p1}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;->isPossibleNumber(Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;)Z

    move-result v0

    return v0
.end method
