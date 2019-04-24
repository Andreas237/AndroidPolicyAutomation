.class public Lo/bqv;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a([Ljava/lang/String;)[Ljava/lang/String;
    .locals 15

    .line 57
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    const-string v6, ""

    .line 65
    move-object v9, p0

    array-length v10, v9

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_3

    aget-object v12, v9, v11

    .line 68
    invoke-static {v12}, Lo/bqv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 69
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const-string v6, ""

    .line 73
    :cond_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    .line 74
    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_2

    .line 76
    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 77
    invoke-static {}, Lo/bpm;->b()Lo/bpp;

    move-result-object v0

    invoke-interface {v0, v7}, Lo/bpp;->a(C)Ljava/lang/String;

    move-result-object v8

    .line 79
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    add-int/lit8 v0, v13, -0x1

    if-eq v14, v0, :cond_1

    .line 86
    const-string v0, ","

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 89
    :cond_2
    const-string v0, "|"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string v0, "|"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    const-string v0, "|"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 95
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 96
    const/4 v0, 0x0

    aput-object v9, v2, v0

    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 99
    const/4 v0, 0x1

    aput-object v10, v2, v0

    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bqv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 102
    const/4 v0, 0x2

    aput-object v11, v2, v0

    .line 104
    return-object v2
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 115
    move-object v2, p0

    .line 116
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 121
    :cond_0
    const-string v0, "||"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    const-string v2, ""

    .line 125
    :cond_1
    return-object v2
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 40
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    const-string v0, ""

    return-object v0

    .line 44
    :cond_0
    const-string v0, "[^\u4e00-\u9fa5]"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 45
    return-object v2
.end method
