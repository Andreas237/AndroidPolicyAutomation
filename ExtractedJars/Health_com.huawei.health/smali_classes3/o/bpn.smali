.class public final Lo/bpn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bpp;


# static fields
.field private static c:Lo/bpn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    new-instance v0, Lo/bpn;

    invoke-direct {v0}, Lo/bpn;-><init>()V

    sput-object v0, Lo/bpn;->c:Lo/bpn;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 169
    invoke-static {}, Lo/bpo;->d()Lo/bpo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Lo/bpo;->a(C)Lo/bpr;

    move-result-object v2

    .line 170
    invoke-virtual {v2}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v3

    .line 171
    if-eqz v3, :cond_0

    .line 173
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 176
    :cond_0
    return-object p1
.end method

.method public static c()Lo/bpn;
    .locals 1

    .line 26
    sget-object v0, Lo/bpn;->c:Lo/bpn;

    return-object v0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 106
    invoke-static {}, Lo/bpo;->d()Lo/bpo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bpo;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 109
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bpr;

    .line 110
    if-eqz v2, :cond_0

    .line 112
    invoke-virtual {v2}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v3

    .line 113
    if-eqz v3, :cond_0

    .line 115
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 118
    :cond_0
    goto :goto_0

    .line 125
    :cond_1
    invoke-direct {p0, p1}, Lo/bpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 127
    :goto_0
    return-object p1
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 136
    invoke-static {}, Lo/bpq;->e()Lo/bpq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bpq;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 139
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bpr;

    .line 140
    if-eqz v2, :cond_0

    .line 142
    invoke-virtual {v2}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v3

    .line 143
    if-eqz v3, :cond_0

    .line 145
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 148
    :cond_0
    goto :goto_0

    .line 155
    :cond_1
    invoke-direct {p0, p1}, Lo/bpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 157
    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(C)Ljava/lang/String;
    .locals 4

    .line 34
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    return-object v1

    .line 40
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    const/16 v0, 0x12

    if-lt v2, v0, :cond_1

    .line 45
    :try_start_0
    invoke-direct {p0, v1}, Lo/bpn;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 47
    :catch_0
    move-exception v3

    .line 49
    invoke-direct {p0, v1}, Lo/bpn;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :cond_1
    invoke-direct {p0, v1}, Lo/bpn;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 65
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    return-object p1

    .line 71
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 73
    const-string v3, ""

    .line 75
    const/16 v0, 0x12

    if-lt v1, v0, :cond_2

    .line 77
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 81
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bpn;->e(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 86
    goto :goto_1

    .line 83
    :catch_0
    move-exception v5

    .line 85
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bpn;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 87
    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 77
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    goto :goto_3

    .line 92
    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 94
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bpn;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 92
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 98
    :cond_3
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
