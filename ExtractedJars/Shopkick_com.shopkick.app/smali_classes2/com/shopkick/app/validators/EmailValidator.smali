.class public Lcom/shopkick/app/validators/EmailValidator;
.super Ljava/lang/Object;
.source "EmailValidator.java"


# static fields
.field private static final EMAIL_PATTERN:Ljava/lang/String; = "^[A-Za-z0-9!#$%&\'*+-/=?^_`.{|}~\\\\-_@]+@([a-zA-Z0-9-]+\\.)+[A-Za-z]{2,63}$"

.field private static matcher:Ljava/util/regex/Matcher;

.field private static final pattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "^[A-Za-z0-9!#$%&\'*+-/=?^_`.{|}~\\\\-_@]+@([a-zA-Z0-9-]+\\.)+[A-Za-z]{2,63}$"

    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/validators/EmailValidator;->pattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isValid(Ljava/lang/String;)Z
    .locals 1

    .line 17
    sget-object v0, Lcom/shopkick/app/validators/EmailValidator;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    sput-object p0, Lcom/shopkick/app/validators/EmailValidator;->matcher:Ljava/util/regex/Matcher;

    .line 18
    sget-object p0, Lcom/shopkick/app/validators/EmailValidator;->matcher:Ljava/util/regex/Matcher;

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method
