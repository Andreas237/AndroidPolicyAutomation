.class public Lorg/researchstack/backbone/utils/TextUtils;
.super Ljava/lang/Object;
.source "TextUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/utils/TextUtils$AlphanumericFilter;,
        Lorg/researchstack/backbone/utils/TextUtils$NumericFilter;,
        Lorg/researchstack/backbone/utils/TextUtils$AlphabeticFilter;
    }
.end annotation


# static fields
.field public static final EMAIL_ADDRESS:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-string v0, "[a-zA-Z0-9\\+\\.\\_\\%\\-\u00e5\u00e6\u00e9\u00f8]{1,256}\\@[a-zA-Z0-9\u00e5\u00e6\u00e9\u00f8][a-zA-Z0-9\\-\u00e5\u00e6\u00e9\u00f8]{0,64}(\\.[a-zA-Z0-9\u00e5\u00e6\u00e9\u00f8][a-zA-Z0-9\\-\u00e5\u00e6\u00e9\u00f8]{0,25})+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/researchstack/backbone/utils/TextUtils;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isEmpty(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;

    .prologue
    .line 29
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 31
    :cond_0
    const/4 v0, 0x1

    .line 35
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isValidEmail(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "text"    # Ljava/lang/CharSequence;

    .prologue
    .line 47
    invoke-static {p0}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lorg/researchstack/backbone/utils/TextUtils;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
