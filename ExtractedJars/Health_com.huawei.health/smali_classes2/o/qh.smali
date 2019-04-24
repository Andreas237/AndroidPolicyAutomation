.class public final Lo/qh;
.super Lo/pw;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final d:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:Ljava/util/regex/Pattern;

.field private static final g:Ljava/util/regex/Pattern;

.field private static final h:Ljava/util/regex/Pattern;

.field private static final i:Ljava/util/regex/Pattern;

.field private static final k:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    const-string v0, "BEGIN:VCARD"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->d:Ljava/util/regex/Pattern;

    .line 39
    const-string v0, "\\d{4}-?\\d{2}-?\\d{2}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->a:Ljava/util/regex/Pattern;

    .line 40
    const-string v0, "\r\n[ \t]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->e:Ljava/util/regex/Pattern;

    .line 41
    const-string v0, "\\\\[nN]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->b:Ljava/util/regex/Pattern;

    .line 42
    const-string v0, "\\\\([,;\\\\])"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->c:Ljava/util/regex/Pattern;

    .line 43
    const-string v0, "="

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->g:Ljava/util/regex/Pattern;

    .line 44
    const-string v0, ";"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->k:Ljava/util/regex/Pattern;

    .line 45
    const-string v0, "(?<!\\\\);+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->i:Ljava/util/regex/Pattern;

    .line 46
    const-string v0, ","

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->h:Ljava/util/regex/Pattern;

    .line 47
    const-string v0, "[;,]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qh;->f:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static a(Ljava/util/Collection;)[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/util/List<Ljava/lang/String;>;>;)[Ljava/lang/String;"
        }
    .end annotation

    .line 275
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 276
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 278
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 279
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 280
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 281
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 282
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 284
    :cond_2
    goto :goto_0

    .line 285
    :cond_3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 210
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 212
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 213
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    .line 214
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 215
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 218
    :sswitch_0
    goto :goto_2

    .line 220
    :sswitch_1
    add-int/lit8 v0, v1, -0x2

    if-ge v4, v0, :cond_2

    .line 221
    add-int/lit8 v0, v4, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 222
    const/16 v0, 0xd

    if-eq v6, v0, :cond_1

    const/16 v0, 0xa

    if-eq v6, v0, :cond_1

    .line 223
    add-int/lit8 v0, v4, 0x2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    .line 224
    invoke-static {v6}, Lo/qh;->d(C)I

    move-result v8

    .line 225
    invoke-static {v7}, Lo/qh;->d(C)I

    move-result v9

    .line 226
    if-ltz v8, :cond_0

    if-ltz v9, :cond_0

    .line 227
    shl-int/lit8 v0, v8, 0x4

    add-int/2addr v0, v9

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 229
    :cond_0
    add-int/lit8 v4, v4, 0x2

    .line 231
    :cond_1
    goto :goto_2

    .line 234
    :goto_1
    invoke-static {v3, p1, v2}, Lo/qh;->c(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 235
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 238
    :cond_3
    invoke-static {v3, p1, v2}, Lo/qh;->c(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 239
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0xd -> :sswitch_0
        0x3d -> :sswitch_1
    .end sparse-switch
.end method

.method static b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 266
    invoke-static {p0, p1, p2, p3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v1

    .line 267
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :goto_0
    return-object v0
.end method

.method private static b(Ljava/util/Collection;)[Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/util/List<Ljava/lang/String;>;>;)[Ljava/lang/String;"
        }
    .end annotation

    .line 289
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 290
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 292
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 294
    const/4 v5, 0x0

    .line 295
    const/4 v6, 0x1

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 296
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 297
    const/16 v0, 0x3d

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    .line 298
    if-gez v8, :cond_2

    .line 300
    move-object v5, v7

    .line 301
    goto :goto_2

    .line 303
    :cond_2
    const-string v0, "TYPE"

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 304
    add-int/lit8 v0, v8, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 305
    goto :goto_2

    .line 295
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 308
    :cond_4
    :goto_2
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    goto :goto_0

    .line 310
    :cond_5
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static c(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 271
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method static c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 110
    :goto_0
    if-ge v3, v4, :cond_14

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(?:^|\n)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(?:;([^:]*))?:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 115
    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 116
    if-lez v3, :cond_0

    .line 117
    add-int/lit8 v3, v3, -0x1

    .line 119
    :cond_0
    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->find(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 120
    goto/16 :goto_7

    .line 122
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/util/regex/Matcher;->end(I)I

    move-result v3

    .line 124
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    if-eqz v6, :cond_5

    .line 129
    sget-object v0, Lo/qh;->k:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_5

    aget-object v13, v10, v12

    .line 130
    if-nez v7, :cond_2

    .line 131
    new-instance v7, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 133
    :cond_2
    invoke-interface {v7, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    sget-object v0, Lo/qh;->g:Ljava/util/regex/Pattern;

    const/4 v1, 0x2

    invoke-virtual {v0, v13, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;I)[Ljava/lang/String;

    move-result-object v14

    .line 135
    array-length v0, v14

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 136
    const/4 v0, 0x0

    aget-object v15, v14, v0

    .line 137
    const/4 v0, 0x1

    aget-object v16, v14, v0

    .line 138
    const-string v0, "ENCODING"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "QUOTED-PRINTABLE"

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 139
    const/4 v8, 0x1

    goto :goto_2

    .line 140
    :cond_3
    const-string v0, "CHARSET"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 141
    move-object/from16 v9, v16

    .line 129
    :cond_4
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 147
    :cond_5
    move v10, v3

    .line 149
    :goto_3
    move-object/from16 v0, p1

    const/16 v1, 0xa

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    move v3, v0

    if-ltz v0, :cond_a

    .line 150
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v3, v0, :cond_7

    add-int/lit8 v0, v3, 0x1

    .line 151
    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_6

    add-int/lit8 v0, v3, 0x1

    .line 152
    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_7

    .line 153
    :cond_6
    add-int/lit8 v3, v3, 0x2

    goto :goto_3

    .line 154
    :cond_7
    if-eqz v8, :cond_a

    const/4 v0, 0x1

    if-lt v3, v0, :cond_8

    add-int/lit8 v0, v3, -0x1

    .line 155
    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_9

    :cond_8
    const/4 v0, 0x2

    if-lt v3, v0, :cond_a

    add-int/lit8 v0, v3, -0x2

    .line 156
    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_a

    .line 157
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 163
    :cond_a
    if-gez v3, :cond_b

    .line 165
    move v3, v4

    goto/16 :goto_6

    .line 166
    :cond_b
    if-le v3, v10, :cond_13

    .line 168
    if-nez v2, :cond_c

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    :cond_c
    const/4 v0, 0x1

    if-lt v3, v0, :cond_d

    add-int/lit8 v0, v3, -0x1

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_d

    .line 172
    add-int/lit8 v3, v3, -0x1

    .line 174
    :cond_d
    move-object/from16 v0, p1

    invoke-virtual {v0, v10, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 175
    if-eqz p2, :cond_e

    .line 176
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 178
    :cond_e
    if-eqz v8, :cond_f

    .line 179
    invoke-static {v11, v9}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 180
    if-eqz p3, :cond_11

    .line 181
    sget-object v0, Lo/qh;->i:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    .line 184
    :cond_f
    if-eqz p3, :cond_10

    .line 185
    sget-object v0, Lo/qh;->i:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    .line 187
    :cond_10
    sget-object v0, Lo/qh;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 188
    sget-object v0, Lo/qh;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 189
    sget-object v0, Lo/qh;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "$1"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 191
    :cond_11
    :goto_4
    if-nez v7, :cond_12

    .line 192
    new-instance v12, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 193
    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    invoke-interface {v2, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    goto :goto_5

    .line 196
    :cond_12
    const/4 v0, 0x0

    invoke-interface {v7, v0, v11}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 197
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 200
    goto :goto_6

    .line 201
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 204
    :goto_6
    goto/16 :goto_0

    .line 206
    :cond_14
    :goto_7
    return-object v2
.end method

.method private static c(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 4

    .line 245
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 246
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 248
    if-nez p1, :cond_0

    .line 249
    new-instance v2, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    .line 252
    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 255
    goto :goto_0

    .line 253
    :catch_0
    move-exception v3

    .line 254
    new-instance v2, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 257
    :goto_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 258
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    :cond_1
    return-void
.end method

.method private static c(Ljava/lang/Iterable;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 324
    if-eqz p0, :cond_1

    .line 325
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 326
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 327
    const/4 v0, 0x5

    new-array v5, v0, [Ljava/lang/String;

    .line 328
    const/4 v6, 0x0

    .line 330
    const/4 v8, 0x0

    .line 331
    :goto_1
    array-length v0, v5

    const/4 v0, 0x4

    if-ge v8, v0, :cond_0

    const/16 v0, 0x3b

    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    move v7, v0

    if-ltz v0, :cond_0

    .line 332
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v8

    .line 333
    add-int/lit8 v8, v8, 0x1

    .line 334
    add-int/lit8 v6, v7, 0x1

    goto :goto_1

    .line 336
    :cond_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v8

    .line 337
    new-instance v9, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 338
    const/4 v0, 0x3

    invoke-static {v5, v0, v9}, Lo/qh;->e([Ljava/lang/String;ILjava/lang/StringBuilder;)V

    .line 339
    const/4 v0, 0x1

    invoke-static {v5, v0, v9}, Lo/qh;->e([Ljava/lang/String;ILjava/lang/StringBuilder;)V

    .line 340
    const/4 v0, 0x2

    invoke-static {v5, v0, v9}, Lo/qh;->e([Ljava/lang/String;ILjava/lang/StringBuilder;)V

    .line 341
    const/4 v0, 0x0

    invoke-static {v5, v0, v9}, Lo/qh;->e([Ljava/lang/String;ILjava/lang/StringBuilder;)V

    .line 342
    const/4 v0, 0x4

    invoke-static {v5, v0, v9}, Lo/qh;->e([Ljava/lang/String;ILjava/lang/StringBuilder;)V

    .line 343
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 344
    goto/16 :goto_0

    .line 346
    :cond_1
    return-void
.end method

.method private static e([Ljava/lang/String;ILjava/lang/StringBuilder;)V
    .locals 1

    .line 349
    aget-object v0, p0, p1

    if-eqz v0, :cond_1

    aget-object v0, p0, p1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 350
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 351
    const/16 v0, 0x20

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 353
    :cond_0
    aget-object v0, p0, p1

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    :cond_1
    return-void
.end method

.method private static e(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 314
    if-eqz p0, :cond_0

    sget-object v0, Lo/qh;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Lo/or;)Lo/pg;
    .locals 33

    .line 54
    invoke-static/range {p1 .. p1}, Lo/qh;->i(Lo/or;)Ljava/lang/String;

    move-result-object v17

    .line 55
    sget-object v0, Lo/qh;->d:Ljava/util/regex/Pattern;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v18

    .line 56
    invoke-virtual/range {v18 .. v18}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {v18 .. v18}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_1
    const-string v0, "FN"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v19

    .line 60
    if-nez v19, :cond_2

    .line 62
    const-string v0, "N"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v19

    .line 63
    invoke-static/range {v19 .. v19}, Lo/qh;->c(Ljava/lang/Iterable;)V

    .line 65
    :cond_2
    const-string v0, "NICKNAME"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v20

    .line 66
    if-nez v20, :cond_3

    const/16 v21, 0x0

    goto :goto_0

    :cond_3
    sget-object v0, Lo/qh;->h:Ljava/util/regex/Pattern;

    move-object/from16 v1, v20

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v21

    .line 67
    :goto_0
    const-string v0, "TEL"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v22

    .line 68
    const-string v0, "EMAIL"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v23

    .line 69
    const-string v0, "NOTE"

    move-object/from16 v1, v17

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v24

    .line 70
    const-string v0, "ADR"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v25

    .line 71
    const-string v0, "ORG"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v26

    .line 72
    const-string v0, "BDAY"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v27

    .line 73
    if-eqz v27, :cond_4

    move-object/from16 v0, v27

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lo/qh;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 74
    const/16 v27, 0x0

    .line 76
    :cond_4
    const-string v0, "TITLE"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v28

    .line 77
    const-string v0, "URL"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->c(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v29

    .line 78
    const-string v0, "IMPP"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v30

    .line 79
    const-string v0, "GEO"

    move-object/from16 v1, v17

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/qh;->b(Ljava/lang/CharSequence;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v31

    .line 80
    if-nez v31, :cond_5

    const/16 v32, 0x0

    goto :goto_1

    :cond_5
    sget-object v0, Lo/qh;->f:Ljava/util/regex/Pattern;

    move-object/from16 v1, v31

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v32

    .line 81
    :goto_1
    if-eqz v32, :cond_6

    move-object/from16 v0, v32

    array-length v0, v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 82
    const/16 v32, 0x0

    .line 84
    :cond_6
    new-instance v0, Lo/pg;

    invoke-static/range {v19 .. v19}, Lo/qh;->a(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-static/range {v22 .. v22}, Lo/qh;->a(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v4

    .line 88
    invoke-static/range {v22 .. v22}, Lo/qh;->b(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v5

    .line 89
    invoke-static/range {v23 .. v23}, Lo/qh;->a(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v6

    .line 90
    invoke-static/range {v23 .. v23}, Lo/qh;->b(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v7

    .line 91
    invoke-static/range {v30 .. v30}, Lo/qh;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v8

    .line 92
    invoke-static/range {v24 .. v24}, Lo/qh;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v9

    .line 93
    invoke-static/range {v25 .. v25}, Lo/qh;->a(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v10

    .line 94
    invoke-static/range {v25 .. v25}, Lo/qh;->b(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v11

    .line 95
    invoke-static/range {v26 .. v26}, Lo/qh;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v12

    .line 96
    invoke-static/range {v27 .. v27}, Lo/qh;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v13

    .line 97
    invoke-static/range {v28 .. v28}, Lo/qh;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v14

    .line 98
    invoke-static/range {v29 .. v29}, Lo/qh;->a(Ljava/util/Collection;)[Ljava/lang/String;

    move-result-object v15

    move-object/from16 v2, v21

    const/4 v3, 0x0

    move-object/from16 v16, v32

    invoke-direct/range {v0 .. v16}, Lo/pg;-><init>([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 36
    invoke-virtual {p0, p1}, Lo/qh;->a(Lo/or;)Lo/pg;

    move-result-object v0

    return-object v0
.end method
