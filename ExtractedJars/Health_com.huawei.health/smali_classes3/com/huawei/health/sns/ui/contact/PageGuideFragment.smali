.class public Lcom/huawei/health/sns/ui/contact/PageGuideFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/egd;

.field private b:Landroid/widget/TextView;

.field private c:Lo/egd;

.field private d:Landroid/view/View;

.field private e:Ljava/lang/String;

.field private g:Landroid/widget/LinearLayout;

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a:Lo/egd;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->d:Landroid/view/View;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->b:Landroid/widget/TextView;

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->i:I

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    return-void
.end method

.method private a()V
    .locals 7

    .line 150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 151
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bph;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    const/4 v0, 0x0

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 155
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 156
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_1

    .line 162
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v5

    .line 163
    int-to-double v0, v5

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 164
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lo/boi;->i(Landroid/app/Activity;)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lo/boi;->k(Landroid/app/Activity;)I

    move-result v1

    sub-int v6, v0, v1

    .line 166
    if-gez v6, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    move v0, v6

    :goto_0
    move v6, v0

    .line 167
    iput v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 168
    const/4 v0, -0x1

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 169
    const/4 v0, -0x2

    iput v0, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 170
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 172
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    return-void
.end method

.method private d()V
    .locals 4

    .line 188
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 192
    const-string v0, "KeyFromWhere"

    const-string v1, ""

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e:Ljava/lang/String;

    .line 193
    const-string v0, "keyHomeTableType"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->i:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    goto :goto_0

    .line 195
    :catch_0
    move-exception v3

    .line 197
    const-string v0, "PageGuideFragment"

    const-string v1, "setParams Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    :goto_0
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a:Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 203
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;I)Lcom/huawei/health/sns/ui/contact/PageGuideFragment;
    .locals 1

    .line 78
    new-instance v0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;-><init>()V

    .line 79
    invoke-virtual {v0, p0, p1}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->b(Ljava/lang/String;I)V

    .line 80
    return-object v0
.end method

.method private e()V
    .locals 3

    .line 138
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a:Lo/egd;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->c:Lo/egd;

    invoke-static {v0, v1, v2}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V

    .line 143
    :cond_0
    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/String;I)V
    .locals 2

    .line 85
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 86
    const-string v0, "KeyFromWhere"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string v0, "keyHomeTableType"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 88
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 89
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 208
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->ignore_button:I

    if-ne v0, v1, :cond_1

    .line 210
    const-string v0, "openContactMatchFromFirstOpen"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ignored_upload_phone_digest"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 213
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 214
    const-string v0, "keyHomeTableType"

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->i:I

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 216
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 218
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 220
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->match_button:I

    if-ne v0, v1, :cond_4

    .line 223
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->f()V

    .line 225
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "agree_upload_phone_digest_new"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 226
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v3

    .line 227
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 228
    const-string v0, "contactMatchFragmentTag"

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v5

    .line 229
    if-nez v5, :cond_2

    .line 231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e:Ljava/lang/String;

    iget v1, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->i:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;->a(Ljava/lang/String;I)Lcom/huawei/health/sns/ui/contact/ContactMatchFragment;

    move-result-object v5

    .line 233
    :cond_2
    invoke-virtual {v5}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_3

    .line 235
    sget v0, Lcom/huawei/android/sns/R$id;->fragment_container:I

    const-string v1, "contactMatchFragmentTag"

    invoke-virtual {v4, v0, v5, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 237
    :cond_3
    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 239
    :cond_4
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 178
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 179
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e()V

    .line 180
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a()V

    .line 181
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 94
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_guide_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 95
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->g:Landroid/widget/LinearLayout;

    .line 97
    sget v0, Lcom/huawei/android/sns/R$id;->guild_scrollview:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ScrollView;

    .line 98
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Landroid/widget/ScrollView;->setOverScrollMode(I)V

    .line 100
    sget v0, Lcom/huawei/android/sns/R$id;->layout_two:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->d:Landroid/view/View;

    .line 101
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_tips:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->b:Landroid/widget/TextView;

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/android/sns/R$string;->sns_contact_match_bottom_tip1:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_contact_match_bottom_tip2:I

    .line 113
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    sget v0, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 117
    if-eqz v5, :cond_1

    .line 119
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Landroid/view/View;->setOverScrollMode(I)V

    .line 121
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$id;->ignore_button:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a:Lo/egd;

    .line 122
    sget v0, Lcom/huawei/android/sns/R$id;->match_button:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->c:Lo/egd;

    .line 123
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->e()V

    .line 125
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a()V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->a:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/contact/PageGuideFragment;->d()V

    .line 130
    return-object v2
.end method
