.class public final enum Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
.super Ljava/lang/Enum;
.source "Phonenumber.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CountryCodeSource"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITHOUT_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITH_IDD:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

.field public static final enum FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITH_PLUS_SIGN"

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 34
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITH_IDD"

    invoke-direct {v0, v1, v3}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_IDD:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 35
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_NUMBER_WITHOUT_PLUS_SIGN"

    invoke-direct {v0, v1, v4}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITHOUT_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 36
    new-instance v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    const-string v1, "FROM_DEFAULT_COUNTRY"

    invoke-direct {v0, v1, v5}, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    .line 32
    const/4 v0, 0x4

    new-array v0, v0, [Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    sget-object v1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v2

    sget-object v1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITH_IDD:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v3

    sget-object v1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_NUMBER_WITHOUT_PLUS_SIGN:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v4

    sget-object v1, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->FROM_DEFAULT_COUNTRY:Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    aput-object v1, v0, v5

    sput-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->$VALUES:[Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 32
    const-class v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    return-object v0
.end method

.method public static values()[Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->$VALUES:[Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    invoke-virtual {v0}, [Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/michaelrocks/libphonenumber/android/Phonenumber$PhoneNumber$CountryCodeSource;

    return-object v0
.end method
