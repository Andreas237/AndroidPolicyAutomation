.class public Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;
    }
.end annotation


# instance fields
.field private a:Lo/egd;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private f:J

.field private g:Lcom/huawei/health/sns/model/group/Group;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/app/Activity;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/ImageView;

.field private o:I

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/os/Handler;

.field private s:Lo/bgp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->o:I

    .line 87
    new-instance v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$d;-><init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 4

    .line 158
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->qr_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c:Landroid/widget/ImageView;

    .line 160
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->qr_share_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a:Lo/egd;

    .line 161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->qr_tips_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->b:Landroid/widget/TextView;

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->qr_tips_wei_chat_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->e:Landroid/widget/TextView;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_name_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->h:Landroid/widget/TextView;

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_id_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->k:Landroid/widget/TextView;

    .line 167
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c()V

    .line 168
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d()V

    .line 170
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->b()V

    .line 171
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 243
    iput-object p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    const/16 v1, 0x123

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 247
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f:J

    return-wide v0
.end method

.method private b()V
    .locals 1

    .line 174
    sget v0, Lcom/huawei/android/sns/R$id;->share_qr_code_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->m:Landroid/widget/LinearLayout;

    .line 175
    sget v0, Lcom/huawei/android/sns/R$id;->share_group_head_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->n:Landroid/widget/ImageView;

    .line 176
    sget v0, Lcom/huawei/android/sns/R$id;->share_group_name_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->p:Landroid/widget/TextView;

    .line 177
    sget v0, Lcom/huawei/android/sns/R$id;->share_group_id_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->l:Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/android/sns/R$id;->share_qr_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->q:Landroid/widget/ImageView;

    .line 179
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Landroid/app/Activity;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    return-object v0
.end method

.method private c(Landroid/os/Message;)V
    .locals 5

    .line 228
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 229
    if-eqz v3, :cond_0

    .line 230
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/Group;

    .line 231
    if-eqz v4, :cond_0

    .line 232
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getQrExpireTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;I)I
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->o:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 378
    new-instance v1, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;

    invoke-direct {v1, p0, p7}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$2;-><init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 394
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v2

    .line 395
    invoke-virtual {v2, v1}, Lo/ebk;->setAdapter(Lo/eab;)V

    .line 396
    invoke-static {p8}, Lo/ebk;->c(Z)V

    .line 398
    new-instance v3, Lo/dav;

    invoke-direct {v3, p2}, Lo/dav;-><init>(I)V

    .line 399
    invoke-virtual {v3, p4}, Lo/dav;->c(Ljava/lang/String;)V

    .line 400
    invoke-virtual {v3, p5}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 401
    invoke-virtual {v3, p6}, Lo/dav;->a(Ljava/lang/String;)V

    .line 402
    sget v0, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_home_group_qrcode_share_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dav;->e(Ljava/lang/String;)V

    .line 404
    invoke-virtual {v2, v3, p1}, Lo/ebk;->c(Lo/dav;Landroid/content/Context;)V

    .line 405
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->k()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 52
    invoke-direct/range {p0 .. p8}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/os/Message;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method private f()V
    .locals 5

    .line 182
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 184
    if-nez v4, :cond_0

    .line 185
    return-void

    .line 187
    :cond_0
    const-string v0, "bundleKeyGroupId"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f:J

    .line 188
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->o:I

    return v0
.end method

.method private g()V
    .locals 4

    .line 484
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportShareBI groupID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " shareID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->o:I

    invoke-static {v0, v1, v2}, Lo/boa;->c(Landroid/content/Context;Ljava/lang/Long;I)V

    .line 486
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)I
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i()I

    move-result v0

    return v0
.end method

.method private h()V
    .locals 4

    .line 194
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerContentObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->s:Lo/bgp;

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->s:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 197
    return-void
.end method

.method private i()I
    .locals 7

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SHARE_POP_UP_ACTIVITY_SHARE_TYPE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 450
    const/4 v5, 0x0

    .line 452
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 455
    goto :goto_0

    .line 453
    :catch_0
    move-exception v6

    .line 454
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    :goto_0
    return v5
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)Landroid/os/Handler;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 254
    const-string v0, "Group_HealthTwoDimCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshData group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getQrExpireTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->n:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->g:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 271
    return-void
.end method


# virtual methods
.method c()V
    .locals 2

    .line 200
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$3;-><init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 208
    return-void
.end method

.method d()V
    .locals 0

    .line 211
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->e()V

    .line 212
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 298
    new-instance v0, Lo/biw;

    invoke-direct {v0}, Lo/biw;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    const/high16 v2, 0x42d40000    # 106.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    const/high16 v3, 0x42d40000    # 106.0f

    invoke-static {v2, v3}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1, v1, v2, v3}, Lo/biw;->b(Ljava/lang/String;IILandroid/widget/ImageView;)V

    .line 299
    new-instance v0, Lo/biw;

    invoke-direct {v0}, Lo/biw;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    const/high16 v2, 0x43420000    # 194.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    const/high16 v3, 0x43420000    # 194.0f

    invoke-static {v2, v3}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, p1, v1, v2, v3}, Lo/biw;->b(Ljava/lang/String;IILandroid/widget/ImageView;)V

    .line 300
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 286
    invoke-virtual {p0, p2}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d(Ljava/lang/String;)V

    .line 290
    return-void
.end method

.method public e()V
    .locals 5

    .line 218
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->r:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f:J

    const/16 v3, 0x109

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 219
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a:Lo/egd;

    if-ne p1, v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 311
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 312
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->common_white_80alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 315
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    .line 316
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v5, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;

    invoke-direct {v2, p0, v3}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity$1;-><init>(Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 353
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 149
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 150
    iput-object p0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    .line 151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->i:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->activity_health_two_dim_code:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(I)V

    .line 152
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->f()V

    .line 153
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->a()V

    .line 154
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;->h()V

    .line 155
    return-void
.end method
