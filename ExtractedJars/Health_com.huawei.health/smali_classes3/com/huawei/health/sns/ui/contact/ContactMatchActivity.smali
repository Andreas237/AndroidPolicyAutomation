.class public Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;
    }
.end annotation


# instance fields
.field private f:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

.field private g:I

.field private h:Landroid/support/v4/app/Fragment;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->k:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g:I

    return-void
.end method

.method private a()V
    .locals 7

    .line 99
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 100
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 101
    const-string v4, ""

    .line 102
    const/4 v5, 0x0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    const-string v4, "contactMatchFragmentTag"

    .line 107
    invoke-virtual {v2, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->k:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(Ljava/lang/String;I)Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    goto :goto_0

    .line 114
    :cond_0
    const-string v0, "pageGuideFragmentTag"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v6

    .line 115
    if-eqz v6, :cond_1

    instance-of v0, v6, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;

    if-eqz v0, :cond_1

    .line 117
    move-object v5, v6

    check-cast v5, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;

    .line 119
    :cond_1
    goto :goto_0

    .line 123
    :cond_2
    const-string v4, "pageGuideFragmentTag"

    .line 124
    invoke-virtual {v2, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_3

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->k:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e(Ljava/lang/String;I)Lcom/huawei/health/sns/ui/contact/PageGuideFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    .line 131
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_4

    .line 133
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    invoke-virtual {v3, v0, v1, v4}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 136
    :cond_4
    if-eqz v5, :cond_5

    .line 138
    invoke-virtual {v3, v5}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 141
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->h:Landroid/support/v4/app/Fragment;

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 142
    return-void
.end method

.method private b()V
    .locals 4

    .line 164
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-static {}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->c()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 165
    return-void
.end method

.method private static c()Ljava/lang/Runnable;
    .locals 1

    .line 169
    new-instance v0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$5;-><init>()V

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 73
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 74
    if-eqz v2, :cond_2

    .line 78
    const-string v0, "keyOpenContactMatchFromWhere"

    :try_start_0
    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const-string v0, "keyOpenContactMatchFromWhere"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->k:Ljava/lang/String;

    .line 82
    :cond_0
    const-string v0, "keyHomeTableType"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    const-string v0, "keyHomeTableType"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :cond_1
    goto :goto_0

    .line 87
    :catch_0
    move-exception v3

    .line 89
    const-string v0, "ContactMatchActivity"

    const-string v1, "ContactMatchActivity Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_2
    :goto_0
    return-void
.end method

.method private g()Z
    .locals 3

    .line 186
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->f:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

    .line 45
    return-void
.end method

.method public d()V
    .locals 1

    .line 156
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->d:Landroid/view/View;

    .line 157
    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .line 192
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 194
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 199
    if-eqz v3, :cond_0

    .line 201
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    const-string v0, "keyHomeTableType"

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->g:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 203
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->startActivity(Landroid/content/Intent;)V

    .line 206
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->finish()V

    .line 207
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 55
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 57
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 61
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->e()V

    .line 62
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_contact_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->setContentView(I)V

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->a()V

    .line 64
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->b()V

    .line 65
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->f:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity;->f:Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/health/sns/ui/contact/ContactMatchActivity$c;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 151
    :cond_0
    return-void
.end method
