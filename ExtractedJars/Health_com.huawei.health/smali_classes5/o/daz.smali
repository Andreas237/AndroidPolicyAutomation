.class public Lo/daz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/daz$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c([B)Z
    .locals 4

    .line 246
    const/4 v2, 0x0

    .line 247
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_0

    .line 248
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    .line 249
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const v1, 0x186a9

    if-ne v1, v0, :cond_0

    .line 250
    const/4 v2, 0x1

    .line 253
    :cond_0
    return v2
.end method

.method private d(Ljava/lang/String;I)Lo/daz$c;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 158
    add-int/lit8 v0, p2, 0x2

    :try_start_0
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 159
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 160
    const/4 v4, 0x0

    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v7, 0x0

    .line 165
    :goto_0
    ushr-int/lit8 v0, v3, 0x7

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 166
    const/4 v0, 0x4

    if-ge v7, v0, :cond_0

    .line 168
    add-int/lit8 p2, p2, 0x2

    .line 170
    and-int/lit8 v3, v3, 0x7f

    .line 171
    sparse-switch v7, :sswitch_data_0

    goto :goto_1

    .line 173
    :sswitch_0
    move v5, v3

    .line 174
    goto :goto_1

    .line 176
    :sswitch_1
    move v6, v3

    .line 177
    .line 182
    :goto_1
    add-int/lit8 v0, p2, 0x2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 184
    const/16 v0, 0x10

    invoke-static {v2, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    .line 185
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 188
    :cond_0
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    .line 192
    :cond_1
    const/4 v0, 0x2

    if-ne v0, v7, :cond_2

    .line 193
    mul-int/lit16 v0, v5, 0x80

    mul-int/lit16 v0, v0, 0x80

    mul-int/lit16 v1, v6, 0x80

    add-int/2addr v0, v1

    add-int v4, v0, v3

    goto :goto_2

    .line 196
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v7, :cond_3

    .line 197
    mul-int/lit16 v0, v5, 0x80

    add-int v4, v0, v3

    goto :goto_2

    .line 201
    :cond_3
    add-int/lit8 v4, v3, 0x0

    .line 204
    :goto_2
    add-int/lit8 p2, p2, 0x2

    .line 205
    new-instance v0, Lo/daz$c;

    invoke-direct {v0, v4, p2}, Lo/daz$c;-><init>(II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 206
    :catch_0
    move-exception v2

    .line 207
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public a(Lo/dbd;Ljava/lang/String;I)Lo/dbd;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 81
    const/4 v2, 0x0

    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v4, 0x0

    .line 85
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-le v0, p3, :cond_1

    .line 87
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 90
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v2, v0, :cond_8

    .line 91
    add-int/lit8 v0, v2, 0x2

    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 93
    add-int v0, p3, v2

    div-int/lit8 v3, v0, 0x2

    .line 95
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 97
    invoke-direct {p0, p2, v2}, Lo/daz;->d(Ljava/lang/String;I)Lo/daz$c;

    move-result-object v6

    .line 99
    invoke-virtual {v6}, Lo/daz$c;->a()I

    move-result v7

    .line 101
    invoke-virtual {v6}, Lo/daz$c;->b()I

    move-result v2

    .line 103
    const-string v8, ""

    .line 105
    const/4 v0, 0x0

    if-eq v0, v7, :cond_6

    .line 106
    mul-int/lit8 v0, v7, 0x2

    add-int/2addr v0, v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 107
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    .line 110
    :cond_2
    mul-int/lit8 v0, v7, 0x2

    add-int/2addr v0, v2

    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 112
    add-int v4, p3, v2

    .line 113
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 115
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    ushr-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 116
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v0, v0, 0x7f

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 117
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v1, v0, :cond_3

    .line 118
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 120
    :cond_3
    iget-object v0, p1, Lo/dbd;->e:Ljava/util/List;

    new-instance v1, Lo/dbd;

    invoke-direct {v1, v3, v5, v5}, Lo/dbd;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-virtual {p0, p1, v8, v4}, Lo/daz;->a(Lo/dbd;Ljava/lang/String;I)Lo/dbd;

    goto :goto_1

    .line 125
    :cond_4
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 126
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v1, v0, :cond_5

    .line 127
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 129
    :cond_5
    iget-object v0, p1, Lo/dbd;->e:Ljava/util/List;

    new-instance v1, Lo/dbd;

    invoke-direct {v1, v3, v5, v5}, Lo/dbd;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 134
    :cond_6
    const/16 v0, 0x10

    invoke-static {v5, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 135
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v1, v0, :cond_7

    .line 136
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 138
    :cond_7
    iget-object v0, p1, Lo/dbd;->e:Ljava/util/List;

    new-instance v1, Lo/dbd;

    invoke-direct {v1, v3, v5, v5}, Lo/dbd;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :goto_1
    goto/16 :goto_0

    .line 143
    :cond_8
    goto :goto_2

    .line 141
    :catch_0
    move-exception v5

    .line 142
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    .line 144
    :goto_2
    return-object p1
.end method

.method public d(Ljava/lang/String;)Lo/dba;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/day;
        }
    .end annotation

    .line 29
    const/4 v2, 0x0

    .line 30
    new-instance v3, Lo/dba;

    invoke-direct {v3}, Lo/dba;-><init>()V

    .line 32
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v2, v0, :cond_3

    .line 33
    add-int/lit8 v0, v2, 0x2

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 37
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 38
    invoke-direct {p0, p1, v2}, Lo/daz;->d(Ljava/lang/String;I)Lo/daz$c;

    move-result-object v5

    .line 39
    invoke-virtual {v5}, Lo/daz$c;->a()I

    move-result v6

    .line 40
    invoke-virtual {v5}, Lo/daz$c;->b()I

    move-result v2

    .line 41
    const-string v7, ""

    .line 43
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 44
    mul-int/lit8 v0, v6, 0x2

    add-int/2addr v0, v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 45
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    .line 48
    :cond_0
    mul-int/lit8 v0, v6, 0x2

    add-int/2addr v0, v2

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v2, v0

    .line 53
    const/16 v0, 0x10

    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    ushr-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 54
    iget-object v0, v3, Lo/dba;->b:Ljava/util/List;

    invoke-virtual {p0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 57
    :cond_1
    iget-object v0, v3, Lo/dba;->e:Ljava/util/List;

    new-instance v1, Lo/daw;

    invoke-direct {v1, v4, v6, v7}, Lo/daw;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 62
    :cond_2
    iget-object v0, v3, Lo/dba;->e:Ljava/util/List;

    new-instance v1, Lo/daw;

    invoke-direct {v1, v4, v6, v7}, Lo/daw;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_1
    goto/16 :goto_0

    .line 68
    :cond_3
    goto :goto_2

    .line 66
    :catch_0
    move-exception v4

    .line 67
    new-instance v0, Lo/day;

    invoke-direct {v0}, Lo/day;-><init>()V

    throw v0

    .line 69
    :goto_2
    return-object v3
.end method
