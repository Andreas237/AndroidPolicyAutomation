.class public Lo/bnh;
.super Landroid/widget/TextView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "WrongCall"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bnh$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const-class v0, Lo/bnh;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bnh;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bnh;->e(Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0, p2}, Lo/bnh;->e(Landroid/util/AttributeSet;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    invoke-direct {p0, p2}, Lo/bnh;->e(Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method private b(II)V
    .locals 2

    .line 133
    invoke-virtual {p0}, Lo/bnh;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 134
    invoke-direct {p0, v1, p1, p2}, Lo/bnh;->c(Ljava/lang/CharSequence;II)V

    .line 135
    return-void
.end method

.method private c(Ljava/lang/CharSequence;II)V
    .locals 0

    .line 128
    invoke-virtual {p0, p1}, Lo/bnh;->setText(Ljava/lang/CharSequence;)V

    .line 129
    invoke-super {p0, p2, p3}, Landroid/widget/TextView;->onMeasure(II)V

    .line 130
    return-void
.end method

.method private d(Landroid/text/SpannableStringBuilder;II)Lo/bnh$c;
    .locals 13

    .line 81
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    array-length v0, v3

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    new-instance v5, Ljava/util/ArrayList;

    array-length v0, v3

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    move-object v6, v3

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 86
    invoke-virtual {p1, v9}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    .line 87
    add-int/lit8 v0, v10, -0x1

    invoke-direct {p0, p1, v0}, Lo/bnh;->d(Ljava/lang/CharSequence;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string v0, " "

    invoke-virtual {p1, v10, v0}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 89
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_0
    invoke-virtual {p1, v9}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    .line 93
    invoke-direct {p0, p1, v11}, Lo/bnh;->d(Ljava/lang/CharSequence;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const-string v0, " "

    invoke-virtual {p1, v11, v0}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 95
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_1
    move/from16 v0, p3

    :try_start_0
    invoke-direct {p0, p1, p2, v0}, Lo/bnh;->c(Ljava/lang/CharSequence;II)V

    .line 100
    invoke-static {v5, v4}, Lo/bnh$c;->d(Ljava/util/List;Ljava/util/List;)Lo/bnh$c;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 101
    :catch_0
    move-exception v12

    .line 102
    sget-object v0, Lo/bnh;->a:Ljava/lang/String;

    const-string v1, "addSpacesAroundSpansUntilFixed IndexOutOfBoundsException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 106
    :cond_2
    sget-object v0, Lo/bnh;->a:Ljava/lang/String;

    const-string v1, "--Could not fix the Spanned by adding spaces around spans"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    invoke-static {}, Lo/bnh$c;->a()Lo/bnh$c;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/CharSequence;I)Z
    .locals 2

    .line 121
    if-ltz p2, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le p2, v0, :cond_1

    .line 122
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 124
    :cond_1
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(II)V
    .locals 3

    .line 55
    invoke-virtual {p0}, Lo/bnh;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 56
    if-eqz v2, :cond_0

    instance-of v0, v2, Landroid/text/Spanned;

    if-eqz v0, :cond_0

    .line 57
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0, p1, p2}, Lo/bnh;->e(Landroid/text/SpannableStringBuilder;II)V

    goto :goto_0

    .line 59
    :cond_0
    sget-object v0, Lo/bnh;->a:Ljava/lang/String;

    const-string v1, "--The text isn\'t a Spanned"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0, p1, p2}, Lo/bnh;->b(II)V

    .line 62
    :goto_0
    return-void
.end method

.method private e(IILandroid/text/SpannableStringBuilder;Lo/bnh$c;)V
    .locals 7

    .line 138
    iget-object v0, p4, Lo/bnh$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 139
    invoke-virtual {p3, v2}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    .line 140
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p3, v3, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 142
    :try_start_0
    invoke-direct {p0, p3, p1, p2}, Lo/bnh;->c(Ljava/lang/CharSequence;II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    goto :goto_1

    .line 143
    :catch_0
    move-exception v4

    .line 144
    const-string v0, " "

    invoke-virtual {p3, v3, v0}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 146
    :goto_1
    goto :goto_0

    .line 148
    :cond_0
    const/4 v1, 0x1

    .line 149
    iget-object v0, p4, Lo/bnh$c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 150
    invoke-virtual {p3, v3}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    .line 151
    add-int/lit8 v0, v4, -0x1

    invoke-virtual {p3, v0, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 153
    :try_start_1
    invoke-direct {p0, p3, p1, p2}, Lo/bnh;->c(Ljava/lang/CharSequence;II)V
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    const/4 v1, 0x0

    .line 159
    goto :goto_3

    .line 155
    :catch_1
    move-exception v5

    .line 156
    const/4 v1, 0x1

    .line 157
    add-int/lit8 v6, v4, -0x1

    .line 158
    const-string v0, " "

    invoke-virtual {p3, v6, v0}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 160
    :goto_3
    goto :goto_2

    .line 162
    :cond_1
    if-eqz v1, :cond_2

    .line 163
    invoke-virtual {p0, p3}, Lo/bnh;->setText(Ljava/lang/CharSequence;)V

    .line 164
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    .line 166
    :cond_2
    return-void
.end method

.method private e(Landroid/text/SpannableStringBuilder;II)V
    .locals 2

    .line 111
    invoke-direct {p0, p1, p2, p3}, Lo/bnh;->d(Landroid/text/SpannableStringBuilder;II)Lo/bnh$c;

    move-result-object v1

    .line 113
    iget-boolean v0, v1, Lo/bnh$c;->b:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-direct {p0, p2, p3, p1, v1}, Lo/bnh;->e(IILandroid/text/SpannableStringBuilder;Lo/bnh$c;)V

    goto :goto_0

    .line 116
    :cond_0
    invoke-direct {p0, p2, p3}, Lo/bnh;->b(II)V

    .line 118
    :goto_0
    return-void
.end method

.method private e(Landroid/util/AttributeSet;)V
    .locals 0

    .line 65
    if-eqz p1, :cond_0

    .line 66
    invoke-static {p0}, Lo/bnu;->b(Landroid/widget/TextView;)V

    .line 68
    :cond_0
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3

    .line 73
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 74
    :catch_0
    move-exception v2

    .line 75
    sget-object v0, Lo/bnh;->a:Ljava/lang/String;

    const-string v1, "onMeasure IndexOutOfBoundsException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0, p1, p2}, Lo/bnh;->e(II)V

    .line 78
    :goto_0
    return-void
.end method
