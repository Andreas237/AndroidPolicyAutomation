.class final Lo/qz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[I

.field private final c:Lo/qx;


# direct methods
.method constructor <init>(Lo/qx;[I)V
    .locals 5

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    array-length v0, p2

    if-nez v0, :cond_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 46
    :cond_0
    iput-object p1, p0, Lo/qz;->c:Lo/qx;

    .line 47
    array-length v3, p2

    .line 48
    const/4 v0, 0x1

    if-le v3, v0, :cond_3

    const/4 v0, 0x0

    aget v0, p2, v0

    if-nez v0, :cond_3

    .line 50
    const/4 v4, 0x1

    .line 51
    :goto_0
    if-ge v4, v3, :cond_1

    aget v0, p2, v4

    if-nez v0, :cond_1

    .line 52
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 54
    :cond_1
    if-ne v4, v3, :cond_2

    .line 55
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/qz;->a:[I

    goto :goto_1

    .line 57
    :cond_2
    sub-int v0, v3, v4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/qz;->a:[I

    .line 58
    iget-object v0, p0, Lo/qz;->a:[I

    iget-object v1, p0, Lo/qz;->a:[I

    array-length v1, v1

    const/4 v2, 0x0

    invoke-static {p2, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    :goto_1
    goto :goto_2

    .line 65
    :cond_3
    iput-object p2, p0, Lo/qz;->a:[I

    .line 67
    :goto_2
    return-void

    nop

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method


# virtual methods
.method a(I)Lo/qz;
    .locals 5

    .line 171
    if-nez p1, :cond_0

    .line 172
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 175
    return-object p0

    .line 177
    :cond_1
    iget-object v0, p0, Lo/qz;->a:[I

    array-length v2, v0

    .line 178
    new-array v3, v2, [I

    .line 179
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 180
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    iget-object v1, p0, Lo/qz;->a:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1, p1}, Lo/qx;->a(II)I

    move-result v0

    aput v0, v3, v4

    .line 179
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 182
    :cond_2
    new-instance v0, Lo/qz;

    iget-object v1, p0, Lo/qz;->c:Lo/qx;

    invoke-direct {v0, v1, v3}, Lo/qz;-><init>(Lo/qx;[I)V

    return-object v0
.end method

.method b()[I
    .locals 1

    .line 70
    iget-object v0, p0, Lo/qz;->a:[I

    return-object v0
.end method

.method c(I)I
    .locals 8

    .line 98
    if-nez p1, :cond_0

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/qz;->e(I)I

    move-result v0

    return v0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/qz;->a:[I

    array-length v2, v0

    .line 103
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 105
    const/4 v3, 0x0

    .line 106
    iget-object v4, p0, Lo/qz;->a:[I

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget v7, v4, v6

    .line 107
    invoke-static {v3, v7}, Lo/qx;->e(II)I

    move-result v3

    .line 106
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 109
    :cond_1
    return v3

    .line 111
    :cond_2
    iget-object v0, p0, Lo/qz;->a:[I

    const/4 v1, 0x0

    aget v3, v0, v1

    .line 112
    const/4 v4, 0x1

    :goto_1
    if-ge v4, v2, :cond_3

    .line 113
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, p1, v3}, Lo/qx;->a(II)I

    move-result v0

    iget-object v1, p0, Lo/qz;->a:[I

    aget v1, v1, v4

    invoke-static {v0, v1}, Lo/qx;->e(II)I

    move-result v3

    .line 112
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 115
    :cond_3
    return v3
.end method

.method c(Lo/qz;)Lo/qz;
    .locals 12

    .line 149
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    iget-object v1, p1, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 150
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 152
    :cond_0
    invoke-virtual {p0}, Lo/qz;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo/qz;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    :cond_1
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v0

    return-object v0

    .line 155
    :cond_2
    iget-object v4, p0, Lo/qz;->a:[I

    .line 156
    array-length v5, v4

    .line 157
    iget-object v6, p1, Lo/qz;->a:[I

    .line 158
    array-length v7, v6

    .line 159
    add-int v0, v5, v7

    add-int/lit8 v0, v0, -0x1

    new-array v8, v0, [I

    .line 160
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v5, :cond_4

    .line 161
    aget v10, v4, v9

    .line 162
    const/4 v11, 0x0

    :goto_1
    if-ge v11, v7, :cond_3

    .line 163
    add-int v0, v9, v11

    add-int v1, v9, v11

    aget v1, v8, v1

    iget-object v2, p0, Lo/qz;->c:Lo/qx;

    aget v3, v6, v11

    .line 164
    invoke-virtual {v2, v10, v3}, Lo/qx;->a(II)I

    move-result v2

    .line 163
    invoke-static {v1, v2}, Lo/qx;->e(II)I

    move-result v1

    aput v1, v8, v0

    .line 162
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 160
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 167
    :cond_4
    new-instance v0, Lo/qz;

    iget-object v1, p0, Lo/qz;->c:Lo/qx;

    invoke-direct {v0, v1, v8}, Lo/qz;-><init>(Lo/qx;[I)V

    return-object v0
.end method

.method d(II)Lo/qz;
    .locals 5

    .line 186
    if-gez p1, :cond_0

    .line 187
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 189
    :cond_0
    if-nez p2, :cond_1

    .line 190
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v0

    return-object v0

    .line 192
    :cond_1
    iget-object v0, p0, Lo/qz;->a:[I

    array-length v2, v0

    .line 193
    add-int v0, v2, p1

    new-array v3, v0, [I

    .line 194
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 195
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    iget-object v1, p0, Lo/qz;->a:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1, p2}, Lo/qx;->a(II)I

    move-result v0

    aput v0, v3, v4

    .line 194
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 197
    :cond_2
    new-instance v0, Lo/qz;

    iget-object v1, p0, Lo/qz;->c:Lo/qx;

    invoke-direct {v0, v1, v3}, Lo/qz;-><init>(Lo/qx;[I)V

    return-object v0
.end method

.method d(Lo/qz;)Lo/qz;
    .locals 7

    .line 119
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    iget-object v1, p1, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lo/qz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    return-object p1

    .line 125
    :cond_1
    invoke-virtual {p1}, Lo/qz;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    return-object p0

    .line 129
    :cond_2
    iget-object v2, p0, Lo/qz;->a:[I

    .line 130
    iget-object v3, p1, Lo/qz;->a:[I

    .line 131
    array-length v0, v2

    array-length v1, v3

    if-le v0, v1, :cond_3

    .line 132
    move-object v4, v2

    .line 133
    move-object v2, v3

    .line 134
    move-object v3, v4

    .line 136
    :cond_3
    array-length v0, v3

    new-array v4, v0, [I

    .line 137
    array-length v0, v3

    array-length v1, v2

    sub-int v5, v0, v1

    .line 139
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v3, v0, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 141
    move v6, v5

    :goto_0
    array-length v0, v3

    if-ge v6, v0, :cond_4

    .line 142
    sub-int v0, v6, v5

    aget v0, v2, v0

    aget v1, v3, v6

    invoke-static {v0, v1}, Lo/qx;->e(II)I

    move-result v0

    aput v0, v4, v6

    .line 141
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 145
    :cond_4
    new-instance v0, Lo/qz;

    iget-object v1, p0, Lo/qz;->c:Lo/qx;

    invoke-direct {v0, v1, v4}, Lo/qz;-><init>(Lo/qx;[I)V

    return-object v0
.end method

.method d()Z
    .locals 2

    .line 84
    iget-object v0, p0, Lo/qz;->a:[I

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

.method e()I
    .locals 2

    .line 77
    iget-object v0, p0, Lo/qz;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method e(I)I
    .locals 3

    .line 91
    iget-object v0, p0, Lo/qz;->a:[I

    iget-object v1, p0, Lo/qz;->a:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    aget v0, v0, v1

    return v0
.end method

.method e(Lo/qz;)[Lo/qz;
    .locals 10

    .line 201
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    iget-object v1, p1, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    invoke-virtual {p1}, Lo/qz;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Divide by 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_1
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0}, Lo/qx;->d()Lo/qz;

    move-result-object v2

    .line 209
    move-object v3, p0

    .line 211
    invoke-virtual {p1}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Lo/qz;->e(I)I

    move-result v4

    .line 212
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v4}, Lo/qx;->b(I)I

    move-result v5

    .line 214
    :goto_0
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {p1}, Lo/qz;->e()I

    move-result v1

    if-lt v0, v1, :cond_2

    invoke-virtual {v3}, Lo/qz;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 215
    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v0

    invoke-virtual {p1}, Lo/qz;->e()I

    move-result v1

    sub-int v6, v0, v1

    .line 216
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v3}, Lo/qz;->e()I

    move-result v1

    invoke-virtual {v3, v1}, Lo/qz;->e(I)I

    move-result v1

    invoke-virtual {v0, v1, v5}, Lo/qx;->a(II)I

    move-result v7

    .line 217
    invoke-virtual {p1, v6, v7}, Lo/qz;->d(II)Lo/qz;

    move-result-object v8

    .line 218
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v6, v7}, Lo/qx;->d(II)Lo/qz;

    move-result-object v9

    .line 219
    invoke-virtual {v2, v9}, Lo/qz;->d(Lo/qz;)Lo/qz;

    move-result-object v2

    .line 220
    invoke-virtual {v3, v8}, Lo/qz;->d(Lo/qz;)Lo/qz;

    move-result-object v3

    .line 221
    goto :goto_0

    .line 223
    :cond_2
    const/4 v0, 0x2

    new-array v0, v0, [Lo/qz;

    const/4 v1, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object v3, v0, v1

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 228
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo/qz;->e()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 229
    invoke-virtual {p0}, Lo/qz;->e()I

    move-result v3

    :goto_0
    if-ltz v3, :cond_8

    .line 230
    invoke-virtual {p0, v3}, Lo/qz;->e(I)I

    move-result v4

    .line 231
    if-eqz v4, :cond_7

    .line 232
    if-gez v4, :cond_0

    .line 233
    const-string v0, " - "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    neg-int v4, v4

    goto :goto_1

    .line 236
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 237
    const-string v0, " + "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    const/4 v0, 0x1

    if-eq v4, v0, :cond_5

    .line 241
    :cond_2
    iget-object v0, p0, Lo/qz;->c:Lo/qx;

    invoke-virtual {v0, v4}, Lo/qx;->c(I)I

    move-result v5

    .line 242
    if-nez v5, :cond_3

    .line 243
    const/16 v0, 0x31

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 244
    :cond_3
    const/4 v0, 0x1

    if-ne v5, v0, :cond_4

    .line 245
    const/16 v0, 0x61

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 247
    :cond_4
    const-string v0, "a^"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    :cond_5
    :goto_2
    if-eqz v3, :cond_7

    .line 252
    const/4 v0, 0x1

    if-ne v3, v0, :cond_6

    .line 253
    const/16 v0, 0x78

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 255
    :cond_6
    const-string v0, "x^"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    :cond_7
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto/16 :goto_0

    .line 261
    :cond_8
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
