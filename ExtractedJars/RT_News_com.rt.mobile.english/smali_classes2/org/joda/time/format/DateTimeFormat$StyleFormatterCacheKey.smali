.class Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;
.super Ljava/lang/Object;
.source "DateTimeFormat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/DateTimeFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "StyleFormatterCacheKey"
.end annotation


# instance fields
.field private final combinedTypeAndStyle:I

.field private final locale:Ljava/util/Locale;


# direct methods
.method public constructor <init>(IIILjava/util/Locale;)V
    .locals 0

    .line 867
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 868
    iput-object p4, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    shl-int/lit8 p2, p2, 0x4

    add-int/2addr p1, p2

    shl-int/lit8 p2, p3, 0x8

    add-int/2addr p1, p2

    .line 870
    iput p1, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->combinedTypeAndStyle:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 890
    :cond_1
    instance-of v2, p1, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;

    if-nez v2, :cond_2

    return v1

    .line 893
    :cond_2
    check-cast p1, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;

    .line 894
    iget v2, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->combinedTypeAndStyle:I

    iget v3, p1, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->combinedTypeAndStyle:I

    if-eq v2, v3, :cond_3

    return v1

    .line 897
    :cond_3
    iget-object v2, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    if-nez v2, :cond_4

    .line 898
    iget-object p1, p1, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    if-eqz p1, :cond_5

    return v1

    .line 901
    :cond_4
    iget-object v2, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    iget-object p1, p1, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    invoke-virtual {v2, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 877
    iget v0, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->combinedTypeAndStyle:I

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v1, v0

    .line 878
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/joda/time/format/DateTimeFormat$StyleFormatterCacheKey;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method
