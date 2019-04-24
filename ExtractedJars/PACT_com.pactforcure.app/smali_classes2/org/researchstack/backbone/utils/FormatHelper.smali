.class public Lorg/researchstack/backbone/utils/FormatHelper;
.super Ljava/lang/Object;
.source "FormatHelper.java"


# static fields
.field public static final DATE_FORMAT_ISO_8601:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

.field public static final DATE_FORMAT_SIMPLE_DATE:Ljava/lang/String; = "yyyy-MM-dd"

.field public static final DEFAULT_FORMAT:Ljava/text/SimpleDateFormat;

.field public static final NONE:I = -0x1

.field public static final SIMPLE_FORMAT_DATE:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 16
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    .line 17
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lorg/researchstack/backbone/utils/FormatHelper;->DEFAULT_FORMAT:Ljava/text/SimpleDateFormat;

    .line 20
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    .line 22
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lorg/researchstack/backbone/utils/FormatHelper;->SIMPLE_FORMAT_DATE:Ljava/text/SimpleDateFormat;

    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFormat(II)Ljava/text/DateFormat;
    .locals 2
    .param p0, "dateStyle"    # I
    .param p1, "timeStyle"    # I

    .prologue
    .line 45
    invoke-static {p0}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-static {p0, p1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v0

    .line 59
    :goto_0
    return-object v0

    .line 51
    :cond_0
    invoke-static {p0}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 53
    invoke-static {p0}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    goto :goto_0

    .line 57
    :cond_1
    invoke-static {p0}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lorg/researchstack/backbone/utils/FormatHelper;->isStyle(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    invoke-static {p1}, Ljava/text/DateFormat;->getTimeInstance(I)Ljava/text/DateFormat;

    move-result-object v0

    goto :goto_0

    .line 65
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "dateStyle and timeStyle cannot both be "

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getSignatureFormat()Ljava/text/DateFormat;
    .locals 2

    .prologue
    .line 32
    const/4 v0, 0x3

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lorg/researchstack/backbone/utils/FormatHelper;->getFormat(II)Ljava/text/DateFormat;

    move-result-object v0

    return-object v0
.end method

.method public static isStyle(I)Z
    .locals 1
    .param p0, "style"    # I

    .prologue
    .line 71
    if-ltz p0, :cond_0

    const/4 v0, 0x3

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
