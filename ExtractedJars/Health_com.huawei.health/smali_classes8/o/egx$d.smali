.class public Lo/egx$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field private static i:Lo/egx;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Lo/egd;

.field private k:Lo/egd;

.field private l:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egx$d;->a:Landroid/widget/RelativeLayout;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egx$d;->b:Landroid/widget/LinearLayout;

    .line 73
    const-string v0, "<a href=\"https://health.vmall.com/help/mobilephone/zh-CN/index.html\">$</a>"

    iput-object v0, p0, Lo/egx$d;->l:Ljava/lang/String;

    .line 74
    const-string v0, "com.huawei.bone"

    iput-object v0, p0, Lo/egx$d;->p:Ljava/lang/String;

    .line 80
    iput-object p1, p0, Lo/egx$d;->c:Landroid/content/Context;

    .line 81
    return-void
.end method

.method static synthetic a(Lo/egx$d;)Landroid/content/Context;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 241
    :try_start_0
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.miui.securitycenter"

    const-string v1, "com.miui.permcenter.autostart.AutoStartManagementActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 244
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 245
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    goto :goto_0

    .line 246
    :catch_0
    move-exception v4

    .line 247
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not XIAOMI, start meizu process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-direct {p0}, Lo/egx$d;->d()V

    .line 251
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)Landroid/text/SpannableStringBuilder;
    .locals 14

    .line 311
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 312
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    .line 313
    instance-of v0, v3, Landroid/text/SpannableStringBuilder;

    if-eqz v0, :cond_2

    .line 314
    move-object v4, v3

    check-cast v4, Landroid/text/SpannableStringBuilder;

    .line 316
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-class v1, Landroid/text/style/URLSpan;

    const/4 v2, 0x0

    invoke-virtual {v4, v2, v0, v1}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    .line 317
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    array-length v0, v5

    if-eqz v0, :cond_1

    .line 318
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 319
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    .line 320
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    .line 321
    instance-of v0, v9, Landroid/text/style/URLSpan;

    if-eqz v0, :cond_0

    .line 323
    move-object v12, v9

    check-cast v12, Landroid/text/style/URLSpan;

    .line 324
    invoke-virtual {v12}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v13

    .line 325
    invoke-virtual {v4, v9}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 326
    new-instance v0, Lo/egx$d$4;

    move-object/from16 v1, p2

    invoke-direct {v0, v1, p0, v13}, Lo/egx$d$4;-><init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V

    const/16 v1, 0x11

    invoke-virtual {v4, v0, v10, v11, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 318
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 350
    :cond_1
    return-object v4

    .line 353
    :cond_2
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 266
    :try_start_0
    new-instance v4, Landroid/content/ComponentName;

    const-string v0, "com.coloros.safecenter"

    const-string v1, "com.coloros.privacypermissionsentry.PermissionTopActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 269
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 270
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    goto :goto_0

    .line 271
    :catch_0
    move-exception v4

    .line 272
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not oppo, start system setting process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-direct {p0}, Lo/egx$d;->h()V

    .line 275
    :goto_0
    return-void
.end method

.method static synthetic c()Lo/egx;
    .locals 1

    .line 62
    sget-object v0, Lo/egx$d;->i:Lo/egx;

    return-object v0
.end method

.method static synthetic c(Lo/egx$d;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lo/egx$d;->a()V

    return-void
.end method

.method private d()V
    .locals 5

    .line 255
    :try_start_0
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.meizu.safe"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 261
    goto :goto_0

    .line 256
    :catch_0
    move-exception v4

    .line 257
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not MEIZU, start oppo process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    invoke-direct {p0}, Lo/egx$d;->b()V

    .line 261
    goto :goto_0

    .line 259
    :catch_1
    move-exception v4

    .line 260
    invoke-direct {p0}, Lo/egx$d;->b()V

    .line 262
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/egx$d;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lo/egx$d;->f()V

    return-void
.end method

.method private static e(Landroid/content/Context;)V
    .locals 2

    .line 231
    new-instance v0, Lo/egx;

    sget v1, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    invoke-direct {v0, p0, v1}, Lo/egx;-><init>(Landroid/content/Context;I)V

    sput-object v0, Lo/egx$d;->i:Lo/egx;

    .line 232
    return-void
.end method

.method private f()V
    .locals 5

    .line 302
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "package:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/egx$d;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 304
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    goto :goto_0

    .line 305
    :catch_0
    move-exception v4

    .line 306
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t open system setting page. ingnored!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    :goto_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 279
    :try_start_0
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.iqoo.secure"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 285
    goto :goto_0

    .line 280
    :catch_0
    move-exception v4

    .line 281
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not vivo, start system setting process"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    invoke-direct {p0}, Lo/egx$d;->i()V

    .line 285
    goto :goto_0

    .line 283
    :catch_1
    move-exception v4

    .line 284
    invoke-direct {p0}, Lo/egx$d;->i()V

    .line 286
    :goto_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 290
    :try_start_0
    new-instance v2, Landroid/content/ComponentName;

    const-string v0, "com.letv.android.letvsafe"

    const-string v1, "com.letv.android.letvsafe.BackgroundAppManageActivity"

    invoke-direct {v2, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 293
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 294
    iget-object v0, p0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    goto :goto_0

    .line 295
    :catch_0
    move-exception v2

    .line 296
    invoke-direct {p0}, Lo/egx$d;->f()V

    .line 298
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;F)I
    .locals 3

    .line 235
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 236
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public e()Lo/egx;
    .locals 31

    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/egx;->d(J)J

    .line 100
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/egx$d;->e(Landroid/content/Context;)V

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 102
    sget v0, Lcom/huawei/ui/commonui/R$layout;->custom_securitymanagersetting_alert_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 103
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_text_alert_dailog_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 104
    instance-of v0, v6, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 105
    move-object v0, v6

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->g:Landroid/widget/TextView;

    .line 107
    :cond_0
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 108
    instance-of v0, v7, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 109
    move-object v0, v7

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->f:Landroid/widget/TextView;

    .line 112
    :cond_1
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 113
    instance-of v0, v8, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 114
    move-object v0, v8

    check-cast v0, Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->a:Landroid/widget/RelativeLayout;

    .line 116
    :cond_2
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 117
    instance-of v0, v9, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 118
    move-object v0, v9

    check-cast v0, Landroid/widget/LinearLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->b:Landroid/widget/LinearLayout;

    .line 120
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_unusual_stopped_message_new_health:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_unusual_stopped_message_more_new_health:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->l:Ljava/lang/String;

    const-string v1, "$"

    invoke-virtual {v0, v1, v11}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->l:Ljava/lang/String;

    .line 124
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v12

    .line 125
    invoke-virtual {v12}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v13

    .line 126
    invoke-virtual {v12}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v14

    .line 127
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the language code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the country code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const-string v0, "zh"

    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "CN"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->l:Ljava/lang/String;

    const-string v1, "zh-CN"

    const-string v2, "en-US"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->l:Ljava/lang/String;

    .line 133
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egx$d;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 134
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 137
    :cond_5
    sget-object v0, Lo/egx;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the URL is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egx$d;->c:Landroid/content/Context;

    sget-object v2, Lo/egx$d;->i:Lo/egx;

    invoke-static {v1, v15, v2}, Lo/egx$d;->b(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->f:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 140
    new-instance v16, Landroid/util/TypedValue;

    invoke-direct/range {v16 .. v16}, Landroid/util/TypedValue;-><init>()V

    .line 141
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    move-object/from16 v2, v16

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    move-object/from16 v1, v16

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v17

    .line 143
    new-instance v18, Landroid/util/TypedValue;

    invoke-direct/range {v18 .. v18}, Landroid/util/TypedValue;-><init>()V

    .line 144
    new-instance v19, Landroid/util/TypedValue;

    invoke-direct/range {v19 .. v19}, Landroid/util/TypedValue;-><init>()V

    .line 145
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_titleTextSize:I

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 146
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_contentTextSize:I

    move-object/from16 v1, v17

    move-object/from16 v2, v19

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 147
    move-object/from16 v0, v18

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v1, v0

    move/from16 v20, v1

    .line 148
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->g:Landroid/widget/TextView;

    move/from16 v1, v20

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 150
    move-object/from16 v0, v19

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v1, v0

    move/from16 v21, v1

    .line 151
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->f:Landroid/widget/TextView;

    move/from16 v1, v21

    int-to-float v1, v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 152
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v22

    .line 153
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->a:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v23

    .line 154
    move-object/from16 v0, v23

    instance-of v0, v0, Lo/egd;

    if-eqz v0, :cond_6

    .line 155
    move-object/from16 v0, v23

    check-cast v0, Lo/egd;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->h:Lo/egd;

    .line 157
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->h:Lo/egd;

    if-eqz v0, :cond_7

    .line 158
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->h:Lo/egd;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_main_btn_state_settings:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 160
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->h:Lo/egd;

    new-instance v1, Lo/egx$d$3;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/egx$d$3;-><init>(Lo/egx$d;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->a:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v24

    .line 182
    move-object/from16 v0, v24

    instance-of v0, v0, Lo/egd;

    if-eqz v0, :cond_8

    .line 183
    move-object/from16 v0, v24

    check-cast v0, Lo/egd;

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/egx$d;->k:Lo/egd;

    .line 185
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->k:Lo/egd;

    if-eqz v0, :cond_9

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->k:Lo/egd;

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 188
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->k:Lo/egd;

    new-instance v1, Lo/egx$d$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lo/egx$d$2;-><init>(Lo/egx$d;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->e:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 202
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->g:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egx$d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->d:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/egx$d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    :cond_b
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    .line 211
    move-object/from16 v0, v22

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 212
    sget-object v0, Lo/egx$d;->i:Lo/egx;

    invoke-virtual {v0, v5}, Lo/egx;->setContentView(Landroid/view/View;)V

    .line 213
    sget-object v0, Lo/egx$d;->i:Lo/egx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egx;->setCancelable(Z)V

    .line 215
    sget-object v0, Lo/egx$d;->i:Lo/egx;

    invoke-virtual {v0}, Lo/egx;->getWindow()Landroid/view/Window;

    move-result-object v25

    .line 216
    move-object/from16 v0, v25

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V

    .line 217
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v26, v0

    check-cast v26, Landroid/view/WindowManager;

    .line 218
    invoke-interface/range {v26 .. v26}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v27

    .line 219
    invoke-virtual/range {v25 .. v25}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v28

    .line 220
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-virtual {v1, v0, v2}, Lo/egx$d;->b(Landroid/content/Context;F)I

    move-result v29

    .line 221
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/egx$d;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v1, v0, v2}, Lo/egx$d;->b(Landroid/content/Context;F)I

    move-result v30

    .line 222
    invoke-virtual/range {v27 .. v27}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v30, 0x2

    sub-int/2addr v0, v1

    move-object/from16 v1, v28

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 223
    move/from16 v0, v29

    move-object/from16 v1, v28

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 224
    move-object/from16 v0, v25

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 225
    sget v0, Lcom/huawei/ui/commonui/R$style;->track_dialog_anim:I

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 227
    sget-object v0, Lo/egx$d;->i:Lo/egx;

    return-object v0
.end method
