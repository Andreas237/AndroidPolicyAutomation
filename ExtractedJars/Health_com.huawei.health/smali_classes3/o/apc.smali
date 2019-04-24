.class public Lo/apc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/apc$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)I
    .locals 5

    .line 312
    const/4 v1, 0x0

    .line 313
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 315
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 317
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    const/4 v0, 0x7

    if-gt v1, v0, :cond_1

    .line 319
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 320
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    add-int/lit8 v1, v1, 0x1

    .line 317
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 326
    :cond_1
    return v1
.end method

.method private static a(Ljava/lang/String;Ljava/util/List;Ljava/util/regex/Matcher;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/apc$d;>;Ljava/util/regex/Matcher;I)V"
        }
    .end annotation

    .line 124
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result v6

    .line 125
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result v7

    .line 126
    invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 128
    const/4 v4, 0x0

    .line 129
    const/4 v3, 0x0

    .line 130
    const/4 v5, 0x0

    .line 133
    invoke-static {p0, v6}, Lo/apc;->d(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    const/4 v4, 0x1

    .line 138
    const/4 v3, 0x1

    .line 139
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 144
    :cond_0
    invoke-static {p0, v6, v7}, Lo/apc;->b(Ljava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    move-object v5, v8

    .line 147
    const/4 v4, 0x1

    .line 151
    :cond_1
    :goto_0
    if-eqz v4, :cond_3

    .line 154
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 156
    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 157
    add-int/lit8 v0, v7, -0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 158
    invoke-static {v9, v10}, Lo/apc;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    const-string v0, "ChatInfoRecognitionUtil"

    const-string v1, "url ending with a letter,do not match"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    return-void

    .line 164
    :cond_2
    new-instance v11, Lo/apa;

    invoke-direct {v11, v5, p3}, Lo/apa;-><init>(Ljava/lang/String;I)V

    .line 167
    new-instance v0, Lo/apc$d;

    add-int v1, v6, v3

    const/4 v2, 0x0

    invoke-direct {v0, v11, v1, v7, v2}, Lo/apc$d;-><init>(Ljava/lang/Object;III)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    :cond_3
    return-void
.end method

.method private static a(CC)Z
    .locals 1

    .line 179
    const/16 v0, 0x41

    if-gt v0, p0, :cond_0

    const/16 v0, 0x5a

    if-le p0, v0, :cond_1

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_4

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_4

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p1, :cond_2

    const/16 v0, 0x5a

    if-le p1, v0, :cond_3

    :cond_2
    const/16 v0, 0x61

    if-gt v0, p1, :cond_4

    const/16 v0, 0x7a

    if-gt p1, v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final b(Ljava/lang/CharSequence;II)Z
    .locals 3

    .line 193
    if-nez p1, :cond_0

    .line 195
    const/4 v0, 0x1

    return v0

    .line 198
    :cond_0
    add-int/lit8 v0, p1, -0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_2

    .line 203
    add-int/lit8 v0, p1, -0x2

    :try_start_0
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/16 v1, 0x5f

    if-ne v0, v1, :cond_1

    .line 205
    const/4 v0, 0x1

    return v0

    .line 211
    :cond_1
    goto :goto_0

    .line 208
    :catch_0
    move-exception v2

    .line 210
    const-string v0, "ChatInfoRecognitionUtil"

    const-string v1, "IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 216
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private static c(ILjava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lo/apc$d;>;)Z"
        }
    .end annotation

    .line 300
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/apc$d;

    .line 302
    invoke-virtual {v2}, Lo/apc$d;->b()I

    move-result v0

    if-lt p0, v0, :cond_0

    invoke-virtual {v2}, Lo/apc$d;->a()I

    move-result v0

    if-ge p0, v0, :cond_0

    .line 304
    const/4 v0, 0x1

    return v0

    .line 306
    :cond_0
    goto :goto_0

    .line 307
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static d(Ljava/lang/String;I)Z
    .locals 2

    .line 228
    const/4 v0, 0x2

    if-ge p1, v0, :cond_0

    .line 230
    const/4 v0, 0x0

    return v0

    .line 234
    :cond_0
    add-int/lit8 v0, p1, -0x2

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 235
    const-string v0, ":-D"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ":-P"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "=-O"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "T_T"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ":-X"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ":O"

    .line 236
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "o_O"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 240
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/text/SpannableStringBuilder;I)Landroid/text/SpannableStringBuilder;
    .locals 7

    .line 33
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    return-object p0

    .line 38
    :cond_0
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/apc;->e(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 40
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 42
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/apc$d;

    .line 44
    invoke-virtual {v6}, Lo/apc$d;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6}, Lo/apc$d;->b()I

    move-result v1

    invoke-virtual {v6}, Lo/apc$d;->a()I

    move-result v2

    const/16 v3, 0x21

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 45
    goto :goto_0

    .line 48
    :cond_1
    return-object p0
.end method

.method private static e(Ljava/lang/String;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/List<Lo/apc$d;>;"
        }
    .end annotation

    .line 59
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    if-nez p0, :cond_0

    .line 63
    return-object v2

    .line 66
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 69
    sget-object v0, Lo/bob;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    :goto_0
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    invoke-static {p0, v2, v4, p1}, Lo/apc;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/regex/Matcher;I)V

    goto :goto_0

    .line 79
    :cond_1
    sget-object v0, Lo/aoz;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    :cond_2
    :goto_1
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 84
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->start()I

    move-result v5

    .line 85
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->end()I

    move-result v6

    .line 86
    invoke-static {v5, v2}, Lo/apc;->c(ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 88
    goto :goto_1

    .line 92
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    .line 95
    invoke-static {v8}, Lo/apc;->a(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    .line 97
    new-instance v9, Lo/aoz;

    invoke-direct {v9, v8, p1}, Lo/aoz;-><init>(Ljava/lang/String;I)V

    .line 98
    new-instance v0, Lo/apc$d;

    const/4 v1, 0x1

    invoke-direct {v0, v9, v5, v6, v1}, Lo/apc$d;-><init>(Ljava/lang/Object;III)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 103
    :cond_4
    return-object v2
.end method
