.class public final enum Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
.super Ljava/lang/Enum;
.source "PhoneNumberUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PhoneNumberType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum PAGER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum PERSONAL_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum SHARED_COST:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum TOLL_FREE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum UAN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum VOICEMAIL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

.field public static final enum VOIP:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 401
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "FIXED_LINE"

    invoke-direct {v0, v1, v3}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 402
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "MOBILE"

    invoke-direct {v0, v1, v4}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 405
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "FIXED_LINE_OR_MOBILE"

    invoke-direct {v0, v1, v5}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 407
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "TOLL_FREE"

    invoke-direct {v0, v1, v6}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 408
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "PREMIUM_RATE"

    invoke-direct {v0, v1, v7}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 412
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "SHARED_COST"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->SHARED_COST:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 414
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "VOIP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOIP:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 418
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "PERSONAL_NUMBER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PERSONAL_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 419
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "PAGER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PAGER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 422
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "UAN"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UAN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 424
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "VOICEMAIL"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOICEMAIL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 427
    new-instance v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    .line 400
    const/16 v0, 0xc

    new-array v0, v0, [Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v1, v0, v3

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v1, v0, v4

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->FIXED_LINE_OR_MOBILE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v1, v0, v5

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->TOLL_FREE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v1, v0, v6

    sget-object v1, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PREMIUM_RATE:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->SHARED_COST:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOIP:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PERSONAL_NUMBER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->PAGER:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UAN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->VOICEMAIL:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->UNKNOWN:Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    aput-object v2, v0, v1

    sput-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->$VALUES:[Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

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
    .line 400
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 400
    const-class v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    return-object v0
.end method

.method public static values()[Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;
    .locals 1

    .prologue
    .line 400
    sget-object v0, Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->$VALUES:[Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    invoke-virtual {v0}, [Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/michaelrocks/libphonenumber/android/PhoneNumberUtil$PhoneNumberType;

    return-object v0
.end method
