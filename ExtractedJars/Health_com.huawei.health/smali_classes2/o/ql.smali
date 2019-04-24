.class public final Lo/ql;
.super Lo/pw;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final e:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-string v0, "[IOQ]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ql;->e:Ljava/util/regex/Pattern;

    .line 32
    const-string v0, "[A-Z0-9]{17}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/ql;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/pw;-><init>()V

    return-void
.end method

.method private static a(C)I
    .locals 2

    .line 74
    const/16 v0, 0x41

    if-lt p0, v0, :cond_0

    const/16 v0, 0x49

    if-gt p0, v0, :cond_0

    .line 75
    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 77
    :cond_0
    const/16 v0, 0x4a

    if-lt p0, v0, :cond_1

    const/16 v0, 0x52

    if-gt p0, v0, :cond_1

    .line 78
    add-int/lit8 v0, p0, -0x4a

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 80
    :cond_1
    const/16 v0, 0x53

    if-lt p0, v0, :cond_2

    const/16 v0, 0x5a

    if-gt p0, v0, :cond_2

    .line 81
    add-int/lit8 v0, p0, -0x53

    add-int/lit8 v0, v0, 0x2

    return v0

    .line 83
    :cond_2
    const/16 v0, 0x30

    if-lt p0, v0, :cond_3

    const/16 v0, 0x39

    if-gt p0, v0, :cond_3

    .line 84
    add-int/lit8 v0, p0, -0x30

    return v0

    .line 86
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private static a(I)I
    .locals 1

    .line 90
    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/4 v0, 0x7

    if-gt p0, v0, :cond_0

    .line 91
    rsub-int/lit8 v0, p0, 0x9

    return v0

    .line 93
    :cond_0
    const/16 v0, 0x8

    if-ne p0, v0, :cond_1

    .line 94
    const/16 v0, 0xa

    return v0

    .line 96
    :cond_1
    const/16 v0, 0x9

    if-ne p0, v0, :cond_2

    .line 97
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_2
    const/16 v0, 0xa

    if-lt p0, v0, :cond_3

    const/16 v0, 0x11

    if-gt p0, v0, :cond_3

    .line 100
    rsub-int/lit8 v0, p0, 0x13

    return v0

    .line 102
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private static b(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 141
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 142
    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 143
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 147
    :pswitch_0
    const-string v0, "US"

    return-object v0

    .line 149
    :pswitch_1
    const-string v0, "CA"

    return-object v0

    .line 151
    :pswitch_2
    const/16 v0, 0x41

    if-lt v2, v0, :cond_5

    const/16 v0, 0x57

    if-gt v2, v0, :cond_5

    .line 152
    const-string v0, "MX"

    return-object v0

    .line 156
    :pswitch_3
    const/16 v0, 0x41

    if-lt v2, v0, :cond_0

    const/16 v0, 0x45

    if-le v2, v0, :cond_1

    :cond_0
    const/16 v0, 0x33

    if-lt v2, v0, :cond_5

    const/16 v0, 0x39

    if-gt v2, v0, :cond_5

    .line 157
    :cond_1
    const-string v0, "BR"

    return-object v0

    .line 161
    :pswitch_4
    const/16 v0, 0x41

    if-lt v2, v0, :cond_5

    const/16 v0, 0x54

    if-gt v2, v0, :cond_5

    .line 162
    const-string v0, "JP"

    return-object v0

    .line 166
    :pswitch_5
    const/16 v0, 0x4c

    if-lt v2, v0, :cond_5

    const/16 v0, 0x52

    if-gt v2, v0, :cond_5

    .line 167
    const-string v0, "KO"

    return-object v0

    .line 171
    :pswitch_6
    const-string v0, "CN"

    return-object v0

    .line 173
    :pswitch_7
    const/16 v0, 0x41

    if-lt v2, v0, :cond_5

    const/16 v0, 0x45

    if-gt v2, v0, :cond_5

    .line 174
    const-string v0, "IN"

    return-object v0

    .line 178
    :pswitch_8
    const/16 v0, 0x41

    if-lt v2, v0, :cond_2

    const/16 v0, 0x4d

    if-gt v2, v0, :cond_2

    .line 179
    const-string v0, "UK"

    return-object v0

    .line 181
    :cond_2
    const/16 v0, 0x4e

    if-lt v2, v0, :cond_5

    const/16 v0, 0x54

    if-gt v2, v0, :cond_5

    .line 182
    const-string v0, "DE"

    return-object v0

    .line 186
    :pswitch_9
    const/16 v0, 0x46

    if-lt v2, v0, :cond_3

    const/16 v0, 0x52

    if-gt v2, v0, :cond_3

    .line 187
    const-string v0, "FR"

    return-object v0

    .line 189
    :cond_3
    const/16 v0, 0x53

    if-lt v2, v0, :cond_5

    const/16 v0, 0x57

    if-gt v2, v0, :cond_5

    .line 190
    const-string v0, "ES"

    return-object v0

    .line 194
    :pswitch_a
    const-string v0, "DE"

    return-object v0

    .line 196
    :pswitch_b
    const/16 v0, 0x30

    if-eq v2, v0, :cond_4

    const/16 v0, 0x33

    if-lt v2, v0, :cond_5

    const/16 v0, 0x39

    if-gt v2, v0, :cond_5

    .line 197
    :cond_4
    const-string v0, "RU"

    return-object v0

    .line 201
    :pswitch_c
    const/16 v0, 0x41

    if-lt v2, v0, :cond_5

    const/16 v0, 0x52

    if-gt v2, v0, :cond_5

    .line 202
    const-string v0, "IT"

    return-object v0

    .line 206
    :cond_5
    :goto_0
    :pswitch_d
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_3
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_8
        :pswitch_d
        :pswitch_d
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method private static c(C)I
    .locals 2

    .line 116
    const/16 v0, 0x45

    if-lt p0, v0, :cond_0

    const/16 v0, 0x48

    if-gt p0, v0, :cond_0

    .line 117
    add-int/lit8 v0, p0, -0x45

    add-int/lit16 v0, v0, 0x7c0

    return v0

    .line 119
    :cond_0
    const/16 v0, 0x4a

    if-lt p0, v0, :cond_1

    const/16 v0, 0x4e

    if-gt p0, v0, :cond_1

    .line 120
    add-int/lit8 v0, p0, -0x4a

    add-int/lit16 v0, v0, 0x7c4

    return v0

    .line 122
    :cond_1
    const/16 v0, 0x50

    if-ne p0, v0, :cond_2

    .line 123
    const/16 v0, 0x7c9

    return v0

    .line 125
    :cond_2
    const/16 v0, 0x52

    if-lt p0, v0, :cond_3

    const/16 v0, 0x54

    if-gt p0, v0, :cond_3

    .line 126
    add-int/lit8 v0, p0, -0x52

    add-int/lit16 v0, v0, 0x7ca

    return v0

    .line 128
    :cond_3
    const/16 v0, 0x56

    if-lt p0, v0, :cond_4

    const/16 v0, 0x59

    if-gt p0, v0, :cond_4

    .line 129
    add-int/lit8 v0, p0, -0x56

    add-int/lit16 v0, v0, 0x7cd

    return v0

    .line 131
    :cond_4
    const/16 v0, 0x31

    if-lt p0, v0, :cond_5

    const/16 v0, 0x39

    if-gt p0, v0, :cond_5

    .line 132
    add-int/lit8 v0, p0, -0x31

    add-int/lit16 v0, v0, 0x7d1

    return v0

    .line 134
    :cond_5
    const/16 v0, 0x41

    if-lt p0, v0, :cond_6

    const/16 v0, 0x44

    if-gt p0, v0, :cond_6

    .line 135
    add-int/lit8 v0, p0, -0x41

    add-int/lit16 v0, v0, 0x7da

    return v0

    .line 137
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method private static c(Ljava/lang/CharSequence;)Z
    .locals 5

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 66
    add-int/lit8 v0, v3, 0x1

    invoke-static {v0}, Lo/ql;->a(I)I

    move-result v0

    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lo/ql;->a(C)I

    move-result v1

    mul-int/2addr v0, v1

    add-int/2addr v2, v0

    .line 65
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 68
    :cond_0
    const/16 v0, 0x8

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 69
    rem-int/lit8 v0, v2, 0xb

    invoke-static {v0}, Lo/ql;->d(I)C

    move-result v4

    .line 70
    if-ne v3, v4, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private static d(I)C
    .locals 1

    .line 106
    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    .line 107
    add-int/lit8 v0, p0, 0x30

    int-to-char v0, v0

    return v0

    .line 109
    :cond_0
    const/16 v0, 0xa

    if-ne p0, v0, :cond_1

    .line 110
    const/16 v0, 0x58

    return v0

    .line 112
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method


# virtual methods
.method public a(Lo/or;)Lo/qj;
    .locals 12

    .line 36
    invoke-virtual {p1}, Lo/or;->d()Lo/od;

    move-result-object v0

    sget-object v1, Lo/od;->d:Lo/od;

    if-eq v0, v1, :cond_0

    .line 37
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    invoke-virtual {p1}, Lo/or;->e()Ljava/lang/String;

    move-result-object v10

    .line 40
    sget-object v0, Lo/ql;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 41
    sget-object v0, Lo/ql;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_1
    :try_start_0
    invoke-static {v10}, Lo/ql;->c(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_2

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x3

    :try_start_1
    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 49
    new-instance v0, Lo/qj;

    .line 51
    const/4 v1, 0x3

    const/16 v2, 0x9

    invoke-virtual {v10, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 52
    const/16 v1, 0x9

    const/16 v2, 0x11

    invoke-virtual {v10, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 53
    invoke-static {v11}, Lo/ql;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 54
    const/4 v1, 0x3

    const/16 v2, 0x8

    invoke-virtual {v10, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 55
    const/16 v1, 0x9

    invoke-virtual {v10, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lo/ql;->c(C)I

    move-result v7

    .line 56
    const/16 v1, 0xa

    invoke-virtual {v10, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 57
    const/16 v1, 0xb

    invoke-virtual {v10, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    move-object v1, v10

    move-object v2, v11

    invoke-direct/range {v0 .. v9}, Lo/qj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ICLjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 58
    :catch_0
    move-exception v11

    .line 59
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 29
    invoke-virtual {p0, p1}, Lo/ql;->a(Lo/or;)Lo/qj;

    move-result-object v0

    return-object v0
.end method
