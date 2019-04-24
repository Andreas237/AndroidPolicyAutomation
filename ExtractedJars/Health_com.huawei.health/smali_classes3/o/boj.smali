.class public Lo/boj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/boj$a;,
        Lo/boj$d;,
        Lo/boj$c;,
        Lo/boj$e;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Lo/boj;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/boj;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;
    .locals 10

    .line 408
    move-object v6, p1

    .line 409
    move-object v7, p2

    .line 410
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 412
    const/4 v6, 0x0

    .line 413
    move-object v7, p1

    .line 416
    :cond_0
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lo/boj;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;

    move-result-object v8

    .line 417
    invoke-virtual {v8}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v9

    .line 419
    sget v0, Lcom/huawei/android/sns/R$string;->sns_delete:I

    if-eq p4, v0, :cond_1

    sget v0, Lcom/huawei/android/sns/R$string;->sns_clear:I

    if-ne p4, v0, :cond_2

    .line 421
    :cond_1
    new-instance v0, Lo/boj$9;

    invoke-direct {v0, v9, p0}, Lo/boj$9;-><init>(Landroid/app/AlertDialog;Landroid/app/Activity;)V

    invoke-virtual {v9, v0}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 438
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 440
    invoke-virtual {v9}, Landroid/app/AlertDialog;->show()V

    .line 442
    :cond_3
    return-object v9
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILo/boj$e;ZZ)Landroid/app/AlertDialog;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 188
    invoke-static {p0}, Lo/boj;->b(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v7

    .line 190
    sget v0, Lcom/huawei/android/sns/R$id;->dialog_content_textview:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 191
    sget v0, Lcom/huawei/android/sns/R$id;->username_edit:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/EditText;

    .line 193
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 195
    invoke-virtual {v8, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 197
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v8, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 200
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v9, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    goto :goto_0

    .line 205
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 206
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p0, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v9, v1, v0, v2, v3}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 212
    :cond_1
    :goto_0
    invoke-static {p3, v7}, Lo/boj;->e(Ljava/lang/String;Landroid/view/View;)V

    .line 215
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    move/from16 v2, p5

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v9, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 219
    move/from16 v0, p5

    const/16 v1, 0x14

    if-gt v0, v1, :cond_2

    .line 221
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/widget/EditText;->setSingleLine(Z)V

    goto :goto_1

    .line 225
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 228
    :goto_1
    move-object/from16 v10, p4

    .line 229
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 231
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 235
    :cond_3
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, p5

    if-le v0, v1, :cond_4

    .line 237
    const/4 v0, 0x0

    move/from16 v1, p5

    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 240
    :cond_4
    if-nez v10, :cond_5

    const-string v0, ""

    goto :goto_2

    :cond_5
    move-object v0, v10

    :goto_2
    invoke-virtual {v9, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 241
    if-nez v10, :cond_6

    const/4 v0, 0x0

    goto :goto_3

    :cond_6
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    :goto_3
    invoke-virtual {v9, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 243
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lo/boj$2;

    move-object v2, v9

    move/from16 v3, p9

    move-object v4, p0

    move/from16 v5, p10

    move-object/from16 v6, p8

    invoke-direct/range {v1 .. v6}, Lo/boj$2;-><init>(Landroid/widget/EditText;ZLandroid/app/Activity;ZLo/boj$e;)V

    .line 244
    move/from16 v2, p7

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lo/boj$5;

    move-object/from16 v2, p8

    invoke-direct {v1, p0, v9, v2}, Lo/boj$5;-><init>(Landroid/app/Activity;Landroid/widget/EditText;Lo/boj$e;)V

    .line 276
    move/from16 v2, p6

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 288
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v11

    .line 289
    invoke-virtual {v11, v7}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 290
    invoke-virtual {v11}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 292
    move/from16 v0, p9

    invoke-static {v0, v11}, Lo/boj;->a(ZLandroid/app/AlertDialog;)V

    .line 294
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_7

    .line 296
    invoke-virtual {v11}, Landroid/app/AlertDialog;->show()V

    .line 299
    :cond_7
    return-object v11
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 35
    sget-object v0, Lo/boj;->d:Ljava/lang/String;

    return-object v0
.end method

.method public static a(ZLandroid/app/AlertDialog;)V
    .locals 1

    .line 330
    if-eqz p0, :cond_0

    .line 332
    return-void

    .line 334
    :cond_0
    new-instance v0, Lo/boj$7;

    invoke-direct {v0}, Lo/boj$7;-><init>()V

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 348
    return-void
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;
    .locals 1

    .line 391
    invoke-static/range {p0 .. p5}, Lo/boj;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILo/boj$d;)Landroid/app/AlertDialog;
    .locals 3

    .line 568
    new-instance v1, Lo/boj$3;

    invoke-direct {v1, p4}, Lo/boj$3;-><init>(Lo/boj$d;)V

    .line 582
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 583
    invoke-virtual {v0, p3, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    .line 584
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 588
    :cond_0
    return-object v2
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILo/boj$e;)Landroid/app/AlertDialog;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 162
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const-string v3, ""

    move-object v4, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    const/16 v5, 0x64

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v10}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILo/boj$e;ZZ)Landroid/app/AlertDialog;

    move-result-object v11

    .line 164
    return-object v11
.end method

.method public static b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 142
    move-object v0, p0

    move-object v1, p1

    const-string v2, ""

    const-string v3, ""

    move-object v4, p2

    sget v6, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v7, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    move-object v8, p3

    move/from16 v9, p4

    const/16 v5, 0x14

    const/4 v10, 0x1

    invoke-static/range {v0 .. v10}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILo/boj$e;ZZ)Landroid/app/AlertDialog;

    move-result-object v11

    .line 144
    return-object v11
.end method

.method private static b(Landroid/app/Activity;)Landroid/view/View;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 359
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_alert_dialog_text_entry:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 360
    return-object v3
.end method

.method public static b(Landroid/content/DialogInterface;Z)V
    .locals 1

    .line 101
    new-instance v0, Lo/boj$1;

    invoke-direct {v0, p0, p1}, Lo/boj$1;-><init>(Landroid/content/DialogInterface;Z)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 127
    return-void
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;
    .locals 3

    .line 459
    invoke-static/range {p0 .. p5}, Lo/boj;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 460
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    .line 461
    new-instance v0, Lo/boj$6;

    invoke-direct {v0, v2, p0}, Lo/boj$6;-><init>(Landroid/app/AlertDialog;Landroid/app/Activity;)V

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 477
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 479
    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 481
    :cond_0
    return-object v2
.end method

.method public static c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lo/boj$c;)V
    .locals 6

    .line 374
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 375
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog$Builder;
    .locals 3

    .line 498
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lo/boj$10;

    invoke-direct {v1, p5}, Lo/boj$10;-><init>(Lo/boj$c;)V

    .line 499
    invoke-virtual {v0, p4, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lo/boj$8;

    invoke-direct {v1, p5}, Lo/boj$8;-><init>(Lo/boj$c;)V

    .line 508
    invoke-virtual {v0, p3, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 518
    return-object v2
.end method

.method public static e(Landroid/app/Activity;Ljava/lang/String;Lo/boj$d;)Landroid/app/AlertDialog;
    .locals 4

    .line 530
    new-instance v2, Lo/boj$15;

    invoke-direct {v2, p2}, Lo/boj$15;-><init>(Lo/boj$d;)V

    .line 544
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_confirm:I

    .line 545
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    .line 547
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 549
    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    .line 552
    :cond_0
    return-object v3
.end method

.method public static e(Landroid/app/Activity;ILo/boj$a;)V
    .locals 3

    .line 600
    new-instance v1, Lo/boj$4;

    invoke-direct {v1, p2}, Lo/boj$4;-><init>(Lo/boj$a;)V

    .line 610
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1, v1}, Landroid/app/AlertDialog$Builder;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    .line 612
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 614
    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 616
    :cond_0
    return-void
.end method

.method private static e(Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    .line 310
    sget v0, Lcom/huawei/android/sns/R$id;->dialog_describe_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 311
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 313
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 318
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 320
    :goto_0
    return-void
.end method
