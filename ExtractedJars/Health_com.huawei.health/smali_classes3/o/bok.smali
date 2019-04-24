.class public Lo/bok;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 61
    invoke-static {p0}, Lo/bok;->c(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v4

    .line 63
    sget v0, Lcom/huawei/android/sns/R$id;->username_edit:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/EditText;

    .line 64
    sget v0, Lcom/huawei/android/sns/R$id;->dialog_describe_textview:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 65
    sget v0, Lcom/huawei/android/sns/R$id;->dialog_errormsg_textview:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 67
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v5, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 71
    :cond_0
    invoke-static {p2, v6}, Lo/bok;->e(Ljava/lang/String;Landroid/widget/TextView;)V

    .line 74
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 76
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 78
    move-object v8, p3

    .line 79
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 85
    :cond_1
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_2

    .line 87
    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 90
    :cond_2
    if-nez v8, :cond_3

    const-string v0, ""

    goto :goto_0

    :cond_3
    move-object v0, v8

    :goto_0
    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 91
    if-nez v8, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    :goto_1
    invoke-virtual {v5, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 92
    new-instance v0, Lo/bok$3;

    invoke-direct {v0, v5, v7}, Lo/bok$3;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;)V

    invoke-virtual {v5, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 113
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    new-instance v2, Lo/bok$1;

    invoke-direct {v2, v5, p5, p0, p4}, Lo/bok$1;-><init>(Landroid/widget/EditText;ZLandroid/app/Activity;Lo/boj$e;)V

    .line 114
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    new-instance v2, Lo/bok$5;

    invoke-direct {v2, p0, v5, p4}, Lo/bok$5;-><init>(Landroid/app/Activity;Landroid/widget/EditText;Lo/boj$e;)V

    .line 142
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    .line 155
    invoke-virtual {v9, v4}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 156
    invoke-virtual {v9}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 158
    invoke-static {p5, v9}, Lo/boj;->a(ZLandroid/app/AlertDialog;)V

    .line 160
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 162
    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    .line 165
    :cond_5
    return-object v9
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 42
    invoke-static/range {p0 .. p5}, Lo/bok;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    .line 43
    return-object v0
.end method

.method private static c(Landroid/app/Activity;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 196
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_alert_editdialog_text_entry:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 197
    return-object v3
.end method

.method static synthetic d(Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0

    .line 25
    invoke-static {p0, p1}, Lo/bok;->e(Landroid/widget/EditText;Landroid/widget/TextView;)V

    return-void
.end method

.method public static e(Landroid/app/AlertDialog;)V
    .locals 5

    .line 208
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$id;->dialog_errormsg_textview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 209
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$id;->dialog_describe_textview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 210
    if-eqz v2, :cond_0

    .line 212
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 216
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 219
    :cond_1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$id;->username_edit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/EditText;

    .line 220
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_edittext_bg_error:I

    invoke-virtual {v4, v0}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 222
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 223
    return-void
.end method

.method private static e(Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 1

    .line 232
    if-eqz p0, :cond_0

    .line 234
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_edittext_normal:I

    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 236
    :cond_0
    if-eqz p1, :cond_1

    .line 238
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 240
    :cond_1
    return-void
.end method

.method private static e(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 1

    .line 176
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 178
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 183
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 185
    :goto_0
    return-void
.end method
