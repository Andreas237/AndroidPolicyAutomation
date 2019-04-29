.class Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;
.super Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;
.source "PeriodFormatterBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/format/PeriodFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SimpleAffix"
.end annotation


# instance fields
.field private final iText:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1029
    invoke-direct {p0}, Lorg/joda/time/format/PeriodFormatterBuilder$IgnorableAffix;-><init>()V

    .line 1030
    iput-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public calculatePrintedLength(I)I
    .locals 0

    .line 1034
    iget-object p1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public getAffixes()[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    .line 1081
    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public parse(Ljava/lang/String;I)I
    .locals 7

    .line 1046
    iget-object v3, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    .line 1047
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    move v2, p2

    move v5, v6

    .line 1048
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1049
    invoke-virtual {p0, v6, p1, p2}, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result p1

    if-nez p1, :cond_0

    add-int/2addr p2, v6

    return p2

    :cond_0
    xor-int/lit8 p1, p2, -0x1

    return p1
.end method

.method public printTo(Ljava/io/Writer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1042
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-void
.end method

.method public printTo(Ljava/lang/StringBuffer;I)V
    .locals 0

    .line 1038
    iget-object p2, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void
.end method

.method public scan(Ljava/lang/String;I)I
    .locals 10

    .line 1057
    iget-object v6, p0, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->iText:Ljava/lang/String;

    .line 1058
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    .line 1059
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    move v9, p2

    :goto_0
    if-ge v9, v8, :cond_1

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    move v2, v9

    move-object v3, v6

    move v5, v7

    .line 1062
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1063
    invoke-virtual {p0, v7, p1, v9}, Lorg/joda/time/format/PeriodFormatterBuilder$SimpleAffix;->matchesOtherAffix(ILjava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    return v9

    .line 1068
    :cond_0
    invoke-virtual {p1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    :pswitch_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    xor-int/lit8 p1, p2, -0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x2b
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
