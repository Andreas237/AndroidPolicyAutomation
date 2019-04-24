.class public Lcom/huawei/health/sns/ui/group/GroupInviteActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;
    }
.end annotation


# instance fields
.field private f:Lo/egd;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/huawei/health/sns/model/group/GroupNotify;

.field private k:Lo/egd;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/os/Handler;

.field private o:Lo/bio;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k:Lo/egd;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->f:Lo/egd;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g:Landroid/widget/TextView;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    .line 88
    new-instance v0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->n:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)Landroid/widget/TextView;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 7

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->getDisplayName()Ljava/lang/String;

    move-result-object v5

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->getUserAccount()Ljava/lang/String;

    move-result-object v6

    .line 278
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_invate_account:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v5, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 287
    return-void
.end method

.method private a(I)V
    .locals 1

    .line 381
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_0

    .line 383
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 386
    :cond_0
    const/16 v0, 0xf3

    if-ne p1, v0, :cond_1

    .line 388
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_overdue:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 391
    :cond_1
    const/16 v0, 0xf4

    if-ne p1, v0, :cond_2

    .line 393
    sget v0, Lcom/huawei/android/sns/R$string;->sns_join_num_limite:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 395
    :cond_2
    const/16 v0, 0x3f8

    if-eq p1, v0, :cond_3

    .line 397
    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 400
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k()V

    .line 401
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;II)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->c(II)V

    return-void
.end method

.method private b()V
    .locals 3

    .line 208
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 209
    if-eqz v2, :cond_0

    .line 211
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 213
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$id;->btn_ignore:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k:Lo/egd;

    .line 214
    sget v0, Lcom/huawei/android/sns/R$id;->btn_accept:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->f:Lo/egd;

    .line 215
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->c()V

    .line 217
    sget v0, Lcom/huawei/android/sns/R$id;->text_invite_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/huawei/android/sns/R$id;->layout_image_create:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->m:Landroid/widget/LinearLayout;

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 228
    return-void
.end method

.method private b(I)V
    .locals 7

    .line 250
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 251
    iget v0, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v1, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    if-le v0, v1, :cond_1

    .line 253
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    .line 254
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v4

    .line 256
    const/4 v0, 0x2

    if-le p1, v0, :cond_0

    .line 258
    mul-int/lit8 v0, v4, 0xd

    div-int/lit8 v5, v0, 0x10

    goto :goto_0

    .line 262
    :cond_0
    mul-int/lit8 v0, v4, 0x3

    div-int/lit8 v5, v0, 0x4

    .line 264
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 266
    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 269
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->a(I)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 298
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 300
    sget v0, Lcom/huawei/android/sns/R$string;->sns_invite_family_info_with_name_null:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 304
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_invite_info:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 306
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    return-void
.end method

.method private b(Z)V
    .locals 3

    .line 341
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->l()V

    .line 342
    new-instance v2, Lo/atj;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->n:Landroid/os/Handler;

    invoke-direct {v2, v0}, Lo/atj;-><init>(Landroid/os/Handler;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v2, p0, v0, p1}, Lo/atj;->d(Landroid/content/Context;Lcom/huawei/health/sns/model/group/GroupNotify;Z)V

    .line 345
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->c:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 346
    return-void
.end method

.method private c()V
    .locals 2

    .line 236
    invoke-static {p0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k:Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->f:Lo/egd;

    invoke-static {p0, v0, v1}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V

    .line 240
    :cond_0
    return-void
.end method

.method private c(II)V
    .locals 1

    .line 370
    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 371
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b(I)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 355
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 356
    const-class v0, Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 357
    const-string v0, "groupId"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 358
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->startActivity(Landroid/content/Intent;)V

    .line 359
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->finish()V

    .line 360
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method private e()V
    .locals 3

    .line 188
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 189
    if-eqz v1, :cond_1

    .line 191
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 192
    if-nez v2, :cond_0

    .line 194
    return-void

    .line 196
    :cond_0
    const-string v0, "groupNotify"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    const-string v0, "groupNotify"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupNotify;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 201
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;Z)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b(Z)V

    return-void
.end method

.method private g()V
    .locals 1

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 428
    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->k:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->f:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 332
    return-void
.end method

.method private k()V
    .locals 0

    .line 408
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->finish()V

    .line 409
    return-void
.end method

.method private l()V
    .locals 4

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    if-nez v0, :cond_0

    .line 437
    new-instance v0, Lo/bio;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v1, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    .line 439
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->o:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 440
    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 445
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 447
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_invite_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->setContentView(I)V

    .line 449
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b()V

    .line 451
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h()V

    .line 453
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->a()V

    .line 454
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 156
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 158
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 159
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 164
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_invite_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->setContentView(I)V

    .line 166
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->e()V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h:Lcom/huawei/health/sns/model/group/GroupNotify;

    if-nez v0, :cond_1

    .line 171
    const-string v0, "GroupInviteActivity"

    const-string v1, "groupNotify is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->finish()V

    .line 173
    return-void

    .line 176
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b()V

    .line 178
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->h()V

    .line 180
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->a()V

    .line 181
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 415
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->g()V

    .line 416
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 417
    return-void
.end method
