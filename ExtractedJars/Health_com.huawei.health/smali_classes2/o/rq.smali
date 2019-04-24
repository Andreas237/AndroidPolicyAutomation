.class final Lo/rq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/text/NumberFormat;

.field private static final b:[Ljava/lang/String;

.field private static final e:Ljava/text/NumberFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 48
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "000000000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/rq;->e:Ljava/text/NumberFormat;

    .line 49
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "000"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo/rq;->a:Ljava/text/NumberFormat;

    .line 51
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb \ufffc\"#$%&\'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{\ufffc}~\u007f;<=>?[\\]^_ ,./:@!|\ufffc\ufff5\ufff6\ufffc\ufff0\ufff2\ufff3\ufff4\ufff7"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c6\u00c7\u00c8\u00c9\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf\u00d0\u00d1\u00d2\u00d3\u00d4\u00d5\u00d6\u00d7\u00d8\u00d9\u00da\ufffa\u001c\u001d\u001e\u00db\u00dc\u00dd\u00de\u00df\u00aa\u00ac\u00b1\u00b2\u00b3\u00b5\u00b9\u00ba\u00bc\u00bd\u00be\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "\u00e0\u00e1\u00e2\u00e3\u00e4\u00e5\u00e6\u00e7\u00e8\u00e9\u00ea\u00eb\u00ec\u00ed\u00ee\u00ef\u00f0\u00f1\u00f2\u00f3\u00f4\u00f5\u00f6\u00f7\u00f8\u00f9\u00fa\ufffa\u001c\u001d\u001e\ufffb\u00fb\u00fc\u00fd\u00fe\u00ff\u00a1\u00a8\u00ab\u00af\u00b0\u00b4\u00b7\u00b8\u00bb\u00bf\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa\ufffc\ufffc\u001b\ufffb\u001c\u001d\u001e\u001f\u009f\u00a0\u00a2\u00a3\u00a4\u00a5\u00a6\u00a7\u00a9\u00ad\u00ae\u00b6\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>?"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/rq;->b:[Ljava/lang/String;

    return-void
.end method

.method private static a([B)Ljava/lang/String;
    .locals 3

    .line 129
    const/4 v0, 0x6

    new-array v0, v0, [C

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    .line 131
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x0

    aput-char v1, v0, v2

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    .line 132
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x1

    aput-char v1, v0, v2

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_2

    .line 133
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x2

    aput-char v1, v0, v2

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_3

    .line 134
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x3

    aput-char v1, v0, v2

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_4

    .line 135
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x4

    aput-char v1, v0, v2

    sget-object v1, Lo/rq;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_5

    .line 136
    invoke-static {p0, v2}, Lo/rq;->b([B[B)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/4 v2, 0x5

    aput-char v1, v0, v2

    .line 129
    invoke-static {v0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        0x27t
        0x28t
        0x29t
        0x2at
        0x1ft
        0x20t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x21t
        0x22t
        0x23t
        0x24t
        0x19t
        0x1at
    .end array-data

    nop

    :array_2
    .array-data 1
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x13t
        0x14t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x15t
        0x16t
        0x17t
        0x18t
        0xdt
        0xet
    .end array-data

    nop

    :array_4
    .array-data 1
        0xft
        0x10t
        0x11t
        0x12t
        0x7t
        0x8t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x9t
        0xat
        0xbt
        0xct
        0x1t
        0x2t
    .end array-data
.end method

.method private static b([B)I
    .locals 1

    .line 112
    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p0, v0}, Lo/rq;->b([B[B)I

    move-result v0

    return v0

    :array_0
    .array-data 1
        0x35t
        0x36t
        0x2bt
        0x2ct
        0x2dt
        0x2et
        0x2ft
        0x30t
        0x25t
        0x26t
    .end array-data
.end method

.method private static b([B[B)I
    .locals 5

    .line 101
    array-length v0, p1

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 104
    :cond_0
    const/4 v3, 0x0

    .line 105
    const/4 v4, 0x0

    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_1

    .line 106
    aget-byte v0, p1, v4

    invoke-static {v0, p0}, Lo/rq;->e(I[B)I

    move-result v0

    array-length v1, p1

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    shl-int/2addr v0, v1

    add-int/2addr v3, v0

    .line 105
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 108
    :cond_1
    return v3
.end method

.method private static c([B)I
    .locals 1

    .line 116
    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p0, v0}, Lo/rq;->b([B[B)I

    move-result v0

    return v0

    :array_0
    .array-data 1
        0x37t
        0x38t
        0x39t
        0x3at
        0x3bt
        0x3ct
        0x31t
        0x32t
        0x33t
        0x34t
    .end array-data
.end method

.method private static c([BII)Ljava/lang/String;
    .locals 10

    .line 142
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    const/4 v4, -0x1

    .line 144
    const/4 v5, 0x0

    .line 145
    const/4 v6, 0x0

    .line 146
    move v7, p1

    :goto_0
    add-int v0, p1, p2

    if-ge v7, v0, :cond_1

    .line 147
    sget-object v0, Lo/rq;->b:[Ljava/lang/String;

    aget-object v0, v0, v5

    aget-byte v1, p0, v7

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 148
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_1

    .line 150
    :pswitch_0
    const/4 v5, 0x0

    .line 151
    const/4 v4, -0x1

    .line 152
    goto/16 :goto_2

    .line 154
    :pswitch_1
    const/4 v5, 0x1

    .line 155
    const/4 v4, -0x1

    .line 156
    goto/16 :goto_2

    .line 162
    :pswitch_2
    move v6, v5

    .line 163
    const v0, 0xfff0

    sub-int v5, v8, v0

    .line 164
    const/4 v4, 0x1

    .line 165
    goto :goto_2

    .line 167
    :pswitch_3
    move v6, v5

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v4, 0x2

    .line 170
    goto :goto_2

    .line 172
    :pswitch_4
    move v6, v5

    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v4, 0x3

    .line 175
    goto :goto_2

    .line 177
    :pswitch_5
    add-int/lit8 v7, v7, 0x1

    aget-byte v0, p0, v7

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p0, v7

    shl-int/lit8 v1, v1, 0x12

    add-int/2addr v0, v1

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p0, v7

    shl-int/lit8 v1, v1, 0xc

    add-int/2addr v0, v1

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p0, v7

    shl-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    add-int/lit8 v7, v7, 0x1

    aget-byte v1, p0, v7

    add-int v9, v0, v1

    .line 178
    sget-object v0, Lo/rq;->e:Ljava/text/NumberFormat;

    int-to-long v1, v9

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    goto :goto_2

    .line 181
    :pswitch_6
    const/4 v4, -0x1

    .line 182
    goto :goto_2

    .line 184
    :goto_1
    :pswitch_7
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    :goto_2
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-nez v0, :cond_0

    .line 187
    move v5, v6

    .line 146
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 190
    :cond_1
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const v1, 0xfffc

    if-ne v0, v1, :cond_2

    .line 191
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_3

    .line 193
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xfff0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_7
        :pswitch_5
    .end packed-switch
.end method

.method static c([BI)Lo/qn;
    .locals 8

    .line 64
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x90

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 69
    :pswitch_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 70
    invoke-static {p0}, Lo/rq;->d([B)I

    move-result v6

    .line 71
    new-instance v7, Ljava/text/DecimalFormat;

    const-string v0, "0000000000"

    invoke-static {p0}, Lo/rq;->e([B)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 72
    int-to-long v0, v6

    invoke-virtual {v7, v0, v1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v5

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-static {p0}, Lo/rq;->a([B)Ljava/lang/String;

    move-result-object v5

    .line 76
    :goto_0
    sget-object v0, Lo/rq;->a:Ljava/text/NumberFormat;

    invoke-static {p0}, Lo/rq;->b([B)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v6

    .line 77
    sget-object v0, Lo/rq;->a:Ljava/text/NumberFormat;

    invoke-static {p0}, Lo/rq;->c([B)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v7

    .line 78
    const/16 v0, 0xa

    const/16 v1, 0x54

    invoke-static {p0, v0, v1}, Lo/rq;->c([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[)>\u001e01\u001d"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v4, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 82
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    goto :goto_1

    .line 86
    :pswitch_1
    const/4 v0, 0x1

    const/16 v1, 0x5d

    invoke-static {p0, v0, v1}, Lo/rq;->c([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    goto :goto_1

    .line 89
    :pswitch_2
    const/4 v0, 0x1

    const/16 v1, 0x4d

    invoke-static {p0, v0, v1}, Lo/rq;->c([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    :goto_1
    new-instance v0, Lo/qn;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v3, v2}, Lo/qn;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static d([B)I
    .locals 1

    .line 124
    const/16 v0, 0x1e

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p0, v0}, Lo/rq;->b([B[B)I

    move-result v0

    return v0

    :array_0
    .array-data 1
        0x21t
        0x22t
        0x23t
        0x24t
        0x19t
        0x1at
        0x1bt
        0x1ct
        0x1dt
        0x1et
        0x13t
        0x14t
        0x15t
        0x16t
        0x17t
        0x18t
        0xdt
        0xet
        0xft
        0x10t
        0x11t
        0x12t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0x1t
        0x2t
    .end array-data
.end method

.method private static e(I[B)I
    .locals 3

    .line 96
    add-int/lit8 p0, p0, -0x1

    .line 97
    div-int/lit8 v0, p0, 0x6

    aget-byte v0, p1, v0

    rem-int/lit8 v1, p0, 0x6

    rsub-int/lit8 v1, v1, 0x5

    const/4 v2, 0x1

    shl-int v1, v2, v1

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private static e([B)I
    .locals 1

    .line 120
    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {p0, v0}, Lo/rq;->b([B[B)I

    move-result v0

    return v0

    nop

    :array_0
    .array-data 1
        0x27t
        0x28t
        0x29t
        0x2at
        0x1ft
        0x20t
    .end array-data
.end method
