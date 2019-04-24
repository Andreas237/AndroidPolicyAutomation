.class public Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Lo/egb;

.field private c:Lo/egb;

.field private d:Landroid/widget/ImageView;

.field private e:Lo/egb;

.field private f:I

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Landroid/view/GestureDetector;

.field private k:J

.field private l:Landroid/widget/LinearLayout;

.field private n:Ljava/lang/String;

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->k:J

    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 9

    .line 220
    const/4 v4, 0x0

    .line 221
    const/4 v5, 0x0

    .line 223
    :try_start_0
    invoke-static {p1, p2}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 224
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 228
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 230
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 233
    goto/16 :goto_1

    .line 231
    :catch_0
    move-exception v6

    .line 232
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap finally catch e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    goto :goto_1

    .line 225
    :catch_1
    move-exception v6

    .line 226
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap catch e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 228
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 230
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 233
    goto :goto_1

    .line 231
    :catch_2
    move-exception v6

    .line 232
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap finally catch e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    goto :goto_1

    .line 228
    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 230
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 233
    goto :goto_0

    .line 231
    :catch_3
    move-exception v8

    .line 232
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmap finally catch e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :cond_0
    :goto_0
    throw v7

    .line 236
    :cond_1
    :goto_1
    return-object v4
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 260
    const-string v4, "2.0"

    .line 261
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 263
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 264
    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 267
    goto :goto_0

    .line 265
    :catch_0
    move-exception v6

    .line 266
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppVersionName() Exception="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_0
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppVersionName() return="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-object v4
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->n:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 12

    .line 123
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_version_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e:Lo/egb;

    .line 124
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$a;-><init>(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->i:Landroid/view/GestureDetector;

    .line 125
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_pic:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->d:Landroid/widget/ImageView;

    .line 126
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_center_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->a:Landroid/widget/ImageView;

    .line 128
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_center:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    .line 129
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_center_phone:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->g:Lo/egb;

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_center_city:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->h:Lo/egb;

    .line 132
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 134
    invoke-static {}, Lo/dbf;->k()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gtz v0, :cond_0

    invoke-static {}, Lo/dbf;->h()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_about_app_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 137
    :cond_0
    goto :goto_0

    :cond_1
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 138
    const-string v0, "healthbasic"

    const-string v1, "ic_about_app_icon_demo.webp"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 139
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_show_app_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 146
    :cond_3
    :goto_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 147
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e()V

    goto :goto_1

    .line 149
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 152
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e:Lo/egb;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_version_name:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 175
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 174
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 177
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_service_and_policy:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->c:Lo/egb;

    .line 182
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 183
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_about_privacy_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 184
    const-string v6, "HealthPrivacy"

    .line 185
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_about_privacy_agreement:I

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    .line 186
    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_about_service_and:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v5, v2, v3

    .line 185
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 189
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, v8}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 191
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    .line 192
    new-instance v10, Lo/fhs;

    const-string v0, "HealthUserAgreement"

    invoke-direct {v10, p0, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 193
    const/4 v0, 0x0

    const/16 v1, 0x11

    invoke-virtual {v7, v10, v0, v9, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 194
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v7, v0, v1, v9, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 195
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v9, v0, v1

    .line 196
    new-instance v11, Lo/fhs;

    invoke-direct {v11, p0, v6}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 197
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x12

    invoke-virtual {v7, v11, v9, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 198
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x21

    invoke-virtual {v7, v0, v9, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 200
    goto :goto_2

    .line 202
    :cond_5
    new-instance v7, Landroid/text/SpannableString;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 203
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    .line 204
    new-instance v9, Lo/fhs;

    const-string v0, "HealthUserAgreement"

    invoke-direct {v9, p0, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 205
    const/4 v0, 0x0

    const/16 v1, 0x11

    invoke-virtual {v7, v9, v0, v8, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 206
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v7, v0, v1, v8, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 209
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->c:Lo/egb;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->c:Lo/egb;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egb;->setHighlightColor(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->c:Lo/egb;

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 213
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_app_version_number:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->b:Lo/egb;

    .line 214
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->b:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    :cond_6
    return-void
.end method

.method public e()V
    .locals 9

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 75
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 82
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 84
    const-string v0, "HealthAboutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "s = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/16 v0, 0x10

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "GB"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "US"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    const-string v0, "CZ"

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "NL"

    const/4 v1, 0x3

    aput-object v0, v5, v1

    const-string v0, "ES"

    const/4 v1, 0x4

    aput-object v0, v5, v1

    const-string v0, "FI"

    const/4 v1, 0x5

    aput-object v0, v5, v1

    const-string v0, "FR"

    const/4 v1, 0x6

    aput-object v0, v5, v1

    const-string v0, "DE"

    const/4 v1, 0x7

    aput-object v0, v5, v1

    const-string v0, "GR"

    const/16 v1, 0x8

    aput-object v0, v5, v1

    const-string v0, "HU"

    const/16 v1, 0x9

    aput-object v0, v5, v1

    const-string v0, "IT"

    const/16 v1, 0xa

    aput-object v0, v5, v1

    const-string v0, "NO"

    const/16 v1, 0xb

    aput-object v0, v5, v1

    const-string v0, "PL"

    const/16 v1, 0xc

    aput-object v0, v5, v1

    const-string v0, "PT"

    const/16 v1, 0xd

    aput-object v0, v5, v1

    const-string v0, "RO"

    const/16 v1, 0xe

    aput-object v0, v5, v1

    const-string v0, "SK"

    const/16 v1, 0xf

    aput-object v0, v5, v1

    .line 88
    const/16 v0, 0x10

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "0800 088 6700"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "8885482934"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "00420-239-018-465"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const-string v0, "0800-9188"

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const-string v0, "0034-900 483 303"

    const/4 v1, 0x4

    aput-object v0, v6, v1

    const-string v0, "00358-923138998"

    const/4 v1, 0x5

    aput-object v0, v6, v1

    const-string v0, "0033-800 972 285"

    const/4 v1, 0x6

    aput-object v0, v6, v1

    const-string v0, "0049-800 7788 6633"

    const/4 v1, 0x7

    aput-object v0, v6, v1

    const-string v0, "0030-2111988000"

    const/16 v1, 0x8

    aput-object v0, v6, v1

    const-string v0, "0036-40386638"

    const/16 v1, 0x9

    aput-object v0, v6, v1

    const-string v0, "0039-800 191 435"

    const/16 v1, 0xa

    aput-object v0, v6, v1

    const-string v0, "0047-21629090"

    const/16 v1, 0xb

    aput-object v0, v6, v1

    const-string v0, "0048-800811110"

    const/16 v1, 0xc

    aput-object v0, v6, v1

    const-string v0, "0800 100 066"

    const/16 v1, 0xd

    aput-object v0, v6, v1

    const-string v0, "0040-800400896"

    const/16 v1, 0xe

    aput-object v0, v6, v1

    const-string v0, "00421-268-622-626"

    const/16 v1, 0xf

    aput-object v0, v6, v1

    .line 92
    const/16 v0, 0x10

    new-array v7, v0, [I

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_GB:I

    const/4 v1, 0x0

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_US:I

    const/4 v1, 0x1

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_CS:I

    const/4 v1, 0x2

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_NL:I

    const/4 v1, 0x3

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_ES:I

    const/4 v1, 0x4

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_FI:I

    const/4 v1, 0x5

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_FR:I

    const/4 v1, 0x6

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_DE:I

    const/4 v1, 0x7

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_GR:I

    const/16 v1, 0x8

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_HU:I

    const/16 v1, 0x9

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_IT:I

    const/16 v1, 0xa

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_NO:I

    const/16 v1, 0xb

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_PL:I

    const/16 v1, 0xc

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_PT:I

    const/16 v1, 0xd

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_RO:I

    const/16 v1, 0xe

    aput v0, v7, v1

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_city_name_SK:I

    const/16 v1, 0xf

    aput v0, v7, v1

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->p:Ljava/util/Map;

    .line 97
    const/4 v8, 0x0

    :goto_1
    array-length v0, v5

    const/16 v0, 0x10

    if-ge v8, v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->p:Ljava/util/Map;

    aget-object v1, v5, v8

    aget-object v2, v6, v8

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 101
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->o:Ljava/util/Map;

    .line 102
    const/4 v8, 0x0

    :goto_2
    array-length v0, v5

    const/16 v0, 0x10

    if-ge v8, v0, :cond_2

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->o:Ljava/util/Map;

    aget-object v1, v5, v8

    aget v2, v7, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 106
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->p:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->p:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->n:Ljava/lang/String;

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->g:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 111
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 114
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->o:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->h:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->o:Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_4

    .line 118
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 120
    :goto_4
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->b:Lo/egb;

    if-ne p1, v0, :cond_2

    .line 242
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    if-nez v0, :cond_0

    .line 243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->k:J

    .line 245
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    const/4 v1, 0x6

    if-ge v0, v1, :cond_1

    .line 246
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    .line 247
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->k:J

    goto :goto_0

    .line 249
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->f:I

    .line 250
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->k:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x5dc

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 252
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "developeroptions"

    const-string v2, "developerswitch"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 257
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 68
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 69
    sget v0, Lcom/huawei/ui/main/R$layout;->health_show_settings_about:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->setContentView(I)V

    .line 70
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->b()V

    .line 71
    return-void
.end method
