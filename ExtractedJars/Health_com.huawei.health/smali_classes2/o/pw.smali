.class public abstract Lo/pw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Lo/pw;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 42
    const/16 v0, 0x14

    new-array v0, v0, [Lo/pw;

    new-instance v1, Lo/pi;

    invoke-direct {v1}, Lo/pi;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/pa;

    invoke-direct {v1}, Lo/pa;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lo/pk;

    invoke-direct {v1}, Lo/pk;-><init>()V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lo/pb;

    invoke-direct {v1}, Lo/pb;-><init>()V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lo/qh;

    invoke-direct {v1}, Lo/qh;-><init>()V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lo/pe;

    invoke-direct {v1}, Lo/pe;-><init>()V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lo/qg;

    invoke-direct {v1}, Lo/qg;-><init>()V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Lo/pl;

    invoke-direct {v1}, Lo/pl;-><init>()V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    new-instance v1, Lo/qb;

    invoke-direct {v1}, Lo/qb;-><init>()V

    const/16 v2, 0x8

    aput-object v1, v0, v2

    new-instance v1, Lo/qc;

    invoke-direct {v1}, Lo/qc;-><init>()V

    const/16 v2, 0x9

    aput-object v1, v0, v2

    new-instance v1, Lo/pu;

    invoke-direct {v1}, Lo/pu;-><init>()V

    const/16 v2, 0xa

    aput-object v1, v0, v2

    new-instance v1, Lo/qa;

    invoke-direct {v1}, Lo/qa;-><init>()V

    const/16 v2, 0xb

    aput-object v1, v0, v2

    new-instance v1, Lo/pp;

    invoke-direct {v1}, Lo/pp;-><init>()V

    const/16 v2, 0xc

    aput-object v1, v0, v2

    new-instance v1, Lo/qk;

    invoke-direct {v1}, Lo/qk;-><init>()V

    const/16 v2, 0xd

    aput-object v1, v0, v2

    new-instance v1, Lo/qd;

    invoke-direct {v1}, Lo/qd;-><init>()V

    const/16 v2, 0xe

    aput-object v1, v0, v2

    new-instance v1, Lo/qe;

    invoke-direct {v1}, Lo/qe;-><init>()V

    const/16 v2, 0xf

    aput-object v1, v0, v2

    new-instance v1, Lo/pq;

    invoke-direct {v1}, Lo/pq;-><init>()V

    const/16 v2, 0x10

    aput-object v1, v0, v2

    new-instance v1, Lo/pt;

    invoke-direct {v1}, Lo/pt;-><init>()V

    const/16 v2, 0x11

    aput-object v1, v0, v2

    new-instance v1, Lo/pn;

    invoke-direct {v1}, Lo/pn;-><init>()V

    const/16 v2, 0x12

    aput-object v1, v0, v2

    new-instance v1, Lo/ql;

    invoke-direct {v1}, Lo/ql;-><init>()V

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lo/pw;->a:[Lo/pw;

    .line 65
    const-string v0, "\\d+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pw;->c:Ljava/util/regex/Pattern;

    .line 66
    const-string v0, "&"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pw;->b:Ljava/util/regex/Pattern;

    .line 67
    const-string v0, "="

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pw;->e:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 192
    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {p0, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 193
    :catch_0
    move-exception v1

    .line 194
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;CZ)Ljava/lang/String;
    .locals 2

    .line 255
    invoke-static {p0, p1, p2, p3}, Lo/pw;->d(Ljava/lang/String;Ljava/lang/String;CZ)[Ljava/lang/String;

    move-result-object v1

    .line 256
    if-nez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, v1, v0

    :goto_0
    return-object v0
.end method

.method protected static a(Ljava/lang/CharSequence;II)Z
    .locals 3

    .line 157
    if-eqz p0, :cond_0

    if-gtz p2, :cond_1

    .line 158
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 160
    :cond_1
    add-int v2, p1, p2

    .line 161
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt v0, v2, :cond_2

    sget-object v0, Lo/pw;->c:Ljava/util/regex/Pattern;

    invoke-interface {p0, p1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected static b(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 115
    if-nez p0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    :goto_0
    return-object v0
.end method

.method protected static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 119
    const/16 v0, 0x5c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 120
    if-gez v2, :cond_0

    .line 121
    return-object p0

    .line 123
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 124
    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v3, -0x1

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 125
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 126
    const/4 v5, 0x0

    .line 127
    move v6, v2

    :goto_0
    if-ge v6, v3, :cond_3

    .line 128
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 129
    if-nez v5, :cond_1

    const/16 v0, 0x5c

    if-eq v7, v0, :cond_2

    .line 130
    :cond_1
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 131
    const/4 v5, 0x0

    goto :goto_1

    .line 133
    :cond_2
    const/4 v5, 0x1

    .line 127
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 136
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected static d(C)I
    .locals 2

    .line 140
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    .line 141
    add-int/lit8 v0, p0, -0x30

    return v0

    .line 143
    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    .line 144
    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 146
    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    .line 147
    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    return v0

    .line 149
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method private static d(Ljava/lang/CharSequence;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/CharSequence;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 177
    sget-object v0, Lo/pw;->e:Ljava/util/regex/Pattern;

    const/4 v1, 0x2

    invoke-virtual {v0, p0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;I)[Ljava/lang/String;

    move-result-object v2

    .line 178
    array-length v0, v2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 179
    const/4 v0, 0x0

    aget-object v3, v2, v0

    .line 180
    const/4 v0, 0x1

    aget-object v4, v2, v0

    .line 182
    :try_start_0
    invoke-static {v4}, Lo/pw;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 183
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 184
    :catch_0
    move-exception v5

    .line 188
    :cond_0
    :goto_0
    return-void
.end method

.method protected static d(Ljava/lang/CharSequence;I)Z
    .locals 1

    .line 153
    if-eqz p0, :cond_0

    if-lez p1, :cond_0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    sget-object v0, Lo/pw;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static d(Ljava/lang/String;Ljava/lang/String;CZ)[Ljava/lang/String;
    .locals 8

    .line 199
    const/4 v2, 0x0

    .line 200
    const/4 v3, 0x0

    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 202
    :goto_0
    if-ge v3, v4, :cond_7

    .line 203
    invoke-virtual {p1, p0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    .line 204
    if-gez v3, :cond_0

    .line 205
    goto/16 :goto_2

    .line 207
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v3, v0

    .line 208
    move v5, v3

    .line 209
    const/4 v6, 0x1

    .line 210
    :goto_1
    if-eqz v6, :cond_6

    .line 211
    invoke-virtual {p1, p2, v3}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 212
    if-gez v3, :cond_1

    .line 214
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 215
    const/4 v6, 0x0

    goto :goto_1

    .line 216
    :cond_1
    invoke-static {p1, v3}, Lo/pw;->e(Ljava/lang/CharSequence;I)I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 218
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 221
    :cond_2
    if-nez v2, :cond_3

    .line 222
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    :cond_3
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/pw;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 225
    if-eqz p3, :cond_4

    .line 226
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 228
    :cond_4
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 229
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 232
    const/4 v6, 0x0

    .line 233
    goto :goto_1

    .line 235
    :cond_6
    goto/16 :goto_0

    .line 236
    :cond_7
    :goto_2
    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 237
    :cond_8
    const/4 v0, 0x0

    return-object v0

    .line 239
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static e(Ljava/lang/CharSequence;I)I
    .locals 4

    .line 243
    const/4 v2, 0x0

    .line 244
    add-int/lit8 v3, p1, -0x1

    :goto_0
    if-ltz v3, :cond_0

    .line 245
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_0

    .line 246
    add-int/lit8 v2, v2, 0x1

    .line 244
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 251
    :cond_0
    return v2
.end method

.method static e(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 165
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 166
    if-gez v2, :cond_0

    .line 167
    const/4 v0, 0x0

    return-object v0

    .line 169
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x3

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 170
    sget-object v0, Lo/pw;->b:Ljava/util/regex/Pattern;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 171
    invoke-static {v7, v3}, Lo/pw;->d(Ljava/lang/CharSequence;Ljava/util/Map;)V

    .line 170
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 173
    :cond_1
    return-object v3
.end method

.method public static h(Lo/or;)Lo/pr;
    .locals 8

    .line 89
    sget-object v3, Lo/pw;->a:[Lo/pw;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 90
    invoke-virtual {v6, p0}, Lo/pw;->b(Lo/or;)Lo/pr;

    move-result-object v7

    .line 91
    if-eqz v7, :cond_0

    .line 92
    return-object v7

    .line 89
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 95
    :cond_1
    new-instance v0, Lo/pz;

    invoke-virtual {p0}, Lo/or;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/pz;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method protected static i(Lo/or;)Ljava/lang/String;
    .locals 2

    .line 81
    invoke-virtual {p0}, Lo/or;->e()Ljava/lang/String;

    move-result-object v1

    .line 82
    const-string v0, "\ufeff"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 85
    :cond_0
    return-object v1
.end method


# virtual methods
.method public abstract b(Lo/or;)Lo/pr;
.end method
