.class public Lorg/jdom2/input/stax/DTDParser;
.super Ljava/lang/Object;
.source "DTDParser.java"


# static fields
.field private static final metapattern:Ljava/lang/String; = " os <!DOCTYPE ms ( name )( ms ((SYSTEM ms  id )|(PUBLIC ms  id ( ms  id )?)))?( os \\[( internal )\\])? os > os "

.field private static final pattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 220
    invoke-static {}, Lorg/jdom2/input/stax/DTDParser;->populatePatterns()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, " os <!DOCTYPE ms ( name )( ms ((SYSTEM ms  id )|(PUBLIC ms  id ( ms  id )?)))?( os \\[( internal )\\])? os > os "

    invoke-static {v0, v1}, Lorg/jdom2/input/stax/DTDParser;->buildPattern(Ljava/util/HashMap;Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/jdom2/input/stax/DTDParser;->pattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 420
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final buildPattern(Ljava/util/HashMap;Ljava/lang/String;)Ljava/util/regex/Pattern;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/regex/Pattern;"
        }
    .end annotation

    const-string v0, " (\\w+) "

    .line 194
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 195
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    .line 198
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    .line 199
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 208
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v4

    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    goto :goto_0

    .line 212
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x20

    invoke-static {p0, p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method private static formatInternal(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 320
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    const/16 v3, 0x20

    const/4 v4, 0x1

    move v5, v2

    move v6, v3

    move v7, v4

    :goto_0
    if-ge v5, v1, :cond_9

    aget-char v8, p0, v5

    if-ne v6, v3, :cond_6

    .line 323
    invoke-static {v8}, Lorg/jdom2/input/stax/DTDParser;->isWhite(C)Z

    move-result v9

    if-eqz v9, :cond_0

    if-nez v7, :cond_8

    .line 327
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v7, v4

    goto :goto_4

    :cond_0
    const/16 v9, 0x27

    if-eq v8, v9, :cond_2

    const/16 v9, 0x22

    if-ne v8, v9, :cond_1

    goto :goto_1

    :cond_1
    const/16 v9, 0x3c

    if-ne v8, v9, :cond_3

    const-string v9, "  "

    .line 337
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    :goto_1
    move v6, v8

    :cond_3
    :goto_2
    const/16 v9, 0x3e

    if-ne v8, v9, :cond_5

    if-eqz v7, :cond_4

    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    sub-int/2addr v7, v4

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    goto :goto_3

    .line 348
    :cond_4
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    const/16 v7, 0xa

    .line 351
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v7, v4

    goto :goto_4

    .line 355
    :cond_5
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v7, v2

    goto :goto_4

    :cond_6
    if-ne v8, v6, :cond_7

    move v6, v3

    .line 365
    :cond_7
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 368
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final varargs getGroup(Ljava/util/regex/Matcher;[I)Ljava/lang/String;
    .locals 3

    .line 291
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p1, v1

    .line 292
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final isWhite(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static parse(Ljava/lang/String;Lorg/jdom2/JDOMFactory;)Lorg/jdom2/DocType;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/jdom2/JDOMException;
        }
    .end annotation

    .line 390
    sget-object v0, Lorg/jdom2/input/stax/DTDParser;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 391
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p0, 0x1

    .line 396
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    .line 397
    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-static {v0, v2}, Lorg/jdom2/input/stax/DTDParser;->getGroup(Ljava/util/regex/Matcher;[I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    .line 398
    new-array v3, v3, [I

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, Lorg/jdom2/input/stax/DTDParser;->getGroup(Ljava/util/regex/Matcher;[I)Ljava/lang/String;

    move-result-object v3

    .line 399
    new-array p0, p0, [I

    const/4 v4, 0x0

    const/16 v5, 0x17

    aput v5, p0, v4

    invoke-static {v0, p0}, Lorg/jdom2/input/stax/DTDParser;->getGroup(Ljava/util/regex/Matcher;[I)Ljava/lang/String;

    move-result-object p0

    if-eqz v3, :cond_0

    .line 404
    invoke-interface {p1, v1, v3, v2}, Lorg/jdom2/JDOMFactory;->docType(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 406
    invoke-interface {p1, v1, v2}, Lorg/jdom2/JDOMFactory;->docType(Ljava/lang/String;Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    goto :goto_0

    .line 408
    :cond_1
    invoke-interface {p1, v1}, Lorg/jdom2/JDOMFactory;->docType(Ljava/lang/String;)Lorg/jdom2/DocType;

    move-result-object p1

    :goto_0
    if-eqz p0, :cond_2

    .line 412
    invoke-static {p0}, Lorg/jdom2/input/stax/DTDParser;->formatInternal(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lorg/jdom2/DocType;->setInternalSubset(Ljava/lang/String;)V

    :cond_2
    return-object p1

    .line 392
    :cond_3
    new-instance p1, Lorg/jdom2/JDOMException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Doctype input does not appear to be valid: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/jdom2/JDOMException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :array_0
    .array-data 4
        0x7
        0x9
        0x13
        0x15
    .end array-data

    :array_1
    .array-data 4
        0xd
        0xf
    .end array-data
.end method

.method private static final populatePatterns()Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 161
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "name"

    const-string v2, "[^ \\n\\r\\t\\[>]+"

    .line 166
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ms"

    const-string v2, "[ \\n\\r\\t]+"

    .line 169
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "os"

    const-string v2, "[ \\n\\r\\t]*"

    .line 170
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "id"

    const-string v2, "((\'([^\']*)\')|(\"([^\"]*)\"))"

    .line 175
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "internal"

    const-string v2, ".*"

    .line 179
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
