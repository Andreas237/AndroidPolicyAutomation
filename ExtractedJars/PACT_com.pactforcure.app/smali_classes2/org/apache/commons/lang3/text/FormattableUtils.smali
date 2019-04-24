.class public Lorg/apache/commons/lang3/text/FormattableUtils;
.super Ljava/lang/Object;
.source "FormattableUtils.java"


# static fields
.field private static final SIMPLEST_FORMAT:Ljava/lang/String; = "%s"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    return-void
.end method

.method public static append(Ljava/lang/CharSequence;Ljava/util/Formatter;III)Ljava/util/Formatter;
    .locals 7
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "formatter"    # Ljava/util/Formatter;
    .param p2, "flags"    # I
    .param p3, "width"    # I
    .param p4, "precision"    # I

    .prologue
    .line 83
    const/16 v5, 0x20

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/text/FormattableUtils;->append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIICLjava/lang/CharSequence;)Ljava/util/Formatter;

    move-result-object v0

    return-object v0
.end method

.method public static append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIIC)Ljava/util/Formatter;
    .locals 7
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "formatter"    # Ljava/util/Formatter;
    .param p2, "flags"    # I
    .param p3, "width"    # I
    .param p4, "precision"    # I
    .param p5, "padChar"    # C

    .prologue
    .line 100
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/text/FormattableUtils;->append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIICLjava/lang/CharSequence;)Ljava/util/Formatter;

    move-result-object v0

    return-object v0
.end method

.method public static append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIICLjava/lang/CharSequence;)Ljava/util/Formatter;
    .locals 9
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "formatter"    # Ljava/util/Formatter;
    .param p2, "flags"    # I
    .param p3, "width"    # I
    .param p4, "precision"    # I
    .param p5, "padChar"    # C
    .param p6, "ellipsis"    # Ljava/lang/CharSequence;

    .prologue
    .line 136
    if-eqz p6, :cond_0

    if-ltz p4, :cond_0

    invoke-interface {p6}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-gt v4, p4, :cond_2

    :cond_0
    const/4 v4, 0x1

    :goto_0
    const-string v5, "Specified ellipsis \'%1$s\' exceeds precision of %2$s"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p6, v6, v7

    const/4 v7, 0x1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-static {v4, v5, v6}, Lorg/apache/commons/lang3/Validate;->isTrue(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 139
    .local v1, "buf":Ljava/lang/StringBuilder;
    if-ltz p4, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge p4, v4, :cond_1

    .line 140
    const-string v4, ""

    invoke-static {p6, v4}, Lorg/apache/commons/lang3/ObjectUtils;->defaultIfNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 141
    .local v0, "_ellipsis":Ljava/lang/CharSequence;
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int v4, p4, v4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v4, v5, v6}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .end local v0    # "_ellipsis":Ljava/lang/CharSequence;
    :cond_1
    and-int/lit8 v4, p2, 0x1

    const/4 v5, 0x1

    if-ne v4, v5, :cond_3

    const/4 v3, 0x1

    .line 144
    .local v3, "leftJustify":Z
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    .local v2, "i":I
    :goto_2
    if-ge v2, p3, :cond_5

    .line 145
    if-eqz v3, :cond_4

    move v4, v2

    :goto_3
    invoke-virtual {v1, v4, p5}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 144
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 136
    .end local v1    # "buf":Ljava/lang/StringBuilder;
    .end local v2    # "i":I
    .end local v3    # "leftJustify":Z
    :cond_2
    const/4 v4, 0x0

    goto :goto_0

    .line 143
    .restart local v1    # "buf":Ljava/lang/StringBuilder;
    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    .line 145
    .restart local v2    # "i":I
    .restart local v3    # "leftJustify":Z
    :cond_4
    const/4 v4, 0x0

    goto :goto_3

    .line 147
    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {p1, v4, v5}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 148
    return-object p1
.end method

.method public static append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIILjava/lang/CharSequence;)Ljava/util/Formatter;
    .locals 7
    .param p0, "seq"    # Ljava/lang/CharSequence;
    .param p1, "formatter"    # Ljava/util/Formatter;
    .param p2, "flags"    # I
    .param p3, "width"    # I
    .param p4, "precision"    # I
    .param p5, "ellipsis"    # Ljava/lang/CharSequence;

    .prologue
    .line 118
    const/16 v5, 0x20

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/text/FormattableUtils;->append(Ljava/lang/CharSequence;Ljava/util/Formatter;IIICLjava/lang/CharSequence;)Ljava/util/Formatter;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/util/Formattable;)Ljava/lang/String;
    .locals 3
    .param p0, "formattable"    # Ljava/util/Formattable;

    .prologue
    .line 66
    const-string v0, "%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
