.class public Lo/bng;
.super Landroid/widget/EditText;
.source "SourceFile"


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    return-void
.end method

.method private a()V
    .locals 6

    .line 68
    invoke-virtual {p0}, Lo/bng;->getFilters()[Landroid/text/InputFilter;

    move-result-object v1

    .line 69
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 71
    instance-of v0, v5, Lo/apb;

    if-eqz v0, :cond_0

    .line 73
    move-object v0, v5

    check-cast v0, Lo/apb;

    invoke-virtual {v0}, Lo/apb;->c()I

    move-result v0

    iput v0, p0, Lo/bng;->b:I

    .line 74
    goto :goto_1

    .line 69
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 77
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public onTextContextMenuItem(I)Z
    .locals 12

    .line 83
    const v0, 0x1020022

    if-ne p1, v0, :cond_8

    .line 85
    invoke-virtual {p0}, Lo/bng;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/content/ClipboardManager;

    .line 86
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 88
    iget v0, p0, Lo/bng;->b:I

    if-gtz v0, :cond_0

    .line 90
    invoke-direct {p0}, Lo/bng;->a()V

    .line 92
    :cond_0
    invoke-virtual {v3}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    .line 93
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 95
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_2
    invoke-virtual {p0}, Lo/bng;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 100
    invoke-virtual {p0}, Lo/bng;->getSelectionStart()I

    move-result v6

    .line 101
    invoke-virtual {p0}, Lo/bng;->getSelectionEnd()I

    move-result v7

    .line 102
    sub-int v8, v7, v6

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 104
    const/4 v10, 0x0

    .line 105
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 107
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    .line 112
    :cond_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int v1, v10, v8

    add-int/2addr v0, v1

    iget v1, p0, Lo/bng;->b:I

    if-le v0, v1, :cond_6

    .line 115
    iget v0, p0, Lo/bng;->b:I

    if-ne v10, v0, :cond_4

    .line 117
    iget v0, p0, Lo/bng;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    const/16 v2, 0x259

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 118
    const/16 v0, 0xa

    const/16 v1, 0x7ea

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    goto :goto_0

    .line 120
    :cond_4
    iget v0, p0, Lo/bng;->b:I

    if-ge v10, v0, :cond_5

    .line 122
    iget v0, p0, Lo/bng;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    const/16 v2, 0x120

    invoke-static {v1, v2, v0}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 123
    const/16 v0, 0xa

    const/16 v1, 0x7ea

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 126
    :cond_5
    :goto_0
    iget v0, p0, Lo/bng;->b:I

    sub-int v1, v10, v8

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-interface {v4, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    .line 129
    :cond_6
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lo/bqz;->a(Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 132
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    sget-object v1, Lo/bgh$c;->e:Lo/bgh$c;

    invoke-virtual {v0, v4, v1}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/text/SpannableStringBuilder;

    .line 134
    invoke-interface {v5, v6, v7, v11}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 135
    invoke-virtual {v11}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    add-int/2addr v0, v6

    invoke-virtual {p0, v0}, Lo/bng;->setSelection(I)V

    .line 137
    :cond_7
    const/4 v0, 0x1

    return v0

    .line 140
    :cond_8
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    move-result v0

    return v0
.end method
