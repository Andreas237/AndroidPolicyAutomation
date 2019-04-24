.class public final Lcom/google/protobuf/TextFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;,
        Lcom/google/protobuf/TextFormat$Parser;,
        Lcom/google/protobuf/TextFormat$UnknownFieldParseException;,
        Lcom/google/protobuf/TextFormat$ParseException;,
        Lcom/google/protobuf/TextFormat$Tokenizer;,
        Lcom/google/protobuf/TextFormat$TextGenerator;,
        Lcom/google/protobuf/TextFormat$Printer;
    }
.end annotation


# static fields
.field private static final PARSER:Lcom/google/protobuf/TextFormat$Parser;

.field private static final logger:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const-class v0, Lcom/google/protobuf/TextFormat;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/TextFormat;->logger:Ljava/util/logging/Logger;

    .line 1196
    invoke-static {}, Lcom/google/protobuf/TextFormat$Parser;->newBuilder()Lcom/google/protobuf/TextFormat$Parser$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/TextFormat$Parser$Builder;->build()Lcom/google/protobuf/TextFormat$Parser;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$400(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/TextFormat;->printUnknownFieldValue(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method static synthetic access$700()Ljava/util/logging/Logger;
    .locals 1

    .line 55
    sget-object v0, Lcom/google/protobuf/TextFormat;->logger:Ljava/util/logging/Logger;

    return-object v0
.end method

.method private static digitValue(B)I
    .locals 2

    .line 1987
    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    .line 1988
    add-int/lit8 v0, p0, -0x30

    return v0

    .line 1989
    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_1

    .line 1990
    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 1992
    :cond_1
    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    return v0
.end method

.method public static escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;
    .locals 1

    .line 1836
    invoke-static {p0}, Lcom/google/protobuf/TextFormatEscaper;->escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static escapeBytes([B)Ljava/lang/String;
    .locals 1

    .line 1843
    invoke-static {p0}, Lcom/google/protobuf/TextFormatEscaper;->escapeBytes([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static escapeDoubleQuotesAndBackslashes(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1957
    invoke-static {p0}, Lcom/google/protobuf/TextFormatEscaper;->escapeDoubleQuotesAndBackslashes(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static escapeText(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1950
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getParser()Lcom/google/protobuf/TextFormat$Parser;
    .locals 1

    .line 1203
    sget-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    return-object v0
.end method

.method private static isHex(B)Z
    .locals 1

    .line 1976
    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v0, 0x39

    if-le p0, v0, :cond_2

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x66

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_3

    const/16 v0, 0x46

    if-gt p0, v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isOctal(B)Z
    .locals 1

    .line 1971
    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v0, 0x37

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static merge(Ljava/lang/CharSequence;Lcom/google/protobuf/ExtensionRegistry;Lcom/google/protobuf/Message$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/TextFormat$ParseException;
        }
    .end annotation

    .line 1248
    sget-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/TextFormat$Parser;->merge(Ljava/lang/CharSequence;Lcom/google/protobuf/ExtensionRegistry;Lcom/google/protobuf/Message$Builder;)V

    .line 1249
    return-void
.end method

.method public static merge(Ljava/lang/CharSequence;Lcom/google/protobuf/Message$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/TextFormat$ParseException;
        }
    .end annotation

    .line 1223
    sget-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/TextFormat$Parser;->merge(Ljava/lang/CharSequence;Lcom/google/protobuf/Message$Builder;)V

    .line 1224
    return-void
.end method

.method public static merge(Ljava/lang/Readable;Lcom/google/protobuf/ExtensionRegistry;Lcom/google/protobuf/Message$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1235
    sget-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/TextFormat$Parser;->merge(Ljava/lang/Readable;Lcom/google/protobuf/ExtensionRegistry;Lcom/google/protobuf/Message$Builder;)V

    .line 1236
    return-void
.end method

.method public static merge(Ljava/lang/Readable;Lcom/google/protobuf/Message$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1213
    sget-object v0, Lcom/google/protobuf/TextFormat;->PARSER:Lcom/google/protobuf/TextFormat$Parser;

    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/TextFormat$Parser;->merge(Ljava/lang/Readable;Lcom/google/protobuf/Message$Builder;)V

    .line 1214
    return-void
.end method

.method private static multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;
    .locals 3

    .line 518
    new-instance v0, Lcom/google/protobuf/TextFormat$TextGenerator;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/TextFormat$TextGenerator;-><init>(Ljava/lang/Appendable;ZLcom/google/protobuf/TextFormat$1;)V

    return-object v0
.end method

.method static parseInt32(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 2002
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/TextFormat;->parseInteger(Ljava/lang/String;ZZ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method static parseInt64(Ljava/lang/String;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 2022
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/TextFormat;->parseInteger(Ljava/lang/String;ZZ)J

    move-result-wide v0

    return-wide v0
.end method

.method private static parseInteger(Ljava/lang/String;ZZ)J
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 2040
    const/4 v3, 0x0

    .line 2042
    const/4 v4, 0x0

    .line 2043
    const-string v0, "-"

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2044
    if-nez p1, :cond_0

    .line 2045
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number must be positive: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2047
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 2048
    const/4 v4, 0x1

    .line 2051
    :cond_1
    const/16 v5, 0xa

    .line 2052
    const-string v0, "0x"

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2053
    add-int/lit8 v3, v3, 0x2

    .line 2054
    const/16 v5, 0x10

    goto :goto_0

    .line 2055
    :cond_2
    const-string v0, "0"

    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2056
    const/16 v5, 0x8

    .line 2059
    :cond_3
    :goto_0
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 2061
    const-wide/16 v7, 0x0

    .line 2062
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_8

    .line 2064
    invoke-static {v6, v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v7

    .line 2065
    if-eqz v4, :cond_4

    .line 2066
    neg-long v7, v7

    .line 2072
    :cond_4
    if-nez p2, :cond_e

    .line 2073
    if-eqz p1, :cond_6

    .line 2074
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v7, v0

    if-gtz v0, :cond_5

    const-wide/32 v0, -0x80000000

    cmp-long v0, v7, v0

    if-gez v0, :cond_e

    .line 2075
    :cond_5
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 32-bit signed integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2079
    :cond_6
    const-wide v0, 0x100000000L

    cmp-long v0, v7, v0

    if-gez v0, :cond_7

    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-gez v0, :cond_e

    .line 2080
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 32-bit unsigned integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2086
    :cond_8
    new-instance v9, Ljava/math/BigInteger;

    invoke-direct {v9, v6, v5}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 2087
    if-eqz v4, :cond_9

    .line 2088
    invoke-virtual {v9}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v9

    .line 2092
    :cond_9
    if-nez p2, :cond_b

    .line 2093
    if-eqz p1, :cond_a

    .line 2094
    invoke-virtual {v9}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x1f

    if-le v0, v1, :cond_d

    .line 2095
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 32-bit signed integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2099
    :cond_a
    invoke-virtual {v9}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x20

    if-le v0, v1, :cond_d

    .line 2100
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 32-bit unsigned integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2105
    :cond_b
    if-eqz p1, :cond_c

    .line 2106
    invoke-virtual {v9}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x3f

    if-le v0, v1, :cond_d

    .line 2107
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 64-bit signed integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2111
    :cond_c
    invoke-virtual {v9}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_d

    .line 2112
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Number out of range for 64-bit unsigned integer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2118
    :cond_d
    invoke-virtual {v9}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v7

    .line 2121
    :cond_e
    return-wide v7
.end method

.method static parseUInt32(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 2013
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/TextFormat;->parseInteger(Ljava/lang/String;ZZ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method static parseUInt64(Ljava/lang/String;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    .line 2033
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/google/protobuf/TextFormat;->parseInteger(Ljava/lang/String;ZZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$000(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 69
    return-void
.end method

.method public static print(Lcom/google/protobuf/UnknownFieldSet;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 76
    return-void
.end method

.method public static printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 201
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$200(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 202
    return-void
.end method

.method public static printFieldToString(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 207
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    invoke-static {p0, p1, v1}, Lcom/google/protobuf/TextFormat;->printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V

    .line 209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 210
    :catch_0
    move-exception v1

    .line 211
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 246
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$300(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 247
    return-void
.end method

.method public static printToString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;
    .locals 2

    .line 147
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    invoke-static {p0, v1}, Lcom/google/protobuf/TextFormat;->print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;)V

    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 150
    :catch_0
    move-exception v1

    .line 151
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static printToString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;
    .locals 2

    .line 161
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    invoke-static {p0, v1}, Lcom/google/protobuf/TextFormat;->print(Lcom/google/protobuf/UnknownFieldSet;Ljava/lang/Appendable;)V

    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 164
    :catch_0
    move-exception v1

    .line 165
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static printToUnicodeString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;
    .locals 3

    .line 175
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->UNICODE:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$000(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 177
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 178
    :catch_0
    move-exception v2

    .line 179
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static printToUnicodeString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;
    .locals 3

    .line 189
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->UNICODE:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 192
    :catch_0
    move-exception v2

    .line 193
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static printUnicode(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 85
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->UNICODE:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$000(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 86
    return-void
.end method

.method public static printUnicode(Lcom/google/protobuf/UnknownFieldSet;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 95
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->UNICODE:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 96
    return-void
.end method

.method public static printUnicodeFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 229
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->UNICODE:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$300(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 230
    return-void
.end method

.method private static printUnknownFieldValue(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 270
    invoke-static {p0}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 272
    :pswitch_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/protobuf/TextFormat;->unsignedToString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 273
    goto/16 :goto_1

    .line 275
    :pswitch_1
    const/4 v0, 0x0

    const-string v1, "0x%08x"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/Integer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 276
    const/4 v0, 0x0

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 275
    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 277
    goto/16 :goto_1

    .line 279
    :pswitch_2
    const/4 v0, 0x0

    const-string v1, "0x%016x"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/Long;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v0, 0x0

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 280
    goto :goto_1

    .line 284
    :pswitch_3
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {v0}, Lcom/google/protobuf/UnknownFieldSet;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v5

    .line 285
    const-string v0, "{"

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 286
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 287
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->indent()V

    .line 288
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v0, v5, p2}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 289
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->outdent()V

    .line 290
    const-string v0, "}"

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 296
    goto :goto_1

    .line 291
    :catch_0
    move-exception v5

    .line 293
    const-string v0, "\""

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 294
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 295
    const-string v0, "\""

    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 297
    goto :goto_1

    .line 299
    :pswitch_4
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    move-object v1, p1

    check-cast v1, Lcom/google/protobuf/UnknownFieldSet;

    invoke-static {v0, v1, p2}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 300
    goto :goto_1

    .line 302
    :goto_0
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad tag: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 304
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method

.method public static printUnknownFieldValue(ILjava/lang/Object;Ljava/lang/Appendable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 263
    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->multiLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/protobuf/TextFormat;->printUnknownFieldValue(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 264
    return-void
.end method

.method public static shortDebugString(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 119
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v2}, Lcom/google/protobuf/TextFormat;->singleLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$200(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 122
    :catch_0
    move-exception v2

    .line 123
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static shortDebugString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;
    .locals 3

    .line 104
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v2}, Lcom/google/protobuf/TextFormat;->singleLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$000(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 107
    :catch_0
    move-exception v2

    .line 108
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static shortDebugString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;
    .locals 3

    .line 133
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT:Lcom/google/protobuf/TextFormat$Printer;

    invoke-static {v2}, Lcom/google/protobuf/TextFormat;->singleLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lcom/google/protobuf/TextFormat$Printer;->access$100(Lcom/google/protobuf/TextFormat$Printer;Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 135
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 136
    :catch_0
    move-exception v2

    .line 137
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static singleLineOutput(Ljava/lang/Appendable;)Lcom/google/protobuf/TextFormat$TextGenerator;
    .locals 3

    .line 522
    new-instance v0, Lcom/google/protobuf/TextFormat$TextGenerator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/TextFormat$TextGenerator;-><init>(Ljava/lang/Appendable;ZLcom/google/protobuf/TextFormat$1;)V

    return-object v0
.end method

.method public static unescapeBytes(Ljava/lang/CharSequence;)Lcom/google/protobuf/ByteString;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;
        }
    .end annotation

    .line 1854
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v3

    .line 1862
    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v0

    new-array v4, v0, [B

    .line 1863
    const/4 v5, 0x0

    .line 1864
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v0

    if-ge v6, v0, :cond_7

    .line 1865
    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v7

    .line 1866
    const/16 v0, 0x5c

    if-ne v7, v0, :cond_6

    .line 1867
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 1868
    add-int/lit8 v6, v6, 0x1

    .line 1869
    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v7

    .line 1870
    invoke-static {v7}, Lcom/google/protobuf/TextFormat;->isOctal(B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1872
    invoke-static {v7}, Lcom/google/protobuf/TextFormat;->digitValue(B)I

    move-result v8

    .line 1873
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3, v0}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->isOctal(B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1874
    add-int/lit8 v6, v6, 0x1

    .line 1875
    mul-int/lit8 v0, v8, 0x8

    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/TextFormat;->digitValue(B)I

    move-result v1

    add-int v8, v0, v1

    .line 1877
    :cond_0
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3, v0}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->isOctal(B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1878
    add-int/lit8 v6, v6, 0x1

    .line 1879
    mul-int/lit8 v0, v8, 0x8

    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/TextFormat;->digitValue(B)I

    move-result v1

    add-int v8, v0, v1

    .line 1882
    :cond_1
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    int-to-byte v1, v8

    aput-byte v1, v4, v0

    .line 1883
    goto/16 :goto_3

    .line 1884
    :cond_2
    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_2

    .line 1885
    :sswitch_0
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v1, 0x7

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1886
    :sswitch_1
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x8

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1887
    :sswitch_2
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xc

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1888
    :sswitch_3
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xa

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1889
    :sswitch_4
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xd

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1890
    :sswitch_5
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x9

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1891
    :sswitch_6
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0xb

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1892
    :sswitch_7
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x5c

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1893
    :sswitch_8
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x27

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1894
    :sswitch_9
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/16 v1, 0x22

    aput-byte v1, v4, v0

    goto/16 :goto_3

    .line 1898
    :sswitch_a
    const/4 v8, 0x0

    .line 1899
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3, v0}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->isHex(B)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1900
    add-int/lit8 v6, v6, 0x1

    .line 1901
    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->digitValue(B)I

    move-result v8

    goto :goto_1

    .line 1903
    :cond_3
    new-instance v0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    const-string v1, "Invalid escape sequence: \'\\x\' with no digits"

    invoke-direct {v0, v1}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1906
    :goto_1
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3}, Lcom/google/protobuf/ByteString;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v3, v0}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/TextFormat;->isHex(B)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1907
    add-int/lit8 v6, v6, 0x1

    .line 1908
    mul-int/lit8 v0, v8, 0x10

    invoke-virtual {v3, v6}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/TextFormat;->digitValue(B)I

    move-result v1

    add-int v8, v0, v1

    .line 1910
    :cond_4
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    int-to-byte v1, v8

    aput-byte v1, v4, v0

    .line 1911
    goto :goto_3

    .line 1914
    :goto_2
    new-instance v0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid escape sequence: \'\\"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-char v2, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1919
    :cond_5
    new-instance v0, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;

    const-string v1, "Invalid escape sequence: \'\\\' at end of string."

    invoke-direct {v0, v1}, Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1923
    :cond_6
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aput-byte v7, v4, v0

    .line 1864
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1927
    :cond_7
    array-length v0, v4

    if-ne v0, v5, :cond_8

    .line 1928
    invoke-static {v4}, Lcom/google/protobuf/ByteString;->wrap([B)Lcom/google/protobuf/ByteString;

    move-result-object v0

    goto :goto_4

    .line 1929
    :cond_8
    const/4 v0, 0x0

    invoke-static {v4, v0, v5}, Lcom/google/protobuf/ByteString;->copyFrom([BII)Lcom/google/protobuf/ByteString;

    move-result-object v0

    .line 1927
    :goto_4
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_9
        0x27 -> :sswitch_8
        0x5c -> :sswitch_7
        0x61 -> :sswitch_0
        0x62 -> :sswitch_1
        0x66 -> :sswitch_2
        0x6e -> :sswitch_3
        0x72 -> :sswitch_4
        0x74 -> :sswitch_5
        0x76 -> :sswitch_6
        0x78 -> :sswitch_a
    .end sparse-switch
.end method

.method static unescapeText(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/TextFormat$InvalidEscapeSequenceException;
        }
    .end annotation

    .line 1966
    invoke-static {p0}, Lcom/google/protobuf/TextFormat;->unescapeBytes(Ljava/lang/CharSequence;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static unsignedToString(I)Ljava/lang/String;
    .locals 4

    .line 498
    if-ltz p0, :cond_0

    .line 499
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 501
    :cond_0
    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static unsignedToString(J)Ljava/lang/String;
    .locals 2

    .line 507
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    .line 508
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 512
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    and-long/2addr v0, p0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 513
    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->setBit(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    .line 512
    return-object v0
.end method
