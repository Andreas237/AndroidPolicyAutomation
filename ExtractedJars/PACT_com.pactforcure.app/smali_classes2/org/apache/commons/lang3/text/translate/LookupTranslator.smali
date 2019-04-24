.class public Lorg/apache/commons/lang3/text/translate/LookupTranslator;
.super Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
.source "LookupTranslator.java"


# instance fields
.field private final longest:I

.field private final lookupMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field private final shortest:I


# direct methods
.method public varargs constructor <init>([[Ljava/lang/CharSequence;)V
    .locals 11
    .param p1, "lookup"    # [[Ljava/lang/CharSequence;

    .prologue
    const/4 v10, 0x0

    .line 40
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;-><init>()V

    .line 41
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iput-object v7, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->lookupMap:Ljava/util/HashMap;

    .line 42
    const v1, 0x7fffffff

    .line 43
    .local v1, "_shortest":I
    const/4 v0, 0x0

    .line 44
    .local v0, "_longest":I
    if-eqz p1, :cond_2

    .line 45
    move-object v2, p1

    .local v2, "arr$":[[Ljava/lang/CharSequence;
    array-length v4, v2

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_2

    aget-object v5, v2, v3

    .line 46
    .local v5, "seq":[Ljava/lang/CharSequence;
    iget-object v7, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->lookupMap:Ljava/util/HashMap;

    aget-object v8, v5, v10

    const/4 v9, 0x1

    aget-object v9, v5, v9

    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    aget-object v7, v5, v10

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 48
    .local v6, "sz":I
    if-ge v6, v1, :cond_0

    .line 49
    move v1, v6

    .line 51
    :cond_0
    if-le v6, v0, :cond_1

    .line 52
    move v0, v6

    .line 45
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 56
    .end local v2    # "arr$":[[Ljava/lang/CharSequence;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v5    # "seq":[Ljava/lang/CharSequence;
    .end local v6    # "sz":I
    :cond_2
    iput v1, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->shortest:I

    .line 57
    iput v0, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->longest:I

    .line 58
    return-void
.end method


# virtual methods
.method public translate(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 6
    .param p1, "input"    # Ljava/lang/CharSequence;
    .param p2, "index"    # I
    .param p3, "out"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 65
    iget v1, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->longest:I

    .line 66
    .local v1, "max":I
    iget v4, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->longest:I

    add-int/2addr v4, p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-le v4, v5, :cond_0

    .line 67
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int v1, v4, p2

    .line 70
    :cond_0
    move v0, v1

    .local v0, "i":I
    :goto_0
    iget v4, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->shortest:I

    if-lt v0, v4, :cond_2

    .line 71
    add-int v4, p2, v0

    invoke-interface {p1, p2, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    .line 72
    .local v3, "subSeq":Ljava/lang/CharSequence;
    iget-object v4, p0, Lorg/apache/commons/lang3/text/translate/LookupTranslator;->lookupMap:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 73
    .local v2, "result":Ljava/lang/CharSequence;
    if-eqz v2, :cond_1

    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 78
    .end local v0    # "i":I
    .end local v2    # "result":Ljava/lang/CharSequence;
    .end local v3    # "subSeq":Ljava/lang/CharSequence;
    :goto_1
    return v0

    .line 70
    .restart local v0    # "i":I
    .restart local v2    # "result":Ljava/lang/CharSequence;
    .restart local v3    # "subSeq":Ljava/lang/CharSequence;
    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 78
    .end local v2    # "result":Ljava/lang/CharSequence;
    .end local v3    # "subSeq":Ljava/lang/CharSequence;
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
