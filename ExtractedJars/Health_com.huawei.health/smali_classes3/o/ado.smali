.class public Lo/ado;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:C

.field private static final b:C

.field private static final c:[C

.field private static final d:C

.field private static final e:C

.field private static final f:C

.field private static final g:C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 7
    const/16 v0, 0x40

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/ado;->c:[C

    .line 13
    const-string v0, "00000011"

    .line 14
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->d:C

    .line 15
    const-string v0, "00001111"

    .line 16
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->e:C

    .line 17
    const-string v0, "00111111"

    .line 18
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->b:C

    .line 19
    const-string v0, "11111100"

    .line 20
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->a:C

    .line 21
    const-string v0, "11110000"

    .line 22
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->f:C

    .line 23
    const-string v0, "11000000"

    .line 24
    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    sput-char v0, Lo/ado;->g:C

    .line 23
    return-void

    :array_0
    .array-data 2
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x2bs
        0x2fs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 8

    .line 27
    new-instance v4, Ljava/lang/StringBuffer;

    array-length v0, p0

    int-to-double v0, v0

    const-wide v2, 0x3ff570a3d70a3d71L    # 1.34

    mul-double/2addr v0, v2

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x3

    invoke-direct {v4, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    :goto_0
    array-length v0, p0

    if-ge v7, v0, :cond_2

    .line 31
    rem-int/lit8 v5, v5, 0x8

    .line 32
    :goto_1
    const/16 v0, 0x8

    if-ge v5, v0, :cond_1

    .line 33
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_2

    .line 35
    :pswitch_0
    aget-byte v0, p0, v7

    sget-char v1, Lo/ado;->a:C

    and-int/2addr v0, v1

    int-to-char v6, v0

    .line 36
    ushr-int/lit8 v0, v6, 0x2

    int-to-char v6, v0

    .line 37
    goto :goto_2

    .line 39
    :pswitch_1
    aget-byte v0, p0, v7

    sget-char v1, Lo/ado;->b:C

    and-int/2addr v0, v1

    int-to-char v6, v0

    .line 40
    goto :goto_2

    .line 42
    :pswitch_2
    aget-byte v0, p0, v7

    sget-char v1, Lo/ado;->e:C

    and-int/2addr v0, v1

    int-to-char v6, v0

    .line 43
    shl-int/lit8 v0, v6, 0x2

    int-to-char v6, v0

    .line 44
    add-int/lit8 v0, v7, 0x1

    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 45
    add-int/lit8 v0, v7, 0x1

    aget-byte v0, p0, v0

    sget-char v1, Lo/ado;->g:C

    and-int/2addr v0, v1

    ushr-int/lit8 v0, v0, 0x6

    or-int/2addr v0, v6

    int-to-char v6, v0

    goto :goto_2

    .line 49
    :pswitch_3
    aget-byte v0, p0, v7

    sget-char v1, Lo/ado;->d:C

    and-int/2addr v0, v1

    int-to-char v6, v0

    .line 50
    shl-int/lit8 v0, v6, 0x4

    int-to-char v6, v0

    .line 51
    add-int/lit8 v0, v7, 0x1

    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 52
    add-int/lit8 v0, v7, 0x1

    aget-byte v0, p0, v0

    sget-char v1, Lo/ado;->f:C

    and-int/2addr v0, v1

    ushr-int/lit8 v0, v0, 0x4

    or-int/2addr v0, v6

    int-to-char v6, v0

    .line 59
    :cond_0
    :goto_2
    :pswitch_4
    sget-object v0, Lo/ado;->c:[C

    aget-char v0, v0, v6

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 60
    add-int/lit8 v5, v5, 0x6

    goto/16 :goto_1

    .line 30
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 63
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x4

    rsub-int/lit8 v7, v0, 0x4

    :goto_3
    if-lez v7, :cond_3

    .line 65
    const-string v0, "="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 64
    add-int/lit8 v7, v7, -0x1

    goto :goto_3

    .line 68
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
