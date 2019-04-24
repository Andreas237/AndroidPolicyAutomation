.class public Lorg/apache/commons/lang3/StringEscapeUtils;
.super Ljava/lang/Object;
.source "StringEscapeUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/StringEscapeUtils$CsvUnescaper;,
        Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ESCAPE_XML10:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final ESCAPE_XML11:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

.field public static final UNESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 57
    new-instance v0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    const/4 v1, 0x2

    new-array v2, v1, [[Ljava/lang/String;

    const-string v3, "\""

    const-string v4, "\\\""

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "\\"

    const-string v5, "\\\\"

    filled-new-array {v3, v5}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-direct {v0, v2}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    new-array v2, v5, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v3, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 63
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->JAVA_CTRL_CHARS_ESCAPE()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v4

    .line 62
    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->with([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    move-result-object v0

    new-array v2, v5, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    const/16 v3, 0x20

    const/16 v6, 0x7f

    .line 65
    invoke-static {v3, v6}, Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;->outsideOf(II)Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;

    move-result-object v7

    aput-object v7, v2, v4

    .line 64
    invoke-virtual {v0, v2}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->with([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 77
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    const/4 v2, 0x3

    new-array v7, v2, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    const/4 v9, 0x4

    new-array v10, v9, [[Ljava/lang/String;

    const-string v11, "\'"

    const-string v12, "\\\'"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v4

    const-string v11, "\""

    const-string v12, "\\\""

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v5

    const-string v11, "\\"

    const-string v12, "\\\\"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v1

    const-string v11, "/"

    const-string v12, "\\/"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v2

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 86
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->JAVA_CTRL_CHARS_ESCAPE()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    .line 87
    invoke-static {v3, v6}, Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;->outsideOf(II)Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-direct {v0, v7}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 99
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v7, v2, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    new-array v10, v2, [[Ljava/lang/String;

    const-string v11, "\""

    const-string v12, "\\\""

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v4

    const-string v11, "\\"

    const-string v12, "\\\\"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v5

    const-string v11, "/"

    const-string v12, "\\/"

    filled-new-array {v11, v12}, [Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v1

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 107
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->JAVA_CTRL_CHARS_ESCAPE()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    .line 108
    invoke-static {v3, v6}, Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;->outsideOf(II)Lorg/apache/commons/lang3/text/translate/JavaUnicodeEscaper;

    move-result-object v3

    aput-object v3, v7, v1

    invoke-direct {v0, v7}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 122
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v1, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v7, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 124
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_ESCAPE()[[Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v7, v3, v4

    new-instance v7, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 125
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->APOS_ESCAPE()[[Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v7, v3, v5

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 137
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    const/4 v3, 0x6

    new-array v7, v3, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 139
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_ESCAPE()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v4

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 140
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->APOS_ESCAPE()[[Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v10}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v5

    new-instance v8, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    const/16 v10, 0x1f

    new-array v11, v10, [[Ljava/lang/String;

    const-string v12, "\u0000"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v4

    const-string v12, "\u0001"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v5

    const-string v12, "\u0002"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v1

    const-string v12, "\u0003"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v2

    const-string v12, "\u0004"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v9

    const-string v12, "\u0005"

    const-string v13, ""

    filled-new-array {v12, v13}, [Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x5

    aput-object v12, v11, v13

    const-string v12, "\u0006"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v3

    const-string v12, "\u0007"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x7

    aput-object v12, v11, v14

    const-string v12, "\u0008"

    const-string v15, ""

    filled-new-array {v12, v15}, [Ljava/lang/String;

    move-result-object v12

    const/16 v15, 0x8

    aput-object v12, v11, v15

    const-string v12, "\u000b"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x9

    aput-object v12, v11, v14

    const-string v12, "\u000c"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xa

    aput-object v12, v11, v14

    const-string v12, "\u000e"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xb

    aput-object v12, v11, v14

    const-string v12, "\u000f"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xc

    aput-object v12, v11, v14

    const-string v12, "\u0010"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xd

    aput-object v12, v11, v14

    const-string v12, "\u0011"

    const-string v14, ""

    filled-new-array {v12, v14}, [Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xe

    aput-object v12, v11, v14

    const-string v12, "\u0012"

    const-string v3, ""

    filled-new-array {v12, v3}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0xf

    aput-object v3, v11, v12

    const-string v3, "\u0013"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x10

    aput-object v3, v11, v12

    const-string v3, "\u0014"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x11

    aput-object v3, v11, v12

    const-string v3, "\u0015"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x12

    aput-object v3, v11, v12

    const-string v3, "\u0016"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x13

    aput-object v3, v11, v12

    const-string v3, "\u0017"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x14

    aput-object v3, v11, v12

    const-string v3, "\u0018"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x15

    aput-object v3, v11, v12

    const-string v3, "\u0019"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x16

    aput-object v3, v11, v12

    const-string v3, "\u001a"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x17

    aput-object v3, v11, v12

    const-string v3, "\u001b"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x18

    aput-object v3, v11, v12

    const-string v3, "\u001c"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x19

    aput-object v3, v11, v12

    const-string v3, "\u001d"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1a

    aput-object v3, v11, v12

    const-string v3, "\u001e"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1b

    aput-object v3, v11, v12

    const-string v3, "\u001f"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1c

    aput-object v3, v11, v12

    const-string v3, "\ufffe"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1d

    aput-object v3, v11, v12

    const-string v3, "\uffff"

    const-string v12, ""

    filled-new-array {v3, v12}, [Ljava/lang/String;

    move-result-object v3

    const/16 v12, 0x1e

    aput-object v3, v11, v12

    invoke-direct {v8, v11}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v8, v7, v1

    const/16 v3, 0x84

    .line 175
    invoke-static {v6, v3}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v8

    aput-object v8, v7, v2

    const/16 v8, 0x86

    const/16 v11, 0x9f

    .line 176
    invoke-static {v8, v11}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v11

    aput-object v11, v7, v9

    new-instance v11, Lorg/apache/commons/lang3/text/translate/UnicodeUnpairedSurrogateRemover;

    invoke-direct {v11}, Lorg/apache/commons/lang3/text/translate/UnicodeUnpairedSurrogateRemover;-><init>()V

    aput-object v11, v7, v13

    invoke-direct {v0, v7}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML10:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 189
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v7, v15, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v11, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 191
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_ESCAPE()[[Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v4

    new-instance v11, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 192
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->APOS_ESCAPE()[[Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v5

    new-instance v11, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    new-array v12, v13, [[Ljava/lang/String;

    const-string v8, "\u0000"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v4

    const-string v8, "\u000b"

    const-string v13, "&#11;"

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v5

    const-string v8, "\u000c"

    const-string v13, "&#12;"

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v1

    const-string v8, "\ufffe"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v2

    const-string v8, "\uffff"

    const-string v13, ""

    filled-new-array {v8, v13}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v12, v9

    invoke-direct {v11, v12}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v11, v7, v1

    .line 201
    invoke-static {v5, v15}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v8

    aput-object v8, v7, v2

    .line 202
    invoke-static {v14, v10}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v8

    aput-object v8, v7, v9

    .line 203
    invoke-static {v6, v3}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v3

    const/4 v6, 0x5

    aput-object v3, v7, v6

    const/16 v3, 0x9f

    const/16 v6, 0x86

    .line 204
    invoke-static {v6, v3}, Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;->between(II)Lorg/apache/commons/lang3/text/translate/NumericEntityEscaper;

    move-result-object v3

    const/4 v6, 0x6

    aput-object v3, v7, v6

    new-instance v3, Lorg/apache/commons/lang3/text/translate/UnicodeUnpairedSurrogateRemover;

    invoke-direct {v3}, Lorg/apache/commons/lang3/text/translate/UnicodeUnpairedSurrogateRemover;-><init>()V

    const/4 v6, 0x7

    aput-object v3, v7, v6

    invoke-direct {v0, v7}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML11:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 217
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v1, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 219
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_ESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 220
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->ISO8859_1_ESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 232
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v2, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 234
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_ESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 235
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->ISO8859_1_ESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 236
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->HTML40_EXTENDED_ESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 248
    new-instance v0, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;

    invoke-direct {v0}, Lorg/apache/commons/lang3/StringEscapeUtils$CsvEscaper;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 290
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v9, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v6, Lorg/apache/commons/lang3/text/translate/OctalUnescaper;

    invoke-direct {v6}, Lorg/apache/commons/lang3/text/translate/OctalUnescaper;-><init>()V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/lang3/text/translate/UnicodeUnescaper;

    invoke-direct {v6}, Lorg/apache/commons/lang3/text/translate/UnicodeUnescaper;-><init>()V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 294
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->JAVA_CTRL_CHARS_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    new-array v7, v9, [[Ljava/lang/String;

    const-string v8, "\\\\"

    const-string v10, "\\"

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v4

    const-string v8, "\\\""

    const-string v10, "\""

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v5

    const-string v8, "\\\'"

    const-string v10, "\'"

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v1

    const-string v8, "\\"

    const-string v10, ""

    filled-new-array {v8, v10}, [Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v2

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 313
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 324
    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 335
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v2, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 337
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 338
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->ISO8859_1_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;

    new-array v7, v4, [Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;-><init>([Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;)V

    aput-object v6, v3, v1

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 351
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v3, v9, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 353
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v4

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 354
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->ISO8859_1_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v5

    new-instance v6, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 355
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->HTML40_EXTENDED_UNESCAPE()[[Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v6, v3, v1

    new-instance v6, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;

    new-array v7, v4, [Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;-><init>([Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;)V

    aput-object v6, v3, v2

    invoke-direct {v0, v3}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 368
    new-instance v0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;

    new-array v2, v2, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    new-instance v3, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 370
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->BASIC_UNESCAPE()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v4

    new-instance v3, Lorg/apache/commons/lang3/text/translate/LookupTranslator;

    .line 371
    invoke-static {}, Lorg/apache/commons/lang3/text/translate/EntityArrays;->APOS_UNESCAPE()[[Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Lorg/apache/commons/lang3/text/translate/LookupTranslator;-><init>([[Ljava/lang/CharSequence;)V

    aput-object v3, v2, v5

    new-instance v3, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;

    new-array v4, v4, [Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;

    invoke-direct {v3, v4}, Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper;-><init>([Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;)V

    aput-object v3, v2, v1

    invoke-direct {v0, v2}, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;-><init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 384
    new-instance v0, Lorg/apache/commons/lang3/StringEscapeUtils$CsvUnescaper;

    invoke-direct {v0}, Lorg/apache/commons/lang3/StringEscapeUtils$CsvUnescaper;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final escapeCsv(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 778
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeEcmaScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 485
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeHtml3(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 606
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeHtml4(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 593
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeJava(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 457
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeJson(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 513
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final escapeXml(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 668
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static escapeXml10(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 700
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML10:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static escapeXml11(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 730
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->ESCAPE_XML11:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeCsv(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 803
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_CSV:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeEcmaScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 543
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_ECMASCRIPT:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeHtml3(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 642
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_HTML3:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeHtml4(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 628
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_HTML4:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeJava(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 526
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_JAVA:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeJson(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 560
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_JSON:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final unescapeXml(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 752
    sget-object v0, Lorg/apache/commons/lang3/StringEscapeUtils;->UNESCAPE_XML:Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
