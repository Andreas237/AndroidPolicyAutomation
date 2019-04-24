.class public Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

.field private b:Lo/egd;

.field private c:Lo/egd;

.field private d:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

.field private e:Landroid/content/Context;

.field private g:Lo/fjx;

.field private h:I

.field private i:Lo/fjw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    .line 185
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)Lo/fjx;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_jawbone_up_welcome_guide_open_button:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 144
    const-string v0, "UP"

    const-string v1, "MyFitnessPal"

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 145
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateUI() newName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->myft_welcome_guide_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b:Lo/egd;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->myft_welcome_guide_open_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    invoke-virtual {v0, v5}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d()V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 298
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 299
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 301
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 304
    return-void
.end method

.method private c()V
    .locals 5

    .line 277
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_myfitnesspal_discondialog_content_hw:I

    .line 278
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    .line 279
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity$5;-><init>(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)V

    .line 287
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 293
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 294
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 295
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 296
    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 263
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 267
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    const/4 v0, 0x1

    return v0

    .line 270
    :catch_0
    move-exception v2

    .line 271
    const/4 v0, 0x0

    return v0
.end method

.method private d()V
    .locals 5

    .line 157
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMyftView() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    const-string v1, "com.myfitnesspal.android"

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjx;->d(Z)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    invoke-virtual {v0}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    .line 162
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 165
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMyftView() PACKAGENAME is no exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 169
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMyftView() isNetworkAvailable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initMyftView() isLogin = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    invoke-virtual {v3}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    invoke-virtual {v0}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v4, :cond_1

    .line 172
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMyftView() is connect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_qq_health_disconnect_button:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 177
    :cond_1
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMyftView() is disconnect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b:Lo/egd;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 182
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 13

    .line 235
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 236
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 237
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 241
    const/4 v0, 0x0

    invoke-virtual {v6, v5, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v7

    .line 243
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/pm/ResolveInfo;

    .line 244
    if-eqz v8, :cond_0

    .line 245
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v9, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 246
    iget-object v0, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v10, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 248
    new-instance v11, Landroid/content/Intent;

    const-string v0, "android.intent.action.MAIN"

    invoke-direct {v11, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 249
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v11, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 250
    new-instance v12, Landroid/content/ComponentName;

    invoke-direct {v12, v9, v10}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-virtual {v11, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 252
    const/high16 v0, 0x10200000

    invoke-virtual {v11, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 253
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v11, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    invoke-virtual {p0, v11}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    :cond_0
    goto :goto_0

    .line 256
    :catch_0
    move-exception v4

    .line 257
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;)Lo/fjw;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/Bundle;)V
    .locals 5

    .line 223
    new-instance v4, Lo/fjw;

    invoke-direct {v4}, Lo/fjw;-><init>()V

    .line 224
    const-string v0, "access_token"

    .line 225
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-virtual {v4, v0}, Lo/fjw;->b(Ljava/lang/String;)V

    .line 226
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fjw;->c(Ljava/lang/Boolean;)V

    .line 227
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===saveMyftData ACCESS_TOKEN "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "access_token"

    .line 228
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 227
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    invoke-virtual {v0, v4}, Lo/fjx;->a(Lo/fjw;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    invoke-virtual {v0}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    .line 231
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 213
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 214
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onActivityResult requestCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onActivityResult resultCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===onActivityResult data "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    invoke-virtual {v0, p1, p2, p3}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorizeCallback(IILandroid/content/Intent;)V

    .line 220
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 90
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v6

    .line 92
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->myft_welcome_guide_button:I

    if-ne v6, v0, :cond_6

    .line 94
    sget-object v0, Lo/dae;->eb:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 96
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() connect to Myft"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v7

    .line 98
    if-nez v7, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 100
    return-void

    .line 102
    :cond_0
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() connect to Myft REQUEST_CODE =1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() connect to Myft Scope.Diary ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/myfitnesspal/android/sdk/Scope;->Diary:Lcom/myfitnesspal/android/sdk/Scope;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() connect to Myft ResponseType.Token ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    move-object v1, p0

    sget-object v3, Lcom/myfitnesspal/android/sdk/Scope;->Diary:Lcom/myfitnesspal/android/sdk/Scope;

    sget-object v4, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    iget-object v5, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 107
    goto/16 :goto_1

    :cond_1
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 108
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() disconnect from Myft"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c()V

    goto/16 :goto_1

    .line 110
    :cond_2
    iget v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->h:I

    if-nez v0, :cond_7

    .line 111
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() download Myft APP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v7

    .line 113
    if-nez v7, :cond_3

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 115
    return-void

    .line 117
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    const-string v1, "com.myfitnesspal.android"

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 118
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick()  Myft APP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    move-object v1, p0

    sget-object v3, Lcom/myfitnesspal/android/sdk/Scope;->Diary:Lcom/myfitnesspal/android/sdk/Scope;

    sget-object v4, Lcom/myfitnesspal/android/sdk/ResponseType;->Token:Lcom/myfitnesspal/android/sdk/ResponseType;

    iget-object v5, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a:Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;->authorize(Landroid/app/Activity;ILcom/myfitnesspal/android/sdk/Scope;Lcom/myfitnesspal/android/sdk/ResponseType;Lcom/myfitnesspal/android/sdk/MfpAuthListener;)V

    .line 121
    return-void

    .line 124
    :cond_4
    const-string v0, "market://details?id=com.myfitnesspal.android"

    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    .line 125
    new-instance v9, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v9, v0, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 126
    const/high16 v0, 0x10000000

    invoke-virtual {v9, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 127
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "com.android.vending"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 128
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_0

    .line 129
    :catch_0
    move-exception v8

    .line 130
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_common_notification_know_tips:I

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_data_share_app_not_install:I

    invoke-static {v0, v1, v2}, Lo/fjm;->e(Landroid/content/Context;II)V

    .line 133
    :goto_0
    goto :goto_1

    .line 134
    :cond_6
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->myft_welcome_guide_open_button:I

    if-ne v6, v0, :cond_7

    .line 135
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() Open Myft APP"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    sget-object v0, Lo/dae;->eb:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "com.myfitnesspal.android"

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d(Ljava/lang/String;)V

    .line 139
    :cond_7
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 70
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 71
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    .line 73
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_myfit_access:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->setContentView(I)V

    .line 74
    new-instance v0, Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    const-string v1, "huaweihealth"

    invoke-direct {v0, v1}, Lcom/myfitnesspal/android/sdk/MyFitnessPal;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d:Lcom/myfitnesspal/android/sdk/MyFitnessPal;

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/fjx;->a(Landroid/content/Context;)Lo/fjx;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->g:Lo/fjx;

    invoke-virtual {v0}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->i:Lo/fjw;

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->a()V

    .line 78
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 82
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 83
    const-string v0, "MyftOuthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;->d()V

    .line 85
    return-void
.end method
