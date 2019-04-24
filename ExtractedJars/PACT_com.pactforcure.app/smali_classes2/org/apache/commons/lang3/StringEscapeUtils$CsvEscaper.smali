.class Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;
.super Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
.source "StringEscapeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/lang3/StringEscapeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CsvEscaper"
.end annotation


# static fields
.field private static final CSV_DELIMITER:C = ','

.field private static final CSV_QUOTE:C = '\"'

.field private static final CSV_QUOTE_STR:Ljava/lang/String;

.field private static final CSV_SEARCH_CHARS:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 149
    const/16 v0, 0x22

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_QUOTE_STR:Ljava/lang/String;

    .line 150
    const/4 v0, 0x4

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_SEARCH_CHARS:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x2cs
        0x22s
        0xds
        0xas
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 145
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;-><init>()V

    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 5
    .param p1, "input"    # Ljava/lang/CharSequence;
    .param p2, "index"    # I
    .param p3, "out"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/16 v4, 0x22

    .line 156
    if-eqz p2, :cond_0

    .line 157
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CsvEscaper should never reach the [1] index"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 160
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_SEARCH_CHARS:[C

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/StringUtils;->containsNone(Ljava/lang/CharSequence;[C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 167
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0

    .line 163
    :cond_1
    invoke-virtual {p3, v4}, Ljava/io/Writer;->write(I)V

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_QUOTE_STR:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_QUOTE_STR:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;->CSV_QUOTE_STR:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p3, v4}, Ljava/io/Writer;->write(I)V

    goto :goto_0
.end method
