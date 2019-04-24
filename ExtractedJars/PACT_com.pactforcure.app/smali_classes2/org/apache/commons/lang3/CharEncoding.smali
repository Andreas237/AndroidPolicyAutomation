.class public Lorg/apache/commons/lang3/CharEncoding;
.super Ljava/lang/Object;
.source "CharEncoding.java"


# static fields
.field public static final ISO_8859_1:Ljava/lang/String; = "ISO-8859-1"

.field public static final US_ASCII:Ljava/lang/String; = "US-ASCII"

.field public static final UTF_16:Ljava/lang/String; = "UTF-16"

.field public static final UTF_16BE:Ljava/lang/String; = "UTF-16BE"

.field public static final UTF_16LE:Ljava/lang/String; = "UTF-16LE"

.field public static final UTF_8:Ljava/lang/String; = "UTF-8"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isSupported(Ljava/lang/String;)Z
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 95
    if-nez p0, :cond_0

    .line 101
    :goto_0
    return v1

    .line 99
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->isSupported(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    .local v0, "ex":Ljava/nio/charset/IllegalCharsetNameException;
    goto :goto_0
.end method
