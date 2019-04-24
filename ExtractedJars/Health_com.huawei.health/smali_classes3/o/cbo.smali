.class public Lo/cbo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private e:Lo/egw;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/cbo;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lo/czi;)V
    .locals 0

    .line 39
    invoke-direct/range {p0 .. p5}, Lo/cbo;->d(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lo/czi;)V

    return-void
.end method

.method static synthetic b(Lo/cbo;Landroid/content/Context;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/cbo;->c(Landroid/content/Context;)V

    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 196
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 197
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_3

    .line 198
    aget-char v0, v2, v3

    const v1, 0xff0c

    if-eq v0, v1, :cond_2

    aget-char v0, v2, v3

    const/16 v1, 0x3002

    if-ne v0, v1, :cond_0

    .line 199
    goto :goto_1

    .line 201
    :cond_0
    aget-char v0, v2, v3

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_1

    .line 202
    const/16 v0, 0x20

    aput-char v0, v2, v3

    .line 203
    goto :goto_1

    .line 204
    :cond_1
    aget-char v0, v2, v3

    const v1, 0xff00

    if-le v0, v1, :cond_2

    aget-char v0, v2, v3

    const v1, 0xff5f

    if-ge v0, v1, :cond_2

    .line 205
    aget-char v0, v2, v3

    const v1, 0xfee0

    sub-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, v2, v3

    .line 197
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 207
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 211
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 212
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 213
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 214
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lo/czi;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List<Ljava/lang/Integer;>;Lo/czi;)V"
        }
    .end annotation

    .line 186
    const-string v0, "AgrSignDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgrSignDialog_signAgrHttp aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v8

    .line 189
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v9

    .line 190
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v10

    .line 191
    new-instance v11, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v11}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 192
    move-object v0, v11

    move-object v1, p2

    move-object v2, p1

    move v3, p3

    move-object/from16 v4, p4

    move-object v5, v8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p5

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 193
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Landroid/content/Context;ILjava/lang/String;)V
    .locals 20

    .line 44
    if-nez p2, :cond_0

    .line 45
    const-string v0, "AgrSignDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAgrSignDialog context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 49
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 52
    const/4 v10, 0x0

    .line 53
    move-object/from16 v0, p2

    const v1, 0x7f070270

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11

    .line 54
    const v0, 0x7f1210cc

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cbo;->c:Landroid/widget/TextView;

    .line 55
    const v0, 0x7f1210cb

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cbo;->b:Landroid/widget/TextView;

    .line 56
    move-object/from16 v0, p2

    const v1, 0x7f020003

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 57
    move-object/from16 v0, p2

    const v1, 0x7f02021c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    .line 58
    const-string v14, ""

    .line 59
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 61
    :pswitch_0
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    new-instance v7, Landroid/text/SpannableString;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020212

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cbo;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 63
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 64
    new-instance v0, Lo/fhs;

    move-object/from16 v1, p2

    const-string v2, "HealthUserAgreement"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v15, v0

    .line 65
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    .line 65
    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 67
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    const/16 v1, 0x11

    invoke-virtual {v7, v15, v10, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 68
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020218

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 69
    goto/16 :goto_1

    .line 71
    :pswitch_1
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v7, Landroid/text/SpannableString;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020212

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cbo;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 73
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 74
    new-instance v0, Lo/fhs;

    move-object/from16 v1, p2

    const-string v2, "HealthPrivacy"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 75
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    .line 75
    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 77
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    move-object/from16 v1, v16

    const/16 v2, 0x11

    invoke-virtual {v7, v1, v10, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 78
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v13, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020218

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 79
    goto/16 :goto_1

    .line 81
    :pswitch_2
    const/16 v0, 0x76

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    const/16 v0, 0x2719

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v7, Landroid/text/SpannableString;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    const/4 v1, 0x1

    aput-object v13, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020213

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cbo;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 84
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 85
    new-instance v0, Lo/fhs;

    move-object/from16 v1, p2

    const-string v2, "HealthUserAgreement"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 86
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    .line 86
    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 88
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    move-object/from16 v1, v17

    const/16 v2, 0x11

    invoke-virtual {v7, v1, v10, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 90
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 91
    new-instance v0, Lo/fhs;

    move-object/from16 v1, p2

    const-string v2, "HealthPrivacy"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 92
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    .line 92
    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 94
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    move-object/from16 v1, v18

    const/16 v2, 0x11

    invoke-virtual {v7, v1, v10, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 95
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    const/4 v1, 0x1

    aput-object v13, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020219

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 96
    goto :goto_1

    .line 98
    :goto_0
    new-instance v7, Landroid/text/SpannableString;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    move-object/from16 v1, p2

    const v2, 0x7f020212

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cbo;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 99
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 100
    new-instance v0, Lo/fhs;

    move-object/from16 v1, p2

    const-string v2, "HealthUserAgreement"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v19, v0

    .line 101
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v10

    .line 101
    const/16 v2, 0x21

    invoke-virtual {v7, v0, v10, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 103
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    move-object/from16 v1, v19

    const/16 v2, 0x11

    invoke-virtual {v7, v1, v10, v0, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 106
    :goto_1
    move-object v9, v8

    .line 107
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->c:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 108
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->c:Landroid/widget/TextView;

    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    const-string v0, "AgrSignDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AgrSignDialog_signAgrHttp agrType "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    move/from16 v0, p3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 113
    new-instance v0, Lo/egw$c;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 114
    move-object/from16 v1, p2

    const v2, 0x7f020217

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 115
    invoke-virtual {v0, v11}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    .line 116
    move-object/from16 v1, p2

    const v2, 0x7f020203

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cbo$4;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p4

    invoke-direct {v2, v3, v4, v5, v9}, Lo/cbo$4;-><init>(Lo/cbo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cbo;->e:Lo/egw;

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->e:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->e:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 130
    return-void

    .line 133
    :cond_1
    move-object/from16 v0, p2

    const v1, 0x7f020004

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v15

    .line 134
    new-instance v0, Lo/egw$c;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 135
    move-object/from16 v1, p2

    const v2, 0x7f020217

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 136
    invoke-virtual {v0, v11}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    .line 137
    move-object/from16 v1, p2

    const v2, 0x7f020005

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cbo$1;

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    move/from16 v5, p3

    invoke-direct {v2, v3, v4, v5}, Lo/cbo$1;-><init>(Lo/cbo;Landroid/content/Context;I)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    new-instance v1, Lo/cbo$5;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p4

    move-object v5, v9

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v6}, Lo/cbo$5;-><init>(Lo/cbo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/Context;)V

    .line 156
    invoke-virtual {v0, v15, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 178
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cbo;->e:Lo/egw;

    .line 180
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->e:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 181
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbo;->e:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 182
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
