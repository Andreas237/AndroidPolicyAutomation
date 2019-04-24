.class public Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# static fields
.field public static final COUNTRY_CODE_CN:Ljava/lang/String; = "CN"

.field public static final LANGUAGE_CODE_ZH:Ljava/lang/String; = "zh"

.field public static final LOCALE_ABROAD:Ljava/lang/String; = "en-US"

.field public static final LOCALE_CHINA:Ljava/lang/String; = "zh-CN"

.field public static final TAG:Ljava/lang/String;

.field private static customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog; = null


# instance fields
.field private URL:Ljava/lang/String;

.field private addView:Landroid/widget/LinearLayout;

.field mContext:Landroid/content/Context;

.field private negativeButtonClickListener:Landroid/view/View$OnClickListener;

.field private negativeButtonText:Ljava/lang/String;

.field private positiveButtonClickListener:Landroid/view/View$OnClickListener;

.field private positiveButtonText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-class v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 52
    const-string v0, "<a href=\"https://health.vmall.com/help/mobilephone/zh-CN/index.html\">$</a>"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    .line 66
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    .line 67
    return-void
.end method

.method static synthetic access$000(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 38
    invoke-static {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->startWebViewActivity(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method private static closeCustomDialog21()V
    .locals 1

    .line 236
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    .line 237
    return-void
.end method

.method public static createNotice(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;
    .locals 2

    .line 76
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$style;->CustomDialog:I

    invoke-direct {v0, p0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    .line 77
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$layout;->commonui_notice21_message:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setContentView(I)V

    .line 78
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    return-object v0
.end method

.method public static createSetting(Landroid/content/Context;)Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;
    .locals 2

    .line 192
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    .line 193
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$layout;->commonui_info21:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setContentView(I)V

    .line 194
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    return-object v0
.end method

.method public static setTextLinkOpenByWebView(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)Landroid/text/SpannableStringBuilder;
    .locals 14

    .line 108
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 109
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    .line 110
    instance-of v0, v3, Landroid/text/SpannableStringBuilder;

    if-eqz v0, :cond_2

    .line 111
    move-object v4, v3

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 113
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-class v1, Landroid/text/style/URLSpan;

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    .line 114
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    array-length v0, v5

    if-eqz v0, :cond_1

    .line 115
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 116
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    .line 117
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    .line 118
    instance-of v0, v9, Landroid/text/style/URLSpan;

    if-eqz v0, :cond_0

    .line 120
    move-object v12, v9

    check-cast v12, Landroid/text/style/URLSpan;

    .line 121
    invoke-virtual {v12}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v13

    .line 122
    const-string v0, "PayManagerSettingSwitchDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 124
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;

    move-object/from16 v1, p2

    invoke-direct {v0, v1, p0, v13}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;-><init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V

    const/16 v1, 0x11

    invoke-virtual {v4, v0, v10, v11, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 115
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 143
    :cond_1
    return-object v4

    .line 146
    :cond_2
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private showBottom(Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)Landroid/view/WindowManager$LayoutParams;
    .locals 7

    .line 210
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 211
    const/16 v0, 0x50

    invoke-virtual {v5, v0}, Landroid/view/Window;->setGravity(I)V

    .line 212
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 213
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v6

    .line 214
    const/4 v0, -0x1

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 215
    const/4 v0, -0x2

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 216
    return-object v6
.end method

.method private static startWebViewActivity(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 151
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 152
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 154
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 155
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 221
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V

    .line 222
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    .line 224
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->closeCustomDialog21()V

    .line 225
    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 229
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 231
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    .line 232
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->closeCustomDialog21()V

    .line 233
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 70
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 71
    return-void
.end method

.method public setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->negativeButtonText:Ljava/lang/String;

    .line 163
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    .line 164
    return-void
.end method

.method public setNoticeMessage(IILjava/lang/String;)V
    .locals 10

    .line 87
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->notice_message:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 88
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->notice_message1:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    const-string v1, "$"

    invoke-virtual {v0, v1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    .line 91
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    .line 93
    invoke-virtual {v6}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v8

    .line 94
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the language code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the country code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "zh"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CN"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    const-string v1, "zh-CN"

    const-string v2, "en-US"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->URL:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 102
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-static {v0, v9, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setTextLinkOpenByWebView(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 105
    return-void
.end method

.method public setNoticeTitle(Ljava/lang/String;)V
    .locals 3

    .line 83
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->notice_title:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 84
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    return-void
.end method

.method public setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->positiveButtonText:Ljava/lang/String;

    .line 159
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    .line 160
    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 2

    .line 199
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->person_info_add_view:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->addView:Landroid/widget/LinearLayout;

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->addView:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->addView:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 202
    return-void
.end method

.method public startNotice()V
    .locals 4

    .line 167
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->notice_button_left:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egd;

    .line 168
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget v1, Lcom/huawei/wallet/R$id;->notice_button_right:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/egd;

    .line 169
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->negativeButtonText:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 172
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->positiveButtonText:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->positiveButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->negativeButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    sget-object v1, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->customDialog21:Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;

    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->showBottom(Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 184
    return-void

    .line 186
    :cond_4
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 187
    return-void
.end method
