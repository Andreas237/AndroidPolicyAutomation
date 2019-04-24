.class public final Lo/bpq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo/bpq;


# instance fields
.field private d:Llibcore/icu/Transliterator;

.field private e:Llibcore/icu/Transliterator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lo/bpq;

    invoke-direct {v0}, Lo/bpq;-><init>()V

    sput-object v0, Lo/bpq;->b:Lo/bpq;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    :try_start_0
    new-instance v0, Llibcore/icu/Transliterator;

    const-string v1, "Han-Latin/Names; Latin-Ascii; Any-Upper"

    invoke-direct {v0, v1}, Llibcore/icu/Transliterator;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/bpq;->d:Llibcore/icu/Transliterator;

    .line 31
    new-instance v0, Llibcore/icu/Transliterator;

    const-string v1, "Latin-Ascii"

    invoke-direct {v0, v1}, Llibcore/icu/Transliterator;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/bpq;->e:Llibcore/icu/Transliterator;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1

    .line 40
    goto :goto_0

    .line 33
    :catch_0
    move-exception v2

    .line 35
    const-string v0, "HanziToPinyin"

    const-string v1, "Han-Latin/Names transliterator data is missing, RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    goto :goto_0

    .line 37
    :catch_1
    move-exception v2

    .line 39
    const-string v0, "HanziToPinyin"

    const-string v1, "Han-Latin/Names transliterator data is missing, UnsatisfiedLinkError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    :goto_0
    return-void
.end method

.method private a(CLo/bpr;)V
    .locals 2

    .line 55
    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bpr;->e(Ljava/lang/String;)V

    .line 57
    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    .line 59
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/bpr;->e(I)V

    .line 60
    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bpr;->b(Ljava/lang/String;)V

    .line 61
    return-void

    .line 64
    :cond_0
    const/16 v0, 0x250

    if-lt p1, v0, :cond_1

    const/16 v0, 0x1e00

    if-gt v0, p1, :cond_3

    const/16 v0, 0x1eff

    if-ge p1, v0, :cond_3

    .line 66
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/bpr;->e(I)V

    .line 67
    iget-object v0, p0, Lo/bpq;->e:Llibcore/icu/Transliterator;

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/bpq;->e:Llibcore/icu/Transliterator;

    .line 68
    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llibcore/icu/Transliterator;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 67
    :goto_0
    invoke-virtual {p2, v0}, Lo/bpr;->b(Ljava/lang/String;)V

    .line 69
    return-void

    .line 72
    :cond_3
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lo/bpr;->e(I)V

    .line 73
    iget-object v0, p0, Lo/bpq;->d:Llibcore/icu/Transliterator;

    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llibcore/icu/Transliterator;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bpr;->b(Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 76
    :cond_4
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lo/bpr;->e(I)V

    .line 77
    invoke-virtual {p2}, Lo/bpr;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/bpr;->b(Ljava/lang/String;)V

    .line 79
    :cond_5
    return-void
.end method

.method private c(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/StringBuilder;Ljava/util/ArrayList<Lo/bpr;>;I)V"
        }
    .end annotation

    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 84
    new-instance v0, Lo/bpr;

    invoke-direct {v0, p3, v1, v1}, Lo/bpr;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 86
    return-void
.end method

.method public static e()Lo/bpq;
    .locals 1

    .line 45
    sget-object v0, Lo/bpq;->b:Lo/bpq;

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bpq;->d:Llibcore/icu/Transliterator;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lo/bpr;>;"
        }
    .end annotation

    .line 90
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-virtual {p0}, Lo/bpq;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    :cond_0
    return-object v2

    .line 96
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    const/4 v5, 0x1

    .line 99
    new-instance v6, Lo/bpr;

    invoke-direct {v6}, Lo/bpr;-><init>()V

    .line 101
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_7

    .line 103
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 104
    invoke-static {v8}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 108
    invoke-direct {p0, v4, v2, v5}, Lo/bpq;->c(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    goto :goto_2

    .line 113
    :cond_2
    invoke-direct {p0, v8, v6}, Lo/bpq;->a(CLo/bpr;)V

    .line 114
    invoke-virtual {v6}, Lo/bpr;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 116
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 118
    invoke-direct {p0, v4, v2, v5}, Lo/bpq;->c(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 120
    :cond_3
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    new-instance v6, Lo/bpr;

    invoke-direct {v6}, Lo/bpr;-><init>()V

    goto :goto_1

    .line 125
    :cond_4
    invoke-virtual {v6}, Lo/bpr;->e()I

    move-result v0

    if-eq v5, v0, :cond_5

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 127
    invoke-direct {p0, v4, v2, v5}, Lo/bpq;->c(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 129
    :cond_5
    invoke-virtual {v6}, Lo/bpr;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    :goto_1
    invoke-virtual {v6}, Lo/bpr;->e()I

    move-result v5

    .line 101
    :cond_6
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 134
    :cond_7
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 136
    invoke-direct {p0, v4, v2, v5}, Lo/bpq;->c(Ljava/lang/StringBuilder;Ljava/util/ArrayList;I)V

    .line 138
    :cond_8
    return-object v2
.end method
