.class Lo/dss;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[C

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dss;->a:[C

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/dss;->c:I

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Lo/dss;->b:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/dss;->d:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/dss;->e:I

    .line 38
    return-void
.end method

.method private a(Z)Ljava/lang/String;
    .locals 5

    .line 54
    :goto_0
    iget v0, p0, Lo/dss;->d:I

    iget v1, p0, Lo/dss;->e:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->d:I

    aget-char v0, v0, v1

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    iget v0, p0, Lo/dss;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->d:I

    goto :goto_0

    .line 58
    :cond_0
    :goto_1
    iget v0, p0, Lo/dss;->e:I

    iget v1, p0, Lo/dss;->d:I

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->e:I

    add-int/lit8 v1, v1, -0x1

    aget-char v0, v0, v1

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 59
    iget v0, p0, Lo/dss;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/dss;->e:I

    goto :goto_1

    .line 62
    :cond_1
    if-eqz p1, :cond_2

    .line 63
    iget v0, p0, Lo/dss;->e:I

    iget v1, p0, Lo/dss;->d:I

    sub-int/2addr v0, v1

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->e:I

    add-int/lit8 v1, v1, -0x1

    aget-char v0, v0, v1

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    .line 66
    iget v0, p0, Lo/dss;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->d:I

    .line 67
    iget v0, p0, Lo/dss;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/dss;->e:I

    .line 70
    :cond_2
    const/4 v4, 0x0

    .line 71
    iget v0, p0, Lo/dss;->e:I

    iget v1, p0, Lo/dss;->d:I

    if-lt v0, v1, :cond_3

    .line 72
    new-instance v4, Ljava/lang/String;

    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->d:I

    iget v2, p0, Lo/dss;->e:I

    iget v3, p0, Lo/dss;->d:I

    sub-int/2addr v2, v3

    invoke-direct {v4, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 74
    :cond_3
    return-object v4
.end method

.method private c([C)Ljava/lang/String;
    .locals 3

    .line 99
    iget v0, p0, Lo/dss;->c:I

    iput v0, p0, Lo/dss;->d:I

    .line 100
    iget v0, p0, Lo/dss;->c:I

    iput v0, p0, Lo/dss;->e:I

    .line 101
    :goto_0
    invoke-direct {p0}, Lo/dss;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->c:I

    aget-char v2, v0, v1

    .line 103
    invoke-direct {p0, v2, p1}, Lo/dss;->c(C[C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    goto :goto_1

    .line 106
    :cond_0
    iget v0, p0, Lo/dss;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->e:I

    .line 107
    iget v0, p0, Lo/dss;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->c:I

    goto :goto_0

    .line 109
    :cond_1
    :goto_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dss;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(C[C)Z
    .locals 6

    .line 82
    const/4 v1, 0x0

    .line 83
    move-object v2, p2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-char v5, v2, v4

    .line 84
    if-ne p1, v5, :cond_0

    .line 85
    const/4 v1, 0x1

    .line 86
    goto :goto_1

    .line 83
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 89
    :cond_1
    :goto_1
    return v1
.end method

.method private d([C)Ljava/lang/String;
    .locals 5

    .line 120
    iget v0, p0, Lo/dss;->c:I

    iput v0, p0, Lo/dss;->d:I

    .line 121
    iget v0, p0, Lo/dss;->c:I

    iput v0, p0, Lo/dss;->e:I

    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    :goto_0
    invoke-direct {p0}, Lo/dss;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 125
    iget-object v0, p0, Lo/dss;->a:[C

    iget v1, p0, Lo/dss;->c:I

    aget-char v2, v0, v1

    .line 126
    if-nez v3, :cond_0

    invoke-direct {p0, v2, p1}, Lo/dss;->c(C[C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    goto :goto_3

    .line 129
    :cond_0
    if-nez v4, :cond_2

    const/16 v0, 0x22

    if-ne v2, v0, :cond_2

    .line 130
    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 132
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    const/16 v0, 0x5c

    if-ne v2, v0, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    .line 133
    :goto_2
    iget v0, p0, Lo/dss;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->e:I

    .line 134
    iget v0, p0, Lo/dss;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->c:I

    goto :goto_0

    .line 137
    :cond_4
    :goto_3
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dss;->a(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d([CC)Ljava/util/List;
    .locals 2

    .line 164
    if-nez p1, :cond_0

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 167
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, p2}, Lo/dss;->e([CIIC)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private e([CIIC)Ljava/util/List;
    .locals 6

    .line 183
    if-nez p1, :cond_0

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 186
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 187
    iput-object p1, p0, Lo/dss;->a:[C

    .line 188
    iput p2, p0, Lo/dss;->c:I

    .line 189
    iput p3, p0, Lo/dss;->b:I

    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v5, 0x0

    .line 193
    :cond_1
    :goto_0
    invoke-direct {p0}, Lo/dss;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 194
    const/4 v0, 0x2

    new-array v0, v0, [C

    const/16 v1, 0x3d

    const/4 v2, 0x0

    aput-char v1, v0, v2

    const/4 v1, 0x1

    aput-char p4, v0, v1

    invoke-direct {p0, v0}, Lo/dss;->c([C)Ljava/lang/String;

    move-result-object v4

    .line 195
    const/4 v5, 0x0

    .line 196
    invoke-direct {p0}, Lo/dss;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lo/dss;->c:I

    aget-char v0, p1, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_2

    .line 197
    iget v0, p0, Lo/dss;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->c:I

    .line 198
    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    aput-char p4, v0, v1

    invoke-direct {p0, v0}, Lo/dss;->d([C)Ljava/lang/String;

    move-result-object v5

    .line 200
    :cond_2
    invoke-direct {p0}, Lo/dss;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lo/dss;->c:I

    aget-char v0, p1, v0

    if-ne v0, p4, :cond_3

    .line 201
    iget v0, p0, Lo/dss;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dss;->c:I

    .line 203
    :cond_3
    if-eqz v4, :cond_1

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v5, :cond_1

    .line 204
    :cond_4
    new-instance v0, Lo/dsv;

    invoke-direct {v0, v4, v5}, Lo/dsv;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 207
    :cond_5
    return-object v3
.end method

.method private e()Z
    .locals 2

    .line 45
    iget v0, p0, Lo/dss;->c:I

    iget v1, p0, Lo/dss;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method e(Ljava/lang/String;C)Ljava/util/List;
    .locals 1

    .line 148
    if-nez p1, :cond_0

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 151
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lo/dss;->d([CC)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
