.class public Lo/bnr;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# static fields
.field private static d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 62
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "hwsns://followAssist"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "hwsns://verifyFriend"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "hwsns://appInfoCheck"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "hwsns://receiveSysMessage"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "hwid://com.huawei.hwid/ModifyPassword"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/bnr;->d:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 5

    .line 187
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    const/4 v0, 0x0

    return v0

    .line 191
    :cond_0
    sget-object v1, Lo/bnr;->d:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 193
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 198
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/widget/TextView;Lo/bge;)V
    .locals 13

    .line 140
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 142
    invoke-static {v3}, Lo/bnr;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 144
    return-void

    .line 148
    :cond_0
    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v4

    .line 150
    new-instance v5, Landroid/text/SpannableStringBuilder;

    invoke-direct {v5, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 153
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-class v1, Landroid/text/style/URLSpan;

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Landroid/text/style/URLSpan;

    .line 154
    if-eqz v6, :cond_1

    .line 156
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    .line 158
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v11

    .line 159
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v12

    .line 160
    invoke-virtual {v5, v10}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 161
    new-instance v0, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;

    invoke-virtual {v10}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/huawei/health/sns/ui/widget/SNSUrlSpan;-><init>(Ljava/lang/String;Lo/bge;)V

    move-object v10, v0

    .line 162
    const/4 v0, 0x0

    invoke-virtual {v5, v10, v11, v12, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 156
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 167
    :cond_1
    invoke-virtual {p0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    invoke-virtual {p0}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v7

    .line 170
    if-eqz v7, :cond_2

    instance-of v0, v7, Landroid/text/method/LinkMovementMethod;

    if-nez v0, :cond_3

    .line 172
    :cond_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getLinksClickable()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 174
    invoke-static {}, Lo/bnr;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 177
    :cond_3
    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 14

    .line 74
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 77
    const/4 v0, 0x1

    if-eq v5, v0, :cond_0

    if-eqz v5, :cond_0

    const/4 v0, 0x3

    if-ne v5, v0, :cond_5

    .line 81
    :cond_0
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v6, v0

    .line 82
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v7, v0

    .line 84
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v0

    sub-int/2addr v6, v0

    .line 85
    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v0

    sub-int/2addr v7, v0

    .line 87
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollX()I

    move-result v0

    add-int/2addr v6, v0

    .line 88
    invoke-virtual {p1}, Landroid/widget/TextView;->getScrollY()I

    move-result v0

    add-int/2addr v7, v0

    .line 90
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v8

    .line 91
    invoke-virtual {v8, v7}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v9

    .line 92
    int-to-float v0, v6

    invoke-virtual {v8, v9, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v10

    .line 94
    const-class v0, Landroid/text/style/ClickableSpan;

    move-object/from16 v1, p2

    invoke-interface {v1, v10, v10, v0}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [Landroid/text/style/ClickableSpan;

    .line 96
    array-length v0, v11

    if-eqz v0, :cond_4

    .line 98
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 99
    invoke-static {}, Lo/bom;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Lcom/huawei/android/sns/R$color;->sns_button_text_nomal:I

    goto :goto_0

    :cond_1
    sget v1, Lcom/huawei/android/sns/R$color;->sns_ya_lan:I

    .line 98
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v12

    .line 101
    const/4 v0, 0x1

    if-ne v5, v0, :cond_2

    .line 103
    const/4 v0, 0x0

    aget-object v0, v11, v0

    invoke-virtual {v0, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    .line 105
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v12}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 v1, 0x0

    aget-object v1, v11, v1

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    aget-object v2, v11, v2

    .line 106
    move-object/from16 v3, p2

    invoke-interface {v3, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 105
    move-object/from16 v3, p2

    const/16 v4, 0x21

    invoke-interface {v3, v0, v1, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 107
    invoke-static/range {p2 .. p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    goto :goto_1

    .line 110
    :cond_2
    if-nez v5, :cond_3

    .line 112
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_button_text_pressed:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v13

    .line 113
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v13}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 v1, 0x0

    aget-object v1, v11, v1

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    aget-object v2, v11, v2

    .line 114
    move-object/from16 v3, p2

    invoke-interface {v3, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 113
    move-object/from16 v3, p2

    const/16 v4, 0x21

    invoke-interface {v3, v0, v1, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 116
    const/4 v0, 0x0

    aget-object v0, v11, v0

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    aget-object v1, v11, v1

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v2, p2

    invoke-static {v2, v0, v1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    .line 117
    goto :goto_1

    .line 120
    :cond_3
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v12}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 v1, 0x0

    aget-object v1, v11, v1

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    aget-object v2, v11, v2

    .line 121
    move-object/from16 v3, p2

    invoke-interface {v3, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 120
    move-object/from16 v3, p2

    const/16 v4, 0x21

    invoke-interface {v3, v0, v1, v2, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 122
    invoke-static/range {p2 .. p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 124
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 128
    :cond_4
    invoke-static/range {p2 .. p2}, Landroid/text/Selection;->removeSelection(Landroid/text/Spannable;)V

    .line 131
    :cond_5
    const/4 v0, 0x0

    return v0
.end method
