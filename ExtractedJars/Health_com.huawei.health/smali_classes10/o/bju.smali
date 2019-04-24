.class public Lo/bju;
.super Landroid/widget/EditText;
.source "SourceFile"


# instance fields
.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 40
    invoke-direct {p0}, Lo/bju;->e()V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    invoke-direct {p0}, Lo/bju;->e()V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    invoke-direct {p0}, Lo/bju;->e()V

    .line 29
    return-void
.end method

.method private e()V
    .locals 1

    .line 48
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v0

    iput v0, p0, Lo/bju;->b:I

    .line 49
    return-void
.end method


# virtual methods
.method public onTextContextMenuItem(I)Z
    .locals 15

    .line 54
    move/from16 v0, p1

    const v1, 0x1020022

    if-ne v0, v1, :cond_7

    .line 56
    invoke-virtual {p0}, Lo/bju;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/ClipboardManager;

    .line 57
    invoke-virtual {v6}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 59
    invoke-virtual {v6}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    .line 60
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 62
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 65
    :cond_1
    invoke-virtual {p0}, Lo/bju;->getText()Landroid/text/Editable;

    move-result-object v8

    .line 66
    invoke-virtual {p0}, Lo/bju;->getSelectionStart()I

    move-result v9

    .line 67
    invoke-virtual {p0}, Lo/bju;->getSelectionEnd()I

    move-result v10

    .line 68
    sub-int v11, v10, v9

    .line 69
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 70
    const/4 v13, 0x0

    .line 71
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 73
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    .line 78
    :cond_2
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int v1, v13, v11

    add-int/2addr v0, v1

    iget v1, p0, Lo/bju;->b:I

    if-le v0, v1, :cond_5

    .line 81
    iget v0, p0, Lo/bju;->b:I

    if-ne v13, v0, :cond_3

    .line 83
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_input_reached_max_words:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 85
    :cond_3
    iget v0, p0, Lo/bju;->b:I

    if-ge v13, v0, :cond_4

    .line 87
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_share_textmsg_too_long:I

    iget v2, p0, Lo/bju;->b:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lo/bju;->b:I

    .line 88
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 87
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 89
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v14}, Lo/brh;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 91
    :cond_4
    :goto_0
    iget v0, p0, Lo/bju;->b:I

    sub-int v1, v13, v11

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-interface {v7, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    .line 93
    :cond_5
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 95
    invoke-interface {v8, v9, v10, v7}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 96
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr v0, v9

    invoke-virtual {p0, v0}, Lo/bju;->setSelection(I)V

    .line 98
    :cond_6
    const/4 v0, 0x1

    return v0

    .line 101
    :cond_7
    move/from16 v0, p1

    invoke-super {p0, v0}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    move-result v0

    return v0
.end method
