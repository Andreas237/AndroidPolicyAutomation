.class public Lorg/apache/commons/lang3/StringUtils;
.super Ljava/lang/Object;
.source "StringUtils.java"


# static fields
.field public static final EMPTY:Ljava/lang/String; = ""

.field public static final INDEX_NOT_FOUND:I = -0x1

.field private static final PAD_LIMIT:I = 0x2000

.field private static final WHITESPACE_BLOCK:Ljava/util/regex/Pattern;

.field private static java6Available:Z

.field private static java6NormalizeMethod:Ljava/lang/reflect/Method;

.field private static java6NormalizerFormNFD:Ljava/lang/Object;

.field private static final java6Pattern:Ljava/util/regex/Pattern;

.field private static sunAvailable:Z

.field private static sunDecomposeMethod:Ljava/lang/reflect/Method;

.field private static final sunPattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 147
    const-string v3, "\\s+"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->WHITESPACE_BLOCK:Ljava/util/regex/Pattern;

    .line 704
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z

    .line 705
    sput-object v4, Lorg/apache/commons/lang3/StringUtils;->sunDecomposeMethod:Ljava/lang/reflect/Method;

    .line 706
    const-string v3, "\\p{InCombiningDiacriticalMarks}+"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->sunPattern:Ljava/util/regex/Pattern;

    .line 708
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    .line 709
    sput-object v4, Lorg/apache/commons/lang3/StringUtils;->java6NormalizeMethod:Ljava/lang/reflect/Method;

    .line 710
    sput-object v4, Lorg/apache/commons/lang3/StringUtils;->java6NormalizerFormNFD:Ljava/lang/Object;

    .line 711
    sget-object v3, Lorg/apache/commons/lang3/StringUtils;->sunPattern:Ljava/util/regex/Pattern;

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->java6Pattern:Ljava/util/regex/Pattern;

    .line 717
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "java.text.Normalizer$Form"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 719
    .local v2, "normalizerFormClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v3, "NFD"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->java6NormalizerFormNFD:Ljava/lang/Object;

    .line 720
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "java.text.Normalizer"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 722
    .local v1, "normalizerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v3, "normalize"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/CharSequence;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->java6NormalizeMethod:Ljava/lang/reflect/Method;

    .line 724
    const/4 v3, 0x1

    sput-boolean v3, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3

    .line 737
    .end local v1    # "normalizerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const-string v4, "sun.text.Normalizer"

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 739
    .restart local v1    # "normalizerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v3, "decompose"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    const/4 v5, 0x2

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/StringUtils;->sunDecomposeMethod:Ljava/lang/reflect/Method;

    .line 741
    const/4 v3, 0x1

    sput-boolean v3, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5

    .line 747
    .end local v1    # "normalizerClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_1
    return-void

    .line 725
    :catch_0
    move-exception v0

    .line 726
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    goto :goto_0

    .line 727
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :catch_1
    move-exception v0

    .line 728
    .local v0, "e":Ljava/lang/NoSuchFieldException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    goto :goto_0

    .line 729
    .end local v0    # "e":Ljava/lang/NoSuchFieldException;
    :catch_2
    move-exception v0

    .line 730
    .local v0, "e":Ljava/lang/IllegalAccessException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    goto :goto_0

    .line 731
    .end local v0    # "e":Ljava/lang/IllegalAccessException;
    :catch_3
    move-exception v0

    .line 732
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    goto :goto_0

    .line 742
    .end local v0    # "e":Ljava/lang/NoSuchMethodException;
    :catch_4
    move-exception v0

    .line 743
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z

    goto :goto_1

    .line 744
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :catch_5
    move-exception v0

    .line 745
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    sput-boolean v7, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z

    goto :goto_1
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    return-void
.end method

.method public static abbreviate(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "maxWidth"    # I

    .prologue
    .line 5674
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lorg/apache/commons/lang3/StringUtils;->abbreviate(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static abbreviate(Ljava/lang/String;II)Ljava/lang/String;
    .locals 4
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "offset"    # I
    .param p2, "maxWidth"    # I

    .prologue
    const/4 v3, 0x4

    .line 5713
    if-nez p0, :cond_1

    .line 5714
    const/4 p0, 0x0

    .line 5738
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 5716
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-ge p2, v3, :cond_2

    .line 5717
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Minimum abbreviation width is 4"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5719
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, p2, :cond_0

    .line 5722
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le p1, v1, :cond_3

    .line 5723
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    .line 5725
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p1

    add-int/lit8 v2, p2, -0x3

    if-ge v1, v2, :cond_4

    .line 5726
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, p2, -0x3

    sub-int p1, v1, v2

    .line 5728
    :cond_4
    const-string v0, "..."

    .line 5729
    .local v0, "abrevMarker":Ljava/lang/String;
    if-gt p1, v3, :cond_5

    .line 5730
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    add-int/lit8 v3, p2, -0x3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 5732
    :cond_5
    const/4 v1, 0x7

    if-ge p2, v1, :cond_6

    .line 5733
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Minimum abbreviation width with offset is 7"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5735
    :cond_6
    add-int/lit8 v1, p2, -0x3

    add-int/2addr v1, p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 5736
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, p2, -0x3

    invoke-static {v2, v3}, Lorg/apache/commons/lang3/StringUtils;->abbreviate(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 5738
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v3, p2, -0x3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0
.end method

.method public static abbreviateMiddle(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "middle"    # Ljava/lang/String;
    .param p2, "length"    # I

    .prologue
    .line 5771
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 5788
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 5775
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge p2, v4, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2

    if-lt p2, v4, :cond_0

    .line 5779
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int v3, p2, v4

    .line 5780
    .local v3, "targetSting":I
    div-int/lit8 v4, v3, 0x2

    rem-int/lit8 v5, v3, 0x2

    add-int v2, v4, v5

    .line 5781
    .local v2, "startOffset":I
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    div-int/lit8 v5, v3, 0x2

    sub-int v1, v4, v5

    .line 5783
    .local v1, "endOffset":I
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 5784
    .local v0, "builder":Ljava/lang/StringBuilder;
    const/4 v4, 0x0

    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5785
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5786
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5788
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static capitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 5029
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .local v0, "strLen":I
    if-nez v0, :cond_1

    .line 5032
    .end local v0    # "strLen":I
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .restart local v0    # "strLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toTitleCase(C)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static center(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I

    .prologue
    .line 4823
    const/16 v0, 0x20

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->center(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static center(Ljava/lang/String;IC)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padChar"    # C

    .prologue
    .line 4851
    if-eqz p0, :cond_0

    if-gtz p1, :cond_1

    .line 4861
    :cond_0
    :goto_0
    return-object p0

    .line 4854
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 4855
    .local v1, "strLen":I
    sub-int v0, p1, v1

    .line 4856
    .local v0, "pads":I
    if-lez v0, :cond_0

    .line 4859
    div-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v1

    invoke-static {p0, v2, p2}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    .line 4860
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/StringUtils;->rightPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    .line 4861
    goto :goto_0
.end method

.method public static center(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padStr"    # Ljava/lang/String;

    .prologue
    .line 4891
    if-eqz p0, :cond_0

    if-gtz p1, :cond_1

    .line 4904
    :cond_0
    :goto_0
    return-object p0

    .line 4894
    :cond_1
    invoke-static {p2}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4895
    const-string p2, " "

    .line 4897
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 4898
    .local v1, "strLen":I
    sub-int v0, p1, v1

    .line 4899
    .local v0, "pads":I
    if-lez v0, :cond_0

    .line 4902
    div-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v1

    invoke-static {p0, v2, p2}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4903
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/StringUtils;->rightPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4904
    goto :goto_0
.end method

.method public static chomp(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/16 v7, 0xa

    const/4 v6, 0x0

    const/16 v5, 0xd

    .line 4331
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4353
    .end local p0    # "str":Ljava/lang/String;
    .local v1, "last":C
    .local v2, "lastIdx":I
    :cond_0
    :goto_0
    return-object p0

    .line 4335
    .end local v1    # "last":C
    .end local v2    # "lastIdx":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    .line 4336
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 4337
    .local v0, "ch":C
    if-eq v0, v5, :cond_2

    if-ne v0, v7, :cond_0

    .line 4338
    :cond_2
    const-string p0, ""

    goto :goto_0

    .line 4343
    .end local v0    # "ch":C
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v2, v3, -0x1

    .line 4344
    .restart local v2    # "lastIdx":I
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 4346
    .restart local v1    # "last":C
    if-ne v1, v7, :cond_5

    .line 4347
    add-int/lit8 v3, v2, -0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v5, :cond_4

    .line 4348
    add-int/lit8 v2, v2, -0x1

    .line 4353
    :cond_4
    :goto_1
    invoke-virtual {p0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4350
    :cond_5
    if-eq v1, v5, :cond_4

    .line 4351
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public static chomp(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 4383
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 4389
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4386
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4387
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static chop(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x0

    .line 4418
    if-nez p0, :cond_1

    .line 4419
    const/4 v2, 0x0

    .line 4433
    :cond_0
    :goto_0
    return-object v2

    .line 4421
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 4422
    .local v3, "strLen":I
    const/4 v4, 0x2

    if-ge v3, v4, :cond_2

    .line 4423
    const-string v2, ""

    goto :goto_0

    .line 4425
    :cond_2
    add-int/lit8 v1, v3, -0x1

    .line 4426
    .local v1, "lastIdx":I
    invoke-virtual {p0, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 4427
    .local v2, "ret":Ljava/lang/String;
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 4428
    .local v0, "last":C
    const/16 v4, 0xa

    if-ne v0, v4, :cond_0

    .line 4429
    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_0

    .line 4430
    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public static contains(Ljava/lang/CharSequence;I)Z
    .locals 2
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChar"    # I

    .prologue
    const/4 v0, 0x0

    .line 1368
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1371
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;II)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 2
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchSeq"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v0, 0x0

    .line 1397
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1400
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static containsAny(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # Ljava/lang/CharSequence;

    .prologue
    .line 1629
    if-nez p1, :cond_0

    .line 1630
    const/4 v0, 0x0

    .line 1632
    :goto_0
    return v0

    :cond_0
    invoke-static {p1}, Lorg/apache/commons/lang3/CharSequenceUtils;->toCharArray(Ljava/lang/CharSequence;)[C

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->containsAny(Ljava/lang/CharSequence;[C)Z

    move-result v0

    goto :goto_0
.end method

.method public static varargs containsAny(Ljava/lang/CharSequence;[C)Z
    .locals 11
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # [C

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 1571
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v9

    if-eqz v9, :cond_2

    :cond_0
    move v7, v8

    .line 1597
    :cond_1
    :goto_0
    return v7

    .line 1574
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 1575
    .local v2, "csLength":I
    array-length v6, p1

    .line 1576
    .local v6, "searchLength":I
    add-int/lit8 v1, v2, -0x1

    .line 1577
    .local v1, "csLast":I
    add-int/lit8 v5, v6, -0x1

    .line 1578
    .local v5, "searchLast":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v2, :cond_5

    .line 1579
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1580
    .local v0, "ch":C
    const/4 v4, 0x0

    .local v4, "j":I
    :goto_2
    if-ge v4, v6, :cond_4

    .line 1581
    aget-char v9, p1, v4

    if-ne v9, v0, :cond_3

    .line 1582
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1583
    if-eq v4, v5, :cond_1

    .line 1587
    if-ge v3, v1, :cond_3

    add-int/lit8 v9, v4, 0x1

    aget-char v9, p1, v9

    add-int/lit8 v10, v3, 0x1

    invoke-interface {p0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_1

    .line 1580
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1578
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .end local v0    # "ch":C
    .end local v4    # "j":I
    :cond_5
    move v7, v8

    .line 1597
    goto :goto_0
.end method

.method public static containsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 7
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 1428
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1438
    :cond_0
    :goto_0
    return v4

    .line 1431
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 1432
    .local v5, "len":I
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int v6, v0, v5

    .line 1433
    .local v6, "max":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    if-gt v2, v6, :cond_0

    move-object v0, p0

    move-object v3, p1

    .line 1434
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_2

    move v4, v1

    .line 1435
    goto :goto_0

    .line 1433
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public static containsNone(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "invalidChars"    # Ljava/lang/String;

    .prologue
    .line 1880
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1881
    :cond_0
    const/4 v0, 0x1

    .line 1883
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->containsNone(Ljava/lang/CharSequence;[C)Z

    move-result v0

    goto :goto_0
.end method

.method public static varargs containsNone(Ljava/lang/CharSequence;[C)Z
    .locals 11
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # [C

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 1827
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v7, v8

    .line 1853
    :cond_1
    :goto_0
    return v7

    .line 1830
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 1831
    .local v2, "csLen":I
    add-int/lit8 v1, v2, -0x1

    .line 1832
    .local v1, "csLast":I
    array-length v6, p1

    .line 1833
    .local v6, "searchLen":I
    add-int/lit8 v5, v6, -0x1

    .line 1834
    .local v5, "searchLast":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v2, :cond_5

    .line 1835
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1836
    .local v0, "ch":C
    const/4 v4, 0x0

    .local v4, "j":I
    :goto_2
    if-ge v4, v6, :cond_4

    .line 1837
    aget-char v9, p1, v4

    if-ne v9, v0, :cond_3

    .line 1838
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1839
    if-eq v4, v5, :cond_1

    .line 1843
    if-ge v3, v1, :cond_3

    add-int/lit8 v9, v4, 0x1

    aget-char v9, p1, v9

    add-int/lit8 v10, v3, 0x1

    invoke-interface {p0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_1

    .line 1836
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1834
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .end local v0    # "ch":C
    .end local v4    # "j":I
    :cond_5
    move v7, v8

    .line 1853
    goto :goto_0
.end method

.method public static containsOnly(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "validChars"    # Ljava/lang/String;

    .prologue
    .line 1795
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1796
    :cond_0
    const/4 v0, 0x0

    .line 1798
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->containsOnly(Ljava/lang/CharSequence;[C)Z

    move-result v0

    goto :goto_0
.end method

.method public static varargs containsOnly(Ljava/lang/CharSequence;[C)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "valid"    # [C

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1759
    if-eqz p1, :cond_0

    if-nez p0, :cond_2

    :cond_0
    move v0, v1

    .line 1768
    :cond_1
    :goto_0
    return v0

    .line 1762
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz v2, :cond_1

    .line 1765
    array-length v2, p1

    if-nez v2, :cond_3

    move v0, v1

    .line 1766
    goto :goto_0

    .line 1768
    :cond_3
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->indexOfAnyBut(Ljava/lang/CharSequence;[C)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    move v0, v1

    goto :goto_0
.end method

.method public static containsWhitespace(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "seq"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 1451
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1460
    :cond_0
    :goto_0
    return v2

    .line 1454
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1455
    .local v1, "strLen":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_0

    .line 1456
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1457
    const/4 v2, 0x1

    goto :goto_0

    .line 1455
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static countMatches(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 3
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "sub"    # Ljava/lang/CharSequence;

    .prologue
    .line 5139
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5140
    :cond_0
    const/4 v0, 0x0

    .line 5148
    :cond_1
    return v0

    .line 5142
    :cond_2
    const/4 v0, 0x0

    .line 5143
    .local v0, "count":I
    const/4 v1, 0x0

    .line 5144
    .local v1, "idx":I
    :goto_0
    invoke-static {p0, p1, v1}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 5145
    add-int/lit8 v0, v0, 0x1

    .line 5146
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0
.end method

.method public static defaultIfBlank(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/CharSequence;",
            ">(TT;TT;)TT;"
        }
    .end annotation

    .prologue
    .line 5562
    .local p0, "str":Ljava/lang/CharSequence;, "TT;"
    .local p1, "defaultStr":Ljava/lang/CharSequence;, "TT;"
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .end local p1    # "defaultStr":Ljava/lang/CharSequence;, "TT;"
    :goto_0
    return-object p1

    .restart local p1    # "defaultStr":Ljava/lang/CharSequence;, "TT;"
    :cond_0
    move-object p1, p0

    goto :goto_0
.end method

.method public static defaultIfEmpty(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/CharSequence;",
            ">(TT;TT;)TT;"
        }
    .end annotation

    .prologue
    .line 5583
    .local p0, "str":Ljava/lang/CharSequence;, "TT;"
    .local p1, "defaultStr":Ljava/lang/CharSequence;, "TT;"
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .end local p1    # "defaultStr":Ljava/lang/CharSequence;, "TT;"
    :goto_0
    return-object p1

    .restart local p1    # "defaultStr":Ljava/lang/CharSequence;, "TT;"
    :cond_0
    move-object p1, p0

    goto :goto_0
.end method

.method public static defaultString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 5519
    if-nez p0, :cond_0

    const-string p0, ""

    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    return-object p0
.end method

.method public static defaultString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultStr"    # Ljava/lang/String;

    .prologue
    .line 5540
    if-nez p0, :cond_0

    .end local p1    # "defaultStr":Ljava/lang/String;
    :goto_0
    return-object p1

    .restart local p1    # "defaultStr":Ljava/lang/String;
    :cond_0
    move-object p1, p0

    goto :goto_0
.end method

.method public static deleteWhitespace(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 3545
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 3559
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3548
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 3549
    .local v4, "sz":I
    new-array v0, v4, [C

    .line 3550
    .local v0, "chs":[C
    const/4 v1, 0x0

    .line 3551
    .local v1, "count":I
    const/4 v3, 0x0

    .local v3, "i":I
    move v2, v1

    .end local v1    # "count":I
    .local v2, "count":I
    :goto_1
    if-ge v3, v4, :cond_2

    .line 3552
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v5

    if-nez v5, :cond_3

    .line 3553
    add-int/lit8 v1, v2, 0x1

    .end local v2    # "count":I
    .restart local v1    # "count":I
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    aput-char v5, v0, v2

    .line 3551
    :goto_2
    add-int/lit8 v3, v3, 0x1

    move v2, v1

    .end local v1    # "count":I
    .restart local v2    # "count":I
    goto :goto_1

    .line 3556
    :cond_2
    if-eq v2, v4, :cond_0

    .line 3559
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    const/4 v5, 0x0

    invoke-direct {p0, v0, v5, v2}, Ljava/lang/String;-><init>([CII)V

    goto :goto_0

    .restart local p0    # "str":Ljava/lang/String;
    :cond_3
    move v1, v2

    .end local v2    # "count":I
    .restart local v1    # "count":I
    goto :goto_2
.end method

.method public static difference(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str1"    # Ljava/lang/String;
    .param p1, "str2"    # Ljava/lang/String;

    .prologue
    .line 5819
    if-nez p0, :cond_0

    .line 5829
    .end local p1    # "str2":Ljava/lang/String;
    :goto_0
    return-object p1

    .line 5822
    .restart local p1    # "str2":Ljava/lang/String;
    :cond_0
    if-nez p1, :cond_1

    move-object p1, p0

    .line 5823
    goto :goto_0

    .line 5825
    :cond_1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->indexOfDifference(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v0

    .line 5826
    .local v0, "at":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 5827
    const-string p1, ""

    goto :goto_0

    .line 5829
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method public static endsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "suffix"    # Ljava/lang/CharSequence;

    .prologue
    .line 6430
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->endsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    return v0
.end method

.method private static endsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    .locals 6
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "suffix"    # Ljava/lang/CharSequence;
    .param p2, "ignoreCase"    # Z

    .prologue
    const/4 v4, 0x0

    .line 6472
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    .line 6473
    :cond_0
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    const/4 v4, 0x1

    .line 6479
    :cond_1
    :goto_0
    return v4

    .line 6475
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 6478
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int v2, v0, v1

    .line 6479
    .local v2, "strOffset":I
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p0

    move v1, p2

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v4

    goto :goto_0
.end method

.method public static varargs endsWithAny(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Z
    .locals 6
    .param p0, "string"    # Ljava/lang/CharSequence;
    .param p1, "searchStrings"    # [Ljava/lang/CharSequence;

    .prologue
    const/4 v4, 0x0

    .line 6549
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 6557
    :cond_0
    :goto_0
    return v4

    .line 6552
    :cond_1
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/CharSequence;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_1
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 6553
    .local v3, "searchString":Ljava/lang/CharSequence;
    invoke-static {p0, v3}, Lorg/apache/commons/lang3/StringUtils;->endsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 6554
    const/4 v4, 0x1

    goto :goto_0

    .line 6552
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static endsWithIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "suffix"    # Ljava/lang/CharSequence;

    .prologue
    .line 6457
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->endsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    return v0
.end method

.method public static equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "cs1"    # Ljava/lang/CharSequence;
    .param p1, "cs2"    # Ljava/lang/CharSequence;

    .prologue
    .line 773
    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public static equalsIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 6
    .param p0, "str1"    # Ljava/lang/CharSequence;
    .param p1, "str2"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 798
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    .line 799
    :cond_0
    if-ne p0, p1, :cond_1

    .line 801
    :goto_0
    return v1

    :cond_1
    move v1, v2

    .line 799
    goto :goto_0

    .line 801
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    move-object v0, p0

    move-object v3, p1

    move v4, v2

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v1

    goto :goto_0
.end method

.method public static varargs getCommonPrefix([Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "strs"    # [Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 6000
    if-eqz p0, :cond_0

    array-length v1, p0

    if-nez v1, :cond_1

    .line 6001
    :cond_0
    const-string v1, ""

    .line 6015
    :goto_0
    return-object v1

    .line 6003
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->indexOfDifference([Ljava/lang/CharSequence;)I

    move-result v0

    .line 6004
    .local v0, "smallestIndexOfDiff":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 6006
    aget-object v1, p0, v2

    if-nez v1, :cond_2

    .line 6007
    const-string v1, ""

    goto :goto_0

    .line 6009
    :cond_2
    aget-object v1, p0, v2

    goto :goto_0

    .line 6010
    :cond_3
    if-nez v0, :cond_4

    .line 6012
    const-string v1, ""

    goto :goto_0

    .line 6015
    :cond_4
    aget-object v1, p0, v2

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static getLevenshteinDistance(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 13
    .param p0, "s"    # Ljava/lang/CharSequence;
    .param p1, "t"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v10, 0x0

    .line 6058
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 6059
    :cond_0
    new-instance v10, Ljava/lang/IllegalArgumentException;

    const-string v11, "Strings must not be null"

    invoke-direct {v10, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 6079
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 6080
    .local v6, "n":I
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 6082
    .local v5, "m":I
    if-nez v6, :cond_2

    move v10, v5

    .line 6131
    :goto_0
    return v10

    .line 6084
    :cond_2
    if-nez v5, :cond_3

    move v10, v6

    .line 6085
    goto :goto_0

    .line 6088
    :cond_3
    if-le v6, v5, :cond_4

    .line 6090
    move-object v9, p0

    .line 6091
    .local v9, "tmp":Ljava/lang/CharSequence;
    move-object p0, p1

    .line 6092
    move-object p1, v9

    .line 6093
    move v6, v5

    .line 6094
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 6097
    .end local v9    # "tmp":Ljava/lang/CharSequence;
    :cond_4
    add-int/lit8 v11, v6, 0x1

    new-array v7, v11, [I

    .line 6098
    .local v7, "p":[I
    add-int/lit8 v11, v6, 0x1

    new-array v2, v11, [I

    .line 6109
    .local v2, "d":[I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-gt v3, v6, :cond_5

    .line 6110
    aput v3, v7, v3

    .line 6109
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 6113
    :cond_5
    const/4 v4, 0x1

    .local v4, "j":I
    :goto_2
    if-gt v4, v5, :cond_8

    .line 6114
    add-int/lit8 v11, v4, -0x1

    invoke-interface {p1, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    .line 6115
    .local v8, "t_j":C
    aput v4, v2, v10

    .line 6117
    const/4 v3, 0x1

    :goto_3
    if-gt v3, v6, :cond_7

    .line 6118
    add-int/lit8 v11, v3, -0x1

    invoke-interface {p0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v11, v8, :cond_6

    move v1, v10

    .line 6120
    .local v1, "cost":I
    :goto_4
    add-int/lit8 v11, v3, -0x1

    aget v11, v2, v11

    add-int/lit8 v11, v11, 0x1

    aget v12, v7, v3

    add-int/lit8 v12, v12, 0x1

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    add-int/lit8 v12, v3, -0x1

    aget v12, v7, v12

    add-int/2addr v12, v1

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    aput v11, v2, v3

    .line 6117
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 6118
    .end local v1    # "cost":I
    :cond_6
    const/4 v1, 0x1

    goto :goto_4

    .line 6124
    :cond_7
    move-object v0, v7

    .line 6125
    .local v0, "_d":[I
    move-object v7, v2

    .line 6126
    move-object v2, v0

    .line 6113
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 6131
    .end local v0    # "_d":[I
    .end local v8    # "t_j":C
    :cond_8
    aget v10, v7, v6

    goto :goto_0
.end method

.method public static getLevenshteinDistance(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 15
    .param p0, "s"    # Ljava/lang/CharSequence;
    .param p1, "t"    # Ljava/lang/CharSequence;
    .param p2, "threshold"    # I

    .prologue
    .line 6167
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 6168
    :cond_0
    new-instance v13, Ljava/lang/IllegalArgumentException;

    const-string v14, "Strings must not be null"

    invoke-direct {v13, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 6170
    :cond_1
    if-gez p2, :cond_2

    .line 6171
    new-instance v13, Ljava/lang/IllegalArgumentException;

    const-string v14, "Threshold must not be negative"

    invoke-direct {v13, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 6218
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v9

    .line 6219
    .local v9, "n":I
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 6222
    .local v6, "m":I
    if-nez v9, :cond_4

    .line 6223
    move/from16 v0, p2

    if-gt v6, v0, :cond_3

    move v13, v6

    .line 6292
    :goto_0
    return v13

    .line 6223
    :cond_3
    const/4 v13, -0x1

    goto :goto_0

    .line 6224
    :cond_4
    if-nez v6, :cond_6

    .line 6225
    move/from16 v0, p2

    if-gt v9, v0, :cond_5

    move v13, v9

    goto :goto_0

    :cond_5
    const/4 v13, -0x1

    goto :goto_0

    .line 6228
    :cond_6
    if-le v9, v6, :cond_7

    .line 6230
    move-object v12, p0

    .line 6231
    .local v12, "tmp":Ljava/lang/CharSequence;
    move-object/from16 p0, p1

    .line 6232
    move-object/from16 p1, v12

    .line 6233
    move v9, v6

    .line 6234
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 6237
    .end local v12    # "tmp":Ljava/lang/CharSequence;
    :cond_7
    add-int/lit8 v13, v9, 0x1

    new-array v10, v13, [I

    .line 6238
    .local v10, "p":[I
    add-int/lit8 v13, v9, 0x1

    new-array v3, v13, [I

    .line 6242
    .local v3, "d":[I
    move/from16 v0, p2

    invoke-static {v9, v0}, Ljava/lang/Math;->min(II)I

    move-result v13

    add-int/lit8 v2, v13, 0x1

    .line 6243
    .local v2, "boundary":I
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    if-ge v4, v2, :cond_8

    .line 6244
    aput v4, v10, v4

    .line 6243
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 6248
    :cond_8
    array-length v13, v10

    const v14, 0x7fffffff

    invoke-static {v10, v2, v13, v14}, Ljava/util/Arrays;->fill([IIII)V

    .line 6249
    const v13, 0x7fffffff

    invoke-static {v3, v13}, Ljava/util/Arrays;->fill([II)V

    .line 6252
    const/4 v5, 0x1

    .local v5, "j":I
    :goto_2
    if-gt v5, v6, :cond_d

    .line 6253
    add-int/lit8 v13, v5, -0x1

    move-object/from16 v0, p1

    invoke-interface {v0, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    .line 6254
    .local v11, "t_j":C
    const/4 v13, 0x0

    aput v5, v3, v13

    .line 6257
    const/4 v13, 0x1

    sub-int v14, v5, p2

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 6258
    .local v8, "min":I
    add-int v13, v5, p2

    invoke-static {v9, v13}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 6261
    .local v7, "max":I
    if-le v8, v7, :cond_9

    .line 6262
    const/4 v13, -0x1

    goto :goto_0

    .line 6266
    :cond_9
    const/4 v13, 0x1

    if-le v8, v13, :cond_a

    .line 6267
    add-int/lit8 v13, v8, -0x1

    const v14, 0x7fffffff

    aput v14, v3, v13

    .line 6271
    :cond_a
    move v4, v8

    :goto_3
    if-gt v4, v7, :cond_c

    .line 6272
    add-int/lit8 v13, v4, -0x1

    invoke-interface {p0, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ne v13, v11, :cond_b

    .line 6274
    add-int/lit8 v13, v4, -0x1

    aget v13, v10, v13

    aput v13, v3, v4

    .line 6271
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 6277
    :cond_b
    add-int/lit8 v13, v4, -0x1

    aget v13, v3, v13

    aget v14, v10, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    add-int/lit8 v14, v4, -0x1

    aget v14, v10, v14

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    add-int/lit8 v13, v13, 0x1

    aput v13, v3, v4

    goto :goto_4

    .line 6282
    :cond_c
    move-object v1, v10

    .line 6283
    .local v1, "_d":[I
    move-object v10, v3

    .line 6284
    move-object v3, v1

    .line 6252
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 6289
    .end local v1    # "_d":[I
    .end local v7    # "max":I
    .end local v8    # "min":I
    .end local v11    # "t_j":C
    :cond_d
    aget v13, v10, v9

    move/from16 v0, p2

    if-gt v13, v0, :cond_e

    .line 6290
    aget v13, v10, v9

    goto/16 :goto_0

    .line 6292
    :cond_e
    const/4 v13, -0x1

    goto/16 :goto_0
.end method

.method public static indexOf(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChar"    # I

    .prologue
    .line 828
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 829
    const/4 v0, -0x1

    .line 831
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;II)I

    move-result v0

    goto :goto_0
.end method

.method public static indexOf(Ljava/lang/CharSequence;II)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChar"    # I
    .param p2, "startPos"    # I

    .prologue
    .line 861
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 862
    const/4 v0, -0x1

    .line 864
    :goto_0
    return v0

    :cond_0
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;II)I

    move-result v0

    goto :goto_0
.end method

.method public static indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchSeq"    # Ljava/lang/CharSequence;

    .prologue
    .line 892
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 893
    :cond_0
    const/4 v0, -0x1

    .line 895
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    goto :goto_0
.end method

.method public static indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchSeq"    # Ljava/lang/CharSequence;
    .param p2, "startPos"    # I

    .prologue
    .line 932
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 933
    :cond_0
    const/4 v0, -0x1

    .line 935
    :goto_0
    return v0

    :cond_1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    goto :goto_0
.end method

.method public static indexOfAny(Ljava/lang/CharSequence;Ljava/lang/String;)I
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # Ljava/lang/String;

    .prologue
    .line 1538
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1539
    :cond_0
    const/4 v0, -0x1

    .line 1541
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->indexOfAny(Ljava/lang/CharSequence;[C)I

    move-result v0

    goto :goto_0
.end method

.method public static varargs indexOfAny(Ljava/lang/CharSequence;[C)I
    .locals 10
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # [C

    .prologue
    const/4 v7, -0x1

    .line 1489
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v8

    if-eqz v8, :cond_2

    :cond_0
    move v3, v7

    .line 1511
    :cond_1
    :goto_0
    return v3

    .line 1492
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 1493
    .local v2, "csLen":I
    add-int/lit8 v1, v2, -0x1

    .line 1494
    .local v1, "csLast":I
    array-length v6, p1

    .line 1495
    .local v6, "searchLen":I
    add-int/lit8 v5, v6, -0x1

    .line 1496
    .local v5, "searchLast":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v2, :cond_5

    .line 1497
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1498
    .local v0, "ch":C
    const/4 v4, 0x0

    .local v4, "j":I
    :goto_2
    if-ge v4, v6, :cond_4

    .line 1499
    aget-char v8, p1, v4

    if-ne v8, v0, :cond_3

    .line 1500
    if-ge v3, v1, :cond_1

    if-ge v4, v5, :cond_1

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 1502
    add-int/lit8 v8, v4, 0x1

    aget-char v8, p1, v8

    add-int/lit8 v9, v3, 0x1

    invoke-interface {p0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-eq v8, v9, :cond_1

    .line 1498
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1496
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .end local v0    # "ch":C
    .end local v4    # "j":I
    :cond_5
    move v3, v7

    .line 1511
    goto :goto_0
.end method

.method public static varargs indexOfAny(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)I
    .locals 7
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStrs"    # [Ljava/lang/CharSequence;

    .prologue
    const/4 v5, -0x1

    .line 1916
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v1, v5

    .line 1940
    :cond_1
    :goto_0
    return v1

    .line 1919
    :cond_2
    array-length v3, p1

    .line 1922
    .local v3, "sz":I
    const v1, 0x7fffffff

    .line 1924
    .local v1, "ret":I
    const/4 v4, 0x0

    .line 1925
    .local v4, "tmp":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v3, :cond_5

    .line 1926
    aget-object v2, p1, v0

    .line 1927
    .local v2, "search":Ljava/lang/CharSequence;
    if-nez v2, :cond_4

    .line 1925
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1930
    :cond_4
    const/4 v6, 0x0

    invoke-static {p0, v2, v6}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v4

    .line 1931
    if-eq v4, v5, :cond_3

    .line 1935
    if-ge v4, v1, :cond_3

    .line 1936
    move v1, v4

    goto :goto_2

    .line 1940
    .end local v2    # "search":Ljava/lang/CharSequence;
    :cond_5
    const v6, 0x7fffffff

    if-ne v1, v6, :cond_1

    move v1, v5

    goto :goto_0
.end method

.method public static indexOfAnyBut(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 8
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v5, -0x1

    const/4 v6, 0x0

    .line 1712
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_0
    move v3, v5

    .line 1730
    :cond_1
    :goto_0
    return v3

    .line 1715
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 1716
    .local v4, "strLen":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v4, :cond_6

    .line 1717
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1718
    .local v0, "ch":C
    invoke-static {p1, v0, v6}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;II)I

    move-result v7

    if-ltz v7, :cond_4

    const/4 v2, 0x1

    .line 1719
    .local v2, "chFound":Z
    :goto_2
    add-int/lit8 v7, v3, 0x1

    if-ge v7, v4, :cond_5

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1720
    add-int/lit8 v7, v3, 0x1

    invoke-interface {p0, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 1721
    .local v1, "ch2":C
    if-eqz v2, :cond_3

    invoke-static {p1, v1, v6}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;II)I

    move-result v7

    if-ltz v7, :cond_1

    .line 1716
    .end local v1    # "ch2":C
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .end local v2    # "chFound":Z
    :cond_4
    move v2, v6

    .line 1718
    goto :goto_2

    .line 1725
    .restart local v2    # "chFound":Z
    :cond_5
    if-nez v2, :cond_3

    goto :goto_0

    .end local v0    # "ch":C
    .end local v2    # "chFound":Z
    :cond_6
    move v3, v5

    .line 1730
    goto :goto_0
.end method

.method public static varargs indexOfAnyBut(Ljava/lang/CharSequence;[C)I
    .locals 10
    .param p0, "cs"    # Ljava/lang/CharSequence;
    .param p1, "searchChars"    # [C

    .prologue
    const/4 v7, -0x1

    .line 1662
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v8

    if-eqz v8, :cond_2

    :cond_0
    move v3, v7

    .line 1685
    :cond_1
    :goto_0
    return v3

    .line 1665
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 1666
    .local v2, "csLen":I
    add-int/lit8 v1, v2, -0x1

    .line 1667
    .local v1, "csLast":I
    array-length v6, p1

    .line 1668
    .local v6, "searchLen":I
    add-int/lit8 v5, v6, -0x1

    .line 1670
    .local v5, "searchLast":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, v2, :cond_5

    .line 1671
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 1672
    .local v0, "ch":C
    const/4 v4, 0x0

    .local v4, "j":I
    :goto_2
    if-ge v4, v6, :cond_1

    .line 1673
    aget-char v8, p1, v4

    if-ne v8, v0, :cond_4

    .line 1674
    if-ge v3, v1, :cond_3

    if-ge v4, v5, :cond_3

    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 1675
    add-int/lit8 v8, v4, 0x1

    aget-char v8, p1, v8

    add-int/lit8 v9, v3, 0x1

    invoke-interface {p0, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ne v8, v9, :cond_4

    .line 1670
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1672
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .end local v0    # "ch":C
    .end local v4    # "j":I
    :cond_5
    move v3, v7

    .line 1685
    goto :goto_0
.end method

.method public static indexOfDifference(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 4
    .param p0, "cs1"    # Ljava/lang/CharSequence;
    .param p1, "cs2"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v1, -0x1

    .line 5858
    if-ne p0, p1, :cond_1

    move v0, v1

    .line 5873
    :cond_0
    :goto_0
    return v0

    .line 5861
    :cond_1
    if-eqz p0, :cond_2

    if-nez p1, :cond_3

    .line 5862
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 5865
    :cond_3
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 5866
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_5

    .line 5870
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    move v0, v1

    .line 5873
    goto :goto_0

    .line 5865
    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static varargs indexOfDifference([Ljava/lang/CharSequence;)I
    .locals 14
    .param p0, "css"    # [Ljava/lang/CharSequence;

    .prologue
    const/4 v10, 0x0

    const/4 v11, -0x1

    .line 5909
    if-eqz p0, :cond_0

    array-length v12, p0

    const/4 v13, 0x1

    if-gt v12, v13, :cond_2

    :cond_0
    move v8, v11

    .line 5963
    :cond_1
    :goto_0
    return v8

    .line 5912
    :cond_2
    const/4 v1, 0x0

    .line 5913
    .local v1, "anyStringNull":Z
    const/4 v0, 0x1

    .line 5914
    .local v0, "allStringsNull":Z
    array-length v2, p0

    .line 5915
    .local v2, "arrayLen":I
    const v8, 0x7fffffff

    .line 5916
    .local v8, "shortestStrLen":I
    const/4 v7, 0x0

    .line 5921
    .local v7, "longestStrLen":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_1
    if-ge v6, v2, :cond_4

    .line 5922
    aget-object v12, p0, v6

    if-nez v12, :cond_3

    .line 5923
    const/4 v1, 0x1

    .line 5924
    const/4 v8, 0x0

    .line 5921
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 5926
    :cond_3
    const/4 v0, 0x0

    .line 5927
    aget-object v12, p0, v6

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    invoke-static {v12, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 5928
    aget-object v12, p0, v6

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_2

    .line 5933
    :cond_4
    if-nez v0, :cond_5

    if-nez v7, :cond_6

    if-nez v1, :cond_6

    :cond_5
    move v8, v11

    .line 5934
    goto :goto_0

    .line 5938
    :cond_6
    if-nez v8, :cond_7

    move v8, v10

    .line 5939
    goto :goto_0

    .line 5943
    :cond_7
    const/4 v5, -0x1

    .line 5944
    .local v5, "firstDiff":I
    const/4 v9, 0x0

    .local v9, "stringPos":I
    :goto_3
    if-ge v9, v8, :cond_9

    .line 5945
    aget-object v12, p0, v10

    invoke-interface {v12, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 5946
    .local v4, "comparisonChar":C
    const/4 v3, 0x1

    .local v3, "arrayPos":I
    :goto_4
    if-ge v3, v2, :cond_8

    .line 5947
    aget-object v12, p0, v3

    invoke-interface {v12, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v4, :cond_b

    .line 5948
    move v5, v9

    .line 5952
    :cond_8
    if-eq v5, v11, :cond_c

    .line 5957
    .end local v3    # "arrayPos":I
    .end local v4    # "comparisonChar":C
    :cond_9
    if-ne v5, v11, :cond_a

    if-ne v8, v7, :cond_1

    :cond_a
    move v8, v5

    .line 5963
    goto :goto_0

    .line 5946
    .restart local v3    # "arrayPos":I
    .restart local v4    # "comparisonChar":C
    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 5944
    :cond_c
    add-int/lit8 v9, v9, 0x1

    goto :goto_3
.end method

.method public static indexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;

    .prologue
    .line 1039
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->indexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    return v0
.end method

.method public static indexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 8
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;
    .param p2, "startPos"    # I

    .prologue
    const/4 v7, -0x1

    .line 1075
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v2, v7

    .line 1093
    :cond_1
    :goto_0
    return v2

    .line 1078
    :cond_2
    if-gez p2, :cond_3

    .line 1079
    const/4 p2, 0x0

    .line 1081
    :cond_3
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v6, v0, 0x1

    .line 1082
    .local v6, "endLimit":I
    if-le p2, v6, :cond_4

    move v2, v7

    .line 1083
    goto :goto_0

    .line 1085
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    move v2, p2

    .line 1086
    goto :goto_0

    .line 1088
    :cond_5
    move v2, p2

    .local v2, "i":I
    :goto_1
    if-ge v2, v6, :cond_6

    .line 1089
    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1088
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    move v2, v7

    .line 1093
    goto :goto_0
.end method

.method public static isAllLowerCase(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5456
    if-eqz p0, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5465
    :cond_0
    :goto_0
    return v2

    .line 5459
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5460
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5461
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5460
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5465
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAllUpperCase(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5488
    if-eqz p0, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5497
    :cond_0
    :goto_0
    return v2

    .line 5491
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5492
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5493
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5492
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5497
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAlpha(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5174
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 5183
    :cond_0
    :goto_0
    return v2

    .line 5177
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5178
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5179
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5178
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5183
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAlphaSpace(Ljava/lang/CharSequence;)Z
    .locals 5
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5209
    if-nez p0, :cond_1

    .line 5218
    :cond_0
    :goto_0
    return v2

    .line 5212
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5213
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_3

    .line 5214
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_0

    .line 5213
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5218
    :cond_3
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAlphanumeric(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5244
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 5253
    :cond_0
    :goto_0
    return v2

    .line 5247
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5248
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5249
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5248
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5253
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAlphanumericSpace(Ljava/lang/CharSequence;)Z
    .locals 5
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5279
    if-nez p0, :cond_1

    .line 5288
    :cond_0
    :goto_0
    return v2

    .line 5282
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5283
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_3

    .line 5284
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_0

    .line 5283
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5288
    :cond_3
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isAsciiPrintable(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5318
    if-nez p0, :cond_1

    .line 5327
    :cond_0
    :goto_0
    return v2

    .line 5321
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5322
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5323
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lorg/apache/commons/lang3/CharUtils;->isAsciiPrintable(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5322
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5327
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isBlank(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x1

    .line 223
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .local v1, "strLen":I
    if-nez v1, :cond_1

    .line 231
    .end local v1    # "strLen":I
    :cond_0
    :goto_0
    return v2

    .line 226
    .restart local v1    # "strLen":I
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_0

    .line 227
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-nez v3, :cond_2

    .line 228
    const/4 v2, 0x0

    goto :goto_0

    .line 226
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static isEmpty(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    .line 183
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isNotBlank(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    .line 252
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isNotEmpty(Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    .line 202
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isNumeric(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5354
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    .line 5363
    :cond_0
    :goto_0
    return v2

    .line 5357
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5358
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5359
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5358
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5363
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isNumericSpace(Ljava/lang/CharSequence;)Z
    .locals 5
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5391
    if-nez p0, :cond_1

    .line 5400
    :cond_0
    :goto_0
    return v2

    .line 5394
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5395
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_3

    .line 5396
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_0

    .line 5395
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5400
    :cond_3
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static isWhitespace(Ljava/lang/CharSequence;)Z
    .locals 4
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    const/4 v2, 0x0

    .line 5424
    if-nez p0, :cond_1

    .line 5433
    :cond_0
    :goto_0
    return v2

    .line 5427
    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 5428
    .local v1, "sz":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v1, :cond_2

    .line 5429
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5428
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 5433
    :cond_2
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public static join(Ljava/lang/Iterable;C)Ljava/lang/String;
    .locals 1
    .param p1, "separator"    # C
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<*>;C)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 3501
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    if-nez p0, :cond_0

    .line 3502
    const/4 v0, 0x0

    .line 3504
    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/commons/lang3/StringUtils;->join(Ljava/util/Iterator;C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static join(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "separator"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 3522
    .local p0, "iterable":Ljava/lang/Iterable;, "Ljava/lang/Iterable<*>;"
    if-nez p0, :cond_0

    .line 3523
    const/4 v0, 0x0

    .line 3525
    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, p1}, Lorg/apache/commons/lang3/StringUtils;->join(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static join(Ljava/util/Iterator;C)Ljava/lang/String;
    .locals 4
    .param p1, "separator"    # C
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<*>;C)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 3413
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    if-nez p0, :cond_0

    .line 3414
    const/4 v3, 0x0

    .line 3438
    :goto_0
    return-object v3

    .line 3416
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 3417
    const-string v3, ""

    goto :goto_0

    .line 3419
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 3420
    .local v1, "first":Ljava/lang/Object;
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 3421
    invoke-static {v1}, Lorg/apache/commons/lang3/ObjectUtils;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 3425
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x100

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3426
    .local v0, "buf":Ljava/lang/StringBuilder;
    if-eqz v1, :cond_3

    .line 3427
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3430
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 3431
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3432
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 3433
    .local v2, "obj":Ljava/lang/Object;
    if-eqz v2, :cond_3

    .line 3434
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 3438
    .end local v2    # "obj":Ljava/lang/Object;
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public static join(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "separator"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 3457
    .local p0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
    if-nez p0, :cond_0

    .line 3458
    const/4 v3, 0x0

    .line 3483
    :goto_0
    return-object v3

    .line 3460
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 3461
    const-string v3, ""

    goto :goto_0

    .line 3463
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 3464
    .local v1, "first":Ljava/lang/Object;
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 3465
    invoke-static {v1}, Lorg/apache/commons/lang3/ObjectUtils;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 3469
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x100

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3470
    .local v0, "buf":Ljava/lang/StringBuilder;
    if-eqz v1, :cond_3

    .line 3471
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3474
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 3475
    if-eqz p1, :cond_4

    .line 3476
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3478
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 3479
    .local v2, "obj":Ljava/lang/Object;
    if-eqz v2, :cond_3

    .line 3480
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 3483
    .end local v2    # "obj":Ljava/lang/Object;
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public static varargs join([Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 3230
    .local p0, "elements":[Ljava/lang/Object;, "[TT;"
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->join([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static join([Ljava/lang/Object;C)Ljava/lang/String;
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "separator"    # C

    .prologue
    .line 3256
    if-nez p0, :cond_0

    .line 3257
    const/4 v0, 0x0

    .line 3260
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->join([Ljava/lang/Object;CII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static join([Ljava/lang/Object;CII)Ljava/lang/String;
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "separator"    # C
    .param p2, "startIndex"    # I
    .param p3, "endIndex"    # I

    .prologue
    .line 3290
    if-nez p0, :cond_0

    .line 3291
    const/4 v3, 0x0

    .line 3308
    :goto_0
    return-object v3

    .line 3293
    :cond_0
    sub-int v2, p3, p2

    .line 3294
    .local v2, "noOfItems":I
    if-gtz v2, :cond_1

    .line 3295
    const-string v3, ""

    goto :goto_0

    .line 3298
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    mul-int/lit8 v3, v2, 0x10

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3300
    .local v0, "buf":Ljava/lang/StringBuilder;
    move v1, p2

    .local v1, "i":I
    :goto_1
    if-ge v1, p3, :cond_4

    .line 3301
    if-le v1, p2, :cond_2

    .line 3302
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3304
    :cond_2
    aget-object v3, p0, v1

    if-eqz v3, :cond_3

    .line 3305
    aget-object v3, p0, v1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3300
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 3308
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public static join([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 3335
    if-nez p0, :cond_0

    .line 3336
    const/4 v0, 0x0

    .line 3338
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->join([Ljava/lang/Object;Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static join([Ljava/lang/Object;Ljava/lang/String;II)Ljava/lang/String;
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "separator"    # Ljava/lang/String;
    .param p2, "startIndex"    # I
    .param p3, "endIndex"    # I

    .prologue
    .line 3369
    if-nez p0, :cond_0

    .line 3370
    const/4 v3, 0x0

    .line 3393
    :goto_0
    return-object v3

    .line 3372
    :cond_0
    if-nez p1, :cond_1

    .line 3373
    const-string p1, ""

    .line 3378
    :cond_1
    sub-int v2, p3, p2

    .line 3379
    .local v2, "noOfItems":I
    if-gtz v2, :cond_2

    .line 3380
    const-string v3, ""

    goto :goto_0

    .line 3383
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    mul-int/lit8 v3, v2, 0x10

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3385
    .local v0, "buf":Ljava/lang/StringBuilder;
    move v1, p2

    .local v1, "i":I
    :goto_1
    if-ge v1, p3, :cond_5

    .line 3386
    if-le v1, p2, :cond_3

    .line 3387
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3389
    :cond_3
    aget-object v3, p0, v1

    if-eqz v3, :cond_4

    .line 3390
    aget-object v3, p0, v1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3385
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 3393
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method

.method public static lastIndexOf(Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChar"    # I

    .prologue
    .line 1119
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1120
    const/4 v0, -0x1

    .line 1122
    :goto_0
    return v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;II)I

    move-result v0

    goto :goto_0
.end method

.method public static lastIndexOf(Ljava/lang/CharSequence;II)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchChar"    # I
    .param p2, "startPos"    # I

    .prologue
    .line 1154
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1155
    const/4 v0, -0x1

    .line 1157
    :goto_0
    return v0

    :cond_0
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;II)I

    move-result v0

    goto :goto_0
.end method

.method public static lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchSeq"    # Ljava/lang/CharSequence;

    .prologue
    .line 1184
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1185
    :cond_0
    const/4 v0, -0x1

    .line 1187
    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    goto :goto_0
.end method

.method public static lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "searchSeq"    # Ljava/lang/CharSequence;
    .param p2, "startPos"    # I

    .prologue
    .line 1258
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1259
    :cond_0
    const/4 v0, -0x1

    .line 1261
    :goto_0
    return v0

    :cond_1
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    goto :goto_0
.end method

.method public static varargs lastIndexOfAny(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)I
    .locals 6
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStrs"    # [Ljava/lang/CharSequence;

    .prologue
    .line 1970
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    .line 1971
    :cond_0
    const/4 v1, -0x1

    .line 1986
    :cond_1
    return v1

    .line 1973
    :cond_2
    array-length v3, p1

    .line 1974
    .local v3, "sz":I
    const/4 v1, -0x1

    .line 1975
    .local v1, "ret":I
    const/4 v4, 0x0

    .line 1976
    .local v4, "tmp":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v3, :cond_1

    .line 1977
    aget-object v2, p1, v0

    .line 1978
    .local v2, "search":Ljava/lang/CharSequence;
    if-nez v2, :cond_4

    .line 1976
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1981
    :cond_4
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-static {p0, v2, v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v4

    .line 1982
    if-le v4, v1, :cond_3

    .line 1983
    move v1, v4

    goto :goto_1
.end method

.method public static lastIndexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;

    .prologue
    .line 1288
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 1289
    :cond_0
    const/4 v0, -0x1

    .line 1291
    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->lastIndexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v0

    goto :goto_0
.end method

.method public static lastIndexOfIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 7
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;
    .param p2, "startPos"    # I

    .prologue
    const/4 v6, -0x1

    .line 1324
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v2, v6

    .line 1342
    :cond_1
    :goto_0
    return v2

    .line 1327
    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-le p2, v0, :cond_3

    .line 1328
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int p2, v0, v1

    .line 1330
    :cond_3
    if-gez p2, :cond_4

    move v2, v6

    .line 1331
    goto :goto_0

    .line 1333
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    move v2, p2

    .line 1334
    goto :goto_0

    .line 1337
    :cond_5
    move v2, p2

    .local v2, "i":I
    :goto_1
    if-ltz v2, :cond_6

    .line 1338
    const/4 v1, 0x1

    const/4 v4, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1337
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_6
    move v2, v6

    .line 1342
    goto :goto_0
.end method

.method public static lastOrdinalIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;
    .param p2, "ordinal"    # I

    .prologue
    .line 1225
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->ordinalIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)I

    move-result v0

    return v0
.end method

.method public static left(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "len"    # I

    .prologue
    .line 2126
    if-nez p0, :cond_1

    .line 2127
    const/4 p0, 0x0

    .line 2135
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 2129
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-gez p1, :cond_2

    .line 2130
    const-string p0, ""

    goto :goto_0

    .line 2132
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 2135
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static leftPad(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I

    .prologue
    .line 4690
    const/16 v0, 0x20

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static leftPad(Ljava/lang/String;IC)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padChar"    # C

    .prologue
    .line 4715
    if-nez p0, :cond_1

    .line 4716
    const/4 p0, 0x0

    .line 4725
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4718
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v0, p1, v1

    .line 4719
    .local v0, "pads":I
    if-lez v0, :cond_0

    .line 4722
    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    .line 4723
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4725
    :cond_2
    invoke-static {p2, v0}, Lorg/apache/commons/lang3/StringUtils;->repeat(CI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static leftPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padStr"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 4752
    if-nez p0, :cond_1

    .line 4753
    const/4 p0, 0x0

    .line 4778
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4755
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-static {p2}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 4756
    const-string p2, " "

    .line 4758
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    .line 4759
    .local v2, "padLen":I
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 4760
    .local v5, "strLen":I
    sub-int v4, p1, v5

    .line 4761
    .local v4, "pads":I
    if-lez v4, :cond_0

    .line 4764
    const/4 v6, 0x1

    if-ne v2, v6, :cond_3

    const/16 v6, 0x2000

    if-gt v4, v6, :cond_3

    .line 4765
    invoke-virtual {p2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {p0, p1, v6}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4768
    :cond_3
    if-ne v4, v2, :cond_4

    .line 4769
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4770
    :cond_4
    if-ge v4, v2, :cond_5

    .line 4771
    invoke-virtual {p2, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4773
    :cond_5
    new-array v3, v4, [C

    .line 4774
    .local v3, "padding":[C
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 4775
    .local v1, "padChars":[C
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v4, :cond_6

    .line 4776
    rem-int v6, v0, v2

    aget-char v6, v1, v6

    aput-char v6, v3, v0

    .line 4775
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4778
    :cond_6
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static length(Ljava/lang/CharSequence;)I
    .locals 1
    .param p0, "cs"    # Ljava/lang/CharSequence;

    .prologue
    .line 4794
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0
.end method

.method public static lowerCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 4978
    if-nez p0, :cond_0

    .line 4979
    const/4 v0, 0x0

    .line 4981
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static lowerCase(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 5001
    if-nez p0, :cond_0

    .line 5002
    const/4 v0, 0x0

    .line 5004
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static mid(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "pos"    # I
    .param p2, "len"    # I

    .prologue
    .line 2197
    if-nez p0, :cond_0

    .line 2198
    const/4 v0, 0x0

    .line 2209
    :goto_0
    return-object v0

    .line 2200
    :cond_0
    if-ltz p2, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p1, v0, :cond_2

    .line 2201
    :cond_1
    const-string v0, ""

    goto :goto_0

    .line 2203
    :cond_2
    if-gez p1, :cond_3

    .line 2204
    const/4 p1, 0x0

    .line 2206
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int v1, p1, p2

    if-gt v0, v1, :cond_4

    .line 2207
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2209
    :cond_4
    add-int v0, p1, p2

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static normalizeSpace(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 6524
    if-nez p0, :cond_0

    .line 6525
    const/4 v0, 0x0

    .line 6527
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lorg/apache/commons/lang3/StringUtils;->WHITESPACE_BLOCK:Ljava/util/regex/Pattern;

    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->trim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static ordinalIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;
    .param p2, "ordinal"    # I

    .prologue
    .line 973
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->ordinalIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)I

    move-result v0

    return v0
.end method

.method private static ordinalIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)I
    .locals 3
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "searchStr"    # Ljava/lang/CharSequence;
    .param p2, "ordinal"    # I
    .param p3, "lastIndex"    # Z

    .prologue
    const/4 v1, -0x1

    .line 991
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-gtz p2, :cond_1

    .line 1010
    :cond_0
    :goto_0
    return v1

    .line 994
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_3

    .line 995
    if-eqz p3, :cond_2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_1
    move v1, v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    .line 997
    :cond_3
    const/4 v0, 0x0

    .line 998
    .local v0, "found":I
    if-eqz p3, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1000
    .local v1, "index":I
    :cond_4
    if-eqz p3, :cond_5

    .line 1001
    add-int/lit8 v2, v1, -0x1

    invoke-static {p0, p1, v2}, Lorg/apache/commons/lang3/CharSequenceUtils;->lastIndexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    .line 1005
    :goto_2
    if-ltz v1, :cond_0

    .line 1008
    add-int/lit8 v0, v0, 0x1

    .line 1009
    if-lt v0, p2, :cond_4

    goto :goto_0

    .line 1003
    :cond_5
    add-int/lit8 v2, v1, 0x1

    invoke-static {p0, p1, v2}, Lorg/apache/commons/lang3/CharSequenceUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v1

    goto :goto_2
.end method

.method public static overlay(Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;
    .locals 5
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "overlay"    # Ljava/lang/String;
    .param p2, "start"    # I
    .param p3, "end"    # I

    .prologue
    .line 4272
    if-nez p0, :cond_0

    .line 4273
    const/4 v2, 0x0

    .line 4296
    :goto_0
    return-object v2

    .line 4275
    :cond_0
    if-nez p1, :cond_1

    .line 4276
    const-string p1, ""

    .line 4278
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .line 4279
    .local v0, "len":I
    if-gez p2, :cond_2

    .line 4280
    const/4 p2, 0x0

    .line 4282
    :cond_2
    if-le p2, v0, :cond_3

    .line 4283
    move p2, v0

    .line 4285
    :cond_3
    if-gez p3, :cond_4

    .line 4286
    const/4 p3, 0x0

    .line 4288
    :cond_4
    if-le p3, v0, :cond_5

    .line 4289
    move p3, v0

    .line 4291
    :cond_5
    if-le p2, p3, :cond_6

    .line 4292
    move v1, p2

    .line 4293
    .local v1, "temp":I
    move p2, p3

    .line 4294
    move p3, v1

    .line 4296
    .end local v1    # "temp":I
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    add-int v3, v0, p2

    sub-int/2addr v3, p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    invoke-virtual {p0, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public static remove(Ljava/lang/String;C)Ljava/lang/String;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # C

    .prologue
    .line 3753
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    .line 3763
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3756
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 3757
    .local v0, "chars":[C
    const/4 v2, 0x0

    .line 3758
    .local v2, "pos":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_1
    array-length v4, v0

    if-ge v1, v4, :cond_3

    .line 3759
    aget-char v4, v0, v1

    if-eq v4, p1, :cond_2

    .line 3760
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "pos":I
    .local v3, "pos":I
    aget-char v4, v0, v1

    aput-char v4, v0, v2

    move v2, v3

    .line 3758
    .end local v3    # "pos":I
    .restart local v2    # "pos":I
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 3763
    :cond_3
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    const/4 v4, 0x0

    invoke-direct {p0, v0, v4, v2}, Ljava/lang/String;-><init>([CII)V

    goto :goto_0
.end method

.method public static remove(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # Ljava/lang/String;

    .prologue
    .line 3727
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3730
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    const-string v0, ""

    const/4 v1, -0x1

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method private static removeAccentsJava6(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 6
    .param p0, "text"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .prologue
    .line 670
    sget-boolean v1, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    if-eqz v1, :cond_0

    sget-object v1, Lorg/apache/commons/lang3/StringUtils;->java6NormalizerFormNFD:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 671
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "java.text.Normalizer is not available"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 674
    :cond_1
    sget-object v1, Lorg/apache/commons/lang3/StringUtils;->java6NormalizeMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 v4, 0x1

    sget-object v5, Lorg/apache/commons/lang3/StringUtils;->java6NormalizerFormNFD:Ljava/lang/Object;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 675
    .local v0, "result":Ljava/lang/String;
    sget-object v1, Lorg/apache/commons/lang3/StringUtils;->java6Pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 676
    return-object v0
.end method

.method private static removeAccentsSUN(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 7
    .param p0, "text"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 694
    sget-boolean v1, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z

    if-nez v1, :cond_0

    .line 695
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "sun.text.Normalizer is not available"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 698
    :cond_0
    sget-object v1, Lorg/apache/commons/lang3/StringUtils;->sunDecomposeMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v6

    const/4 v4, 0x1

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 699
    .local v0, "result":Ljava/lang/String;
    sget-object v1, Lorg/apache/commons/lang3/StringUtils;->sunPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 700
    return-object v0
.end method

.method public static removeEnd(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # Ljava/lang/String;

    .prologue
    .line 3658
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3664
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3661
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3662
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static removeEndIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # Ljava/lang/String;

    .prologue
    .line 3694
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3700
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3697
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->endsWithIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3698
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static removeStart(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # Ljava/lang/String;

    .prologue
    .line 3589
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3595
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3592
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3593
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static removeStartIgnoreCase(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "remove"    # Ljava/lang/String;

    .prologue
    .line 3624
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3630
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3627
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->startsWithIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3628
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static repeat(CI)Ljava/lang/String;
    .locals 3
    .param p0, "ch"    # C
    .param p1, "repeat"    # I

    .prologue
    .line 4551
    new-array v0, p1, [C

    .line 4552
    .local v0, "buf":[C
    add-int/lit8 v1, p1, -0x1

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_0

    .line 4553
    aput-char p0, v0, v1

    .line 4552
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 4555
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    return-object v2
.end method

.method public static repeat(Ljava/lang/String;I)Ljava/lang/String;
    .locals 10
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "repeat"    # I

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 4462
    if-nez p0, :cond_1

    .line 4463
    const/4 p0, 0x0

    .line 4494
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4465
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-gtz p1, :cond_2

    .line 4466
    const-string p0, ""

    goto :goto_0

    .line 4468
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    .line 4469
    .local v4, "inputLength":I
    if-eq p1, v9, :cond_0

    if-eqz v4, :cond_0

    .line 4472
    if-ne v4, v9, :cond_3

    const/16 v7, 0x2000

    if-gt p1, v7, :cond_3

    .line 4473
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, p1}, Lorg/apache/commons/lang3/StringUtils;->repeat(CI)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4476
    :cond_3
    mul-int v6, v4, p1

    .line 4477
    .local v6, "outputLength":I
    packed-switch v4, :pswitch_data_0

    .line 4490
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 4491
    .local v0, "buf":Ljava/lang/StringBuilder;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    if-ge v3, p1, :cond_5

    .line 4492
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4491
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 4479
    .end local v0    # "buf":Ljava/lang/StringBuilder;
    .end local v3    # "i":I
    :pswitch_0
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, p1}, Lorg/apache/commons/lang3/StringUtils;->repeat(CI)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4481
    :pswitch_1
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 4482
    .local v1, "ch0":C
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 4483
    .local v2, "ch1":C
    new-array v5, v6, [C

    .line 4484
    .local v5, "output2":[C
    mul-int/lit8 v7, p1, 0x2

    add-int/lit8 v3, v7, -0x2

    .restart local v3    # "i":I
    :goto_2
    if-ltz v3, :cond_4

    .line 4485
    aput-char v1, v5, v3

    .line 4486
    add-int/lit8 v7, v3, 0x1

    aput-char v2, v5, v7

    .line 4484
    add-int/lit8 v3, v3, -0x1

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 4488
    :cond_4
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    invoke-direct {p0, v5}, Ljava/lang/String;-><init>([C)V

    goto :goto_0

    .line 4494
    .end local v1    # "ch0":C
    .end local v2    # "ch1":C
    .end local v5    # "output2":[C
    .restart local v0    # "buf":Ljava/lang/StringBuilder;
    .restart local p0    # "str":Ljava/lang/String;
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4477
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static repeat(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;
    .param p2, "repeat"    # I

    .prologue
    .line 4519
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 4520
    :cond_0
    invoke-static {p0, p2}, Lorg/apache/commons/lang3/StringUtils;->repeat(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 4524
    :goto_0
    return-object v1

    .line 4523
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lorg/apache/commons/lang3/StringUtils;->repeat(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 4524
    .local v0, "result":Ljava/lang/String;
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/StringUtils;->removeEnd(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchString"    # Ljava/lang/String;
    .param p2, "replacement"    # Ljava/lang/String;

    .prologue
    .line 3819
    const/4 v0, -0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 8
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchString"    # Ljava/lang/String;
    .param p2, "replacement"    # Ljava/lang/String;
    .param p3, "max"    # I

    .prologue
    const/16 v5, 0x40

    const/4 v7, -0x1

    .line 3851
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    .line 3873
    .end local p0    # "text":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 3854
    .restart local p0    # "text":Ljava/lang/String;
    :cond_1
    const/4 v4, 0x0

    .line 3855
    .local v4, "start":I
    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 3856
    .local v1, "end":I
    if-eq v1, v7, :cond_0

    .line 3859
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 3860
    .local v3, "replLength":I
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    sub-int v2, v6, v3

    .line 3861
    .local v2, "increase":I
    if-gez v2, :cond_2

    const/4 v2, 0x0

    .line 3862
    :cond_2
    if-gez p3, :cond_5

    const/16 v5, 0x10

    :cond_3
    :goto_1
    mul-int/2addr v2, v5

    .line 3863
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v2

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3864
    .local v0, "buf":Ljava/lang/StringBuilder;
    :goto_2
    if-eq v1, v7, :cond_4

    .line 3865
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3866
    add-int v4, v1, v3

    .line 3867
    add-int/lit8 p3, p3, -0x1

    if-nez p3, :cond_6

    .line 3872
    :cond_4
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3873
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 3862
    .end local v0    # "buf":Ljava/lang/StringBuilder;
    :cond_5
    if-gt p3, v5, :cond_3

    move v5, p3

    goto :goto_1

    .line 3870
    .restart local v0    # "buf":Ljava/lang/StringBuilder;
    :cond_6
    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    goto :goto_2
.end method

.method public static replaceChars(Ljava/lang/String;CC)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "searchChar"    # C
    .param p2, "replaceChar"    # C

    .prologue
    .line 4169
    if-nez p0, :cond_0

    .line 4170
    const/4 v0, 0x0

    .line 4172
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static replaceChars(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "searchChars"    # Ljava/lang/String;
    .param p2, "replaceChars"    # Ljava/lang/String;

    .prologue
    .line 4212
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 4237
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4215
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-nez p2, :cond_2

    .line 4216
    const-string p2, ""

    .line 4218
    :cond_2
    const/4 v4, 0x0

    .line 4219
    .local v4, "modified":Z
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    .line 4220
    .local v5, "replaceCharsLength":I
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    .line 4221
    .local v6, "strLength":I
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 4222
    .local v0, "buf":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    if-ge v2, v6, :cond_5

    .line 4223
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 4224
    .local v1, "ch":C
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    .line 4225
    .local v3, "index":I
    if-ltz v3, :cond_4

    .line 4226
    const/4 v4, 0x1

    .line 4227
    if-ge v3, v5, :cond_3

    .line 4228
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4222
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 4231
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 4234
    .end local v1    # "ch":C
    .end local v3    # "index":I
    :cond_5
    if-eqz v4, :cond_0

    .line 4235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static replaceEach(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchList"    # [Ljava/lang/String;
    .param p2, "replacementList"    # [Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 3916
    invoke-static {p0, p1, p2, v0, v0}, Lorg/apache/commons/lang3/StringUtils;->replaceEach(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static replaceEach(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZI)Ljava/lang/String;
    .locals 20
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchList"    # [Ljava/lang/String;
    .param p2, "replacementList"    # [Ljava/lang/String;
    .param p3, "repeat"    # Z
    .param p4, "timeToLive"    # I

    .prologue
    .line 4025
    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v17

    if-eqz v17, :cond_0

    if-eqz p1, :cond_0

    move-object/from16 v0, p1

    array-length v0, v0

    move/from16 v17, v0

    if-eqz v17, :cond_0

    if-eqz p2, :cond_0

    move-object/from16 v0, p2

    array-length v0, v0

    move/from16 v17, v0

    if-nez v17, :cond_1

    .line 4143
    .end local p0    # "text":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4031
    .restart local p0    # "text":Ljava/lang/String;
    :cond_1
    if-gez p4, :cond_2

    .line 4032
    new-instance v17, Ljava/lang/IllegalStateException;

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "TimeToLive of "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, " is less than 0: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v17

    .line 4035
    :cond_2
    move-object/from16 v0, p1

    array-length v12, v0

    .line 4036
    .local v12, "searchLength":I
    move-object/from16 v0, p2

    array-length v10, v0

    .line 4039
    .local v10, "replacementLength":I
    if-eq v12, v10, :cond_3

    .line 4040
    new-instance v17, Ljava/lang/IllegalArgumentException;

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    const-string v19, "Search and Replace array lengths don\'t match: "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    const-string v19, " vs "

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v17

    .line 4047
    :cond_3
    new-array v8, v12, [Z

    .line 4050
    .local v8, "noMoreMatchesForReplIndex":[Z
    const/4 v15, -0x1

    .line 4051
    .local v15, "textIndex":I
    const/4 v9, -0x1

    .line 4052
    .local v9, "replaceIndex":I
    const/4 v14, -0x1

    .line 4056
    .local v14, "tempIndex":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_1
    if-ge v6, v12, :cond_8

    .line 4057
    aget-boolean v17, v8, v6

    if-nez v17, :cond_4

    aget-object v17, p1, v6

    if-eqz v17, :cond_4

    aget-object v17, p1, v6

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    if-eqz v17, :cond_4

    aget-object v17, p2, v6

    if-nez v17, :cond_5

    .line 4056
    :cond_4
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 4061
    :cond_5
    aget-object v17, p1, v6

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v14

    .line 4064
    const/16 v17, -0x1

    move/from16 v0, v17

    if-ne v14, v0, :cond_6

    .line 4065
    const/16 v17, 0x1

    aput-boolean v17, v8, v6

    goto :goto_2

    .line 4067
    :cond_6
    const/16 v17, -0x1

    move/from16 v0, v17

    if-eq v15, v0, :cond_7

    if-ge v14, v15, :cond_4

    .line 4068
    :cond_7
    move v15, v14

    .line 4069
    move v9, v6

    goto :goto_2

    .line 4076
    :cond_8
    const/16 v17, -0x1

    move/from16 v0, v17

    if-eq v15, v0, :cond_0

    .line 4080
    const/4 v13, 0x0

    .line 4083
    .local v13, "start":I
    const/4 v7, 0x0

    .line 4086
    .local v7, "increase":I
    const/4 v6, 0x0

    :goto_3
    move-object/from16 v0, p1

    array-length v0, v0

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v6, v0, :cond_b

    .line 4087
    aget-object v17, p1, v6

    if-eqz v17, :cond_9

    aget-object v17, p2, v6

    if-nez v17, :cond_a

    .line 4086
    :cond_9
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 4090
    :cond_a
    aget-object v17, p2, v6

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    aget-object v18, p1, v6

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v18

    sub-int v5, v17, v18

    .line 4091
    .local v5, "greater":I
    if-lez v5, :cond_9

    .line 4092
    mul-int/lit8 v17, v5, 0x3

    add-int v7, v7, v17

    goto :goto_4

    .line 4096
    .end local v5    # "greater":I
    :cond_b
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v17

    div-int/lit8 v17, v17, 0x5

    move/from16 v0, v17

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 4098
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v17

    add-int v17, v17, v7

    move/from16 v0, v17

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 4100
    .local v4, "buf":Ljava/lang/StringBuilder;
    :cond_c
    const/16 v17, -0x1

    move/from16 v0, v17

    if-eq v15, v0, :cond_12

    .line 4102
    move v6, v13

    :goto_5
    if-ge v6, v15, :cond_d

    .line 4103
    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v17

    move/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4102
    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    .line 4105
    :cond_d
    aget-object v17, p2, v9

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4107
    aget-object v17, p1, v9

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    add-int v13, v15, v17

    .line 4109
    const/4 v15, -0x1

    .line 4110
    const/4 v9, -0x1

    .line 4111
    const/4 v14, -0x1

    .line 4114
    const/4 v6, 0x0

    :goto_6
    if-ge v6, v12, :cond_c

    .line 4115
    aget-boolean v17, v8, v6

    if-nez v17, :cond_e

    aget-object v17, p1, v6

    if-eqz v17, :cond_e

    aget-object v17, p1, v6

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v17

    if-eqz v17, :cond_e

    aget-object v17, p2, v6

    if-nez v17, :cond_f

    .line 4114
    :cond_e
    :goto_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 4119
    :cond_f
    aget-object v17, p1, v6

    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v14

    .line 4122
    const/16 v17, -0x1

    move/from16 v0, v17

    if-ne v14, v0, :cond_10

    .line 4123
    const/16 v17, 0x1

    aput-boolean v17, v8, v6

    goto :goto_7

    .line 4125
    :cond_10
    const/16 v17, -0x1

    move/from16 v0, v17

    if-eq v15, v0, :cond_11

    if-ge v14, v15, :cond_e

    .line 4126
    :cond_11
    move v15, v14

    .line 4127
    move v9, v6

    goto :goto_7

    .line 4134
    :cond_12
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v16

    .line 4135
    .local v16, "textLength":I
    move v6, v13

    :goto_8
    move/from16 v0, v16

    if-ge v6, v0, :cond_13

    .line 4136
    move-object/from16 v0, p0

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v17

    move/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4135
    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    .line 4138
    :cond_13
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 4139
    .local v11, "result":Ljava/lang/String;
    if-nez p3, :cond_14

    move-object/from16 p0, v11

    .line 4140
    goto/16 :goto_0

    .line 4143
    :cond_14
    add-int/lit8 v17, p4, -0x1

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, v17

    invoke-static {v11, v0, v1, v2, v3}, Lorg/apache/commons/lang3/StringUtils;->replaceEach(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZI)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0
.end method

.method public static replaceEachRepeatedly(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchList"    # [Ljava/lang/String;
    .param p2, "replacementList"    # [Ljava/lang/String;

    .prologue
    .line 3967
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 3968
    .local v0, "timeToLive":I
    :goto_0
    const/4 v1, 0x1

    invoke-static {p0, p1, p2, v1, v0}, Lorg/apache/commons/lang3/StringUtils;->replaceEach(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZI)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 3967
    .end local v0    # "timeToLive":I
    :cond_0
    array-length v0, p1

    goto :goto_0
.end method

.method public static replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "text"    # Ljava/lang/String;
    .param p1, "searchString"    # Ljava/lang/String;
    .param p2, "replacement"    # Ljava/lang/String;

    .prologue
    .line 3792
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->replace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static reverse(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 5603
    if-nez p0, :cond_0

    .line 5604
    const/4 v0, 0x0

    .line 5606
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static reverseDelimited(Ljava/lang/String;C)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChar"    # C

    .prologue
    .line 5629
    if-nez p0, :cond_0

    .line 5630
    const/4 v1, 0x0

    .line 5636
    :goto_0
    return-object v1

    .line 5634
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->split(Ljava/lang/String;C)[Ljava/lang/String;

    move-result-object v0

    .line 5635
    .local v0, "strs":[Ljava/lang/String;
    invoke-static {v0}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([Ljava/lang/Object;)V

    .line 5636
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/StringUtils;->join([Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static right(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "len"    # I

    .prologue
    .line 2159
    if-nez p0, :cond_1

    .line 2160
    const/4 p0, 0x0

    .line 2168
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 2162
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-gez p1, :cond_2

    .line 2163
    const-string p0, ""

    goto :goto_0

    .line 2165
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 2168
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static rightPad(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I

    .prologue
    .line 4578
    const/16 v0, 0x20

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->rightPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static rightPad(Ljava/lang/String;IC)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padChar"    # C

    .prologue
    .line 4603
    if-nez p0, :cond_1

    .line 4604
    const/4 p0, 0x0

    .line 4613
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4606
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v0, p1, v1

    .line 4607
    .local v0, "pads":I
    if-lez v0, :cond_0

    .line 4610
    const/16 v1, 0x2000

    if-le v0, v1, :cond_2

    .line 4611
    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, p1, v1}, Lorg/apache/commons/lang3/StringUtils;->rightPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4613
    :cond_2
    invoke-static {p2, v0}, Lorg/apache/commons/lang3/StringUtils;->repeat(CI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static rightPad(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "size"    # I
    .param p2, "padStr"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 4640
    if-nez p0, :cond_1

    .line 4641
    const/4 p0, 0x0

    .line 4666
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 4643
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-static {p2}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 4644
    const-string p2, " "

    .line 4646
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    .line 4647
    .local v2, "padLen":I
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    .line 4648
    .local v5, "strLen":I
    sub-int v4, p1, v5

    .line 4649
    .local v4, "pads":I
    if-lez v4, :cond_0

    .line 4652
    const/4 v6, 0x1

    if-ne v2, v6, :cond_3

    const/16 v6, 0x2000

    if-gt v4, v6, :cond_3

    .line 4653
    invoke-virtual {p2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {p0, p1, v6}, Lorg/apache/commons/lang3/StringUtils;->rightPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4656
    :cond_3
    if-ne v4, v2, :cond_4

    .line 4657
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4658
    :cond_4
    if-ge v4, v2, :cond_5

    .line 4659
    invoke-virtual {p2, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 4661
    :cond_5
    new-array v3, v4, [C

    .line 4662
    .local v3, "padding":[C
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 4663
    .local v1, "padChars":[C
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-ge v0, v4, :cond_6

    .line 4664
    rem-int v6, v0, v2

    aget-char v6, v1, v6

    aput-char v6, v3, v0

    .line 4663
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4666
    :cond_6
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {p0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static split(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 2527
    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->split(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static split(Ljava/lang/String;C)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChar"    # C

    .prologue
    .line 2555
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;CZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChars"    # Ljava/lang/String;

    .prologue
    .line 2584
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static split(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChars"    # Ljava/lang/String;
    .param p2, "max"    # I

    .prologue
    .line 2618
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitByCharacterType(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 3128
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->splitByCharacterType(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static splitByCharacterType(Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 9
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "camelCase"    # Z

    .prologue
    .line 3174
    if-nez p0, :cond_0

    .line 3175
    const/4 v7, 0x0

    .line 3202
    :goto_0
    return-object v7

    .line 3177
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_1

    .line 3178
    sget-object v7, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    .line 3180
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 3181
    .local v0, "c":[C
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3182
    .local v2, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v5, 0x0

    .line 3183
    .local v5, "tokenStart":I
    aget-char v7, v0, v5

    invoke-static {v7}, Ljava/lang/Character;->getType(C)I

    move-result v1

    .line 3184
    .local v1, "currentType":I
    add-int/lit8 v4, v5, 0x1

    .local v4, "pos":I
    :goto_1
    array-length v7, v0

    if-ge v4, v7, :cond_5

    .line 3185
    aget-char v7, v0, v4

    invoke-static {v7}, Ljava/lang/Character;->getType(C)I

    move-result v6

    .line 3186
    .local v6, "type":I
    if-ne v6, v1, :cond_2

    .line 3184
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 3189
    :cond_2
    if-eqz p1, :cond_4

    const/4 v7, 0x2

    if-ne v6, v7, :cond_4

    const/4 v7, 0x1

    if-ne v1, v7, :cond_4

    .line 3190
    add-int/lit8 v3, v4, -0x1

    .line 3191
    .local v3, "newTokenStart":I
    if-eq v3, v5, :cond_3

    .line 3192
    new-instance v7, Ljava/lang/String;

    sub-int v8, v3, v5

    invoke-direct {v7, v0, v5, v8}, Ljava/lang/String;-><init>([CII)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3193
    move v5, v3

    .line 3199
    .end local v3    # "newTokenStart":I
    :cond_3
    :goto_3
    move v1, v6

    goto :goto_2

    .line 3196
    :cond_4
    new-instance v7, Ljava/lang/String;

    sub-int v8, v4, v5

    invoke-direct {v7, v0, v5, v8}, Ljava/lang/String;-><init>([CII)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3197
    move v5, v4

    goto :goto_3

    .line 3201
    .end local v6    # "type":I
    :cond_5
    new-instance v7, Ljava/lang/String;

    array-length v8, v0

    sub-int/2addr v8, v5

    invoke-direct {v7, v0, v5, v8}, Ljava/lang/String;-><init>([CII)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3202
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Ljava/lang/String;

    invoke-interface {v2, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/String;

    goto :goto_0
.end method

.method public static splitByCharacterTypeCamelCase(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 3156
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->splitByCharacterType(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitByWholeSeparator(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2645
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->splitByWholeSeparatorWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitByWholeSeparator(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;
    .param p2, "max"    # I

    .prologue
    .line 2676
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->splitByWholeSeparatorWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitByWholeSeparatorPreserveAllTokens(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2705
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->splitByWholeSeparatorWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitByWholeSeparatorPreserveAllTokens(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;
    .param p2, "max"    # I

    .prologue
    .line 2738
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->splitByWholeSeparatorWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static splitByWholeSeparatorWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;
    .locals 8
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;
    .param p2, "max"    # I
    .param p3, "preserveAllTokens"    # Z

    .prologue
    const/4 v6, 0x0

    .line 2757
    if-nez p0, :cond_0

    .line 2818
    :goto_0
    return-object v6

    .line 2761
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 2763
    .local v2, "len":I
    if-nez v2, :cond_1

    .line 2764
    sget-object v6, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    .line 2767
    :cond_1
    if-eqz p1, :cond_2

    const-string v7, ""

    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 2769
    :cond_2
    invoke-static {p0, v6, p2, p3}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 2772
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 2774
    .local v4, "separatorLength":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2775
    .local v5, "substrings":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v3, 0x0

    .line 2776
    .local v3, "numberOfSubstrings":I
    const/4 v0, 0x0

    .line 2777
    .local v0, "beg":I
    const/4 v1, 0x0

    .line 2778
    .local v1, "end":I
    :goto_1
    if-ge v1, v2, :cond_9

    .line 2779
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 2781
    const/4 v6, -0x1

    if-le v1, v6, :cond_8

    .line 2782
    if-le v1, v0, :cond_5

    .line 2783
    add-int/lit8 v3, v3, 0x1

    .line 2785
    if-ne v3, p2, :cond_4

    .line 2786
    move v1, v2

    .line 2787
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 2791
    :cond_4
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2796
    add-int v0, v1, v4

    goto :goto_1

    .line 2800
    :cond_5
    if-eqz p3, :cond_6

    .line 2801
    add-int/lit8 v3, v3, 0x1

    .line 2802
    if-ne v3, p2, :cond_7

    .line 2803
    move v1, v2

    .line 2804
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2809
    :cond_6
    :goto_2
    add-int v0, v1, v4

    goto :goto_1

    .line 2806
    :cond_7
    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 2813
    :cond_8
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2814
    move v1, v2

    goto :goto_1

    .line 2818
    :cond_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-array v6, v6, [Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/String;

    goto :goto_0
.end method

.method public static splitPreserveAllTokens(Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 2847
    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitPreserveAllTokens(Ljava/lang/String;C)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChar"    # C

    .prologue
    .line 2883
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;CZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitPreserveAllTokens(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChars"    # Ljava/lang/String;

    .prologue
    .line 2966
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static splitPreserveAllTokens(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChars"    # Ljava/lang/String;
    .param p2, "max"    # I

    .prologue
    .line 3006
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/StringUtils;->splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static splitWorker(Ljava/lang/String;CZ)[Ljava/lang/String;
    .locals 7
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChar"    # C
    .param p2, "preserveAllTokens"    # Z

    .prologue
    .line 2901
    if-nez p0, :cond_0

    .line 2902
    const/4 v6, 0x0

    .line 2929
    :goto_0
    return-object v6

    .line 2904
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 2905
    .local v2, "len":I
    if-nez v2, :cond_1

    .line 2906
    sget-object v6, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    .line 2908
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2909
    .local v3, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    const/4 v5, 0x0

    .line 2910
    .local v5, "start":I
    const/4 v4, 0x0

    .line 2911
    .local v4, "match":Z
    const/4 v1, 0x0

    .line 2912
    .local v1, "lastMatch":Z
    :goto_1
    if-ge v0, v2, :cond_5

    .line 2913
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, p1, :cond_4

    .line 2914
    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    .line 2915
    :cond_2
    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2916
    const/4 v4, 0x0

    .line 2917
    const/4 v1, 0x1

    .line 2919
    :cond_3
    add-int/lit8 v0, v0, 0x1

    move v5, v0

    .line 2920
    goto :goto_1

    .line 2922
    :cond_4
    const/4 v1, 0x0

    .line 2923
    const/4 v4, 0x1

    .line 2924
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2926
    :cond_5
    if-nez v4, :cond_6

    if-eqz p2, :cond_7

    if-eqz v1, :cond_7

    .line 2927
    :cond_6
    invoke-virtual {p0, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2929
    :cond_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [Ljava/lang/String;

    invoke-interface {v3, v6}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/String;

    goto :goto_0
.end method

.method private static splitWorker(Ljava/lang/String;Ljava/lang/String;IZ)[Ljava/lang/String;
    .locals 11
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separatorChars"    # Ljava/lang/String;
    .param p2, "max"    # I
    .param p3, "preserveAllTokens"    # Z

    .prologue
    .line 3028
    if-nez p0, :cond_0

    .line 3029
    const/4 v9, 0x0

    .line 3105
    :goto_0
    return-object v9

    .line 3031
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 3032
    .local v2, "len":I
    if-nez v2, :cond_1

    .line 3033
    sget-object v9, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    .line 3035
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3036
    .local v3, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x1

    .line 3037
    .local v6, "sizePlus1":I
    const/4 v0, 0x0

    .local v0, "i":I
    const/4 v8, 0x0

    .line 3038
    .local v8, "start":I
    const/4 v4, 0x0

    .line 3039
    .local v4, "match":Z
    const/4 v1, 0x0

    .line 3040
    .local v1, "lastMatch":Z
    if-nez p1, :cond_5

    move v7, v6

    .line 3042
    .end local v6    # "sizePlus1":I
    .local v7, "sizePlus1":I
    :goto_1
    if-ge v0, v2, :cond_10

    .line 3043
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 3044
    if-nez v4, :cond_2

    if-eqz p3, :cond_13

    .line 3045
    :cond_2
    const/4 v1, 0x1

    .line 3046
    add-int/lit8 v6, v7, 0x1

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    if-ne v7, p2, :cond_3

    .line 3047
    move v0, v2

    .line 3048
    const/4 v1, 0x0

    .line 3050
    :cond_3
    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3051
    const/4 v4, 0x0

    .line 3053
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v8, v0

    move v7, v6

    .line 3054
    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    goto :goto_1

    .line 3056
    :cond_4
    const/4 v1, 0x0

    .line 3057
    const/4 v4, 0x1

    .line 3058
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 3060
    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_12

    .line 3062
    const/4 v9, 0x0

    invoke-virtual {p1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .local v5, "sep":C
    move v7, v6

    .line 3063
    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    :goto_3
    if-ge v0, v2, :cond_9

    .line 3064
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v5, :cond_8

    .line 3065
    if-nez v4, :cond_6

    if-eqz p3, :cond_11

    .line 3066
    :cond_6
    const/4 v1, 0x1

    .line 3067
    add-int/lit8 v6, v7, 0x1

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    if-ne v7, p2, :cond_7

    .line 3068
    move v0, v2

    .line 3069
    const/4 v1, 0x0

    .line 3071
    :cond_7
    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3072
    const/4 v4, 0x0

    .line 3074
    :goto_4
    add-int/lit8 v0, v0, 0x1

    move v8, v0

    move v7, v6

    .line 3075
    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    goto :goto_3

    .line 3077
    :cond_8
    const/4 v1, 0x0

    .line 3078
    const/4 v4, 0x1

    .line 3079
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_9
    move v6, v7

    .line 3102
    .end local v5    # "sep":C
    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    :goto_5
    if-nez v4, :cond_a

    if-eqz p3, :cond_b

    if-eqz v1, :cond_b

    .line 3103
    :cond_a
    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3105
    :cond_b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    new-array v9, v9, [Ljava/lang/String;

    invoke-interface {v3, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    goto/16 :goto_0

    .line 3083
    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    :goto_6
    if-ge v0, v2, :cond_10

    .line 3084
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-virtual {p1, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    if-ltz v9, :cond_e

    .line 3085
    if-nez v4, :cond_c

    if-eqz p3, :cond_f

    .line 3086
    :cond_c
    const/4 v1, 0x1

    .line 3087
    add-int/lit8 v6, v7, 0x1

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    if-ne v7, p2, :cond_d

    .line 3088
    move v0, v2

    .line 3089
    const/4 v1, 0x0

    .line 3091
    :cond_d
    invoke-virtual {p0, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3092
    const/4 v4, 0x0

    .line 3094
    :goto_7
    add-int/lit8 v0, v0, 0x1

    move v8, v0

    move v7, v6

    .line 3095
    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    goto :goto_6

    .line 3097
    :cond_e
    const/4 v1, 0x0

    .line 3098
    const/4 v4, 0x1

    .line 3099
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_f
    move v6, v7

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    goto :goto_7

    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    :cond_10
    move v6, v7

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    goto :goto_5

    .end local v6    # "sizePlus1":I
    .restart local v5    # "sep":C
    .restart local v7    # "sizePlus1":I
    :cond_11
    move v6, v7

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    goto :goto_4

    .end local v5    # "sep":C
    :cond_12
    move v7, v6

    .end local v6    # "sizePlus1":I
    .restart local v7    # "sizePlus1":I
    goto :goto_6

    :cond_13
    move v6, v7

    .end local v7    # "sizePlus1":I
    .restart local v6    # "sizePlus1":I
    goto/16 :goto_2
.end method

.method public static startsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "prefix"    # Ljava/lang/CharSequence;

    .prologue
    .line 6322
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->startsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    return v0
.end method

.method private static startsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z
    .locals 6
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "prefix"    # Ljava/lang/CharSequence;
    .param p2, "ignoreCase"    # Z

    .prologue
    const/4 v2, 0x0

    .line 6363
    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    .line 6364
    :cond_0
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    const/4 v2, 0x1

    .line 6369
    :cond_1
    :goto_0
    return v2

    .line 6366
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt v0, v1, :cond_1

    .line 6369
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move-object v0, p0

    move v1, p2

    move-object v3, p1

    move v4, v2

    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/CharSequenceUtils;->regionMatches(Ljava/lang/CharSequence;ZILjava/lang/CharSequence;II)Z

    move-result v2

    goto :goto_0
.end method

.method public static varargs startsWithAny(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Z
    .locals 6
    .param p0, "string"    # Ljava/lang/CharSequence;
    .param p1, "searchStrings"    # [Ljava/lang/CharSequence;

    .prologue
    const/4 v4, 0x0

    .line 6392
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 6400
    :cond_0
    :goto_0
    return v4

    .line 6395
    :cond_1
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/CharSequence;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_1
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 6396
    .local v3, "searchString":Ljava/lang/CharSequence;
    invoke-static {p0, v3}, Lorg/apache/commons/lang3/StringUtils;->startsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 6397
    const/4 v4, 0x1

    goto :goto_0

    .line 6395
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method public static startsWithIgnoreCase(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/CharSequence;
    .param p1, "prefix"    # Ljava/lang/CharSequence;

    .prologue
    .line 6348
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/StringUtils;->startsWith(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    return v0
.end method

.method public static strip(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 361
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->strip(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static strip(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "stripChars"    # Ljava/lang/String;

    .prologue
    .line 448
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 451
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->stripStart(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 452
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/StringUtils;->stripEnd(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static stripAccents(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "input"    # Ljava/lang/String;

    .prologue
    .line 628
    if-nez p0, :cond_0

    .line 629
    const/4 v2, 0x0

    .line 642
    :goto_0
    return-object v2

    .line 632
    :cond_0
    const/4 v2, 0x0

    .line 633
    .local v2, "result":Ljava/lang/String;
    :try_start_0
    sget-boolean v4, Lorg/apache/commons/lang3/StringUtils;->java6Available:Z

    if-eqz v4, :cond_1

    .line 634
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->removeAccentsJava6(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 635
    :cond_1
    sget-boolean v4, Lorg/apache/commons/lang3/StringUtils;->sunAvailable:Z

    if-eqz v4, :cond_2

    .line 636
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->removeAccentsSUN(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 638
    :cond_2
    new-instance v4, Ljava/lang/UnsupportedOperationException;

    const-string v5, "The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM"

    invoke-direct {v4, v5}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_3

    .line 643
    :catch_0
    move-exception v0

    .line 644
    .local v0, "iae":Ljava/lang/IllegalArgumentException;
    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "IllegalArgumentException occurred"

    invoke-direct {v4, v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 645
    .end local v0    # "iae":Ljava/lang/IllegalArgumentException;
    :catch_1
    move-exception v0

    .line 646
    .local v0, "iae":Ljava/lang/IllegalAccessException;
    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "IllegalAccessException occurred"

    invoke-direct {v4, v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 647
    .end local v0    # "iae":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v1

    .line 648
    .local v1, "ite":Ljava/lang/reflect/InvocationTargetException;
    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "InvocationTargetException occurred"

    invoke-direct {v4, v5, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 649
    .end local v1    # "ite":Ljava/lang/reflect/InvocationTargetException;
    :catch_3
    move-exception v3

    .line 650
    .local v3, "se":Ljava/lang/SecurityException;
    new-instance v4, Ljava/lang/RuntimeException;

    const-string v5, "SecurityException occurred"

    invoke-direct {v4, v5, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
.end method

.method public static varargs stripAll([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .param p0, "strs"    # [Ljava/lang/String;

    .prologue
    .line 566
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->stripAll([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static stripAll([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4
    .param p0, "strs"    # [Ljava/lang/String;
    .param p1, "stripChars"    # Ljava/lang/String;

    .prologue
    .line 596
    if-eqz p0, :cond_0

    array-length v2, p0

    .local v2, "strsLen":I
    if-nez v2, :cond_2

    .end local v2    # "strsLen":I
    :cond_0
    move-object v1, p0

    .line 603
    :cond_1
    return-object v1

    .line 599
    .restart local v2    # "strsLen":I
    :cond_2
    new-array v1, v2, [Ljava/lang/String;

    .line 600
    .local v1, "newArr":[Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v2, :cond_1

    .line 601
    aget-object v3, p0, v0

    invoke-static {v3, p1}, Lorg/apache/commons/lang3/StringUtils;->strip(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v0

    .line 600
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static stripEnd(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "stripChars"    # Ljava/lang/String;

    .prologue
    .line 526
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .local v0, "end":I
    if-nez v0, :cond_1

    .line 541
    .end local v0    # "end":I
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 530
    .restart local v0    # "end":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    if-nez p1, :cond_2

    .line 531
    :goto_1
    if-eqz v0, :cond_3

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 532
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 534
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 537
    :goto_2
    if-eqz v0, :cond_3

    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    .line 538
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 541
    :cond_3
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static stripStart(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "stripChars"    # Ljava/lang/String;

    .prologue
    .line 481
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .local v1, "strLen":I
    if-nez v1, :cond_1

    .line 496
    .end local v1    # "strLen":I
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 484
    .restart local v1    # "strLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    const/4 v0, 0x0

    .line 485
    .local v0, "start":I
    if-nez p1, :cond_2

    .line 486
    :goto_1
    if-eq v0, v1, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 487
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 489
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    .line 492
    :goto_2
    if-eq v0, v1, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    .line 493
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 496
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static stripToEmpty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 418
    if-nez p0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->strip(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static stripToNull(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 388
    if-nez p0, :cond_0

    .line 392
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object v0

    .line 391
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/StringUtils;->strip(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 392
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    move-object p0, v0

    .end local p0    # "str":Ljava/lang/String;
    :cond_1
    move-object v0, p0

    goto :goto_0
.end method

.method public static substring(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "start"    # I

    .prologue
    .line 2016
    if-nez p0, :cond_0

    .line 2017
    const/4 v0, 0x0

    .line 2032
    :goto_0
    return-object v0

    .line 2021
    :cond_0
    if-gez p1, :cond_1

    .line 2022
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p1, v0

    .line 2025
    :cond_1
    if-gez p1, :cond_2

    .line 2026
    const/4 p1, 0x0

    .line 2028
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p1, v0, :cond_3

    .line 2029
    const-string v0, ""

    goto :goto_0

    .line 2032
    :cond_3
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static substring(Ljava/lang/String;II)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "start"    # I
    .param p2, "end"    # I

    .prologue
    .line 2071
    if-nez p0, :cond_0

    .line 2072
    const/4 v0, 0x0

    .line 2100
    :goto_0
    return-object v0

    .line 2076
    :cond_0
    if-gez p2, :cond_1

    .line 2077
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p2, v0

    .line 2079
    :cond_1
    if-gez p1, :cond_2

    .line 2080
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p1, v0

    .line 2084
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p2, v0, :cond_3

    .line 2085
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    .line 2089
    :cond_3
    if-le p1, p2, :cond_4

    .line 2090
    const-string v0, ""

    goto :goto_0

    .line 2093
    :cond_4
    if-gez p1, :cond_5

    .line 2094
    const/4 p1, 0x0

    .line 2096
    :cond_5
    if-gez p2, :cond_6

    .line 2097
    const/4 p2, 0x0

    .line 2100
    :cond_6
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static substringAfter(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2284
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2294
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 2287
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    if-nez p1, :cond_1

    .line 2288
    const-string p0, ""

    goto :goto_0

    .line 2290
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 2291
    .local v0, "pos":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 2292
    const-string p0, ""

    goto :goto_0

    .line 2294
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static substringAfterLast(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2365
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2375
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 2368
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2369
    const-string p0, ""

    goto :goto_0

    .line 2371
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 2372
    .local v0, "pos":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v1, v2

    if-ne v0, v1, :cond_3

    .line 2373
    :cond_2
    const-string p0, ""

    goto :goto_0

    .line 2375
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static substringBefore(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2242
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p1, :cond_1

    .line 2252
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 2245
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 2246
    const-string p0, ""

    goto :goto_0

    .line 2248
    :cond_2
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 2249
    .local v0, "pos":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2252
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static substringBeforeLast(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "separator"    # Ljava/lang/String;

    .prologue
    .line 2325
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2332
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .line 2328
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 2329
    .local v0, "pos":I
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2332
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static substringBetween(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "tag"    # Ljava/lang/String;

    .prologue
    .line 2402
    invoke-static {p0, p1, p1}, Lorg/apache/commons/lang3/StringUtils;->substringBetween(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static substringBetween(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "open"    # Ljava/lang/String;
    .param p2, "close"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    const/4 v4, -0x1

    .line 2433
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 2443
    :cond_0
    :goto_0
    return-object v2

    .line 2436
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 2437
    .local v1, "start":I
    if-eq v1, v4, :cond_0

    .line 2438
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p0, p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    .line 2439
    .local v0, "end":I
    if-eq v0, v4, :cond_0

    .line 2440
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public static substringsBetween(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 9
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "open"    # Ljava/lang/String;
    .param p2, "close"    # Ljava/lang/String;

    .prologue
    const/4 v7, 0x0

    .line 2469
    if-eqz p0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {p2}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 2496
    :cond_0
    :goto_0
    return-object v7

    .line 2472
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    .line 2473
    .local v6, "strLen":I
    if-nez v6, :cond_2

    .line 2474
    sget-object v7, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    .line 2476
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    .line 2477
    .local v0, "closeLen":I
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 2478
    .local v3, "openLen":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2479
    .local v2, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x0

    .line 2480
    .local v4, "pos":I
    :goto_1
    sub-int v8, v6, v0

    if-ge v4, v8, :cond_3

    .line 2481
    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    .line 2482
    .local v5, "start":I
    if-gez v5, :cond_4

    .line 2493
    .end local v5    # "start":I
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_0

    .line 2496
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Ljava/lang/String;

    invoke-interface {v2, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ljava/lang/String;

    goto :goto_0

    .line 2485
    .restart local v5    # "start":I
    :cond_4
    add-int/2addr v5, v3

    .line 2486
    invoke-virtual {p0, p2, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 2487
    .local v1, "end":I
    if-ltz v1, :cond_3

    .line 2490
    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2491
    add-int v4, v1, v0

    .line 2492
    goto :goto_1
.end method

.method public static swapCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 5097
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5113
    .end local p0    # "str":Ljava/lang/String;
    :goto_0
    return-object p0

    .line 5101
    .restart local p0    # "str":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 5103
    .local v0, "buffer":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_4

    .line 5104
    aget-char v1, v0, v2

    .line 5105
    .local v1, "ch":C
    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5106
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    aput-char v3, v0, v2

    .line 5103
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 5107
    :cond_2
    invoke-static {v1}, Ljava/lang/Character;->isTitleCase(C)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 5108
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    aput-char v3, v0, v2

    goto :goto_2

    .line 5109
    :cond_3
    invoke-static {v1}, Ljava/lang/Character;->isLowerCase(C)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5110
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    aput-char v3, v0, v2

    goto :goto_2

    .line 5113
    .end local v1    # "ch":C
    :cond_4
    new-instance p0, Ljava/lang/String;

    .end local p0    # "str":Ljava/lang/String;
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    goto :goto_0
.end method

.method public static trim(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 281
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static trimToEmpty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 333
    if-nez p0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static trimToNull(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 307
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->trim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 308
    .local v0, "ts":Ljava/lang/String;
    invoke-static {v0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .end local v0    # "ts":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public static uncapitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 5060
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    .local v0, "strLen":I
    if-nez v0, :cond_1

    .line 5063
    .end local v0    # "strLen":I
    .end local p0    # "str":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object p0

    .restart local v0    # "strLen":I
    .restart local p0    # "str":Ljava/lang/String;
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method public static upperCase(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 4929
    if-nez p0, :cond_0

    .line 4930
    const/4 v0, 0x0

    .line 4932
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static upperCase(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 4952
    if-nez p0, :cond_0

    .line 4953
    const/4 v0, 0x0

    .line 4955
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
