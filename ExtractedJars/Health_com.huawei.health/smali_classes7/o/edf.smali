.class public Lo/edf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:I


# instance fields
.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/16 v0, 0xff

    sput v0, Lo/edf;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .line 136
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 137
    const/4 v0, 0x0

    return v0

    .line 140
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 141
    const/4 v0, 0x1

    return v0

    .line 143
    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v2, v0, :cond_7

    .line 144
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 145
    const/16 v0, 0x30

    if-gt v0, v3, :cond_2

    const/16 v0, 0x39

    if-ge v0, v3, :cond_6

    :cond_2
    const/16 v0, 0x41

    if-gt v0, v3, :cond_3

    const/16 v0, 0x5a

    if-ge v0, v3, :cond_6

    :cond_3
    const/16 v0, 0x61

    if-gt v0, v3, :cond_4

    const/16 v0, 0x7a

    if-ge v0, v3, :cond_6

    :cond_4
    const/16 v0, 0x2d

    if-ne v0, v3, :cond_5

    .line 146
    goto :goto_1

    .line 149
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 143
    :cond_6
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 152
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    move-object v3, p1

    .line 30
    const-string v0, "$"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    const-string v0, "$"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v0, 0x0

    if-ge v0, v1, :cond_0

    .line 35
    const/4 v0, 0x0

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 38
    :cond_0
    const-string v4, ""

    .line 40
    :goto_1
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 42
    const-string v0, "$"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    return-void
.end method

.method private c(Lo/pr;)Z
    .locals 2

    .line 48
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lo/pr;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 49
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 7

    .line 104
    invoke-virtual {p0, p1}, Lo/edf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 105
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "address:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 107
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 109
    :cond_1
    const-string v0, "."

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 110
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_2
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 114
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 115
    const/16 v0, 0x7e

    if-gt v5, v0, :cond_3

    const/16 v0, 0x21

    if-lt v5, v0, :cond_3

    .line 116
    goto :goto_1

    .line 119
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 113
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 122
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 123
    const/16 v0, 0x2d

    if-eq v0, v5, :cond_5

    const/16 v0, 0x5f

    if-eq v0, v5, :cond_5

    const/16 v0, 0x2e

    if-ne v0, v5, :cond_6

    .line 124
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 128
    const/16 v0, 0x2d

    if-eq v0, v5, :cond_7

    const/16 v0, 0x5f

    if-eq v0, v5, :cond_7

    const/16 v0, 0x2e

    if-ne v0, v5, :cond_8

    .line 129
    :cond_7
    const/4 v0, 0x0

    return v0

    .line 131
    :cond_8
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lo/pr;)Z
    .locals 2

    .line 156
    invoke-virtual {p0, p1}, Lo/edf;->d(Lo/pr;)Ljava/lang/String;

    move-result-object v1

    .line 157
    invoke-virtual {p0, v1}, Lo/edf;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 182
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 183
    const/4 v0, 0x0

    return-object v0

    .line 185
    :cond_0
    const/4 v4, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 186
    move v6, v5

    .line 187
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " last "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    :goto_0
    if-gt v4, v6, :cond_1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 191
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 193
    :cond_1
    :goto_1
    if-lt v6, v4, :cond_2

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 194
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 196
    :cond_2
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " end "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    if-nez v4, :cond_3

    if-ne v6, v5, :cond_3

    .line 198
    return-object p1

    .line 201
    :cond_3
    if-gt v4, v6, :cond_4

    .line 202
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 205
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lo/pr;)Z
    .locals 9

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x1

    .line 57
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "qrCodeInvalid enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-direct {p0, p1}, Lo/edf;->c(Lo/pr;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACcode is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x1

    return v0

    .line 64
    :cond_0
    invoke-virtual {p1}, Lo/pr;->toString()Ljava/lang/String;

    move-result-object v7

    .line 65
    const-string v0, "LPA:"

    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    const-string v0, "LPA:"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 68
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    .line 69
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "length:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "qrContent "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    sget v0, Lo/edf;->b:I

    if-gt v8, v0, :cond_2

    const-string v0, "1$"

    invoke-virtual {v7, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 71
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 74
    :cond_3
    invoke-direct {p0, v7}, Lo/edf;->c(Ljava/lang/String;)V

    .line 75
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "qrElement "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-gt v0, v1, :cond_4

    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_5

    .line 77
    :cond_4
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACcode is invalide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x1

    return v0

    .line 81
    :cond_5
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SM-DP+ Address "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_7

    .line 83
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/edf;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/edf;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "1"

    iget-object v1, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 84
    const/4 v6, 0x0

    goto :goto_0

    .line 87
    :cond_6
    const/4 v6, 0x1

    goto :goto_0

    .line 91
    :cond_7
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/edf;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/edf;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 92
    const/4 v6, 0x0

    goto :goto_0

    .line 95
    :cond_8
    const/4 v6, 0x1

    .line 100
    :goto_0
    return v6
.end method

.method public d(Lo/pr;)Ljava/lang/String;
    .locals 4

    .line 161
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getConformCode enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-virtual {p0, p1}, Lo/edf;->b(Lo/pr;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const/4 v0, 0x0

    return-object v0

    .line 166
    :cond_0
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-eq v1, v0, :cond_1

    .line 167
    const-string v0, "QrCodeDataParse"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "element length is not "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const/4 v0, 0x0

    return-object v0

    .line 170
    :cond_1
    iget-object v0, p0, Lo/edf;->d:Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 1

    .line 175
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 176
    const/4 v0, 0x0

    return v0

    .line 178
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
