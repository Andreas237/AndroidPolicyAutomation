.class final Lo/ud;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Lo/tx;

.field private final e:[I


# direct methods
.method constructor <init>(Lo/tx;[I)V
    .locals 5

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    array-length v0, p2

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 32
    :cond_0
    iput-object p1, p0, Lo/ud;->d:Lo/tx;

    .line 33
    array-length v3, p2

    .line 34
    const/4 v0, 0x1

    if-le v3, v0, :cond_3

    const/4 v0, 0x0

    aget v0, p2, v0

    if-nez v0, :cond_3

    .line 36
    const/4 v4, 0x1

    .line 37
    :goto_0
    if-ge v4, v3, :cond_1

    aget v0, p2, v4

    if-nez v0, :cond_1

    .line 38
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 40
    :cond_1
    if-ne v4, v3, :cond_2

    .line 41
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ud;->e:[I

    goto :goto_1

    .line 43
    :cond_2
    sub-int v0, v3, v4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/ud;->e:[I

    .line 44
    iget-object v0, p0, Lo/ud;->e:[I

    iget-object v1, p0, Lo/ud;->e:[I

    array-length v1, v1

    const/4 v2, 0x0

    invoke-static {p2, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    :goto_1
    goto :goto_2

    .line 51
    :cond_3
    iput-object p2, p0, Lo/ud;->e:[I

    .line 53
    :goto_2
    return-void

    nop

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method


# virtual methods
.method a(I)I
    .locals 9

    .line 84
    if-nez p1, :cond_0

    .line 86
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ud;->d(I)I

    move-result v0

    return v0

    .line 88
    :cond_0
    iget-object v0, p0, Lo/ud;->e:[I

    array-length v3, v0

    .line 89
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 91
    const/4 v4, 0x0

    .line 92
    iget-object v5, p0, Lo/ud;->e:[I

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget v8, v5, v7

    .line 93
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0, v4, v8}, Lo/tx;->d(II)I

    move-result v4

    .line 92
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 95
    :cond_1
    return v4

    .line 97
    :cond_2
    iget-object v0, p0, Lo/ud;->e:[I

    const/4 v1, 0x0

    aget v4, v0, v1

    .line 98
    const/4 v5, 0x1

    :goto_1
    if-ge v5, v3, :cond_3

    .line 99
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-virtual {v1, p1, v4}, Lo/tx;->e(II)I

    move-result v1

    iget-object v2, p0, Lo/ud;->e:[I

    aget v2, v2, v5

    invoke-virtual {v0, v1, v2}, Lo/tx;->d(II)I

    move-result v4

    .line 98
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 101
    :cond_3
    return v4
.end method

.method a(Lo/ud;)Lo/ud;
    .locals 2

    .line 135
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p1, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_0
    invoke-virtual {p1}, Lo/ud;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    return-object p0

    .line 141
    :cond_1
    invoke-virtual {p1}, Lo/ud;->b()Lo/ud;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ud;->e(Lo/ud;)Lo/ud;

    move-result-object v0

    return-object v0
.end method

.method a()Z
    .locals 2

    .line 70
    iget-object v0, p0, Lo/ud;->e:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method b()Lo/ud;
    .locals 6

    .line 166
    iget-object v0, p0, Lo/ud;->e:[I

    array-length v3, v0

    .line 167
    new-array v4, v3, [I

    .line 168
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 169
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p0, Lo/ud;->e:[I

    aget v1, v1, v5

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/tx;->c(II)I

    move-result v0

    aput v0, v4, v5

    .line 168
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 171
    :cond_0
    new-instance v0, Lo/ud;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-direct {v0, v1, v4}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method b(I)Lo/ud;
    .locals 5

    .line 175
    if-nez p1, :cond_0

    .line 176
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->b()Lo/ud;

    move-result-object v0

    return-object v0

    .line 178
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 179
    return-object p0

    .line 181
    :cond_1
    iget-object v0, p0, Lo/ud;->e:[I

    array-length v2, v0

    .line 182
    new-array v3, v2, [I

    .line 183
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 184
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p0, Lo/ud;->e:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1, p1}, Lo/tx;->e(II)I

    move-result v0

    aput v0, v3, v4

    .line 183
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 186
    :cond_2
    new-instance v0, Lo/ud;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-direct {v0, v1, v3}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method b(II)Lo/ud;
    .locals 5

    .line 190
    if-gez p1, :cond_0

    .line 191
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 193
    :cond_0
    if-nez p2, :cond_1

    .line 194
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->b()Lo/ud;

    move-result-object v0

    return-object v0

    .line 196
    :cond_1
    iget-object v0, p0, Lo/ud;->e:[I

    array-length v2, v0

    .line 197
    add-int v0, v2, p1

    new-array v3, v0, [I

    .line 198
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 199
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p0, Lo/ud;->e:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1, p2}, Lo/tx;->e(II)I

    move-result v0

    aput v0, v3, v4

    .line 198
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 201
    :cond_2
    new-instance v0, Lo/ud;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-direct {v0, v1, v3}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method c(Lo/ud;)Lo/ud;
    .locals 13

    .line 145
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p1, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_0
    invoke-virtual {p0}, Lo/ud;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/ud;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    :cond_1
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0}, Lo/tx;->b()Lo/ud;

    move-result-object v0

    return-object v0

    .line 151
    :cond_2
    iget-object v5, p0, Lo/ud;->e:[I

    .line 152
    array-length v6, v5

    .line 153
    iget-object v7, p1, Lo/ud;->e:[I

    .line 154
    array-length v8, v7

    .line 155
    add-int v0, v6, v8

    add-int/lit8 v0, v0, -0x1

    new-array v9, v0, [I

    .line 156
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v6, :cond_4

    .line 157
    aget v11, v5, v10

    .line 158
    const/4 v12, 0x0

    :goto_1
    if-ge v12, v8, :cond_3

    .line 159
    add-int v0, v10, v12

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    add-int v2, v10, v12

    aget v2, v9, v2

    iget-object v3, p0, Lo/ud;->d:Lo/tx;

    aget v4, v7, v12

    invoke-virtual {v3, v11, v4}, Lo/tx;->e(II)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lo/tx;->d(II)I

    move-result v1

    aput v1, v9, v0

    .line 158
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 156
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 162
    :cond_4
    new-instance v0, Lo/ud;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-direct {v0, v1, v9}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method d()I
    .locals 2

    .line 63
    iget-object v0, p0, Lo/ud;->e:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method d(I)I
    .locals 3

    .line 77
    iget-object v0, p0, Lo/ud;->e:[I

    iget-object v1, p0, Lo/ud;->e:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    aget v0, v0, v1

    return v0
.end method

.method e(Lo/ud;)Lo/ud;
    .locals 8

    .line 105
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    iget-object v1, p1, Lo/ud;->d:Lo/tx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ModulusPolys do not have same ModulusGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_0
    invoke-virtual {p0}, Lo/ud;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    return-object p1

    .line 111
    :cond_1
    invoke-virtual {p1}, Lo/ud;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    return-object p0

    .line 115
    :cond_2
    iget-object v3, p0, Lo/ud;->e:[I

    .line 116
    iget-object v4, p1, Lo/ud;->e:[I

    .line 117
    array-length v0, v3

    array-length v1, v4

    if-le v0, v1, :cond_3

    .line 118
    move-object v5, v3

    .line 119
    move-object v3, v4

    .line 120
    move-object v4, v5

    .line 122
    :cond_3
    array-length v0, v4

    new-array v5, v0, [I

    .line 123
    array-length v0, v4

    array-length v1, v3

    sub-int v6, v0, v1

    .line 125
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v4, v0, v5, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 127
    move v7, v6

    :goto_0
    array-length v0, v4

    if-ge v7, v0, :cond_4

    .line 128
    iget-object v0, p0, Lo/ud;->d:Lo/tx;

    sub-int v1, v7, v6

    aget v1, v3, v1

    aget v2, v4, v7

    invoke-virtual {v0, v1, v2}, Lo/tx;->d(II)I

    move-result v0

    aput v0, v5, v7

    .line 127
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 131
    :cond_4
    new-instance v0, Lo/ud;

    iget-object v1, p0, Lo/ud;->d:Lo/tx;

    invoke-direct {v0, v1, v5}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 232
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo/ud;->d()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 233
    invoke-virtual {p0}, Lo/ud;->d()I

    move-result v3

    :goto_0
    if-ltz v3, :cond_6

    .line 234
    invoke-virtual {p0, v3}, Lo/ud;->d(I)I

    move-result v4

    .line 235
    if-eqz v4, :cond_5

    .line 236
    if-gez v4, :cond_0

    .line 237
    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    neg-int v4, v4

    goto :goto_1

    .line 240
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 241
    const-string v0, " + "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    const/4 v0, 0x1

    if-eq v4, v0, :cond_3

    .line 245
    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    :cond_3
    if-eqz v3, :cond_5

    .line 248
    const/4 v0, 0x1

    if-ne v3, v0, :cond_4

    .line 249
    const/16 v0, 0x78

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 251
    :cond_4
    const-string v0, "x^"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 257
    :cond_6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
