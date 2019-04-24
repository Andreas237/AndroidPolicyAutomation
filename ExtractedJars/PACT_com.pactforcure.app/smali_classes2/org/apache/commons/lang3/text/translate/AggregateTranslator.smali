.class public Lorg/apache/commons/lang3/text/translate/AggregateTranslator;
.super Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
.source "AggregateTranslator.java"


# instance fields
.field private final translators:[Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;


# direct methods
.method public varargs constructor <init>([Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;)V
    .locals 1
    .param p1, "translators"    # [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .prologue
    .line 40
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;-><init>()V

    .line 41
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    iput-object v0, p0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;->translators:[Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .line 42
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
    .line 51
    iget-object v0, p0, Lorg/apache/commons/lang3/text/translate/AggregateTranslator;->translators:[Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;

    .local v0, "arr$":[Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    .line 52
    .local v4, "translator":Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    invoke-virtual {v4, p1, p2, p3}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;->translate(Ljava/lang/CharSequence;ILjava/io/Writer;)I

    move-result v1

    .line 53
    .local v1, "consumed":I
    if-eqz v1, :cond_0

    .line 57
    .end local v1    # "consumed":I
    .end local v4    # "translator":Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    :goto_1
    return v1

    .line 51
    .restart local v1    # "consumed":I
    .restart local v4    # "translator":Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    .end local v1    # "consumed":I
    .end local v4    # "translator":Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
    :cond_1
    const/4 v1, 0x0

    goto :goto_1
.end method
