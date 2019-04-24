.class public final enum Lorg/jivesoftware/smack/sasl/SASLError;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lorg/jivesoftware/smack/sasl/SASLError;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jivesoftware/smack/sasl/SASLError;

.field private static final TAG:Ljava/lang/String; = "SASLError"

.field public static final enum aborted:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum account_disabled:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum credentials_expired:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum encryption_required:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum incorrect_encoding:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum invalid_authzid:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum invalid_mechanism:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum invalid_servicetoken:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum malformed_request:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum mechanism_too_weak:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum not_authorized:Lorg/jivesoftware/smack/sasl/SASLError;

.field public static final enum temporary_auth_failure:Lorg/jivesoftware/smack/sasl/SASLError;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 28
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "aborted"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->aborted:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 29
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "account_disabled"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->account_disabled:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 30
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "credentials_expired"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->credentials_expired:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 31
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "encryption_required"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->encryption_required:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 32
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "incorrect_encoding"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->incorrect_encoding:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 33
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "invalid_authzid"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_authzid:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 34
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "invalid_mechanism"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_mechanism:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 35
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "malformed_request"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->malformed_request:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 36
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "mechanism_too_weak"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->mechanism_too_weak:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 37
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "not_authorized"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->not_authorized:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 38
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "temporary_auth_failure"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->temporary_auth_failure:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 39
    new-instance v0, Lorg/jivesoftware/smack/sasl/SASLError;

    const-string v1, "invalid_servicetoken"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lorg/jivesoftware/smack/sasl/SASLError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_servicetoken:Lorg/jivesoftware/smack/sasl/SASLError;

    .line 26
    const/16 v0, 0xc

    new-array v0, v0, [Lorg/jivesoftware/smack/sasl/SASLError;

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->aborted:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->account_disabled:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->credentials_expired:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->encryption_required:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->incorrect_encoding:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_authzid:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_mechanism:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->malformed_request:Lorg/jivesoftware/smack/sasl/SASLError;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->mechanism_too_weak:Lorg/jivesoftware/smack/sasl/SASLError;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->not_authorized:Lorg/jivesoftware/smack/sasl/SASLError;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->temporary_auth_failure:Lorg/jivesoftware/smack/sasl/SASLError;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lorg/jivesoftware/smack/sasl/SASLError;->invalid_servicetoken:Lorg/jivesoftware/smack/sasl/SASLError;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sput-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->$VALUES:[Lorg/jivesoftware/smack/sasl/SASLError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/sasl/SASLError;
    .locals 4

    .line 48
    const/16 v0, 0x2d

    const/16 v1, 0x5f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    .line 49
    const/4 v2, 0x0

    .line 51
    :try_start_0
    invoke-static {p0}, Lorg/jivesoftware/smack/sasl/SASLError;->valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/sasl/SASLError;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 54
    goto :goto_0

    .line 52
    :catch_0
    move-exception v3

    .line 53
    const-string v0, "SASLError"

    const-string v1, "Could not transform string to SASLError"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    :goto_0
    return-object v2
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jivesoftware/smack/sasl/SASLError;
    .locals 1

    .line 26
    const-class v0, Lorg/jivesoftware/smack/sasl/SASLError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/jivesoftware/smack/sasl/SASLError;

    return-object v0
.end method

.method public static values()[Lorg/jivesoftware/smack/sasl/SASLError;
    .locals 1

    .line 26
    sget-object v0, Lorg/jivesoftware/smack/sasl/SASLError;->$VALUES:[Lorg/jivesoftware/smack/sasl/SASLError;

    invoke-virtual {v0}, [Lorg/jivesoftware/smack/sasl/SASLError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jivesoftware/smack/sasl/SASLError;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 44
    invoke-virtual {p0}, Lorg/jivesoftware/smack/sasl/SASLError;->name()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x5f

    const/16 v2, 0x2d

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
