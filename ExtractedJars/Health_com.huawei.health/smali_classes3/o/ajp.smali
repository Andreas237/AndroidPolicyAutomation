.class public Lo/ajp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[B


# instance fields
.field private a:I

.field private b:I

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:Ljava/lang/String;

.field private k:I

.field private m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/ajp;->c:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v2, -0x1

    .line 64
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lo/ajp;->c(C)I

    move-result v2

    .line 67
    :cond_0
    and-int/lit8 v0, v2, 0x3

    iput v0, p0, Lo/ajp;->d:I

    .line 68
    ushr-int/lit8 v0, v2, 0x2

    and-int/lit8 v0, v0, 0x3

    iput v0, p0, Lo/ajp;->a:I

    .line 69
    ushr-int/lit8 v0, v2, 0x4

    and-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ajp;->k:I

    .line 70
    ushr-int/lit8 v0, v2, 0x5

    and-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ajp;->h:I

    .line 71
    iget v0, p0, Lo/ajp;->d:I

    invoke-direct {p0, v0}, Lo/ajp;->b(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ajp;->f:Ljava/lang/String;

    .line 72
    iget v0, p0, Lo/ajp;->a:I

    invoke-direct {p0, v0}, Lo/ajp;->b(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ajp;->g:Ljava/lang/String;

    .line 73
    iget v0, p0, Lo/ajp;->k:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ajp;->i:Ljava/lang/String;

    .line 74
    iget v0, p0, Lo/ajp;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ajp;->m:Ljava/lang/String;

    .line 75
    iget-object v0, p0, Lo/ajp;->f:Ljava/lang/String;

    iget-object v1, p0, Lo/ajp;->g:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ajp;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method private b(I)Ljava/lang/String;
    .locals 3

    .line 117
    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 121
    :cond_0
    return-object v2
.end method

.method private c(C)I
    .locals 2

    .line 126
    const/4 v1, 0x0

    :goto_0
    sget-object v0, Lo/ajp;->c:[B

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 127
    sget-object v0, Lo/ajp;->c:[B

    aget-byte v0, v0, v1

    if-ne p1, v0, :cond_0

    .line 128
    return v1

    .line 126
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 131
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 79
    const-string v0, "00"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/ajp;->b:I

    goto/16 :goto_0

    .line 81
    :cond_0
    const-string v0, "01"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 82
    const/4 v0, 0x1

    iput v0, p0, Lo/ajp;->b:I

    .line 83
    const-string v0, "00"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    const/16 v0, 0x64

    iput v0, p0, Lo/ajp;->e:I

    goto/16 :goto_0

    .line 85
    :cond_1
    const-string v0, "01"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 86
    const/16 v0, 0x65

    iput v0, p0, Lo/ajp;->e:I

    goto/16 :goto_0

    .line 87
    :cond_2
    const-string v0, "10"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 88
    const/16 v0, 0x6e

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 90
    :cond_3
    const/16 v0, 0x7d0

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 92
    :cond_4
    const-string v0, "10"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 93
    const/16 v0, 0xa

    iput v0, p0, Lo/ajp;->b:I

    .line 94
    const-string v0, "00"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 95
    const/16 v0, 0x3e8

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 96
    :cond_5
    const-string v0, "01"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 97
    const/16 v0, 0x3e9

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 99
    :cond_6
    const/16 v0, 0x7d0

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 101
    :cond_7
    const-string v0, "11"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 102
    const/16 v0, 0xb

    iput v0, p0, Lo/ajp;->b:I

    .line 103
    const-string v0, "00"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 104
    const/16 v0, 0x44c

    iput v0, p0, Lo/ajp;->e:I

    goto :goto_0

    .line 106
    :cond_8
    const/16 v0, 0x7d0

    iput v0, p0, Lo/ajp;->e:I

    .line 109
    :cond_9
    :goto_0
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 135
    iget v0, p0, Lo/ajp;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EncryptProtal [mEncryptAlgorithm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mEncryptMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n, mIntBit01="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mIntBit23="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mIntBit4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mIntBit5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/ajp;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n, mStrBit01="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ajp;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStrBit23="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ajp;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStrBit4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ajp;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mStrBit5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/ajp;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
