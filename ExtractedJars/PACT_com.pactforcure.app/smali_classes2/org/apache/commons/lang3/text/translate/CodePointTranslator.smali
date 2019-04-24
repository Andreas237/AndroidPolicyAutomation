.class public abstract Lorg/apache/commons/lang3/text/translate/CodePointTranslator;
.super Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;
.source "CodePointTranslator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lorg/apache/commons/lang3/text/translate/CharSequenceTranslator;-><init>()V

    return-void
.end method


# virtual methods
.method public final translate(Ljava/lang/CharSequence;ILjava/io/Writer;)I
    .locals 3
    .param p1, "input"    # Ljava/lang/CharSequence;
    .param p2, "index"    # I
    .param p3, "out"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 37
    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 38
    .local v0, "codepoint":I
    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/lang3/text/translate/CodePointTranslator;->translate(ILjava/io/Writer;)Z

    move-result v1

    .line 39
    .local v1, "consumed":Z
    if-eqz v1, :cond_0

    .line 40
    const/4 v2, 0x1

    .line 42
    :goto_0
    return v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public abstract translate(ILjava/io/Writer;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
