.class public Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;
    }
.end annotation


# instance fields
.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private k:Landroid/view/View;

.field private l:Lo/emu;

.field private m:Lo/emu;

.field private n:Landroid/widget/TextView;

.field private o:Lo/emu;

.field private p:Lo/emu;

.field private q:Landroid/os/Handler;

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Lo/bio;

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:Lo/aww;

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->k:Landroid/view/View;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g:Landroid/view/View;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->f:Landroid/view/View;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->h:Landroid/view/View;

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->n:Landroid/widget/TextView;

    .line 94
    new-instance v0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$b;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->q:Landroid/os/Handler;

    .line 109
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->u:I

    .line 114
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    .line 119
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->r:I

    .line 124
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->t:I

    .line 129
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->z:I

    .line 134
    const-string v0, "11111"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->x:Ljava/lang/String;

    .line 139
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->w:Z

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->y:Lo/aww;

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    return-void
.end method

.method private a()V
    .locals 2

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->f:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$5;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$1;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$4;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$2;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 374
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->n()V

    return-void
.end method

.method private b()Lo/aww;
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->y:Lo/aww;

    if-nez v0, :cond_0

    .line 424
    new-instance v0, Lo/aww;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->q:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/aww;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->y:Lo/aww;

    .line 426
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->y:Lo/aww;

    return-object v0
.end method

.method private b(I)V
    .locals 1

    .line 609
    const/4 v0, 0x0

    invoke-static {v0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 610
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->c()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .line 476
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->x:Ljava/lang/String;

    .line 478
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 481
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 482
    const/4 v0, 0x5

    if-ne v4, v0, :cond_1

    .line 487
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 488
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    .line 491
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 492
    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->r:I

    .line 494
    const-string v0, "PrivacySettingActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updatePrivacyFlags,isAgreeUploadContact:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", is allow recommend app friend : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    iget v2, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    goto :goto_1

    .line 499
    :catch_0
    move-exception v5

    .line 501
    const-string v0, "PrivacySettingActivity"

    const-string v1, "PrivacySettingActivity updatePrivacyFlags format error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    :cond_1
    :goto_1
    return-void
.end method

.method private c()V
    .locals 4

    .line 387
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->w:Z

    if-eqz v0, :cond_0

    .line 389
    const-string v0, "PrivacySettingActivity"

    const-string v1, "isSetting is true"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    return-void

    .line 392
    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 395
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 396
    iget v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->t:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 399
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 402
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 404
    const-string v0, "PrivacySettingActivity"

    const-string v1, "PrivacySettingActivity network  is not connected"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l()V

    .line 406
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g()V

    .line 407
    return-void

    .line 409
    :cond_5
    sget v0, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Ljava/lang/String;)V

    .line 411
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->b()Lo/aww;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/aww;->c(Ljava/lang/String;)V

    .line 413
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 4

    .line 444
    if-nez p1, :cond_0

    .line 446
    const-string v0, "PrivacySettingActivity"

    const-string v1, "PrivacySettingActivity sns info is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 450
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Ljava/lang/String;)V

    .line 453
    :goto_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->k()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 454
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Ljava/lang/String;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 696
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    if-nez v0, :cond_0

    .line 698
    new-instance v0, Lo/bio;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    goto :goto_0

    .line 702
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    invoke-virtual {v0, p1}, Lo/bio;->d(Ljava/lang/String;)V

    .line 704
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 705
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 707
    :cond_1
    return-void
.end method

.method private e()V
    .locals 3

    .line 307
    sget v0, Lcom/huawei/android/sns/R$id;->layout_verify:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->k:Landroid/view/View;

    .line 308
    sget v0, Lcom/huawei/android/sns/R$id;->layout_contact:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g:Landroid/view/View;

    .line 309
    sget v0, Lcom/huawei/android/sns/R$id;->layout_application:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->f:Landroid/view/View;

    .line 310
    sget v0, Lcom/huawei/android/sns/R$id;->layout_account:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->h:Landroid/view/View;

    .line 312
    sget v0, Lcom/huawei/android/sns/R$id;->switch_verify:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    .line 313
    sget v0, Lcom/huawei/android/sns/R$id;->switch_contact:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    .line 314
    sget v0, Lcom/huawei/android/sns/R$id;->switch_application:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    .line 315
    sget v0, Lcom/huawei/android/sns/R$id;->switch_account:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    .line 316
    sget v0, Lcom/huawei/android/sns/R$id;->text_contact:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->n:Landroid/widget/TextView;

    .line 317
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 318
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 323
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_privacy_match_contact_and_photo:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 327
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->g()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 526
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 528
    return-void

    .line 531
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    .line 533
    const/4 v0, 0x5

    if-eq v3, v0, :cond_1

    .line 535
    return-void

    .line 541
    :cond_1
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 542
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->u:I

    .line 545
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 546
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v5

    .line 550
    if-eqz v5, :cond_2

    .line 552
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    goto :goto_0

    .line 556
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    .line 560
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 561
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->r:I

    .line 564
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 565
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->t:I

    .line 568
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 569
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->z:I

    .line 571
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->x:Ljava/lang/String;

    .line 573
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->w:Z

    .line 575
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    if-eqz v0, :cond_4

    .line 577
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->u:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 580
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    if-eqz v0, :cond_6

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->s:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 584
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    if-eqz v0, :cond_8

    .line 586
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->r:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_7

    const/4 v1, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 588
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    if-eqz v0, :cond_a

    .line 590
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    iget v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->z:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_9

    const/4 v1, 0x1

    goto :goto_4

    :cond_9
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 593
    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->w:Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 599
    goto :goto_5

    .line 596
    :catch_0
    move-exception v4

    .line 598
    const-string v0, "PrivacySettingActivity"

    const-string v1, "PrivacySettingActivity bindData privacyFlags format error."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    :goto_5
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->q:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->x:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e(Ljava/lang/String;)V

    .line 514
    return-void
.end method

.method private h()V
    .locals 3

    .line 434
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->q:Landroid/os/Handler;

    const/16 v2, 0x206

    invoke-virtual {v0, v2, v1}, Lo/awj;->c(ILandroid/os/Handler;)V

    .line 435
    return-void
.end method

.method private k()Ljava/lang/Runnable;
    .locals 1

    .line 458
    new-instance v0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$3;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    return-object v0
.end method

.method private l()V
    .locals 1

    .line 617
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_network:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 618
    return-void
.end method

.method private n()V
    .locals 1

    .line 685
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    if-eqz v0, :cond_0

    .line 687
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->v:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 689
    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    .line 633
    sget v0, Lcom/huawei/android/sns/R$string;->sns_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d(Ljava/lang/String;)V

    .line 634
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity$10;-><init>(Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;)V

    invoke-virtual {v0, v1}, Lo/awj;->e(Lo/awj$a;)V

    .line 656
    return-void
.end method

.method private p()V
    .locals 1

    .line 625
    sget v0, Lcom/huawei/android/sns/R$string;->sns_operate_failed:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 626
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 379
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->d:Landroid/view/View;

    .line 380
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 661
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 662
    sget v0, Lcom/huawei/android/sns/R$id;->layout_verify:I

    if-ne v2, v0, :cond_1

    .line 664
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->o:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_4

    .line 666
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->layout_contact:I

    if-ne v2, v0, :cond_3

    .line 668
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->m:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_4

    .line 670
    :cond_3
    sget v0, Lcom/huawei/android/sns/R$id;->layout_application:I

    if-ne v2, v0, :cond_5

    .line 672
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->p:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_4

    .line 674
    :cond_5
    sget v0, Lcom/huawei/android/sns/R$id;->layout_account:I

    if-ne v2, v0, :cond_7

    .line 676
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->l:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 678
    :cond_7
    :goto_4
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 288
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 289
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_privacy_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->setContentView(I)V

    .line 290
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->e()V

    .line 291
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->a()V

    .line 292
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->h()V

    .line 293
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 298
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/PrivacySettingActivity;->n()V

    .line 299
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 300
    return-void
.end method
